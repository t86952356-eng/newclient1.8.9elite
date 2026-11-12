/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.j;
import net.minecraft.world.gen.layer.a;
import net.minecraft.world.gen.layer.x;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m
extends a {
    private static final Logger dPA = LogManager.getLogger();
    private final a dPB;

    public m(long l2, a a2, a a3) {
        super(l2);
        this.dPl = a2;
        this.dPB = a3;
    }

    @Override
    public int[] B(int n2, int n3, int n4, int n5) {
        int[] nArray = this.dPl.B(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray2 = this.dPB.B(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray3 = x.iG(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                boolean bl2;
                this.b(i3 + n2, i2 + n3);
                int n7 = nArray[i3 + 1 + (i2 + 1) * (n4 + 2)];
                int n8 = nArray2[i3 + 1 + (i2 + 1) * (n4 + 2)];
                boolean bl3 = bl2 = (n8 - 2) % 29 == 0;
                if (n7 > 255) {
                    dPA.debug("old! " + n7);
                }
                if (n7 != 0 && n8 >= 2 && (n8 - 2) % 29 == 1 && n7 < 128) {
                    if (j.io(n7 + 128) != null) {
                        nArray3[i3 + i2 * n4] = n7 + 128;
                        continue;
                    }
                    nArray3[i3 + i2 * n4] = n7;
                    continue;
                }
                if (this.iB(3) != 0 && !bl2) {
                    nArray3[i3 + i2 * n4] = n7;
                    continue;
                }
                int n9 = n7;
                if (n7 == j.dGh.dHo) {
                    n9 = j.dGw.dHo;
                } else if (n7 == j.dGj.dHo) {
                    n9 = j.dGx.dHo;
                } else if (n7 == j.dGG.dHo) {
                    n9 = j.dGH.dHo;
                } else if (n7 == j.dGI.dHo) {
                    n9 = j.dGg.dHo;
                } else if (n7 == j.dGk.dHo) {
                    n9 = j.dGy.dHo;
                } else if (n7 == j.dGL.dHo) {
                    n9 = j.dGM.dHo;
                } else if (n7 == j.dGJ.dHo) {
                    n9 = j.dGK.dHo;
                } else if (n7 == j.dGg.dHo) {
                    n9 = this.iB(3) == 0 ? j.dGx.dHo : j.dGj.dHo;
                } else if (n7 == j.dGr.dHo) {
                    n9 = j.dGs.dHo;
                } else if (n7 == j.dGA.dHo) {
                    n9 = j.dGB.dHo;
                } else if (n7 == j.dGf.dHo) {
                    n9 = j.dGD.dHo;
                } else if (n7 == j.dGi.dHo) {
                    n9 = j.dGN.dHo;
                } else if (n7 == j.dGO.dHo) {
                    n9 = j.dGP.dHo;
                } else if (m.bh(n7, j.dGR.dHo)) {
                    n9 = j.dGQ.dHo;
                } else if (n7 == j.dGD.dHo && this.iB(3) == 0) {
                    n6 = this.iB(2);
                    n9 = n6 == 0 ? j.dGg.dHo : j.dGj.dHo;
                }
                if (bl2 && n9 != n7) {
                    n9 = j.io(n9 + 128) != null ? (n9 += 128) : n7;
                }
                if (n9 == n7) {
                    nArray3[i3 + i2 * n4] = n7;
                    continue;
                }
                n6 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                int n10 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                int n11 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                int n12 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                int n13 = 0;
                if (m.bh(n6, n7)) {
                    ++n13;
                }
                if (m.bh(n10, n7)) {
                    ++n13;
                }
                if (m.bh(n11, n7)) {
                    ++n13;
                }
                if (m.bh(n12, n7)) {
                    ++n13;
                }
                nArray3[i3 + i2 * n4] = n13 >= 3 ? n9 : n7;
            }
        }
        return nArray3;
    }
}

