/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.Arrays;
import java.util.List;
import net.minecraft.src.a;
import net.optifine.shaders.ah;
import net.optifine.util.aj;

public abstract class o {
    private String name = null;
    private String description = null;
    private String cpv = null;
    private String[] eHw = null;
    private String eFX = null;
    private String[] eHx = null;
    private boolean enabled = true;
    private boolean visible = true;
    public static final String eHy = "\u00a7a";
    public static final String eHz = "\u00a7c";
    public static final String eHA = "\u00a79";

    public o(String string, String string2, String string3, String[] stringArray, String string4, String string5) {
        this.name = string;
        this.description = string2;
        this.cpv = string3;
        this.eHw = stringArray;
        this.eFX = string4;
        if (string5 != null) {
            this.eHx = new String[]{string5};
        }
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String aId() {
        String string = a.fS(this.description);
        string = aj.ax(string, "//");
        string = ah.ak("option." + this.getName() + ".comment", string);
        return string;
    }

    public void jp(String string) {
        this.description = string;
    }

    public String SN() {
        return this.cpv;
    }

    public boolean jq(String string) {
        int n2 = o.b(string, this.eHw);
        if (n2 < 0) {
            return false;
        }
        this.cpv = string;
        return true;
    }

    public String aHp() {
        return this.eFX;
    }

    public void aHy() {
        this.cpv = this.eFX;
    }

    public void aHs() {
        int n2 = o.b(this.cpv, this.eHw);
        if (n2 >= 0) {
            n2 = (n2 + 1) % this.eHw.length;
            this.cpv = this.eHw[n2];
        }
    }

    public void aIe() {
        int n2 = o.b(this.cpv, this.eHw);
        if (n2 >= 0) {
            n2 = (n2 - 1 + this.eHw.length) % this.eHw.length;
            this.cpv = this.eHw[n2];
        }
    }

    private static int b(String string, String[] stringArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!string2.equals(string)) continue;
            return i2;
        }
        return -1;
    }

    public String[] aIf() {
        return this.eHx;
    }

    public void o(String[] stringArray) {
        List<String> list = Arrays.asList(this.eHx);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (list.contains(string)) continue;
            this.eHx = (String[])a.a((Object[])this.eHx, (Object)string);
        }
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public boolean aIg() {
        return !a.a((Object)this.cpv, (Object)this.eFX);
    }

    public boolean wE() {
        return this.visible;
    }

    public void M(boolean bl2) {
        this.visible = bl2;
    }

    public boolean jr(String string) {
        return o.b(string, this.eHw) >= 0;
    }

    public String aIh() {
        return ah.ak("option." + this.name, this.name);
    }

    public String js(String string) {
        return ah.ak("value." + this.name + "." + string, string);
    }

    public String jt(String string) {
        return "";
    }

    public boolean ju(String string) {
        return false;
    }

    public boolean aIi() {
        return false;
    }

    public boolean jv(String string) {
        return false;
    }

    public String aHV() {
        return null;
    }

    public String[] aIj() {
        return (String[])this.eHw.clone();
    }

    public float aIk() {
        if (this.eHw.length <= 1) {
            return 0.0f;
        }
        int n2 = o.b(this.cpv, this.eHw);
        if (n2 < 0) {
            return 0.0f;
        }
        float f2 = 1.0f * (float)n2 / ((float)this.eHw.length - 1.0f);
        return f2;
    }

    public void ck(float f2) {
        if (this.eHw.length > 1) {
            f2 = a.F(f2, 0.0f, 1.0f);
            int n2 = Math.round(f2 * (float)(this.eHw.length - 1));
            this.cpv = this.eHw[n2];
        }
    }

    public String toString() {
        return this.name + ", value: " + this.cpv + ", valueDefault: " + this.eFX + ", paths: " + a.c(this.eHx);
    }
}

