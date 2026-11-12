/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.command.o;
import net.minecraft.entity.c;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.da;
import net.minecraft.world.w;

class p
implements aw {
    final /* synthetic */ c cnQ;
    final /* synthetic */ aw cnR;
    final /* synthetic */ b cnS;
    final /* synthetic */ double cnT;
    final /* synthetic */ double cnU;
    final /* synthetic */ double cnV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p(o o2, c c2, aw aw2, b b2, double d2, double d3, double d4) {
        this.cnQ = c2;
        this.cnR = aw2;
        this.cnS = b2;
        this.cnT = d2;
        this.cnU = d3;
        this.cnV = d4;
    }

    @Override
    public String xU() {
        return this.cnQ.xU();
    }

    @Override
    public ba xW() {
        return this.cnQ.xW();
    }

    @Override
    public void a(ba ba2) {
        this.cnR.a(ba2);
    }

    @Override
    public boolean c(int n2, String string) {
        return this.cnR.c(n2, string);
    }

    @Override
    public b yl() {
        return this.cnS;
    }

    @Override
    public da Sd() {
        return new da(this.cnT, this.cnU, this.cnV);
    }

    @Override
    public w Se() {
        return this.cnQ.baU;
    }

    @Override
    public c Sf() {
        return this.cnQ;
    }

    @Override
    public boolean Sg() {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        return minecraftServer == null || minecraftServer.dkG[0].Si().gw("commandBlockOutput");
    }

    @Override
    public void a(ad ad2, int n2) {
        this.cnQ.a(ad2, n2);
    }
}

