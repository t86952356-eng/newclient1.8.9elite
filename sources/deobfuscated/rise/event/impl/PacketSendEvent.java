/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPacketSendEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.r;

public final class PacketSendEvent
extends dh {
    private aj<?> jR;
    private r jS;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPacketSendEvent(this);
    }

    @Generated
    public aj<?> dq() {
        return this.jR;
    }

    @Generated
    public r dr() {
        return this.jS;
    }

    @Generated
    public void e(aj<?> aj2) {
        this.jR = aj2;
    }

    @Generated
    public void a(r r2) {
        this.jS = r2;
    }

    @Generated
    public PacketSendEvent(aj<?> aj2, r r2) {
        this.jR = aj2;
        this.jS = r2;
    }
}

