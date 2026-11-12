/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.client.ad;

public class ScriptPacketResourcePackStatus
extends ScriptPacket<ad> {
    public ScriptPacketResourcePackStatus(ad ad2) {
        super(ad2);
    }

    public String getHash() {
        try {
            Field field = ((ad)this.wrapped).getClass().getDeclaredField("hash");
            field.setAccessible(true);
            return (String)field.get(this.wrapped);
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String getStatus() {
        try {
            Field field = ((ad)this.wrapped).getClass().getDeclaredField("status");
            field.setAccessible(true);
            Object object = field.get(this.wrapped);
            return object != null ? object.toString() : "";
        }
        catch (Exception exception) {
            return "";
        }
    }
}

