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

public class bw
extends cq {
    private static final Set<Block> cWK = Sets.newHashSet((Object[])new Block[]{Blocks.cOu, Blocks.cLs, Blocks.cLg, Blocks.cLG, Blocks.cMj, Blocks.cMi, Blocks.cLV, Blocks.cLF, Blocks.cLT, Blocks.cLq, Blocks.cMK, Blocks.cLU, Blocks.cLr, Blocks.cLA, Blocks.cLz, Blocks.cMF, Blocks.cMa, Blocks.cMX, Blocks.cOD, Blocks.cMx, Blocks.cME, Blocks.cLC, Blocks.cOO, Blocks.cLd, Blocks.cLW});

    protected bw(v v2) {
        super(2.0f, v2, cWK);
    }

    @Override
    public boolean F(Block block) {
        return block == Blocks.cMb ? this.cXp.adJ() == 3 : (block != Blocks.cMj && block != Blocks.cMi ? (block != Blocks.cNR && block != Blocks.cNV ? (block != Blocks.cLT && block != Blocks.cLq ? (block != Blocks.cLU && block != Blocks.cLr ? (block != Blocks.cLA && block != Blocks.cLz ? (block != Blocks.cME && block != Blocks.cMF ? block.xb() == Material.bes || block.xb() == Material.bet || block.xb() == Material.beu : this.cXp.adJ() >= 2) : this.cXp.adJ() >= 1) : this.cXp.adJ() >= 1) : this.cXp.adJ() >= 2) : this.cXp.adJ() >= 2) : this.cXp.adJ() >= 2);
    }

    @Override
    public float a(co co2, Block block) {
        return block.xb() != Material.bet && block.xb() != Material.beu && block.xb() != Material.bes ? super.a(co2, block) : this.cVA;
    }
}

