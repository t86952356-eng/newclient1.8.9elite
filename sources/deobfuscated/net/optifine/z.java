/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.n;
import net.minecraft.client.gui.s;
import net.minecraft.client.gui.y;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.t;
import net.minecraft.tileentity.w;
import net.minecraft.util.cm;
import net.optifine.aa;
import net.optifine.ab;
import net.optifine.ac;
import net.optifine.config.a;
import net.optifine.config.k;
import net.optifine.config.l;
import net.optifine.config.o;
import net.optifine.config.p;
import net.optifine.reflect.g;
import net.optifine.reflect.j;
import net.optifine.util.aj;
import net.optifine.util.ak;

public class z {
    private String dTy = null;
    private String bZI = null;
    private aa dZl = null;
    private Map<cm, cm> dZm = null;
    private l dVX = null;
    private net.minecraft.world.biome.j[] dEV = null;
    private o dVP = null;
    private Boolean dZn = null;
    private Boolean dZo = null;
    private Boolean dZp = null;
    private Boolean dZq = null;
    private o dZr = null;
    private p[] dZs = null;
    private ab[] dZt = null;
    private net.minecraft.item.b[] dZu = null;
    private static final ab[] dZv = new ab[]{ab.eac, ab.ead, ab.eae, ab.eaf};
    private static final ab[] dZw = new ab[]{ab.eag, ab.eah};
    private static final ab[] dZx = new ab[0];
    private static final net.minecraft.item.b[] dZy = new net.minecraft.item.b[0];
    private static final cm dZz = new cm("textures/gui/container/anvil.png");
    private static final cm dZA = new cm("textures/gui/container/beacon.png");
    private static final cm dZB = new cm("textures/gui/container/brewing_stand.png");
    private static final cm dZC = new cm("textures/gui/container/generic_54.png");
    private static final cm dZD = new cm("textures/gui/container/crafting_table.png");
    private static final cm dZE = new cm("textures/gui/container/horse.png");
    private static final cm dZF = new cm("textures/gui/container/dispenser.png");
    private static final cm dZG = new cm("textures/gui/container/enchanting_table.png");
    private static final cm dZH = new cm("textures/gui/container/furnace.png");
    private static final cm dZI = new cm("textures/gui/container/hopper.png");
    private static final cm dZJ = new cm("textures/gui/container/inventory.png");
    private static final cm dZK = new cm("textures/gui/container/shulker_box.png");
    private static final cm dZL = new cm("textures/gui/container/villager.png");

    public z(Properties properties, String string) {
        a a2 = new a("CustomGuis");
        this.dTy = a2.gQ(string);
        this.bZI = a2.gR(string);
        this.dZl = (aa)a2.a(properties.getProperty("container"), aa.values(), "container");
        this.dZm = z.a(properties, "texture", this.dZl, "textures/gui/", this.bZI);
        this.dVX = a2.ag("name", properties.getProperty("name"));
        this.dEV = a2.hM(properties.getProperty("biomes"));
        this.dVP = a2.hx(properties.getProperty("heights"));
        this.dZn = a2.hQ(properties.getProperty("large"));
        this.dZo = a2.hQ(properties.getProperty("trapped"));
        this.dZp = a2.hQ(properties.getProperty("christmas"));
        this.dZq = a2.hQ(properties.getProperty("ender"));
        this.dZr = a2.hx(properties.getProperty("levels"));
        this.dZs = a2.hR(properties.getProperty("professions"));
        Enum[] enumArray = z.a(this.dZl);
        this.dZt = (ab[])a2.a(properties.getProperty("variants"), enumArray, "variants", dZx);
        this.dZu = z.hv(properties.getProperty("colors"));
    }

    private static ab[] a(aa aa2) {
        return aa2 == aa.dZV ? dZv : (aa2 == aa.dZR ? dZw : new ab[]{});
    }

    private static net.minecraft.item.b[] hv(String string) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        net.minecraft.item.b[] bArray = new net.minecraft.item.b[stringArray.length];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            net.minecraft.item.b b2 = z.hw(string2);
            if (b2 == null) {
                z.warn("Invalid color: " + string2);
                return dZy;
            }
            bArray[i2] = b2;
        }
        return bArray;
    }

    private static net.minecraft.item.b hw(String string) {
        if (string == null) {
            return null;
        }
        net.minecraft.item.b[] bArray = net.minecraft.item.b.values();
        for (int i2 = 0; i2 < bArray.length; ++i2) {
            net.minecraft.item.b b2 = bArray[i2];
            if (b2.getName().equals(string)) {
                return b2;
            }
            if (!b2.xB().equals(string)) continue;
            return b2;
        }
        return null;
    }

    private static cm ab(String string, String string2) {
        if (string == null) {
            return null;
        }
        Object object = ak.M(string = string.trim(), string2);
        if (!((String)object).endsWith(".png")) {
            object = (String)object + ".png";
        }
        return new cm(string2 + "/" + (String)object);
    }

    private static Map<cm, cm> a(Properties properties, String string, aa aa2, String string2, String string3) {
        Object object;
        HashMap<cm, cm> hashMap = new HashMap<cm, cm>();
        String string4 = properties.getProperty(string);
        if (string4 != null) {
            object = z.b(aa2);
            cm cm2 = z.ab(string4, string3);
            if (object != null && cm2 != null) {
                hashMap.put((cm)object, cm2);
            }
        }
        object = string + ".";
        for (Object e2 : properties.keySet()) {
            String string5 = (String)e2;
            if (!string5.startsWith((String)object)) continue;
            String string6 = string5.substring(((String)object).length());
            string6 = string6.replace('\\', '/');
            string6 = aj.j(string6, "/", ".png");
            String string7 = string2 + string6 + ".png";
            String string8 = properties.getProperty(string5);
            cm cm3 = new cm(string7);
            cm cm4 = z.ab(string8, string3);
            hashMap.put(cm3, cm4);
        }
        return hashMap;
    }

    private static cm b(aa aa2) {
        switch (aa2.ordinal()) {
            case 0: {
                return dZz;
            }
            case 1: {
                return dZA;
            }
            case 2: {
                return dZB;
            }
            case 3: {
                return dZC;
            }
            case 4: {
                return dZD;
            }
            case 12: {
                return null;
            }
            case 5: {
                return dZF;
            }
            case 6: {
                return dZG;
            }
            case 7: {
                return dZH;
            }
            case 8: {
                return dZI;
            }
            case 9: {
                return dZE;
            }
            case 13: {
                return dZJ;
            }
            case 11: {
                return dZK;
            }
            case 10: {
                return dZL;
            }
        }
        return null;
    }

    public boolean gY(String string) {
        if (this.dTy != null && this.dTy.length() > 0) {
            if (this.bZI == null) {
                z.warn("No base path found: " + string);
                return false;
            }
            if (this.dZl == null) {
                z.warn("No container found: " + string);
                return false;
            }
            if (this.dZm.isEmpty()) {
                z.warn("No texture found: " + string);
                return false;
            }
            if (this.dZs == a.eeV) {
                z.warn("Invalid professions or careers: " + string);
                return false;
            }
            if (this.dZt == dZx) {
                z.warn("Invalid variants: " + string);
                return false;
            }
            if (this.dZu == dZy) {
                z.warn("Invalid colors: " + string);
                return false;
            }
            return true;
        }
        z.warn("No name found: " + string);
        return false;
    }

    private static void warn(String string) {
        net.minecraft.src.a.warn("[CustomGuis] " + string);
    }

    private boolean a(aa aa2, net.minecraft.util.b b2, net.minecraft.world.l l2) {
        net.minecraft.world.biome.j j2;
        if (this.dZl != aa2) {
            return false;
        }
        if (this.dEV != null && !k.a(j2 = l2.aF(b2), this.dEV)) {
            return false;
        }
        return this.dVP == null || this.dVP.jt(b2.wu());
    }

    public boolean a(aa aa2, net.minecraft.util.b b2, net.minecraft.world.l l2, GuiScreen guiScreen) {
        String string;
        if (!this.a(aa2, b2, l2)) {
            return false;
        }
        if (this.dVX != null && !this.dVX.hW(string = z.d(guiScreen))) {
            return false;
        }
        switch (aa2.ordinal()) {
            case 1: {
                return this.a(b2, l2);
            }
            case 3: {
                return this.b(b2, l2);
            }
            case 5: {
                return this.c(b2, l2);
            }
        }
        return true;
    }

    public static String d(GuiScreen guiScreen) {
        net.minecraft.world.p p2 = z.e(guiScreen);
        return p2 == null ? null : p2.xW().arq();
    }

    private static net.minecraft.world.p e(GuiScreen guiScreen) {
        return guiScreen instanceof b ? z.a(guiScreen, g.era) : (guiScreen instanceof net.minecraft.client.gui.inventory.g ? z.a(guiScreen, g.erc) : (guiScreen instanceof h ? z.a(guiScreen, g.ere) : (guiScreen instanceof n ? ((n)guiScreen).bwX : (guiScreen instanceof s ? z.a(guiScreen, g.erg) : (guiScreen instanceof net.minecraft.client.gui.inventory.p ? z.a(guiScreen, g.eri) : (guiScreen instanceof y ? z.a(guiScreen, g.erk) : null))))));
    }

    private static net.minecraft.world.p a(GuiScreen guiScreen, j j2) {
        Object object = g.a(guiScreen, j2);
        return !(object instanceof net.minecraft.world.p) ? null : (net.minecraft.world.p)object;
    }

    private boolean a(net.minecraft.util.b b2, net.minecraft.world.l l2) {
        d d2 = l2.K(b2);
        if (!(d2 instanceof net.minecraft.tileentity.j)) {
            return false;
        }
        net.minecraft.tileentity.j j2 = (net.minecraft.tileentity.j)d2;
        if (this.dZr != null) {
            net.minecraft.nbt.n n2 = new net.minecraft.nbt.n();
            j2.b(n2);
            int n3 = n2.eG("Levels");
            return this.dZr.jt(n3);
        }
        return true;
    }

    private boolean b(net.minecraft.util.b b2, net.minecraft.world.l l2) {
        d d2 = l2.K(b2);
        if (d2 instanceof m) {
            m m2 = (m)d2;
            return this.a(m2, b2, l2);
        }
        if (d2 instanceof w) {
            w w2 = (w)d2;
            return this.a(w2, b2, l2);
        }
        return false;
    }

    private boolean a(m m2, net.minecraft.util.b b2, net.minecraft.world.l l2) {
        boolean bl2 = m2.dsA != null || m2.dsz != null || m2.dsy != null || m2.dsB != null;
        boolean bl3 = m2.aqu() == 1;
        boolean bl4 = ac.eam;
        boolean bl5 = false;
        return this.b(bl2, bl3, bl4, false);
    }

    private boolean a(w w2, net.minecraft.util.b b2, net.minecraft.world.l l2) {
        return this.b(false, false, false, true);
    }

    private boolean b(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        return !(this.dZn != null && this.dZn != bl2 || this.dZo != null && this.dZo != bl3 || this.dZp != null && this.dZp != bl4 || this.dZq != null && this.dZq != bl5);
    }

    private boolean c(net.minecraft.util.b b2, net.minecraft.world.l l2) {
        d d2 = l2.K(b2);
        if (!(d2 instanceof net.minecraft.tileentity.s)) {
            return false;
        }
        net.minecraft.tileentity.s s2 = (net.minecraft.tileentity.s)d2;
        if (this.dZt != null) {
            ab ab2 = this.a(s2);
            return net.minecraft.src.a.e((Object)ab2, (Object[])this.dZt);
        }
        return true;
    }

    private ab a(net.minecraft.tileentity.s s2) {
        return s2 instanceof t ? ab.eah : ab.eag;
    }

    public boolean a(aa aa2, c c2, net.minecraft.world.l l2) {
        String string;
        if (!this.a(aa2, c2.yl(), l2)) {
            return false;
        }
        if (this.dVX != null && !this.dVX.hW(string = c2.xU())) {
            return false;
        }
        switch (aa2.ordinal()) {
            case 9: {
                return this.b(c2, l2);
            }
            case 10: {
                return this.a(c2, l2);
            }
        }
        return true;
    }

    private boolean a(c c2, net.minecraft.world.l l2) {
        if (!(c2 instanceof net.minecraft.entity.passive.z)) {
            return false;
        }
        net.minecraft.entity.passive.z z2 = (net.minecraft.entity.passive.z)c2;
        if (this.dZs != null) {
            int n2 = z2.abq();
            int n3 = g.a((Object)z2, g.eqX, -1);
            if (n3 < 0) {
                return false;
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < this.dZs.length; ++i2) {
                p p2 = this.dZs[i2];
                if (!p2.bH(n2, n3)) continue;
                bl2 = true;
                break;
            }
            return bl2;
        }
        return true;
    }

    private boolean b(c c2, net.minecraft.world.l l2) {
        if (!(c2 instanceof f)) {
            return false;
        }
        f f2 = (f)c2;
        if (this.dZt != null) {
            ab ab2 = this.c(f2);
            return net.minecraft.src.a.e((Object)ab2, (Object[])this.dZt);
        }
        return true;
    }

    private ab c(f f2) {
        int n2 = f2.ZX();
        switch (n2) {
            case 0: {
                return ab.eac;
            }
            case 1: {
                return ab.ead;
            }
            case 2: {
                return ab.eae;
            }
        }
        return null;
    }

    public aa aAC() {
        return this.dZl;
    }

    public cm I(cm cm2) {
        cm cm3 = this.dZm.get(cm2);
        return cm3 == null ? cm2 : cm3;
    }

    public String toString() {
        return "name: " + this.dTy + ", container: " + String.valueOf((Object)this.dZl) + ", textures: " + String.valueOf(this.dZm);
    }
}

