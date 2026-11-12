/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.nbt.n;
import net.minecraft.util.ar;
import net.minecraft.util.g;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

abstract class d
extends y {
    protected int dPM;
    protected int dPN;
    protected int dPO;
    protected int dPP = -1;

    public d() {
    }

    protected d(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(0);
        this.dPM = n5;
        this.dPN = n6;
        this.dPO = n7;
        this.dQJ = ar.dwT.g(random);
        switch (this.dQJ) {
            case dws: 
            case dwt: {
                this.dQI = new w(n2, n3, n4, n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1);
                break;
            }
            default: {
                this.dQI = new w(n2, n3, n4, n2 + n7 - 1, n3 + n6 - 1, n4 + n5 - 1);
            }
        }
    }

    @Override
    protected void N(n n2) {
        n2.B("Width", this.dPM);
        n2.B("Height", this.dPN);
        n2.B("Depth", this.dPO);
        n2.B("HPos", this.dPP);
    }

    @Override
    protected void O(n n2) {
        this.dPM = n2.eG("Width");
        this.dPN = n2.eG("Height");
        this.dPO = n2.eG("Depth");
        this.dPP = n2.eG("HPos");
    }

    protected boolean a(net.minecraft.world.w w2, w w3, int n2) {
        if (this.dPP >= 0) {
            return true;
        }
        int n3 = 0;
        int n4 = 0;
        g g2 = new g();
        for (int i2 = this.dQI.dQD; i2 <= this.dQI.dQG; ++i2) {
            for (int i3 = this.dQI.dQB; i3 <= this.dQI.dQE; ++i3) {
                g2.E(i3, 64, i2);
                if (!w3.k(g2)) continue;
                n3 += Math.max(w2.aT(g2).wu(), w2.dDl.awb());
                ++n4;
            }
        }
        if (n4 == 0) {
            return false;
        }
        this.dPP = n3 / n4;
        this.dQI.ad(0, this.dPP - this.dQI.dQC + n2, 0);
        return true;
    }
}

