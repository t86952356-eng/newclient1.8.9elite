/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptJumpEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public class JumpEvent
extends dh {
    private float jumpMotion;
    private float yaw;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptJumpEvent(this);
    }

    @Generated
    public float getJumpMotion() {
        return this.jumpMotion;
    }

    @Generated
    public float getYaw() {
        return this.yaw;
    }

    @Generated
    public void setJumpMotion(float f2) {
        this.jumpMotion = f2;
    }

    @Generated
    public void setYaw(float f2) {
        this.yaw = f2;
    }

    @Generated
    public JumpEvent(float f2, float f3) {
        this.jumpMotion = f2;
        this.yaw = f3;
    }
}

