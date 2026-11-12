/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.acd;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afo;
import hackclient.rise.agf;
import hackclient.rise.agm;
import hackclient.rise.ait;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import lombok.Generated;
import net.minecraft.util.ct;
import org.apache.commons.lang3.StringUtils;
import rip.vantage.commons.util.time.a;

public class acl
implements aea {
    private String aAJ;
    private String aAK;
    private Runnable aAL;
    private akb alQ = new akb(86.450005f, 86.450005f);
    private afj aAM = new afj(afk.aGW, 200L);
    private afj aAN = new afj(afk.aHn, 500L);
    private akb ayt;
    private a atH;
    private agf aAO = gb.ks.a(20, gd.kG);

    public acl(String string, String string2) {
        this.aAJ = ct.b(this.aAO, string2, 86.450005f - (float)(acd.auT * 2));
        this.aAK = string;
        this.aAL = null;
    }

    public acl(String string, String string2, Runnable runnable) {
        string2 = StringUtils.capitalize((String)string2);
        this.aAJ = ct.b(this.aAO, string2, 86.450005f - (float)(acd.auT * 2));
        this.aAL = runnable;
        this.aAK = string;
    }

    public void j(akb akb2) {
        this.ayt = new akb(akb2.x, akb2.y);
        if ((double)(this.ayt.x + this.alQ.x) < (double)this.v().ayt.x + this.v().ayu.ayX || (double)this.ayt.x > (double)this.v().ayt.x + this.v().ayu.ayX + (double)this.v().alQ.x) {
            return;
        }
        this.aAM.Q(this.qP() ? 75.0 : 0.0);
        this.aAN.Q(this.qP() ? 5.0 : 0.0);
        ait.c((double)this.ayt.x, (double)this.ayt.y, (double)this.alQ.x, (double)this.alQ.y, 8.0, abz.aAf.ql());
        ait.c((double)akb2.x, (double)akb2.y, (double)this.alQ.x, (double)this.alQ.y, 8.0, abz.aAf.Y((int)this.aAM.sV()));
        this.ayt.y += this.alQ.y / 2.0f - this.aAO.tF() / 2.0f + 1.0f - (float)acd.auT / 4.0f;
        this.aAO.c(this.aAJ, this.ayt.x + this.alQ.x / 2.0f, this.ayt.y, abz.aAd.qm());
        this.ayt.y += this.aAO.tF() + (float)acd.auT / 2.0f;
        this.k(this.ayt);
        this.ayt = new akb(akb2.x, akb2.y);
    }

    public void f(int n2, int n3, int n4) {
        if (this.ayt == null) {
            return;
        }
        if (agm.a(this.ayt, this.alQ, (double)n2, (double)n3) && this.aAL != null) {
            this.aAL.run();
        }
    }

    public boolean qP() {
        return agm.a(this.ayt, this.alQ, afo.tl().getX(), afo.tl().getY());
    }

    public void k(akb akb2) {
        gb.ks.a(16, gd.kG).c(this.aAK, akb2.x + this.alQ.x / 2.0f, akb2.y, abz.aAe.qm());
    }

    @Generated
    public String getTitle() {
        return this.aAJ;
    }

    @Generated
    public String getAction() {
        return this.aAK;
    }

    @Generated
    public Runnable qQ() {
        return this.aAL;
    }

    @Generated
    public akb pn() {
        return this.alQ;
    }

    @Generated
    public afj qR() {
        return this.aAM;
    }

    @Generated
    public afj qS() {
        return this.aAN;
    }

    @Generated
    public akb pm() {
        return this.ayt;
    }

    @Generated
    public a qT() {
        return this.atH;
    }

    @Generated
    public agf qU() {
        return this.aAO;
    }

    @Generated
    public void aI(String string) {
        this.aAJ = string;
    }

    @Generated
    public void aJ(String string) {
        this.aAK = string;
    }

    @Generated
    public void e(Runnable runnable) {
        this.aAL = runnable;
    }

    @Generated
    public void l(akb akb2) {
        this.alQ = akb2;
    }

    @Generated
    public void b(afj afj2) {
        this.aAM = afj2;
    }

    @Generated
    public void c(afj afj2) {
        this.aAN = afj2;
    }

    @Generated
    public void i(akb akb2) {
        this.ayt = akb2;
    }

    @Generated
    public void b(a a2) {
        this.atH = a2;
    }

    @Generated
    public void b(agf agf2) {
        this.aAO = agf2;
    }
}

