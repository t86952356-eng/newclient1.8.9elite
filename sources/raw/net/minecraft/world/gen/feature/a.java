/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public abstract class a
extends ao {
    public a(boolean bl2) {
        super(bl2);
    }

    protected boolean L(Block block) {
        Material material = block.xb();
        return material == Material.beo || material == Material.bex || block == Blocks.cLe || block == Blocks.cLf || block == Blocks.cLt || block == Blocks.cLu || block == Blocks.cLi || block == Blocks.cNp;
    }

    public void c(w w2, Random random, b b2) {
    }

    protected void af(w w2, b b2) {
        if (w2.L(b2).df() != Blocks.cLf) {
            this.N(w2, b2, Blocks.cLf.xM());
        }
    }
}

