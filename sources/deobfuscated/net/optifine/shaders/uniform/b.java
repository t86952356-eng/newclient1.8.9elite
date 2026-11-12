/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import java.util.ArrayList;
import java.util.Map;
import net.optifine.expr.l;
import net.optifine.expr.n;
import net.optifine.shaders.uniform.a;

public class b {
    private final a[] eIO;
    private final n[] eIP;

    public b(a[] aArray, Map<String, l> map) {
        this.eIO = aArray;
        ArrayList<n> arrayList = new ArrayList<n>();
        for (String string : map.keySet()) {
            l l2 = map.get(string);
            if (!(l2 instanceof n)) continue;
            n n2 = (n)((Object)l2);
            arrayList.add(n2);
        }
        this.eIP = arrayList.toArray(new n[arrayList.size()]);
    }

    public void kp(int n2) {
        for (int i2 = 0; i2 < this.eIO.length; ++i2) {
            a a2 = this.eIO[i2];
            a2.kp(n2);
        }
    }

    public void jA() {
        this.aIE();
        for (int i2 = 0; i2 < this.eIO.length; ++i2) {
            a a2 = this.eIO[i2];
            a2.jA();
        }
    }

    private void aIE() {
        for (int i2 = 0; i2 < this.eIP.length; ++i2) {
            n n2 = this.eIP[i2];
            n2.aX();
        }
    }

    public void aX() {
        for (int i2 = 0; i2 < this.eIO.length; ++i2) {
            a a2 = this.eIO[i2];
            a2.aX();
        }
    }
}

