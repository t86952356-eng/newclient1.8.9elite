/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import java.util.ArrayList;
import java.util.List;
import net.optifine.shaders.uniform.g;
import net.optifine.shaders.uniform.h;
import net.optifine.shaders.uniform.j;
import net.optifine.shaders.uniform.k;
import net.optifine.shaders.uniform.l;
import net.optifine.shaders.uniform.m;
import net.optifine.shaders.uniform.n;
import net.optifine.shaders.uniform.o;

public class p {
    private final List<n> eKG = new ArrayList<n>();

    public void kp(int n2) {
        for (int i2 = 0; i2 < this.eKG.size(); ++i2) {
            n n3 = this.eKG.get(i2);
            n3.kp(n2);
        }
    }

    public void aX() {
        for (int i2 = 0; i2 < this.eKG.size(); ++i2) {
            n n2 = this.eKG.get(i2);
            n2.aX();
        }
    }

    public h jR(String string) {
        h h2 = new h(string);
        this.eKG.add(h2);
        return h2;
    }

    public j jS(String string) {
        j j2 = new j(string);
        this.eKG.add(j2);
        return j2;
    }

    public m jT(String string) {
        m m2 = new m(string);
        this.eKG.add(m2);
        return m2;
    }

    public g jU(String string) {
        g g2 = new g(string);
        this.eKG.add(g2);
        return g2;
    }

    public k jV(String string) {
        k k2 = new k(string);
        this.eKG.add(k2);
        return k2;
    }

    public l jW(String string) {
        l l2 = new l(string);
        this.eKG.add(l2);
        return l2;
    }

    public o jX(String string) {
        o o2 = new o(string);
        this.eKG.add(o2);
        return o2;
    }
}

