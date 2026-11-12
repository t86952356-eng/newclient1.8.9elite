/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ec;

public class ScriptHitSlowDownEvent
extends ScriptEvent<ec> {
    public ScriptHitSlowDownEvent(ec ec2) {
        super(ec2);
    }

    public void setSlowDown(double d2) {
        ((ec)this.wrapped).setSlowDown(d2);
    }

    public void setSprint(boolean bl2) {
        ((ec)this.wrapped).setSprint(bl2);
    }

    public double getSlowDown() {
        return ((ec)this.wrapped).getSlowDown();
    }

    public boolean isSprint() {
        return ((ec)this.wrapped).isSprint();
    }

    @Override
    public String getHandlerName() {
        return "onHitSlowDown";
    }
}

