/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.optifine.util.ae;

public class ai {
    private float eNp;
    private float eNq;
    private float eNr;
    private long eNs;

    public ai(float f2, float f3) {
        this(f2, f3, f3);
    }

    public ai(float f2, float f3, float f4) {
        this.eNp = f2;
        this.eNq = f3;
        this.eNr = f4;
        this.eNs = System.currentTimeMillis();
    }

    public float aJt() {
        return this.eNp;
    }

    public float aJu() {
        return this.eNq;
    }

    public float aJv() {
        return this.eNr;
    }

    public long aJw() {
        return this.eNs;
    }

    public float P(float f2, float f3, float f4) {
        this.eNq = f3;
        this.eNr = f4;
        return this.cr(f2);
    }

    public float cr(float f2) {
        float f3;
        long l2 = System.currentTimeMillis();
        float f4 = this.eNp;
        long l3 = this.eNs;
        float f5 = (float)(l2 - l3) / 1000.0f;
        float f6 = f2 >= f4 ? this.eNq : this.eNr;
        this.eNp = f3 = ai.q(f4, f2, f5, f6);
        this.eNs = l2;
        return f3;
    }

    public static float q(float f2, float f3, float f4, float f5) {
        float f6;
        if (f4 <= 0.0f) {
            return f2;
        }
        float f7 = f3 - f2;
        if (f5 > 0.0f && f4 < f5 && Math.abs(f7) > 1.0E-6f) {
            float f8 = f5 / f4;
            float f9 = 4.61f;
            float f10 = 0.13f;
            float f11 = 10.0f;
            float f12 = 4.61f - 1.0f / (0.13f + f8 / 10.0f);
            float f13 = f4 / f5 * f12;
            f13 = ae.F(f13, 0.0f, 1.0f);
            f6 = f2 + f7 * f13;
        } else {
            f6 = f3;
        }
        return f6;
    }
}

