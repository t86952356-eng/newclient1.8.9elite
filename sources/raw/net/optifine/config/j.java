/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.block.state.BlockStateBase;
import net.minecraft.src.a;
import net.optifine.config.k;

public class j {
    private int bfA = -1;
    private int[] dVJ = null;

    public j(int n2) {
        this.bfA = n2;
    }

    public j(int n2, int n3) {
        this.bfA = n2;
        if (n3 >= 0 && n3 <= 15) {
            this.dVJ = new int[]{n3};
        }
    }

    public j(int n2, int[] nArray) {
        this.bfA = n2;
        this.dVJ = nArray;
    }

    public int zW() {
        return this.bfA;
    }

    public int[] aBX() {
        return this.dVJ;
    }

    public boolean b(BlockStateBase blockStateBase) {
        return blockStateBase.zW() == this.bfA && k.e(blockStateBase.yc(), this.dVJ);
    }

    public boolean bH(int n2, int n3) {
        return n2 == this.bfA && k.e(n3, this.dVJ);
    }

    public void js(int n2) {
        if (this.dVJ != null && n2 >= 0 && n2 <= 15) {
            for (int i2 = 0; i2 < this.dVJ.length; ++i2) {
                if (this.dVJ[i2] != n2) continue;
                return;
            }
            this.dVJ = a.b(this.dVJ, n2);
        }
    }

    public String toString() {
        return this.bfA + ":" + a.k(this.dVJ);
    }
}

