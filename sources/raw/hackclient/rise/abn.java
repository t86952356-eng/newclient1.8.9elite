/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.adz;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.gg;
import java.awt.Color;
import lombok.Generated;

public class abn
implements aea {
    private final adz azk;
    private akd azf = new akd(0.0, 0.0, 0.0);
    private final afj azl = new afj(afk.aHh, 500L);
    private final afj azm = new afj(afk.aHh, 500L);

    public void a(double d2, double d3, double d4, boolean bl2) {
        double d5 = this.azl.sV();
        ait.c(d2, d3, d4, 17.0, 5.0, new Color(18, 21, 30));
        ait.c(d2 + 0.5, d3 + 0.5, d4 - 1.0, 16.0, 4.0, this.azk.nM());
        ait.c(d2, d3, d4, 17.0, 5.0, new Color(25, 25, 25, (int)((1.0 - this.azl.sV()) * 128.0)));
        this.b(gg.kT).c(() -> {
            ait.c(d2, d3, d4, 17.0, 5.0, new Color(18, 21, 30, (int)(this.azm.sV() * 255.0)));
            ait.c(d2 + 0.5, d3 + 0.5, d4 - 1.0, 16.0, 4.0, ais.d(this.azk.nM(), (int)(this.azm.sV() * 255.0)));
        });
        this.azf = new akd(d2, d3, d4);
    }

    @Generated
    public adz qf() {
        return this.azk;
    }

    @Generated
    public akd qb() {
        return this.azf;
    }

    @Generated
    public afj qg() {
        return this.azl;
    }

    @Generated
    public afj qh() {
        return this.azm;
    }

    @Generated
    public abn(adz adz2) {
        this.azk = adz2;
    }
}

