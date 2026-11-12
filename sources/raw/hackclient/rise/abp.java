/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.gb;
import hackclient.rise.gd;
import rip.vantage.commons.util.time.a;

public class abp
extends abo {
    private final a azp = new a();
    private double aya;

    public abp(akh<?> akh2) {
        super(akh2);
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        this.aqy = aka2;
        aki aki2 = (aki)this.azn;
        String string = ahg.cf(this.azn.getName());
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        double d2 = this.aqy.x + (double)gb.ks.a(16, gd.kG).bQ(string) + 3.0;
        this.aya = (Boolean)aki2.wD() != false ? Math.min(5.0, this.aya + (double)((float)this.azp.aKM() / 20.0f)) : Math.max(0.0, this.aya - (double)((float)this.azp.aKM() / 20.0f));
        ait.c(d2 - 2.5 + 5.0, this.aqy.y - 2.5 + 2.5, 5.0, 5.0, 2.5, abz.aAa.Y(this.azo));
        if (this.aya != 0.0) {
            ait.c(d2 - this.aya / 2.0 + 5.0, this.aqy.y - this.aya / 2.0 + 2.5, this.aya, this.aya, this.aya / 2.0, ais.d(this.rP().rQ(), this.azo));
        }
        this.azp.aX();
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        if (this.aqy == null) {
            return false;
        }
        aki aki2 = (aki)this.azn;
        if (agm.c(this.aqy.x, this.aqy.y - 3.5, this.v().width - 70, this.jy, n2, n3)) {
            aki2.c((Boolean)aki2.wD() == false);
            return true;
        }
        return false;
    }

    @Override
    public void pP() {
    }

    @Override
    public void ci() {
        if (this.aqy == null) {
            return;
        }
        String string = ahg.cf(this.azn.getName());
        double d2 = this.aqy.x + (double)gb.ks.a(16, gd.kG).bQ(string) + 2.0;
        ait.c(d2 - this.aya / 2.0 + 4.0, this.aqy.y - this.aya / 2.0 + 2.5, this.aya, this.aya, this.aya / 2.0, ais.d(this.rP().rQ(), this.azo));
    }

    @Override
    public void b(char c2, int n2) {
    }
}

