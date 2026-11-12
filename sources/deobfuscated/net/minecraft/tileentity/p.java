/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.tileentity;

import io.netty.buffer.ByteBuf;
import net.minecraft.command.server.e;
import net.minecraft.entity.c;
import net.minecraft.tileentity.o;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.world.w;

class p
extends e {
    final /* synthetic */ o dsJ;

    p(o o2) {
        this.dsJ = o2;
    }

    @Override
    public b yl() {
        return this.dsJ.aZf;
    }

    @Override
    public da Sd() {
        return new da((double)this.dsJ.aZf.wt() + 0.5, (double)this.dsJ.aZf.wu() + 0.5, (double)this.dsJ.aZf.wx() + 0.5);
    }

    @Override
    public w Se() {
        return this.dsJ.de();
    }

    @Override
    public void dW(String string) {
        super.dW(string);
        this.dsJ.Lw();
    }

    @Override
    public void Sz() {
        this.dsJ.de().P(this.dsJ.aZf);
    }

    @Override
    public int SA() {
        return 0;
    }

    @Override
    public void b(ByteBuf byteBuf) {
        byteBuf.writeInt(this.dsJ.aZf.wt());
        byteBuf.writeInt(this.dsJ.aZf.wu());
        byteBuf.writeInt(this.dsJ.aZf.wx());
    }

    @Override
    public c Sf() {
        return null;
    }
}

