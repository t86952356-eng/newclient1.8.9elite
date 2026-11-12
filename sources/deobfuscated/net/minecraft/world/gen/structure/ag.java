/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.ab;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ag
extends y {
    public ag() {
    }

    public ag(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    protected void N(n n2) {
    }

    @Override
    protected void O(n n2) {
    }

    public static w c(List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        w w2 = new w(n2, n3 - 5, n4, n2, n3 + 2, n4);
        switch (ao2) {
            case dws: {
                w2.dQE = n2 + 2;
                w2.dQD = n4 - 8;
                break;
            }
            case dwt: {
                w2.dQE = n2 + 2;
                w2.dQG = n4 + 8;
                break;
            }
            case dwu: {
                w2.dQB = n2 - 8;
                w2.dQG = n4 + 2;
                break;
            }
            case dwv: {
                w2.dQE = n2 + 8;
                w2.dQG = n4 + 2;
            }
        }
        return y.a(list, w2) != null ? null : w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        int n2 = this.ayS();
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, n2);
                    break;
                }
                case dwt: {
                    ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, n2);
                    break;
                }
                case dwu: {
                    ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQD, ao.dwu, n2);
                    break;
                }
                case dwv: {
                    ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQD, ao.dwv, n2);
                }
            }
        }
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 5, 0, 2, 7, 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 0, 7, 2, 2, 8, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a(w2, w3, 0, 5 - i2 - (i2 < 4 ? 1 : 0), 2 + i2, 2, 7 - i2, 2 + i2, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        return true;
    }
}

