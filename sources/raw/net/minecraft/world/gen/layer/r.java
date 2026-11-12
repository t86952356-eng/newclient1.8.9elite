/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class r
extends a {
    public r(long l2, a a2) {
        super(l2);
        this.dPl = a2;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPl.B(n2, n3, n4, n5);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.b(i3 + n2, i2 + n3);
                nArray2[i3 + i2 * n4] = nArray[i3 + i2 * n4] > 0 ? this.iB(299999) + 2 : 0;
            }
        }
        return nArray2;
    }
}

