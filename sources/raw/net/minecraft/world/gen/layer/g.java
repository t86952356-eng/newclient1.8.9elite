/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.ap;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.h;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;

public class g
extends a {
    private j[] dPq = new j[]{j.dGh, j.dGh, j.dGh, j.dGO, j.dGO, j.dGg};
    private final j[] dPr = new j[]{j.dGj, j.dGI, j.dGi, j.dGg, j.dGG, j.dGl};
    private final j[] dPs = new j[]{j.dGj, j.dGi, j.dGk, j.dGg};
    private final j[] dPt = new j[]{j.dGr, j.dGr, j.dGr, j.dGJ};
    private final net.minecraft.world.gen.g dPu;

    public g(long l2, a a2, ap ap2, String string) {
        super(l2);
        this.dPl = a2;
        if (ap2 == ap.dEJ) {
            this.dPq = new j[]{j.dGh, j.dGj, j.dGi, j.dGl, j.dGg, j.dGk};
            this.dPu = null;
        } else {
            this.dPu = ap2 == ap.dEH ? h.gI(string).ayi() : null;
        }
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPl.B(n2, n3, n4, n5);
        int[] nArray2 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.b(i3 + n2, i2 + n3);
                int n6 = nArray[i3 + i2 * n4];
                int n7 = (n6 & 0xF00) >> 8;
                n6 &= 0xFFFFF0FF;
                if (this.dPu != null && this.dPu.dMs >= 0) {
                    nArray2[i3 + i2 * n4] = this.dPu.dMs;
                    continue;
                }
                if (g.iC(n6)) {
                    nArray2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == j.dGt.dHo) {
                    nArray2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == 1) {
                    if (n7 > 0) {
                        if (this.iB(3) == 0) {
                            nArray2[i3 + i2 * n4] = j.dGS.dHo;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = j.dGR.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.dPq[this.iB((int)this.dPq.length)].dHo;
                    continue;
                }
                if (n6 == 2) {
                    if (n7 > 0) {
                        nArray2[i3 + i2 * n4] = j.dGA.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.dPr[this.iB((int)this.dPr.length)].dHo;
                    continue;
                }
                if (n6 == 3) {
                    if (n7 > 0) {
                        nArray2[i3 + i2 * n4] = j.dGL.dHo;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.dPs[this.iB((int)this.dPs.length)].dHo;
                    continue;
                }
                nArray2[i3 + i2 * n4] = n6 == 4 ? this.dPt[this.iB((int)this.dPt.length)].dHo : j.dGt.dHo;
            }
        }
        return nArray2;
    }
}

