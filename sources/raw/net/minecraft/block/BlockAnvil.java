/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockAnvil$Anvil;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.item.g;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockAnvil
extends BlockFalling {
    public static final PropertyDirection aSR = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyInteger aSS = PropertyInteger.e("damage", 0, 2);

    protected BlockAnvil() {
        super(Material.beu);
        this.h(this.aSG.zS().a(aSR, ao.dws).a(aSS, 0));
        this.aN(0);
        this.a(a.cpy);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        ao ao3 = r2.Uq().asD();
        return super.a(w2, b2, ao2, f2, f3, f4, n2, r2).a(aSR, ao3).a(aSS, n2 >> 2);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (!w2.dDw) {
            a2.a(new BlockAnvil$Anvil(w2, b2));
        }
        return true;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aSS);
    }

    @Override
    public void c(l l2, b b2) {
        ao ao2 = l2.L(b2).b(aSR);
        if (ao2.asL() == ap.dwH) {
            this.a(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        } else {
            this.a(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
        list.add(new co(d2, 1, 1));
        list.add(new co(d2, 1, 2));
    }

    @Override
    protected void a(g g2) {
        g2.aV(true);
    }

    @Override
    public void i(w w2, b b2) {
        w2.e(1022, b2, 0);
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    @Override
    public IBlockState g(IBlockState iBlockState) {
        return this.xM().a(aSR, ao.dwt);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aSR, ao.hz(n2 & 3)).a(aSS, (n2 & 0xF) >> 2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aSR).asA();
        return n2 |= iBlockState.b(aSS) << 2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aSR, aSS);
    }
}

