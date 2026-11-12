/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.stats;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.stats.a;
import net.minecraft.stats.f;
import net.minecraft.util.bc;
import net.minecraft.util.cx;

public class m {
    protected final Map<f, cx> dpA = Maps.newConcurrentMap();

    public boolean d(a a2) {
        return this.c(a2) > 0;
    }

    public boolean e(a a2) {
        return a2.dou == null || this.d(a2.dou);
    }

    public int f(a a2) {
        if (this.d(a2)) {
            return 0;
        }
        int n2 = 0;
        a a3 = a2.dou;
        while (a3 != null && !this.d(a3)) {
            a3 = a3.dou;
            ++n2;
        }
        return n2;
    }

    public void a(net.minecraft.entity.player.a a2, f f2, int n2) {
        if (!f2.apo() || this.e((a)f2)) {
            this.b(a2, f2, this.c(f2) + n2);
        }
    }

    public void b(net.minecraft.entity.player.a a2, f f2, int n2) {
        cx cx2 = this.dpA.get(f2);
        if (cx2 == null) {
            cx2 = new cx();
            this.dpA.put(f2, cx2);
        }
        cx2.hV(n2);
    }

    public int c(f f2) {
        cx cx2 = this.dpA.get(f2);
        return cx2 == null ? 0 : cx2.atN();
    }

    public <T extends bc> T d(f f2) {
        cx cx2 = this.dpA.get(f2);
        return cx2 != null ? (T)cx2.atO() : null;
    }

    public <T extends bc> T a(f f2, T t2) {
        cx cx2 = this.dpA.get(f2);
        if (cx2 == null) {
            cx2 = new cx();
            this.dpA.put(f2, cx2);
        }
        cx2.a(t2);
        return t2;
    }
}

