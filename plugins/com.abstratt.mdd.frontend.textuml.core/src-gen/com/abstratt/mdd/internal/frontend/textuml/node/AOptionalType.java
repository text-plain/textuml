/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalType extends POptionalType
{
    private TColon _colon_;
    private PTypeIdentifier _typeIdentifier_;

    public AOptionalType()
    {
        // Constructor
    }

    public AOptionalType(
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PTypeIdentifier _typeIdentifier_)
    {
        // Constructor
        setColon(_colon_);

        setTypeIdentifier(_typeIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new AOptionalType(
            cloneNode(this._colon_),
            cloneNode(this._typeIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOptionalType(this);
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public PTypeIdentifier getTypeIdentifier()
    {
        return this._typeIdentifier_;
    }

    public void setTypeIdentifier(PTypeIdentifier node)
    {
        if(this._typeIdentifier_ != null)
        {
            this._typeIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._colon_)
            + toString(this._typeIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._typeIdentifier_ == child)
        {
            this._typeIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._typeIdentifier_ == oldChild)
        {
            setTypeIdentifier((PTypeIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
