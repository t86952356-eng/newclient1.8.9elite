/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.potion;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.aj;
import net.minecraft.entity.r;
import net.minecraft.potion.b;
import net.minecraft.potion.c;
import net.minecraft.potion.d;
import net.minecraft.potion.e;
import net.minecraft.potion.f;
import net.minecraft.util.ad;
import net.minecraft.util.cm;
import net.minecraft.util.ct;

public class a {
    public static final a[] dgt = new a[32];
    private static final Map<cm, a> dgu = Maps.newHashMap();
    public static final a dgv = null;
    public static final a dgw = new a(1, new cm("speed"), false, 8171462).eX("potion.moveSpeed").at(0, 0).a(aj.cwp, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2);
    public static final a dgx = new a(2, new cm("slowness"), true, 5926017).eX("potion.moveSlowdown").at(1, 0).a(aj.cwp, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2);
    public static final a dgy = new a(3, new cm("haste"), false, 14270531).eX("potion.digSpeed").at(2, 0).au(1.5);
    public static final a dgz = new a(4, new cm("mining_fatigue"), true, 4866583).eX("potion.digSlowDown").at(3, 0);
    public static final a dgA = new c(5, new cm("strength"), false, 9643043).eX("potion.damageBoost").at(4, 0).a(aj.cwq, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 2.5, 2);
    public static final a dgB = new e(6, new cm("instant_health"), false, 16262179).eX("potion.heal");
    public static final a dgC = new e(7, new cm("instant_damage"), true, 4393481).eX("potion.harm");
    public static final a dgD = new a(8, new cm("jump_boost"), false, 2293580).eX("potion.jump").at(2, 1);
    public static final a dgE = new a(9, new cm("nausea"), true, 5578058).eX("potion.confusion").at(3, 1).au(0.25);
    public static final a dgF = new a(10, new cm("regeneration"), false, 13458603).eX("potion.regeneration").at(7, 0).au(0.25);
    public static final a dgG = new a(11, new cm("resistance"), false, 10044730).eX("potion.resistance").at(6, 1);
    public static final a dgH = new a(12, new cm("fire_resistance"), false, 14981690).eX("potion.fireResistance").at(7, 1);
    public static final a dgI = new a(13, new cm("water_breathing"), false, 3035801).eX("potion.waterBreathing").at(0, 2);
    public static final a dgJ = new a(14, new cm("invisibility"), false, 8356754).eX("potion.invisibility").at(0, 1);
    public static final a dgK = new a(15, new cm("blindness"), true, 2039587).eX("potion.blindness").at(5, 1).au(0.25);
    public static final a dgL = new a(16, new cm("night_vision"), false, 0x1F1FA1).eX("potion.nightVision").at(4, 1);
    public static final a dgM = new a(17, new cm("hunger"), true, 5797459).eX("potion.hunger").at(1, 1);
    public static final a dgN = new c(18, new cm("weakness"), true, 0x484D48).eX("potion.weakness").at(5, 0).a(aj.cwq, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0, 0);
    public static final a dgO = new a(19, new cm("poison"), true, 5149489).eX("potion.poison").at(6, 0).au(0.25);
    public static final a dgP = new a(20, new cm("wither"), true, 3484199).eX("potion.wither").at(1, 2).au(0.25);
    public static final a dgQ = new f(21, new cm("health_boost"), false, 16284963).eX("potion.healthBoost").at(2, 2).a(aj.cwm, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0);
    public static final a dgR = new b(22, new cm("absorption"), false, 0x2552A5).eX("potion.absorption").at(2, 2);
    public static final a dgS = new e(23, new cm("saturation"), false, 16262179).eX("potion.saturation");
    public static final a dgT = null;
    public static final a dgU = null;
    public static final a dgV = null;
    public static final a dgW = null;
    public static final a dgX = null;
    public static final a dgY = null;
    public static final a dgZ = null;
    public static final a dha = null;
    public final int id;
    private final Map<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> dhc = Maps.newHashMap();
    private final boolean dhd;
    private final int dhe;
    private String name = "";
    private int dhf = -1;
    private double dhg;
    private boolean dhh;

    protected a(int n2, cm cm2, boolean bl2, int n3) {
        this.id = n2;
        a.dgt[n2] = this;
        dgu.put(cm2, this);
        this.dhd = bl2;
        this.dhg = bl2 ? 0.5 : 1.0;
        this.dhe = n3;
    }

    public static a eW(String string) {
        return dgu.get(new cm(string));
    }

    public static Set<cm> aiV() {
        return dgu.keySet();
    }

    protected a at(int n2, int n3) {
        this.dhf = n2 + n3 * 8;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public void b(r r2, int n2) {
        if (this.id == a.dgF.id) {
            if (r2.getHealth() < r2.getMaxHealth()) {
                r2.P(1.0f);
            }
        } else if (this.id == a.dgO.id) {
            if (r2.getHealth() > 1.0f) {
                r2.a(ad.dvm, 1.0f);
            }
        } else if (this.id == a.dgP.id) {
            r2.a(ad.dvn, 1.0f);
        } else if (this.id == a.dgM.id && r2 instanceof net.minecraft.entity.player.a) {
            ((net.minecraft.entity.player.a)r2).bs(0.025f * (float)(n2 + 1));
        } else if (this.id == a.dgS.id && r2 instanceof net.minecraft.entity.player.a) {
            if (!r2.baU.dDw) {
                ((net.minecraft.entity.player.a)r2).abY().h(n2 + 1, 1.0f);
            }
        } else if (!(this.id == a.dgB.id && !r2.VM() || this.id == a.dgC.id && r2.VM())) {
            if (this.id == a.dgC.id && !r2.VM() || this.id == a.dgB.id && r2.VM()) {
                r2.a(ad.dvm, (float)(6 << n2));
            }
        } else {
            r2.P(Math.max(4 << n2, 0));
        }
    }

    public void a(net.minecraft.entity.c c2, net.minecraft.entity.c c3, r r2, int n2, double d2) {
        if (!(this.id == a.dgB.id && !r2.VM() || this.id == a.dgC.id && r2.VM())) {
            if (this.id == a.dgC.id && !r2.VM() || this.id == a.dgB.id && r2.VM()) {
                int n3 = (int)(d2 * (double)(6 << n2) + 0.5);
                if (c2 == null) {
                    r2.a(ad.dvm, (float)n3);
                } else {
                    r2.a(ad.d(c2, c3), (float)n3);
                }
            }
        } else {
            int n4 = (int)(d2 * (double)(4 << n2) + 0.5);
            r2.P(n4);
        }
    }

    public boolean aiW() {
        return false;
    }

    public boolean au(int n2, int n3) {
        if (this.id == a.dgF.id) {
            int n4 = 50 >> n3;
            return n4 <= 0 || n2 % n4 == 0;
        }
        if (this.id == a.dgO.id) {
            int n5 = 25 >> n3;
            return n5 <= 0 || n2 % n5 == 0;
        }
        if (this.id == a.dgP.id) {
            int n6 = 40 >> n3;
            return n6 <= 0 || n2 % n6 == 0;
        }
        return this.id == a.dgM.id;
    }

    public a eX(String string) {
        this.name = string;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public boolean aiX() {
        return this.dhf >= 0;
    }

    public int aiY() {
        return this.dhf;
    }

    public boolean aiZ() {
        return this.dhd;
    }

    public static String f(d d2) {
        if (d2.ajk()) {
            return "**:**";
        }
        int n2 = d2.getDuration();
        return ct.hU(n2);
    }

    protected a au(double d2) {
        this.dhg = d2;
        return this;
    }

    public double aja() {
        return this.dhg;
    }

    public boolean ajb() {
        return this.dhh;
    }

    public int ajc() {
        return this.dhe;
    }

    public a a(net.minecraft.entity.ai.attributes.d d2, String string, double d3, int n2) {
        net.minecraft.entity.ai.attributes.a a2 = new net.minecraft.entity.ai.attributes.a(UUID.fromString(string), this.getName(), d3, n2);
        this.dhc.put(d2, a2);
        return this;
    }

    public Map<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> ajd() {
        return this.dhc;
    }

    public void a(r r2, net.minecraft.entity.ai.attributes.c c2, int n2) {
        for (Map.Entry<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> entry : this.dhc.entrySet()) {
            net.minecraft.entity.ai.attributes.e e2 = c2.b(entry.getKey());
            if (e2 == null) continue;
            e2.d(entry.getValue());
        }
    }

    public void b(r r2, net.minecraft.entity.ai.attributes.c c2, int n2) {
        for (Map.Entry<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> entry : this.dhc.entrySet()) {
            net.minecraft.entity.ai.attributes.e e2 = c2.b(entry.getKey());
            if (e2 == null) continue;
            net.minecraft.entity.ai.attributes.a a2 = entry.getValue();
            e2.d(a2);
            e2.c(new net.minecraft.entity.ai.attributes.a(a2.Xo(), this.getName() + " " + n2, this.a(n2, a2), a2.Xp()));
        }
    }

    public double a(int n2, net.minecraft.entity.ai.attributes.a a2) {
        return a2.Xq() * (double)(n2 + 1);
    }
}

