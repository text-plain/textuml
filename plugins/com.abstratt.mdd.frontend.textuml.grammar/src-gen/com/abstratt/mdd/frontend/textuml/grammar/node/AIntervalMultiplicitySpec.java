/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AIntervalMultiplicitySpec extends PMultiplicitySpec
{
    private PMultiplicityValue _lower_;
    private TComma _comma_;
    private PMultiplicityValue _upper_;

    public AIntervalMultiplicitySpec()
    {
        // Constructor
    }

    public AIntervalMultiplicitySpec(
        @SuppressWarnings("hiding") PMultiplicityValue _lower_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PMultiplicityValue _upper_)
    {
        // Constructor
        setLower(_lower_);

        setComma(_comma_);

        setUpper(_upper_);

    }

    @Override
    public Object clone()
    {
        return new AIntervalMultiplicitySpec(
            cloneNode(this._lower_),
            cloneNode(this._comma_),
            cloneNode(this._upper_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntervalMultiplicitySpec(this);
    }

    public PMultiplicityValue getLower()
    {
        return this._lower_;
    }

    public void setLower(PMultiplicityValue node)
    {
        if(this._lower_ != null)
        {
            this._lower_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lower_ = node;
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

    public PMultiplicityValue getUpper()
    {
        return this._upper_;
    }

    public void setUpper(PMultiplicityValue node)
    {
        if(this._upper_ != null)
        {
            this._upper_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._upper_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lower_)
            + toString(this._comma_)
            + toString(this._upper_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lower_ == child)
        {
            this._lower_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._upper_ == child)
        {
            this._upper_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lower_ == oldChild)
        {
            setLower((PMultiplicityValue) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._upper_ == oldChild)
        {
            setUpper((PMultiplicityValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
