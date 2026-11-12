/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockSlime
extends BlockBreakable {
    public BlockSlime() {
        super(Material.beP, false, MapColor.bdD);
        this.a(a.cpy);
        this.aSF = 0.8f;
    }

    @Override
    public av xo() {
        return av.dxY;
    }

    @Override
    public void a(w w2, b b2, c c2, float f2) {
        if (c2.isSneaking()) {
            super.a(w2, b2, c2, f2);
        } else {
            c2.q(f2, 0.0f);
        }
    }

    @Override
    public void a(w w2, c c2) {
        if (c2.isSneaking()) {
            super.a(w2, c2);
        } else if (c2.ue < 0.0) {
            c2.ue = -c2.ue;
        }
    }

    @Override
    public void a(w w2, b b2, c c2) {
        if (Math.abs(c2.ue) < 0.1 && !c2.isSneaking()) {
            double d2 = 0.4 + Math.abs(c2.ue) * 0.2;
            c2.ud *= d2;
            c2.uf *= d2;
        }
        super.a(w2, b2, c2);
    }
}

