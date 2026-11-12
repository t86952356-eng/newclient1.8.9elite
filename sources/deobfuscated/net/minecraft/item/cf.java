/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cf
extends d {
    public cf() {
        this.fU(1);
        this.fW(238);
        this.d(a.cpE);
    }

    @Override
    public boolean a(co co2, w w2, Block block, b b2, r r2) {
        if (block.xb() != Material.bex && block != Blocks.cLI && block != Blocks.cLJ && block != Blocks.cNp && block != Blocks.cNU && block != Blocks.cLN) {
            return super.a(co2, w2, block, b2, r2);
        }
        co2.b(1, r2);
        return true;
    }

    @Override
    public boolean F(Block block) {
        return block == Blocks.cLI || block == Blocks.cMh || block == Blocks.cNU;
    }

    @Override
    public float a(co co2, Block block) {
        return block != Blocks.cLI && block.xb() != Material.bex ? (block == Blocks.cLN ? 5.0f : super.a(co2, block)) : 15.0f;
    }
}

