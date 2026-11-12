/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;

public class h {
    private final String[][] cXw = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private final d[][] cXx = new d[][]{{Items.cQJ, Items.cPn, Items.cPm, Items.cPo}, {Items.cPU, Items.cQc, Items.cQg, Items.cQk}, {Items.cPV, Items.cQd, Items.cQh, Items.cQl}, {Items.cPW, Items.cQe, Items.cQi, Items.cQm}, {Items.cPX, Items.cQf, Items.cQj, Items.cQn}};

    public void a(a a2) {
        for (int i2 = 0; i2 < this.cXx[0].length; ++i2) {
            d d2 = this.cXx[0][i2];
            for (int i3 = 0; i3 < this.cXx.length - 1; ++i3) {
                d d3 = this.cXx[i3 + 1][i2];
                a2.a(new co(d3), this.cXw[i3], Character.valueOf('X'), d2);
            }
        }
    }
}

