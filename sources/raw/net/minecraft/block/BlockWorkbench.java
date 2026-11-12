/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench$InterfaceCraftingTable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockWorkbench
extends Block {
    protected BlockWorkbench() {
        super(Material.ber);
        this.a(a.cpy);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        a2.a(new BlockWorkbench$InterfaceCraftingTable(w2, b2));
        a2.a(n.dqA);
        return true;
    }
}

