/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.l;
import net.optifine.s;
import net.optifine.y;

class t
implements y {
    t() {
    }

    @Override
    public int c(IBlockState iBlockState, l l2, b b2) {
        j j2 = s.B(l2, b2);
        return s.dYs != null && j2 == j.dGl ? s.dYs.b(j2, b2) : j2.bj(b2);
    }

    @Override
    public boolean aAw() {
        return false;
    }
}

