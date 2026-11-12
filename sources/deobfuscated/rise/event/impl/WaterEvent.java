/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptWaterEvent;
import hackclient.rise.di;
import lombok.Generated;

public class WaterEvent
implements di {
    private boolean water;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptWaterEvent(this);
    }

    @Generated
    public boolean isWater() {
        return this.water;
    }

    @Generated
    public void setWater(boolean bl2) {
        this.water = bl2;
    }

    @Generated
    public WaterEvent(boolean bl2) {
        this.water = bl2;
    }
}

