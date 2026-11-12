/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.List;
import java.util.UUID;
import net.minecraft.entity.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;

public class n
implements aj<a> {
    private int crw;
    private UUID dcx;
    private int alM;
    private int alN;
    private int aRr;
    private byte dcy;
    private byte dcz;
    private int cJE;
    private net.minecraft.entity.a dcA;
    private List<b> dcB;

    public n() {
    }

    public n(net.minecraft.entity.player.a a2) {
        this.crw = a2.getEntityId();
        this.dcx = a2.Ie().getId();
        this.alM = bt.aF(a2.gW * 32.0);
        this.alN = bt.aF(a2.gX * 32.0);
        this.aRr = bt.aF(a2.gY * 32.0);
        this.dcy = (byte)(a2.pl * 256.0f / 360.0f);
        this.dcz = (byte)(a2.pm * 256.0f / 360.0f);
        co co2 = a2.cHV.acE();
        this.cJE = co2 == null ? 0 : d.p(co2.bP());
        this.dcA = a2.Tp();
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.dcx = ak2.afy();
        this.alM = ak2.readInt();
        this.alN = ak2.readInt();
        this.aRr = ak2.readInt();
        this.dcy = ak2.readByte();
        this.dcz = ak2.readByte();
        this.cJE = ak2.readShort();
        this.dcB = net.minecraft.entity.a.d(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.i(this.dcx);
        ak2.writeInt(this.alM);
        ak2.writeInt(this.alN);
        ak2.writeInt(this.aRr);
        ak2.writeByte(this.dcy);
        ak2.writeByte(this.dcz);
        ak2.writeShort(this.cJE);
        if (this.dcA != null) {
            this.dcA.c(ak2);
        } else {
            net.minecraft.entity.a.a(this.dcB, ak2);
        }
    }

    @Override
    public void a(a a2) {
        a2.b(this);
    }

    public List<b> agv() {
        if (this.dcB == null && this.dcA != null) {
            this.dcB = this.dcA.Ti();
        }
        return this.dcB;
    }

    public int getEntityID() {
        return this.crw;
    }

    public UUID agw() {
        return this.dcx;
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

    public byte agx() {
        return this.dcy;
    }

    public byte agy() {
        return this.dcz;
    }

    public int agz() {
        return this.cJE;
    }
}

