/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEnumerationLiteralDeclListTail extends PEnumerationLiteralDeclListTail
{
    private TComma _comma_;
    private PEnumerationLiteralDeclList _enumerationLiteralDeclList_;

    public AEnumerationLiteralDeclListTail()
    {
        // Constructor
    }

    public AEnumerationLiteralDeclListTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PEnumerationLiteralDeclList _enumerationLiteralDeclList_)
    {
        // Constructor
        setComma(_comma_);

        setEnumerationLiteralDeclList(_enumerationLiteralDeclList_);

    }

    @Override
    public Object clone()
    {
        return new AEnumerationLiteralDeclListTail(
            cloneNode(this._comma_),
            cloneNode(this._enumerationLiteralDeclList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumerationLiteralDeclListTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PEnumerationLiteralDeclList getEnumerationLiteralDeclList()
    {
        return this._enumerationLiteralDeclList_;
    }

    public void setEnumerationLiteralDeclList(PEnumerationLiteralDeclList node)
    {
        if(this._enumerationLiteralDeclList_ != null)
        {
            this._enumerationLiteralDeclList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enumerationLiteralDeclList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._enumerationLiteralDeclList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._enumerationLiteralDeclList_ == child)
        {
            this._enumerationLiteralDeclList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._enumerationLiteralDeclList_ == oldChild)
        {
            setEnumerationLiteralDeclList((PEnumerationLiteralDeclList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
