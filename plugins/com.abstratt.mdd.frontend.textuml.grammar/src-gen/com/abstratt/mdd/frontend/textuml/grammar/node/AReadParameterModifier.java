/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AReadParameterModifier extends PParameterModifier
{
    private TRead _read_;

    public AReadParameterModifier()
    {
        // Constructor
    }

    public AReadParameterModifier(
        @SuppressWarnings("hiding") TRead _read_)
    {
        // Constructor
        setRead(_read_);

    }

    @Override
    public Object clone()
    {
        return new AReadParameterModifier(
            cloneNode(this._read_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReadParameterModifier(this);
    }

    public TRead getRead()
    {
        return this._read_;
    }

    public void setRead(TRead node)
    {
        if(this._read_ != null)
        {
            this._read_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._read_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._read_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._read_ == child)
        {
            this._read_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._read_ == oldChild)
        {
            setRead((TRead) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}