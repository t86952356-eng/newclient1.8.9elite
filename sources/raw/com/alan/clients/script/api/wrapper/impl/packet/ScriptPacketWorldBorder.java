/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.server.by;

public class ScriptPacketWorldBorder
extends ScriptPacket<by> {
    public ScriptPacketWorldBorder(by by2) {
        super(by2);
    }

    public String getAction() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("action");
            field.setAccessible(true);
            Object object = field.get(this.wrapped);
            return object != null ? object.toString() : "";
        }
        catch (Exception exception) {
            return "";
        }
    }

    public double getTargetSize() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("targetSize");
            field.setAccessible(true);
            return field.getDouble(this.wrapped);
        }
        catch (Exception exception) {
            return 0.0;
        }
    }

    public double getCenterX() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("centerX");
            field.setAccessible(true);
            return field.getDouble(this.wrapped);
        }
        catch (Exception exception) {
            return 0.0;
        }
    }

    public double getCenterZ() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("centerZ");
            field.setAccessible(true);
            return field.getDouble(this.wrapped);
        }
        catch (Exception exception) {
            return 0.0;
        }
    }

    public long getTimeUntilTarget() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("timeUntilTarget");
            field.setAccessible(true);
            return field.getLong(this.wrapped);
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    public int getWarningTime() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("warningTime");
            field.setAccessible(true);
            return field.getInt(this.wrapped);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public int getWarningDistance() {
        try {
            Field field = ((by)this.wrapped).getClass().getDeclaredField("warningDistance");
            field.setAccessible(true);
            return field.getInt(this.wrapped);
        }
        catch (Exception exception) {
            return 0;
        }
    }
}

