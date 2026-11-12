/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aca;
import hackclient.rise.agn;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.Generated;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.module.Category;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.ModuleComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public final class acc
implements aca,
InstanceAccess {
    private final a aAl = new a();
    public agn scrollUtil = new agn();
    public ArrayList<ModuleComponent> aAm;
    public Category aye;
    private double aAn;
    private double aAo;

    @Override
    public void b(int n2, int n3, float f2) {
        double d2;
        if (this.aye == null) {
            return;
        }
        ModernClickGui modernClickGui = this.v();
        this.scrollUtil.qN();
        this.aAo = d2 = (double)(modernClickGui.ayt.y + 7.0f) + this.scrollUtil.tT();
        double d3 = 0.0;
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.a(new Vector2d((double)modernClickGui.ayt.x + modernClickGui.ayu.ayX + 8.0, d2), n2, n3, f2);
            d2 += (double)(moduleComponent.alQ.y + 7.0f);
            d3 += (double)(moduleComponent.alQ.y + 7.0f);
        }
        this.aAn = d2;
        double d4 = 7.0;
        double d5 = modernClickGui.pm().getX() + modernClickGui.pn().getX() - 4.0f;
        double d6 = (double)modernClickGui.pm().getY() + d4;
        this.scrollUtil.a(new Vector2d(d5, d6), (double)this.v().alQ.y - d4 * 2.0);
        this.scrollUtil.V(-d3 + (double)modernClickGui.alQ.y - 7.0);
        this.aAl.aX();
    }

    @Override
    public void a(char c2, int n2) {
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        if (this.aAm == null) {
            return;
        }
        for (ModuleComponent moduleComponent : this.aAm) {
            moduleComponent.d(n2, n3, n4);
        }
    }

    @Override
    public void oW() {
        if (this.aye == null) {
            return;
        }
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.pP();
        }
    }

    @Override
    public void qo() {
        if (this.aye == null) {
            return;
        }
        for (ModuleComponent moduleComponent : this.qv()) {
            moduleComponent.ci();
        }
    }

    @Override
    public void aT() {
        this.aye = this.oX();
        if (this.aye == null) {
            return;
        }
        this.aAm = Client.a.v().pw().stream().filter(moduleComponent -> moduleComponent.dl().getModuleInfo().category() == this.aye).collect(Collectors.toCollection(ArrayList::new));
    }

    private Category oX() {
        for (Category category : Category.values()) {
            if (category.ec() != this.v().pp()) continue;
            return category;
        }
        return null;
    }

    @Generated
    public a me() {
        return this.aAl;
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
    public double qw() {
        return this.aAn;
    }

    @Generated
    public double qx() {
        return this.aAo;
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
    public void b(Category category) {
        this.aye = category;
    }

    @Generated
    public void H(double d2) {
        this.aAn = d2;
    }

    @Generated
    public void I(double d2) {
        this.aAo = d2;
    }
}

