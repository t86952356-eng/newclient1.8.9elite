/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptJumpEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public class ed
extends dh {
    private float ju;
    private float gZ;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptJumpEvent(this);
    }

    @Generated
    public float getJumpMotion() {
        return this.ju;
    }

    @Generated
    public float getYaw() {
        return this.gZ;
    }

    @Generated
    public void setJumpMotion(float f2) {
        this.ju = f2;
    }

    @Generated
    public void setYaw(float f2) {
        this.gZ = f2;
    }

    @Generated
    public ed(float f2, float f3) {
        this.ju = f2;
        this.gZ = f3;
    }
}

