/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import java.util.*;
import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AAnnotationList extends PAnnotationList
{
    private PAnnotation _annotation_;
    private final LinkedList<PAnnotationListTail> _annotationListTail_ = new LinkedList<PAnnotationListTail>();

    public AAnnotationList()
    {
        // Constructor
    }

    public AAnnotationList(
        @SuppressWarnings("hiding") PAnnotation _annotation_,
        @SuppressWarnings("hiding") List<PAnnotationListTail> _annotationListTail_)
    {
        // Constructor
        setAnnotation(_annotation_);

        setAnnotationListTail(_annotationListTail_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotationList(
            cloneNode(this._annotation_),
            cloneList(this._annotationListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotationList(this);
    }

    public PAnnotation getAnnotation()
    {
        return this._annotation_;
    }

    public void setAnnotation(PAnnotation node)
    {
        if(this._annotation_ != null)
        {
            this._annotation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotation_ = node;
    }

    public LinkedList<PAnnotationListTail> getAnnotationListTail()
    {
        return this._annotationListTail_;
    }

    public void setAnnotationListTail(List<PAnnotationListTail> list)
    {
        this._annotationListTail_.clear();
        this._annotationListTail_.addAll(list);
        for(PAnnotationListTail e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._annotation_)
            + toString(this._annotationListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._annotation_ == child)
        {
            this._annotation_ = null;
            return;
        }

        if(this._annotationListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._annotation_ == oldChild)
        {
            setAnnotation((PAnnotation) newChild);
            return;
        }

        for(ListIterator<PAnnotationListTail> i = this._annotationListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAnnotationListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
