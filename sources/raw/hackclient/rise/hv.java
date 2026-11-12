/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.gq;
import rip.vantage.commons.util.time.a;

public final class hv
extends akg<gq> {
    private final akq rE = new akq("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)50);
    private final double[] rF = new double[]{5.0E-4, 1.0E-4};
    private final a rG = new a();
    private boolean pw;
    private int hV;
    @dm
    public final dk<ei> rH = ei2 -> {
        if (hv.aER.bgK.aO && this.pw) {
            ++this.hV;
            switch (this.hV) {
                case 1: {
                    ei2.setPosY(ei2.getPosY() + this.rF[0]);
                    break;
                }
                case 2: {
                    ei2.setPosY(ei2.getPosY() + this.rF[1]);
                    this.pw = false;
                }
            }
            ei2.setOnGround(false);
        } else {
            this.pw = false;
            this.hV = 0;
        }
    };
    @dm
    public final dk<eq> rI = eq2 -> {
        if (hv.aER.bgK.aO && !hv.aER.bgK.isOnLadder() && this.rG.T(((Number)this.rE.wD()).longValue())) {
            hv.aER.bgK.E(eq2.dc());
            this.rG.aX();
            this.pw = true;
        }
    };

    public hv(String string, gq gq2) {
        super(string, gq2);
    }
}

