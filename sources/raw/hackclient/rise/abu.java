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
import hackclient.rise.ako;
import hackclient.rise.akp;
import hackclient.rise.gb;
import hackclient.rise.gd;

public class abu
extends abo {
    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        ako ako2 = (ako)this.azn;
        this.aqy = aka2;
        String string = ahg.cf(this.azn.getName()) + ":";
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        gb.ks.a(16, gd.kG).a(ahg.cf(ako2 instanceof akp ? ((akg)((akp)ako2).wD()).getName() : ako2.wD().toString()), this.aqy.x + (double)gb.ks.a(16, gd.kG).bQ(string) + 2.0, this.aqy.y, abz.aAd.Z(this.azo));
    }

    public abu(akh<?> akh2) {
        super(akh2);
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        boolean bl2;
        if (this.aqy == null) {
            return false;
        }
        ako ako2 = (ako)this.azn;
        boolean bl3 = n4 == 0;
        boolean bl4 = bl2 = n4 == 1;
        if (agm.c(this.aqy.x, this.aqy.y - 3.5, this.v().width - 70, this.jy, n2, n3)) {
            int n5 = ako2.wU().indexOf(ako2.wD());
            Object var8_8 = null;
            if (bl3) {
                var8_8 = ako2.wU().size() <= n5 + 1 ? ako2.wU().get(0) : ako2.wU().get(n5 + 1);
            } else if (bl2) {
                var8_8 = 0 > n5 - 1 ? ako2.wU().get(ako2.wU().size() - 1) : ako2.wU().get(n5 - 1);
            }
            if (var8_8 != null) {
                if (this.qi() instanceof akp) {
                    ((akp)ako2).c((akg<?>)var8_8);
                } else {
                    ako2.m(var8_8);
                }
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

