/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.block.Block;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.am;
import net.minecraft.world.b;

public class al
implements aj<a> {
    private b ddt;
    private am[] ddu;

    public al() {
    }

    public al(int n2, short[] sArray, net.minecraft.world.chunk.a a2) {
        this.ddt = new b(a2.dIK, a2.dIL);
        this.ddu = new am[n2];
        for (int i2 = 0; i2 < this.ddu.length; ++i2) {
            this.ddu[i2] = new am(this, sArray[i2], a2);
        }
    }

    @Override
    public void a(ak ak2) {
        this.ddt = new b(ak2.readInt(), ak2.readInt());
        this.ddu = new am[ak2.afw()];
        for (int i2 = 0; i2 < this.ddu.length; ++i2) {
            this.ddu[i2] = new am(this, ak2.readShort(), Block.aRW.hS(ak2.afw()));
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.ddt.dBK);
        ak2.writeInt(this.ddt.dBL);
        ak2.gr(this.ddu.length);
        for (am am2 : this.ddu) {
            ak2.writeShort(am2.ahj());
            ak2.gr(Block.aRW.x(am2.yU()));
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public am[] ahi() {
        return this.ddu;
    }
}

