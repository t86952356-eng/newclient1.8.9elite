/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.mh;

public class qe
extends akg<mh> {
    int dE;
    @dm
    public final dk<ei> Qc = ei2 -> {
        if (qe.aER.bgK.aO) {
            if (qe.aER.bgK.cus == 0) {
                aii.strafe(aii.getAllowedHorizontalDistance() * 0.99);
            }
            qe.aER.bgK.jump();
            ++this.dE;
        }
        if (qe.aER.bgK.tR == 1 && qe.aER.bgK.cus == 0) {
            qe.aER.bgK.ue = aii.predictedMotion(qe.aER.bgK.ue, this.dE % 2 == 0 ? 2 : 4);
        }
    };

    public qe(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        this.dE = 0;
    }
}

