/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class BlockLog
extends BlockRotatedPillar {
    public static final PropertyEnum<BlockLog$EnumAxis> aWW = PropertyEnum.c("axis", BlockLog$EnumAxis.class);

    public BlockLog() {
        super(Material.ber);
        this.a(a.cpx);
        this.L(2.0f);
        this.a(aRZ);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        int n2 = 4;
        int n3 = 5;
        if (w2.e(b2.C(-5, -5, -5), b2.C(5, 5, 5))) {
            for (b b3 : b.b(b2.C(-4, -4, -4), b2.C(4, 4, 4))) {
                IBlockState iBlockState2 = w2.L(b3);
                if (iBlockState2.df().xb() != Material.bex || iBlockState2.b(BlockLeaves.aWz).booleanValue()) continue;
                w2.a(b3, iBlockState2.a(BlockLeaves.aWz, true), 4);
            }
        }
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return super.a(w2, b2, ao2, f2, f3, f4, n2, r2).a(aWW, BlockLog$EnumAxis.a(ao2.asL()));
    }
}

