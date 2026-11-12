/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptHitSlowDownEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class ec
extends dh {
    public double jt;
    public boolean jk;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptHitSlowDownEvent(this);
    }

    @Generated
    public double getSlowDown() {
        return this.jt;
    }

    @Generated
    public boolean isSprint() {
        return this.jk;
    }

    @Generated
    public void setSlowDown(double d2) {
        this.jt = d2;
    }

    @Generated
    public void setSprint(boolean bl2) {
        this.jk = bl2;
    }

    @Generated
    public ec(double d2, boolean bl2) {
        this.jt = d2;
        this.jk = bl2;
    }
}

