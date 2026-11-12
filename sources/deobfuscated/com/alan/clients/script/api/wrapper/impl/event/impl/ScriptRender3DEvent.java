/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.Render3DEvent;

public class ScriptRender3DEvent
extends ScriptEvent<Render3DEvent> {
    public ScriptRender3DEvent(Render3DEvent render3DEvent) {
        super(render3DEvent);
    }

    public float getPartialTicks() {
        return ((Render3DEvent)this.wrapped).getPartialTicks();
    }

    @Override
    public String getHandlerName() {
        return "onRender3D";
    }
}

