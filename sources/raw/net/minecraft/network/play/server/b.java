/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.f;

public class b
implements aj<a> {
    private int crw;
    private boolean dcb;
    private ao bFi;
    private int csP;
    private f chN;
    private int daE;
    private ap dcc;
    private boolean cgJ;

    public b() {
    }

    public b(int n2, ao ao2, boolean bl2, int n3, f f2, int n4, ap ap2, boolean bl3) {
        this.crw = n2;
        this.csP = n3;
        this.chN = f2;
        this.bFi = ao2;
        this.daE = n4;
        this.dcb = bl2;
        this.dcc = ap2;
        this.cgJ = bl3;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.readInt();
        int n2 = ak2.readUnsignedByte();
        this.dcb = (n2 & 8) == 8;
        this.bFi = ao.ii(n2 &= 0xFFFFFFF7);
        this.csP = ak2.readByte();
        this.chN = f.ib(ak2.readUnsignedByte());
        this.daE = ak2.readUnsignedByte();
        this.dcc = ap.gD(ak2.gs(16));
        if (this.dcc == null) {
            this.dcc = ap.dED;
        }
        this.cgJ = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.crw);
        int n2 = this.bFi.awE();
        if (this.dcb) {
            n2 |= 8;
        }
        ak2.writeByte(n2);
        ak2.writeByte(this.csP);
        ak2.writeByte(this.chN.auZ());
        ak2.writeByte(this.daE);
        ak2.eS(this.dcc.awI());
        ak2.writeBoolean(this.cgJ);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.crw;
    }

    public boolean isHardcoreMode() {
        return this.dcb;
    }

    public ao If() {
        return this.bFi;
    }

    public int getDimension() {
        return this.csP;
    }

    public f agm() {
        return this.chN;
    }

    public int getMaxPlayers() {
        return this.daE;
    }

    public ap agn() {
        return this.dcc;
    }

    public boolean isReducedDebugInfo() {
        return this.cgJ;
    }
}

