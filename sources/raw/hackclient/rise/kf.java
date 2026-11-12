/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ej;
import hackclient.rise.jg;

public class kf
extends akg<jg> {
    private float jp;
    private float jq;
    @dm(cH=3)
    dk<dz> yv = dz2 -> {
        this.jp = dz2.getForward();
        this.jq = dz2.getStrafe();
    };
    @dm(cH=1)
    dk<ej> dq = ej2 -> {
        if (kf.aER.bgK == null || kf.aER.bgF == null || kf.aER.bgK.aRg < 50) {
            return;
        }
        if (aii.enoughMovementForSprinting() && !kf.aER.aIY.chm.Re()) {
            bs.a(new akb((float)Math.toDegrees(aii.g(this.jp, this.jq)), kf.aER.bgK.pm), 10.0, cb.gH);
        }
    };

    public kf(String string, jg jg2) {
        super(string, jg2);
    }
}

