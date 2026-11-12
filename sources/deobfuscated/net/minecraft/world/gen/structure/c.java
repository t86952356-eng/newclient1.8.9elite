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
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.d;
import net.minecraft.world.gen.structure.w;

public class c
extends d {
    private final boolean[] dPK = new boolean[4];
    private static final List<dg> dPL = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPm, 0, 1, 3, 3), new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 2, 7, 15), new dg(Items.cRS, 0, 1, 3, 2), new dg(Items.cRb, 0, 4, 6, 20), new dg(Items.cRx, 0, 3, 7, 16), new dg(Items.cQE, 0, 1, 1, 3), new dg(Items.cSo, 0, 1, 1, 1), new dg(Items.cSp, 0, 1, 1, 1), new dg(Items.cSq, 0, 1, 1, 1)});

    public c() {
    }

    public c(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 21, 15, 21);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("hasPlacedChest0", this.dPK[0]);
        n2.o("hasPlacedChest1", this.dPK[1]);
        n2.o("hasPlacedChest2", this.dPK[2]);
        n2.o("hasPlacedChest3", this.dPK[3]);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dPK[0] = n2.eO("hasPlacedChest0");
        this.dPK[1] = n2.eO("hasPlacedChest1");
        this.dPK[2] = n2.eO("hasPlacedChest2");
        this.dPK[3] = n2.eO("hasPlacedChest3");
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        int n5;
        this.a(w2, w3, 0, -4, 0, this.dPM - 1, 0, this.dPO - 1, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        for (n5 = 1; n5 <= 9; ++n5) {
            this.a(w2, w3, n5, n5, n5, this.dPM - 1 - n5, n5, this.dPO - 1 - n5, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
            this.a(w2, w3, n5 + 1, n5, n5 + 1, this.dPM - 2 - n5, n5, this.dPO - 2 - n5, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        for (n5 = 0; n5 < this.dPM; ++n5) {
            for (n4 = 0; n4 < this.dPO; ++n4) {
                n3 = -5;
                this.b(w2, Blocks.cLC.xM(), n5, -5, n4, w3);
            }
        }
        n5 = this.g(Blocks.cNQ, 3);
        n4 = this.g(Blocks.cNQ, 2);
        n3 = this.g(Blocks.cNQ, 0);
        int n6 = this.g(Blocks.cNQ, 1);
        int n7 = ~b.cUD.ado() & 0xF;
        int n8 = ~b.cUN.ado() & 0xF;
        this.a(w2, w3, 0, 0, 0, 4, 9, 4, Blocks.cLC.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 10, 1, 3, 10, 3, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, Blocks.cNQ.aM(n5), 2, 10, 0, w3);
        this.a(w2, Blocks.cNQ.aM(n4), 2, 10, 4, w3);
        this.a(w2, Blocks.cNQ.aM(n3), 0, 10, 2, w3);
        this.a(w2, Blocks.cNQ.aM(n6), 4, 10, 2, w3);
        this.a(w2, w3, this.dPM - 5, 0, 0, this.dPM - 1, 9, 4, Blocks.cLC.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dPM - 4, 10, 1, this.dPM - 2, 10, 3, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, Blocks.cNQ.aM(n5), this.dPM - 3, 10, 0, w3);
        this.a(w2, Blocks.cNQ.aM(n4), this.dPM - 3, 10, 4, w3);
        this.a(w2, Blocks.cNQ.aM(n3), this.dPM - 5, 10, 2, w3);
        this.a(w2, Blocks.cNQ.aM(n6), this.dPM - 1, 10, 2, w3);
        this.a(w2, w3, 8, 0, 0, 12, 4, 4, Blocks.cLC.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 9, 1, 0, 11, 3, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 9, 1, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 9, 2, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 9, 3, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 10, 3, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 11, 3, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 11, 2, 1, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 11, 1, 1, w3);
        this.a(w2, w3, 4, 1, 1, 8, 3, 3, Blocks.cLC.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 4, 1, 2, 8, 2, 2, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 12, 1, 1, 16, 3, 3, Blocks.cLC.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 12, 1, 2, 16, 2, 2, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 5, 4, 5, this.dPM - 6, 4, this.dPO - 6, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, 9, 4, 9, 11, 4, 11, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 8, 1, 8, 8, 3, 8, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 12, 1, 8, 12, 3, 8, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 8, 1, 12, 8, 3, 12, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 12, 1, 12, 12, 3, 12, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 1, 1, 5, 4, 4, 11, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, this.dPM - 5, 1, 5, this.dPM - 2, 4, 11, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, 6, 7, 9, 6, 7, 11, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, this.dPM - 7, 7, 9, this.dPM - 7, 7, 11, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, 5, 5, 9, 5, 7, 11, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, this.dPM - 6, 5, 9, this.dPM - 6, 7, 11, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, Blocks.cLc.xM(), 5, 5, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 5, 6, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 6, 6, 10, w3);
        this.a(w2, Blocks.cLc.xM(), this.dPM - 6, 5, 10, w3);
        this.a(w2, Blocks.cLc.xM(), this.dPM - 6, 6, 10, w3);
        this.a(w2, Blocks.cLc.xM(), this.dPM - 7, 6, 10, w3);
        this.a(w2, w3, 2, 4, 4, 2, 6, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dPM - 3, 4, 4, this.dPM - 3, 6, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cNQ.aM(n5), 2, 4, 5, w3);
        this.a(w2, Blocks.cNQ.aM(n5), 2, 3, 4, w3);
        this.a(w2, Blocks.cNQ.aM(n5), this.dPM - 3, 4, 5, w3);
        this.a(w2, Blocks.cNQ.aM(n5), this.dPM - 3, 3, 4, w3);
        this.a(w2, w3, 1, 1, 3, 2, 2, 3, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, this.dPM - 3, 1, 3, this.dPM - 2, 2, 3, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, Blocks.cNQ.xM(), 1, 1, 2, w3);
        this.a(w2, Blocks.cNQ.xM(), this.dPM - 2, 1, 2, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcb.yc()), 1, 2, 2, w3);
        this.a(w2, Blocks.cLW.aM(BlockStoneSlab$EnumType.bcb.yc()), this.dPM - 2, 2, 2, w3);
        this.a(w2, Blocks.cNQ.aM(n6), 2, 1, 2, w3);
        this.a(w2, Blocks.cNQ.aM(n3), this.dPM - 3, 1, 2, w3);
        this.a(w2, w3, 4, 3, 5, 4, 3, 18, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, this.dPM - 5, 3, 5, this.dPM - 5, 3, 17, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, 3, 1, 5, 4, 2, 16, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dPM - 6, 1, 5, this.dPM - 5, 2, 16, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        for (n2 = 5; n2 <= 17; n2 += 2) {
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 4, 1, n2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 4, 2, n2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), this.dPM - 5, 1, n2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), this.dPM - 5, 2, n2, w3);
        }
        this.a(w2, Blocks.cOw.aM(n7), 10, 0, 7, w3);
        this.a(w2, Blocks.cOw.aM(n7), 10, 0, 8, w3);
        this.a(w2, Blocks.cOw.aM(n7), 9, 0, 9, w3);
        this.a(w2, Blocks.cOw.aM(n7), 11, 0, 9, w3);
        this.a(w2, Blocks.cOw.aM(n7), 8, 0, 10, w3);
        this.a(w2, Blocks.cOw.aM(n7), 12, 0, 10, w3);
        this.a(w2, Blocks.cOw.aM(n7), 7, 0, 10, w3);
        this.a(w2, Blocks.cOw.aM(n7), 13, 0, 10, w3);
        this.a(w2, Blocks.cOw.aM(n7), 9, 0, 11, w3);
        this.a(w2, Blocks.cOw.aM(n7), 11, 0, 11, w3);
        this.a(w2, Blocks.cOw.aM(n7), 10, 0, 12, w3);
        this.a(w2, Blocks.cOw.aM(n7), 10, 0, 13, w3);
        this.a(w2, Blocks.cOw.aM(n8), 10, 0, 10, w3);
        for (n2 = 0; n2 <= this.dPM - 1; n2 += this.dPM - 1) {
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 2, 1, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 2, 2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 2, 3, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 3, 1, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 3, 2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 3, 3, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 4, 1, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), n2, 4, 2, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 4, 3, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 5, 1, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 5, 2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 5, 3, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 6, 1, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), n2, 6, 2, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 6, 3, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 7, 1, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 7, 2, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 7, 3, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 8, 1, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 8, 2, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 8, 3, w3);
        }
        for (n2 = 2; n2 <= this.dPM - 3; n2 += this.dPM - 3 - 2) {
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 - 1, 2, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 2, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 + 1, 2, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 - 1, 3, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 3, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 + 1, 3, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 - 1, 4, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), n2, 4, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 + 1, 4, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 - 1, 5, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 5, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 + 1, 5, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 - 1, 6, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), n2, 6, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 + 1, 6, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 - 1, 7, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2, 7, 0, w3);
            this.a(w2, Blocks.cOw.aM(n7), n2 + 1, 7, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 - 1, 8, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2, 8, 0, w3);
            this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), n2 + 1, 8, 0, w3);
        }
        this.a(w2, w3, 8, 4, 0, 12, 6, 0, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, Blocks.cLc.xM(), 8, 6, 0, w3);
        this.a(w2, Blocks.cLc.xM(), 12, 6, 0, w3);
        this.a(w2, Blocks.cOw.aM(n7), 9, 5, 0, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 10, 5, 0, w3);
        this.a(w2, Blocks.cOw.aM(n7), 11, 5, 0, w3);
        this.a(w2, w3, 8, -14, 8, 12, -11, 12, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 8, -10, 8, 12, -10, 12, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), false);
        this.a(w2, w3, 8, -9, 8, 12, -9, 12, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), false);
        this.a(w2, w3, 8, -8, 8, 12, -1, 12, Blocks.cLC.xM(), Blocks.cLC.xM(), false);
        this.a(w2, w3, 9, -11, 9, 11, -1, 11, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cMB.xM(), 10, -11, 10, w3);
        this.a(w2, w3, 9, -13, 9, 11, -13, 11, Blocks.cLY.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cLc.xM(), 8, -11, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 8, -10, 10, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 7, -10, 10, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 7, -11, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 12, -11, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 12, -10, 10, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 13, -10, 10, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 13, -11, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 10, -11, 8, w3);
        this.a(w2, Blocks.cLc.xM(), 10, -10, 8, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 10, -10, 7, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 10, -11, 7, w3);
        this.a(w2, Blocks.cLc.xM(), 10, -11, 12, w3);
        this.a(w2, Blocks.cLc.xM(), 10, -10, 12, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.bam.yc()), 10, -10, 13, w3);
        this.a(w2, Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc()), 10, -11, 13, w3);
        for (ao ao2 : ar.dwT) {
            if (this.dPK[ao2.asA()]) continue;
            int n9 = ao2.asH() * 2;
            int n10 = ao2.asJ() * 2;
            this.dPK[ao2.asA()] = this.a(w2, w3, random, 10 + n9, -11, 10 + n10, dg.a(dPL, Items.cSh.f(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

