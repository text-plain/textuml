/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TRepeat extends Token
{
    public TRepeat()
    {
        super.setText("repeat");
    }

    public TRepeat(int line, int pos)
    {
        super.setText("repeat");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRepeat(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRepeat(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRepeat text.");
    }
}
