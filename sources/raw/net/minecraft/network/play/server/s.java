/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.item.w;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class s
implements aj<a> {
    private int dbm;
    private int dcO;
    private int dcP;
    private int dcQ;
    private int cDN;

    public s() {
    }

    public s(w w2) {
        this.dbm = w2.getEntityId();
        this.dcO = bt.aF(w2.gW * 32.0);
        this.dcP = bt.aF(w2.gX * 32.0);
        this.dcQ = bt.aF(w2.gY * 32.0);
        this.cDN = w2.YX();
    }

    @Override
    public void a(ak ak2) {
        this.dbm = ak2.afw();
        this.dcO = ak2.readInt();
        this.dcP = ak2.readInt();
        this.dcQ = ak2.readInt();
        this.cDN = ak2.readShort();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dbm);
        ak2.writeInt(this.dcO);
        ak2.writeInt(this.dcP);
        ak2.writeInt(this.dcQ);
        ak2.writeShort(this.cDN);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.dbm;
    }

    public int wt() {
        return this.dcO;
    }

    public int wu() {
        return this.dcP;
    }

    public int wx() {
        return this.dcQ;
    }

    public int getXPValue() {
        return this.cDN;
    }
}

