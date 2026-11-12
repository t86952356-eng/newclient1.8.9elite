/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import java.lang.reflect.Field;
import net.minecraft.network.play.server.be;

public class ScriptPacketMaps
extends ScriptPacket<be> {
    public ScriptPacketMaps(be be2) {
        super(be2);
    }

    public int getMapId() {
        return ((be)this.wrapped).getMapId();
    }

    public byte getMapScale() {
        try {
            Field field = ((be)this.wrapped).getClass().getDeclaredField("mapScale");
            field.setAccessible(true);
            return field.getByte(this.wrapped);
        }
        catch (Exception exception) {
            return 0;
        }
    }
}

