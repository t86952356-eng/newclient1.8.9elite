/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.inventory;

import java.util.Map;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ae;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.w;
import net.minecraft.inventory.x;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v
extends b {
    private static final Logger cTz = LogManager.getLogger();
    private final ab cTA = new ae();
    private final ab cTB = new w(this, "Repair", true, 2);
    private final net.minecraft.world.w cTC;
    private final net.minecraft.util.b cTD;
    public int cTE;
    private int cTF;
    private String cTG;
    private final net.minecraft.entity.player.a cTH;

    public v(g g2, net.minecraft.world.w w2, net.minecraft.entity.player.a a2) {
        this(g2, w2, net.minecraft.util.b.dtN, a2);
    }

    public v(g g2, net.minecraft.world.w w2, net.minecraft.util.b b2, net.minecraft.entity.player.a a2) {
        int n2;
        this.cTD = b2;
        this.cTC = w2;
        this.cTH = a2;
        this.c(new ak(this.cTB, 0, 27, 47));
        this.c(new ak(this.cTB, 1, 76, 47));
        this.c(new x(this, this.cTA, 2, 134, 47, w2, b2));
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
    public void b(ab ab2) {
        super.b(ab2);
        if (ab2 == this.cTB) {
            this.adj();
        }
    }

    public void adj() {
        boolean bl2 = false;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        int n2 = 2;
        boolean bl6 = true;
        boolean bl7 = true;
        co co2 = this.cTB.fi(0);
        this.cTE = 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (co2 == null) {
            this.cTA.g(0, null);
            this.cTE = 0;
        } else {
            int n6;
            co co3 = co2.aeg();
            co co4 = this.cTB.fi(1);
            Map<Integer, Integer> map = l.U(co3);
            boolean bl8 = false;
            n4 = n4 + co2.aev() + (co4 == null ? 0 : co4.aev());
            this.cTF = 0;
            if (co4 != null) {
                boolean bl9 = bl8 = co4.bP() == Items.cSh && Items.cSh.aD(co4).aeS() > 0;
                if (co3.aed() && co3.bP().b(co2, co4)) {
                    int n7;
                    n6 = Math.min(co3.aef(), co3.adt() / 4);
                    if (n6 <= 0) {
                        this.cTA.g(0, null);
                        this.cTE = 0;
                        return;
                    }
                    for (n7 = 0; n6 > 0 && n7 < co4.cWZ; ++n7) {
                        int n8 = co3.aef() - n6;
                        co3.gf(n8);
                        ++n3;
                        n6 = Math.min(co3.aef(), co3.adt() / 4);
                    }
                    this.cTF = n7;
                } else {
                    int n9;
                    if (!(bl8 || co3.bP() == co4.bP() && co3.aed())) {
                        this.cTA.g(0, null);
                        this.cTE = 0;
                        return;
                    }
                    if (co3.aed() && !bl8) {
                        int n10 = co2.adt() - co2.aef();
                        int n11 = co4.adt() - co4.aef();
                        int n12 = n11 + co3.adt() * 12 / 100;
                        int n13 = n10 + n12;
                        n9 = co3.adt() - n13;
                        if (n9 < 0) {
                            n9 = 0;
                        }
                        if (n9 < co3.yc()) {
                            co3.gf(n9);
                            n3 += 2;
                        }
                    }
                    Map<Integer, Integer> map2 = l.U(co4);
                    for (int n12 : map2.keySet()) {
                        int n142;
                        a a2 = a.eh(n12);
                        if (a2 == null) continue;
                        n9 = map.containsKey(n12) ? map.get(n12) : 0;
                        int n15 = map2.get(n12);
                        int n16 = n9 == n15 ? ++n15 : Math.max(n15, n9);
                        n15 = n16;
                        boolean bl10 = a2.T(co2);
                        if (this.cTH.cIt.cJM || co2.bP() == Items.cSh) {
                            bl10 = true;
                        }
                        for (int n142 : map.keySet()) {
                            if (n142 == n12 || a2.a(a.eh(n142))) continue;
                            bl10 = false;
                            ++n3;
                        }
                        if (!bl10) continue;
                        if (n15 > a2.Te()) {
                            n15 = a2.Te();
                        }
                        map.put(n12, n15);
                        n142 = 0;
                        switch (a2.Cl()) {
                            case 1: {
                                n142 = 8;
                                break;
                            }
                            case 2: {
                                n142 = 4;
                            }
                            default: {
                                break;
                            }
                            case 5: {
                                n142 = 2;
                                break;
                            }
                            case 10: {
                                n142 = 1;
                            }
                        }
                        if (bl8) {
                            n142 = Math.max(1, n142 / 2);
                        }
                        n3 += n142 * n15;
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.cTG)) {
                if (co2.aen()) {
                    n5 = 1;
                    n3 += n5;
                    co3.aem();
                }
            } else if (!this.cTG.equals(co2.getDisplayName())) {
                n5 = 1;
                n3 += n5;
                co3.ey(this.cTG);
            }
            this.cTE = n4 + n3;
            if (n3 <= 0) {
                co3 = null;
            }
            if (n5 == n3 && n5 > 0 && this.cTE >= 40) {
                this.cTE = 39;
            }
            if (this.cTE >= 40 && !this.cTH.cIt.cJM) {
                co3 = null;
            }
            if (co3 != null) {
                n6 = co3.aev();
                if (co4 != null && n6 < co4.aev()) {
                    n6 = co4.aev();
                }
                n6 = n6 * 2 + 1;
                co3.gg(n6);
                l.a(map, co3);
            }
            this.cTA.g(0, co3);
            this.adc();
        }
    }

    @Override
    public void a(z z2) {
        super.a(z2);
        z2.a((b)this, 0, this.cTE);
    }

    @Override
    public void aq(int n2, int n3) {
        if (n2 == 0) {
            this.cTE = n3;
        }
    }

    @Override
    public void E(net.minecraft.entity.player.a a2) {
        super.E(a2);
        if (!this.cTC.dDw) {
            for (int i2 = 0; i2 < this.cTB.YI(); ++i2) {
                co co2 = this.cTB.fj(i2);
                if (co2 == null) continue;
                a2.d(co2, false);
            }
        }
    }

    @Override
    public boolean i(net.minecraft.entity.player.a a2) {
        return this.cTC.L(this.cTD).df() == Blocks.cOh && a2.M((double)this.cTD.wt() + 0.5, (double)this.cTD.wu() + 0.5, (double)this.cTD.wx() + 0.5) <= 64.0;
    }

    @Override
    public co a(net.minecraft.entity.player.a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 2) {
                if (!this.a(co3, 3, 39, true)) {
                    return null;
                }
                ak2.a(co3, co2);
            } else if (n2 != 0 && n2 != 1 ? n2 >= 3 && n2 < 39 && !this.a(co3, 0, 2, false) : !this.a(co3, 3, 39, false)) {
                return null;
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

    public void er(String string) {
        this.cTG = string;
        if (this.fM(2).GJ()) {
            co co2 = this.fM(2).ls();
            if (StringUtils.isBlank((CharSequence)string)) {
                co2.aem();
            } else {
                co2.ey(this.cTG);
            }
        }
        this.adj();
    }
}

