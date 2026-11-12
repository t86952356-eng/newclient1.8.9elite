/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import java.util.List;
import java.util.Random;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.k;
import net.minecraft.inventory.l;
import net.minecraft.inventory.m;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.world.w;

public class j
extends b {
    public ab cTb = new k(this, "Enchant", true, 2);
    private final w cTc;
    private final net.minecraft.util.b cTd;
    private final Random cTe = new Random();
    public int cIx;
    public int[] cTf = new int[3];
    public int[] cTg = new int[]{-1, -1, -1};

    public j(g g2, w w2) {
        this(g2, w2, net.minecraft.util.b.dtN);
    }

    public j(g g2, w w2, net.minecraft.util.b b2) {
        int n2;
        this.cTc = w2;
        this.cTd = b2;
        this.cIx = g2.bij.abW();
        this.c(new l(this, this.cTb, 0, 15, 47));
        this.c(new m(this, this.cTb, 1, 35, 47));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(g2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(g2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(z z2) {
        super.a(z2);
        z2.a((b)this, 0, this.cTf[0]);
        z2.a((b)this, 1, this.cTf[1]);
        z2.a((b)this, 2, this.cTf[2]);
        z2.a((b)this, 3, this.cIx & 0xFFFFFFF0);
        z2.a((b)this, 4, this.cTg[0]);
        z2.a((b)this, 5, this.cTg[1]);
        z2.a((b)this, 6, this.cTg[2]);
    }

    @Override
    public void adc() {
        super.adc();
        for (int i2 = 0; i2 < this.cSQ.size(); ++i2) {
            z z2 = (z)this.cSQ.get(i2);
            z2.a((b)this, 0, this.cTf[0]);
            z2.a((b)this, 1, this.cTf[1]);
            z2.a((b)this, 2, this.cTf[2]);
            z2.a((b)this, 3, this.cIx & 0xFFFFFFF0);
            z2.a((b)this, 4, this.cTg[0]);
            z2.a((b)this, 5, this.cTg[1]);
            z2.a((b)this, 6, this.cTg[2]);
        }
    }

    @Override
    public void aq(int n2, int n3) {
        if (n2 >= 0 && n2 <= 2) {
            this.cTf[n2] = n3;
        } else if (n2 == 3) {
            this.cIx = n3;
        } else if (n2 >= 4 && n2 <= 6) {
            this.cTg[n2 - 4] = n3;
        } else {
            super.aq(n2, n3);
        }
    }

    @Override
    public void b(ab ab2) {
        if (ab2 == this.cTb) {
            co co2 = ab2.fi(0);
            if (co2 != null && co2.aeq()) {
                if (!this.cTc.dDw) {
                    int n2;
                    int n3 = 0;
                    for (n2 = -1; n2 <= 1; ++n2) {
                        for (int i2 = -1; i2 <= 1; ++i2) {
                            if (n2 == 0 && i2 == 0 || !this.cTc.aG(this.cTd.C(i2, 0, n2)) || !this.cTc.aG(this.cTd.C(i2, 1, n2))) continue;
                            if (this.cTc.L(this.cTd.C(i2 * 2, 0, n2 * 2)).df() == Blocks.cLZ) {
                                ++n3;
                            }
                            if (this.cTc.L(this.cTd.C(i2 * 2, 1, n2 * 2)).df() == Blocks.cLZ) {
                                ++n3;
                            }
                            if (i2 == 0 || n2 == 0) continue;
                            if (this.cTc.L(this.cTd.C(i2 * 2, 0, n2)).df() == Blocks.cLZ) {
                                ++n3;
                            }
                            if (this.cTc.L(this.cTd.C(i2 * 2, 1, n2)).df() == Blocks.cLZ) {
                                ++n3;
                            }
                            if (this.cTc.L(this.cTd.C(i2, 0, n2 * 2)).df() == Blocks.cLZ) {
                                ++n3;
                            }
                            if (this.cTc.L(this.cTd.C(i2, 1, n2 * 2)).df() != Blocks.cLZ) continue;
                            ++n3;
                        }
                    }
                    this.cTe.setSeed(this.cIx);
                    for (n2 = 0; n2 < 3; ++n2) {
                        this.cTf[n2] = net.minecraft.enchantment.l.a(this.cTe, n2, n3, co2);
                        this.cTg[n2] = -1;
                        if (this.cTf[n2] >= n2 + 1) continue;
                        this.cTf[n2] = 0;
                    }
                    for (n2 = 0; n2 < 3; ++n2) {
                        List<net.minecraft.enchantment.g> list;
                        if (this.cTf[n2] <= 0 || (list = this.a(co2, n2, this.cTf[n2])) == null || list.isEmpty()) continue;
                        net.minecraft.enchantment.g g2 = list.get(this.cTe.nextInt(list.size()));
                        this.cTg[n2] = g2.cqE.cqw | g2.cqF << 8;
                    }
                    this.adc();
                }
            } else {
                for (int i3 = 0; i3 < 3; ++i3) {
                    this.cTf[i3] = 0;
                    this.cTg[i3] = -1;
                }
            }
        }
    }

    @Override
    public boolean c(a a2, int n2) {
        co co2 = this.cTb.fi(0);
        co co3 = this.cTb.fi(1);
        int n3 = n2 + 1;
        if (!(co3 != null && co3.cWZ >= n3 || a2.cIt.cJM)) {
            return false;
        }
        if (this.cTf[n2] > 0 && co2 != null && (a2.cIu >= n3 && a2.cIu >= this.cTf[n2] || a2.cIt.cJM)) {
            if (!this.cTc.dDw) {
                boolean bl2;
                List<net.minecraft.enchantment.g> list = this.a(co2, n2, this.cTf[n2]);
                boolean bl3 = bl2 = co2.bP() == Items.cQP;
                if (list != null) {
                    a2.fF(n3);
                    if (bl2) {
                        co2.r(Items.cSh);
                    }
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        net.minecraft.enchantment.g g2 = list.get(i2);
                        if (bl2) {
                            Items.cSh.a(co2, g2);
                            continue;
                        }
                        co2.b(g2.cqE, g2.cqF);
                    }
                    if (!a2.cIt.cJM) {
                        co3.cWZ -= n3;
                        if (co3.cWZ <= 0) {
                            this.cTb.g(1, null);
                        }
                    }
                    a2.a(n.dqx);
                    this.cTb.Lw();
                    this.cIx = a2.abW();
                    this.b(this.cTb);
                }
            }
            return true;
        }
        return false;
    }

    private List<net.minecraft.enchantment.g> a(co co2, int n2, int n3) {
        this.cTe.setSeed(this.cIx + n2);
        List<net.minecraft.enchantment.g> list = net.minecraft.enchantment.l.b(this.cTe, co2, n3);
        if (co2.bP() == Items.cQP && list != null && list.size() > 1) {
            list.remove(this.cTe.nextInt(list.size()));
        }
        return list;
    }

    public int adg() {
        co co2 = this.cTb.fi(1);
        return co2 == null ? 0 : co2.cWZ;
    }

    @Override
    public void E(a a2) {
        super.E(a2);
        if (!this.cTc.dDw) {
            for (int i2 = 0; i2 < this.cTb.YI(); ++i2) {
                co co2 = this.cTb.fj(i2);
                if (co2 == null) continue;
                a2.d(co2, false);
            }
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cTc.L(this.cTd).df() == Blocks.cNE && a2.M((double)this.cTd.wt() + 0.5, (double)this.cTd.wu() + 0.5, (double)this.cTd.wx() + 0.5) <= 64.0;
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 0) {
                if (!this.a(co3, 2, 38, true)) {
                    return null;
                }
            } else if (n2 == 1) {
                if (!this.a(co3, 2, 38, true)) {
                    return null;
                }
            } else if (co3.bP() == Items.cRa && net.minecraft.item.b.fR(co3.yc()) == net.minecraft.item.b.cUN) {
                if (!this.a(co3, 1, 2, true)) {
                    return null;
                }
            } else {
                if (((ak)this.cSK.get(0)).GJ() || !((ak)this.cSK.get(0)).H(co3)) {
                    return null;
                }
                if (co3.aej() && co3.cWZ == 1) {
                    ((ak)this.cSK.get(0)).I(co3.aeg());
                    co3.cWZ = 0;
                } else if (co3.cWZ >= 1) {
                    ((ak)this.cSK.get(0)).I(new co(co3.bP(), 1, co3.yc()));
                    --co3.cWZ;
                }
            }
            if (co3.cWZ == 0) {
                ak2.I(null);
            } else {
                ak2.GK();
            }
            if (co3.cWZ == co2.cWZ) {
                return null;
            }
            ak2.a(a2, co3);
        }
        return co2;
    }
}

