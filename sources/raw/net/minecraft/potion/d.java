/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.potion;

import hackclient.rise.aea;
import hackclient.rise.me;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.potion.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d
implements aea {
    private static final Logger dhi = LogManager.getLogger();
    public final int dhj;
    public int cGO;
    public int dhk;
    public boolean dhl;
    public boolean dhm;
    private boolean dhn;
    private boolean dho;

    public d(int n2, int n3) {
        this(n2, n3, 0);
    }

    public d(int n2, int n3, int n4) {
        this(n2, n3, n4, false, true);
    }

    public d(int n2, int n3, int n4, boolean bl2, boolean bl3) {
        this.dhj = n2;
        this.cGO = n3;
        this.dhk = n4;
        this.dhm = bl2;
        this.dho = bl3;
    }

    public d(d d2) {
        this.dhj = d2.dhj;
        this.cGO = d2.cGO;
        this.dhk = d2.dhk;
        this.dhm = d2.dhm;
        this.dho = d2.dho;
    }

    public void g(d d2) {
        if (this.dhj != d2.dhj) {
            dhi.warn("This method should only be called for matching effects!");
        }
        if (d2.dhk > this.dhk) {
            this.dhk = d2.dhk;
            this.cGO = d2.cGO;
        } else if (d2.dhk == this.dhk && this.cGO < d2.cGO) {
            this.cGO = d2.cGO;
        } else if (!d2.dhm && this.dhm) {
            this.dhm = d2.dhm;
        }
        this.dho = d2.dho;
    }

    public int aje() {
        return this.dhj;
    }

    public int getDuration() {
        return this.cGO;
    }

    public int ajf() {
        return this.dhk;
    }

    public void bV(boolean bl2) {
        this.dhl = bl2;
    }

    public boolean ajg() {
        return this.dhm;
    }

    public boolean ajh() {
        return this.dho;
    }

    public boolean aa(r r2) {
        if (this.cGO > 0) {
            if (this.dhj < a.dgt.length) {
                if (a.dgt[this.dhj].au(this.cGO, this.dhk)) {
                    this.ab(r2);
                }
                this.aji();
            } else {
                this.cGO = 0;
            }
        }
        return this.cGO > 0;
    }

    private int aji() {
        me me2 = this.e(me.class);
        if (me2 != null && me2.isEnabled() && me2.DU.containsKey(this)) {
            return this.cGO;
        }
        return --this.cGO;
    }

    public void ab(r r2) {
        if (this.cGO > 0) {
            a.dgt[this.dhj].b(r2, this.dhk);
        }
    }

    public String ajj() {
        return a.dgt[this.dhj].getName();
    }

    public int hashCode() {
        return this.dhj;
    }

    public String toString() {
        Object object = "";
        object = this.ajf() > 0 ? this.ajj() + " x " + (this.ajf() + 1) + ", Duration: " + this.getDuration() : this.ajj() + ", Duration: " + this.getDuration();
        if (this.dhl) {
            object = (String)object + ", Splash: true";
        }
        if (!this.dho) {
            object = (String)object + ", Particles: false";
        }
        return a.dgt[this.dhj].ajb() ? "(" + (String)object + ")" : object;
    }

    public boolean equals(Object object) {
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        return this.dhj == d2.dhj && this.dhk == d2.dhk && this.cGO == d2.cGO && this.dhl == d2.dhl && this.dhm == d2.dhm;
    }

    public n z(n n2) {
        n2.a("Id", (byte)this.aje());
        n2.a("Amplifier", (byte)this.ajf());
        n2.B("Duration", this.getDuration());
        n2.o("Ambient", this.ajg());
        n2.o("ShowParticles", this.ajh());
        return n2;
    }

    public static d A(n n2) {
        byte by2 = n2.eE("Id");
        if (by2 >= 0 && by2 < a.dgt.length && a.dgt[by2] != null) {
            byte by3 = n2.eE("Amplifier");
            int n3 = n2.eG("Duration");
            boolean bl2 = n2.eO("Ambient");
            boolean bl3 = true;
            if (n2.C("ShowParticles", 1)) {
                bl3 = n2.eO("ShowParticles");
            }
            return new d(by2, n3, by3, bl2, bl3);
        }
        return null;
    }

    public void bW(boolean bl2) {
        this.dhn = bl2;
    }

    public boolean ajk() {
        return this.dhn;
    }
}

