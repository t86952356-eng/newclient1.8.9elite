/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockPane
extends Block {
    public static final PropertyBool aXp = PropertyBool.cs("north");
    public static final PropertyBool aXq = PropertyBool.cs("east");
    public static final PropertyBool aXr = PropertyBool.cs("south");
    public static final PropertyBool aXs = PropertyBool.cs("west");
    private final boolean aXt;

    protected BlockPane(Material material, boolean bl2) {
        super(material);
        this.h(this.aSG.zS().a(aXp, false).a(aXq, false).a(aXr, false).a(aXs, false));
        this.aXt = bl2;
        this.a(a.cpy);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(aXp, this.o(l2.L(b2.aqZ()).df())).a(aXr, this.o(l2.L(b2.ara()).df())).a(aXs, this.o(l2.L(b2.arb()).df())).a(aXq, this.o(l2.L(b2.arc()).df()));
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return !this.aXt ? null : super.a(iBlockState, random, n2);
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
    public boolean a(l l2, b b2, ao ao2) {
        return l2.L(b2).df() != this && super.a(l2, b2, ao2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.util.a a2, List<net.minecraft.util.a> list, c c2) {
        boolean bl2 = this.o(w2.L(b2.aqZ()).df());
        boolean bl3 = this.o(w2.L(b2.ara()).df());
        boolean bl4 = this.o(w2.L(b2.arb()).df());
        boolean bl5 = this.o(w2.L(b2.arc()).df());
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47) {
            if ((!bl4 || !bl5) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl4) {
                    this.a(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                } else if (bl5) {
                    this.a(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                }
            } else {
                this.a(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.a(w2, b2, iBlockState, a2, list, c2);
            }
            if ((!bl2 || !bl3) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl2) {
                    this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                } else if (bl3) {
                    this.a(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                }
            } else {
                this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
                super.a(w2, b2, iBlockState, a2, list, c2);
            }
        } else {
            if ((!bl4 || !bl5) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl4) {
                    this.a(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                } else if (bl5) {
                    this.a(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                }
            } else {
                this.a(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.a(w2, b2, iBlockState, a2, list, c2);
            }
            if ((!bl2 || !bl3) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl2) {
                    this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                } else if (bl3) {
                    this.a(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                    super.a(w2, b2, iBlockState, a2, list, c2);
                }
            } else {
                this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
                super.a(w2, b2, iBlockState, a2, list, c2);
            }
        }
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.4375f;
        float f3 = 0.5625f;
        float f4 = 0.4375f;
        float f5 = 0.5625f;
        boolean bl2 = this.o(l2.L(b2.aqZ()).df());
        boolean bl3 = this.o(l2.L(b2.ara()).df());
        boolean bl4 = this.o(l2.L(b2.arb()).df());
        boolean bl5 = this.o(l2.L(b2.arc()).df());
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47) {
            if ((!bl4 || !bl5) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl4) {
                    f2 = 0.0f;
                } else if (bl5) {
                    f3 = 1.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 1.0f;
            }
            if ((!bl2 || !bl3) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl2) {
                    f4 = 0.0f;
                } else if (bl3) {
                    f5 = 1.0f;
                }
            } else {
                f4 = 0.0f;
                f5 = 1.0f;
            }
        } else {
            if ((!bl4 || !bl5) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl4) {
                    f2 = 0.0f;
                }
            } else if (bl4) {
                f2 = 0.0f;
                f3 = 1.0f;
            }
            if ((!bl2 || !bl3) && (bl4 || bl5 || bl2 || bl3)) {
                if (bl2) {
                    f4 = 0.0f;
                } else if (bl3) {
                    f5 = 1.0f;
                }
            } else if (bl2) {
                f4 = 0.0f;
                f5 = 1.0f;
            }
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
    }

    public final boolean o(Block block) {
        return block.isFullBlock() || block == this || block == Blocks.cLy || block == Blocks.cOI || block == Blocks.cOJ || block instanceof BlockPane;
    }

    @Override
    protected boolean xy() {
        return true;
    }

    @Override
    public av xo() {
        return av.dxW;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXp, aXq, aXs, aXr);
    }
}

