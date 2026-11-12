/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.a;
import net.minecraft.entity.r;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockButton
extends Block {
    public static final PropertyDirection aTk = PropertyDirection.ct("facing");
    public static final PropertyBool aTl = PropertyBool.cs("powered");
    private final boolean aTm;

    protected BlockButton(boolean bl2) {
        super(Material.beE);
        this.h(this.aSG.zS().a(aTk, ao.dws).a(aTl, false));
        this.O(true);
        this.a(net.minecraft.creativetab.a.cpz);
        this.aTm = bl2;
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public int c(w w2) {
        return this.aTm ? 30 : 20;
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
    public boolean a(w w2, b b2, ao ao2) {
        return BlockButton.b(w2, b2, ao2.asC());
    }

    @Override
    public boolean d(w w2, b b2) {
        for (ao ao2 : ao.values()) {
            if (!BlockButton.b(w2, b2, ao2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean b(w w2, b b2, ao ao2) {
        b b3 = b2.x(ao2);
        return ao2 == ao.dwq ? w.v(w2, b3) : w2.L(b3).df().xd();
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return BlockButton.b(w2, b2, ao2.asC()) ? this.xM().a(aTk, ao2).a(aTl, false) : this.xM().a(aTk, ao.dwq).a(aTl, false);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (this.g(w2, b2, iBlockState) && !BlockButton.b(w2, b2, iBlockState.b(aTk).asC())) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    private boolean g(w w2, b b2, IBlockState iBlockState) {
        if (this.d(w2, b2)) {
            return true;
        }
        this.a(w2, b2, iBlockState, 0);
        w2.aL(b2);
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        this.k(l2.L(b2));
    }

    private void k(IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aTk);
        boolean bl2 = iBlockState.b(aTl);
        float f2 = 0.25f;
        float f3 = 0.375f;
        float f4 = (float)(bl2 ? 1 : 2) / 16.0f;
        float f5 = 0.125f;
        float f6 = 0.1875f;
        switch (ao2) {
            case dwv: {
                this.a(0.0f, 0.375f, 0.3125f, f4, 0.625f, 0.6875f);
                break;
            }
            case dwu: {
                this.a(1.0f - f4, 0.375f, 0.3125f, 1.0f, 0.625f, 0.6875f);
                break;
            }
            case dwt: {
                this.a(0.3125f, 0.375f, 0.0f, 0.6875f, 0.625f, f4);
                break;
            }
            case dws: {
                this.a(0.3125f, 0.375f, 1.0f - f4, 0.6875f, 0.625f, 1.0f);
                break;
            }
            case dwr: {
                this.a(0.3125f, 0.0f, 0.375f, 0.6875f, 0.0f + f4, 0.625f);
                break;
            }
            case dwq: {
                this.a(0.3125f, 1.0f - f4, 0.375f, 0.6875f, 1.0f, 0.625f);
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (iBlockState.b(aTl).booleanValue()) {
            return true;
        }
        w2.a(b2, iBlockState.a(aTl, true), 3);
        w2.f(b2, b2);
        w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.6f);
        this.c(w2, b2, iBlockState.b(aTk));
        w2.a(b2, (Block)this, this.c(w2));
        return true;
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (iBlockState.b(aTl).booleanValue()) {
            this.c(w2, b2, iBlockState.b(aTk));
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aTl) != false ? 15 : 0;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aTl) == false ? 0 : (iBlockState.b(aTk) == ao2 ? 15 : 0);
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && iBlockState.b(aTl).booleanValue()) {
            if (this.aTm) {
                this.h(w2, b2, iBlockState);
            } else {
                w2.d(b2, iBlockState.a(aTl, false));
                this.c(w2, b2, iBlockState.b(aTk));
                w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.5f);
                w2.f(b2, b2);
            }
        }
    }

    @Override
    public void xx() {
        float f2 = 0.1875f;
        float f3 = 0.125f;
        float f4 = 0.125f;
        this.a(0.3125f, 0.375f, 0.375f, 0.6875f, 0.625f, 0.625f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        if (!w2.dDw && this.aTm && !iBlockState.b(aTl).booleanValue()) {
            this.h(w2, b2, iBlockState);
        }
    }

    private void h(w w2, b b2, IBlockState iBlockState) {
        this.k(iBlockState);
        List<a> list = w2.a(a.class, new net.minecraft.util.a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (double)b2.wu() + this.aSz, (double)b2.wx() + this.aSA));
        boolean bl2 = !list.isEmpty();
        boolean bl3 = iBlockState.b(aTl);
        if (bl2 && !bl3) {
            w2.d(b2, iBlockState.a(aTl, true));
            this.c(w2, b2, iBlockState.b(aTk));
            w2.f(b2, b2);
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!bl2 && bl3) {
            w2.d(b2, iBlockState.a(aTl, false));
            this.c(w2, b2, iBlockState.b(aTk));
            w2.f(b2, b2);
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (bl2) {
            w2.a(b2, (Block)this, this.c(w2));
        }
    }

    private void c(w w2, b b2, ao ao2) {
        w2.c(b2, this);
        w2.c(b2.x(ao2.asC()), this);
    }

    @Override
    public IBlockState aM(int n2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    @Override
    public int c(IBlockState iBlockState) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTk, aTl);
    }
}

