/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.j;
import net.minecraft.world.biome.n;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class h
extends a {
    public h(long l2, a a2) {
        super(l2);
        this.dPl = a2;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPl.B(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                int n7;
                int n8;
                int n9;
                this.b(i3 + n2, i2 + n3);
                int n10 = nArray[i3 + 1 + (i2 + 1) * (n4 + 2)];
                if (this.a(nArray, nArray2, i3, i2, n4, n10, j.dGi.dHo, j.dGz.dHo) || this.b(nArray, nArray2, i3, i2, n4, n10, j.dGR.dHo, j.dGQ.dHo) || this.b(nArray, nArray2, i3, i2, n4, n10, j.dGS.dHo, j.dGQ.dHo) || this.b(nArray, nArray2, i3, i2, n4, n10, j.dGL.dHo, j.dGk.dHo)) continue;
                if (n10 == j.dGh.dHo) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != j.dGr.dHo && n8 != j.dGr.dHo && n7 != j.dGr.dHo && n6 != j.dGr.dHo) {
                        nArray2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = j.dGN.dHo;
                    continue;
                }
                if (n10 == j.dGl.dHo) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != j.dGh.dHo && n8 != j.dGh.dHo && n7 != j.dGh.dHo && n6 != j.dGh.dHo && n9 != j.dGJ.dHo && n8 != j.dGJ.dHo && n7 != j.dGJ.dHo && n6 != j.dGJ.dHo && n9 != j.dGr.dHo && n8 != j.dGr.dHo && n7 != j.dGr.dHo && n6 != j.dGr.dHo) {
                        if (n9 != j.dGA.dHo && n6 != j.dGA.dHo && n8 != j.dGA.dHo && n7 != j.dGA.dHo) {
                            nArray2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = j.dGC.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = j.dGg.dHo;
                    continue;
                }
                nArray2[i3 + i2 * n4] = n10;
            }
        }
        return nArray2;
    }

    private boolean a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!h.bh(n5, n6)) {
            return false;
        }
        int n8 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n9 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n10 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n11 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        nArray2[n2 + n3 * n4] = this.bi(n8, n6) && this.bi(n9, n6) && this.bi(n10, n6) && this.bi(n11, n6) ? n5 : n7;
        return true;
    }

    private boolean b(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 != n6) {
            return false;
        }
        int n8 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n9 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n10 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n11 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        nArray2[n2 + n3 * n4] = h.bh(n8, n6) && h.bh(n9, n6) && h.bh(n10, n6) && h.bh(n11, n6) ? n5 : n7;
        return true;
    }

    private boolean bi(int n2, int n3) {
        if (h.bh(n2, n3)) {
            return true;
        }
        j j2 = j.io(n2);
        j j3 = j.io(n3);
        if (j2 != null && j3 != null) {
            n n4;
            n n5 = j2.axf();
            return n5 == (n4 = j3.axf()) || n5 == n.dHz || n4 == n.dHz;
        }
        return false;
    }
}

