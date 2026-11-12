/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import java.util.ArrayList;
import java.util.Arrays;
import net.optifine.expr.f;
import net.optifine.expr.l;
import net.optifine.expr.r;

public class t
implements r {
    private final f[] ejg;
    private final f[] ejh;
    private final f[] eji;
    private int ejj = Integer.MAX_VALUE;
    private static final f[] ejk = new f[0];

    public t() {
        this(null, null, null);
    }

    public t(f[] fArray, f[] fArray2, f[] fArray3) {
        this(fArray, fArray2, fArray3, Integer.MAX_VALUE);
    }

    public t(f[] fArray, f[] fArray2, f[] fArray3, int n2) {
        this.ejg = t.a(fArray);
        this.ejh = t.a(fArray2);
        this.eji = t.a(fArray3);
        this.ejj = n2;
    }

    private static f[] a(f[] fArray) {
        return fArray == null ? ejk : fArray;
    }

    public f[] aCB() {
        return this.ejg;
    }

    public f[] aCC() {
        return this.ejh;
    }

    public f[] aCD() {
        return this.eji;
    }

    public int aCE() {
        return this.ejg == null ? 0 : this.ejg.length;
    }

    @Override
    public f[] b(l[] lArray) {
        int n2 = this.ejg.length + this.eji.length;
        int n3 = lArray.length - n2;
        int n4 = 0;
        int n5 = 0;
        while (n5 + this.ejh.length <= n3 && n2 + n5 + this.ejh.length <= this.ejj) {
            ++n4;
            n5 += this.ejh.length;
        }
        ArrayList<f> arrayList = new ArrayList<f>(Arrays.asList(this.ejg));
        for (int i2 = 0; i2 < n4; ++i2) {
            arrayList.addAll(Arrays.asList(this.ejh));
        }
        arrayList.addAll(Arrays.asList(this.eji));
        f[] fArray = arrayList.toArray(new f[arrayList.size()]);
        return fArray;
    }

    public t b(f ... fArray) {
        return new t(fArray, this.ejh, this.eji);
    }

    public t c(f ... fArray) {
        return new t(this.ejg, fArray, this.eji);
    }

    public t d(f ... fArray) {
        return new t(this.ejg, this.ejh, fArray);
    }

    public t jx(int n2) {
        return new t(this.ejg, this.ejh, this.eji, n2);
    }
}

