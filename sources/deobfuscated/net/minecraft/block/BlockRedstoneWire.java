/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire$EnumAttachPosition;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockRedstoneWire
extends Block {
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> aZN = PropertyEnum.c("north", BlockRedstoneWire$EnumAttachPosition.class);
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> aZO = PropertyEnum.c("east", BlockRedstoneWire$EnumAttachPosition.class);
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> aZP = PropertyEnum.c("south", BlockRedstoneWire$EnumAttachPosition.class);
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> aZQ = PropertyEnum.c("west", BlockRedstoneWire$EnumAttachPosition.class);
    public static final PropertyInteger aZR = PropertyInteger.e("power", 0, 15);
    private boolean aZS = true;
    private final Set<b> aZT = Sets.newHashSet();

    public BlockRedstoneWire() {
        super(Material.beE);
        this.h(this.aSG.zS().a(aZN, BlockRedstoneWire$EnumAttachPosition.aZW).a(aZO, BlockRedstoneWire$EnumAttachPosition.aZW).a(aZP, BlockRedstoneWire$EnumAttachPosition.aZW).a(aZQ, BlockRedstoneWire$EnumAttachPosition.aZW).a(aZR, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        iBlockState = iBlockState.a(aZQ, this.d(l2, b2, ao.dwu));
        iBlockState = iBlockState.a(aZO, this.d(l2, b2, ao.dwv));
        iBlockState = iBlockState.a(aZN, this.d(l2, b2, ao.dws));
        iBlockState = iBlockState.a(aZP, this.d(l2, b2, ao.dwt));
        return iBlockState;
    }

    private BlockRedstoneWire$EnumAttachPosition d(l l2, b b2, ao ao2) {
        b b3 = b2.x(ao2);
        Block block = l2.L(b2.x(ao2)).df();
        if (!(BlockRedstoneWire.a(l2.L(b3), ao2) || !block.xc() && BlockRedstoneWire.v(l2.L(b3.aqY())))) {
            Block block2 = l2.L(b2.aqX()).df();
            return !block2.xc() && block.xc() && BlockRedstoneWire.v(l2.L(b3.aqX())) ? BlockRedstoneWire$EnumAttachPosition.aZU : BlockRedstoneWire$EnumAttachPosition.aZW;
        }
        return BlockRedstoneWire$EnumAttachPosition.aZV;
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
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

    @Override
    public int a(l l2, b b2, int n2) {
        IBlockState iBlockState = l2.L(b2);
        return iBlockState.df() != this ? super.a(l2, b2, n2) : this.bi(iBlockState.b(aZR));
    }

    @Override
    public boolean d(w w2, b b2) {
        return w.v(w2, b2.aqY()) || w2.L(b2.aqY()).df() == Blocks.cMZ;
    }

    private IBlockState E(w w2, b b2, IBlockState iBlockState) {
        iBlockState = this.a(w2, b2, b2, iBlockState);
        ArrayList arrayList = Lists.newArrayList(this.aZT);
        this.aZT.clear();
        for (b b3 : arrayList) {
            w2.c(b3, this);
        }
        return iBlockState;
    }

    private IBlockState a(w w2, b b2, b b3, IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        int n2 = iBlockState.b(aZR);
        int n3 = 0;
        n3 = this.d(w2, b3, n3);
        this.aZS = false;
        int n4 = w2.bc(b2);
        this.aZS = true;
        if (n4 > 0 && n4 > n3 - 1) {
            n3 = n4;
        }
        int n5 = 0;
        for (ao ao2 : ar.dwT) {
            boolean bl2;
            b b4 = b2.x(ao2);
            boolean bl3 = bl2 = b4.wt() != b3.wt() || b4.wx() != b3.wx();
            if (bl2) {
                n5 = this.d(w2, b4, n5);
            }
            if (w2.L(b4).df().xd() && !w2.L(b2.aqX()).df().xd()) {
                if (!bl2 || b2.wu() < b3.wu()) continue;
                n5 = this.d(w2, b4.aqX(), n5);
                continue;
            }
            if (w2.L(b4).df().xd() || !bl2 || b2.wu() > b3.wu()) continue;
            n5 = this.d(w2, b4.aqY(), n5);
        }
        n3 = n5 > n3 ? n5 - 1 : (n3 > 0 ? --n3 : 0);
        if (n4 > n3 - 1) {
            n3 = n4;
        }
        if (n2 != n3) {
            iBlockState = iBlockState.a(aZR, n3);
            if (w2.L(b2) == iBlockState2) {
                w2.a(b2, iBlockState, 2);
            }
            this.aZT.add(b2);
            for (ao ao3 : ao.values()) {
                this.aZT.add(b2.x(ao3));
            }
        }
        return iBlockState;
    }

    private void S(w w2, b b2) {
        if (w2.L(b2).df() == this) {
            w2.c(b2, this);
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            this.E(w2, b2, iBlockState);
            for (ao ao2 : ar.dwU) {
                w2.c(b2.x(ao2), this);
            }
            for (ao ao2 : ar.dwT) {
                this.S(w2, b2.x(ao2));
            }
            for (ao ao2 : ar.dwT) {
                b b3 = b2.x(ao2);
                if (w2.L(b3).df().xd()) {
                    this.S(w2, b3.aqX());
                    continue;
                }
                this.S(w2, b3.aqY());
            }
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        if (!w2.dDw) {
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
            this.E(w2, b2, iBlockState);
            for (ao ao3 : ar.dwT) {
                this.S(w2, b2.x(ao3));
            }
            for (ao ao4 : ar.dwT) {
                b b3 = b2.x(ao4);
                if (w2.L(b3).df().xd()) {
                    this.S(w2, b3.aqX());
                    continue;
                }
                this.S(w2, b3.aqY());
            }
        }
    }

    private int d(w w2, b b2, int n2) {
        if (w2.L(b2).df() != this) {
            return n2;
        }
        int n3 = w2.L(b2).b(aZR);
        return n3 > n2 ? n3 : n2;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            if (this.d(w2, b2)) {
                this.E(w2, b2, iBlockState);
            } else {
                this.a(w2, b2, iBlockState, 0);
                w2.aL(b2);
            }
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQG;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return !this.aZS ? 0 : this.a(l2, b2, iBlockState, ao2);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        if (!this.aZS) {
            return 0;
        }
        int n2 = iBlockState.b(aZR);
        if (n2 == 0) {
            return 0;
        }
        if (ao2 == ao.dwr) {
            return n2;
        }
        EnumSet<ao> enumSet = EnumSet.noneOf(ao.class);
        for (ao ao3 : ar.dwT) {
            if (!this.e(l2, b2, ao3)) continue;
            enumSet.add(ao3);
        }
        if (ao2.asL().asP() && enumSet.isEmpty()) {
            return n2;
        }
        if (enumSet.contains(ao2) && !enumSet.contains(ao2.asG()) && !enumSet.contains(ao2.asD())) {
            return n2;
        }
        return 0;
    }

    private boolean e(l l2, b b2, ao ao2) {
        b b3 = b2.x(ao2);
        IBlockState iBlockState = l2.L(b3);
        Block block = iBlockState.df();
        boolean bl2 = block.xd();
        boolean bl3 = l2.L(b2.aqX()).df().xd();
        return !bl3 && bl2 && BlockRedstoneWire.p(l2, b3.aqX()) || BlockRedstoneWire.a(iBlockState, ao2) || block == Blocks.cNe && iBlockState.b(BlockRedstoneDiode.aTB) == ao2 || !bl2 && BlockRedstoneWire.p(l2, b3.aqY());
    }

    protected static boolean p(l l2, b b2) {
        return BlockRedstoneWire.v(l2.L(b2));
    }

    protected static boolean v(IBlockState iBlockState) {
        return BlockRedstoneWire.a(iBlockState, null);
    }

    protected static boolean a(IBlockState iBlockState, ao ao2) {
        Block block = iBlockState.df();
        if (block == Blocks.cMh) {
            return true;
        }
        if (Blocks.cNd.s(block)) {
            ao ao3 = iBlockState.b(BlockRedstoneRepeater.aTB);
            return ao3 == ao2 || ao3.asC() == ao2;
        }
        return block.xw() && ao2 != null;
    }

    @Override
    public boolean xw() {
        return this.aZS;
    }

    private int bi(int n2) {
        float f2 = (float)n2 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        if (n2 == 0) {
            f3 = 0.3f;
        }
        float f4 = f2 * f2 * 0.7f - 0.5f;
        float f5 = f2 * f2 * 0.6f - 0.7f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        int n3 = bt.F((int)(f3 * 255.0f), 0, 255);
        int n4 = bt.F((int)(f4 * 255.0f), 0, 255);
        int n5 = bt.F((int)(f5 * 255.0f), 0, 255);
        return 0xFF000000 | n3 << 16 | n4 << 8 | n5;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2 = iBlockState.b(aZR);
        if (n2 != 0) {
            double d2 = (double)b2.wt() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d3 = (float)b2.wu() + 0.0625f;
            double d4 = (double)b2.wx() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f2 = (float)n2 / 15.0f;
            float f3 = f2 * 0.6f + 0.4f;
            float f4 = Math.max(0.0f, f2 * f2 * 0.7f - 0.5f);
            float f5 = Math.max(0.0f, f2 * f2 * 0.6f - 0.7f);
            w2.a(as.dxA, d2, d3, d4, (double)f3, (double)f4, (double)f5, new int[0]);
        }
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cQG;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aZR, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aZR);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aZN, aZO, aZP, aZQ, aZR);
    }
}

