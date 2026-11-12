/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.util.av;

public class BlockGlass
extends BlockBreakable {
    public BlockGlass(Material material, boolean bl2) {
        super(material, bl2);
        this.a(a.cpx);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    protected boolean xy() {
        return true;
    }
}

