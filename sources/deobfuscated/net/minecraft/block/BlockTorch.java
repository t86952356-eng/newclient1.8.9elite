/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockTorch$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class BlockTorch
extends Block {
    public static final PropertyDirection bcF = PropertyDirection.a("facing", new BlockTorch$1());

    protected BlockTorch() {
        super(Material.beE);
        this.h(this.aSG.zS().a(bcF, ao.dwr));
        this.O(true);
        this.a(a.cpy);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    private boolean W(w w2, b b2) {
        if (w.v(w2, b2)) {
            return true;
        }
        Block block = w2.L(b2).df();
        return block instanceof BlockFence || block == Blocks.cLy || block == Blocks.cOb || block == Blocks.cOI;
    }

    @Override
    public boolean d(w w2, b b2) {
        for (ao ao2 : bcF.zL()) {
            if (!this.h(w2, b2, ao2)) continue;
            return true;
        }
        return false;
    }

    private boolean h(w w2, b b2, ao ao2) {
        b b3 = b2.x(ao2.asC());
        boolean bl2 = ao2.asL().asP();
        return bl2 && w2.e(b3, true) || ao2.equals(ao.dwr) && this.W(w2, b3);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        if (this.h(w2, b2, ao2)) {
            return this.xM().a(bcF, ao2);
        }
        for (ao ao3 : ar.dwT) {
            if (!w2.e(b2.x(ao3.asC()), true)) continue;
            return this.xM().a(bcF, ao3);
        }
        return this.xM();
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.g(w2, b2, iBlockState);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.K(w2, b2, iBlockState);
    }

    protected boolean K(w w2, b b2, IBlockState iBlockState) {
        if (!this.g(w2, b2, iBlockState)) {
            return true;
        }
        ao ao2 = iBlockState.b(bcF);
        ap ap2 = ao2.asL();
        ao ao3 = ao2.asC();
        boolean bl2 = false;
        if (ap2.asP() && !w2.e(b2.x(ao3), true)) {
            bl2 = true;
        } else if (ap2.asO() && !this.W(w2, b2.x(ao3))) {
            bl2 = true;
        }
        if (bl2) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
            return true;
        }
        return false;
    }

    protected boolean g(w w2, b b2, IBlockState iBlockState) {
        if (iBlockState.df() == this && this.h(w2, b2, iBlockState.b(bcF))) {
            return true;
        }
        if (w2.L(b2).df() == this) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
        return false;
    }

    @Override
    public ce a(w w2, b b2, da da2, da da3) {
        ao ao2 = w2.L(b2).b(bcF);
        float f2 = 0.15f;
        if (ao2 == ao.dwv) {
            this.a(0.0f, 0.2f, 0.5f - f2, f2 * 2.0f, 0.8f, 0.5f + f2);
        } else if (ao2 == ao.dwu) {
            this.a(1.0f - f2 * 2.0f, 0.2f, 0.5f - f2, 1.0f, 0.8f, 0.5f + f2);
        } else if (ao2 == ao.dwt) {
            this.a(0.5f - f2, 0.2f, 0.0f, 0.5f + f2, 0.8f, f2 * 2.0f);
        } else if (ao2 == ao.dws) {
            this.a(0.5f - f2, 0.2f, 1.0f - f2 * 2.0f, 0.5f + f2, 0.8f, 1.0f);
        } else {
            f2 = 0.1f;
            this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.6f, 0.5f + f2);
        }
        return super.a(w2, b2, da2, da3);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        ao ao2 = iBlockState.b(bcF);
        double d2 = (double)b2.wt() + 0.5;
        double d3 = (double)b2.wu() + 0.7;
        double d4 = (double)b2.wx() + 0.5;
        double d5 = 0.22;
        double d6 = 0.27;
        if (ao2.asL().asP()) {
            ao ao3 = ao2.asC();
            w2.a(as.dxh, d2 + 0.27 * (double)ao3.asH(), d3 + 0.22, d4 + 0.27 * (double)ao3.asJ(), 0.0, 0.0, 0.0, new int[0]);
            w2.a(as.dxw, d2 + 0.27 * (double)ao3.asH(), d3 + 0.22, d4 + 0.27 * (double)ao3.asJ(), 0.0, 0.0, 0.0, new int[0]);
        } else {
            w2.a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            w2.a(as.dxw, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM();
        switch (n2) {
            case 1: {
                iBlockState = iBlockState.a(bcF, ao.dwv);
                break;
            }
            case 2: {
                iBlockState = iBlockState.a(bcF, ao.dwu);
                break;
            }
            case 3: {
                iBlockState = iBlockState.a(bcF, ao.dwt);
                break;
            }
            case 4: {
                iBlockState = iBlockState.a(bcF, ao.dws);
                break;
            }
            default: {
                iBlockState = iBlockState.a(bcF, ao.dwr);
            }
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        switch (iBlockState.b(bcF)) {
            case dwv: {
                n2 |= 1;
                break;
            }
            case dwu: {
                n2 |= 2;
                break;
            }
            case dwt: {
                n2 |= 3;
                break;
            }
            case dws: {
                n2 |= 4;
                break;
            }
            default: {
                n2 |= 5;
            }
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcF);
    }
}

