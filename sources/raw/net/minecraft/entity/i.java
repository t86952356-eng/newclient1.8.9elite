/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class i {
    private final r ctn;
    private int cto;
    private float ctp;

    public i(r r2) {
        this.ctn = r2;
    }

    public void UA() {
        double d2 = this.ctn.gW - this.ctn.crF;
        double d3 = this.ctn.gY - this.ctn.crH;
        if (d2 * d2 + d3 * d3 > 2.500000277905201E-7) {
            this.ctn.cuF = this.ctn.pn;
            this.ctp = this.ctn.pn = this.u(this.ctn.cuF, this.ctn.pn, 75.0f);
            this.cto = 0;
        } else {
            float f2 = 75.0f;
            if (Math.abs(this.ctn.pn - this.ctp) > 15.0f) {
                this.cto = 0;
                this.ctp = this.ctn.pn;
            } else {
                ++this.cto;
                int n2 = 10;
                if (this.cto > 10) {
                    f2 = Math.max(1.0f - (float)(this.cto - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.ctn.cuF = this.u(this.ctn.pn, this.ctn.cuF, f2);
        }
    }

    private float u(float f2, float f3, float f4) {
        float f5 = bt.bN(f2 - f3);
        if (f5 < -f4) {
            f5 = -f4;
        }
        if (f5 >= f4) {
            f5 = f4;
        }
        return f2 - f5;
    }
}

