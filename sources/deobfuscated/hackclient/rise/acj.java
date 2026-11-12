/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abm;
import hackclient.rise.abn;
import hackclient.rise.aca;
import hackclient.rise.ady;
import hackclient.rise.adz;
import hackclient.rise.agm;
import hackclient.rise.agn;
import hackclient.rise.ahg;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import rise.Client;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public class acj
implements aca,
InstanceAccess {
    private final ArrayList<abm> aAE = new ArrayList();
    private ArrayList<abm> aAF = new ArrayList();
    private final ArrayList<abn> aAG = new ArrayList();
    private final agn aAH = new agn();
    private abn aAI = null;

    public acj() {
        for (ady enum_ : ady.values()) {
            this.aAE.add(new abm(enum_));
        }
        for (Enum enum_ : adz.values()) {
            this.aAG.add(new abn((adz)enum_));
        }
    }

    @Override
    public void b(int n2, int n3, float f2) {
        int n4;
        this.aAH.qN();
        double d2 = Math.ceil((double)this.aAF.size() / 3.0);
        this.aAH.V(-57.0 * Math.max(0.0, d2 - 3.0));
        double d3 = 7.0;
        double d4 = this.v().pm().getX() + this.v().pn().getX() - 4.0f;
        double d5 = (double)this.v().pm().getY() + d3;
        this.aAH.a(new Vector2d(d4, d5), (double)this.v().alQ.y - d3 * 2.0);
        Vector2f vector2f = this.v().pm();
        Vector2f vector2f2 = this.v().pn();
        double d6 = this.v().po().ayX;
        double d7 = (double)(vector2f.getY() + 44.0f) + this.aAH.tT();
        double d8 = ((double)vector2f2.getX() - d6 - 29.0) / 3.0;
        double d9 = ((double)vector2f2.getX() - d6 - 43.0) / 5.0;
        gb.ks.a(16, gd.kG).d(ahg.cf("ui.themes.text"), vector2f.getX() + vector2f2.getX() - 20.0f, (double)(vector2f.getY() + 20.0f) + this.aAH.tT(), new Color(255, 255, 255, 128).getRGB());
        for (n4 = 0; n4 < this.aAG.size(); ++n4) {
            abn instanceAccess2 = this.aAG.get(n4);
            instanceAccess2.a((double)vector2f.getX() + d6 + 7.0 + (7.0 + d9) * (double)(n4 % 5), d7 + Math.floor((double)n4 / 5.0) * 24.0, d9, this.aAI != null && this.aAI.equals(instanceAccess2));
            instanceAccess2.qg().Q(this.aAI == null || this.aAI.equals(instanceAccess2) ? 1.0 : 0.0);
            instanceAccess2.qh().Q(Objects.equals(this.aAI, instanceAccess2) ? 1.0 : 0.0);
        }
        for (n4 = 0; n4 < this.aAF.size(); ++n4) {
            abm abm2 = this.aAF.get(n4);
            abm2.qc().Q((double)vector2f.getX() + d6 + 7.0 + (7.0 + d8) * (double)(n4 % 3));
            abm2.qd().Q((double)(vector2f.getY() + 44.0f) + Math.floor((double)n4 / 3.0) * 57.0 + 60.0);
        }
        for (abm abm3 : this.aAE) {
            if (abm3.pF().sV() > 0.0) {
                abm3.k(this.aAH.tT(), d8);
            }
            abm3.pF().Q(this.aAF.contains(abm3) ? 255.0 : 0.0);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        if (n4 > 0) {
            return;
        }
        for (abm instanceAccess : this.aAF) {
            if (!agm.c(instanceAccess.qb().getX(), instanceAccess.qb().getY(), instanceAccess.qb().getZ(), 50.0, n2, n3)) continue;
            Client.a.k().a(instanceAccess.qa());
        }
        for (abn abn2 : this.aAG) {
            if (!agm.c(abn2.qb().getX(), abn2.qb().getY(), abn2.qb().getZ(), 17.0, n2, n3)) continue;
            this.aAI = this.aAI == abn2 ? null : abn2;
            this.qL();
        }
    }

    private void qL() {
        this.aAF.clear();
        if (this.aAI == null) {
            this.aAF = new ArrayList<abm>(this.aAE);
            this.aAF.forEach(abm2 -> abm2.pF().Q(255.0));
            return;
        }
        for (abm abm3 : this.aAE) {
            if (!abm3.qa().rY().contains((Object)this.aAI.qf())) continue;
            this.aAF.add(abm3);
            abm3.pF().Q(255.0);
        }
    }

    @Override
    public void aT() {
        this.aAE.forEach(abm2 -> abm2.pF().T(255.0));
        this.aAF = new ArrayList<abm>(this.aAE);
        this.aAI = null;
        this.aAH.aX();
        this.qM();
    }

    public void qM() {
        Vector2f vector2f = this.v().pm();
        Vector2f vector2f2 = this.v().pn();
        double d2 = this.v().po().ayX;
        double d3 = ((double)vector2f2.getX() - d2 - 29.0) / 3.0;
        for (int i2 = 0; i2 < this.aAF.size(); ++i2) {
            abm abm2 = this.aAF.get(i2);
            abm2.qc().T((double)vector2f.getX() + d2 + 7.0 + (7.0 + d3) * (double)(i2 % 3));
            abm2.qd().T((double)(vector2f.getY() + 44.0f) + Math.floor((double)i2 / 3.0) * 57.0 + 60.0);
        }
    }
}

