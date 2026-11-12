/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.akp;
import hackclient.rise.gb;
import hackclient.rise.gd;

public class abv
extends abo {
    public abv(akh<?> akh2) {
        super(akh2);
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        akp akp2 = (akp)this.azn;
        this.aqy = aka2;
        String string = ahg.cf(this.azn.getName()) + ":";
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.Z(Math.min(this.azo, abz.aAd.ql().getAlpha())));
        gb.ks.a(16, gd.kG).a(ahg.cf(((akg)akp2.wD()).getName()), this.aqy.x + (double)gb.ks.a(16, gd.kG).bQ(string) + 2.0, this.aqy.y, abz.aAd.Z(Math.min(this.azo, abz.aAd.ql().getAlpha())));
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        boolean bl2;
        if (this.aqy == null) {
            return false;
        }
        akp akp2 = (akp)this.azn;
        boolean bl3 = n4 == 0;
        boolean bl4 = bl2 = n4 == 1;
        if (agm.c(this.aqy.x, this.aqy.y - 3.5, this.v().width - 70, this.jy, n2, n3)) {
            int n5 = akp2.wU().indexOf(akp2.wD());
            akg<?> akg2 = null;
            if (bl3) {
                akg2 = akp2.wU().size() <= n5 + 1 ? akp2.wU().get(0) : akp2.wU().get(n5 + 1);
            } else if (bl2) {
                akg2 = 0 > n5 - 1 ? akp2.wU().get(akp2.wU().size() - 1) : akp2.wU().get(n5 - 1);
            }
            if (akg2 != null) {
                akp2.c(akg2);
            }
            return true;
        }
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
    }
}

