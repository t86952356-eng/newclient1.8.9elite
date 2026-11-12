/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Comparator;
import net.minecraft.util.bt;
import net.minecraft.world.b;

public class g
implements Comparator<b> {
    private final int dVE;
    private final int dVF;
    private final double dVG;
    private final double dVH;

    public g(int n2, int n3, double d2, double d3) {
        this.dVE = n2;
        this.dVF = n3;
        this.dVG = d2;
        this.dVH = 1.0 - bt.ah(Math.abs(d3) / 1.5707963267948966, 0.0, 1.0);
    }

    public int a(b b2, b b3) {
        int n2 = this.d(b2);
        int n3 = this.d(b3);
        return n2 - n3;
    }

    private int d(b b2) {
        int n2 = b2.dBK - this.dVE;
        int n3 = b2.dBL - this.dVF;
        int n4 = n2 * n2 + n3 * n3;
        double d2 = bt.y(n3, n2);
        double d3 = Math.abs(d2 - this.dVG);
        if (d3 > Math.PI) {
            d3 = Math.PI * 2 - d3;
        }
        n4 = (int)((double)n4 * 1000.0 * this.dVH * d3 * d3);
        return n4;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((b)object, (b)object2);
    }
}

