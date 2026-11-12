/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.k;
import net.minecraft.world.gen.layer.x;

public class j
extends a {
    private final k dPv;

    public j(long l2, a a2, k k2) {
        super(l2);
        this.dPl = a2;
        this.dPv = k2;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        switch (this.dPv.ordinal()) {
            default: {
                return this.D(n2, n3, n4, n5);
            }
            case 1: {
                return this.E(n2, n3, n4, n5);
            }
            case 2: 
        }
        return this.F(n2, n3, n4, n5);
    }

    private int[] D(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = 1 + n4 + 1;
        int n9 = 1 + n5 + 1;
        int[] nArray = this.dPl.B(n6, n7, n8, n9);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.b(i3 + n2, i2 + n3);
                int n10 = nArray[i3 + 1 + (i2 + 1) * n8];
                if (n10 == 1) {
                    boolean bl2;
                    int n11 = nArray[i3 + 1 + (i2 + 1 - 1) * n8];
                    int n12 = nArray[i3 + 1 + 1 + (i2 + 1) * n8];
                    int n13 = nArray[i3 + 1 - 1 + (i2 + 1) * n8];
                    int n14 = nArray[i3 + 1 + (i2 + 1 + 1) * n8];
                    boolean bl3 = n11 == 3 || n12 == 3 || n13 == 3 || n14 == 3;
                    boolean bl4 = bl2 = n11 == 4 || n12 == 4 || n13 == 4 || n14 == 4;
                    if (bl3 || bl2) {
                        n10 = 2;
                    }
                }
                nArray2[i3 + i2 * n4] = n10;
            }
        }
        return nArray2;
    }

    private int[] E(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = 1 + n4 + 1;
        int n9 = 1 + n5 + 1;
        int[] nArray = this.dPl.B(n6, n7, n8, n9);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = nArray[i3 + 1 + (i2 + 1) * n8];
                if (n10 == 4) {
                    boolean bl2;
                    int n11 = nArray[i3 + 1 + (i2 + 1 - 1) * n8];
                    int n12 = nArray[i3 + 1 + 1 + (i2 + 1) * n8];
                    int n13 = nArray[i3 + 1 - 1 + (i2 + 1) * n8];
                    int n14 = nArray[i3 + 1 + (i2 + 1 + 1) * n8];
                    boolean bl3 = n11 == 2 || n12 == 2 || n13 == 2 || n14 == 2;
                    boolean bl4 = bl2 = n11 == 1 || n12 == 1 || n13 == 1 || n14 == 1;
                    if (bl2 || bl3) {
                        n10 = 3;
                    }
                }
                nArray2[i3 + i2 * n4] = n10;
            }
        }
        return nArray2;
    }

    private int[] F(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPl.B(n2, n3, n4, n5);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.b(i3 + n2, i2 + n3);
                int n6 = nArray[i3 + i2 * n4];
                if (n6 != 0 && this.iB(13) == 0) {
                    n6 |= 1 + this.iB(15) << 8 & 0xF00;
                }
                nArray2[i3 + i2 * n4] = n6;
            }
        }
        return nArray2;
    }
}

