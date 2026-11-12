/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.ab;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ad
extends y {
    private boolean dQP;
    private boolean dQQ;
    private boolean dQR;
    private int dQS;

    public ad() {
    }

    @Override
    protected void N(net.minecraft.nbt.n n2) {
        n2.o("hr", this.dQP);
        n2.o("sc", this.dQQ);
        n2.o("hps", this.dQR);
        n2.B("Num", this.dQS);
    }

    @Override
    protected void O(net.minecraft.nbt.n n2) {
        this.dQP = n2.eO("hr");
        this.dQQ = n2.eO("sc");
        this.dQR = n2.eO("hps");
        this.dQS = n2.eG("Num");
    }

    public ad(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dQP = random.nextInt(3) == 0;
        this.dQQ = !this.dQP && random.nextInt(23) == 0;
        this.dQS = this.dQJ != ao.dws && this.dQJ != ao.dwt ? w2.ayL() / 5 : w2.ayN() / 5;
    }

    public static w a(List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        int n5;
        w w2 = new w(n2, n3, n4, n2, n3 + 2, n4);
        for (n5 = random.nextInt(3) + 2; n5 > 0; --n5) {
            int n6 = n5 * 5;
            switch (ao2) {
                case dws: {
                    w2.dQE = n2 + 2;
                    w2.dQD = n4 - (n6 - 1);
                    break;
                }
                case dwt: {
                    w2.dQE = n2 + 2;
                    w2.dQG = n4 + (n6 - 1);
                    break;
                }
                case dwu: {
                    w2.dQB = n2 - (n6 - 1);
                    w2.dQG = n4 + 2;
                    break;
                }
                case dwv: {
                    w2.dQE = n2 + (n6 - 1);
                    w2.dQG = n4 + 2;
                }
            }
            if (y.a(list, w2) == null) break;
        }
        return n5 > 0 ? w2 : null;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        block25: {
            int n2 = this.ayS();
            int n3 = random.nextInt(4);
            if (this.dQJ != null) {
                switch (this.dQJ) {
                    case dws: {
                        if (n3 <= 1) {
                            ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD - 1, this.dQJ, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD, ao.dwu, n2);
                            break;
                        }
                        ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD, ao.dwv, n2);
                        break;
                    }
                    case dwt: {
                        if (n3 <= 1) {
                            ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQG + 1, this.dQJ, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQG - 3, ao.dwu, n2);
                            break;
                        }
                        ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQG - 3, ao.dwv, n2);
                        break;
                    }
                    case dwu: {
                        if (n3 <= 1) {
                            ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD, this.dQJ, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD - 1, ao.dws, n2);
                            break;
                        }
                        ab.a(y2, list, random, this.dQI.dQB, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQG + 1, ao.dwt, n2);
                        break;
                    }
                    case dwv: {
                        if (n3 <= 1) {
                            ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD, this.dQJ, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ab.a(y2, list, random, this.dQI.dQE - 3, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQD - 1, ao.dws, n2);
                            break;
                        }
                        ab.a(y2, list, random, this.dQI.dQE - 3, this.dQI.dQC - 1 + random.nextInt(3), this.dQI.dQG + 1, ao.dwt, n2);
                    }
                }
            }
            if (n2 >= 8) break block25;
            if (this.dQJ != ao.dws && this.dQJ != ao.dwt) {
                int n4 = this.dQI.dQB + 3;
                while (n4 + 3 <= this.dQI.dQE) {
                    int n5 = random.nextInt(5);
                    if (n5 == 0) {
                        ab.a(y2, list, random, n4, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, n2 + 1);
                    } else if (n5 == 1) {
                        ab.a(y2, list, random, n4, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, n2 + 1);
                    }
                    n4 += 5;
                }
            } else {
                int n6 = this.dQI.dQD + 3;
                while (n6 + 3 <= this.dQI.dQG) {
                    int n7 = random.nextInt(5);
                    if (n7 == 0) {
                        ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, n6, ao.dwu, n2 + 1);
                    } else if (n7 == 1) {
                        ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, n6, ao.dwv, n2 + 1);
                    }
                    n6 += 5;
                }
            }
        }
    }

    @Override
    protected boolean a(net.minecraft.world.w w2, w w3, Random random, int n2, int n3, int n4, List<dg> list, int n5) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2) && w2.L(b2).df().xb() == Material.beo) {
            int n6 = random.nextBoolean() ? 1 : 0;
            w2.a(b2, Blocks.cMx.aM(this.g(Blocks.cMx, n6)), 2);
            n n7 = new n(w2, (float)b2.wt() + 0.5f, (float)b2.wu() + 0.5f, (float)b2.wx() + 0.5f);
            dg.a(random, list, n7, n5);
            w2.G(n7);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.a(w2, w3)) {
            return false;
        }
        boolean bl2 = false;
        int n6 = 2;
        boolean bl3 = false;
        int n7 = 2;
        int n8 = this.dQS * 5 - 1;
        this.a(w2, w3, 0, 0, 0, 2, 1, n8, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, random, 0.8f, 0, 2, 0, 2, 2, n8, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        if (this.dQQ) {
            this.a(w2, w3, random, 0.6f, 0, 0, 0, 2, 1, n8, Blocks.cLI.xM(), Blocks.cLc.xM(), false);
        }
        for (n5 = 0; n5 < this.dQS; ++n5) {
            n4 = 2 + n5 * 5;
            this.a(w2, w3, 0, 0, n4, 0, 1, n4, Blocks.cMQ.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, 2, 0, n4, 2, 1, n4, Blocks.cMQ.xM(), Blocks.cLc.xM(), false);
            if (random.nextInt(4) == 0) {
                this.a(w2, w3, 0, 2, n4, 0, 2, n4, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
                this.a(w2, w3, 2, 2, n4, 2, 2, n4, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
            } else {
                this.a(w2, w3, 0, 2, n4, 2, 2, n4, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
            }
            this.a(w2, w3, random, 0.1f, 0, 2, n4 - 1, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.1f, 2, 2, n4 - 1, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.1f, 0, 2, n4 + 1, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.1f, 2, 2, n4 + 1, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.05f, 0, 2, n4 - 2, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.05f, 2, 2, n4 - 2, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.05f, 0, 2, n4 + 2, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.05f, 2, 2, n4 + 2, Blocks.cLI.xM());
            this.a(w2, w3, random, 0.05f, 1, 2, n4 - 1, Blocks.cMc.aM(ao.dwr.OY()));
            this.a(w2, w3, random, 0.05f, 1, 2, n4 + 1, Blocks.cMc.aM(ao.dwr.OY()));
            if (random.nextInt(100) == 0) {
                this.a(w2, w3, random, 2, 0, n4 - 1, dg.a(ab.dQN, Items.cSh.f(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.a(w2, w3, random, 0, 0, n4 + 1, dg.a(ab.dQN, Items.cSh.f(random)), 3 + random.nextInt(4));
            }
            if (!this.dQQ || this.dQR) continue;
            n3 = this.iH(0);
            int n9 = n4 - 1 + random.nextInt(3);
            n2 = this.bn(1, n9);
            b b2 = new b(n2, n3, n9 = this.bo(1, n9));
            if (!w3.k(b2)) continue;
            this.dQR = true;
            w2.a(b2, Blocks.cMe.xM(), 2);
            d d2 = w2.K(b2);
            if (!(d2 instanceof net.minecraft.tileentity.ab)) continue;
            ((net.minecraft.tileentity.ab)d2).aqI().fW("CaveSpider");
        }
        for (n5 = 0; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= n8; ++n4) {
                n3 = -1;
                IBlockState iBlockState = this.a(w2, n5, -1, n4, w3);
                if (iBlockState.df().xb() != Material.beo) continue;
                n2 = -1;
                this.a(w2, Blocks.cLh.xM(), n5, -1, n4, w3);
            }
        }
        if (this.dQP) {
            for (n5 = 0; n5 <= n8; ++n5) {
                IBlockState iBlockState = this.a(w2, 1, -1, n5, w3);
                if (iBlockState.df().xb() == Material.beo || !iBlockState.df().isFullBlock()) continue;
                this.a(w2, w3, random, 0.7f, 1, 0, n5, Blocks.cMx.aM(this.g(Blocks.cMx, 0)));
            }
        }
        return true;
    }
}

