/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class p
implements aj<a> {
    private int entityID;
    private int alM;
    private int alN;
    private int aRr;
    private int dcD;
    private int dcE;
    private int dcF;
    private int dcG;
    private int Ek;
    private int bif;
    private int dcH;

    public p() {
    }

    public p(c c2, int n2) {
        this(c2, n2, 0);
    }

    public p(c c2, int n2, int n3) {
        this.entityID = c2.getEntityId();
        this.alM = bt.aF(c2.gW * 32.0);
        this.alN = bt.aF(c2.gX * 32.0);
        this.aRr = bt.aF(c2.gY * 32.0);
        this.dcG = bt.bL(c2.pm * 256.0f / 360.0f);
        this.Ek = bt.bL(c2.pl * 256.0f / 360.0f);
        this.bif = n2;
        this.dcH = n3;
        if (n3 > 0) {
            double d2 = c2.ud;
            double d3 = c2.ue;
            double d4 = c2.uf;
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
            this.dcD = (int)(d2 * 8000.0);
            this.dcE = (int)(d3 * 8000.0);
            this.dcF = (int)(d4 * 8000.0);
        }
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.bif = ak2.readByte();
        this.alM = ak2.readInt();
        this.alN = ak2.readInt();
        this.aRr = ak2.readInt();
        this.dcG = ak2.readByte();
        this.Ek = ak2.readByte();
        this.dcH = ak2.readInt();
        if (this.dcH > 0) {
            this.dcD = ak2.readShort();
            this.dcE = ak2.readShort();
            this.dcF = ak2.readShort();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.writeByte(this.bif);
        ak2.writeInt(this.alM);
        ak2.writeInt(this.alN);
        ak2.writeInt(this.aRr);
        ak2.writeByte(this.dcG);
        ak2.writeByte(this.Ek);
        ak2.writeInt(this.dcH);
        if (this.dcH > 0) {
            ak2.writeShort(this.dcD);
            ak2.writeShort(this.dcE);
            ak2.writeShort(this.dcF);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public int wt() {
        return this.alM;
    }

    public int wu() {
        return this.alN;
    }

    public int wx() {
        return this.aRr;
    }

    public int agB() {
        return this.dcD;
    }

    public int agC() {
        return this.dcE;
    }

    public int agD() {
        return this.dcF;
    }

    public int agE() {
        return this.dcG;
    }

    public int agF() {
        return this.Ek;
    }

    public int agG() {
        return this.bif;
    }

    public int agH() {
        return this.dcH;
    }

    public void aG(int n2) {
        this.alM = n2;
    }

    public void aH(int n2) {
        this.alN = n2;
    }

    public void aI(int n2) {
        this.aRr = n2;
    }

    public void gw(int n2) {
        this.dcD = n2;
    }

    public void gx(int n2) {
        this.dcE = n2;
    }

    public void gy(int n2) {
        this.dcF = n2;
    }

    public void gz(int n2) {
        this.dcH = n2;
    }
}

