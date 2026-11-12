/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.util.ArrayDeque;
import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.util.db;
import net.minecraft.world.chunk.e;
import net.minecraft.world.w;
import net.optifine.ao;

public class RegionRenderCache
extends net.minecraft.world.a {
    private static final IBlockState bNy = Blocks.cLc.xM();
    private final b bNz;
    private final int[] bNA;
    private final IBlockState[] bNB;
    private static final ArrayDeque<int[]> bNC = new ArrayDeque();
    private static final ArrayDeque<IBlockState[]> bND = new ArrayDeque();
    private static final int bNE = a.A(Runtime.getRuntime().availableProcessors(), 1, 32);

    public RegionRenderCache(w w2, b b2, b b3, int n2) {
        super(w2, b2, b3, n2);
        this.bNz = b2.c(new db(n2, n2, n2));
        int n3 = 8000;
        this.bNA = RegionRenderCache.dg(8000);
        Arrays.fill(this.bNA, -1);
        this.bNB = RegionRenderCache.dh(8000);
    }

    @Override
    public d K(b b2) {
        int n2 = (b2.wt() >> 4) - this.ddn;
        int n3 = (b2.wx() >> 4) - this.ddo;
        return this.dBI[n2][n3].a(b2, e.dJg);
    }

    @Override
    public int b(b b2, int n2) {
        int n3 = this.N(b2);
        int n4 = this.bNA[n3];
        if (n4 == -1) {
            n4 = super.b(b2, n2);
            if (a.apa() && !this.L(b2).df().xk()) {
                n4 = ao.b(b2, n4);
            }
            this.bNA[n3] = n4;
        }
        return n4;
    }

    @Override
    public IBlockState L(b b2) {
        int n2 = this.N(b2);
        IBlockState iBlockState = this.bNB[n2];
        if (iBlockState == null) {
            this.bNB[n2] = iBlockState = this.M(b2);
        }
        return iBlockState;
    }

    private IBlockState M(b b2) {
        return super.L(b2);
    }

    private int N(b b2) {
        int n2 = b2.wt() - this.bNz.wt();
        int n3 = b2.wu() - this.bNz.wu();
        int n4 = b2.wx() - this.bNz.wx();
        return n2 * 400 + n4 * 20 + n3;
    }

    public void KA() {
        RegionRenderCache.b(this.bNA);
        RegionRenderCache.a(this.bNB);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int[] dg(int n2) {
        ArrayDeque<int[]> arrayDeque = bNC;
        synchronized (arrayDeque) {
            int[] nArray = bNC.pollLast();
            if (nArray == null || nArray.length < n2) {
                nArray = new int[n2];
            }
            return nArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(int[] nArray) {
        ArrayDeque<int[]> arrayDeque = bNC;
        synchronized (arrayDeque) {
            if (bNC.size() < bNE) {
                bNC.add(nArray);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static IBlockState[] dh(int n2) {
        ArrayDeque<IBlockState[]> arrayDeque = bND;
        synchronized (arrayDeque) {
            Object[] objectArray = bND.pollLast();
            if (objectArray != null && objectArray.length >= n2) {
                Arrays.fill(objectArray, null);
            } else {
                objectArray = new IBlockState[n2];
            }
            return objectArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(IBlockState[] iBlockStateArray) {
        ArrayDeque<IBlockState[]> arrayDeque = bND;
        synchronized (arrayDeque) {
            if (bND.size() < bNE) {
                bND.add(iBlockStateArray);
            }
        }
    }
}

