/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL14
 */
package net.minecraft.client.util;

import com.google.gson.JsonObject;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bn;
import org.lwjgl.opengl.GL14;

public class a {
    private static a cnt = null;
    private final int cnu;
    private final int cnv;
    private final int cnw;
    private final int cnx;
    private final int cny;
    private final boolean cnz;
    private final boolean cnA;

    private a(boolean bl2, boolean bl3, int n2, int n3, int n4, int n5, int n6) {
        this.cnz = bl2;
        this.cnu = n2;
        this.cnw = n3;
        this.cnv = n4;
        this.cnx = n5;
        this.cnA = bl3;
        this.cny = n6;
    }

    public a() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public a(int n2, int n3, int n4) {
        this(false, false, n2, n3, n2, n3, n4);
    }

    public a(int n2, int n3, int n4, int n5, int n6) {
        this(true, false, n2, n3, n4, n5, n6);
    }

    public void RP() {
        if (!this.equals(cnt)) {
            if (cnt == null || this.cnA != cnt.RQ()) {
                cnt = this;
                if (this.cnA) {
                    GlStateManager.tR();
                    return;
                }
                GlStateManager.tQ();
            }
            GL14.glBlendEquation((int)this.cny);
            if (this.cnz) {
                GlStateManager.h(this.cnu, this.cnw, this.cnv, this.cnx);
            } else {
                GlStateManager.P(this.cnu, this.cnw);
            }
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.cny == a2.cny && this.cnx == a2.cnx && this.cnw == a2.cnw && this.cnA == a2.cnA && this.cnz == a2.cnz && this.cnv == a2.cnv && this.cnu == a2.cnu;
    }

    public int hashCode() {
        int n2 = this.cnu;
        n2 = 31 * n2 + this.cnv;
        n2 = 31 * n2 + this.cnw;
        n2 = 31 * n2 + this.cnx;
        n2 = 31 * n2 + this.cny;
        n2 = 31 * n2 + (this.cnz ? 1 : 0);
        n2 = 31 * n2 + (this.cnA ? 1 : 0);
        return n2;
    }

    public boolean RQ() {
        return this.cnA;
    }

    public static a w(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new a();
        }
        int n2 = 32774;
        int n3 = 1;
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        boolean bl2 = true;
        boolean bl3 = false;
        if (bn.h(jsonObject, "func") && (n2 = a.dH(jsonObject.get("func").getAsString())) != 32774) {
            bl2 = false;
        }
        if (bn.h(jsonObject, "srcrgb") && (n3 = a.dI(jsonObject.get("srcrgb").getAsString())) != 1) {
            bl2 = false;
        }
        if (bn.h(jsonObject, "dstrgb") && (n4 = a.dI(jsonObject.get("dstrgb").getAsString())) != 0) {
            bl2 = false;
        }
        if (bn.h(jsonObject, "srcalpha")) {
            n5 = a.dI(jsonObject.get("srcalpha").getAsString());
            if (n5 != 1) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (bn.h(jsonObject, "dstalpha")) {
            n6 = a.dI(jsonObject.get("dstalpha").getAsString());
            if (n6 != 0) {
                bl2 = false;
            }
            bl3 = true;
        }
        return bl2 ? new a() : (bl3 ? new a(n3, n4, n5, n6, n2) : new a(n3, n4, n2));
    }

    private static int dH(String string) {
        String string2 = string.trim().toLowerCase();
        return string2.equals("add") ? 32774 : (string2.equals("subtract") ? 32778 : (string2.equals("reversesubtract") ? 32779 : (string2.equals("reverse_subtract") ? 32779 : (string2.equals("min") ? 32775 : (string2.equals("max") ? 32776 : 32774)))));
    }

    private static int dI(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        return (string2 = string2.replaceAll("minus", "-")).equals("0") ? 0 : (string2.equals("1") ? 1 : (string2.equals("srccolor") ? 768 : (string2.equals("1-srccolor") ? 769 : (string2.equals("dstcolor") ? 774 : (string2.equals("1-dstcolor") ? 775 : (string2.equals("srcalpha") ? 770 : (string2.equals("1-srcalpha") ? 771 : (string2.equals("dstalpha") ? 772 : (string2.equals("1-dstalpha") ? 773 : -1)))))))));
    }
}

