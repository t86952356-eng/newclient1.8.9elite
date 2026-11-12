/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptMoveEvent;
import hackclient.rise.dh;
import lombok.Generated;

public final class MoveEvent
extends dh {
    private double posX;
    private double posY;
    private double posZ;

    public ScriptEvent<?> cG() {
        return new ScriptMoveEvent(this);
    }

    @Generated
    public double getPosX() {
        return this.posX;
    }

    @Generated
    public double getPosY() {
        return this.posY;
    }

    @Generated
    public double getPosZ() {
        return this.posZ;
    }

    @Generated
    public void setPosX(double d2) {
        this.posX = d2;
    }

    @Generated
    public void setPosY(double d2) {
        this.posY = d2;
    }

    @Generated
    public void setPosZ(double d2) {
        this.posZ = d2;
    }

    @Generated
    public MoveEvent(double d2, double d3, double d4) {
        this.posX = d2;
        this.posY = d3;
        this.posZ = d4;
    }
}

