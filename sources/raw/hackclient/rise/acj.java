/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abm;
import hackclient.rise.abn;
import hackclient.rise.aca;
import hackclient.rise.ady;
import hackclient.rise.adz;
import hackclient.rise.aea;
import hackclient.rise.agm;
import hackclient.rise.agn;
import hackclient.rise.ahg;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

public class acj
implements aca,
aea {
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
        this.aAH.a(new aka(d4, d5), (double)this.v().alQ.y - d3 * 2.0);
        akb akb2 = this.v().pm();
        akb akb3 = this.v().pn();
        double d6 = this.v().po().ayX;
        double d7 = (double)(akb2.getY() + 44.0f) + this.aAH.tT();
        double d8 = ((double)akb3.getX() - d6 - 29.0) / 3.0;
        double d9 = ((double)akb3.getX() - d6 - 43.0) / 5.0;
        gb.ks.a(16, gd.kG).d(ahg.cf("ui.themes.text"), akb2.getX() + akb3.getX() - 20.0f, (double)(akb2.getY() + 20.0f) + this.aAH.tT(), new Color(255, 255, 255, 128).getRGB());
        for (n4 = 0; n4 < this.aAG.size(); ++n4) {
            abn aea22 = this.aAG.get(n4);
            aea22.a((double)akb2.getX() + d6 + 7.0 + (7.0 + d9) * (double)(n4 % 5), d7 + Math.floor((double)n4 / 5.0) * 24.0, d9, this.aAI != null && this.aAI.equals(aea22));
            aea22.qg().Q(this.aAI == null || this.aAI.equals(aea22) ? 1.0 : 0.0);
            aea22.qh().Q(Objects.equals(this.aAI, aea22) ? 1.0 : 0.0);
        }
        for (n4 = 0; n4 < this.aAF.size(); ++n4) {
            abm abm2 = this.aAF.get(n4);
            abm2.qc().Q((double)akb2.getX() + d6 + 7.0 + (7.0 + d8) * (double)(n4 % 3));
            abm2.qd().Q((double)(akb2.getY() + 44.0f) + Math.floor((double)n4 / 3.0) * 57.0 + 60.0);
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
        for (abm aea2 : this.aAF) {
            if (!agm.c(aea2.qb().getX(), aea2.qb().getY(), aea2.qb().getZ(), 50.0, n2, n3)) continue;
            a.a.k().a(aea2.qa());
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
        akb akb2 = this.v().pm();
        akb akb3 = this.v().pn();
        double d2 = this.v().po().ayX;
        double d3 = ((double)akb3.getX() - d2 - 29.0) / 3.0;
        for (int i2 = 0; i2 < this.aAF.size(); ++i2) {
            abm abm2 = this.aAF.get(i2);
            abm2.qc().T((double)akb2.getX() + d2 + 7.0 + (7.0 + d3) * (double)(i2 % 3));
            abm2.qd().T((double)(akb2.getY() + 44.0f) + Math.floor((double)i2 / 3.0) * 57.0 + 60.0);
        }
    }
}

