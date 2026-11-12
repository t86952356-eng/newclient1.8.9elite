/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import net.optifine.expr.a;
import net.optifine.expr.f;
import net.optifine.expr.k;
import net.optifine.expr.l;
import net.optifine.expr.o;
import net.optifine.shaders.uniform.q;

public class h
implements o {
    private final k ehU;
    private final l[] ehV;
    private int ehW = -1;

    public h(k k2, l[] lArray) {
        this.ehU = k2;
        this.ehV = lArray;
    }

    @Override
    public float aCr() {
        l[] lArray = this.ehV;
        switch (this.ehU) {
            case eiT: {
                float f2;
                l l2 = lArray[0];
                if (l2 instanceof a) break;
                float f3 = h.a(lArray, 0);
                float f4 = lArray.length > 1 ? h.a(lArray, 1) : 1.0f;
                float f5 = f2 = lArray.length > 2 ? h.a(lArray, 2) : f4;
                if (this.ehW < 0) {
                    this.ehW = q.aIR();
                }
                float f6 = q.b(this.ehW, f3, f4, f2);
                return f6;
            }
        }
        return this.ehU.c(this.ehV);
    }

    private static float a(l[] lArray, int n2) {
        o o2 = (o)lArray[n2];
        float f2 = o2.aCr();
        return f2;
    }

    @Override
    public f aCq() {
        return f.ehO;
    }

    public String toString() {
        return String.valueOf((Object)this.ehU) + "()";
    }
}

