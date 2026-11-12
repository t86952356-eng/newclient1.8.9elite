/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

public class f {
    private boolean enabled;
    private int bLd;
    private int bLe;
    private int bLf;
    private int bLg;

    public f() {
        this(false, 1, 0);
    }

    public f(boolean bl2) {
        this(bl2, 1, 0);
    }

    public f(boolean bl2, int n2, int n3, int n4, int n5) {
        this.enabled = bl2;
        this.bLd = n2;
        this.bLe = n3;
        this.bLf = n4;
        this.bLg = n5;
    }

    public f(boolean bl2, int n2, int n3) {
        this(bl2, n2, n3, n2, n3);
    }

    public void a(boolean bl2, int n2, int n3, int n4, int n5) {
        this.enabled = bl2;
        this.bLd = n2;
        this.bLe = n3;
        this.bLf = n4;
        this.bLg = n5;
    }

    public void d(f f2) {
        this.enabled = f2.enabled;
        this.bLd = f2.bLd;
        this.bLe = f2.bLe;
        this.bLf = f2.bLf;
        this.bLg = f2.bLg;
    }

    public void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public void Kg() {
        this.enabled = true;
    }

    public void Kf() {
        this.enabled = false;
    }

    public void bI(int n2, int n3) {
        this.bLd = n2;
        this.bLe = n3;
        this.bLf = n2;
        this.bLg = n3;
    }

    public void J(int n2, int n3, int n4, int n5) {
        this.bLd = n2;
        this.bLe = n3;
        this.bLf = n4;
        this.bLg = n5;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public int aDQ() {
        return this.bLd;
    }

    public int aDR() {
        return this.bLe;
    }

    public int aDS() {
        return this.bLf;
    }

    public int aDT() {
        return this.bLg;
    }

    public boolean aDU() {
        return this.bLd != this.bLf || this.bLe != this.bLg;
    }

    public String toString() {
        return "enabled: " + this.enabled + ", src: " + this.bLd + ", dst: " + this.bLe + ", srcAlpha: " + this.bLf + ", dstAlpha: " + this.bLg;
    }
}

