/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ey;
import hackclient.rise.fa;
import hackclient.rise.fg;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.xj;
import hackclient.rise.xk;
import hackclient.rise.xl;
import hackclient.rise.zf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;

@gl(aliases={"module.render.interface.name"}, description="module.render.interface.description", category=gj.RENDER, autoEnabled=true)
public final class xi
extends gi {
    private final akp aoG = new xj(this, "Mode", this);
    private final akp aoH = new xk(this, "Modules to Show", this);
    public aki aoI = new aki("Suffix", (gi)this, (Boolean)true);
    public aki aoJ = new aki("Lowercase", (gi)this, (Boolean)false);
    public aki aoK = new aki("Remove Spaces", (gi)this, (Boolean)false);
    public aki aoL = new aki("Shaders", (gi)this, (Boolean)false);
    public aki aoM = new aki("Toggle Notifications", (gi)this, (Boolean)false);
    private final akq aoN = new akq("Blur Radius", this, (Number)12, (Number)1, (Number)30, (Number)1);
    private final akq aoO = new akq("Blur Compression", this, (Number)3.0, (Number)1.0, (Number)10.0, (Number)0.1);
    private final akq aoP = new akq("Bloom Radius", this, (Number)14, (Number)1, (Number)30, (Number)1);
    private final akq aoQ = new akq("Bloom Compression", this, (Number)2.0, (Number)1.0, (Number)10.0, (Number)0.1);
    private final akq aoR = new akq("Background Alpha", this, (Number)110, (Number)0, (Number)255, (Number)1);
    private final akq aoS = new akq("Rounding Radius", this, (Number)5, (Number)0, (Number)20, (Number)0.5);
    private List<zf> aoT = new ArrayList<zf>();
    private List<zf> aoU = new ArrayList<zf>();
    private akp aoV = new xl(this, "Information Type", this);
    private final rip.vantage.commons.util.time.a aoW = new rip.vantage.commons.util.time.a();
    private final rip.vantage.commons.util.time.a aoX = new rip.vantage.commons.util.time.a();
    public agf aoY = gb.ks.a(20, gd.kF);
    public float aoZ = 12.0f;
    public float apa;
    @dm
    public final dk<fg> apb = fg2 -> this.lM();
    @dm
    public final dk<fa> apc = fa2 -> this.lM();
    @dm
    public final dk<ey> apd = ey2 -> {
        if (((Boolean)this.aoM.wD()).booleanValue()) {
            cg.a("Toggled", "Toggled " + ey2.dl().getName() + " " + (ey2.dl().isEnabled() ? "on" : "off"), 900);
        }
    };
    rip.vantage.commons.util.time.a ape = new rip.vantage.commons.util.time.a();
    @dm
    public final dk<ej> apf = ej2 -> aNC.execute(() -> {
        ady.c(new Color(0, 0, 0, (Boolean)this.aoL.wD() != false ? this.lT() : 150));
        if (this.ape.T(15000L)) {
            this.lO();
            this.ape.aX();
        }
        this.aoX.aX();
        block0: for (zf zf2 : this.aoU) {
            if (zf2.atQ == 0.0f) continue;
            for (akh<?> akh2 : zf2.dl().getValues()) {
                if (akh2 instanceof akp) {
                    akp akp2 = (akp)akh2;
                    String string = ((akg)akp2.wD()).getName();
                    if ("Bloxd".equalsIgnoreCase(string)) {
                        zf2.an("Blocks");
                        continue block0;
                    }
                    zf2.an(string);
                    continue block0;
                }
                zf2.an("");
            }
        }
        this.lN();
    });
    @dm
    public final dk<fs> apg = fs2 -> {
        for (zf object2 : this.aoT) {
            float f2;
            float f3 = f2 = ((akg)this.aoG.wD()).getName().equals("Classic") ? 10.0f : 100.0f;
            if (object2.dl().isEnabled()) {
                object2.atQ = Math.min(object2.atQ + (float)this.aoW.aKM() / f2, 10.0f);
                continue;
            }
            object2.atQ = Math.max(object2.atQ - (float)this.aoW.aKM() / f2, 0.0f);
        }
        float f4 = fs2.dx().getScaledWidth();
        akb akb2 = new akb(0.0f, 0.0f);
        for (zf zf2 : this.aoU) {
            if (zf2.atQ == 0.0f) continue;
            zf2.atP = new aka(f4 - zf2.nK() - zf2.nL(), akb2.getY());
            if (!zf2.dl().isEnabled() && zf2.atQ < 10.0f) {
                zf2.atP = new aka(f4 + zf2.nK() + zf2.nL(), akb2.getY());
            } else {
                akb2.setY(akb2.getY() + this.aoZ);
            }
            float f5 = this.apa;
            float f6 = this.apa;
            zf2.atP.x -= (double)f5;
            zf2.atP.y += (double)f6;
            if (Math.abs(zf2.nH().getX() - zf2.atP.x) > 0.5 || Math.abs(zf2.nH().getY() - zf2.atP.y) > 0.5 || zf2.atQ != 0.0f && zf2.atQ != 10.0f) {
                zf2.aqy.x = ahj.m(zf2.aqy.x, zf2.atP.x, 0.015f * (float)this.aoW.aKM());
                zf2.aqy.y = ahj.m(zf2.aqy.y, zf2.atP.y, 0.015f * (float)this.aoW.aKM());
                continue;
            }
            zf2.aqy = zf2.atP;
        }
        this.aoW.aX();
    };

    public xi() {
        this.lM();
    }

    public void lM() {
        this.aoT.clear();
        a.a.g().ef().stream().sorted(Comparator.comparingDouble(gi2 -> -this.aoY.bQ(gi2.getName()))).forEach(gi2 -> this.aoT.add(new zf((gi)gi2)));
        this.lO();
    }

    public void lN() {
        this.aoU = this.aoT.stream().filter(zf2 -> zf2.a(this)).sorted(Comparator.comparingDouble(zf2 -> -zf2.nK() - zf2.nL())).collect(Collectors.toCollection(ArrayList::new));
    }

    public void lO() {
        for (zf zf2 : this.aoT) {
            zf2.ao(zf2.dl().getName());
        }
    }

    public int lP() {
        return ((Number)this.aoN.wD()).intValue();
    }

    public float lQ() {
        return ((Number)this.aoO.wD()).floatValue();
    }

    public int lR() {
        return ((Number)this.aoP.wD()).intValue();
    }

    public float lS() {
        return ((Number)this.aoQ.wD()).floatValue();
    }

    public int lT() {
        return ((Number)this.aoR.wD()).intValue();
    }

    public double lU() {
        return ((Number)this.aoS.wD()).doubleValue();
    }

    @Generated
    public akp hl() {
        return this.aoG;
    }

    @Generated
    public akp lV() {
        return this.aoH;
    }

    @Generated
    public aki lW() {
        return this.aoI;
    }

    @Generated
    public aki lX() {
        return this.aoJ;
    }

    @Generated
    public aki lY() {
        return this.aoK;
    }

    @Generated
    public aki lZ() {
        return this.aoL;
    }

    @Generated
    public aki ma() {
        return this.aoM;
    }

    @Generated
    public List<zf> mb() {
        return this.aoT;
    }

    @Generated
    public List<zf> mc() {
        return this.aoU;
    }

    @Generated
    public akp md() {
        return this.aoV;
    }

    @Generated
    public rip.vantage.commons.util.time.a me() {
        return this.aoW;
    }

    @Generated
    public rip.vantage.commons.util.time.a mf() {
        return this.aoX;
    }

    @Generated
    public agf mg() {
        return this.aoY;
    }

    @Generated
    public float mh() {
        return this.aoZ;
    }

    @Generated
    public float mi() {
        return this.apa;
    }

    @Generated
    public dk<fg> getOnWorldChange() {
        return this.apb;
    }

    @Generated
    public dk<fa> mj() {
        return this.apc;
    }

    @Generated
    public dk<ey> mk() {
        return this.apd;
    }

    @Generated
    public rip.vantage.commons.util.time.a ml() {
        return this.ape;
    }

    @Generated
    public dk<ej> mm() {
        return this.apf;
    }

    @Generated
    public dk<fs> mn() {
        return this.apg;
    }

    @Generated
    public void a(aki aki2) {
        this.aoI = aki2;
    }

    @Generated
    public void b(aki aki2) {
        this.aoJ = aki2;
    }

    @Generated
    public void c(aki aki2) {
        this.aoK = aki2;
    }

    @Generated
    public void d(aki aki2) {
        this.aoL = aki2;
    }

    @Generated
    public void e(aki aki2) {
        this.aoM = aki2;
    }

    @Generated
    public void n(List<zf> list) {
        this.aoT = list;
    }

    @Generated
    public void o(List<zf> list) {
        this.aoU = list;
    }

    @Generated
    public void a(akp akp2) {
        this.aoV = akp2;
    }

    @Generated
    public void a(agf agf2) {
        this.aoY = agf2;
    }

    @Generated
    public void a(rip.vantage.commons.util.time.a a2) {
        this.ape = a2;
    }

    @Generated
    public void n(float f2) {
        this.aoZ = f2;
    }

    @Generated
    public void o(float f2) {
        this.apa = f2;
    }

    private static /* synthetic */ void a(zf zf2) {
        zf2.aqy = zf2.atP;
    }
}

