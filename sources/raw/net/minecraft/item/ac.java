/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.item;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.cq;
import net.minecraft.item.v;

public class ac
extends cq {
    private static final Set<Block> cVV = Sets.newHashSet((Object[])new Block[]{Blocks.cLh, Blocks.cLZ, Blocks.cLt, Blocks.cLu, Blocks.cMg, Blocks.cMW, Blocks.cNb, Blocks.cNm, Blocks.cMw});

    protected ac(v v2) {
        super(3.0f, v2, cVV);
    }

    @Override
    public float a(co co2, Block block) {
        return block.xb() != Material.ber && block.xb() != Material.bey && block.xb() != Material.bez ? super.a(co2, block) : this.cVA;
    }
}

