/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.ap;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.e;
import net.minecraft.world.g;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class a
implements l {
    protected int ddn;
    protected int ddo;
    protected net.minecraft.world.chunk.a[][] dBI;
    protected boolean dBJ;
    protected w baU;

    public a(w w2, b b2, b b3, int n2) {
        int n3;
        int n4;
        this.baU = w2;
        this.ddn = b2.wt() - n2 >> 4;
        this.ddo = b2.wx() - n2 >> 4;
        int n5 = b3.wt() + n2 >> 4;
        int n6 = b3.wx() + n2 >> 4;
        this.dBI = new net.minecraft.world.chunk.a[n5 - this.ddn + 1][n6 - this.ddo + 1];
        this.dBJ = true;
        for (n4 = this.ddn; n4 <= n5; ++n4) {
            for (n3 = this.ddo; n3 <= n6; ++n3) {
                this.dBI[n4 - this.ddn][n3 - this.ddo] = w2.aL(n4, n3);
            }
        }
        for (n4 = b2.wt() >> 4; n4 <= b3.wt() >> 4; ++n4) {
            for (n3 = b2.wx() >> 4; n3 <= b3.wx() >> 4; ++n3) {
                net.minecraft.world.chunk.a a2 = this.dBI[n4 - this.ddn][n3 - this.ddo];
                if (a2 == null || a2.aW(b2.wu(), b3.wu())) continue;
                this.dBJ = false;
            }
        }
    }

    @Override
    public boolean auN() {
        return this.dBJ;
    }

    @Override
    public d K(b b2) {
        int n2 = (b2.wt() >> 4) - this.ddn;
        int n3 = (b2.wx() >> 4) - this.ddo;
        return this.dBI[n2][n3].a(b2, e.dJf);
    }

    @Override
    public int b(b b2, int n2) {
        int n3 = this.a(g.dBZ, b2);
        int n4 = this.a(g.dCa, b2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    @Override
    public IBlockState L(b b2) {
        if (b2.wu() >= 0 && b2.wu() < 256) {
            net.minecraft.world.chunk.a a2;
            int n2 = (b2.wt() >> 4) - this.ddn;
            int n3 = (b2.wx() >> 4) - this.ddo;
            if (n2 >= 0 && n2 < this.dBI.length && n3 >= 0 && n3 < this.dBI[n2].length && (a2 = this.dBI[n2][n3]) != null) {
                return a2.L(b2);
            }
        }
        return Blocks.cLc.xM();
    }

    @Override
    public j aF(b b2) {
        return this.baU.aF(b2);
    }

    private int a(g g2, b b2) {
        if (g2 == g.dBZ && this.baU.dDl.awf()) {
            return 0;
        }
        if (b2.wu() >= 0 && b2.wu() < 256) {
            if (this.L(b2).df().xa()) {
                int n2 = 0;
                for (ao ao2 : ao.values()) {
                    int n3 = this.b(g2, b2.x(ao2));
                    if (n3 > n2) {
                        n2 = n3;
                    }
                    if (n2 < 15) continue;
                    return n2;
                }
                return n2;
            }
            int n4 = (b2.wt() >> 4) - this.ddn;
            int n5 = (b2.wx() >> 4) - this.ddo;
            return this.dBI[n4][n5].b(g2, b2);
        }
        return g2.dCb;
    }

    @Override
    public boolean aG(b b2) {
        return this.L(b2).df().xb() == Material.beo;
    }

    public int b(g g2, b b2) {
        if (b2.wu() >= 0 && b2.wu() < 256) {
            int n2 = (b2.wt() >> 4) - this.ddn;
            int n3 = (b2.wx() >> 4) - this.ddo;
            return this.dBI[n2][n3].b(g2, b2);
        }
        return g2.dCb;
    }

    @Override
    public int i(b b2, ao ao2) {
        IBlockState iBlockState = this.L(b2);
        return iBlockState.df().b(this, b2, iBlockState, ao2);
    }

    @Override
    public ap agn() {
        return this.baU.agn();
    }
}

