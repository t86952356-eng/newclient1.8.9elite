/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.aka;
import hackclient.rise.akh;
import hackclient.rise.akr;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;

public class aby
extends abo {
    public final agp azZ = new agp(new aka(200.0, 200.0), gb.ks.a(16, gd.kG), Color.WHITE, ago.aJS, "", 20.0f);

    public aby(akh<?> akh2) {
        super(akh2);
        akr akr2 = (akr)akh2;
        this.azZ.bX((String)akr2.wD());
        this.azZ.ar(((String)akr2.wD()).length());
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        this.aqy = aka2;
        akr akr2 = (akr)this.azn;
        this.jy = 28.0;
        String string = ahg.cf(this.azn.getName());
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        this.azZ.b(ais.d(this.azZ.nM(), this.azo));
        this.aqy = new aka(this.aqy.x, this.aqy.y + 14.0);
        this.azZ.h(this.aqy);
        this.azZ.z(230.5f);
        this.azZ.pZ();
        akr2.n(this.azZ.getText());
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        if (this.aqy == null) {
            return false;
        }
        this.azZ.d(n2, n3, n4);
        return false;
    }

    @Override
    public void pP() {
    }

    @Override
    public void ci() {
    }

    @Override
    public void b(char c2, int n2) {
        if (this.aqy == null) {
            return;
        }
        this.azZ.b(c2, n2);
    }
}

