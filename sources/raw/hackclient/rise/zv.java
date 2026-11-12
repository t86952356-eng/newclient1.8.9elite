/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.akn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ex;
import hackclient.rise.fa;
import hackclient.rise.fh;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.xi;
import hackclient.rise.xx;
import hackclient.rise.zw;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import net.minecraft.network.play.server.ca;
import net.minecraft.util.ct;

public final class zv
extends akg<xx> {
    private final akn aus = ((xx)this.wy()).mx();
    private zw aut = new zw(0, 0, 0, 0, 0.0, 0.0);
    private String auu = "0 seconds";
    @dm
    public final dk<ei> auv = ei2 -> {
        if (zv.aER.bgK.aRg % 20 == 0) {
            long l2 = System.currentTimeMillis() - this.aut.auG;
            long l3 = TimeUnit.MILLISECONDS.toHours(l2);
            long l4 = TimeUnit.MILLISECONDS.toMinutes(l2) % 60L;
            long l5 = TimeUnit.MILLISECONDS.toSeconds(l2) % 60L;
            Object object = "";
            object = (String)object + l3 + ahg.cf("h ");
            object = (String)object + l4 + ahg.cf("m ");
            this.auu = object = (String)object + l5 + ahg.cf("s ");
        }
    };
    @dm
    public final dk<fs> auw = fs2 -> {
        double d2 = 10.0;
        this.aus.aHP = new aka(130.0, 50.0);
        if (zv.aER.aIY.bJS) {
            return;
        }
        if (((Boolean)this.e(xi.class).aoL.wD()).booleanValue()) {
            this.b(gg.kU).c(() -> {
                ait.a(this.aus.aqy.x, this.aus.aqy.y - 14.0, this.aus.aHP.x, 14.0, 6.0, abz.aAb.ql(), true, true, false, false);
                ait.a(this.aus.aqy.x, this.aus.aqy.y, this.aus.aHP.x, this.aus.aHP.y, 6.0, abz.aAa.ql(), false, false, true, true);
            });
            this.b(gg.kT).c(() -> {
                ait.c(this.aus.aqy.x, this.aus.aqy.y - 14.0, this.aus.aHP.x, this.aus.aHP.y + 14.0, 7.0, this.rP().rU());
                double d2 = this.aus.aqy.x + this.aus.aHP.x / 2.0 - ((double)gb.ks.a(18, gd.kG).bQ("Information") / 2.0 + 1.0);
                gb.ks.a(18, gd.kH).c(ahg.cf("session"), d2, this.aus.aqy.y - 9.0, ais.d(this.rP().rQ(), 200).getRGB());
            });
        }
        this.b(gg.kV, 1).c(() -> {
            Color color = this.rP().rQ();
            Color color2 = new Color(Math.min(255, abz.aAa.ql().getRed() + color.getRed() / 26), Math.min(255, abz.aAa.ql().getGreen() + color.getGreen() / 26), Math.min(255, abz.aAa.ql().getBlue() + color.getBlue() / 26), 245);
            ait.a(this.aus.aqy.x, this.aus.aqy.y - 14.0, this.aus.aHP.x, 14.0, 6.0, ais.d(abz.aAb.ql(), 170), true, true, false, false);
            ait.a(this.aus.aqy.x, this.aus.aqy.y, this.aus.aHP.x, this.aus.aHP.y, 6.0, color2, false, false, true, true);
            double d3 = this.aus.aqy.x + this.aus.aHP.x / 2.0 - ((double)gb.ks.a(18, gd.kG).bQ("Information") / 2.0 + 1.0);
            gb.ks.a(18, gd.kH).c(ahg.cf("session"), d3, this.aus.aqy.y - 9.0, this.rP().rT().getRGB());
            gb.ks.a(18, gd.kG).c(ahg.cf("Information"), this.aus.aqy.x + this.aus.aHP.x / 2.0 + ((double)gb.ks.a(18, gd.kH).bQ("session") / 2.0 + 1.0), this.aus.aqy.y - 9.0, abz.aAc.qm());
            gb.ks.a(24, gd.kH).a(this.auu, this.aus.aqy.x + d2, this.aus.aqy.y + d2 - 1.8, abz.aAc.qm());
            gb.ks.a(16, gd.kG).a(ahg.cf("You have gotten ") + this.aut.auA + " kills", this.aus.aqy.x + d2, this.aus.aqy.y + d2 + (double)gb.ks.a(24, gd.kH).tF(), abz.aAe.qm());
            gb.ks.a(16, gd.kG).a(ahg.cf("You have won " + this.aut.auB) + " games", this.aus.aqy.x + d2, this.aus.aqy.y + d2 + (double)gb.ks.a(24, gd.kH).tF() + (double)gb.ks.a(16, gd.kG).tF() + 2.0, abz.aAe.qm());
        });
    };
    @dm
    public final dk<ex> auxx = ex2 -> ++this.aut.auA;
    @dm
    public final dk<fh> auy = fh2 -> {
        if (fh2.dq() instanceof ca) {
            ca ca2 = (ca)fh2.dq();
            if (ca2.aiq() == null) {
                return;
            }
            if (ct.gs(ca2.aiq().arq()).equals("VICTORY!")) {
                ++this.aut.auB;
            }
        }
    };
    @dm
    public final dk<fa> auz = fa2 -> {
        this.aut = new zw(0, 0, 0, 0, 0.0, 0.0);
    };

    public zv(String string, xx xx2) {
        super(string, xx2);
    }
}

