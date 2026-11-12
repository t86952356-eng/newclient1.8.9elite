/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.WaterEvent;

public class ScriptWaterEvent
extends ScriptEvent<WaterEvent> {
    public ScriptWaterEvent(WaterEvent waterEvent) {
        super(waterEvent);
    }

    public void setWater(boolean bl2) {
        ((WaterEvent)this.wrapped).setWater(bl2);
    }

    public boolean isWater() {
        return ((WaterEvent)this.wrapped).isWater();
    }

    @Override
    public String getHandlerName() {
        return "onWater";
    }
}

