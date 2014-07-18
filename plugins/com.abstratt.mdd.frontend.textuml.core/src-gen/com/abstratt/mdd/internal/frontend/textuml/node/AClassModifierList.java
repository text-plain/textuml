/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AClassModifierList extends PClassModifierList
{
    private PClassModifier _classModifier_;
    private PClassModifierList _classModifierList_;

    public AClassModifierList()
    {
        // Constructor
    }

    public AClassModifierList(
        @SuppressWarnings("hiding") PClassModifier _classModifier_,
        @SuppressWarnings("hiding") PClassModifierList _classModifierList_)
    {
        // Constructor
        setClassModifier(_classModifier_);

        setClassModifierList(_classModifierList_);

    }

    @Override
    public Object clone()
    {
        return new AClassModifierList(
            cloneNode(this._classModifier_),
            cloneNode(this._classModifierList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassModifierList(this);
    }

    public PClassModifier getClassModifier()
    {
        return this._classModifier_;
    }

    public void setClassModifier(PClassModifier node)
    {
        if(this._classModifier_ != null)
        {
            this._classModifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classModifier_ = node;
    }

    public PClassModifierList getClassModifierList()
    {
        return this._classModifierList_;
    }

    public void setClassModifierList(PClassModifierList node)
    {
        if(this._classModifierList_ != null)
        {
            this._classModifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classModifierList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classModifier_)
            + toString(this._classModifierList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classModifier_ == child)
        {
            this._classModifier_ = null;
            return;
        }

        if(this._classModifierList_ == child)
        {
            this._classModifierList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classModifier_ == oldChild)
        {
            setClassModifier((PClassModifier) newChild);
            return;
        }

        if(this._classModifierList_ == oldChild)
        {
            setClassModifierList((PClassModifierList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
