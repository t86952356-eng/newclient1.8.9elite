/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class w
extends a {
    public w(long l2, a a2) {
        super(l2);
        this.dPl = a2;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n2 >> 1;
        int n8 = n3 >> 1;
        int n9 = (n4 >> 1) + 2;
        int n10 = (n5 >> 1) + 2;
        int[] nArray = this.dPl.B(n7, n8, n9, n10);
        int n11 = n9 - 1 << 1;
        int n12 = n10 - 1 << 1;
        int[] nArray2 = x.iG(n11 * n12);
        for (int i2 = 0; i2 < n10 - 1; ++i2) {
            int n13;
            n6 = (i2 << 1) * n11;
            int n14 = nArray[n13 + 0 + (i2 + 0) * n9];
            int n15 = nArray[n13 + 0 + (i2 + 1) * n9];
            for (n13 = 0; n13 < n9 - 1; ++n13) {
                this.b(n13 + n7 << 1, i2 + n8 << 1);
                int n16 = nArray[n13 + 1 + (i2 + 0) * n9];
                int n17 = nArray[n13 + 1 + (i2 + 1) * n9];
                nArray2[n6] = n14;
                nArray2[n6++ + n11] = this.bj(n14, n15);
                nArray2[n6] = this.bj(n14, n16);
                nArray2[n6++ + n11] = this.C(n14, n16, n15, n17);
                n14 = n16;
                n15 = n17;
            }
        }
        int[] nArray3 = x.iG(n4 * n5);
        for (n6 = 0; n6 < n5; ++n6) {
            System.arraycopy(nArray2, (n6 + (n3 & 1)) * n11 + (n2 & 1), nArray3, n6 * n4, n4);
        }
        return nArray3;
    }

    public static a a(long l2, a a2, int n2) {
        a a3 = a2;
        for (int i2 = 0; i2 < n2; ++i2) {
            a3 = new w(l2 + (long)i2, a3);
        }
        return a3;
    }

    protected int bj(int n2, int n3) {
        int n4 = this.iB(2);
        return n4 == 0 ? n2 : n3;
    }
}

