/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.tileentity.s;
import net.minecraft.util.b;
import net.minecraft.world.w;

class Bootstrap$11
extends a {
    private final a cOW = new a();

    Bootstrap$11() {
    }

    @Override
    public co b(e e2, co co2) {
        d d2;
        b b2;
        w w2 = e2.de();
        IBlockState iBlockState = w2.L(b2 = e2.dg().x(BlockDispenser.aQ(e2.zg())));
        Block block = iBlockState.df();
        Material material = block.xb();
        if (Material.bev.equals(material) && block instanceof BlockLiquid && iBlockState.b(BlockLiquid.aWV) == 0) {
            d2 = Items.cQB;
        } else {
            if (!Material.bew.equals(material) || !(block instanceof BlockLiquid) || iBlockState.b(BlockLiquid.aWV) != 0) {
                return super.b(e2, co2);
            }
            d2 = Items.cQC;
        }
        w2.aL(b2);
        if (--co2.cWZ == 0) {
            co2.r(d2);
            co2.cWZ = 1;
        } else if (((s)e2.zh()).aU(new co(d2)) < 0) {
            this.cOW.a(e2, new co(d2));
        }
        return co2;
    }
}

