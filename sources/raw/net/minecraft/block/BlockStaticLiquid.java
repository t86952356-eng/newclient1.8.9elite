/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockStaticLiquid
extends BlockLiquid {
    protected BlockStaticLiquid(Material material) {
        super(material);
        this.O(false);
        if (material == Material.bew) {
            this.O(true);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.u(w2, b2, iBlockState)) {
            this.I(w2, b2, iBlockState);
        }
    }

    private void I(w w2, b b2, IBlockState iBlockState) {
        BlockDynamicLiquid blockDynamicLiquid = BlockStaticLiquid.a(this.aSD);
        w2.a(b2, blockDynamicLiquid.xM().a(aWV, iBlockState.b(aWV)), 2);
        w2.a(b2, (Block)blockDynamicLiquid, this.c(w2));
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        block5: {
            if (this.aSD != Material.bew || !w2.Si().gw("doFireTick")) break block5;
            int n2 = random.nextInt(3);
            if (n2 > 0) {
                b b3 = b2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    b3 = b3.C(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
                    Block block = w2.L(b3).df();
                    if (block.aSD == Material.beo) {
                        if (!this.U(w2, b3)) continue;
                        w2.d(b3, Blocks.cMd.xM());
                        return;
                    }
                    if (!block.aSD.zy()) continue;
                    return;
                }
            } else {
                for (int i3 = 0; i3 < 3; ++i3) {
                    b b4 = b2.C(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (!w2.aG(b4.aqX()) || !this.V(w2, b4)) continue;
                    w2.d(b4.aqX(), Blocks.cMd.xM());
                }
            }
        }
    }

    protected boolean U(w w2, b b2) {
        for (ao ao2 : ao.values()) {
            if (!this.V(w2, b2.x(ao2))) continue;
            return true;
        }
        return false;
    }

    private boolean V(w w2, b b2) {
        return w2.L(b2).df().xb().zC();
    }
}

