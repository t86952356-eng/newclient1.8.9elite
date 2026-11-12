/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
package hackclient.rise;

import hackclient.rise.abf;
import hackclient.rise.acd;
import hackclient.rise.acl;
import hackclient.rise.aea;
import hackclient.rise.afo;
import hackclient.rise.agm;
import hackclient.rise.agn;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class acm
extends ArrayList<acl>
implements aea {
    private String gK;
    private static float aAP = 10.0f;
    private akb ayt;
    private agn scrollUtil = new agn();

    public acm(int n2, String string) {
        super(n2);
        this.gK = string;
    }

    public acm(String string) {
        this.gK = string;
    }

    public acm(@NotNull Collection<? extends acl> collection, String string) {
        super(collection);
        this.gK = string;
    }

    public void j(akb akb2) {
        try {
            abf abf2 = this.v();
            this.ayt = new akb(akb2.x, akb2.y);
            gb.ks.a(18, gd.kG).a(this.gK, this.ayt.x, this.ayt.y, Color.WHITE.getRGB());
            String string = "" + this.size();
            gb.ks.a(18, gd.kG).a(string, this.ayt.x + (float)gb.ks.a(18, gd.kG).bQ(this.gK) + (float)acd.auT / 2.0f, this.ayt.y, this.rP().rQ().getRGB());
            if (!this.isEmpty()) {
                this.scrollUtil.E(this.qP());
                this.scrollUtil.V((double)((float)(-this.size()) * ((float)acd.auT + ((acl)this.get((int)0)).pn().x) + this.v().alQ.x) - this.v().ayu.ayX - (double)acd.auT);
                if (!this.scrollUtil.bd()) {
                    this.scrollUtil.aJN = (float)Math.round(this.scrollUtil.aJN / (double)((float)acd.auT + ((acl)this.get((int)0)).pn().x)) * ((float)acd.auT + ((acl)this.get((int)0)).pn().x);
                }
                this.ayt.y += (float)acd.auT + gb.ks.a(18, gd.kG).tF();
                this.ayt.x = (float)((double)this.ayt.x + this.scrollUtil.tT());
                for (acl acl2 : this) {
                    if (!(this.ayt.x > abf2.pm().x + abf2.pn().x) && !((double)(this.ayt.x + acl2.pn().x) < (double)abf2.ayt.x + abf2.ayu.ayX)) {
                        acl2.j(this.ayt);
                    }
                    this.ayt.x += (float)acd.auT + acl2.pn().x;
                }
            }
            this.ayt = new akb(akb2.x, akb2.y);
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            concurrentModificationException.printStackTrace();
        }
    }

    public int getHeight() {
        return (int)((this.isEmpty() ? 0.0f : ((acl)this.get(0)).pn().getY()) + (float)acd.auT + gb.ks.a(18, gd.kG).tF());
    }

    public void f(int n2, int n3, int n4) {
        for (acl acl2 : this) {
            acl2.f(n2, n3, n4);
        }
    }

    public void qV() {
        if (this.ayt == null) {
            return;
        }
        if (this.qP()) {
            acd.aAp = false;
        }
    }

    public boolean qP() {
        if (this.isEmpty()) {
            return false;
        }
        return agm.a(this.v().ayt, this.v().alQ, afo.tl()) && agm.a(new akb((float)((double)this.v().ayt.x + this.v().ayu.ayX), this.ayt.y), new akb((float)((double)this.v().alQ.x - this.v().ayu.ayX), ((acl)this.get((int)0)).pn().y + (float)(acd.auT * 2) + 10.0f), afo.tl());
    }

    public void init() {
        this.qu().setScroll(0.0);
        this.qu().U(0.0);
    }

    @Generated
    public String getName() {
        return this.gK;
    }

    @Generated
    public akb pm() {
        return this.ayt;
    }

    @Generated
    public agn qu() {
        return this.scrollUtil;
    }

    @Generated
    public void setName(String string) {
        this.gK = string;
    }

    @Generated
    public void i(akb akb2) {
        this.ayt = akb2;
    }

    @Generated
    public void a(agn agn2) {
        this.scrollUtil = agn2;
    }
}

