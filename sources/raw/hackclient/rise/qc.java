/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.mh;

public class qc
extends akg<mh> {
    private int PR = 0;
    @dm(cH=4)
    public final dk<ej> PS = ej2 -> {
        qc.aER.bgC.dAp = 1.009f;
        if (qc.aER.bgK.aO || !qc.aER.aIY.chm.Re() || !bs.bd()) {
            // empty if block
        }
    };
    @dm(cH=4)
    public final dk<eo> PT = eo2 -> {
        if (qc.aER.bgK.tR == 1) {
            // empty if block
        }
        if (qc.aER.bgK.tR == 5 && this.PR % 2 != 0) {
            qc.aER.bgK.ue -= 0.03;
        }
        if (qc.aER.bgK.aO) {
            qc.aER.bgK.jump();
        }
        if (this.PR % 2 != 0) {
            afl.c(qc.aER.bgK.tR, new Object[0]);
        }
        aii.moveFlying(0.002);
    };
    @dm
    public final dk<ed> PU = ed2 -> ++this.PR;

    public qc(String string, mh mh2) {
        super(string, mh2);
    }
}

