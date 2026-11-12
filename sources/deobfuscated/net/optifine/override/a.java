/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.override;

import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.ap;
import net.minecraft.world.biome.j;
import net.minecraft.world.l;
import net.optifine.ao;
import net.optifine.reflect.g;

public class a
implements l {
    private final net.minecraft.world.a elE;
    private final int elF;
    private final int elG;
    private final int elH;
    private final int elI;
    private final int elJ;
    private final int elK;
    private final int elL;
    private int[] bNA;
    private IBlockState[] bNB;
    private final int elM;
    private final boolean elN = net.minecraft.src.a.apa();
    private static final net.optifine.util.a elO = new net.optifine.util.a(Integer.TYPE, 16);
    private static final net.optifine.util.a elP = new net.optifine.util.a(IBlockState.class, 16);

    public a(net.minecraft.world.a a2, b b2, b b3, int n2) {
        this.elE = a2;
        int n3 = b2.wt() - n2 >> 4;
        int n4 = b2.wu() - n2 >> 4;
        int n5 = b2.wx() - n2 >> 4;
        int n6 = b3.wt() + n2 >> 4;
        int n7 = b3.wu() + n2 >> 4;
        int n8 = b3.wx() + n2 >> 4;
        this.elI = n6 - n3 + 1 << 4;
        this.elJ = n7 - n4 + 1 << 4;
        this.elK = n8 - n5 + 1 << 4;
        this.elL = this.elI * this.elJ;
        this.elM = this.elI * this.elJ * this.elK;
        this.elF = n3 << 4;
        this.elG = n4 << 4;
        this.elH = n5 << 4;
    }

    private int N(b b2) {
        int n2 = b2.wt() - this.elF;
        if (n2 >= 0 && n2 < this.elI) {
            int n3 = b2.wu() - this.elG;
            if (n3 >= 0 && n3 < this.elJ) {
                int n4 = b2.wx() - this.elH;
                return n4 >= 0 && n4 < this.elK ? n4 * this.elL + n3 * this.elI + n2 : -1;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public int b(b b2, int n2) {
        int n3 = this.N(b2);
        if (n3 >= 0 && n3 < this.elM && this.bNA != null) {
            int n4 = this.bNA[n3];
            if (n4 == -1) {
                this.bNA[n3] = n4 = this.h(b2, n2);
            }
            return n4;
        }
        return this.h(b2, n2);
    }

    private int h(b b2, int n2) {
        int n3 = this.elE.b(b2, n2);
        if (this.elN && !this.L(b2).df().xk()) {
            n3 = ao.b(b2, n3);
        }
        return n3;
    }

    @Override
    public IBlockState L(b b2) {
        int n2 = this.N(b2);
        if (n2 >= 0 && n2 < this.elM && this.bNB != null) {
            IBlockState iBlockState = this.bNB[n2];
            if (iBlockState == null) {
                this.bNB[n2] = iBlockState = this.elE.L(b2);
            }
            return iBlockState;
        }
        return this.elE.L(b2);
    }

    public void aDn() {
        if (this.bNA == null) {
            this.bNA = (int[])elO.kr(this.elM);
        }
        Arrays.fill(this.bNA, -1);
        if (this.bNB == null) {
            this.bNB = (IBlockState[])elP.kr(this.elM);
        }
        Arrays.fill(this.bNB, null);
    }

    public void aDo() {
        elO.G(this.bNA);
        this.bNA = null;
        elP.G(this.bNB);
        this.bNB = null;
    }

    @Override
    public boolean auN() {
        return this.elE.auN();
    }

    @Override
    public j aF(b b2) {
        return this.elE.aF(b2);
    }

    @Override
    public int i(b b2, net.minecraft.util.ao ao2) {
        return this.elE.i(b2, ao2);
    }

    @Override
    public d K(b b2) {
        return this.elE.K(b2);
    }

    @Override
    public ap agn() {
        return this.elE.agn();
    }

    @Override
    public boolean aG(b b2) {
        return this.elE.aG(b2);
    }

    public boolean a(b b2, net.minecraft.util.ao ao2, boolean bl2) {
        return g.b((Object)this.elE, g.eov, b2, ao2, bl2);
    }
}

