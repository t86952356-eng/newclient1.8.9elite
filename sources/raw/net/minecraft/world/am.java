/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.world.al;
import net.minecraft.world.border.b;
import net.minecraft.world.border.c;

class am
implements b {
    final /* synthetic */ al dEo;

    am(al al2) {
        this.dEo = al2;
    }

    @Override
    public void a(c c2, double d2) {
        this.dEo.Sv().aN(d2);
    }

    @Override
    public void a(c c2, double d2, double d3, long l2) {
        this.dEo.Sv().a(d2, d3, l2);
    }

    @Override
    public void a(c c2, double d2, double d3) {
        this.dEo.Sv().C(d2, d3);
    }

    @Override
    public void a(c c2, int n2) {
        this.dEo.Sv().iq(n2);
    }

    @Override
    public void b(c c2, int n2) {
        this.dEo.Sv().ir(n2);
    }

    @Override
    public void b(c c2, double d2) {
        this.dEo.Sv().aP(d2);
    }

    @Override
    public void c(c c2, double d2) {
        this.dEo.Sv().aO(d2);
    }
}

