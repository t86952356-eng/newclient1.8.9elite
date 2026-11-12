/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.Render2DEvent;

public class ScriptRender2DEvent
extends ScriptEvent<Render2DEvent> {
    public ScriptRender2DEvent(Render2DEvent render2DEvent) {
        super(render2DEvent);
    }

    public float getPartialTicks() {
        return ((Render2DEvent)this.wrapped).getPartialTicks();
    }

    public int getScaledWidth() {
        return ((Render2DEvent)this.wrapped).dx().getScaledWidth();
    }

    public int getScaledHeight() {
        return ((Render2DEvent)this.wrapped).dx().getScaledHeight();
    }

    public int getScaleFactor() {
        return ((Render2DEvent)this.wrapped).dx().getScaleFactor();
    }

    @Override
    public String getHandlerName() {
        return "onRender2D";
    }
}

