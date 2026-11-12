/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptMoveInputEvent;
import hackclient.rise.di;
import lombok.Generated;

public class dz
implements di {
    private float jp;
    private float jq;
    private boolean gD;
    private boolean jr;
    private double js;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptMoveInputEvent(this);
    }

    @Generated
    public float getForward() {
        return this.jp;
    }

    @Generated
    public float getStrafe() {
        return this.jq;
    }

    @Generated
    public boolean isJump() {
        return this.gD;
    }

    @Generated
    public boolean isSneak() {
        return this.jr;
    }

    @Generated
    public double getSneakSlowDownMultiplier() {
        return this.js;
    }

    @Generated
    public void setForward(float f2) {
        this.jp = f2;
    }

    @Generated
    public void setStrafe(float f2) {
        this.jq = f2;
    }

    @Generated
    public void setJump(boolean bl2) {
        this.gD = bl2;
    }

    @Generated
    public void setSneak(boolean bl2) {
        this.jr = bl2;
    }

    @Generated
    public void setSneakSlowDownMultiplier(double d2) {
        this.js = d2;
    }

    @Generated
    public dz(float f2, float f3, boolean bl2, boolean bl3, double d2) {
        this.jp = f2;
        this.jq = f3;
        this.gD = bl2;
        this.jr = bl3;
        this.js = d2;
    }
}

