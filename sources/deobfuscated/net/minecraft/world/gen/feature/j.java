/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
package net.minecraft.world.gen.feature;

import com.google.common.base.Predicates;
import java.util.Random;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class j
extends ao {
    private static final BlockStateHelper dOj = BlockStateHelper.y(Blocks.cLo).a(BlockSand.bab, Predicates.equalTo((Object)BlockSand$EnumType.bac));
    private final IBlockState dOk = Blocks.cLW.xM().a(BlockStoneSlab.bbZ, BlockStoneSlab$EnumType.bcb).a(BlockSlab.baO, BlockSlab$EnumBlockHalf.baQ);
    private final IBlockState dOl = Blocks.cLC.xM();
    private final IBlockState dOm = Blocks.cLk.xM();

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        while (w2.aG(b2) && b2.wu() > 2) {
            b2 = b2.aqY();
        }
        if (!dOj.o(w2.L(b2))) {
            return false;
        }
        for (n4 = -2; n4 <= 2; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                if (!w2.aG(b2.C(n4, -1, n3)) || !w2.aG(b2.C(n4, -2, n3))) continue;
                return false;
            }
        }
        for (n4 = -1; n4 <= 0; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                for (int i2 = -2; i2 <= 2; ++i2) {
                    w2.a(b2.C(n3, n4, i2), this.dOl, 2);
                }
            }
        }
        w2.a(b2, this.dOm, 2);
        for (net.minecraft.util.ao ao2 : ar.dwT) {
            w2.a(b2.x(ao2), this.dOm, 2);
        }
        for (n2 = -2; n2 <= 2; ++n2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (n2 != -2 && n2 != 2 && i3 != -2 && i3 != 2) continue;
                w2.a(b2.C(n2, 1, i3), this.dOl, 2);
            }
        }
        w2.a(b2.C(2, 1, 0), this.dOk, 2);
        w2.a(b2.C(-2, 1, 0), this.dOk, 2);
        w2.a(b2.C(0, 1, 2), this.dOk, 2);
        w2.a(b2.C(0, 1, -2), this.dOk, 2);
        for (n2 = -1; n2 <= 1; ++n2) {
            for (int i4 = -1; i4 <= 1; ++i4) {
                if (n2 == 0 && i4 == 0) {
                    w2.a(b2.C(n2, 4, i4), this.dOl, 2);
                    continue;
                }
                w2.a(b2.C(n2, 4, i4), this.dOk, 2);
            }
        }
        for (n2 = 1; n2 <= 3; ++n2) {
            w2.a(b2.C(-1, n2, -1), this.dOl, 2);
            w2.a(b2.C(-1, n2, 1), this.dOl, 2);
            w2.a(b2.C(1, n2, -1), this.dOl, 2);
            w2.a(b2.C(1, n2, 1), this.dOl, 2);
        }
        return true;
    }
}

