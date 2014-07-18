/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleParamDecl extends PSimpleParamDecl
{
    private POptionalParameterName _optionalParameterName_;
    private TColon _colon_;
    private PTypeIdentifier _typeIdentifier_;
    private PInitializationExpression _initializationExpression_;

    public ASimpleParamDecl()
    {
        // Constructor
    }

    public ASimpleParamDecl(
        @SuppressWarnings("hiding") POptionalParameterName _optionalParameterName_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PTypeIdentifier _typeIdentifier_,
        @SuppressWarnings("hiding") PInitializationExpression _initializationExpression_)
    {
        // Constructor
        setOptionalParameterName(_optionalParameterName_);

        setColon(_colon_);

        setTypeIdentifier(_typeIdentifier_);

        setInitializationExpression(_initializationExpression_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleParamDecl(
            cloneNode(this._optionalParameterName_),
            cloneNode(this._colon_),
            cloneNode(this._typeIdentifier_),
            cloneNode(this._initializationExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleParamDecl(this);
    }

    public POptionalParameterName getOptionalParameterName()
    {
        return this._optionalParameterName_;
    }

    public void setOptionalParameterName(POptionalParameterName node)
    {
        if(this._optionalParameterName_ != null)
        {
            this._optionalParameterName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalParameterName_ = node;
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

    public PInitializationExpression getInitializationExpression()
    {
        return this._initializationExpression_;
    }

    public void setInitializationExpression(PInitializationExpression node)
    {
        if(this._initializationExpression_ != null)
        {
            this._initializationExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initializationExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._optionalParameterName_)
            + toString(this._colon_)
            + toString(this._typeIdentifier_)
            + toString(this._initializationExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._optionalParameterName_ == child)
        {
            this._optionalParameterName_ = null;
            return;
        }

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

        if(this._initializationExpression_ == child)
        {
            this._initializationExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._optionalParameterName_ == oldChild)
        {
            setOptionalParameterName((POptionalParameterName) newChild);
            return;
        }

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

        if(this._initializationExpression_ == oldChild)
        {
            setInitializationExpression((PInitializationExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
