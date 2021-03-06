/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TNotNull extends Token
{
    public TNotNull()
    {
        super.setText("?");
    }

    public TNotNull(int line, int pos)
    {
        super.setText("?");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNotNull(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNotNull(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNotNull text.");
    }
}
