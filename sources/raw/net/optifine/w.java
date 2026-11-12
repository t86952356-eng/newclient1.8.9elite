/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.c;
import net.minecraft.world.l;
import net.optifine.s;
import net.optifine.y;

class w
implements y {
    w() {
    }

    @Override
    public int c(IBlockState iBlockState, l l2, b b2) {
        return s.dYq != null ? s.dYq.A(l2, b2) : c.auV();
    }

    @Override
    public boolean aAw() {
        return s.dYq == null;
    }
}

