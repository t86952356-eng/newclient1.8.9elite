/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class ca {
    private float dzm;
    private float dzn;
    private float dzo;

    public float y(float f2, float f3) {
        this.dzm += f2;
        f2 = (this.dzm - this.dzn) * f3;
        this.dzo += (f2 - this.dzo) * 0.5f;
        if (f2 > 0.0f && f2 > this.dzo || f2 < 0.0f && f2 < this.dzo) {
            f2 = this.dzo;
        }
        this.dzn += f2;
        return f2;
    }

    public void aX() {
        this.dzm = 0.0f;
        this.dzn = 0.0f;
        this.dzo = 0.0f;
    }
}

