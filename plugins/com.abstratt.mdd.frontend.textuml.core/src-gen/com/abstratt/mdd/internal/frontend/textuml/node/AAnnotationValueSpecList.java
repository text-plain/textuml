/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import java.util.*;
import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AAnnotationValueSpecList extends PAnnotationValueSpecList
{
    private PAnnotationValueSpec _annotationValueSpec_;
    private final LinkedList<PAnnotationValueSpecListTail> _annotationValueSpecListTail_ = new LinkedList<PAnnotationValueSpecListTail>();

    public AAnnotationValueSpecList()
    {
        // Constructor
    }

    public AAnnotationValueSpecList(
        @SuppressWarnings("hiding") PAnnotationValueSpec _annotationValueSpec_,
        @SuppressWarnings("hiding") List<PAnnotationValueSpecListTail> _annotationValueSpecListTail_)
    {
        // Constructor
        setAnnotationValueSpec(_annotationValueSpec_);

        setAnnotationValueSpecListTail(_annotationValueSpecListTail_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotationValueSpecList(
            cloneNode(this._annotationValueSpec_),
            cloneList(this._annotationValueSpecListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotationValueSpecList(this);
    }

    public PAnnotationValueSpec getAnnotationValueSpec()
    {
        return this._annotationValueSpec_;
    }

    public void setAnnotationValueSpec(PAnnotationValueSpec node)
    {
        if(this._annotationValueSpec_ != null)
        {
            this._annotationValueSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotationValueSpec_ = node;
    }

    public LinkedList<PAnnotationValueSpecListTail> getAnnotationValueSpecListTail()
    {
        return this._annotationValueSpecListTail_;
    }

    public void setAnnotationValueSpecListTail(List<PAnnotationValueSpecListTail> list)
    {
        this._annotationValueSpecListTail_.clear();
        this._annotationValueSpecListTail_.addAll(list);
        for(PAnnotationValueSpecListTail e : list)
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
            + toString(this._annotationValueSpec_)
            + toString(this._annotationValueSpecListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._annotationValueSpec_ == child)
        {
            this._annotationValueSpec_ = null;
            return;
        }

        if(this._annotationValueSpecListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._annotationValueSpec_ == oldChild)
        {
            setAnnotationValueSpec((PAnnotationValueSpec) newChild);
            return;
        }

        for(ListIterator<PAnnotationValueSpecListTail> i = this._annotationValueSpecListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAnnotationValueSpecListTail) newChild);
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
