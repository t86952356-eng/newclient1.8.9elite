/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class ar
extends d {
    public static final int[] cWc = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};

    public ar() {
        this.bM(true);
        this.fW(0);
        this.d(a.cpH);
    }

    @Override
    public String ao(co co2) {
        int n2 = co2.yc();
        return super.xB() + "." + b.fR(n2).xB();
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, net.minecraft.util.b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState;
        Block block;
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        b b3 = b.fR(co2.yc());
        if (b3 == b.cUC) {
            if (ar.a(co2, w2, b2)) {
                if (!w2.dDw) {
                    w2.e(2005, b2, 0);
                }
                return true;
            }
        } else if (b3 == b.cUO && (block = (iBlockState = w2.L(b2)).df()) == Blocks.cLt && iBlockState.b(BlockPlanks.aXI) == BlockPlanks$EnumType.aXM) {
            if (ao2 == ao.dwq) {
                return false;
            }
            if (ao2 == ao.dwr) {
                return false;
            }
            if (w2.aG(b2 = b2.x(ao2))) {
                IBlockState iBlockState2 = Blocks.cNP.a(w2, b2, ao2, f2, f3, f4, 0, a2);
                w2.a(b2, iBlockState2, 2);
                if (!a2.cIt.cJM) {
                    --co2.cWZ;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(co co2, w w2, net.minecraft.util.b b2) {
        IGrowable iGrowable;
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() instanceof IGrowable && (iGrowable = (IGrowable)((Object)iBlockState.df())).a(w2, b2, iBlockState, w2.dDw)) {
            if (!w2.dDw) {
                if (iGrowable.a(w2, w2.dDk, b2, iBlockState)) {
                    iGrowable.b(w2, w2.dDk, b2, iBlockState);
                }
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }

    public static void e(w w2, net.minecraft.util.b b2, int n2) {
        Block block;
        if (n2 == 0) {
            n2 = 15;
        }
        if ((block = w2.L(b2).df()).xb() != Material.beo) {
            block.c((l)w2, b2);
            for (int i2 = 0; i2 < n2; ++i2) {
                double d2 = cVm.nextGaussian() * 0.02;
                double d3 = cVm.nextGaussian() * 0.02;
                double d4 = cVm.nextGaussian() * 0.02;
                w2.a(as.dxr, (float)b2.wt() + cVm.nextFloat(), (double)b2.wu() + (double)cVm.nextFloat() * block.xs(), (double)((float)b2.wx() + cVm.nextFloat()), d2, d3, d4, new int[0]);
            }
        }
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, r r2) {
        if (r2 instanceof u) {
            u u2 = (u)r2;
            b b2 = b.fR(co2.yc());
            if (!u2.abj() && u2.abi() != b2) {
                u2.b(b2);
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new co(d2, 1, i2));
        }
    }
}

