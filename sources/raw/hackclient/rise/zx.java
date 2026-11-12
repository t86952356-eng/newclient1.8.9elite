/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

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
import hackclient.rise.xx;
import hackclient.rise.zy;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import net.minecraft.network.play.server.ca;
import net.minecraft.util.ct;

public final class zx
extends akg<xx> {
    private final akn auH = ((xx)this.wy()).mx();
    private zy auI = new zy(0, 0, 0, 0, 0.0, 0.0);
    private String auu = "0 seconds";
    @dm
    public final dk<ei> auJ = ei2 -> {
        if (zx.aER.bgK.aRg % 20 == 0) {
            long l2 = System.currentTimeMillis() - this.auI.auO;
            long l3 = TimeUnit.MILLISECONDS.toHours(l2);
            long l4 = TimeUnit.MILLISECONDS.toMinutes(l2) % 60L;
            long l5 = TimeUnit.MILLISECONDS.toSeconds(l2) % 60L;
            Object object = "";
            if (l3 > 0L) {
                object = (String)object + l3 + " " + (l3 == 1L ? ahg.cf("ui.sessionstats.hour") : ahg.cf("ui.sessionstats.hours")) + (l4 == 0L ? "" : " ");
            }
            if (l4 > 0L) {
                object = (String)object + l4 + " " + (l4 == 1L ? ahg.cf("ui.sessionstats.minute") : ahg.cf("ui.sessionstats.minutes")) + (l5 == 0L || l3 > 0L ? "" : " ");
            }
            if (l5 > 0L && l3 == 0L) {
                object = (String)object + l5 + " " + (l5 == 1L ? ahg.cf("ui.sessionstats.second") : ahg.cf("ui.sessionstats.seconds"));
            }
            this.auu = object;
        }
    };
    @dm
    public final dk<fs> auK = fs2 -> {
        double d2 = 8.0;
        this.auH.aHP = new aka(130.0, 55.0);
        if (zx.aER.aIY.bJS) {
            return;
        }
        this.b(gg.kU).c(() -> ait.c(this.auH.aqy.x, this.auH.aqy.y, this.auH.aHP.x, this.auH.aHP.y, 11.0, Color.BLACK));
        this.b(gg.kV, 1).c(() -> {
            ait.c(this.auH.aqy.x, this.auH.aqy.y, this.auH.aHP.x, this.auH.aHP.y, 11.0, ais.d(Color.black, 100));
            ait.a(this.auH.aqy.x, this.auH.aqy.y, this.auH.aHP.x, this.auH.aHP.y, 11.0, 0.5, ais.d(this.rP().rQ(), 200), ais.d(this.rP().rR(), 200));
            gb.ks.a(24, gd.kG).c(ahg.cf("ui.sessionstats.name"), this.auH.aqy.x + this.auH.aHP.x / 2.0, this.auH.aqy.y + d2, this.rP().rT().getRGB());
            gb.ks.a(18, gd.kG).c(this.auu, this.auH.aqy.x + this.auH.aHP.x / 2.0, this.auH.aqy.y + d2 + 19.0, new Color(255, 255, 255, 200).getRGB());
            gb.ks.a(18, gd.kG).c(ahg.cf("ui.sessionstats.kills").toLowerCase() + " " + this.auI.auA, this.auH.aqy.x + 35.0, this.auH.aqy.y + d2 + 32.0, new Color(255, 255, 255, 200).getRGB());
            gb.ks.a(18, gd.kG).c(ahg.cf("ui.sessionstats.wins").toLowerCase() + " " + this.auI.auB, this.auH.aqy.x + 95.0, this.auH.aqy.y + d2 + 32.0, new Color(255, 255, 255, 200).getRGB());
        });
    };
    @dm
    public final dk<ex> auL = ex2 -> ++this.auI.auA;
    @dm
    public final dk<fh> auM = fh2 -> {
        if (fh2.dq() instanceof ca) {
            ca ca2 = (ca)fh2.dq();
            if (ca2.aiq() == null) {
                return;
            }
            if (ct.gs(ca2.aiq().arq()).equals("VICTORY!")) {
                ++this.auI.auB;
            }
        }
    };
    @dm
    public final dk<fa> auN = fa2 -> {
        this.auI = new zy(0, 0, 0, 0, 0.0, 0.0);
    };

    public zx(String string, xx xx2) {
        super(string, xx2);
    }
}

