/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.Iterator;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.optifine.d;
import net.optifine.shaders.p;

public class o
implements Iterator<b> {
    private final p euX;
    private final d euY = new d(0, 0, 0);
    private int euZ = 0;
    private final int eva;
    private final int evb;
    private final int evc;
    private static final int evd = 0;
    private static final int eve = 1;
    private static final int evf = 2;

    public o(b b2, b b3, int n2, int n3) {
        boolean bl2 = b2.wt() > b3.wt();
        boolean bl3 = b2.wu() > b3.wu();
        boolean bl4 = b2.wx() > b3.wx();
        b2 = this.a(b2, bl2, bl3, bl4);
        b3 = this.a(b3, bl2, bl3, bl4);
        this.eva = bl2 ? -1 : 1;
        this.evb = bl3 ? -1 : 1;
        this.evc = bl4 ? -1 : 1;
        da da2 = new da(b3.wt() - b2.wt(), b3.wu() - b2.wu(), b3.wx() - b2.wx());
        da da3 = da2.atR();
        da da4 = new da(1.0, 0.0, 0.0);
        double d2 = da3.t(da4);
        double d3 = Math.abs(d2);
        da da5 = new da(0.0, 1.0, 0.0);
        double d4 = da3.t(da5);
        double d5 = Math.abs(d4);
        da da6 = new da(0.0, 0.0, 1.0);
        double d6 = da3.t(da6);
        double d7 = Math.abs(d6);
        if (d7 >= d5 && d7 >= d3) {
            this.euZ = 2;
            b b4 = new b(b2.wx(), b2.wu() - n2, b2.wt() - n3);
            b b5 = new b(b3.wx(), b2.wu() + n2 + 1, b2.wt() + n3 + 1);
            int n4 = b3.wx() - b2.wx();
            double d8 = (double)(b3.wu() - b2.wu()) / (1.0 * (double)n4);
            double d9 = (double)(b3.wt() - b2.wt()) / (1.0 * (double)n4);
            this.euX = new p(b4, b5, d8, d9);
        } else if (d5 >= d3 && d5 >= d7) {
            this.euZ = 1;
            b b6 = new b(b2.wu(), b2.wt() - n2, b2.wx() - n3);
            b b7 = new b(b3.wu(), b2.wt() + n2 + 1, b2.wx() + n3 + 1);
            int n5 = b3.wu() - b2.wu();
            double d10 = (double)(b3.wt() - b2.wt()) / (1.0 * (double)n5);
            double d11 = (double)(b3.wx() - b2.wx()) / (1.0 * (double)n5);
            this.euX = new p(b6, b7, d10, d11);
        } else {
            this.euZ = 0;
            b b8 = new b(b2.wt(), b2.wu() - n2, b2.wx() - n3);
            b b9 = new b(b3.wt(), b2.wu() + n2 + 1, b2.wx() + n3 + 1);
            int n6 = b3.wt() - b2.wt();
            double d12 = (double)(b3.wu() - b2.wu()) / (1.0 * (double)n6);
            double d13 = (double)(b3.wx() - b2.wx()) / (1.0 * (double)n6);
            this.euX = new p(b8, b9, d12, d13);
        }
    }

    private b a(b b2, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2) {
            b2 = new b(-b2.wt(), b2.wu(), b2.wx());
        }
        if (bl3) {
            b2 = new b(b2.wt(), -b2.wu(), b2.wx());
        }
        if (bl4) {
            b2 = new b(b2.wt(), b2.wu(), -b2.wx());
        }
        return b2;
    }

    @Override
    public boolean hasNext() {
        return this.euX.hasNext();
    }

    public b aEu() {
        b b2 = this.euX.aEu();
        switch (this.euZ) {
            case 0: {
                this.euY.ah(b2.wt() * this.eva, b2.wu() * this.evb, b2.wx() * this.evc);
                return this.euY;
            }
            case 1: {
                this.euY.ah(b2.wu() * this.eva, b2.wt() * this.evb, b2.wx() * this.evc);
                return this.euY;
            }
            case 2: {
                this.euY.ah(b2.wx() * this.eva, b2.wu() * this.evb, b2.wt() * this.evc);
                return this.euY;
            }
        }
        this.euY.ah(b2.wt() * this.eva, b2.wu() * this.evb, b2.wx() * this.evc);
        return this.euY;
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    public static void main(String[] stringArray) {
        b b2 = new b(10, 20, 30);
        b b3 = new b(30, 40, 20);
        o o2 = new o(b2, b3, 1, 1);
        while (o2.hasNext()) {
            b b4 = o2.aEu();
            System.out.println(String.valueOf(b4));
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.aEu();
    }
}

