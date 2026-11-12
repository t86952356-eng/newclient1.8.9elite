/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.ae;
import net.minecraft.inventory.aj;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.village.a;

public class ao
extends ak {
    private final aj cUs;
    private final net.minecraft.entity.player.a cUt;
    private int cUu;
    private final ae cUv;

    public ao(net.minecraft.entity.player.a a2, ae ae2, aj aj2, int n2, int n3, int n4) {
        super(aj2, n2, n3, n4);
        this.cUt = a2;
        this.cUv = ae2;
        this.cUs = aj2;
    }

    @Override
    public boolean H(co co2) {
        return false;
    }

    @Override
    public co cf(int n2) {
        if (this.GJ()) {
            this.cUu += Math.min(n2, this.ls().cWZ);
        }
        return super.cf(n2);
    }

    @Override
    protected void d(co co2, int n2) {
        this.cUu += n2;
        this.al(co2);
    }

    @Override
    protected void al(co co2) {
        co2.a(this.cUt.baU, this.cUt, this.cUu);
        this.cUu = 0;
    }

    @Override
    public void a(net.minecraft.entity.player.a a2, co co2) {
        co co3;
        co co4;
        this.al(co2);
        a a3 = this.cUs.adm();
        if (a3 != null && (this.a(a3, co4 = this.cUs.fi(0), co3 = this.cUs.fi(1)) || this.a(a3, co3, co4))) {
            this.cUv.a(a3);
            a2.a(n.dqh);
            if (co4 != null && co4.cWZ <= 0) {
                co4 = null;
            }
            if (co3 != null && co3.cWZ <= 0) {
                co3 = null;
            }
            this.cUs.g(0, co4);
            this.cUs.g(1, co3);
        }
    }

    private boolean a(a a2, co co2, co co3) {
        co co4 = a2.atY();
        co co5 = a2.atZ();
        if (co2 != null && co2.bP() == co4.bP()) {
            if (co5 != null && co3 != null && co5.bP() == co3.bP()) {
                co2.cWZ -= co4.cWZ;
                co3.cWZ -= co5.cWZ;
                return true;
            }
            if (co5 == null && co3 == null) {
                co2.cWZ -= co4.cWZ;
                return true;
            }
        }
        return false;
    }
}

