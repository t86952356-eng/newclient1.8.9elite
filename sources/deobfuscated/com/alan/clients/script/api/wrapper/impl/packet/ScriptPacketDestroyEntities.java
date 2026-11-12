/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.server.u;

public class ScriptPacketDestroyEntities
extends ScriptPacket<u> {
    public ScriptPacketDestroyEntities(u u2) {
        super(u2);
    }

    public int getEntityCount() {
        return ((u)this.wrapped).agQ() != null ? ((u)this.wrapped).agQ().length : 0;
    }

    public int getEntityId(int n2) {
        int[] nArray = ((u)this.wrapped).agQ();
        return nArray != null && n2 >= 0 && n2 < nArray.length ? nArray[n2] : -1;
    }
}

