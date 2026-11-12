/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockLadder
extends Block {
    private float aWv;
    public static final PropertyDirection aWw = PropertyDirection.a("facing", ar.dwT);

    protected BlockLadder() {
        super(Material.beE);
        this.h(this.aSG.zS().a(aWw, ao.dws));
        this.a(a.cpy);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        return super.a(w2, b2, iBlockState);
    }

    @Override
    public net.minecraft.util.a c(w w2, b b2) {
        this.c((l)w2, b2);
        return super.c(w2, b2);
    }

    @Override
    public void c(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        if (iBlockState.df() == this) {
            this.aWv = ViaLoadingBase.getInstance().getTargetVersion().getVersion() > 47 ? 0.1875f : 0.125f;
            switch (iBlockState.b(aWw)) {
                case dws: {
                    this.a(0.0f, 0.0f, 1.0f - this.aWv, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case dwt: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, this.aWv);
                    break;
                }
                case dwu: {
                    this.a(1.0f - this.aWv, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                default: {
                    this.a(0.0f, 0.0f, 0.0f, this.aWv, 1.0f, 1.0f);
                }
            }
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
    public boolean d(w w2, b b2) {
        return w2.L(b2.arb()).df().xd() || w2.L(b2.arc()).df().xd() || w2.L(b2.aqZ()).df().xd() || w2.L(b2.ara()).df().xd();
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        if (ao2.asL().asP() && this.e(w2, b2, ao2)) {
            return this.xM().a(aWw, ao2);
        }
        for (ao ao3 : ar.dwT) {
            if (!this.e(w2, b2, ao3)) continue;
            return this.xM().a(aWw, ao3);
        }
        return this.xM();
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        ao ao2 = iBlockState.b(aWw);
        if (!this.e(w2, b2, ao2)) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
        super.a(w2, b2, iBlockState, block);
    }

    protected boolean e(w w2, b b2, ao ao2) {
        return w2.L(b2.x(ao2.asC())).df().xd();
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hy(n2);
        if (ao2.asL() == ap.dwI) {
            ao2 = ao.dws;
        }
        return this.xM().a(aWw, ao2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aWw).OY();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aWw);
    }
}

