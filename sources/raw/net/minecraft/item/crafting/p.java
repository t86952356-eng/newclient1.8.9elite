/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;

public class p {
    private final Object[][] cXy = new Object[][]{{Blocks.cLT, new co(Items.cPo, 9)}, {Blocks.cLU, new co(Items.cPn, 9)}, {Blocks.cMj, new co(Items.cPm, 9)}, {Blocks.cNV, new co(Items.cRS, 9)}, {Blocks.cLA, new co(Items.cRa, 9, b.cUN.ado())}, {Blocks.cOp, new co(Items.cQG, 9)}, {Blocks.cOC, new co(Items.cPl, 9, 0)}, {Blocks.cOz, new co(Items.cPS, 9)}, {Blocks.cOG, new co(Items.cQQ, 9)}};

    public void a(a a2) {
        for (int i2 = 0; i2 < this.cXy.length; ++i2) {
            Block block = (Block)this.cXy[i2][0];
            co co2 = (co)this.cXy[i2][1];
            a2.a(new co(block), "###", "###", "###", Character.valueOf('#'), co2);
            a2.a(co2, "#", Character.valueOf('#'), block);
        }
        a2.a(new co(Items.cPo), "###", "###", "###", Character.valueOf('#'), Items.cRB);
        a2.a(new co(Items.cRB, 9), "#", Character.valueOf('#'), Items.cPo);
    }
}

