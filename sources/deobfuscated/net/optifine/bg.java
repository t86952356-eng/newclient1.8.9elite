/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Properties;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.y;
import net.minecraft.util.cm;
import net.minecraft.util.db;
import net.minecraft.world.biome.j;
import net.minecraft.world.w;
import net.optifine.at;
import net.optifine.bd;
import net.optifine.be;
import net.optifine.config.a;
import net.optifine.config.k;
import net.optifine.config.l;
import net.optifine.config.n;
import net.optifine.config.o;
import net.optifine.config.p;
import net.optifine.config.q;
import net.optifine.reflect.g;
import net.optifine.util.b;
import net.optifine.util.z;

public class bg {
    private String eec = null;
    private cm eed = null;
    private final int eee;
    private int[] eef = null;
    private cm[] eea = null;
    private int[] dVT = null;
    private j[] dEV = null;
    private o dVP = null;
    private o eeg = null;
    private boolean eeh = false;
    private l dVX = null;
    public int[] dVY = null;
    public int dVZ = 1;
    private p[] dZs = null;
    private net.minecraft.item.b[] eei = null;
    private Boolean eej = null;
    private o eek = null;
    private o eel = null;
    private q[] eem = null;

    public bg(Properties properties, String string, cm cm2, int n2, String string2, a a2) {
        String string3;
        this.eec = string;
        this.eed = cm2;
        this.eee = n2;
        this.eef = a2.hO(string2);
        this.dVT = a2.hO(properties.getProperty("weights." + n2));
        this.dEV = a2.hM(properties.getProperty("biomes." + n2));
        this.dVP = a2.hx(properties.getProperty("heights." + n2));
        if (this.dVP == null) {
            this.dVP = this.a(properties, n2);
        }
        if ((string3 = properties.getProperty("health." + n2)) != null) {
            this.eeh = string3.contains("%");
            string3 = string3.replace("%", "");
            this.eeg = a2.hx(string3);
        }
        this.dVX = a2.ag("name", properties.getProperty("name." + n2));
        this.dZs = a2.hR(properties.getProperty("professions." + n2));
        this.eei = a2.a(properties.getProperty("collarColors." + n2), "collar color", a.eeW);
        this.eej = a2.hQ(properties.getProperty("baby." + n2));
        this.eek = a2.hx(properties.getProperty("moonPhase." + n2));
        this.eel = a2.hx(properties.getProperty("dayTime." + n2));
        this.eem = a2.a(properties.getProperty("weather." + n2), "weather." + n2, (q[])null);
    }

    private o a(Properties properties, int n2) {
        String string = properties.getProperty("minHeight." + n2);
        String string2 = properties.getProperty("maxHeight." + n2);
        if (string == null && string2 == null) {
            return null;
        }
        int n3 = 0;
        if (string != null && (n3 = net.minecraft.src.a.x(string, -1)) < 0) {
            net.minecraft.src.a.warn("Invalid minHeight: " + string);
            return null;
        }
        int n4 = 256;
        if (string2 != null && (n4 = net.minecraft.src.a.x(string2, -1)) < 0) {
            net.minecraft.src.a.warn("Invalid maxHeight: " + string2);
            return null;
        }
        if (n4 < 0) {
            net.minecraft.src.a.warn("Invalid minHeight, maxHeight: " + string + ", " + string2);
            return null;
        }
        o o2 = new o();
        o2.a(new n(n3, n4));
        return o2;
    }

    public boolean gY(String string) {
        if (this.eef != null && this.eef.length != 0) {
            int n2;
            int n3;
            if (this.eea != null) {
                return true;
            }
            this.eea = new cm[this.eef.length];
            boolean bl2 = this.eec.startsWith("mcpatcher/mob/");
            cm cm2 = bd.d(this.eed, bl2);
            if (cm2 == null) {
                net.minecraft.src.a.warn("Invalid path: " + this.eed.atA());
                return false;
            }
            for (n3 = 0; n3 < this.eea.length; ++n3) {
                n2 = this.eef[n3];
                if (n2 <= 1) {
                    this.eea[n3] = this.eed;
                    continue;
                }
                cm cm3 = bd.b(cm2, n2);
                if (cm3 == null) {
                    net.minecraft.src.a.warn("Invalid path: " + this.eed.atA());
                    return false;
                }
                if (!net.minecraft.src.a.F(cm3)) {
                    net.minecraft.src.a.warn("Texture not found: " + cm3.atA());
                    return false;
                }
                this.eea[n3] = cm3;
            }
            if (this.dVT != null) {
                if (this.dVT.length > this.eea.length) {
                    net.minecraft.src.a.warn("More weights defined than skins, trimming weights: " + string);
                    int[] nArray = new int[this.eea.length];
                    System.arraycopy(this.dVT, 0, nArray, 0, nArray.length);
                    this.dVT = nArray;
                }
                if (this.dVT.length < this.eea.length) {
                    net.minecraft.src.a.warn("Less weights defined than skins, expanding weights: " + string);
                    int[] nArray = new int[this.eea.length];
                    System.arraycopy(this.dVT, 0, nArray, 0, this.dVT.length);
                    n2 = z.u(this.dVT);
                    for (int i2 = this.dVT.length; i2 < nArray.length; ++i2) {
                        nArray[i2] = n2;
                    }
                    this.dVT = nArray;
                }
                this.dVY = new int[this.dVT.length];
                n3 = 0;
                for (n2 = 0; n2 < this.dVT.length; ++n2) {
                    if (this.dVT[n2] < 0) {
                        net.minecraft.src.a.warn("Invalid weight: " + this.dVT[n2]);
                        return false;
                    }
                    this.dVY[n2] = n3 += this.dVT[n2];
                }
                this.dVZ = n3;
                if (this.dVZ <= 0) {
                    net.minecraft.src.a.warn("Invalid sum of all weights: " + n3);
                    this.dVZ = 1;
                }
            }
            if (this.dZs == a.eeV) {
                net.minecraft.src.a.warn("Invalid professions or careers: " + string);
                return false;
            }
            if (this.eei == a.eeW) {
                net.minecraft.src.a.warn("Invalid collar colors: " + string);
                return false;
            }
            return true;
        }
        net.minecraft.src.a.warn("Invalid skins for rule: " + this.eee);
        return false;
    }

    public boolean a(at at2) {
        c c2;
        c c3;
        net.minecraft.entity.p p2;
        c c4;
        int n2;
        Object object;
        if (this.dEV != null && !k.a(at2.aBu(), this.dEV)) {
            return false;
        }
        if (this.dVP != null && (object = at2.aBt()) != null && !this.dVP.jt(((db)object).wu())) {
            return false;
        }
        if (this.eeg != null) {
            int n3 = at2.aBv();
            if (this.eeh && (n2 = at2.aBw()) > 0) {
                n3 = (int)((double)(n3 * 100) / (double)n2);
            }
            if (!this.eeg.jt(n3)) {
                return false;
            }
        }
        if (this.dVX != null && !this.dVX.hW((String)(object = at2.getName()))) {
            return false;
        }
        if (this.dZs != null && at2 instanceof be && (c4 = ((be)(object = (be)at2)).dk()) instanceof net.minecraft.entity.passive.z) {
            p2 = (net.minecraft.entity.passive.z)c4;
            int n4 = ((net.minecraft.entity.passive.z)p2).abq();
            int n5 = g.a((Object)p2, g.eqX, -1);
            if (n4 < 0 || n5 < 0) {
                return false;
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < this.dZs.length; ++i2) {
                p p3 = this.dZs[i2];
                if (!p3.bH(n4, n5)) continue;
                bl2 = true;
                break;
            }
            if (!bl2) {
                return false;
            }
        }
        if (this.eei != null && at2 instanceof be && (c3 = ((be)(object = (be)at2)).dk()) instanceof ai) {
            p2 = (ai)c3;
            if (!((y)p2).abl()) {
                return false;
            }
            net.minecraft.item.b b2 = ((ai)p2).abD();
            if (!net.minecraft.src.a.e(b2, this.eei)) {
                return false;
            }
        }
        if (this.eej != null && at2 instanceof be && (c2 = ((be)(object = (be)at2)).dk()) instanceof net.minecraft.entity.p && (p2 = (net.minecraft.entity.p)c2).Uz() != this.eej.booleanValue()) {
            return false;
        }
        if (this.eek != null && (object = net.minecraft.src.a.AZ().bgF) != null && !this.eek.jt(n2 = ((w)object).avs())) {
            return false;
        }
        if (this.eel != null && (object = net.minecraft.src.a.AZ().bgF) != null && !this.eel.jt(n2 = (int)((w)object).avH().getWorldTime())) {
            return false;
        }
        if (this.eem != null && (object = net.minecraft.src.a.AZ().bgF) != null) {
            q q2 = q.a((w)object, 0.0f);
            return b.c((Object[])this.eem, (Object)q2);
        }
        return true;
    }

    public cm c(cm cm2, int n2) {
        if (this.eea != null && this.eea.length != 0) {
            int n3 = 0;
            if (this.dVT == null) {
                n3 = n2 % this.eea.length;
            } else {
                int n4 = n2 % this.dVZ;
                for (int i2 = 0; i2 < this.dVY.length; ++i2) {
                    if (this.dVY[i2] <= n4) continue;
                    n3 = i2;
                    break;
                }
            }
            return this.eea[n3];
        }
        return cm2;
    }
}

