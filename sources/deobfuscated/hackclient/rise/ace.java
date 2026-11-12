/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aby;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.agn;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.ModuleComponent;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public final class ace
implements aca,
InstanceAccess {
    public final agp aAx = new agp(new Vector2d(200.0, 200.0), gb.ks.a(20, gd.kG), Color.WHITE, ago.aJT, "Start typing to search...", 150.0f);
    private final a aAy = new a();
    public agn scrollUtil = new agn();
    public ArrayList<ModuleComponent> aAm = new ArrayList();
    private double ayE = 255.0;
    private double aAn;
    private double aAo;
    private boolean aAz;

    @Override
    public void b(int n2, int n3, float f2) {
        double d2;
        ModernClickGui modernClickGui = this.v();
        this.ayE = this.scrollUtil.tS() < 0.0 ? (this.ayE -= (double)(this.aAy.aKM() * 4L)) : (this.ayE += (double)(this.aAy.aKM() * 4L));
        this.ayE = Math.min(Math.max(0.0, this.ayE), 255.0);
        this.aAx.b(abz.aAc.Y((int)this.ayE));
        Vector2d vector2d = new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + ((double)modernClickGui.alQ.x - modernClickGui.ayu.ayX) / 2.0, (float)((double)(modernClickGui.ayt.y + 17.0f) + this.scrollUtil.tT()));
        this.aAx.h(vector2d);
        this.aAx.pZ();
        this.scrollUtil.qN();
        this.aAo = d2 = (double)(modernClickGui.ayt.y + 35.0f) + this.scrollUtil.tT();
        double d3 = 0.0;
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.a(new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + 4.0, d2), n2, n3, f2);
            d2 += (double)(moduleComponent.alQ.y + 5.0f);
            d3 += (double)(moduleComponent.alQ.y + 5.0f);
        }
        this.aAn = d2;
        this.scrollUtil.V(-d3 + (double)modernClickGui.alQ.y - 37.0);
        this.aAy.aX();
    }

    @Override
    public void a(char c2, int n2) {
        if (!this.aAz && c2 != '\u0000' && !Character.isISOControl(c2)) {
            this.aAz = true;
            this.aH(" ");
        }
        if (!this.pl()) {
            this.aAx.I(true);
        }
        this.aAx.b(c2, n2);
        this.scrollUtil.U(0.0);
        this.aAm = this.aG(this.aAx.getText());
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.d(n2, n3, n4);
        }
        this.aAx.d(n2, n3, n4);
    }

    @Override
    public void oW() {
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.pP();
        }
    }

    @Override
    public void qo() {
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.ci();
        }
    }

    @Override
    public void aT() {
        this.aAm = this.aG(this.aAx.getText());
        this.aAz = false;
    }

    public ArrayList<ModuleComponent> aG(String string) {
        ArrayList<ModuleComponent> arrayList = new ArrayList<ModuleComponent>();
        block0: for (ModuleComponent moduleComponent : Client.a.v().pw()) {
            for (String string2 : moduleComponent.dl().getAliases()) {
                if (!string2.toLowerCase().replaceAll(" ", "").contains(string.toLowerCase().replaceAll(" ", ""))) continue;
                arrayList.add(moduleComponent);
                continue block0;
            }
        }
        return arrayList;
    }

    public void aH(String string) {
        this.aAx.bX(string);
        this.aAm = this.aG(this.aAx.getText());
    }

    public boolean pl() {
        for (ModuleComponent moduleComponent : this.aAm) {
            for (ValueComponent valueComponent : moduleComponent.pQ()) {
                if (!(valueComponent instanceof aby) || !((aby)valueComponent).azZ.azF) continue;
                return true;
            }
        }
        return false;
    }

    @Generated
    public agp qH() {
        return this.aAx;
    }

    @Generated
    public a me() {
        return this.aAy;
    }

    @Generated
    public agn qu() {
        return this.scrollUtil;
    }

    @Generated
    public ArrayList<ModuleComponent> qv() {
        return this.aAm;
    }

    @Generated
    public double pz() {
        return this.ayE;
    }

    @Generated
    public double qw() {
        return this.aAn;
    }

    @Generated
    public double qx() {
        return this.aAo;
    }

    @Generated
    public boolean qI() {
        return this.aAz;
    }

    @Generated
    public void a(agn agn2) {
        this.scrollUtil = agn2;
    }

    @Generated
    public void b(ArrayList<ModuleComponent> arrayList) {
        this.aAm = arrayList;
    }

    @Generated
    public void J(double d2) {
        this.ayE = d2;
    }

    @Generated
    public void H(double d2) {
        this.aAn = d2;
    }

    @Generated
    public void I(double d2) {
        this.aAo = d2;
    }

    @Generated
    public void A(boolean bl2) {
        this.aAz = bl2;
    }
}

