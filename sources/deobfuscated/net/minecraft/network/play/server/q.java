/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.List;
import net.minecraft.entity.b;
import net.minecraft.entity.n;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class q
implements aj<a> {
    private int entityID;
    private int entityType;
    private int alM;
    private int alN;
    private int aRr;
    private int dcI;
    private int dcJ;
    private int dcK;
    private byte dcy;
    private byte dcz;
    private byte dcL;
    private net.minecraft.entity.a dcM;
    private List<b> dcN;

    public q() {
    }

    public q(r r2) {
        this.entityID = r2.getEntityId();
        this.entityType = (byte)n.ac(r2);
        this.alM = bt.aF(r2.gW * 32.0);
        this.alN = bt.aF(r2.gX * 32.0);
        this.aRr = bt.aF(r2.gY * 32.0);
        this.dcy = (byte)(r2.pl * 256.0f / 360.0f);
        this.dcz = (byte)(r2.pm * 256.0f / 360.0f);
        this.dcL = (byte)(r2.pn * 256.0f / 360.0f);
        double d2 = 3.9;
        double d3 = r2.ud;
        double d4 = r2.ue;
        double d5 = r2.uf;
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d5 < -3.9) {
            d5 = -3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        if (d5 > 3.9) {
            d5 = 3.9;
        }
        this.dcI = (int)(d3 * 8000.0);
        this.dcJ = (int)(d4 * 8000.0);
        this.dcK = (int)(d5 * 8000.0);
        this.dcM = r2.Tp();
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.entityType = ak2.readByte() & 0xFF;
        this.alM = ak2.readInt();
        this.alN = ak2.readInt();
        this.aRr = ak2.readInt();
        this.dcy = ak2.readByte();
        this.dcz = ak2.readByte();
        this.dcL = ak2.readByte();
        this.dcI = ak2.readShort();
        this.dcJ = ak2.readShort();
        this.dcK = ak2.readShort();
        this.dcN = net.minecraft.entity.a.d(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.writeByte(this.entityType & 0xFF);
        ak2.writeInt(this.alM);
        ak2.writeInt(this.alN);
        ak2.writeInt(this.aRr);
        ak2.writeByte(this.dcy);
        ak2.writeByte(this.dcz);
        ak2.writeByte(this.dcL);
        ak2.writeShort(this.dcI);
        ak2.writeShort(this.dcJ);
        ak2.writeShort(this.dcK);
        this.dcM.c(ak2);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public List<b> agI() {
        if (this.dcN == null) {
            this.dcN = this.dcM.Ti();
        }
        return this.dcN;
    }

    public int getEntityID() {
        return this.entityID;
    }

    public int getEntityType() {
        return this.entityType;
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

    public int agJ() {
        return this.dcI;
    }

    public int agK() {
        return this.dcJ;
    }

    public int agL() {
        return this.dcK;
    }

    public byte agx() {
        return this.dcy;
    }

    public byte agy() {
        return this.dcz;
    }

    public byte agM() {
        return this.dcL;
    }
}

