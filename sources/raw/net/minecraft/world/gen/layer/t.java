/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.j;
import net.minecraft.world.biome.w;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class t
extends a {
    public t(long l2, a a2) {
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
                j j2 = j.io(n10);
                if (n10 == j.dGt.dHo) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != j.dGf.dHo && n8 != j.dGf.dHo && n7 != j.dGf.dHo && n6 != j.dGf.dHo) {
                        nArray2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = j.dGu.dHo;
                    continue;
                }
                if (j2 != null && j2.axe() == w.class) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (this.iE(n9) && this.iE(n8) && this.iE(n7) && this.iE(n6)) {
                        if (!(t.iC(n9) || t.iC(n8) || t.iC(n7) || t.iC(n6))) {
                            nArray2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = j.dGv.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = j.dGC.dHo;
                    continue;
                }
                if (n10 != j.dGi.dHo && n10 != j.dGN.dHo && n10 != j.dGz.dHo) {
                    if (j2 != null && j2.axc()) {
                        this.a(nArray, nArray2, i3, i2, n4, n10, j.dGF.dHo);
                        continue;
                    }
                    if (n10 != j.dGQ.dHo && n10 != j.dGR.dHo) {
                        if (n10 != j.dGf.dHo && n10 != j.dGD.dHo && n10 != j.dGm.dHo && n10 != j.dGl.dHo) {
                            n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                            n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                            n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                            n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                            if (!(t.iC(n9) || t.iC(n8) || t.iC(n7) || t.iC(n6))) {
                                nArray2[i3 + i2 * n4] = n10;
                                continue;
                            }
                            nArray2[i3 + i2 * n4] = j.dGv.dHo;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (!(t.iC(n9) || t.iC(n8) || t.iC(n7) || t.iC(n6))) {
                        if (this.iF(n9) && this.iF(n8) && this.iF(n7) && this.iF(n6)) {
                            nArray2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = j.dGh.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                this.a(nArray, nArray2, i3, i2, n4, n10, j.dGE.dHo);
            }
        }
        return nArray2;
    }

    private void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6) {
        if (t.iC(n5)) {
            nArray2[n2 + n3 * n4] = n5;
        } else {
            int n7 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n8 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n9 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n10 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            nArray2[n2 + n3 * n4] = !t.iC(n7) && !t.iC(n8) && !t.iC(n9) && !t.iC(n10) ? n5 : n6;
        }
    }

    private boolean iE(int n2) {
        return j.io(n2) != null && j.io(n2).axe() == w.class || n2 == j.dGC.dHo || n2 == j.dGA.dHo || n2 == j.dGB.dHo || n2 == j.dGj.dHo || n2 == j.dGk.dHo || t.iC(n2);
    }

    private boolean iF(int n2) {
        return j.io(n2) instanceof net.minecraft.world.biome.x;
    }
}

