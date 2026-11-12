/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.r;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public abstract class br
extends y {
    protected static final IBlockState dRx = Blocks.cOK.aM(BlockPrismarine.aYm);
    protected static final IBlockState dRy = Blocks.cOK.aM(BlockPrismarine.aYn);
    protected static final IBlockState dRz = Blocks.cOK.aM(BlockPrismarine.aYo);
    protected static final IBlockState dRA = dRy;
    protected static final IBlockState dRB = Blocks.cOL.xM();
    protected static final IBlockState dRC = Blocks.cLl.xM();
    protected static final int dRD = br.af(2, 0, 0);
    protected static final int dRE = br.af(2, 2, 0);
    protected static final int dRF = br.af(0, 1, 0);
    protected static final int dRG = br.af(4, 1, 0);
    protected bs dRH;

    protected static final int af(int n2, int n3, int n4) {
        return n3 * 25 + n4 * 5 + n2;
    }

    public br() {
        super(0);
    }

    public br(int n2) {
        super(n2);
    }

    public br(ao ao2, w w2) {
        super(1);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    protected br(int n2, ao ao2, bs bs2, int n3, int n4, int n5) {
        super(n2);
        this.dQJ = ao2;
        this.dRH = bs2;
        int n6 = bs2.dRI;
        int n7 = n6 % 5;
        int n8 = n6 / 5 % 5;
        int n9 = n6 / 25;
        this.dQI = ao2 != ao.dws && ao2 != ao.dwt ? new w(0, 0, 0, n5 * 8 - 1, n4 * 4 - 1, n3 * 8 - 1) : new w(0, 0, 0, n3 * 8 - 1, n4 * 4 - 1, n5 * 8 - 1);
        switch (ao2) {
            case dws: {
                this.dQI.ad(n7 * 8, n9 * 4, -(n8 + n5) * 8 + 1);
                break;
            }
            case dwt: {
                this.dQI.ad(n7 * 8, n9 * 4, n8 * 8);
                break;
            }
            case dwu: {
                this.dQI.ad(-(n8 + n5) * 8 + 1, n9 * 4, n7 * 8);
                break;
            }
            default: {
                this.dQI.ad(n8 * 8, n9 * 4, n7 * 8);
            }
        }
    }

    @Override
    protected void N(n n2) {
    }

    @Override
    protected void O(n n2) {
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(w2, i3, i2, i4, w3).df().xb() == Material.beo) continue;
                    if (this.iH(i2) >= w2.avB()) {
                        this.a(w2, Blocks.cLc.xM(), i3, i2, i4, w3);
                        continue;
                    }
                    this.a(w2, dRC, i3, i2, i4, w3);
                }
            }
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, boolean bl2) {
        if (bl2) {
            this.a(w2, w3, n2 + 0, 0, n3 + 0, n2 + 2, 0, n3 + 8 - 1, dRx, dRx, false);
            this.a(w2, w3, n2 + 5, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, dRx, dRx, false);
            this.a(w2, w3, n2 + 3, 0, n3 + 0, n2 + 4, 0, n3 + 2, dRx, dRx, false);
            this.a(w2, w3, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 8 - 1, dRx, dRx, false);
            this.a(w2, w3, n2 + 3, 0, n3 + 2, n2 + 4, 0, n3 + 2, dRy, dRy, false);
            this.a(w2, w3, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 5, dRy, dRy, false);
            this.a(w2, w3, n2 + 2, 0, n3 + 3, n2 + 2, 0, n3 + 4, dRy, dRy, false);
            this.a(w2, w3, n2 + 5, 0, n3 + 3, n2 + 5, 0, n3 + 4, dRy, dRy, false);
        } else {
            this.a(w2, w3, n2 + 0, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, dRx, dRx, false);
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (this.a(w2, i3, i2, i4, w3) != dRC) continue;
                    this.a(w2, iBlockState, i3, i2, i4, w3);
                }
            }
        }
    }

    protected boolean a(w w2, int n2, int n3, int n4, int n5) {
        int n6 = this.bn(n2, n3);
        int n7 = this.bo(n2, n3);
        int n8 = this.bn(n4, n5);
        int n9 = this.bo(n4, n5);
        return w2.G(Math.min(n6, n8), Math.min(n7, n9), Math.max(n6, n8), Math.max(n7, n9));
    }

    protected boolean a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.bn(n2, n4);
        if (w3.k(new b(n7, n6 = this.iH(n3), n5 = this.bo(n2, n4)))) {
            r r2 = new r(w2);
            r2.be(true);
            r2.P(r2.getMaxHealth());
            r2.b((double)n7 + 0.5, (double)n6, (double)n5 + 0.5, 0.0f, 0.0f);
            r2.a(w2.bg(new b(r2)), null);
            w2.G(r2);
            return true;
        }
        return false;
    }
}

