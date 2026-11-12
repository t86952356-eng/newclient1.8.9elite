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

public class h
implements aj<a> {
    private int dck;
    private f chN;
    private ao bFi;
    private ap dcc;

    public h() {
    }

    public h(int n2, f f2, ap ap2, ao ao2) {
        this.dck = n2;
        this.chN = f2;
        this.bFi = ao2;
        this.dcc = ap2;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.dck = ak2.readInt();
        this.chN = f.ib(ak2.readUnsignedByte());
        this.bFi = ao.ii(ak2.readUnsignedByte());
        this.dcc = ap.gD(ak2.gs(16));
        if (this.dcc == null) {
            this.dcc = ap.dED;
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.dck);
        ak2.writeByte(this.chN.auZ());
        ak2.writeByte(this.bFi.awE());
        ak2.eS(this.dcc.awI());
    }

    public int agq() {
        return this.dck;
    }

    public f agm() {
        return this.chN;
    }

    public ao If() {
        return this.bFi;
    }

    public ap agn() {
        return this.dcc;
    }
}

