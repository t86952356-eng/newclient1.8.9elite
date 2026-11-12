/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.sj;
import java.util.Comparator;
import java.util.List;

class sl
implements Comparator<Integer> {
    final /* synthetic */ int Yc;
    final /* synthetic */ double[] Yd;
    final /* synthetic */ List Ye;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    sl(sj sj2, int n2, double[] dArray, List list) {
        this.Yc = n2;
        this.Yd = dArray;
        this.Ye = list;
    }

    public int a(Integer n2, Integer n3) {
        if (n2 == this.Yc - 1) {
            return -1;
        }
        if (n3 == this.Yc - 1) {
            return 1;
        }
        int n4 = Double.compare(this.Yd[n3], this.Yd[n2]);
        if (n4 != 0) {
            return n4;
        }
        return -Integer.compare((Integer)this.Ye.get(n2), (Integer)this.Ye.get(n3));
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

