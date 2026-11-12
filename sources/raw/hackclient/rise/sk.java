/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.sj;
import java.util.Comparator;
import java.util.List;

class sk
implements Comparator<Integer> {
    final /* synthetic */ int XY;
    final /* synthetic */ int[] XZ;
    final /* synthetic */ int[] Ya;
    final /* synthetic */ List Yb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    sk(sj sj2, int n2, int[] nArray, int[] nArray2, List list) {
        this.XY = n2;
        this.XZ = nArray;
        this.Ya = nArray2;
        this.Yb = list;
    }

    public int a(Integer n2, Integer n3) {
        int n4;
        if (n2 == this.XY - 1) {
            return 1;
        }
        if (n3 == this.XY - 1) {
            return -1;
        }
        int n5 = this.XZ[n2] - this.Ya[n2];
        if (n5 != (n4 = this.XZ[n3] - this.Ya[n3])) {
            return Integer.compare(n4, n5);
        }
        return Integer.compare((Integer)this.Yb.get(n2), (Integer)this.Yb.get(n3));
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

