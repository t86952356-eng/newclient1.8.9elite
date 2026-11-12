/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.scoreboard;

import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.nbt.z;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.i;
import net.minecraft.scoreboard.m;
import net.minecraft.util.an;
import net.minecraft.world.ah;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j
extends ah {
    private static final Logger dkh = LogManager.getLogger();
    private i djE;
    private n dki;

    public j() {
        this("scoreboard");
    }

    public j(String string) {
        super(string);
    }

    public void c(i i2) {
        this.djE = i2;
        if (this.dki != null) {
            this.a(this.dki);
        }
    }

    @Override
    public void a(n n2) {
        if (this.djE == null) {
            this.dki = n2;
        } else {
            this.e(n2.D("Objectives", 10));
            this.f(n2.D("PlayerScores", 10));
            if (n2.C("DisplaySlots", 10)) {
                this.B(n2.eN("DisplaySlots"));
            }
            if (n2.C("Teams", 9)) {
                this.d(n2.D("Teams", 10));
            }
        }
    }

    protected void d(v v2) {
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            m m2;
            n n2 = v2.gi(i2);
            String string = n2.eK("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            h h2 = this.djE.fq(string);
            String string2 = n2.eK("DisplayName");
            if (string2.length() > 32) {
                string2 = string2.substring(0, 32);
            }
            h2.fl(string2);
            if (n2.C("TeamColor", 8)) {
                h2.a(an.gf(n2.eK("TeamColor")));
            }
            h2.fm(n2.eK("Prefix"));
            h2.fn(n2.eK("Suffix"));
            if (n2.C("AllowFriendlyFire", 99)) {
                h2.cb(n2.eO("AllowFriendlyFire"));
            }
            if (n2.C("SeeFriendlyInvisibles", 99)) {
                h2.cc(n2.eO("SeeFriendlyInvisibles"));
            }
            if (n2.C("NameTagVisibility", 8) && (m2 = m.fv(n2.eK("NameTagVisibility"))) != null) {
                h2.a(m2);
            }
            if (n2.C("DeathMessageVisibility", 8) && (m2 = m.fv(n2.eK("DeathMessageVisibility"))) != null) {
                h2.b(m2);
            }
            this.a(h2, n2.D("Players", 8));
        }
    }

    protected void a(h h2, v v2) {
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            this.djE.T(v2.gm(i2), h2.akq());
        }
    }

    protected void B(n n2) {
        for (int i2 = 0; i2 < 19; ++i2) {
            if (!n2.C("slot_" + i2, 8)) continue;
            String string = n2.eK("slot_" + i2);
            g g2 = this.djE.fo(string);
            this.djE.a(i2, g2);
        }
    }

    protected void e(v v2) {
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n2 = v2.gi(i2);
            b b2 = b.djp.get(n2.eK("CriteriaName"));
            if (b2 == null) continue;
            String string = n2.eK("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            g g2 = this.djE.a(string, b2);
            g2.ap(n2.eK("DisplayName"));
            g2.a(c.fj(n2.eK("RenderType")));
        }
    }

    protected void f(v v2) {
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n2 = v2.gi(i2);
            g g2 = this.djE.fo(n2.eK("Objective"));
            String string = n2.eK("Name");
            if (string.length() > 40) {
                string = string.substring(0, 40);
            }
            d d2 = this.djE.b(string, g2);
            d2.gW(n2.eG("Score"));
            if (!n2.eD("Locked")) continue;
            d2.ca(n2.eO("Locked"));
        }
    }

    @Override
    public void b(n n2) {
        if (this.djE == null) {
            dkh.warn("Tried to save scoreboard without having a scoreboard...");
        } else {
            n2.b("Objectives", this.akH());
            n2.b("PlayerScores", this.akI());
            n2.b("Teams", this.akG());
            this.C(n2);
        }
    }

    protected v akG() {
        v v2 = new v();
        for (h h2 : this.djE.akE()) {
            n n2 = new n();
            n2.R("Name", h2.akq());
            n2.R("DisplayName", h2.ahW());
            if (h2.akz().asv() >= 0) {
                n2.R("TeamColor", h2.akz().asy());
            }
            n2.R("Prefix", h2.aks());
            n2.R("Suffix", h2.akt());
            n2.o("AllowFriendlyFire", h2.aku());
            n2.o("SeeFriendlyInvisibles", h2.akv());
            n2.R("NameTagVisibility", h2.akw().dkr);
            n2.R("DeathMessageVisibility", h2.akx().dkr);
            v v3 = new v();
            for (String string : h2.akr()) {
                v3.a(new z(string));
            }
            n2.b("Players", v3);
            v2.a(n2);
        }
        return v2;
    }

    protected void C(n n2) {
        n n3 = new n();
        boolean bl2 = false;
        for (int i2 = 0; i2 < 19; ++i2) {
            g g2 = this.djE.gY(i2);
            if (g2 == null) continue;
            n3.R("slot_" + i2, g2.getName());
            bl2 = true;
        }
        if (bl2) {
            n2.b("DisplaySlots", n3);
        }
    }

    protected v akH() {
        v v2 = new v();
        for (g g2 : this.djE.akA()) {
            if (g2.akp() == null) continue;
            n n2 = new n();
            n2.R("Name", g2.getName());
            n2.R("CriteriaName", g2.akp().getName());
            n2.R("DisplayName", g2.getDisplayName());
            n2.R("RenderType", g2.aki().akj());
            v2.a(n2);
        }
        return v2;
    }

    protected v akI() {
        v v2 = new v();
        for (d d2 : this.djE.akC()) {
            if (d2.akn() == null) continue;
            n n2 = new n();
            n2.R("Name", d2.getPlayerName());
            n2.R("Objective", d2.akn().getName());
            n2.B("Score", d2.akm());
            n2.o("Locked", d2.IH());
            v2.a(n2);
        }
        return v2;
    }
}

