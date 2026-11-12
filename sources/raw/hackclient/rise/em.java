/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptSlowDownEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public class em
extends dh {
    private float jz;
    private float jA;
    private boolean jB;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptSlowDownEvent(this);
    }

    @Generated
    public float getStrafeMultiplier() {
        return this.jz;
    }

    @Generated
    public float getForwardMultiplier() {
        return this.jA;
    }

    @Generated
    public boolean db() {
        return this.jB;
    }

    @Generated
    public void setStrafeMultiplier(float f2) {
        this.jz = f2;
    }

    @Generated
    public void setForwardMultiplier(float f2) {
        this.jA = f2;
    }

    @Generated
    public void k(boolean bl2) {
        this.jB = bl2;
    }

    @Generated
    public em(float f2, float f3, boolean bl2) {
        this.jz = f2;
        this.jA = f3;
        this.jB = bl2;
    }
}

