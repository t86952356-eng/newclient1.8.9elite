/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.z;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.structure.cx;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

abstract class dm
extends y {
    protected int dSR = -1;
    private int dSS;
    private boolean dST;

    public dm() {
    }

    protected dm(dk dk2, int n2) {
        super(n2);
        if (dk2 != null) {
            this.dST = dk2.dSM;
        }
    }

    @Override
    protected void N(n n2) {
        n2.B("HPos", this.dSR);
        n2.B("VCount", this.dSS);
        n2.o("Desert", this.dST);
    }

    @Override
    protected void O(n n2) {
        this.dSR = n2.eG("HPos");
        this.dSS = n2.eG("VCount");
        this.dST = n2.eO("Desert");
    }

    protected y a(dk dk2, List<y> list, Random random, int n2, int n3) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return cx.b(dk2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS());
                }
                case dwt: {
                    return cx.b(dk2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS());
                }
                case dwu: {
                    return cx.b(dk2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS());
                }
                case dwv: {
                    return cx.b(dk2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS());
                }
            }
        }
        return null;
    }

    protected y b(dk dk2, List<y> list, Random random, int n2, int n3) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return cx.b(dk2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS());
                }
                case dwt: {
                    return cx.b(dk2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS());
                }
                case dwu: {
                    return cx.b(dk2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS());
                }
                case dwv: {
                    return cx.b(dk2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS());
                }
            }
        }
        return null;
    }

    protected int b(net.minecraft.world.w w2, w w3) {
        int n2 = 0;
        int n3 = 0;
        g g2 = new g();
        for (int i2 = this.dQI.dQD; i2 <= this.dQI.dQG; ++i2) {
            for (int i3 = this.dQI.dQB; i3 <= this.dQI.dQE; ++i3) {
                g2.E(i3, 64, i2);
                if (!w3.k(g2)) continue;
                n2 += Math.max(w2.aT(g2).wu(), w2.dDl.awb());
                ++n3;
            }
        }
        if (n3 == 0) {
            return -1;
        }
        return n2 / n3;
    }

    protected static boolean f(w w2) {
        return w2 != null && w2.dQC > 10;
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5) {
        if (this.dSS < n5) {
            int n6;
            int n7;
            int n8;
            for (int i2 = this.dSS; i2 < n5 && w3.k(new b(n8 = this.bn(n2 + i2, n4), n7 = this.iH(n3), n6 = this.bo(n2 + i2, n4))); ++i2) {
                ++this.dSS;
                z z2 = new z(w2);
                z2.b((double)n8 + 0.5, (double)n7, (double)n6 + 0.5, 0.0f, 0.0f);
                z2.a(w2.bg(new b(z2)), null);
                z2.fA(this.bq(i2, z2.abq()));
                w2.G(z2);
            }
        }
    }

    protected int bq(int n2, int n3) {
        return n3;
    }

    protected IBlockState F(IBlockState iBlockState) {
        if (this.dST) {
            if (iBlockState.df() == Blocks.cLt || iBlockState.df() == Blocks.cLu) {
                return Blocks.cLC.xM();
            }
            if (iBlockState.df() == Blocks.cLg) {
                return Blocks.cLC.aM(BlockSandStone$EnumType.bal.yc());
            }
            if (iBlockState.df() == Blocks.cLh) {
                return Blocks.cLC.aM(BlockSandStone$EnumType.ban.yc());
            }
            if (iBlockState.df() == Blocks.cMf) {
                return Blocks.cNQ.xM().a(BlockStairs.baZ, iBlockState.b(BlockStairs.baZ));
            }
            if (iBlockState.df() == Blocks.cMy) {
                return Blocks.cNQ.xM().a(BlockStairs.baZ, iBlockState.b(BlockStairs.baZ));
            }
            if (iBlockState.df() == Blocks.cLp) {
                return Blocks.cLC.xM();
            }
        }
        return iBlockState;
    }

    @Override
    protected void a(net.minecraft.world.w w2, IBlockState iBlockState, int n2, int n3, int n4, w w3) {
        IBlockState iBlockState2 = this.F(iBlockState);
        super.a(w2, iBlockState2, n2, n3, n4, w3);
    }

    @Override
    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl2) {
        IBlockState iBlockState3 = this.F(iBlockState);
        IBlockState iBlockState4 = this.F(iBlockState2);
        super.a(w2, w3, n2, n3, n4, n5, n6, n7, iBlockState3, iBlockState4, bl2);
    }

    @Override
    protected void b(net.minecraft.world.w w2, IBlockState iBlockState, int n2, int n3, int n4, w w3) {
        IBlockState iBlockState2 = this.F(iBlockState);
        super.b(w2, iBlockState2, n2, n3, n4, w3);
    }

    protected void cE(boolean bl2) {
        this.dST = bl2;
    }
}

