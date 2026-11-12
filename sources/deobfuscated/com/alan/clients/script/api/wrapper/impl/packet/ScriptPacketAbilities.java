/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import net.minecraft.network.play.client.w;

public class ScriptPacketAbilities
extends ScriptPacket<w> {
    public ScriptPacketAbilities(w w2) {
        super(w2);
    }

    public boolean isInvulnerable() {
        return ((w)this.wrapped).isInvulnerable();
    }

    public boolean isFlying() {
        return ((w)this.wrapped).isFlying();
    }

    public boolean isAllowFlying() {
        return ((w)this.wrapped).isAllowFlying();
    }

    public boolean isCreativeMode() {
        return ((w)this.wrapped).isCreativeMode();
    }

    public void setInvulnerable(boolean bl2) {
        ((w)this.wrapped).setInvulnerable(bl2);
    }

    public void setFlying(boolean bl2) {
        ((w)this.wrapped).setFlying(bl2);
    }

    public void setAllowFlying(boolean bl2) {
        ((w)this.wrapped).setAllowFlying(bl2);
    }

    public void setCreativeMode(boolean bl2) {
        ((w)this.wrapped).setCreativeMode(bl2);
    }
}

