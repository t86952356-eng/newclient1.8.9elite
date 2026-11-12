/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class ad
extends e {
    private final j cyE;
    private final double cyF;
    protected int cyG;
    private int cwX;
    private int cyH;
    protected b cyI = b.dtN;
    private boolean cyJ;
    private final int cyK;

    public ad(j j2, double d2, int n2) {
        this.cyE = j2;
        this.cyF = d2;
        this.cyK = n2;
        this.eO(5);
    }

    @Override
    public boolean WC() {
        if (this.cyG > 0) {
            --this.cyG;
            return false;
        }
        this.cyG = 200 + this.cyE.VB().nextInt(200);
        return this.WU();
    }

    @Override
    public boolean WD() {
        return this.cwX >= -this.cyH && this.cwX <= 1200 && this.ab(this.cyE.baU, this.cyI);
    }

    @Override
    public void WG() {
        this.cyE.UU().n((double)this.cyI.wt() + 0.5, this.cyI.wu() + 1, (double)this.cyI.wx() + 0.5, this.cyF);
        this.cwX = 0;
        this.cyH = this.cyE.VB().nextInt(this.cyE.VB().nextInt(1200) + 1200) + 1200;
    }

    @Override
    public void WE() {
    }

    @Override
    public void WF() {
        if (this.cyE.ab(this.cyI.aqX()) > 1.0) {
            this.cyJ = false;
            ++this.cwX;
            if (this.cwX % 40 == 0) {
                this.cyE.UU().n((double)this.cyI.wt() + 0.5, this.cyI.wu() + 1, (double)this.cyI.wx() + 0.5, this.cyF);
            }
        } else {
            this.cyJ = true;
            --this.cwX;
        }
    }

    protected boolean WT() {
        return this.cyJ;
    }

    private boolean WU() {
        int n2 = this.cyK;
        boolean bl2 = true;
        b b2 = new b(this.cyE);
        int n3 = 0;
        while (n3 <= 1) {
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = 0;
                while (n4 <= i2) {
                    int n5;
                    int n6 = n5 = n4 < i2 && n4 > -i2 ? i2 : 0;
                    while (n5 <= i2) {
                        b b3 = b2.C(n4, n3 - 1, n5);
                        if (this.cyE.ae(b3) && this.ab(this.cyE.baU, b3)) {
                            this.cyI = b3;
                            return true;
                        }
                        n5 = n5 > 0 ? -n5 : 1 - n5;
                    }
                    n4 = n4 > 0 ? -n4 : 1 - n4;
                }
            }
            n3 = n3 > 0 ? -n3 : 1 - n3;
        }
        return false;
    }

    protected abstract boolean ab(w var1, b var2);
}

