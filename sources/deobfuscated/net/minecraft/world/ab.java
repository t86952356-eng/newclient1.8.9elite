/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.ap;
import net.minecraft.network.play.server.as;
import net.minecraft.network.play.server.at;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.ai;
import net.minecraft.world.o;

public class ab
implements o {
    private final MinecraftServer dDI;
    private final ai dDJ;

    public ab(MinecraftServer minecraftServer, ai ai2) {
        this.dDI = minecraftServer;
        this.dDJ = ai2;
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
    }

    @Override
    public void I(c c2) {
        this.dDJ.awu().aj(c2);
    }

    @Override
    public void J(c c2) {
        this.dDJ.awu().ak(c2);
        this.dDJ.SD().av(c2);
    }

    @Override
    public void a(String string, double d2, double d3, double d4, float f2, float f3) {
        this.dDI.alE().a(d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.dDJ.dDl.getDimensionId(), new at(string, d2, d3, d4, f2, f3));
    }

    @Override
    public void a(a a2, String string, double d2, double d3, double d4, float f2, float f3) {
        this.dDI.alE().a(a2, d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.dDJ.dDl.getDimensionId(), new at(string, d2, d3, d4, f2, f3));
    }

    @Override
    public void f(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void P(b b2) {
        this.dDJ.awv().P(b2);
    }

    @Override
    public void Q(b b2) {
    }

    @Override
    public void a(String string, b b2) {
    }

    @Override
    public void a(a a2, int n2, b b2, int n3) {
        this.dDI.alE().a(a2, b2.wt(), b2.wu(), b2.wx(), 64.0, this.dDJ.dDl.getDimensionId(), new as(n2, b2, n3, false));
    }

    @Override
    public void a(int n2, b b2, int n3) {
        this.dDI.alE().H(new as(n2, b2, n3, true));
    }

    @Override
    public void b(int n2, b b2, int n3) {
        for (e e2 : this.dDI.alE().amB()) {
            double d2;
            double d3;
            double d4;
            if (e2 == null || e2.baU != this.dDJ || e2.getEntityId() == n2 || !((d4 = (double)b2.wt() - e2.gW) * d4 + (d3 = (double)b2.wu() - e2.gX) * d3 + (d2 = (double)b2.wx() - e2.gY) * d2 < 1024.0)) continue;
            e2.cIX.B(new ap(n2, b2, n3));
        }
    }

    @Override
    public void c(int n2, b b2, int n3) {
        this.b(n2, b2, n3);
    }
}

