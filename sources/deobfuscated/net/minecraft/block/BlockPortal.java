/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 */
package net.minecraft.block;

import com.google.common.cache.LoadingCache;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal$Size;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.bs;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.aq;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockPortal
extends BlockBreakable {
    public static final PropertyEnum<ap> aXV = PropertyEnum.a((String)"axis", ap.class, (Enum[])new ap[]{ap.dwH, ap.dwJ});

    public BlockPortal() {
        super(Material.beS, false);
        this.h(this.aSG.zS().a(aXV, ap.dwH));
        this.O(true);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        super.b(w2, b2, iBlockState, random);
        if (w2.dDl.avW() && w2.Si().gw("doMobSpawning") && random.nextInt(2000) < w2.agm().auZ()) {
            c c2;
            int n2 = b2.wu();
            b b3 = b2;
            while (!w.v(w2, b3) && b3.wu() > 0) {
                b3 = b3.aqY();
            }
            if (n2 > 0 && !w2.L(b3.aqX()).df().xd() && (c2 = bs.a(w2, 57, (double)b3.wt() + 0.5, (double)b3.wu() + 1.1, (double)b3.wx() + 0.5)) != null) {
                c2.csM = c2.TZ();
            }
        }
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public void c(l l2, b b2) {
        ap ap2 = l2.L(b2).b(aXV);
        float f2 = 0.125f;
        float f3 = 0.125f;
        if (ap2 == ap.dwH) {
            f2 = 0.5f;
        }
        if (ap2 == ap.dwJ) {
            f3 = 0.5f;
        }
        this.a(0.5f - f2, 0.0f, 0.5f - f3, 0.5f + f2, 1.0f, 0.5f + f3);
    }

    public static int b(ap ap2) {
        return ap2 == ap.dwH ? 1 : (ap2 == ap.dwJ ? 2 : 0);
    }

    @Override
    public boolean xf() {
        return false;
    }

    public boolean L(w w2, b b2) {
        BlockPortal$Size blockPortal$Size = new BlockPortal$Size(w2, b2, ap.dwH);
        if (blockPortal$Size.yG() && blockPortal$Size.aYa == 0) {
            blockPortal$Size.yH();
            return true;
        }
        BlockPortal$Size blockPortal$Size2 = new BlockPortal$Size(w2, b2, ap.dwJ);
        if (blockPortal$Size2.yG() && blockPortal$Size2.aYa == 0) {
            blockPortal$Size2.yH();
            return true;
        }
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        BlockPortal$Size blockPortal$Size;
        ap ap2 = iBlockState.b(aXV);
        if (ap2 == ap.dwH) {
            BlockPortal$Size blockPortal$Size2 = new BlockPortal$Size(w2, b2, ap.dwH);
            if (!blockPortal$Size2.yG() || blockPortal$Size2.aYa < blockPortal$Size2.aYd * blockPortal$Size2.aYc) {
                w2.d(b2, Blocks.cLc.xM());
            }
        } else if (!(ap2 != ap.dwJ || (blockPortal$Size = new BlockPortal$Size(w2, b2, ap.dwJ)).yG() && blockPortal$Size.aYa >= blockPortal$Size.aYd * blockPortal$Size.aYc)) {
            w2.d(b2, Blocks.cLc.xM());
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        ap ap2 = null;
        IBlockState iBlockState = l2.L(b2);
        if (l2.L(b2).df() == this) {
            ap2 = iBlockState.b(aXV);
            if (ap2 == null) {
                return false;
            }
            if (ap2 == ap.dwJ && ao2 != ao.dwv && ao2 != ao.dwu) {
                return false;
            }
            if (ap2 == ap.dwH && ao2 != ao.dwt && ao2 != ao.dws) {
                return false;
            }
        }
        boolean bl2 = l2.L(b2.arb()).df() == this && l2.L(b2.hu(2)).df() != this;
        boolean bl3 = l2.L(b2.arc()).df() == this && l2.L(b2.hv(2)).df() != this;
        boolean bl4 = l2.L(b2.aqZ()).df() == this && l2.L(b2.hs(2)).df() != this;
        boolean bl5 = l2.L(b2.ara()).df() == this && l2.L(b2.ht(2)).df() != this;
        boolean bl6 = bl2 || bl3 || ap2 == ap.dwH;
        boolean bl7 = bl4 || bl5 || ap2 == ap.dwJ;
        return bl6 && ao2 == ao.dwu || bl6 && ao2 == ao.dwv || bl7 && ao2 == ao.dws || bl7 && ao2 == ao.dwt;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public av xo() {
        return av.dxY;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        if (c2.crC == null && c2.crA == null) {
            c2.ac(b2);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (random.nextInt(100) == 0) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "portal.portal", 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d2 = (float)b2.wt() + random.nextFloat();
            double d3 = (float)b2.wu() + random.nextFloat();
            double d4 = (float)b2.wx() + random.nextFloat();
            double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d7 = ((double)random.nextFloat() - 0.5) * 0.5;
            int n2 = random.nextInt(2) * 2 - 1;
            if (w2.L(b2.arb()).df() != this && w2.L(b2.arc()).df() != this) {
                d2 = (double)b2.wt() + 0.5 + 0.25 * (double)n2;
                d5 = random.nextFloat() * 2.0f * (float)n2;
            } else {
                d4 = (double)b2.wx() + 0.5 + 0.25 * (double)n2;
                d7 = random.nextFloat() * 2.0f * (float)n2;
            }
            w2.a(as.dxu, d2, d3, d4, d5, d6, d7, new int[0]);
        }
    }

    @Override
    public d e(w w2, b b2) {
        return null;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXV, (n2 & 3) == 2 ? ap.dwJ : ap.dwH);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return BlockPortal.b(iBlockState.b(aXV));
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXV);
    }

    /*
     * WARNING - void declaration
     */
    public BlockPattern$PatternHelper M(w w2, b b2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }
}

