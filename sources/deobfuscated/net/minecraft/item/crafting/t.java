/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;

public class t {
    private final String[][] cXB = new String[][]{{"X", "X", "#"}};
    private final Object[][] cXC = new Object[][]{{Blocks.cLh, Blocks.cLg, Items.cPn, Items.cPm, Items.cPo}, {Items.cPq, Items.cPu, Items.cPp, Items.cPy, Items.cPF}};

    public void a(a a2) {
        for (int i2 = 0; i2 < this.cXC[0].length; ++i2) {
            Object object = this.cXC[0][i2];
            for (int i3 = 0; i3 < this.cXC.length - 1; ++i3) {
                d d2 = (d)this.cXC[i3 + 1][i2];
                a2.a(new co(d2), this.cXB[i3], Character.valueOf('#'), Items.cPC, Character.valueOf('X'), object);
            }
        }
        a2.a(new co(Items.cPj, 1), " #X", "# X", " #X", Character.valueOf('X'), Items.cPJ, Character.valueOf('#'), Items.cPC);
        a2.a(new co(Items.cPk, 4), "X", "#", "Y", Character.valueOf('Y'), Items.cPK, Character.valueOf('X'), Items.cQo, Character.valueOf('#'), Items.cPC);
    }
}

