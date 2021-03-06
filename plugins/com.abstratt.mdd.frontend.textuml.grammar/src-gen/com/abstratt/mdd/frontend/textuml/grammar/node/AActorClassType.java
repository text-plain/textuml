/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AActorClassType extends PClassType
{
    private TActor _actor_;

    public AActorClassType()
    {
        // Constructor
    }

    public AActorClassType(
        @SuppressWarnings("hiding") TActor _actor_)
    {
        // Constructor
        setActor(_actor_);

    }

    @Override
    public Object clone()
    {
        return new AActorClassType(
            cloneNode(this._actor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAActorClassType(this);
    }

    public TActor getActor()
    {
        return this._actor_;
    }

    public void setActor(TActor node)
    {
        if(this._actor_ != null)
        {
            this._actor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._actor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._actor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._actor_ == child)
        {
            this._actor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._actor_ == oldChild)
        {
            setActor((TActor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
