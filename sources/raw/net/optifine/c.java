/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.util.ao;
import net.minecraft.util.b;

public final class c
extends Enum<c> {
    public static final /* enum */ c dVa = new c(ao.dwq);
    public static final /* enum */ c dVb = new c(ao.dwr);
    public static final /* enum */ c dVc = new c(ao.dws);
    public static final /* enum */ c dVd = new c(ao.dwt);
    public static final /* enum */ c dVe = new c(ao.dwu);
    public static final /* enum */ c dVf = new c(ao.dwv);
    public static final /* enum */ c dVg = new c(ao.dws, ao.dwu);
    public static final /* enum */ c dVh = new c(ao.dws, ao.dwv);
    public static final /* enum */ c dVi = new c(ao.dwt, ao.dwu);
    public static final /* enum */ c dVj = new c(ao.dwt, ao.dwv);
    public static final /* enum */ c dVk = new c(ao.dwq, ao.dws);
    public static final /* enum */ c dVl = new c(ao.dwq, ao.dwt);
    public static final /* enum */ c dVm = new c(ao.dwr, ao.dws);
    public static final /* enum */ c dVn = new c(ao.dwr, ao.dwt);
    public static final /* enum */ c dVo = new c(ao.dwq, ao.dwu);
    public static final /* enum */ c dVp = new c(ao.dwq, ao.dwv);
    public static final /* enum */ c dVq = new c(ao.dwr, ao.dwu);
    public static final /* enum */ c dVr = new c(ao.dwr, ao.dwv);
    private final ao dVs;
    private ao dVt;
    private static final /* synthetic */ c[] dVu;

    public static c[] values() {
        return (c[])dVu.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(ao ao2) {
        this.dVs = ao2;
    }

    private c(ao ao2, ao ao3) {
        this.dVs = ao2;
        this.dVt = ao3;
    }

    public ao aAc() {
        return this.dVs;
    }

    public ao aAd() {
        return this.dVt;
    }

    b by(b b2) {
        b2 = b2.d(this.dVs, 1);
        if (this.dVt != null) {
            b2 = b2.d(this.dVt, 1);
        }
        return b2;
    }

    public int aAe() {
        int n2 = this.dVs.asH();
        if (this.dVt != null) {
            n2 += this.dVt.asH();
        }
        return n2;
    }

    public int aAf() {
        int n2 = this.dVs.asI();
        if (this.dVt != null) {
            n2 += this.dVt.asI();
        }
        return n2;
    }

    public int aAg() {
        int n2 = this.dVs.asJ();
        if (this.dVt != null) {
            n2 += this.dVt.asJ();
        }
        return n2;
    }

    public boolean yk() {
        return this.dVt != null;
    }

    private static /* synthetic */ c[] aAh() {
        return new c[]{dVa, dVb, dVc, dVd, dVe, dVf, dVg, dVh, dVi, dVj, dVk, dVl, dVm, dVn, dVo, dVp, dVq, dVr};
    }

    static {
        dVu = c.aAh();
    }
}

