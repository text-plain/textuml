package com.abstratt.mdd.core.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import com.abstratt.mdd.core.IRepository;

public class ClassifierUtils {
	
	public static <T extends Enum<?>> List<EnumerationLiteral> toEnumerationLiterals(Enumeration umlEnumeration, Collection<T> javaEnumValues) {
		List<EnumerationLiteral> mapped = javaEnumValues.stream().map(it -> { 
			EnumerationLiteral ownedLiteral = umlEnumeration.getOwnedLiteral(it.name());
			if (ownedLiteral == null)
				throw new IllegalArgumentException("Unknown literal: "  + it.name() + " in " + umlEnumeration.getQualifiedName());
			return ownedLiteral;
		}).collect(Collectors.toList());
		return mapped;
	}
	
	public static <T extends Enum<?>> List<T> fromEnumerationLiterals(java.lang.Class<T> enumClass, Collection<EEnumLiteral> umlEnumValues) {
		if (umlEnumValues == null) 
			return Collections.emptyList();
		Map<String, T> values = Arrays.stream(enumClass.getEnumConstants()).collect(Collectors.toMap(it -> it.name(), it -> it));
		return umlEnumValues.stream().map(it -> values.get(it.getName())).collect(Collectors.toList());
	}
	
    public static List<Classifier> findAllSpecifics(IRepository repository, final Classifier general) {
    	boolean isInterface = general instanceof Interface;
        List<Classifier> specifics = repository.findInAnyPackage(new EObjectCondition() {
            @Override
            public boolean isSatisfied(EObject object) {
                if (object instanceof Classifier) {
                	if (object == general) 
                		return false;
                    Classifier classifier = (Classifier) object;
                    if (classifier.conformsTo(general))
                    	return true;
                    if (isInterface  && object instanceof BehavioredClassifier)
                    	return doesImplement((BehavioredClassifier) object, (Interface) general);
                }
                return false;
            }
        });
        return specifics;
    }
    
    public static <T> T collectFromHierarchy(IRepository repository, final Classifier baseClass, boolean includeSubclasses, T collected, BiConsumer<Classifier, T> consumer) {
        Consumer<Classifier> collector = c -> consumer.accept(c, collected);
        if (!includeSubclasses) 
            collector.accept(baseClass);
        else
            runOnHierarchy(repository, baseClass, collector);
        return collected;
    }
    
    public static void runOnHierarchy(IRepository repository, Classifier general, Consumer<Classifier> visitor) {
    	visitor.accept(general);
        List<Classifier> specifics = ClassifierUtils.findAllSpecifics(repository, general);
        specifics.forEach(visitor);
    }
    
    public static <T> T findUpHierarchy(IRepository repository, Classifier current, Function<Classifier, T> visitor) {
    	T result = visitor.apply(current);
    	if (result != null)
    		return result;
    	return current.getGenerals().stream().map(g -> findUpHierarchy(repository, g, visitor)).filter( it -> it != null).findAny().orElse(null);
    }

    public static Classifier findClassifier(IRepository repository, String className) {
        return repository.findNamedElement(className, UMLPackage.Literals.CLASSIFIER, null);
    }

    public static <C extends Classifier> C createClassifier(Namespace namespace, String name, EClass eClass) {
        namespace = NamedElementUtils.findNearestNamespace(namespace, UMLPackage.Literals.PACKAGE,
                UMLPackage.Literals.CLASS);
        if (namespace instanceof Package)
            return (C) ((Package) namespace).createOwnedType(name, eClass);
        else
            return (C) ((Class) namespace).createNestedClassifier(name, eClass);

    }
    
    public static boolean isKindOf(Classifier toTest, String generalCandidate) {
        if (generalCandidate.equals(toTest.getQualifiedName()))
            return true;
        return toTest.getGeneralizations().stream().anyMatch(g -> isKindOf(g.getGeneral(), generalCandidate));
    }

    public static boolean isKindOf(Classifier toTest, Classifier generalCandidate) {
        if (toTest == generalCandidate)
            return true;
        return toTest.getGeneralizations().stream().anyMatch(g -> isKindOf(g.getGeneral(), generalCandidate));
    }
    
    public static boolean isKindOfAnyOf(Classifier toTest, Collection<? extends Classifier> generalCandidates, boolean includeSelf) {
        if (includeSelf && generalCandidates.contains(toTest))
            return true;
        return toTest.getGeneralizations().stream().anyMatch(g -> isKindOfAnyOf(g.getGeneral(), generalCandidates, true));
    }
    
    public static boolean doesImplement(BehavioredClassifier toTest, Interface candidateInterface) {
        return toTest.getAllImplementedInterfaces().stream().anyMatch(i -> i == candidateInterface);
    }
}
