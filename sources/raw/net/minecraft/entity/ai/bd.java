/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.da;

public class bd
extends e {
    private final j cAe;
    private double bUg;
    private double bUh;
    private double bUi;
    private final double cAf;
    private int cAg;
    private boolean cAh;

    public bd(j j2, double d2) {
        this(j2, d2, 120);
    }

    public bd(j j2, double d2, int n2) {
        this.cAe = j2;
        this.cAf = d2;
        this.cAg = n2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        da da2;
        if (!this.cAh) {
            if (this.cAe.VG() >= 100) {
                return false;
            }
            if (this.cAe.VB().nextInt(this.cAg) != 0) {
                return false;
            }
        }
        if ((da2 = bm.a(this.cAe, 10, 7)) == null) {
            return false;
        }
        this.bUg = da2.dAG;
        this.bUh = da2.dAH;
        this.bUi = da2.dAI;
        this.cAh = false;
        return true;
    }

    @Override
    public boolean WD() {
        return !this.cAe.UU().aiK();
    }

    @Override
    public void WG() {
        this.cAe.UU().n(this.bUg, this.bUh, this.bUi, this.cAf);
    }

    public void Xa() {
        this.cAh = true;
    }

    public void eP(int n2) {
        this.cAg = n2;
    }
}

