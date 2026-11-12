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
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.d;
import net.minecraft.world.gen.structure.f;
import net.minecraft.world.gen.structure.w;

public class e
extends d {
    private boolean dPQ;
    private boolean dPR;
    private boolean dPS;
    private boolean dPT;
    private static final List<dg> dPU = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPm, 0, 1, 3, 3), new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 2, 7, 15), new dg(Items.cRS, 0, 1, 3, 2), new dg(Items.cRb, 0, 4, 6, 20), new dg(Items.cRx, 0, 3, 7, 16), new dg(Items.cQE, 0, 1, 1, 3), new dg(Items.cSo, 0, 1, 1, 1), new dg(Items.cSp, 0, 1, 1, 1), new dg(Items.cSq, 0, 1, 1, 1)});
    private static final List<dg> dPV = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPk, 0, 2, 7, 30)});
    private static final f dPW = new f();

    public e() {
    }

    public e(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 12, 10, 15);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("placedMainChest", this.dPQ);
        n2.o("placedHiddenChest", this.dPR);
        n2.o("placedTrap1", this.dPS);
        n2.o("placedTrap2", this.dPT);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dPQ = n2.eO("placedMainChest");
        this.dPR = n2.eO("placedHiddenChest");
        this.dPS = n2.eO("placedTrap1");
        this.dPT = n2.eO("placedTrap2");
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (!this.a(w2, w3, 0)) {
            return false;
        }
        int n3 = this.g(Blocks.cMy, 3);
        int n4 = this.g(Blocks.cMy, 2);
        int n5 = this.g(Blocks.cMy, 0);
        int n6 = this.g(Blocks.cMy, 1);
        this.a(w2, w3, 0, -4, 0, this.dPM - 1, 0, this.dPO - 1, false, random, dPW);
        this.a(w2, w3, 2, 1, 2, 9, 2, 2, false, random, dPW);
        this.a(w2, w3, 2, 1, 12, 9, 2, 12, false, random, dPW);
        this.a(w2, w3, 2, 1, 3, 2, 2, 11, false, random, dPW);
        this.a(w2, w3, 9, 1, 3, 9, 2, 11, false, random, dPW);
        this.a(w2, w3, 1, 3, 1, 10, 6, 1, false, random, dPW);
        this.a(w2, w3, 1, 3, 13, 10, 6, 13, false, random, dPW);
        this.a(w2, w3, 1, 3, 2, 1, 6, 12, false, random, dPW);
        this.a(w2, w3, 10, 3, 2, 10, 6, 12, false, random, dPW);
        this.a(w2, w3, 2, 3, 2, 9, 3, 12, false, random, dPW);
        this.a(w2, w3, 2, 6, 2, 9, 6, 12, false, random, dPW);
        this.a(w2, w3, 3, 7, 3, 8, 7, 11, false, random, dPW);
        this.a(w2, w3, 4, 8, 4, 7, 8, 10, false, random, dPW);
        this.a(w2, w3, 3, 1, 3, 8, 2, 11);
        this.a(w2, w3, 4, 3, 6, 7, 3, 9);
        this.a(w2, w3, 2, 4, 2, 9, 5, 12);
        this.a(w2, w3, 4, 6, 5, 7, 6, 9);
        this.a(w2, w3, 5, 7, 6, 6, 7, 8);
        this.a(w2, w3, 5, 1, 2, 6, 2, 2);
        this.a(w2, w3, 5, 2, 12, 6, 2, 12);
        this.a(w2, w3, 5, 5, 1, 6, 5, 1);
        this.a(w2, w3, 5, 5, 13, 6, 5, 13);
        this.a(w2, Blocks.cLc.xM(), 1, 5, 5, w3);
        this.a(w2, Blocks.cLc.xM(), 10, 5, 5, w3);
        this.a(w2, Blocks.cLc.xM(), 1, 5, 9, w3);
        this.a(w2, Blocks.cLc.xM(), 10, 5, 9, w3);
        for (n2 = 0; n2 <= 14; n2 += 14) {
            this.a(w2, w3, 2, 4, n2, 2, 5, n2, false, random, dPW);
            this.a(w2, w3, 4, 4, n2, 4, 5, n2, false, random, dPW);
            this.a(w2, w3, 7, 4, n2, 7, 5, n2, false, random, dPW);
            this.a(w2, w3, 9, 4, n2, 9, 5, n2, false, random, dPW);
        }
        this.a(w2, w3, 5, 6, 0, 6, 6, 0, false, random, dPW);
        for (n2 = 0; n2 <= 11; n2 += 11) {
            for (int i2 = 2; i2 <= 12; i2 += 2) {
                this.a(w2, w3, n2, 4, i2, n2, 5, i2, false, random, dPW);
            }
            this.a(w2, w3, n2, 6, 5, n2, 6, 5, false, random, dPW);
            this.a(w2, w3, n2, 6, 9, n2, 6, 9, false, random, dPW);
        }
        this.a(w2, w3, 2, 7, 2, 2, 9, 2, false, random, dPW);
        this.a(w2, w3, 9, 7, 2, 9, 9, 2, false, random, dPW);
        this.a(w2, w3, 2, 7, 12, 2, 9, 12, false, random, dPW);
        this.a(w2, w3, 9, 7, 12, 9, 9, 12, false, random, dPW);
        this.a(w2, w3, 4, 9, 4, 4, 9, 4, false, random, dPW);
        this.a(w2, w3, 7, 9, 4, 7, 9, 4, false, random, dPW);
        this.a(w2, w3, 4, 9, 10, 4, 9, 10, false, random, dPW);
        this.a(w2, w3, 7, 9, 10, 7, 9, 10, false, random, dPW);
        this.a(w2, w3, 5, 9, 7, 6, 9, 7, false, random, dPW);
        this.a(w2, Blocks.cMy.aM(n3), 5, 9, 6, w3);
        this.a(w2, Blocks.cMy.aM(n3), 6, 9, 6, w3);
        this.a(w2, Blocks.cMy.aM(n4), 5, 9, 8, w3);
        this.a(w2, Blocks.cMy.aM(n4), 6, 9, 8, w3);
        this.a(w2, Blocks.cMy.aM(n3), 4, 0, 0, w3);
        this.a(w2, Blocks.cMy.aM(n3), 5, 0, 0, w3);
        this.a(w2, Blocks.cMy.aM(n3), 6, 0, 0, w3);
        this.a(w2, Blocks.cMy.aM(n3), 7, 0, 0, w3);
        this.a(w2, Blocks.cMy.aM(n3), 4, 1, 8, w3);
        this.a(w2, Blocks.cMy.aM(n3), 4, 2, 9, w3);
        this.a(w2, Blocks.cMy.aM(n3), 4, 3, 10, w3);
        this.a(w2, Blocks.cMy.aM(n3), 7, 1, 8, w3);
        this.a(w2, Blocks.cMy.aM(n3), 7, 2, 9, w3);
        this.a(w2, Blocks.cMy.aM(n3), 7, 3, 10, w3);
        this.a(w2, w3, 4, 1, 9, 4, 1, 9, false, random, dPW);
        this.a(w2, w3, 7, 1, 9, 7, 1, 9, false, random, dPW);
        this.a(w2, w3, 4, 1, 10, 7, 2, 10, false, random, dPW);
        this.a(w2, w3, 5, 4, 5, 6, 4, 5, false, random, dPW);
        this.a(w2, Blocks.cMy.aM(n5), 4, 4, 5, w3);
        this.a(w2, Blocks.cMy.aM(n6), 7, 4, 5, w3);
        for (n2 = 0; n2 < 4; ++n2) {
            this.a(w2, Blocks.cMy.aM(n4), 5, 0 - n2, 6 + n2, w3);
            this.a(w2, Blocks.cMy.aM(n4), 6, 0 - n2, 6 + n2, w3);
            this.a(w2, w3, 5, 0 - n2, 7 + n2, 6, 0 - n2, 9 + n2);
        }
        this.a(w2, w3, 1, -3, 12, 10, -1, 13);
        this.a(w2, w3, 1, -3, 1, 3, -1, 13);
        this.a(w2, w3, 1, -3, 1, 9, -1, 5);
        for (n2 = 1; n2 <= 13; n2 += 2) {
            this.a(w2, w3, 1, -3, n2, 1, -2, n2, false, random, dPW);
        }
        for (n2 = 2; n2 <= 12; n2 += 2) {
            this.a(w2, w3, 1, -1, n2, 3, -1, n2, false, random, dPW);
        }
        this.a(w2, w3, 2, -2, 1, 5, -2, 1, false, random, dPW);
        this.a(w2, w3, 7, -2, 1, 9, -2, 1, false, random, dPW);
        this.a(w2, w3, 6, -3, 1, 6, -3, 1, false, random, dPW);
        this.a(w2, w3, 6, -1, 1, 6, -1, 1, false, random, dPW);
        this.a(w2, Blocks.cNT.aM(this.g(Blocks.cNT, ao.dwv.asA())).a(BlockTripWireHook.bcZ, true), 1, -3, 8, w3);
        this.a(w2, Blocks.cNT.aM(this.g(Blocks.cNT, ao.dwu.asA())).a(BlockTripWireHook.bcZ, true), 4, -3, 8, w3);
        this.a(w2, Blocks.cNU.xM().a(BlockTripWire.bcR, true), 2, -3, 8, w3);
        this.a(w2, Blocks.cNU.xM().a(BlockTripWire.bcR, true), 3, -3, 8, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 7, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 6, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 5, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 4, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 3, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 2, w3);
        this.a(w2, Blocks.cMh.xM(), 5, -3, 1, w3);
        this.a(w2, Blocks.cMh.xM(), 4, -3, 1, w3);
        this.a(w2, Blocks.cMa.xM(), 3, -3, 1, w3);
        if (!this.dPS) {
            this.dPS = this.a(w2, w3, random, 3, -2, 1, ao.dws.OY(), dPV, 2);
        }
        this.a(w2, Blocks.cNp.aM(15), 3, -2, 2, w3);
        this.a(w2, Blocks.cNT.aM(this.g(Blocks.cNT, ao.dws.asA())).a(BlockTripWireHook.bcZ, true), 7, -3, 1, w3);
        this.a(w2, Blocks.cNT.aM(this.g(Blocks.cNT, ao.dwt.asA())).a(BlockTripWireHook.bcZ, true), 7, -3, 5, w3);
        this.a(w2, Blocks.cNU.xM().a(BlockTripWire.bcR, true), 7, -3, 2, w3);
        this.a(w2, Blocks.cNU.xM().a(BlockTripWire.bcR, true), 7, -3, 3, w3);
        this.a(w2, Blocks.cNU.xM().a(BlockTripWire.bcR, true), 7, -3, 4, w3);
        this.a(w2, Blocks.cMh.xM(), 8, -3, 6, w3);
        this.a(w2, Blocks.cMh.xM(), 9, -3, 6, w3);
        this.a(w2, Blocks.cMh.xM(), 9, -3, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 9, -3, 4, w3);
        this.a(w2, Blocks.cMh.xM(), 9, -2, 4, w3);
        if (!this.dPT) {
            this.dPT = this.a(w2, w3, random, 9, -2, 3, ao.dwu.OY(), dPV, 2);
        }
        this.a(w2, Blocks.cNp.aM(15), 8, -1, 3, w3);
        this.a(w2, Blocks.cNp.aM(15), 8, -2, 3, w3);
        if (!this.dPQ) {
            this.dPQ = this.a(w2, w3, random, 8, -3, 3, dg.a(dPU, Items.cSh.f(random)), 2 + random.nextInt(5));
        }
        this.a(w2, Blocks.cMa.xM(), 9, -3, 2, w3);
        this.a(w2, Blocks.cMa.xM(), 8, -3, 1, w3);
        this.a(w2, Blocks.cMa.xM(), 4, -3, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 5, -2, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 5, -1, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 6, -3, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 7, -2, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 7, -1, 5, w3);
        this.a(w2, Blocks.cMa.xM(), 8, -3, 5, w3);
        this.a(w2, w3, 9, -1, 1, 9, -1, 5, false, random, dPW);
        this.a(w2, w3, 8, -3, 8, 10, -1, 10);
        this.a(w2, Blocks.cNh.aM(BlockStoneBrick.bbO), 8, -2, 11, w3);
        this.a(w2, Blocks.cNh.aM(BlockStoneBrick.bbO), 9, -2, 11, w3);
        this.a(w2, Blocks.cNh.aM(BlockStoneBrick.bbO), 10, -2, 11, w3);
        this.a(w2, Blocks.cMA.aM(BlockLever.c(ao.hy(this.g(Blocks.cMA, ao.dws.OY())))), 8, -2, 12, w3);
        this.a(w2, Blocks.cMA.aM(BlockLever.c(ao.hy(this.g(Blocks.cMA, ao.dws.OY())))), 9, -2, 12, w3);
        this.a(w2, Blocks.cMA.aM(BlockLever.c(ao.hy(this.g(Blocks.cMA, ao.dws.OY())))), 10, -2, 12, w3);
        this.a(w2, w3, 8, -3, 8, 8, -3, 10, false, random, dPW);
        this.a(w2, w3, 10, -3, 8, 10, -3, 10, false, random, dPW);
        this.a(w2, Blocks.cMa.xM(), 10, -2, 9, w3);
        this.a(w2, Blocks.cMh.xM(), 8, -2, 9, w3);
        this.a(w2, Blocks.cMh.xM(), 8, -2, 10, w3);
        this.a(w2, Blocks.cMh.xM(), 10, -1, 9, w3);
        this.a(w2, Blocks.cLH.aM(ao.dwr.OY()), 9, -2, 8, w3);
        this.a(w2, Blocks.cLH.aM(this.g(Blocks.cLH, ao.dwu.OY())), 10, -2, 8, w3);
        this.a(w2, Blocks.cLH.aM(this.g(Blocks.cLH, ao.dwu.OY())), 10, -1, 8, w3);
        this.a(w2, Blocks.cNd.aM(this.g(Blocks.cNd, ao.dws.asA())), 10, -2, 10, w3);
        if (!this.dPR) {
            this.dPR = this.a(w2, w3, random, 9, -3, 10, dg.a(dPU, Items.cSh.f(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

