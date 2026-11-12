/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;

public class s {
    private final String[][] cXz = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private final Object[][] cXA = new Object[][]{{Blocks.cLh, Blocks.cLg, Items.cPn, Items.cPm, Items.cPo}, {Items.cPs, Items.cPw, Items.cPf, Items.cPA, Items.cPH}, {Items.cPr, Items.cPv, Items.cPe, Items.cPz, Items.cPG}, {Items.cPt, Items.cPx, Items.cPg, Items.cPB, Items.cPI}, {Items.cPM, Items.cPN, Items.cPO, Items.cPP, Items.cPQ}};

    public void a(a a2) {
        for (int i2 = 0; i2 < this.cXA[0].length; ++i2) {
            Object object = this.cXA[0][i2];
            for (int i3 = 0; i3 < this.cXA.length - 1; ++i3) {
                d d2 = (d)this.cXA[i3 + 1][i2];
                a2.a(new co(d2), this.cXz[i3], Character.valueOf('#'), Items.cPC, Character.valueOf('X'), object);
            }
        }
        a2.a(new co(Items.cRi), " #", "# ", Character.valueOf('#'), Items.cPn);
    }
}

