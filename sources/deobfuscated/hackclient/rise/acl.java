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
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afo;
import hackclient.rise.agf;
import hackclient.rise.agm;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import lombok.Generated;
import net.minecraft.util.ct;
import org.apache.commons.lang3.StringUtils;
import rip.vantage.commons.util.time.a;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public class acl
implements InstanceAccess {
    private String title;
    private String action;
    private Runnable aAL;
    private Vector2f alQ = new Vector2f(86.450005f, 86.450005f);
    private afj aAM = new afj(afk.aGW, 200L);
    private afj aAN = new afj(afk.aHn, 500L);
    private Vector2f ayt;
    private a atH;
    private agf aAO = gb.ks.a(20, gd.kG);

    public acl(String string, String string2) {
        this.title = ct.b(this.aAO, string2, 86.450005f - (float)(acd.auT * 2));
        this.action = string;
        this.aAL = null;
    }

    public acl(String string, String string2, Runnable runnable) {
        string2 = StringUtils.capitalize((String)string2);
        this.title = ct.b(this.aAO, string2, 86.450005f - (float)(acd.auT * 2));
        this.aAL = runnable;
        this.action = string;
    }

    public void j(Vector2f vector2f) {
        this.ayt = new Vector2f(vector2f.x, vector2f.y);
        if ((double)(this.ayt.x + this.alQ.x) < (double)this.v().ayt.x + this.v().ayu.ayX || (double)this.ayt.x > (double)this.v().ayt.x + this.v().ayu.ayX + (double)this.v().alQ.x) {
            return;
        }
        this.aAM.Q(this.qP() ? 75.0 : 0.0);
        this.aAN.Q(this.qP() ? 5.0 : 0.0);
        ait.c((double)this.ayt.x, (double)this.ayt.y, (double)this.alQ.x, (double)this.alQ.y, 8.0, abz.aAf.ql());
        ait.c((double)vector2f.x, (double)vector2f.y, (double)this.alQ.x, (double)this.alQ.y, 8.0, abz.aAf.Y((int)this.aAM.sV()));
        this.ayt.y += this.alQ.y / 2.0f - this.aAO.tF() / 2.0f + 1.0f - (float)acd.auT / 4.0f;
        this.aAO.c(this.title, this.ayt.x + this.alQ.x / 2.0f, this.ayt.y, abz.aAd.qm());
        this.ayt.y += this.aAO.tF() + (float)acd.auT / 2.0f;
        this.k(this.ayt);
        this.ayt = new Vector2f(vector2f.x, vector2f.y);
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

    public void k(Vector2f vector2f) {
        gb.ks.a(16, gd.kG).c(this.action, vector2f.x + this.alQ.x / 2.0f, vector2f.y, abz.aAe.qm());
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getAction() {
        return this.action;
    }

    @Generated
    public Runnable qQ() {
        return this.aAL;
    }

    @Generated
    public Vector2f pn() {
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
    public Vector2f pm() {
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
        this.title = string;
    }

    @Generated
    public void aJ(String string) {
        this.action = string;
    }

    @Generated
    public void e(Runnable runnable) {
        this.aAL = runnable;
    }

    @Generated
    public void l(Vector2f vector2f) {
        this.alQ = vector2f;
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
    public void i(Vector2f vector2f) {
        this.ayt = vector2f;
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

