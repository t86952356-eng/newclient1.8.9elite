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

class u
implements y {
    u() {
    }

    @Override
    public int c(IBlockState iBlockState, l l2, b b2) {
        j j2 = s.B(l2, b2);
        return s.dYr != null && j2 == j.dGl ? s.dYr.b(j2, b2) : j2.bk(b2);
    }

    @Override
    public boolean aAw() {
        return false;
    }
}

