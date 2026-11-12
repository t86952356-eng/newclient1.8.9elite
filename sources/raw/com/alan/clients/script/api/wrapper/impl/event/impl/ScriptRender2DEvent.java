/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.fs;

public class ScriptRender2DEvent
extends ScriptEvent<fs> {
    public ScriptRender2DEvent(fs fs2) {
        super(fs2);
    }

    public float getPartialTicks() {
        return ((fs)this.wrapped).getPartialTicks();
    }

    public int getScaledWidth() {
        return ((fs)this.wrapped).dx().getScaledWidth();
    }

    public int getScaledHeight() {
        return ((fs)this.wrapped).dx().getScaledHeight();
    }

    public int getScaleFactor() {
        return ((fs)this.wrapped).dx().getScaleFactor();
    }

    @Override
    public String getHandlerName() {
        return "onRender2D";
    }
}

