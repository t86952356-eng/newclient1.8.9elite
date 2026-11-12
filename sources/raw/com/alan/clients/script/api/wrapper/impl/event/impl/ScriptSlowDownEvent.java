/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.em;

public class ScriptSlowDownEvent
extends CancellableScriptEvent<em> {
    public ScriptSlowDownEvent(em em2) {
        super(em2);
    }

    public void setStrafeMultiplier(float f2) {
        ((em)this.wrapped).setStrafeMultiplier(f2);
    }

    public void setForwardMultiplier(float f2) {
        ((em)this.wrapped).setStrafeMultiplier(f2);
    }

    public float getStrafeMultiplier() {
        return ((em)this.wrapped).getStrafeMultiplier();
    }

    public float getForwardMultiplier() {
        return ((em)this.wrapped).getForwardMultiplier();
    }

    @Override
    public String getHandlerName() {
        return "onSlowDown";
    }
}

