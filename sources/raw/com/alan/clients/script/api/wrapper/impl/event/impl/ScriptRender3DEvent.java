/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ft;

public class ScriptRender3DEvent
extends ScriptEvent<ft> {
    public ScriptRender3DEvent(ft ft2) {
        super(ft2);
    }

    public float getPartialTicks() {
        return ((ft)this.wrapped).getPartialTicks();
    }

    @Override
    public String getHandlerName() {
        return "onRender3D";
    }
}

