/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.j;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class q
extends a {
    public q(long l2, a a2) {
        super(l2);
        this.dPl = a2;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] nArray = this.dPl.B(n6, n7, n8, n9);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = this.iD(nArray[i3 + 0 + (i2 + 1) * n8]);
                int n11 = this.iD(nArray[i3 + 2 + (i2 + 1) * n8]);
                int n12 = this.iD(nArray[i3 + 1 + (i2 + 0) * n8]);
                int n13 = this.iD(nArray[i3 + 1 + (i2 + 2) * n8]);
                int n14 = this.iD(nArray[i3 + 1 + (i2 + 1) * n8]);
                nArray2[i3 + i2 * n4] = n14 == n10 && n14 == n12 && n14 == n11 && n14 == n13 ? -1 : j.dGm.dHo;
            }
        }
        return nArray2;
    }

    private int iD(int n2) {
        return n2 >= 2 ? 2 + (n2 & 1) : n2;
    }
}

