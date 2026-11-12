/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.j;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class s
extends a {
    private final a dPC;
    private final a dPD;

    public s(long l2, a a2, a a3) {
        super(l2);
        this.dPC = a2;
        this.dPD = a3;
    }

    @Override
    public void O(long l2) {
        this.dPC.O(l2);
        this.dPD.O(l2);
        super.O(l2);
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPC.B(n2, n3, n4, n5);
        int[] nArray2 = this.dPD.B(n2, n3, n4, n5);
        int[] nArray3 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            if (nArray[i2] != j.dGf.dHo && nArray[i2] != j.dGD.dHo) {
                if (nArray2[i2] == j.dGm.dHo) {
                    if (nArray[i2] == j.dGr.dHo) {
                        nArray3[i2] = j.dGq.dHo;
                        continue;
                    }
                    if (nArray[i2] != j.dGt.dHo && nArray[i2] != j.dGu.dHo) {
                        nArray3[i2] = nArray2[i2] & 0xFF;
                        continue;
                    }
                    nArray3[i2] = j.dGu.dHo;
                    continue;
                }
                nArray3[i2] = nArray[i2];
                continue;
            }
            nArray3[i2] = nArray[i2];
        }
        return nArray3;
    }
}

