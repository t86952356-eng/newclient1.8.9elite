/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.ui.clickgui;

import hackclient.rise.abq;
import hackclient.rise.abw;
import hackclient.rise.abz;
import hackclient.rise.aci;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;
import rip.vantage.commons.util.time.a;
import rise.module.Module;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public class ModuleComponent
implements InstanceAccess {
    public Module cg;
    public Vector2f alQ = this.v().pE();
    public boolean ayg;
    public ArrayList<ValueComponent> cj = new ArrayList();
    public Vector2d aqy;
    public double ayE;
    public a rG = new a();
    public afj ayi = new afj(afk.aGW, 50L);
    public afj ayP = new afj(afk.aGW, 200L);
    public afj ayQ = new afj(afk.aGW, 5000L);
    public boolean ayR;

    public ModuleComponent(Module module) {
        this.cg = module;
        this.ayP.T(this.alQ.y);
        this.ayQ.T(0.0);
        module.getAllValues().forEach(value -> {
            ValueComponent valueComponent = value.wA();
            if (valueComponent != null) {
                this.cj.add(valueComponent);
            }
        });
    }

    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        boolean bl2;
        float f3;
        this.aqy = vector2d;
        float f4 = f3 = 38.0f;
        boolean bl3 = bl2 = vector2d != null && !(vector2d.y + (double)this.alQ.y < (double)this.v().ayt.y) && !(vector2d.y > (double)(this.v().ayt.y + this.v().alQ.y));
        if (bl2) {
            ModernClickGui modernClickGui = this.v();
            ait.c(vector2d.x, vector2d.y, (double)this.alQ.x, (double)this.alQ.y, 6.0, abz.aAf.ql());
            Color object = abz.aAc.Y(this.cg.isEnabled() ? 255 : 200);
            boolean bl4 = agm.c(vector2d.x, vector2d.y, this.alQ.x, this.alQ.y, n2, n3);
            this.ayi.Q(bl4 ? (this.ayR ? 35.0 : 20.0) : 0.0);
            ait.c(vector2d.x, vector2d.y, (double)this.alQ.x, (double)this.alQ.y, 6.0, ais.d(Color.BLACK, (int)this.ayi.sV()));
            if (modernClickGui.pq() instanceof aci) {
                gb.ks.a(15, gd.kG).a("(" + ahg.cf(this.cg.getModuleInfo().category().getName()) + ")", (float)(vector2d.getX() + (double)gb.ks.a(20, gd.kG).bQ(this.cg.getName()) + 10.0), (float)vector2d.getY() + 10.0f, ais.d(object, 64).hashCode());
            }
            gb.ks.a(20, gd.kG).a(this.cg.getName(), (float)vector2d.x + 6.0f, (float)vector2d.y + 8.0f, this.cg.isEnabled() ? this.rP().j(new Vector2d(0.0, vector2d.y / 5.0)).getRGB() : object.getRGB());
            gb.ks.a(15, gd.kG).a(ahg.cf(this.cg.getModuleInfo().description()), (float)vector2d.x + 6.0f, (float)vector2d.y + 25.0f, ais.d(object, 70).hashCode());
            this.alQ = new Vector2f(this.v().ayJ.x, f4);
        }
        if (!this.ayP.kM() || this.ayg) {
            for (ValueComponent valueComponent : this.pQ()) {
                if (valueComponent.qi() != null && valueComponent.qi().wB() != null && valueComponent.qi().wB().getAsBoolean() || valueComponent.qi().wC() != null && valueComponent.qi().wC().getAsBoolean()) continue;
                valueComponent.U(valueComponent.aqy == null ? 0 : (valueComponent.aqy.y < vector2d.y + this.ayP.sV() + 15.0 ? (int)this.ayQ.sV() : 0));
                valueComponent.U(valueComponent.qi().wB() == null ? valueComponent.qj() : Math.max(valueComponent.qj() - 40, 0));
                if (bl2) {
                    valueComponent.a(new Vector2d(vector2d.x + 6.0 + (double)(valueComponent.qi().wB() == null ? 0 : 10) + (double)(valueComponent.qi().wC() == null ? 0 : 10), (float)(vector2d.y + (double)f4 + 1.0)), n2, n3, f2);
                }
                f4 = (float)((double)f4 + valueComponent.da());
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
            for (ValueComponent valueComponent : this.pQ()) {
                valueComponent.b(c2, n2);
            }
        }
    }

    public void d(int n2, int n3, int n4) {
        block10: {
            if (this.aqy == null || this.aqy.y + (double)this.alQ.y < (double)this.v().ayt.y || this.aqy.y > (double)(this.v().ayt.y + this.v().alQ.y)) {
                return;
            }
            Vector2f vector2f = this.v().ayt;
            Vector2f vector2f2 = this.v().alQ;
            boolean bl2 = n4 == 0;
            boolean bl3 = n4 == 1;
            boolean bl4 = agm.c(vector2f.x, vector2f.y, vector2f2.x, vector2f2.y, n2, n3);
            boolean bl5 = agm.c(this.aqy.x, this.aqy.y, this.alQ.x, this.v().ayJ.getY() - 3.0f, n2, n3);
            if (bl5 && this.v().ayI == null) {
                this.ayR = true;
                double d2 = 0.0;
                for (ValueComponent valueComponent : this.cj) {
                    d2 += valueComponent.da();
                }
                if (bl2) {
                    if (bl4) {
                        this.cg.toggle();
                    }
                } else if (bl3 && this.cg.getValues().size() != 0 && d2 != 0.0) {
                    this.ayg = !this.ayg;
                    for (ValueComponent valueComponent : this.pQ()) {
                        if (valueComponent instanceof abq) {
                            abq abq2 = (abq)valueComponent;
                            abq2.azu = false;
                            abq2.azt = false;
                            continue;
                        }
                        if (!(valueComponent instanceof abw)) continue;
                        ((abw)valueComponent).azT = false;
                    }
                }
            }
            if (!this.oZ()) break block10;
            for (ValueComponent valueComponent : this.pQ()) {
                if (!(valueComponent.qi() != null && valueComponent.qi().wB() != null && valueComponent.qi().wB().getAsBoolean() || valueComponent.qi().wC() != null && valueComponent.qi().wC().getAsBoolean() || !valueComponent.e(n2, n3, n4))) break;
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
            for (ValueComponent valueComponent : this.pQ()) {
                if (valueComponent.qi() == null || valueComponent.qi().wB() != null && valueComponent.qi().wB().getAsBoolean() || valueComponent.qi().wC() != null && valueComponent.qi().wC().getAsBoolean()) continue;
                valueComponent.ci();
            }
        }
    }

    public void pP() {
        this.ayR = false;
        if (this.oZ()) {
            for (ValueComponent valueComponent : this.pQ()) {
                valueComponent.pP();
            }
        }
    }

    @Generated
    public Module dl() {
        return this.cg;
    }

    @Generated
    public Vector2f pn() {
        return this.alQ;
    }

    @Generated
    public boolean oZ() {
        return this.ayg;
    }

    @Generated
    public ArrayList<ValueComponent> pQ() {
        return this.cj;
    }

    @Generated
    public Vector2d nH() {
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

