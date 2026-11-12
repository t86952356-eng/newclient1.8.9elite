/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.cm;

public class k {
    private final int dNs;
    private IBlockState dNt;
    private int dNu = 1;
    private int dNv;

    public k(int n2, Block block) {
        this(3, n2, block);
    }

    public k(int n2, int n3, Block block) {
        this.dNs = n2;
        this.dNu = n3;
        this.dNt = block.xM();
    }

    public k(int n2, int n3, Block block, int n4) {
        this(n2, n3, block);
        this.dNt = block.aM(n4);
    }

    public int ayo() {
        return this.dNu;
    }

    public IBlockState ayp() {
        return this.dNt;
    }

    private Block ayq() {
        return this.dNt.df();
    }

    private int ayr() {
        return this.dNt.df().c(this.dNt);
    }

    public int ays() {
        return this.dNv;
    }

    public void ix(int n2) {
        this.dNv = n2;
    }

    public String toString() {
        Object object;
        if (this.dNs >= 3) {
            cm cm2 = (cm)Block.aRV.y(this.ayq());
            Object object2 = object = cm2 == null ? "null" : cm2.toString();
            if (this.dNu > 1) {
                object = this.dNu + "*" + (String)object;
            }
        } else {
            object = Integer.toString(Block.i(this.ayq()));
            if (this.dNu > 1) {
                object = this.dNu + "x" + (String)object;
            }
        }
        int n2 = this.ayr();
        if (n2 > 0) {
            object = (String)object + ":" + n2;
        }
        return object;
    }
}

