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
import net.minecraft.init.Blocks;
import net.minecraft.item.cq;
import net.minecraft.item.v;

public class cn
extends cq {
    private static final Set<Block> cWX = Sets.newHashSet((Object[])new Block[]{Blocks.cMN, Blocks.cLf, Blocks.cMm, Blocks.cLe, Blocks.cLp, Blocks.cNy, Blocks.cLo, Blocks.cML, Blocks.cMJ, Blocks.cMY});

    public cn(v v2) {
        super(1.0f, v2, cWX);
    }

    @Override
    public boolean F(Block block) {
        return block == Blocks.cMJ || block == Blocks.cML;
    }
}

