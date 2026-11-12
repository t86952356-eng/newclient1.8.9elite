/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.item.v;
import net.minecraft.entity.projectile.a;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.h;
import net.minecraft.world.w;

public class BlockTNT
extends Block {
    public static final PropertyBool bcw = PropertyBool.cs("explode");

    public BlockTNT() {
        super(Material.beI);
        this.h(this.aSG.zS().a(bcw, false));
        this.a(net.minecraft.creativetab.a.cpz);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        super.c(w2, b2, iBlockState);
        if (w2.bb(b2)) {
            this.b(w2, b2, iBlockState.a(bcw, true));
            w2.aL(b2);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (w2.bb(b2)) {
            this.b(w2, b2, iBlockState.a(bcw, true));
            w2.aL(b2);
        }
    }

    @Override
    public void a(w w2, b b2, h h2) {
        if (!w2.dDw) {
            v v2 = new v(w2, (float)b2.wt() + 0.5f, b2.wu(), (float)b2.wx() + 0.5f, h2.avf());
            v2.cDI = w2.dDk.nextInt(v2.cDI / 4) + v2.cDI / 8;
            w2.G(v2);
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState) {
        this.a(w2, b2, iBlockState, (r)null);
    }

    public void a(w w2, b b2, IBlockState iBlockState, r r2) {
        if (!w2.dDw && iBlockState.b(bcw).booleanValue()) {
            v v2 = new v(w2, (float)b2.wt() + 0.5f, b2.wu(), (float)b2.wx() + 0.5f, r2);
            w2.G(v2);
            w2.a(v2, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        d d2;
        if (a2.abO() != null && ((d2 = a2.abO().bP()) == Items.cPh || d2 == Items.cRP)) {
            this.a(w2, b2, iBlockState.a(bcw, true), (r)a2);
            w2.aL(b2);
            if (d2 == Items.cPh) {
                a2.abO().b(1, (r)a2);
            } else if (!a2.cIt.cJM) {
                --a2.abO().cWZ;
            }
            return true;
        }
        return super.a(w2, b2, iBlockState, a2, ao2, f2, f3, f4);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        a a2;
        if (!w2.dDw && c2 instanceof a && (a2 = (a)c2).isBurning()) {
            this.a(w2, b2, w2.L(b2).a(bcw, true), a2.cJY instanceof r ? (r)a2.cJY : null);
            w2.aL(b2);
        }
    }

    @Override
    public boolean a(h h2) {
        return false;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bcw, (n2 & 1) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bcw) != false ? 1 : 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcw);
    }
}

