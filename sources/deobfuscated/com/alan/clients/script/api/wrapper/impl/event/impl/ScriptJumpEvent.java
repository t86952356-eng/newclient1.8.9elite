/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.JumpEvent;

public class ScriptJumpEvent
extends CancellableScriptEvent<JumpEvent> {
    public ScriptJumpEvent(JumpEvent jumpEvent) {
        super(jumpEvent);
    }

    public void setJumpMotion(float f2) {
        ((JumpEvent)this.wrapped).setJumpMotion(f2);
    }

    public void setYaw(float f2) {
        ((JumpEvent)this.wrapped).setYaw(f2);
    }

    public float getJumpMotion() {
        return ((JumpEvent)this.wrapped).getJumpMotion();
    }

    public float getYaw() {
        return ((JumpEvent)this.wrapped).getYaw();
    }

    @Override
    public String getHandlerName() {
        return "onJump";
    }
}

