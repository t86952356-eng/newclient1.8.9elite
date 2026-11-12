/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import net.minecraft.block.state.IBlockState;
import net.minecraft.src.a;

public class e {
    private static final ArrayDeque<int[]> eMB = new ArrayDeque();
    private static final int eMC = 10;

    private static synchronized int[] kt(int n2) {
        int[] nArray = eMB.pollLast();
        if (nArray == null || nArray.length < n2) {
            nArray = new int[n2];
        }
        return nArray;
    }

    public static synchronized void s(int[] nArray) {
        if (eMB.size() < 10) {
            eMB.add(nArray);
        }
    }

    public static void main(String[] stringArray) {
        int n2 = 4096;
        int n3 = 500000;
        e.bV(4096, 500000);
        e.bU(4096, 500000);
        e.bX(4096, 500000);
        e.bW(4096, 500000);
        e.a(IBlockState.class, 4096, 500000);
        long l2 = e.bV(4096, 500000);
        long l3 = e.bU(4096, 500000);
        long l4 = e.bX(4096, 500000);
        long l5 = e.bW(4096, 500000);
        long l6 = e.a(IBlockState.class, 4096, 500000);
        a.fN("New: " + l2);
        a.fN("Clone: " + l3);
        a.fN("NewObj: " + l4);
        a.fN("CloneObj: " + l5);
        a.fN("NewObjDyn: " + l6);
    }

    private static long bU(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        int[] nArray = new int[n2];
        for (int i2 = 0; i2 < n3; ++i2) {
            int[] nArray2 = (int[])nArray.clone();
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long bV(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        for (int i2 = 0; i2 < n3; ++i2) {
            int[] nArray = (int[])Array.newInstance(Integer.TYPE, n2);
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long bW(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        IBlockState[] iBlockStateArray = new IBlockState[n2];
        for (int i2 = 0; i2 < n3; ++i2) {
            IBlockState[] iBlockStateArray2 = (IBlockState[])iBlockStateArray.clone();
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long bX(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        for (int i2 = 0; i2 < n3; ++i2) {
            IBlockState[] iBlockStateArray = new IBlockState[n2];
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long a(Class clazz, int n2, int n3) {
        long l2 = System.currentTimeMillis();
        for (int i2 = 0; i2 < n3; ++i2) {
            Object[] objectArray = (Object[])Array.newInstance(clazz, n2);
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }
}

