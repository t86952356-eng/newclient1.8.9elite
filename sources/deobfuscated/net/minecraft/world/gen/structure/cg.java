/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cg
extends cv {
    private static final List<dg> dRY = Lists.newArrayList((Object[])new dg[]{new dg(Items.cRy, 0, 1, 1, 10), new dg(Items.cPm, 0, 1, 3, 3), new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 1, 3, 5), new dg(Items.cQG, 0, 4, 9, 5), new dg(Items.cPT, 0, 1, 3, 15), new dg(Items.cPi, 0, 1, 3, 15), new dg(Items.cPf, 0, 1, 1, 5), new dg(Items.cPp, 0, 1, 1, 5), new dg(Items.cQd, 0, 1, 1, 5), new dg(Items.cQc, 0, 1, 1, 5), new dg(Items.cQe, 0, 1, 1, 5), new dg(Items.cQf, 0, 1, 1, 5), new dg(Items.cQs, 0, 1, 1, 1), new dg(Items.cQE, 0, 1, 1, 1), new dg(Items.cSo, 0, 1, 1, 1), new dg(Items.cSp, 0, 1, 1, 1), new dg(Items.cSq, 0, 1, 1, 1)});
    private boolean dRZ;

    public cg() {
    }

    public cg(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Chest", this.dRZ);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dRZ = n2.eO("Chest");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((cr)y2, list, random, 1, 1);
    }

    public static cg n(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, ao2);
        return cg.e(w2) && y.a(list, w2) == null ? new cg(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 4, 6, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 1, 0);
        this.a(w2, random, w3, cw.dSu, 1, 1, 6);
        this.a(w2, w3, 3, 1, 2, 3, 1, 4, Blocks.cNh.xM(), Blocks.cNh.xM(), false);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcf.yc()), 3, 1, 1, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcf.yc()), 3, 1, 5, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcf.yc()), 3, 2, 2, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcf.yc()), 3, 2, 4, w3);
        for (int i2 = 2; i2 <= 4; ++i2) {
            this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcf.yc()), 2, 1, i2, w3);
        }
        if (!this.dRZ && w3.k(new b(this.bn(3, 3), this.iH(2), this.bo(3, 3)))) {
            this.dRZ = true;
            this.a(w2, w3, random, 3, 2, 3, dg.a(dRY, Items.cSh.f(random)), 2 + random.nextInt(2));
        }
        return true;
    }
}

