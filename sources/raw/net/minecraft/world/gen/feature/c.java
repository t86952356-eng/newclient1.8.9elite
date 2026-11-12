/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.feature;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.d;
import net.minecraft.world.w;

public class c
extends a {
    private Random ta;
    private w jG;
    private b dNS = b.dtN;
    int dNT;
    int height;
    double dNU = 0.618;
    double dNV = 0.381;
    double dNW = 1.0;
    double dNX = 1.0;
    int dNY = 1;
    int dNZ = 12;
    int dOa = 4;
    List<d> dOb;

    public c(boolean bl2) {
        super(bl2);
    }

    void ayt() {
        int n2;
        int n3;
        this.height = (int)((double)this.dNT * this.dNU);
        if (this.height >= this.dNT) {
            this.height = this.dNT - 1;
        }
        if ((n3 = (int)(1.382 + Math.pow(this.dNX * (double)this.dNT / 13.0, 2.0))) < 1) {
            n3 = 1;
        }
        int n4 = this.dNS.wu() + this.height;
        this.dOb = Lists.newArrayList();
        this.dOb.add(new d(this.dNS.hq(n2), n4));
        for (n2 = this.dNT - this.dOa; n2 >= 0; --n2) {
            float f2 = this.iy(n2);
            if (!(f2 >= 0.0f)) continue;
            for (int i2 = 0; i2 < n3; ++i2) {
                b b2;
                double d2;
                double d3;
                double d4 = this.dNW * (double)f2 * ((double)this.ta.nextFloat() + 0.328);
                double d5 = d4 * Math.sin(d3 = (double)(this.ta.nextFloat() * 2.0f) * Math.PI) + 0.5;
                b b3 = this.dNS.ag(d5, n2 - 1, d2 = d4 * Math.cos(d3) + 0.5);
                if (this.h(b3, b2 = b3.hq(this.dOa)) != -1) continue;
                int n5 = this.dNS.wt() - b3.wt();
                int n6 = this.dNS.wx() - b3.wx();
                double d6 = (double)b3.wu() - Math.sqrt(n5 * n5 + n6 * n6) * this.dNV;
                int n7 = d6 > (double)n4 ? n4 : (int)d6;
                b b4 = new b(this.dNS.wt(), n7, this.dNS.wx());
                if (this.h(b4, b3) != -1) continue;
                this.dOb.add(new d(b3, b4.wu()));
            }
        }
    }

    void a(b b2, float f2, IBlockState iBlockState) {
        int n2 = (int)((double)f2 + 0.618);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                b b3;
                Material material;
                if (!(Math.pow((double)Math.abs(i2) + 0.5, 2.0) + Math.pow((double)Math.abs(i3) + 0.5, 2.0) <= (double)(f2 * f2)) || (material = this.jG.L(b3 = b2.C(i2, 0, i3)).df().xb()) != Material.beo && material != Material.bex) continue;
                this.N(this.jG, b3, iBlockState);
            }
        }
    }

    float iy(int n2) {
        if ((float)n2 < (float)this.dNT * 0.3f) {
            return -1.0f;
        }
        float f2 = (float)this.dNT / 2.0f;
        float f3 = f2 - (float)n2;
        float f4 = bt.bK(f2 * f2 - f3 * f3);
        if (f3 == 0.0f) {
            f4 = f2;
        } else if (Math.abs(f3) >= f2) {
            return 0.0f;
        }
        return f4 * 0.5f;
    }

    float iz(int n2) {
        return n2 >= 0 && n2 < this.dOa ? (n2 != 0 && n2 != this.dOa - 1 ? 3.0f : 2.0f) : -1.0f;
    }

    void bs(b b2) {
        for (int i2 = 0; i2 < this.dOa; ++i2) {
            this.a(b2.hq(i2), this.iz(i2), Blocks.cLv.xM().a(BlockLeaves.aWz, false));
        }
    }

    void a(b b2, b b3, Block block) {
        b b4 = b3.C(-b2.wt(), -b2.wu(), -b2.wx());
        int n2 = this.bt(b4);
        float f2 = (float)b4.wt() / (float)n2;
        float f3 = (float)b4.wu() / (float)n2;
        float f4 = (float)b4.wx() / (float)n2;
        for (int i2 = 0; i2 <= n2; ++i2) {
            b b5 = b2.ag(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            BlockLog$EnumAxis blockLog$EnumAxis = this.g(b2, b5);
            this.N(this.jG, b5, block.xM().a(BlockLog.aWW, blockLog$EnumAxis));
        }
    }

    private int bt(b b2) {
        int n2 = bt.hN(b2.wt());
        int n3 = bt.hN(b2.wu());
        int n4 = bt.hN(b2.wx());
        return n4 > n2 && n4 > n3 ? n4 : (n3 > n2 ? n3 : n2);
    }

    private BlockLog$EnumAxis g(b b2, b b3) {
        int n2;
        BlockLog$EnumAxis blockLog$EnumAxis = BlockLog$EnumAxis.aWZ;
        int n3 = Math.abs(b3.wt() - b2.wt());
        int n4 = Math.max(n3, n2 = Math.abs(b3.wx() - b2.wx()));
        if (n4 > 0) {
            if (n3 == n4) {
                blockLog$EnumAxis = BlockLog$EnumAxis.aWY;
            } else if (n2 == n4) {
                blockLog$EnumAxis = BlockLog$EnumAxis.aXa;
            }
        }
        return blockLog$EnumAxis;
    }

    void ayu() {
        for (d d2 : this.dOb) {
            this.bs(d2);
        }
    }

    boolean iA(int n2) {
        return (double)n2 >= (double)this.dNT * 0.2;
    }

    void ayv() {
        b b2 = this.dNS;
        b b3 = this.dNS.hq(this.height);
        Block block = Blocks.cLt;
        this.a(b2, b3, block);
        if (this.dNY == 2) {
            this.a(b2.arc(), b3.arc(), block);
            this.a(b2.arc().ara(), b3.arc().ara(), block);
            this.a(b2.ara(), b3.ara(), block);
        }
    }

    void ayw() {
        for (d d2 : this.dOb) {
            int n2 = d2.ayz();
            b b2 = new b(this.dNS.wt(), n2, this.dNS.wx());
            if (b2.equals(d2) || !this.iA(n2 - this.dNS.wu())) continue;
            this.a(b2, d2, Blocks.cLt);
        }
    }

    int h(b b2, b b3) {
        b b4 = b3.C(-b2.wt(), -b2.wu(), -b2.wx());
        int n2 = this.bt(b4);
        float f2 = (float)b4.wt() / (float)n2;
        float f3 = (float)b4.wu() / (float)n2;
        float f4 = (float)b4.wx() / (float)n2;
        if (n2 == 0) {
            return -1;
        }
        for (int i2 = 0; i2 <= n2; ++i2) {
            b b5 = b2.ag(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            if (this.L(this.jG.L(b5).df())) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void ayx() {
        this.dOa = 5;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        this.jG = w2;
        this.dNS = b2;
        this.ta = new Random(random.nextLong());
        if (this.dNT == 0) {
            this.dNT = 5 + this.ta.nextInt(this.dNZ);
        }
        if (!this.ayy()) {
            return false;
        }
        this.ayt();
        this.ayu();
        this.ayv();
        this.ayw();
        return true;
    }

    private boolean ayy() {
        Block block = this.jG.L(this.dNS.aqY()).df();
        if (block != Blocks.cLf && block != Blocks.cLe && block != Blocks.cMm) {
            return false;
        }
        int n2 = this.h(this.dNS, this.dNS.hq(this.dNT - 1));
        if (n2 == -1) {
            return true;
        }
        if (n2 < 6) {
            return false;
        }
        this.dNT = n2;
        return true;
    }
}

