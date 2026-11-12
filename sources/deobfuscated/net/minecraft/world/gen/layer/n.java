/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class n
extends a {
    public n(long l2) {
        super(l2);
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.b(n2 + i3, n3 + i2);
                nArray[i3 + i2 * n4] = this.iB(10) == 0 ? 1 : 0;
            }
        }
        if (n2 > -n4 && n2 <= 0 && n3 > -n5 && n3 <= 0) {
            nArray[-n2 + -n3 * n4] = 1;
        }
        return nArray;
    }
}

