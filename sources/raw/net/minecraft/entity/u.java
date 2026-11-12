/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.entity;

import io.netty.buffer.ByteBuf;
import net.minecraft.command.server.e;
import net.minecraft.entity.c;
import net.minecraft.entity.t;
import net.minecraft.util.b;
import net.minecraft.util.bb;
import net.minecraft.util.da;
import net.minecraft.world.w;

class u
extends e {
    final /* synthetic */ t cvp;

    u(t t2) {
        this.cvp = t2;
    }

    @Override
    public void Sz() {
        this.cvp.Tp().b(23, this.Sy());
        this.cvp.Tp().b(24, bb.q(this.Sx()));
    }

    @Override
    public int SA() {
        return 1;
    }

    @Override
    public void b(ByteBuf byteBuf) {
        byteBuf.writeInt(this.cvp.getEntityId());
    }

    @Override
    public b yl() {
        return new b(this.cvp.gW, this.cvp.gX + 0.5, this.cvp.gY);
    }

    @Override
    public da Sd() {
        return new da(this.cvp.gW, this.cvp.gX, this.cvp.gY);
    }

    @Override
    public w Se() {
        return this.cvp.baU;
    }

    @Override
    public c Sf() {
        return this.cvp;
    }
}

