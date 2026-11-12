/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.al;
import net.minecraft.world.w;

public class af
extends al {
    private final IBlockState dOR;
    private final IBlockState dOS;

    public af(IBlockState iBlockState, IBlockState iBlockState2) {
        super(false);
        this.dOS = iBlockState;
        this.dOR = iBlockState2;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        Block block;
        while (((block = w2.L(b2).df()).xb() == Material.beo || block.xb() == Material.bex) && b2.wu() > 0) {
            b2 = b2.aqY();
        }
        Block block2 = w2.L(b2).df();
        if (block2 == Blocks.cLf || block2 == Blocks.cLe) {
            b2 = b2.aqX();
            this.N(w2, b2, this.dOS);
            for (int i2 = b2.wu(); i2 <= b2.wu() + 2; ++i2) {
                int n2 = i2 - b2.wu();
                int n3 = 2 - n2;
                for (int i3 = b2.wt() - n3; i3 <= b2.wt() + n3; ++i3) {
                    int n4 = i3 - b2.wt();
                    for (int i4 = b2.wx() - n3; i4 <= b2.wx() + n3; ++i4) {
                        b b3;
                        int n5 = i4 - b2.wx();
                        if (Math.abs(n4) == n3 && Math.abs(n5) == n3 && random.nextInt(2) == 0 || w2.L(b3 = new b(i3, i2, i4)).df().isFullBlock()) continue;
                        this.N(w2, b3, this.dOR);
                    }
                }
            }
        }
        return true;
    }
}

