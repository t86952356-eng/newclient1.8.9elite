/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;

public class BlockLeavesBase
extends Block {
    protected boolean aWD;

    protected BlockLeavesBase(Material material, boolean bl2) {
        super(material);
        this.aWD = bl2;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return (this.aWD || l2.L(b2).df() != this) && super.a(l2, b2, ao2);
    }
}

