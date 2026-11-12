/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptMoveEvent;
import hackclient.rise.dh;
import lombok.Generated;

public final class ez
extends dh {
    private double gW;
    private double gX;
    private double gY;

    public ScriptEvent<?> cG() {
        return new ScriptMoveEvent(this);
    }

    @Generated
    public double getPosX() {
        return this.gW;
    }

    @Generated
    public double getPosY() {
        return this.gX;
    }

    @Generated
    public double getPosZ() {
        return this.gY;
    }

    @Generated
    public void setPosX(double d2) {
        this.gW = d2;
    }

    @Generated
    public void setPosY(double d2) {
        this.gX = d2;
    }

    @Generated
    public void setPosZ(double d2) {
        this.gY = d2;
    }

    @Generated
    public ez(double d2, double d3, double d4) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
    }
}

