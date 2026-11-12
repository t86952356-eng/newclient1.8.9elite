/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abe;
import hackclient.rise.abg;
import hackclient.rise.abz;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahd;
import hackclient.rise.ait;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.xi;
import java.awt.Color;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.client.gui.bp;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class abd
extends bp
implements ahd {
    private final Map<gj, abe> axS = new HashMap<gj, abe>();
    private final List<gj> axT = new ArrayList<gj>();
    private double axU = 0.0;
    private double axV = 0.0;
    private final afj axW = new afj(afk.aHn, 300L);
    private abe axX = null;
    private double axY;
    private double axZ;
    private double aya = 0.8;
    private final double ayb = 129.0;
    private final double ayc = 10.0;
    private final double ayd = 3.0;
    private boolean Mq = false;

    public void oC() {
        this.axS.clear();
        this.axT.clear();
        this.Mq = false;
        if (aER != null && abd.aER.bgR == this) {
            this.initGui();
        }
    }

    private double oD() {
        return 129.0 * this.aya;
    }

    private double oE() {
        return 10.0 * this.aya;
    }

    @Override
    public void initGui() {
        if (!this.Mq) {
            this.oG();
            this.Mq = true;
            this.oF();
        }
        this.axU = 0.0;
        this.axV = 0.0;
        this.axW.T(0.0);
        Keyboard.enableRepeatEvents((boolean)true);
    }

    private void oF() {
        double d2 = 20.0;
        double d3 = 20.0;
        int n2 = 0;
        int n3 = 0;
        for (gj gj2 : this.axT) {
            abe abe2 = this.axS.get((Object)gj2);
            if (abe2 == null) continue;
            double d4 = d2 + (double)n2 * (this.oD() + this.oE());
            double d5 = d3 + (double)(n3 * 28);
            abe2.i(d4, d5);
            if (!((double)(++n2) >= 3.0)) continue;
            n2 = 0;
            ++n3;
        }
    }

    private void E(double d2) {
        this.aya = Math.max(0.5, Math.min(1.5, d2));
        this.oF();
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.axU = 0.0;
        this.axV = 0.0;
        this.axW.T(0.0);
    }

    private void oG() {
        this.axT.add(gj.le);
        this.axT.add(gj.lj);
        this.axT.add(gj.lf);
        this.axT.add(gj.lh);
        this.axT.add(gj.lg);
        this.axT.add(gj.li);
        for (gj gj2 : this.axT) {
            ArrayList<abg> arrayList = new ArrayList<abg>();
            for (gi gi2 : a.a.g().ef()) {
                if (gi2.getModuleInfo().category() != gj2) continue;
                arrayList.add(new abg(gi2));
            }
            arrayList.sort((abg2, abg3) -> Collator.getInstance().compare(abg2.dl().getName(), abg3.dl().getName()));
            this.axS.put(gj2, new abe(gj2, arrayList));
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        abd.drawRect(0, 0, this.width, this.height, new Color(0, 0, 0, 100).getRGB());
        boolean bl2 = this.axS.values().stream().anyMatch(abe::oZ);
        if (bl2) {
            int n4 = Mouse.getDWheel();
            if (n4 != 0) {
                double d2 = (n4 > 0 ? -1 : 1) * 15;
                this.axV += d2;
                double d3 = this.oH();
                this.axV = d3 <= 0.0 ? 0.0 : Math.max(0.0, Math.min(d3, this.axV));
            }
        } else {
            this.axV = 0.0;
            this.axU = 0.0;
            this.axW.T(0.0);
        }
        this.axW.Q(this.axV);
        this.axU = this.axW.sV();
        if (this.axX != null) {
            double d4 = (double)n3 + this.axZ + this.axU;
            this.axX.i((double)n2 + this.axY, d4);
        }
        if (((Boolean)a.a.g().c(xi.class).aoL.wD()).booleanValue()) {
            this.b(gg.kU).c(() -> {
                for (gj gj2 : this.axT) {
                    abe abe2 = this.axS.get((Object)gj2);
                    if (abe2 == null) continue;
                    double d2 = abe2.getX();
                    double d3 = abe2.getY() - this.axU;
                    if (d3 + abe2.da() < 0.0 || d3 > (double)this.height) continue;
                    ait.a(d2, d3, this.oD(), 24.0 * this.aya, 6.0 * this.aya, abz.aAb.ql(), true, true, false, false);
                    if (!abe2.oZ() || !(abe2.pa().sV() > 1.0)) continue;
                    ait.a(d2, d3 + 24.0 * this.aya, this.oD(), abe2.pa().sV(), 6.0 * this.aya, abz.aAa.ql(), false, false, true, true);
                }
            });
            this.b(gg.kT).c(() -> {
                for (gj gj2 : this.axT) {
                    abe abe2 = this.axS.get((Object)gj2);
                    if (abe2 == null) continue;
                    double d2 = abe2.getX();
                    double d3 = abe2.getY() - this.axU;
                    if (d3 + abe2.da() < 0.0 || d3 > (double)this.height) continue;
                    abe2.i(d2, d3, this.aya);
                }
            });
        }
        this.b(gg.kV, 1).c(() -> {
            for (gj gj2 : this.axT) {
                abe abe2 = this.axS.get((Object)gj2);
                if (abe2 == null) continue;
                double d2 = abe2.getX();
                double d3 = abe2.getY() - this.axU;
                if (d3 + abe2.da() < 0.0 || d3 > (double)this.height) continue;
                abe2.a(d2, d3, this.oD(), n2, n3, f2, this.aya);
            }
        });
        super.drawScreen(n2, n3, f2);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        for (gj gj2 : this.axT) {
            double d2;
            abe abe2 = this.axS.get((Object)gj2);
            if (abe2 == null) continue;
            double d3 = abe2.getX();
            if (agm.c(d3, d2 = abe2.getY() - this.axU, this.oD(), 24.0 * this.aya, n2, n3) && abd.isShiftKeyDown() && n4 == 0) {
                this.axX = abe2;
                this.axY = d3 - (double)n2;
                this.axZ = d2 - (double)n3;
                break;
            }
            if (!agm.c(d3, d2, this.oD(), abe2.da(), n2, n3)) continue;
            abe2.a(d3, d2, n2, n3, n4);
            break;
        }
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        this.axX = null;
        for (abe abe2 : this.axS.values()) {
            abe2.oW();
        }
        super.mouseReleased(n2, n3, n4);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            aER.a((bp)null);
            return;
        }
        boolean bl2 = abd.isCtrlKeyDown();
        if (bl2) {
            if (n2 == 13 || n2 == 78) {
                this.E(this.aya + 0.1);
                return;
            }
            if (n2 == 12 || n2 == 74) {
                this.E(this.aya - 0.1);
                return;
            }
            if (n2 == 11) {
                this.E(0.8);
                return;
            }
        }
        for (abe abe2 : this.axS.values()) {
            abe2.a(c2, n2);
        }
        super.keyTyped(c2, n2);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    public void cj() {
        if (abd.aER.bgR != this) {
            return;
        }
    }

    public void ci() {
        if (abd.aER.bgR != this) {
            return;
        }
    }

    private double oH() {
        double d2 = 0.0;
        double d3 = Double.MAX_VALUE;
        for (abe abe2 : this.axS.values()) {
            double d4 = abe2.getY();
            double d5 = abe2.getY() + abe2.da();
            if (d4 < d3) {
                d3 = d4;
            }
            if (!(d5 > d2)) continue;
            d2 = d5;
        }
        double d6 = d2 - d3 + 40.0;
        return Math.max(0.0, d6 - (double)this.height);
    }

    @Generated
    public Map<gj, abe> oI() {
        return this.axS;
    }

    @Generated
    public List<gj> oJ() {
        return this.axT;
    }

    @Generated
    public double oK() {
        return this.axU;
    }

    @Generated
    public double oL() {
        return this.axV;
    }

    @Generated
    public afj oM() {
        return this.axW;
    }

    @Generated
    public abe oN() {
        return this.axX;
    }

    @Generated
    public double oO() {
        return this.axY;
    }

    @Generated
    public double oP() {
        return this.axZ;
    }

    @Generated
    public double oQ() {
        return this.aya;
    }

    @Generated
    public double oR() {
        return this.ayb;
    }

    @Generated
    public double oS() {
        return this.ayc;
    }

    @Generated
    public double oT() {
        return this.ayd;
    }

    @Generated
    public boolean oy() {
        return this.Mq;
    }
}

