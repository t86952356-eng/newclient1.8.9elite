/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.ed;

public class ScriptJumpEvent
extends CancellableScriptEvent<ed> {
    public ScriptJumpEvent(ed ed2) {
        super(ed2);
    }

    public void setJumpMotion(float f2) {
        ((ed)this.wrapped).setJumpMotion(f2);
    }

    public void setYaw(float f2) {
        ((ed)this.wrapped).setYaw(f2);
    }

    public float getJumpMotion() {
        return ((ed)this.wrapped).getJumpMotion();
    }

    public float getYaw() {
        return ((ed)this.wrapped).getYaw();
    }

    @Override
    public String getHandlerName() {
        return "onJump";
    }
}

