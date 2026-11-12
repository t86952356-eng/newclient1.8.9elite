/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class t
implements aj<a> {
    private int entityID;
    public int dcR;
    public int dcS;
    public int dcT;

    public t() {
    }

    public t(c c2) {
        this(c2.getEntityId(), c2.ud, c2.ue, c2.uf);
    }

    public t(int n2, double d2, double d3, double d4) {
        this.entityID = n2;
        double d5 = 3.9;
        if (d2 < -3.9) {
            d2 = -3.9;
        }
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d2 > 3.9) {
            d2 = 3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        this.dcR = (int)(d2 * 8000.0);
        this.dcS = (int)(d3 * 8000.0);
        this.dcT = (int)(d4 * 8000.0);
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.dcR = ak2.readShort();
        this.dcS = ak2.readShort();
        this.dcT = ak2.readShort();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.writeShort(this.dcR);
        ak2.writeShort(this.dcS);
        ak2.writeShort(this.dcT);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public int agN() {
        return this.dcR;
    }

    public int agO() {
        return this.dcS;
    }

    public int agP() {
        return this.dcT;
    }
}

