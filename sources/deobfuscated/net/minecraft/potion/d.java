/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.potion;

import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.potion.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rise.module.impl.movement.PotionExtender;
import rise.util.InstanceAccess;

public class d
implements InstanceAccess {
    private static final Logger dhi = LogManager.getLogger();
    public final int dhj;
    public int duration;
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
        this.duration = n3;
        this.dhk = n4;
        this.dhm = bl2;
        this.dho = bl3;
    }

    public d(d d2) {
        this.dhj = d2.dhj;
        this.duration = d2.duration;
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
            this.duration = d2.duration;
        } else if (d2.dhk == this.dhk && this.duration < d2.duration) {
            this.duration = d2.duration;
        } else if (!d2.dhm && this.dhm) {
            this.dhm = d2.dhm;
        }
        this.dho = d2.dho;
    }

    public int aje() {
        return this.dhj;
    }

    public int getDuration() {
        return this.duration;
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
        if (this.duration > 0) {
            if (this.dhj < a.dgt.length) {
                if (a.dgt[this.dhj].au(this.duration, this.dhk)) {
                    this.ab(r2);
                }
                this.aji();
            } else {
                this.duration = 0;
            }
        }
        return this.duration > 0;
    }

    private int aji() {
        PotionExtender potionExtender = this.e(PotionExtender.class);
        if (potionExtender != null && potionExtender.isEnabled() && potionExtender.DU.containsKey(this)) {
            return this.duration;
        }
        return --this.duration;
    }

    public void ab(r r2) {
        if (this.duration > 0) {
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
        return this.dhj == d2.dhj && this.dhk == d2.dhk && this.duration == d2.duration && this.dhl == d2.dhl && this.dhm == d2.dhm;
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

