/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ACompositionAssociationKind extends PAssociationKind
{
    private TComposition _composition_;

    public ACompositionAssociationKind()
    {
        // Constructor
    }

    public ACompositionAssociationKind(
        @SuppressWarnings("hiding") TComposition _composition_)
    {
        // Constructor
        setComposition(_composition_);

    }

    @Override
    public Object clone()
    {
        return new ACompositionAssociationKind(
            cloneNode(this._composition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompositionAssociationKind(this);
    }

    public TComposition getComposition()
    {
        return this._composition_;
    }

    public void setComposition(TComposition node)
    {
        if(this._composition_ != null)
        {
            this._composition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._composition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._composition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._composition_ == child)
        {
            this._composition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._composition_ == oldChild)
        {
            setComposition((TComposition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
