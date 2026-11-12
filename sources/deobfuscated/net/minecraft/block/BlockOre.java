/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class BlockOre
extends Block {
    public BlockOre() {
        this(Material.bes.zK());
    }

    public BlockOre(MapColor mapColor) {
        super(Material.bes, mapColor);
        this.a(a.cpx);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return this == Blocks.cLs ? Items.cPl : (this == Blocks.cMi ? Items.cPm : (this == Blocks.cLz ? Items.cRa : (this == Blocks.cNR ? Items.cRS : (this == Blocks.cOq ? Items.cSk : d.I(this)))));
    }

    @Override
    public int a(Random random) {
        return this == Blocks.cLz ? 4 + random.nextInt(5) : 1;
    }

    @Override
    public int a(int n2, Random random) {
        if (n2 > 0 && d.I(this) != this.a((IBlockState)this.xL().zQ().iterator().next(), random, n2)) {
            int n3 = random.nextInt(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return this.a(random) * (n3 + 1);
        }
        return this.a(random);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        super.a(w2, b2, iBlockState, f2, n2);
        if (this.a(iBlockState, w2.dDk, n2) != d.I(this)) {
            int n3 = 0;
            if (this == Blocks.cLs) {
                n3 = bt.b(w2.dDk, 0, 2);
            } else if (this == Blocks.cMi) {
                n3 = bt.b(w2.dDk, 3, 7);
            } else if (this == Blocks.cNR) {
                n3 = bt.b(w2.dDk, 3, 7);
            } else if (this == Blocks.cLz) {
                n3 = bt.b(w2.dDk, 2, 5);
            } else if (this == Blocks.cOq) {
                n3 = bt.b(w2.dDk, 2, 5);
            }
            this.a(w2, b2, n3);
        }
    }

    @Override
    public int f(w w2, b b2) {
        return 0;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return this == Blocks.cLz ? net.minecraft.item.b.cUN.ado() : 0;
    }
}

