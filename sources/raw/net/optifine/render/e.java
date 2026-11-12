/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

public class e {
    private boolean enabled;
    private int bLa;
    private float bLb;

    public e() {
        this(false, 519, 0.0f);
    }

    public e(boolean bl2) {
        this(bl2, 519, 0.0f);
    }

    public e(boolean bl2, int n2, float f2) {
        this.enabled = bl2;
        this.bLa = n2;
        this.bLb = f2;
    }

    public void a(boolean bl2, int n2, float f2) {
        this.enabled = bl2;
        this.bLa = n2;
        this.bLb = f2;
    }

    public void d(e e2) {
        this.enabled = e2.enabled;
        this.bLa = e2.bLa;
        this.bLb = e2.bLb;
    }

    public void j(int n2, float f2) {
        this.bLa = n2;
        this.bLb = f2;
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

    public boolean isEnabled() {
        return this.enabled;
    }

    public int aDO() {
        return this.bLa;
    }

    public float aDP() {
        return this.bLb;
    }

    public String toString() {
        return "enabled: " + this.enabled + ", func: " + this.bLa + ", ref: " + this.bLb;
    }
}

