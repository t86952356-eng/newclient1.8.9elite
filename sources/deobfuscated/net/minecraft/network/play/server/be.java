/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.Collection;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.dc;
import net.minecraft.world.storage.f;

public class be
implements aj<a> {
    private int mapId;
    private byte dem;
    private dc[] den;
    private int deo;
    private int dep;
    private int deq;
    private int der;
    private byte[] des;

    public be() {
    }

    public be(int n2, byte by2, Collection<dc> collection, byte[] byArray, int n3, int n4, int n5, int n6) {
        this.mapId = n2;
        this.dem = by2;
        this.den = collection.toArray(new dc[0]);
        this.deo = n3;
        this.dep = n4;
        this.deq = n5;
        this.der = n6;
        this.des = new byte[n5 * n6];
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                this.des[i2 + i3 * n5] = byArray[n3 + i2 + (n4 + i3) * 128];
            }
        }
    }

    @Override
    public void a(ak ak2) {
        this.mapId = ak2.afw();
        this.dem = ak2.readByte();
        this.den = new dc[ak2.afw()];
        for (int i2 = 0; i2 < this.den.length; ++i2) {
            short s2 = ak2.readByte();
            this.den[i2] = new dc((byte)(s2 >> 4 & 0xF), ak2.readByte(), ak2.readByte(), (byte)(s2 & 0xF));
        }
        this.deq = ak2.readUnsignedByte();
        if (this.deq > 0) {
            this.der = ak2.readUnsignedByte();
            this.deo = ak2.readUnsignedByte();
            this.dep = ak2.readUnsignedByte();
            this.des = ak2.aft();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.mapId);
        ak2.writeByte(this.dem);
        ak2.gr(this.den.length);
        for (dc dc2 : this.den) {
            ak2.writeByte((dc2.atT() & 0xF) << 4 | dc2.atW() & 0xF);
            ak2.writeByte(dc2.atU());
            ak2.writeByte(dc2.atV());
        }
        ak2.writeByte(this.deq);
        if (this.deq > 0) {
            ak2.writeByte(this.der);
            ak2.writeByte(this.deo);
            ak2.writeByte(this.dep);
            ak2.k(this.des);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getMapId() {
        return this.mapId;
    }

    public void c(f f2) {
        int n2;
        f2.dTk = this.dem;
        f2.dTo.clear();
        for (n2 = 0; n2 < this.den.length; ++n2) {
            dc dc2 = this.den[n2];
            f2.dTo.put("icon-" + n2, dc2);
        }
        for (n2 = 0; n2 < this.deq; ++n2) {
            for (int i2 = 0; i2 < this.der; ++i2) {
                f2.dTl[this.deo + n2 + (this.dep + i2) * 128] = this.des[n2 + i2 * this.deq];
            }
        }
    }
}

