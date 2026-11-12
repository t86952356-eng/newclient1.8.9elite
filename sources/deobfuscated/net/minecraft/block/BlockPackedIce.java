/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;

public class BlockPackedIce
extends Block {
    public BlockPackedIce() {
        super(Material.beL);
        this.aSF = 0.98f;
        this.a(a.cpx);
    }

    @Override
    public int a(Random random) {
        return 0;
    }
}

