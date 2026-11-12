/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.src.a;
import net.optifine.config.n;

public class o {
    private n[] efv = new n[0];

    public o() {
    }

    public o(n n2) {
        this.a(n2);
    }

    public void a(n n2) {
        this.efv = (n[])a.a((Object[])this.efv, (Object)n2);
    }

    public boolean jt(int n2) {
        for (int i2 = 0; i2 < this.efv.length; ++i2) {
            n n3 = this.efv[i2];
            if (!n3.jt(n2)) continue;
            return true;
        }
        return false;
    }

    public int aCa() {
        return this.efv.length;
    }

    public n ju(int n2) {
        return this.efv[n2];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i2 = 0; i2 < this.efv.length; ++i2) {
            n n2 = this.efv[i2];
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(n2.toString());
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}

