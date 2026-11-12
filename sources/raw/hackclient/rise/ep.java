/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptWaterEvent;
import hackclient.rise.di;
import lombok.Generated;

public class ep
implements di {
    private boolean jD;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptWaterEvent(this);
    }

    @Generated
    public boolean isWater() {
        return this.jD;
    }

    @Generated
    public void setWater(boolean bl2) {
        this.jD = bl2;
    }

    @Generated
    public ep(boolean bl2) {
        this.jD = bl2;
    }
}

