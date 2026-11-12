/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
import net.minecraft.block.BlockWall$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.b;
import net.minecraft.item.crafting.d;
import net.minecraft.item.crafting.e;
import net.minecraft.item.crafting.f;
import net.minecraft.item.crafting.g;
import net.minecraft.item.crafting.h;
import net.minecraft.item.crafting.i;
import net.minecraft.item.crafting.j;
import net.minecraft.item.crafting.m;
import net.minecraft.item.crafting.n;
import net.minecraft.item.crafting.o;
import net.minecraft.item.crafting.p;
import net.minecraft.item.crafting.q;
import net.minecraft.item.crafting.r;
import net.minecraft.item.crafting.s;
import net.minecraft.item.crafting.t;
import net.minecraft.item.crafting.u;
import net.minecraft.item.crafting.v;
import net.minecraft.world.w;

public class a {
    private static final a cXq = new a();
    private final List<d> cXr = Lists.newArrayList();

    public static a aey() {
        return cXq;
    }

    private a() {
        new s().a(this);
        new t().a(this);
        new p().a(this);
        new o().a(this);
        new m().a(this);
        new h().a(this);
        new n().a(this);
        this.cXr.add(new i());
        this.cXr.add(new e());
        this.cXr.add(new q());
        this.cXr.add(new r());
        this.cXr.add(new f());
        this.cXr.add(new g());
        new j().a(this);
        this.a(new co(Items.cQO, 3), "###", Character.valueOf('#'), Items.cQN);
        this.b(new co(Items.cQP, 1), Items.cQO, Items.cQO, Items.cQO, Items.cQJ);
        this.b(new co(Items.cRQ, 1), Items.cQP, new co(Items.cRa, 1, net.minecraft.item.b.cUR.ado()), Items.cPK);
        this.a(new co(Blocks.cMQ, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Blocks.cMS, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Blocks.cMR, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Blocks.cMT, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Blocks.cMV, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXN.yc() - 4));
        this.a(new co(Blocks.cMU, 3), "W#W", "W#W", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXO.yc() - 4));
        this.a(new co(Blocks.cOb, 6, BlockWall$EnumType.bdp.yc()), "###", "###", Character.valueOf('#'), Blocks.cLg);
        this.a(new co(Blocks.cOb, 6, BlockWall$EnumType.bdq.yc()), "###", "###", Character.valueOf('#'), Blocks.cMa);
        this.a(new co(Blocks.cNB, 6), "###", "###", Character.valueOf('#'), Blocks.cNA);
        this.a(new co(Blocks.cNq, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Blocks.cNs, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Blocks.cNr, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Blocks.cNt, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Blocks.cNv, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXN.yc() - 4));
        this.a(new co(Blocks.cNu, 1), "#W#", "#W#", Character.valueOf('#'), Items.cPC, Character.valueOf('W'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXO.yc() - 4));
        this.a(new co(Blocks.cMP, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.cLh, Character.valueOf('X'), Items.cPm);
        this.a(new co(Items.cSr, 2), "~~ ", "~O ", "  ~", Character.valueOf('~'), Items.cPJ, Character.valueOf('O'), Items.cQQ);
        this.a(new co(Blocks.cLD, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.cLh, Character.valueOf('X'), Items.cQG);
        this.a(new co(Blocks.cLZ, 1), "###", "XXX", "###", Character.valueOf('#'), Blocks.cLh, Character.valueOf('X'), Items.cQP);
        this.a(new co(Blocks.cML, 1), "##", "##", Character.valueOf('#'), Items.cQH);
        this.a(new co(Blocks.cMJ, 6), "###", Character.valueOf('#'), Blocks.cML);
        this.a(new co(Blocks.cMN, 1), "##", "##", Character.valueOf('#'), Items.cQM);
        this.a(new co(Blocks.cLX, 1), "##", "##", Character.valueOf('#'), Items.cQL);
        this.a(new co(Blocks.cMZ, 1), "##", "##", Character.valueOf('#'), Items.cQX);
        this.a(new co(Blocks.cOs, 1), "##", "##", Character.valueOf('#'), Items.cSk);
        this.a(new co(Blocks.cLN, 1), "##", "##", Character.valueOf('#'), Items.cPJ);
        this.a(new co(Blocks.cLY, 1), "X#X", "#X#", "X#X", Character.valueOf('X'), Items.cPL, Character.valueOf('#'), Blocks.cLo);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bcd.yc()), "###", Character.valueOf('#'), Blocks.cLg);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bca.yc()), "###", Character.valueOf('#'), new co(Blocks.cLd, BlockStone$EnumType.bbx.yc()));
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bcb.yc()), "###", Character.valueOf('#'), Blocks.cLC);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bce.yc()), "###", Character.valueOf('#'), Blocks.cLX);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bcf.yc()), "###", Character.valueOf('#'), Blocks.cNh);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bcg.yc()), "###", Character.valueOf('#'), Blocks.cNA);
        this.a(new co(Blocks.cLW, 6, BlockStoneSlab$EnumType.bch.yc()), "###", Character.valueOf('#'), Blocks.cOs);
        this.a(new co(Blocks.cOR, 6, BlockStoneSlabNew$EnumType.bcq.yc()), "###", Character.valueOf('#'), Blocks.cOO);
        this.a(new co(Blocks.cNO, 6, 0), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Blocks.cNO, 6, BlockPlanks$EnumType.aXL.yc()), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Blocks.cNO, 6, BlockPlanks$EnumType.aXK.yc()), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Blocks.cNO, 6, BlockPlanks$EnumType.aXM.yc()), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Blocks.cNO, 6, 4 + BlockPlanks$EnumType.aXN.yc() - 4), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXN.yc() - 4));
        this.a(new co(Blocks.cNO, 6, 4 + BlockPlanks$EnumType.aXO.yc() - 4), "###", Character.valueOf('#'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXO.yc() - 4));
        this.a(new co(Blocks.cMw, 3), "# #", "###", "# #", Character.valueOf('#'), Items.cPC);
        this.a(new co(Items.cQu, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Items.cQv, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Items.cQw, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Items.cQx, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Items.cQy, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXN.yc()));
        this.a(new co(Items.cQz, 3), "##", "##", "##", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXO.yc()));
        this.a(new co(Blocks.cNf, 2), "###", "###", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Items.cQF, 3), "##", "##", "##", Character.valueOf('#'), Items.cPn);
        this.a(new co(Blocks.cOy, 1), "##", "##", Character.valueOf('#'), Items.cPn);
        this.a(new co(Items.cQt, 3), "###", "###", " X ", Character.valueOf('#'), Blocks.cLh, Character.valueOf('X'), Items.cPC);
        this.a(new co(Items.cRd, 1), "AAA", "BEB", "CCC", Character.valueOf('A'), Items.cQK, Character.valueOf('B'), Items.cRc, Character.valueOf('C'), Items.cPS, Character.valueOf('E'), Items.cQT);
        this.a(new co(Items.cRc, 1), "#", Character.valueOf('#'), Items.cQN);
        this.a(new co(Blocks.cLh, 4, BlockPlanks$EnumType.aXJ.yc()), "#", Character.valueOf('#'), new co(Blocks.cLt, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Blocks.cLh, 4, BlockPlanks$EnumType.aXK.yc()), "#", Character.valueOf('#'), new co(Blocks.cLt, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Blocks.cLh, 4, BlockPlanks$EnumType.aXL.yc()), "#", Character.valueOf('#'), new co(Blocks.cLt, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Blocks.cLh, 4, BlockPlanks$EnumType.aXM.yc()), "#", Character.valueOf('#'), new co(Blocks.cLt, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Blocks.cLh, 4, 4 + BlockPlanks$EnumType.aXN.yc() - 4), "#", Character.valueOf('#'), new co(Blocks.cLu, 1, BlockPlanks$EnumType.aXN.yc() - 4));
        this.a(new co(Blocks.cLh, 4, 4 + BlockPlanks$EnumType.aXO.yc() - 4), "#", Character.valueOf('#'), new co(Blocks.cLu, 1, BlockPlanks$EnumType.aXO.yc() - 4));
        this.a(new co(Items.cPC, 4), "#", "#", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Blocks.cMc, 4), "X", "#", Character.valueOf('X'), Items.cPl, Character.valueOf('#'), Items.cPC);
        this.a(new co(Blocks.cMc, 4), "X", "#", Character.valueOf('X'), new co(Items.cPl, 1, 1), Character.valueOf('#'), Items.cPC);
        this.a(new co(Items.cPD, 4), "# #", " # ", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Items.cRE, 3), "# #", " # ", Character.valueOf('#'), Blocks.cLy);
        this.a(new co(Blocks.cMx, 16), "X X", "X#X", "X X", Character.valueOf('X'), Items.cPn, Character.valueOf('#'), Items.cPC);
        this.a(new co(Blocks.cLF, 6), "X X", "X#X", "XRX", Character.valueOf('X'), Items.cPo, Character.valueOf('R'), Items.cQG, Character.valueOf('#'), Items.cPC);
        this.a(new co(Blocks.cOu, 6), "XSX", "X#X", "XSX", Character.valueOf('X'), Items.cPn, Character.valueOf('#'), Blocks.cMH, Character.valueOf('S'), Items.cPC);
        this.a(new co(Blocks.cLG, 6), "X X", "X#X", "XRX", Character.valueOf('X'), Items.cPn, Character.valueOf('R'), Items.cQG, Character.valueOf('#'), Blocks.cMB);
        this.a(new co(Items.cQD, 1), "# #", "###", Character.valueOf('#'), Items.cPn);
        this.a(new co(Items.cRK, 1), "# #", "# #", "###", Character.valueOf('#'), Items.cPn);
        this.a(new co(Items.cRJ, 1), " B ", "###", Character.valueOf('#'), Blocks.cLg, Character.valueOf('B'), Items.cRz);
        this.a(new co(Blocks.cNb, 1), "A", "B", Character.valueOf('A'), Blocks.cMW, Character.valueOf('B'), Blocks.cMc);
        this.a(new co(Items.cQR, 1), "A", "B", Character.valueOf('A'), Blocks.cMg, Character.valueOf('B'), Items.cQD);
        this.a(new co(Items.cQS, 1), "A", "B", Character.valueOf('A'), Blocks.cMn, Character.valueOf('B'), Items.cQD);
        this.a(new co(Items.cSl, 1), "A", "B", Character.valueOf('A'), Blocks.cLY, Character.valueOf('B'), Items.cQD);
        this.a(new co(Items.cSm, 1), "A", "B", Character.valueOf('A'), Blocks.cOr, Character.valueOf('B'), Items.cQD);
        this.a(new co(Items.cQI, 1), "# #", "###", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Items.cQA, 1), "# #", " # ", Character.valueOf('#'), Items.cPn);
        this.a(new co(Items.cRU, 1), "# #", " # ", Character.valueOf('#'), Items.cQL);
        this.b(new co(Items.cPh, 1), new co(Items.cPn, 1), new co(Items.cQo, 1));
        this.a(new co(Items.cPT, 1), "###", Character.valueOf('#'), Items.cPS);
        this.a(new co(Blocks.cMf, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXJ.yc()));
        this.a(new co(Blocks.cNX, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXL.yc()));
        this.a(new co(Blocks.cNW, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXK.yc()));
        this.a(new co(Blocks.cNY, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, BlockPlanks$EnumType.aXM.yc()));
        this.a(new co(Blocks.cOE, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXN.yc() - 4));
        this.a(new co(Blocks.cOF, 4), "#  ", "## ", "###", Character.valueOf('#'), new co(Blocks.cLh, 1, 4 + BlockPlanks$EnumType.aXO.yc() - 4));
        this.a(new co(Items.cQV, 1), "  #", " #X", "# X", Character.valueOf('#'), Items.cPC, Character.valueOf('X'), Items.cPJ);
        this.a(new co(Items.cSc, 1), "# ", " X", Character.valueOf('#'), Items.cQV, Character.valueOf('X'), Items.cRV);
        this.a(new co(Blocks.cMy, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cLg);
        this.a(new co(Blocks.cNw, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cLX);
        this.a(new co(Blocks.cNx, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cNh);
        this.a(new co(Blocks.cNC, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cNA);
        this.a(new co(Blocks.cNQ, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cLC);
        this.a(new co(Blocks.cOP, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cOO);
        this.a(new co(Blocks.cOt, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.cOs);
        this.a(new co(Items.cQr, 1), "###", "#X#", "###", Character.valueOf('#'), Items.cPC, Character.valueOf('X'), Blocks.cLN);
        this.a(new co(Items.cRT, 1), "###", "#X#", "###", Character.valueOf('#'), Items.cPC, Character.valueOf('X'), Items.cQJ);
        this.a(new co(Items.cQs, 1, 0), "###", "#X#", "###", Character.valueOf('#'), Items.cPo, Character.valueOf('X'), Items.cPi);
        this.a(new co(Items.cQs, 1, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.cLT, Character.valueOf('X'), Items.cPi);
        this.a(new co(Items.cSa, 1, 0), "###", "#X#", "###", Character.valueOf('#'), Items.cRB, Character.valueOf('X'), Items.cRV);
        this.a(new co(Items.cRM, 1), "###", "#X#", "###", Character.valueOf('#'), Items.cRB, Character.valueOf('X'), Items.cRj);
        this.a(new co(Blocks.cMA, 1), "X", "#", Character.valueOf('#'), Blocks.cLg, Character.valueOf('X'), Items.cPC);
        this.a(new co(Blocks.cNT, 2), "I", "S", "#", Character.valueOf('#'), Blocks.cLh, Character.valueOf('S'), Items.cPC, Character.valueOf('I'), Items.cPn);
        this.a(new co(Blocks.cMH, 1), "X", "#", Character.valueOf('#'), Items.cPC, Character.valueOf('X'), Items.cQG);
        this.a(new co(Items.cRf, 1), "#X#", "III", Character.valueOf('#'), Blocks.cMH, Character.valueOf('X'), Items.cQG, Character.valueOf('I'), new co(Blocks.cLd, 1, BlockStone$EnumType.bbx.yc()));
        this.a(new co(Items.cSi, 1), " # ", "#X#", "III", Character.valueOf('#'), Blocks.cMH, Character.valueOf('X'), Items.cSk, Character.valueOf('I'), new co(Blocks.cLd, 1, BlockStone$EnumType.bbx.yc()));
        this.a(new co(Items.cQW, 1), " # ", "#X#", " # ", Character.valueOf('#'), Items.cPo, Character.valueOf('X'), Items.cQG);
        this.a(new co(Items.cQU, 1), " # ", "#X#", " # ", Character.valueOf('#'), Items.cPn, Character.valueOf('X'), Items.cQG);
        this.a(new co(Items.cRZ, 1), "###", "#X#", "###", Character.valueOf('#'), Items.cQO, Character.valueOf('X'), Items.cQU);
        this.a(new co(Blocks.cMI, 1), "#", Character.valueOf('#'), new co(Blocks.cLd, 1, BlockStone$EnumType.bbx.yc()));
        this.a(new co(Blocks.cOf, 1), "#", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Blocks.cMB, 1), "##", Character.valueOf('#'), new co(Blocks.cLd, 1, BlockStone$EnumType.bbx.yc()));
        this.a(new co(Blocks.cMD, 1), "##", Character.valueOf('#'), Blocks.cLh);
        this.a(new co(Blocks.cOk, 1), "##", Character.valueOf('#'), Items.cPn);
        this.a(new co(Blocks.cOj, 1), "##", Character.valueOf('#'), Items.cPo);
        this.a(new co(Blocks.cLB, 1), "###", "#X#", "#R#", Character.valueOf('#'), Blocks.cLg, Character.valueOf('X'), Items.cPj, Character.valueOf('R'), Items.cQG);
        this.a(new co(Blocks.cOv, 1), "###", "# #", "#R#", Character.valueOf('#'), Blocks.cLg, Character.valueOf('R'), Items.cQG);
        this.a(new co(Blocks.cLL, 1), "TTT", "#X#", "#R#", Character.valueOf('#'), Blocks.cLg, Character.valueOf('X'), Items.cPn, Character.valueOf('R'), Items.cQG, Character.valueOf('T'), Blocks.cLh);
        this.a(new co(Blocks.cLH, 1), "S", "P", Character.valueOf('S'), Items.cQQ, Character.valueOf('P'), Blocks.cLL);
        this.a(new co(Items.cRe, 1), "###", "XXX", Character.valueOf('#'), Blocks.cLN, Character.valueOf('X'), Blocks.cLh);
        this.a(new co(Blocks.cNE, 1), " B ", "D#D", "###", Character.valueOf('#'), Blocks.cMb, Character.valueOf('B'), Items.cQP, Character.valueOf('D'), Items.cPm);
        this.a(new co(Blocks.cOh, 1), "III", " i ", "iii", Character.valueOf('I'), Blocks.cLU, Character.valueOf('i'), Items.cPn);
        this.a(new co(Items.cQJ), "##", "##", Character.valueOf('#'), Items.cRw);
        this.b(new co(Items.cRL, 1), Items.cRy, Items.cRH);
        this.b(new co(Items.cRP, 3), Items.cPL, Items.cRH, Items.cPl);
        this.b(new co(Items.cRP, 3), Items.cPL, Items.cRH, new co(Items.cPl, 1, 1));
        this.a(new co(Blocks.cOnn), "GGG", "QQQ", "WWW", Character.valueOf('G'), Blocks.cLy, Character.valueOf('Q'), Items.cSk, Character.valueOf('W'), Blocks.cNO);
        this.a(new co(Blocks.cOr), "I I", "ICI", " I ", Character.valueOf('I'), Items.cPn, Character.valueOf('C'), Blocks.cMg);
        this.a(new co(Items.cSn, 1), "///", " / ", "/_/", Character.valueOf('/'), Items.cPC, Character.valueOf('_'), new co(Blocks.cLW, 1, BlockStoneSlab$EnumType.bca.yc()));
        Collections.sort(this.cXr, new b(this));
    }

    public u a(co co2, Object ... objectArray) {
        Object object;
        Object object2;
        Object object3 = "";
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (objectArray[n2] instanceof String[]) {
            object2 = (String[])objectArray[n2++];
            for (int i2 = 0; i2 < ((String[])object2).length; ++i2) {
                object = object2[i2];
                ++n4;
                n3 = ((String)object).length();
                object3 = (String)object3 + (String)object;
            }
        } else {
            while (objectArray[n2] instanceof String) {
                object2 = (String)objectArray[n2++];
                ++n4;
                n3 = ((String)object2).length();
                object3 = (String)object3 + (String)object2;
            }
        }
        object2 = Maps.newHashMap();
        while (n2 < objectArray.length) {
            Character c2 = (Character)objectArray[n2];
            object = null;
            if (objectArray[n2 + 1] instanceof net.minecraft.item.d) {
                object = new co((net.minecraft.item.d)objectArray[n2 + 1]);
            } else if (objectArray[n2 + 1] instanceof Block) {
                object = new co((Block)objectArray[n2 + 1], 1, Short.MAX_VALUE);
            } else if (objectArray[n2 + 1] instanceof co) {
                object = (co)objectArray[n2 + 1];
            }
            object2.put(c2, object);
            n2 += 2;
        }
        co[] coArray = new co[n3 * n4];
        for (int i3 = 0; i3 < n3 * n4; ++i3) {
            char c3 = ((String)object3).charAt(i3);
            coArray[i3] = object2.containsKey(Character.valueOf(c3)) ? ((co)object2.get(Character.valueOf(c3))).aeg() : null;
        }
        u u2 = new u(n3, n4, coArray, co2);
        this.cXr.add(u2);
        return u2;
    }

    public void b(co co2, Object ... objectArray) {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : objectArray) {
            if (object instanceof co) {
                arrayList.add(((co)object).aeg());
                continue;
            }
            if (object instanceof net.minecraft.item.d) {
                arrayList.add(new co((net.minecraft.item.d)object));
                continue;
            }
            if (!(object instanceof Block)) {
                throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object.getClass().getName() + "!");
            }
            arrayList.add(new co((Block)object));
        }
        this.cXr.add(new v(co2, arrayList));
    }

    public void a(d d2) {
        this.cXr.add(d2);
    }

    public co a(af af2, w w2) {
        for (d d2 : this.cXr) {
            if (!d2.c(af2, w2)) continue;
            return d2.a(af2);
        }
        return null;
    }

    public co[] b(af af2, w w2) {
        for (d d2 : this.cXr) {
            if (!d2.c(af2, w2)) continue;
            return d2.b(af2);
        }
        co[] coArray = new co[af2.YI()];
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            coArray[i2] = af2.fi(i2);
        }
        return coArray;
    }

    public List<d> aez() {
        return this.cXr;
    }
}

