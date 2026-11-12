/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abf;
import hackclient.rise.abo;
import hackclient.rise.abq;
import hackclient.rise.abw;
import hackclient.rise.abz;
import hackclient.rise.aci;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gi;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;
import rip.vantage.commons.util.time.a;

public class abg
implements aea {
    public gi cg;
    public akb alQ = this.v().pE();
    public boolean ayg;
    public ArrayList<abo> cj = new ArrayList();
    public aka aqy;
    public double ayE;
    public a rG = new a();
    public afj ayi = new afj(afk.aGW, 50L);
    public afj ayP = new afj(afk.aGW, 200L);
    public afj ayQ = new afj(afk.aGW, 5000L);
    public boolean ayR;

    public abg(gi gi2) {
        this.cg = gi2;
        this.ayP.T(this.alQ.y);
        this.ayQ.T(0.0);
        gi2.getAllValues().forEach(akh2 -> {
            abo abo2 = akh2.wA();
            if (abo2 != null) {
                this.cj.add(abo2);
            }
        });
    }

    public void a(aka aka2, int n2, int n3, float f2) {
        boolean bl2;
        float f3;
        this.aqy = aka2;
        float f4 = f3 = 38.0f;
        boolean bl3 = bl2 = aka2 != null && !(aka2.y + (double)this.alQ.y < (double)this.v().ayt.y) && !(aka2.y > (double)(this.v().ayt.y + this.v().alQ.y));
        if (bl2) {
            abf abf2 = this.v();
            ait.c(aka2.x, aka2.y, (double)this.alQ.x, (double)this.alQ.y, 6.0, abz.aAf.ql());
            Color object = abz.aAc.Y(this.cg.isEnabled() ? 255 : 200);
            boolean bl4 = agm.c(aka2.x, aka2.y, this.alQ.x, this.alQ.y, n2, n3);
            this.ayi.Q(bl4 ? (this.ayR ? 35.0 : 20.0) : 0.0);
            ait.c(aka2.x, aka2.y, (double)this.alQ.x, (double)this.alQ.y, 6.0, ais.d(Color.BLACK, (int)this.ayi.sV()));
            if (abf2.pq() instanceof aci) {
                gb.ks.a(15, gd.kG).a("(" + ahg.cf(this.cg.getModuleInfo().category().getName()) + ")", (float)(aka2.getX() + (double)gb.ks.a(20, gd.kG).bQ(this.cg.getName()) + 10.0), (float)aka2.getY() + 10.0f, ais.d(object, 64).hashCode());
            }
            gb.ks.a(20, gd.kG).a(this.cg.getName(), (float)aka2.x + 6.0f, (float)aka2.y + 8.0f, this.cg.isEnabled() ? this.rP().j(new aka(0.0, aka2.y / 5.0)).getRGB() : object.getRGB());
            gb.ks.a(15, gd.kG).a(ahg.cf(this.cg.getModuleInfo().description()), (float)aka2.x + 6.0f, (float)aka2.y + 25.0f, ais.d(object, 70).hashCode());
            this.alQ = new akb(this.v().ayJ.x, f4);
        }
        if (!this.ayP.kM() || this.ayg) {
            for (abo abo2 : this.pQ()) {
                if (abo2.qi() != null && abo2.qi().wB() != null && abo2.qi().wB().getAsBoolean() || abo2.qi().wC() != null && abo2.qi().wC().getAsBoolean()) continue;
                abo2.U(abo2.aqy == null ? 0 : (abo2.aqy.y < aka2.y + this.ayP.sV() + 15.0 ? (int)this.ayQ.sV() : 0));
                abo2.U(abo2.qi().wB() == null ? abo2.qj() : Math.max(abo2.qj() - 40, 0));
                if (bl2) {
                    abo2.a(new aka(aka2.x + 6.0 + (double)(abo2.qi().wB() == null ? 0 : 10) + (double)(abo2.qi().wC() == null ? 0 : 10), (float)(aka2.y + (double)f4 + 1.0)), n2, n3, f2);
                }
                f4 = (float)((double)f4 + abo2.da());
            }
            f4 -= 1.0f;
        }
        this.ayP.h(Math.min((long)f4 * 3L, 450L));
        this.ayP.a(afk.aHn);
        this.ayP.Q(this.ayg ? (double)f4 : (double)f3);
        this.alQ.y = (float)this.ayP.sV();
        this.ayQ.h(this.ayg ? this.ayP.sQ() / 2L : this.ayP.sQ() / 3L);
        this.ayQ.Q(this.ayg ? 255.0 : 0.0);
    }

    public void b(char c2, int n2) {
        if (this.aqy == null || this.aqy.y + (double)this.alQ.y < (double)this.v().ayt.y || this.aqy.y > (double)(this.v().ayt.y + this.v().alQ.y)) {
            return;
        }
        if (this.oZ()) {
            for (abo abo2 : this.pQ()) {
                abo2.b(c2, n2);
            }
        }
    }

    public void d(int n2, int n3, int n4) {
        block10: {
            if (this.aqy == null || this.aqy.y + (double)this.alQ.y < (double)this.v().ayt.y || this.aqy.y > (double)(this.v().ayt.y + this.v().alQ.y)) {
                return;
            }
            akb akb2 = this.v().ayt;
            akb akb3 = this.v().alQ;
            boolean bl2 = n4 == 0;
            boolean bl3 = n4 == 1;
            boolean bl4 = agm.c(akb2.x, akb2.y, akb3.x, akb3.y, n2, n3);
            boolean bl5 = agm.c(this.aqy.x, this.aqy.y, this.alQ.x, this.v().ayJ.getY() - 3.0f, n2, n3);
            if (bl5 && this.v().ayI == null) {
                this.ayR = true;
                double d2 = 0.0;
                for (abo abo2 : this.cj) {
                    d2 += abo2.da();
                }
                if (bl2) {
                    if (bl4) {
                        this.cg.toggle();
                    }
                } else if (bl3 && this.cg.getValues().size() != 0 && d2 != 0.0) {
                    this.ayg = !this.ayg;
                    for (abo abo2 : this.pQ()) {
                        if (abo2 instanceof abq) {
                            abq abq2 = (abq)abo2;
                            abq2.azu = false;
                            abq2.azt = false;
                            continue;
                        }
                        if (!(abo2 instanceof abw)) continue;
                        ((abw)abo2).azT = false;
                    }
                }
            }
            if (!this.oZ()) break block10;
            for (abo abo3 : this.pQ()) {
                if (!(abo3.qi() != null && abo3.qi().wB() != null && abo3.qi().wB().getAsBoolean() || abo3.qi().wC() != null && abo3.qi().wC().getAsBoolean() || !abo3.e(n2, n3, n4))) break;
            }
        }
    }

    public void ci() {
        if (this.aqy == null) {
            return;
        }
        if (this.aqy.y + (double)this.alQ.y < (double)this.v().ayt.y || this.aqy.y > (double)(this.v().ayt.y + this.v().alQ.y)) {
            return;
        }
        if (!this.ayP.kM() || this.ayg) {
            for (abo abo2 : this.pQ()) {
                if (abo2.qi() == null || abo2.qi().wB() != null && abo2.qi().wB().getAsBoolean() || abo2.qi().wC() != null && abo2.qi().wC().getAsBoolean()) continue;
                abo2.ci();
            }
        }
    }

    public void pP() {
        this.ayR = false;
        if (this.oZ()) {
            for (abo abo2 : this.pQ()) {
                abo2.pP();
            }
        }
    }

    @Generated
    public gi dl() {
        return this.cg;
    }

    @Generated
    public akb pn() {
        return this.alQ;
    }

    @Generated
    public boolean oZ() {
        return this.ayg;
    }

    @Generated
    public ArrayList<abo> pQ() {
        return this.cj;
    }

    @Generated
    public aka nH() {
        return this.aqy;
    }

    @Generated
    public double pz() {
        return this.ayE;
    }

    @Generated
    public a me() {
        return this.rG;
    }

    @Generated
    public afj pb() {
        return this.ayi;
    }

    @Generated
    public afj pR() {
        return this.ayP;
    }

    @Generated
    public afj pS() {
        return this.ayQ;
    }

    @Generated
    public boolean pT() {
        return this.ayR;
    }
}

