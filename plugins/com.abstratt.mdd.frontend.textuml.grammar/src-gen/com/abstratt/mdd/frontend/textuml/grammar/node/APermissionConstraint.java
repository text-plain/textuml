/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class APermissionConstraint extends PPermissionConstraint
{
    private TAllow _allow_;
    private PAccessCapabilities _accessCapabilities_;
    private PRoles _roles_;
    private PExpressionBlock _expressionBlock_;

    public APermissionConstraint()
    {
        // Constructor
    }

    public APermissionConstraint(
        @SuppressWarnings("hiding") TAllow _allow_,
        @SuppressWarnings("hiding") PAccessCapabilities _accessCapabilities_,
        @SuppressWarnings("hiding") PRoles _roles_,
        @SuppressWarnings("hiding") PExpressionBlock _expressionBlock_)
    {
        // Constructor
        setAllow(_allow_);

        setAccessCapabilities(_accessCapabilities_);

        setRoles(_roles_);

        setExpressionBlock(_expressionBlock_);

    }

    @Override
    public Object clone()
    {
        return new APermissionConstraint(
            cloneNode(this._allow_),
            cloneNode(this._accessCapabilities_),
            cloneNode(this._roles_),
            cloneNode(this._expressionBlock_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPermissionConstraint(this);
    }

    public TAllow getAllow()
    {
        return this._allow_;
    }

    public void setAllow(TAllow node)
    {
        if(this._allow_ != null)
        {
            this._allow_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._allow_ = node;
    }

    public PAccessCapabilities getAccessCapabilities()
    {
        return this._accessCapabilities_;
    }

    public void setAccessCapabilities(PAccessCapabilities node)
    {
        if(this._accessCapabilities_ != null)
        {
            this._accessCapabilities_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._accessCapabilities_ = node;
    }

    public PRoles getRoles()
    {
        return this._roles_;
    }

    public void setRoles(PRoles node)
    {
        if(this._roles_ != null)
        {
            this._roles_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._roles_ = node;
    }

    public PExpressionBlock getExpressionBlock()
    {
        return this._expressionBlock_;
    }

    public void setExpressionBlock(PExpressionBlock node)
    {
        if(this._expressionBlock_ != null)
        {
            this._expressionBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressionBlock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._allow_)
            + toString(this._accessCapabilities_)
            + toString(this._roles_)
            + toString(this._expressionBlock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._allow_ == child)
        {
            this._allow_ = null;
            return;
        }

        if(this._accessCapabilities_ == child)
        {
            this._accessCapabilities_ = null;
            return;
        }

        if(this._roles_ == child)
        {
            this._roles_ = null;
            return;
        }

        if(this._expressionBlock_ == child)
        {
            this._expressionBlock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._allow_ == oldChild)
        {
            setAllow((TAllow) newChild);
            return;
        }

        if(this._accessCapabilities_ == oldChild)
        {
            setAccessCapabilities((PAccessCapabilities) newChild);
            return;
        }

        if(this._roles_ == oldChild)
        {
            setRoles((PRoles) newChild);
            return;
        }

        if(this._expressionBlock_ == oldChild)
        {
            setExpressionBlock((PExpressionBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}