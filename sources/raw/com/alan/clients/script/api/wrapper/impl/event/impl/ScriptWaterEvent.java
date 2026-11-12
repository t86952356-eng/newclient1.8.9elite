/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.ep;

public class ScriptWaterEvent
extends ScriptEvent<ep> {
    public ScriptWaterEvent(ep ep2) {
        super(ep2);
    }

    public void setWater(boolean bl2) {
        ((ep)this.wrapped).setWater(bl2);
    }

    public boolean isWater() {
        return ((ep)this.wrapped).isWater();
    }

    @Override
    public String getHandlerName() {
        return "onWater";
    }
}

