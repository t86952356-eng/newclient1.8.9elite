/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptSlowDownEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public class SlowDownEvent
extends dh {
    private float strafeMultiplier;
    private float forwardMultiplier;
    private boolean jB;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptSlowDownEvent(this);
    }

    @Generated
    public float getStrafeMultiplier() {
        return this.strafeMultiplier;
    }

    @Generated
    public float getForwardMultiplier() {
        return this.forwardMultiplier;
    }

    @Generated
    public boolean db() {
        return this.jB;
    }

    @Generated
    public void setStrafeMultiplier(float f2) {
        this.strafeMultiplier = f2;
    }

    @Generated
    public void setForwardMultiplier(float f2) {
        this.forwardMultiplier = f2;
    }

    @Generated
    public void k(boolean bl2) {
        this.jB = bl2;
    }

    @Generated
    public SlowDownEvent(float f2, float f3, boolean bl2) {
        this.strafeMultiplier = f2;
        this.forwardMultiplier = f3;
        this.jB = bl2;
    }
}

