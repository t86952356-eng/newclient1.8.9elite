/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.entity.c;
import net.minecraft.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class bg
extends d {
    public final int cWr;
    private final int cWs;
    private final float cWt;
    private final boolean cWu;
    private boolean cWv;
    private int cWw;
    private int cWx;
    private int cWy;
    private float cWz;

    public bg(int n2, float f2, boolean bl2) {
        this.cWr = 32;
        this.cWs = n2;
        this.cWu = bl2;
        this.cWt = f2;
        this.d(net.minecraft.creativetab.a.cpD);
    }

    public bg(int n2, boolean bl2) {
        this(n2, 0.6f, bl2);
    }

    @Override
    public co b(co co2, w w2, net.minecraft.entity.player.a a2) {
        --co2.cWZ;
        a2.abY().a(this, co2);
        w2.a((c)a2, "random.burp", 0.5f, w2.dDk.nextFloat() * 0.1f + 0.9f);
        this.d(co2, w2, a2);
        a2.a(n.dqE[d.p(this)]);
        return co2;
    }

    protected void d(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (!w2.dDw && this.cWw > 0 && w2.dDk.nextFloat() < this.cWz) {
            a2.b(new net.minecraft.potion.d(this.cWw, this.cWx * 20, this.cWy));
        }
    }

    @Override
    public int aq(co co2) {
        return 32;
    }

    @Override
    public a ap(co co2) {
        return a.cUx;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (a2.bJ(this.cWv)) {
            a2.c(co2, this.aq(co2));
        }
        return co2;
    }

    public int aE(co co2) {
        return this.cWs;
    }

    public int adV() {
        return this.cWw;
    }

    public float aF(co co2) {
        return this.cWt;
    }

    public boolean adW() {
        return this.cWu;
    }

    public bg a(int n2, int n3, int n4, float f2) {
        this.cWw = n2;
        this.cWx = n3;
        this.cWy = n4;
        this.cWz = f2;
        return this;
    }

    public bg adX() {
        this.cWv = true;
        return this;
    }
}

