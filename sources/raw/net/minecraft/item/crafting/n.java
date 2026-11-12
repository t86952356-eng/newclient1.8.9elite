/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;

public class n {
    public void a(a a2) {
        int n2;
        for (n2 = 0; n2 < 16; ++n2) {
            a2.b(new co(Blocks.cLN, 1, n2), new co(Items.cRa, 1, 15 - n2), new co(d.I(Blocks.cLN), 1, 0));
            a2.a(new co(Blocks.cOw, 8, 15 - n2), "###", "#X#", "###", Character.valueOf('#'), new co(Blocks.cOB), Character.valueOf('X'), new co(Items.cRa, 1, n2));
            a2.a(new co(Blocks.cOI, 8, 15 - n2), "###", "#X#", "###", Character.valueOf('#'), new co(Blocks.cLy), Character.valueOf('X'), new co(Items.cRa, 1, n2));
            a2.a(new co(Blocks.cOJ, 16, n2), "###", "###", Character.valueOf('#'), new co(Blocks.cOI, 1, n2));
        }
        a2.b(new co(Items.cRa, 1, b.cUG.ado()), new co(Blocks.cLP, 1, BlockFlower$EnumFlowerType.aVa.yi()));
        a2.b(new co(Items.cRa, 1, b.cUQ.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVb.yi()));
        a2.b(new co(Items.cRa, 3, b.cUC.ado()), Items.cRb);
        a2.b(new co(Items.cRa, 2, b.cUI.ado()), new co(Items.cRa, 1, b.cUQ.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 2, b.cUD.ado()), new co(Items.cRa, 1, b.cUQ.ado()), new co(Items.cRa, 1, b.cUG.ado()));
        a2.b(new co(Items.cRa, 2, b.cUH.ado()), new co(Items.cRa, 1, b.cUP.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 2, b.cUJ.ado()), new co(Items.cRa, 1, b.cUR.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 2, b.cUK.ado()), new co(Items.cRa, 1, b.cUJ.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 3, b.cUK.ado()), new co(Items.cRa, 1, b.cUR.ado()), new co(Items.cRa, 1, b.cUC.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 2, b.cUF.ado()), new co(Items.cRa, 1, b.cUN.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 2, b.cUL.ado()), new co(Items.cRa, 1, b.cUN.ado()), new co(Items.cRa, 1, b.cUP.ado()));
        a2.b(new co(Items.cRa, 2, b.cUM.ado()), new co(Items.cRa, 1, b.cUN.ado()), new co(Items.cRa, 1, b.cUQ.ado()));
        a2.b(new co(Items.cRa, 2, b.cUE.ado()), new co(Items.cRa, 1, b.cUM.ado()), new co(Items.cRa, 1, b.cUI.ado()));
        a2.b(new co(Items.cRa, 3, b.cUE.ado()), new co(Items.cRa, 1, b.cUN.ado()), new co(Items.cRa, 1, b.cUQ.ado()), new co(Items.cRa, 1, b.cUI.ado()));
        a2.b(new co(Items.cRa, 4, b.cUE.ado()), new co(Items.cRa, 1, b.cUN.ado()), new co(Items.cRa, 1, b.cUQ.ado()), new co(Items.cRa, 1, b.cUQ.ado()), new co(Items.cRa, 1, b.cUC.ado()));
        a2.b(new co(Items.cRa, 1, b.cUF.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVc.yi()));
        a2.b(new co(Items.cRa, 1, b.cUE.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVd.yi()));
        a2.b(new co(Items.cRa, 1, b.cUK.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVe.yi()));
        a2.b(new co(Items.cRa, 1, b.cUQ.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVf.yi()));
        a2.b(new co(Items.cRa, 1, b.cUD.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVg.yi()));
        a2.b(new co(Items.cRa, 1, b.cUK.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVh.yi()));
        a2.b(new co(Items.cRa, 1, b.cUI.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVi.yi()));
        a2.b(new co(Items.cRa, 1, b.cUK.ado()), new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVj.yi()));
        a2.b(new co(Items.cRa, 2, b.cUG.ado()), new co(Blocks.cOH, 1, BlockDoublePlant$EnumPlantType.aUh.yi()));
        a2.b(new co(Items.cRa, 2, b.cUE.ado()), new co(Blocks.cOH, 1, BlockDoublePlant$EnumPlantType.aUi.yi()));
        a2.b(new co(Items.cRa, 2, b.cUQ.ado()), new co(Blocks.cOH, 1, BlockDoublePlant$EnumPlantType.aUl.yi()));
        a2.b(new co(Items.cRa, 2, b.cUI.ado()), new co(Blocks.cOH, 1, BlockDoublePlant$EnumPlantType.aUm.yi()));
        for (n2 = 0; n2 < 16; ++n2) {
            a2.a(new co(Blocks.cOA, 3, n2), "##", Character.valueOf('#'), new co(Blocks.cLN, 1, n2));
        }
    }
}

