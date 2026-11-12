/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockFenceGate
extends BlockDirectional {
    public static final PropertyBool aUI = PropertyBool.cs("open");
    public static final PropertyBool aUJ = PropertyBool.cs("powered");
    public static final PropertyBool aUK = PropertyBool.cs("in_wall");

    public BlockFenceGate(BlockPlanks$EnumType blockPlanks$EnumType) {
        super(Material.ber, blockPlanks$EnumType.yB());
        this.h(this.aSG.zS().a(aUI, false).a(aUJ, false).a(aUK, false));
        this.a(a.cpz);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        ap ap2 = iBlockState.b(aTB).asL();
        if (ap2 == ap.dwJ && (l2.L(b2.arb()).df() == Blocks.cOb || l2.L(b2.arc()).df() == Blocks.cOb) || ap2 == ap.dwH && (l2.L(b2.aqZ()).df() == Blocks.cOb || l2.L(b2.ara()).df() == Blocks.cOb)) {
            iBlockState = iBlockState.a(aUK, true);
        }
        return iBlockState;
    }

    @Override
    public boolean d(w w2, b b2) {
        return w2.L(b2.aqY()).df().xb().zw() && super.d(w2, b2);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        if (iBlockState.b(aUI).booleanValue()) {
            return null;
        }
        ap ap2 = iBlockState.b(aTB).asL();
        return ap2 == ap.dwJ ? new net.minecraft.util.a(b2.wt(), b2.wu(), (float)b2.wx() + 0.375f, b2.wt() + 1, (float)b2.wu() + 1.5f, (float)b2.wx() + 0.625f) : new net.minecraft.util.a((float)b2.wt() + 0.375f, b2.wu(), b2.wx(), (float)b2.wt() + 0.625f, (float)b2.wu() + 1.5f, b2.wx() + 1);
    }

    @Override
    public void c(l l2, b b2) {
        ap ap2 = l2.L(b2).b(aTB).asL();
        if (ap2 == ap.dwJ) {
            this.a(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        } else {
            this.a(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2) {
        return l2.L(b2).b(aUI);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTB, r2.Uq()).a(aUI, false).a(aUJ, false).a(aUK, false);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (iBlockState.b(aUI).booleanValue()) {
            iBlockState = iBlockState.a(aUI, false);
            w2.a(b2, iBlockState, 2);
        } else {
            ao ao3 = ao.aC(a2.pl);
            if (iBlockState.b(aTB) == ao3.asC()) {
                iBlockState = iBlockState.a(aTB, ao3);
            }
            iBlockState = iBlockState.a(aUI, true);
            w2.a(b2, iBlockState, 2);
        }
        w2.b(a2, iBlockState.b(aUI) != false ? 1003 : 1006, b2, 0);
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        boolean bl2;
        if (!w2.dDw && ((bl2 = w2.bb(b2)) || block.xw())) {
            if (bl2 && !iBlockState.b(aUI).booleanValue() && !iBlockState.b(aUJ).booleanValue()) {
                w2.a(b2, iBlockState.a(aUI, true).a(aUJ, true), 2);
                w2.b(null, 1003, b2, 0);
            } else if (!bl2 && iBlockState.b(aUI).booleanValue() && iBlockState.b(aUJ).booleanValue()) {
                w2.a(b2, iBlockState.a(aUI, false).a(aUJ, false), 2);
                w2.b(null, 1006, b2, 0);
            } else if (bl2 != iBlockState.b(aUJ)) {
                w2.a(b2, iBlockState.a(aUJ, bl2), 2);
            }
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTB, ao.hz(n2)).a(aUI, (n2 & 4) != 0).a(aUJ, (n2 & 8) != 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTB).asA();
        if (iBlockState.b(aUJ).booleanValue()) {
            n2 |= 8;
        }
        if (iBlockState.b(aUI).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB, aUI, aUJ, aUK);
    }
}

