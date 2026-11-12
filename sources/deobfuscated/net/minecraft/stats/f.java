/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.minecraft.event.c;
import net.minecraft.scoreboard.b;
import net.minecraft.stats.d;
import net.minecraft.stats.e;
import net.minecraft.stats.g;
import net.minecraft.stats.h;
import net.minecraft.stats.i;
import net.minecraft.stats.j;
import net.minecraft.stats.n;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.bc;
import net.minecraft.util.s;

public class f {
    public final String dpn;
    private final ba dpo;
    public boolean dpp;
    private final d dpq;
    private final b dpr;
    private Class<? extends bc> dps;
    private static final NumberFormat dpt = NumberFormat.getIntegerInstance(Locale.US);
    public static d dpu = new g();
    private static final DecimalFormat dpv = new DecimalFormat("########0.00");
    public static d dpw = new h();
    public static d dpx = new i();
    public static d dpy = new j();

    public f(String string, ba ba2, d d2) {
        this.dpn = string;
        this.dpo = ba2;
        this.dpq = d2;
        this.dpr = new e(this);
        b.djp.put(this.dpr.getName(), this.dpr);
    }

    public f(String string, ba ba2) {
        this(string, ba2, dpu);
    }

    public f aps() {
        this.dpp = true;
        return this;
    }

    public f apr() {
        if (n.dpB.containsKey(this.dpn)) {
            throw new RuntimeException("Duplicate stat id: \"" + String.valueOf(n.dpB.get((Object)this.dpn).dpo) + "\" and \"" + String.valueOf(this.dpo) + "\" at id " + this.dpn);
        }
        n.dpC.add(this);
        n.dpB.put(this.dpn, this);
        return this;
    }

    public boolean apo() {
        return false;
    }

    public String hj(int n2) {
        return this.dpq.hj(n2);
    }

    public ba app() {
        ba ba2 = this.dpo.arl();
        ba2.arp().b(an.dvS);
        ba2.arp().a(new c(net.minecraft.event.d.cKV, new s(this.dpn)));
        return ba2;
    }

    public ba apt() {
        ba ba2 = this.app();
        ba ba3 = new s("[").n(ba2).ga("]");
        ba3.a(ba2.arp());
        return ba3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            f f2 = (f)object;
            return this.dpn.equals(f2.dpn);
        }
        return false;
    }

    public int hashCode() {
        return this.dpn.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.dpn + ", nameId=" + String.valueOf(this.dpo) + ", awardLocallyOnly=" + this.dpp + ", formatter=" + String.valueOf(this.dpq) + ", objectiveCriteria=" + String.valueOf(this.dpr) + "}";
    }

    public b apu() {
        return this.dpr;
    }

    public Class<? extends bc> apv() {
        return this.dps;
    }

    public f n(Class<? extends bc> clazz) {
        this.dps = clazz;
        return this;
    }
}

