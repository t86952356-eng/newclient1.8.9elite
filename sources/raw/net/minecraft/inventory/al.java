/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.af;
import net.minecraft.inventory.ak;
import net.minecraft.item.bj;
import net.minecraft.item.bw;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;
import net.minecraft.item.v;
import net.minecraft.stats.b;

public class al
extends ak {
    private final af cUn;
    private final net.minecraft.entity.player.a cUo;
    private int cUp;

    public al(net.minecraft.entity.player.a a2, af af2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
        this.cUo = a2;
        this.cUn = af2;
    }

    @Override
    public boolean H(co co2) {
        return false;
    }

    @Override
    public co cf(int n2) {
        if (this.GJ()) {
            this.cUp += Math.min(n2, this.ls().cWZ);
        }
        return super.cf(n2);
    }

    @Override
    protected void d(co co2, int n2) {
        this.cUp += n2;
        this.al(co2);
    }

    @Override
    protected void al(co co2) {
        if (this.cUp > 0) {
            co2.a(this.cUo.baU, this.cUo, this.cUp);
        }
        this.cUp = 0;
        if (co2.bP() == d.I(Blocks.cMk)) {
            this.cUo.a(b.doG);
        }
        if (co2.bP() instanceof bw) {
            this.cUo.a(b.doH);
        }
        if (co2.bP() == d.I(Blocks.cMn)) {
            this.cUo.a(b.doI);
        }
        if (co2.bP() instanceof bj) {
            this.cUo.a(b.doK);
        }
        if (co2.bP() == Items.cPT) {
            this.cUo.a(b.doL);
        }
        if (co2.bP() == Items.cRd) {
            this.cUo.a(b.doM);
        }
        if (co2.bP() instanceof bw && ((bw)co2.bP()).adY() != v.cVt) {
            this.cUo.a(b.doN);
        }
        if (co2.bP() instanceof cp) {
            this.cUo.a(b.doQ);
        }
        if (co2.bP() == d.I(Blocks.cNE)) {
            this.cUo.a(b.dpd);
        }
        if (co2.bP() == d.I(Blocks.cLZ)) {
            this.cUo.a(b.dpf);
        }
        if (co2.bP() == Items.cQs && co2.yc() == 1) {
            this.cUo.a(b.dpl);
        }
    }

    @Override
    public void a(net.minecraft.entity.player.a a2, co co2) {
        this.al(co2);
        co[] coArray = a.aey().b(this.cUn, a2.baU);
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            co co3 = this.cUn.fi(i2);
            co co4 = coArray[i2];
            if (co3 != null) {
                this.cUn.ap(i2, 1);
            }
            if (co4 == null) continue;
            if (this.cUn.fi(i2) == null) {
                this.cUn.g(i2, co4);
                continue;
            }
            if (this.cUo.cHV.ah(co4)) continue;
            this.cUo.d(co4, false);
        }
    }
}

