/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.k;

public class ScriptPacketBlockPlacement
extends ScriptPacket<k> {
    public ScriptPacketBlockPlacement(k k2) {
        super(k2);
    }

    public ScriptBlockPos getPosition() {
        return new ScriptBlockPos(((k)this.wrapped).yl());
    }

    public int getPlacedBlockDirection() {
        return ((k)this.wrapped).getPlacedBlockDirection();
    }

    public float getFacingX() {
        return ((k)this.wrapped).getFacingX();
    }

    public float getFacingY() {
        return ((k)this.wrapped).getFacingY();
    }

    public float getFacingZ() {
        return ((k)this.wrapped).getFacingZ();
    }

    public void setFacingX(float f2) {
        ((k)this.wrapped).facingX = f2;
    }

    public void setFacingY(float f2) {
        ((k)this.wrapped).facingY = f2;
    }

    public void setFacingZ(float f2) {
        ((k)this.wrapped).facingZ = f2;
    }
}

