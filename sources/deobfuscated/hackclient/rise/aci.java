/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.agn;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Generated;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.ModuleComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public final class aci
implements aca,
InstanceAccess {
    public final agp aAC = new agp(new Vector2d(200.0, 200.0), gb.ks.a(20, gd.kG), Color.WHITE, ago.aJT, ahg.cf("ui.search.text"), 150.0f);
    private final a aAD = new a();
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
        this.ayE = this.scrollUtil.tS() < 0.0 ? (this.ayE -= (double)(this.aAD.aKM() * 4L)) : (this.ayE += (double)(this.aAD.aKM() * 4L));
        this.ayE = Math.min(Math.max(0.0, this.ayE), 255.0);
        this.aAC.b(ais.d(abz.aAc.ql(), (int)this.ayE));
        Vector2d vector2d = new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + ((double)modernClickGui.alQ.x - modernClickGui.ayu.ayX) / 2.0, (float)((double)(modernClickGui.ayt.y + 17.0f) + this.scrollUtil.tT()));
        this.aAC.h(vector2d);
        String string = this.aAC.aJX;
        if (modernClickGui.a(this.aAC)) {
            this.aAC.aJX = "";
        }
        this.aAC.pZ();
        this.aAC.aJX = string;
        this.scrollUtil.qN();
        this.aAo = d2 = (double)(modernClickGui.ayt.y + 35.0f) + this.scrollUtil.tT();
        double d3 = 0.0;
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.a(new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + 8.0, d2), n2, n3, f2);
            d2 += (double)(moduleComponent.alQ.y + 7.0f);
            d3 += (double)(moduleComponent.alQ.y + 7.0f);
        }
        this.aAn = d2;
        this.scrollUtil.V(-d3 + (double)modernClickGui.alQ.y - 37.0);
        double d4 = 7.0;
        double d5 = modernClickGui.pm().getX() + modernClickGui.pn().getX() - 4.0f;
        double d6 = (double)modernClickGui.pm().getY() + d4;
        this.scrollUtil.a(new Vector2d(d5, d6 + 28.0), (double)this.v().alQ.y - d4 * 2.0 - 28.0);
        this.aAD.aX();
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 208 || n2 == 200) {
            return;
        }
        if (!(this.aAz || this.v().pl() || c2 == '\u0000' || Character.isISOControl(c2))) {
            this.aAz = true;
            this.aH("");
        }
        if (!this.v().pl()) {
            this.aAC.I(true);
            this.aAC.b(c2, n2);
            this.scrollUtil.U(0.0);
        }
        this.aAm = this.aG(this.aAC.getText());
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.d(n2, n3, n4);
        }
        this.aAC.d(n2, n3, n4);
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
        this.aAm = this.aG(this.aAC.getText());
        this.aAz = false;
    }

    public ArrayList<ModuleComponent> aG(String string) {
        ArrayList<ModuleComponent> arrayList = new ArrayList<ModuleComponent>();
        ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(string.toLowerCase().split(" ")));
        arrayList2.add(string.toLowerCase().replaceAll(" ", ""));
        for (String string2 : arrayList2) {
            for (ModuleComponent moduleComponent : Client.a.v().pw()) {
                for (String string3 : moduleComponent.dl().getAliases()) {
                    if (!string3.toLowerCase().replaceAll(" ", "").contains(string2) || arrayList.contains(moduleComponent)) continue;
                    arrayList.add(moduleComponent);
                }
            }
        }
        return arrayList;
    }

    public void aH(String string) {
        this.aAC.bX(string);
        this.aAm = this.aG(this.aAC.getText());
    }

    @Generated
    public agp qH() {
        return this.aAC;
    }

    @Generated
    public a me() {
        return this.aAD;
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

