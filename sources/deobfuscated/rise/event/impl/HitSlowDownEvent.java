/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptHitSlowDownEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class HitSlowDownEvent
extends dh {
    public double slowDown;
    public boolean sprint;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptHitSlowDownEvent(this);
    }

    @Generated
    public double getSlowDown() {
        return this.slowDown;
    }

    @Generated
    public boolean isSprint() {
        return this.sprint;
    }

    @Generated
    public void setSlowDown(double d2) {
        this.slowDown = d2;
    }

    @Generated
    public void setSprint(boolean bl2) {
        this.sprint = bl2;
    }

    @Generated
    public HitSlowDownEvent(double d2, boolean bl2) {
        this.slowDown = d2;
        this.sprint = bl2;
    }
}

