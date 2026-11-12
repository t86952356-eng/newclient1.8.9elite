/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.crafting.k;
import net.minecraft.item.crafting.l;

public class j {
    void a(a a2) {
        for (b b2 : b.values()) {
            a2.a(new co(Items.cSI, 1, b2.ado()), "###", "###", " | ", Character.valueOf('#'), new co(Blocks.cLN, 1, b2.yc()), Character.valueOf('|'), Items.cPC);
        }
        a2.a(new l());
        a2.a(new k());
    }
}

