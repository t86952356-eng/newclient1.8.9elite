/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public class adw {
    private final int aDC;
    private final int aDD;
    private final int aDE;
    private final int aDF;
    private final String[] aDG;

    public int ai(int n2) {
        return Integer.parseInt(this.aDG[n2]);
    }

    public void l(int n2, int n3) {
        this.aDG[n2] = String.valueOf(n3);
    }

    public adw(int n2, int n3, int n4, int n5) {
        this.aDG = new String[]{String.valueOf(n2), String.valueOf(n3), String.valueOf(n4), String.valueOf(n5)};
        this.aDC = n2;
        this.aDD = n3;
        this.aDE = n4;
        this.aDF = n5;
    }

    public adw(String string) {
        this.aDG = string.split("\\.");
        this.aDC = Integer.parseInt(this.aDG[0]);
        this.aDD = Integer.parseInt(this.aDG[1]);
        this.aDE = Integer.parseInt(this.aDG[2]);
        this.aDF = Integer.parseInt(this.aDG[3]);
    }

    public static adw a(adw adw2, adw adw3) {
        int n2 = Math.min(adw2.aDC, adw3.aDC);
        int n3 = Math.min(adw2.aDD, adw3.aDD);
        int n4 = Math.min(adw2.aDE, adw3.aDE);
        int n5 = Math.min(adw2.aDF, adw3.aDF);
        return new adw(n2, n3, n4, n5);
    }

    public static adw b(adw adw2, adw adw3) {
        int n2 = Math.max(adw2.aDC, adw3.aDC);
        int n3 = Math.max(adw2.aDD, adw3.aDD);
        int n4 = Math.max(adw2.aDE, adw3.aDE);
        int n5 = Math.max(adw2.aDF, adw3.aDF);
        return new adw(n2, n3, n4, n5);
    }

    public String toString() {
        return this.aDG[0] + "." + this.aDG[1] + "." + this.aDG[2] + "." + this.aDG[3];
    }

    @Generated
    public int rK() {
        return this.aDC;
    }

    @Generated
    public int rL() {
        return this.aDD;
    }

    @Generated
    public int rM() {
        return this.aDE;
    }

    @Generated
    public int rN() {
        return this.aDF;
    }

    @Generated
    public String[] rO() {
        return this.aDG;
    }
}

