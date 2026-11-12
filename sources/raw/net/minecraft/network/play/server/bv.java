/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.bw;
import net.minecraft.util.ab;

public class bv
implements aj<a> {
    public bw dfe;
    public int dff;
    public int dfg;
    public int dfh;
    public String dfi;

    public bv() {
    }

    public bv(ab ab2, bw bw2) {
        this.dfe = bw2;
        r r2 = ab2.arQ();
        switch (bw2.ordinal()) {
            case 1: {
                this.dfh = ab2.arS();
                this.dfg = r2 == null ? -1 : r2.getEntityId();
                break;
            }
            case 2: {
                this.dff = ab2.arU().getEntityId();
                this.dfg = r2 == null ? -1 : r2.getEntityId();
                this.dfi = ab2.arP().arq();
            }
        }
    }

    @Override
    public void a(ak ak2) {
        this.dfe = ak2.k(bw.class);
        if (this.dfe == bw.dfk) {
            this.dfh = ak2.afw();
            this.dfg = ak2.readInt();
        } else if (this.dfe == bw.dfl) {
            this.dff = ak2.afw();
            this.dfg = ak2.readInt();
            this.dfi = ak2.gs(Short.MAX_VALUE);
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.dfe);
        if (this.dfe == bw.dfk) {
            ak2.gr(this.dfh);
            ak2.writeInt(this.dfg);
        } else if (this.dfe == bw.dfl) {
            ak2.gr(this.dff);
            ak2.writeInt(this.dfg);
            ak2.eS(this.dfi);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }
}

