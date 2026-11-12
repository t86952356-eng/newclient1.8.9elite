/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.village.c;
import net.minecraft.village.f;

public class ab
extends e {
    private final j cyv;
    private f cyw;
    private int cyx = -1;
    private int cyy = -1;

    public ab(j j2) {
        this.cyv = j2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        b b2 = new b(this.cyv);
        if ((!this.cyv.baU.avr() || this.cyv.baU.avK() && !this.cyv.baU.aF(b2).awX()) && !this.cyv.baU.dDl.awf()) {
            if (this.cyv.VB().nextInt(50) != 0) {
                return false;
            }
            if (this.cyx != -1 && this.cyv.M(this.cyx, this.cyv.gX, this.cyy) < 4.0) {
                return false;
            }
            c c2 = this.cyv.baU.avS().e(b2, 14);
            if (c2 == null) {
                return false;
            }
            this.cyw = c2.at(b2);
            return this.cyw != null;
        }
        return false;
    }

    @Override
    public boolean WD() {
        return !this.cyv.UU().aiK();
    }

    @Override
    public void WG() {
        this.cyx = -1;
        b b2 = this.cyw.auG();
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        if (this.cyv.aa(b2) > 256.0) {
            da da2 = bm.a(this.cyv, 14, 3, new da((double)n2 + 0.5, n3, (double)n4 + 0.5));
            if (da2 != null) {
                this.cyv.UU().n(da2.dAG, da2.dAH, da2.dAI, 1.0);
            }
        } else {
            this.cyv.UU().n((double)n2 + 0.5, n3, (double)n4 + 0.5, 1.0);
        }
    }

    @Override
    public void WE() {
        this.cyx = this.cyw.auG().wt();
        this.cyy = this.cyw.auG().wx();
        this.cyw = null;
    }
}

