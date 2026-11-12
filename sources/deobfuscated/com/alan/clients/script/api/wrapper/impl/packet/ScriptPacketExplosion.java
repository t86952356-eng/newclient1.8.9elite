/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.server.ar;

public class ScriptPacketExplosion
extends ScriptPacket<ar> {
    public ScriptPacketExplosion(ar ar2) {
        super(ar2);
    }

    public double getX() {
        return ((ar)this.wrapped).getX();
    }

    public double getY() {
        return ((ar)this.wrapped).getY();
    }

    public double getZ() {
        return ((ar)this.wrapped).getZ();
    }

    public float getStrength() {
        return ((ar)this.wrapped).getStrength();
    }

    public float getPlayerMotionX() {
        return ((ar)this.wrapped).ahm();
    }

    public float getPlayerMotionY() {
        return ((ar)this.wrapped).ahn();
    }

    public float getPlayerMotionZ() {
        return ((ar)this.wrapped).aho();
    }

    public void setPlayerMotionX(float f2) {
        try {
            Field field = ((ar)this.wrapped).getClass().getDeclaredField("field_149153_g");
            field.setAccessible(true);
            field.setFloat(this.wrapped, f2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void setPlayerMotionY(float f2) {
        try {
            Field field = ((ar)this.wrapped).getClass().getDeclaredField("field_149152_f");
            field.setAccessible(true);
            field.setFloat(this.wrapped, f2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void setPlayerMotionZ(float f2) {
        try {
            Field field = ((ar)this.wrapped).getClass().getDeclaredField("field_149159_h");
            field.setAccessible(true);
            field.setFloat(this.wrapped, f2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

