/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import lombok.Generated;
import rise.util.InstanceAccess;

public class abm
implements InstanceAccess {
    private final ady aze;
    private akd azf = new akd(0.0, 0.0, 0.0);
    private final afj azg = new afj(afk.aHh, 500L);
    private final afj azh = new afj(afk.aHh, 500L);
    private final afj azi = new afj(afk.aHh, 500L);
    private final afj azj = new afj(afk.aHh, 500L);

    public void k(double d2, double d3) {
        int n2 = (int)this.azi.sV();
        boolean bl2 = this.aze.equals((Object)this.rP());
        Color color = bl2 ? new Color(15, 19, 26, (int)this.azi.sV()) : new Color(18, 21, 30, n2);
        double d4 = this.azg.sV();
        double d5 = this.azh.sV() + d2;
        ait.c(d4, d5, d3, 50.0, 10.0, color);
        if (this.aze.rZ()) {
            ait.a(d4, d5, d3, 30.0, 9.0, ais.d(this.aze.rQ(), n2), ais.d(this.aze.rR(), n2), ais.d(this.aze.rS(), n2), false, true, true, false, false);
        } else {
            ait.a(d4, d5, d3, 30.0, 9.0, ais.d(this.aze.rQ(), n2), ais.d(this.aze.rR(), n2), false, true, true, false, false);
        }
        ait.d(d4, d5 + 30.0, d3, 10.0, color);
        gb.ks.a(16, gd.kG).c(this.aze.rV(), d4 + d3 / 2.0, d5 + 37.0, bl2 ? ais.d(this.rP().rQ(), n2).getRGB() : new Color(255, 255, 255, n2).getRGB());
        this.azj.Q(this.aze.equals((Object)this.rP()) ? 255.0 : 0.0);
        int n3 = (int)Math.min(this.azj.sV(), (double)n2);
        if (n3 > 0 && this.v().ayD > 0.8) {
            this.b(gg.kT, 3).c(() -> {
                if (this.aze.rZ()) {
                    ait.a(d4, d5, d3, 30.0, 10.0, ais.d(this.aze.rQ(), n2), ais.d(this.aze.rR(), n2), ais.d(this.aze.rS(), n2), false, true, true, false, false);
                } else {
                    ait.a(d4 + 1.0, d5, d3 - 2.0, 30.0, 10.0, ais.d(this.aze.rQ(), n3), ais.d(this.aze.rR(), n3), false, true, true, false, false);
                }
                gb.ks.a(16, gd.kG).c(this.aze.rV(), d4 + d3 / 2.0, d5 + 37.0, ais.d(this.aze.rQ(), n3).getRGB());
            });
        }
        this.azf = new akd(d4, d5, d3);
    }

    @Generated
    public ady qa() {
        return this.aze;
    }

    @Generated
    public akd qb() {
        return this.azf;
    }

    @Generated
    public afj qc() {
        return this.azg;
    }

    @Generated
    public afj qd() {
        return this.azh;
    }

    @Generated
    public afj pF() {
        return this.azi;
    }

    @Generated
    public afj qe() {
        return this.azj;
    }

    @Generated
    public abm(ady ady2) {
        this.aze = ady2;
    }
}

