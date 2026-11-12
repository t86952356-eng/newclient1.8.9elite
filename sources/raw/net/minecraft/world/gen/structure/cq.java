/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.ci;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cq
extends cv {
    private boolean dSn;

    public cq() {
    }

    public cq(int n2, Random random, int n3, int n4) {
        super(n2);
        this.dSn = true;
        this.dQJ = ar.dwT.g(random);
        this.dSt = cw.dSu;
        switch (this.dQJ) {
            case dwt: 
            case dws: {
                this.dQI = new w(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
                break;
            }
            default: {
                this.dQI = new w(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
            }
        }
    }

    public cq(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dSn = false;
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Source", this.dSn);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSn = n2.eO("Source");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        if (this.dSn) {
            cc.dRV = ci.class;
        }
        this.a((cr)y2, list, random, 1, 1);
    }

    public static cq u(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, ao2);
        return cq.e(w2) && y.a(list, w2) == null ? new cq(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 10, 4, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 7, 0);
        this.a(w2, random, w3, cw.dSu, 1, 1, 4);
        this.a(w2, Blocks.cNh.xM(), 2, 6, 1, w3);
        this.a(w2, Blocks.cNh.xM(), 1, 5, 1, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 1, 6, 1, w3);
        this.a(w2, Blocks.cNh.xM(), 1, 5, 2, w3);
        this.a(w2, Blocks.cNh.xM(), 1, 4, 3, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 1, 5, 3, w3);
        this.a(w2, Blocks.cNh.xM(), 2, 4, 3, w3);
        this.a(w2, Blocks.cNh.xM(), 3, 3, 3, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 3, 4, 3, w3);
        this.a(w2, Blocks.cNh.xM(), 3, 3, 2, w3);
        this.a(w2, Blocks.cNh.xM(), 3, 2, 1, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 3, 3, 1, w3);
        this.a(w2, Blocks.cNh.xM(), 2, 2, 1, w3);
        this.a(w2, Blocks.cNh.xM(), 1, 1, 1, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 1, 2, 1, w3);
        this.a(w2, Blocks.cNh.xM(), 1, 1, 2, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bca.yc()), 1, 1, 3, w3);
        return true;
    }
}

