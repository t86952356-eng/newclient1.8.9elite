/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class am
extends ao {
    @Override
    public boolean b(w w2, Random random, b b2) {
        while (b2.wu() < 128) {
            if (w2.aG(b2)) {
                for (net.minecraft.util.ao ao2 : ar.dwT.asU()) {
                    if (!Blocks.cNp.a(w2, b2, ao2)) continue;
                    IBlockState iBlockState = Blocks.cNp.xM().a(BlockVine.bdd, ao2 == net.minecraft.util.ao.dws).a(BlockVine.bde, ao2 == net.minecraft.util.ao.dwv).a(BlockVine.bdf, ao2 == net.minecraft.util.ao.dwt).a(BlockVine.bdg, ao2 == net.minecraft.util.ao.dwu);
                    w2.a(b2, iBlockState, 2);
                    break;
                }
            } else {
                b2 = b2.C(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            }
            b2 = b2.aqX();
        }
        return true;
    }
}

