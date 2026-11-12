/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

abstract class cv
extends y {
    protected cw dSt = cw.dSu;

    public cv() {
    }

    protected cv(int n2) {
        super(n2);
    }

    @Override
    protected void N(n n2) {
        n2.R("EntryDoor", this.dSt.name());
    }

    @Override
    protected void O(n n2) {
        this.dSt = cw.valueOf(n2.eK("EntryDoor"));
    }

    protected void a(net.minecraft.world.w w2, Random random, w w3, cw cw2, int n2, int n3, int n4) {
        switch (cw2.ordinal()) {
            default: {
                this.a(w2, w3, n2, n3, n4, n2 + 3 - 1, n3 + 3 - 1, n4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
                break;
            }
            case 1: {
                this.a(w2, Blocks.cNh.xM(), n2, n3, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 1, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3, n4, w3);
                this.a(w2, Blocks.cMq.xM(), n2 + 1, n3, n4, w3);
                this.a(w2, Blocks.cMq.aM(8), n2 + 1, n3 + 1, n4, w3);
                break;
            }
            case 2: {
                this.a(w2, Blocks.cLc.xM(), n2 + 1, n3, n4, w3);
                this.a(w2, Blocks.cLc.xM(), n2 + 1, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2, n3, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2 + 1, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2 + 2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2 + 2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNk.xM(), n2 + 2, n3, n4, w3);
                break;
            }
            case 3: {
                this.a(w2, Blocks.cNh.xM(), n2, n3, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 1, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3 + 2, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3 + 1, n4, w3);
                this.a(w2, Blocks.cNh.xM(), n2 + 2, n3, n4, w3);
                this.a(w2, Blocks.cMC.xM(), n2 + 1, n3, n4, w3);
                this.a(w2, Blocks.cMC.aM(8), n2 + 1, n3 + 1, n4, w3);
                this.a(w2, Blocks.cMI.aM(this.g(Blocks.cMI, 4)), n2 + 2, n3 + 1, n4 + 1, w3);
                this.a(w2, Blocks.cMI.aM(this.g(Blocks.cMI, 3)), n2 + 2, n3 + 1, n4 - 1, w3);
            }
        }
    }

    protected cw o(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return cw.dSu;
            }
            case 2: {
                return cw.dSv;
            }
            case 3: {
                return cw.dSw;
            }
            case 4: 
        }
        return cw.dSx;
    }

    protected y a(cr cr2, List<y> list, Random random, int n2, int n3) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n2, this.dQI.dQC + n3, this.dQI.dQD - 1, this.dQJ, this.ayS());
                }
                case dwt: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n2, this.dQI.dQC + n3, this.dQI.dQG + 1, this.dQJ, this.ayS());
                }
                case dwu: {
                    return cc.b(cr2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n3, this.dQI.dQD + n2, this.dQJ, this.ayS());
                }
                case dwv: {
                    return cc.b(cr2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n3, this.dQI.dQD + n2, this.dQJ, this.ayS());
                }
            }
        }
        return null;
    }

    protected y b(cr cr2, List<y> list, Random random, int n2, int n3) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return cc.b(cr2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS());
                }
                case dwt: {
                    return cc.b(cr2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS());
                }
                case dwu: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS());
                }
                case dwv: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS());
                }
            }
        }
        return null;
    }

    protected y c(cr cr2, List<y> list, Random random, int n2, int n3) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return cc.b(cr2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS());
                }
                case dwt: {
                    return cc.b(cr2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS());
                }
                case dwu: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS());
                }
                case dwv: {
                    return cc.b(cr2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS());
                }
            }
        }
        return null;
    }

    protected static boolean e(w w2) {
        return w2 != null && w2.dQC > 10;
    }
}

