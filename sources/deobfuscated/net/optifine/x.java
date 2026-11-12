/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.l;
import net.optifine.reflect.g;
import net.optifine.s;
import net.optifine.y;

class x
implements y {
    x() {
    }

    @Override
    public int c(IBlockState iBlockState, l l2, b b2) {
        j j2 = s.B(l2, b2);
        return s.dYo != null ? s.dYo.b(j2, b2) : (g.eoe.aDA() ? g.c(j2, g.eoe, new Object[0]) : j2.dHg);
    }

    @Override
    public boolean aAw() {
        return false;
    }
}

