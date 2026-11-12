/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.util.cm;
import net.optifine.at;
import net.optifine.bg;
import net.optifine.config.a;

public class bf {
    public String gK = null;
    public String bZI = null;
    public cm[] eea = null;
    public bg[] eeb = null;

    public bf(String string, cm[] cmArray) {
        a a2 = new a("RandomEntities");
        this.gK = a2.gQ(string);
        this.bZI = a2.gR(string);
        this.eea = cmArray;
    }

    public bf(Properties properties, String string, cm cm2) {
        a a2 = new a("RandomEntities");
        this.gK = a2.gQ(string);
        this.bZI = a2.gR(string);
        this.eeb = this.a(properties, string, cm2, a2);
    }

    public cm a(cm cm2, at at2) {
        int n2;
        if (this.eeb != null) {
            for (n2 = 0; n2 < this.eeb.length; ++n2) {
                bg bg2 = this.eeb[n2];
                if (!bg2.a(at2)) continue;
                return bg2.c(cm2, at2.getId());
            }
        }
        if (this.eea != null) {
            n2 = at2.getId();
            int n3 = n2 % this.eea.length;
            return this.eea[n3];
        }
        return cm2;
    }

    private bg[] a(Properties properties, String string, cm cm2, a a2) {
        ArrayList<bg> arrayList = new ArrayList<bg>();
        int n2 = properties.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            bg bg2;
            int n3 = i2 + 1;
            String string2 = properties.getProperty("textures." + n3);
            if (string2 == null) {
                string2 = properties.getProperty("skins." + n3);
            }
            if (string2 == null || !(bg2 = new bg(properties, string, cm2, n3, string2, a2)).gY(string)) continue;
            arrayList.add(bg2);
        }
        bg[] bgArray = arrayList.toArray(new bg[arrayList.size()]);
        return bgArray;
    }

    public boolean gY(String string) {
        Object object;
        int n2;
        if (this.eea == null && this.eeb == null) {
            net.minecraft.src.a.warn("No skins specified: " + string);
            return false;
        }
        if (this.eeb != null) {
            for (n2 = 0; n2 < this.eeb.length; ++n2) {
                object = this.eeb[n2];
                if (((bg)object).gY(string)) continue;
                return false;
            }
        }
        if (this.eea != null) {
            for (n2 = 0; n2 < this.eea.length; ++n2) {
                object = this.eea[n2];
                if (net.minecraft.src.a.F((cm)object)) continue;
                net.minecraft.src.a.warn("Texture not found: " + ((cm)object).atA());
                return false;
            }
        }
        return true;
    }

    public boolean aBJ() {
        return this.eeb == null && this.eea == null;
    }
}

