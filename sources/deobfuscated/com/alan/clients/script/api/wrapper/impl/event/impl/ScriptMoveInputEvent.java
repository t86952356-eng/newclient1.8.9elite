/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.MoveInputEvent;

public class ScriptMoveInputEvent
extends ScriptEvent<MoveInputEvent> {
    public ScriptMoveInputEvent(MoveInputEvent moveInputEvent) {
        super(moveInputEvent);
    }

    public void setForward(float f2) {
        ((MoveInputEvent)this.wrapped).setForward(f2);
    }

    public void setStrafe(float f2) {
        ((MoveInputEvent)this.wrapped).setStrafe(f2);
    }

    public void setJump(boolean bl2) {
        ((MoveInputEvent)this.wrapped).setJump(bl2);
    }

    public void setSneak(boolean bl2) {
        ((MoveInputEvent)this.wrapped).setSneak(bl2);
    }

    public void setSneakSlowDownMultiplier(double d2) {
        ((MoveInputEvent)this.wrapped).setSneakSlowDownMultiplier(d2);
    }

    public float getForward() {
        return ((MoveInputEvent)this.wrapped).getForward();
    }

    public float getStrafe() {
        return ((MoveInputEvent)this.wrapped).getStrafe();
    }

    public boolean isJump() {
        return ((MoveInputEvent)this.wrapped).isJump();
    }

    public boolean isSneak() {
        return ((MoveInputEvent)this.wrapped).isSneak();
    }

    public double getSneakSlowDownMultiplier() {
        return ((MoveInputEvent)this.wrapped).getSneakSlowDownMultiplier();
    }

    @Override
    public String getHandlerName() {
        return "onMoveInput";
    }
}

