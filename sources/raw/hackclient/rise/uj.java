/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.tb;

public class uj
extends akg<tb> {
    private akd Ft;
    private akd EC;
    private akb ka;
    @dm
    public final dk<eg> aim = eg2 -> {
        if (uj.aER.bgK.aRg <= 60) {
            return;
        }
        if (this.Ft != null && this.EC != null && this.ka != null && !aik.a(50.0, true)) {
            if (bd.cY > 4.0f) {
                uj.aER.bgK.setPosition(this.Ft.x, this.Ft.y, this.Ft.z);
                uj.aER.bgK.ud = 0.0;
                uj.aER.bgK.ue = aii.predictedMotion(this.EC.y);
                uj.aER.bgK.uf = 0.0;
                uj.aER.bgK.pl = this.ka.x;
                uj.aER.bgK.pm = this.ka.y;
                bd.cY = 0.0f;
                bm.disable();
                bm.dispatch();
            }
        } else {
            this.Ft = new akd(uj.aER.bgK.gW, uj.aER.bgK.gX, uj.aER.bgK.gY);
            this.EC = new akd(uj.aER.bgK.ud, uj.aER.bgK.ue, uj.aER.bgK.uf);
            this.ka = new akb(uj.aER.bgK.pl, uj.aER.bgK.pm);
        }
    };

    public uj(String string, tb tb2) {
        super(string, tb2);
    }
}

