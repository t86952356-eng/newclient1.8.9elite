/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.eq;
import hackclient.rise.gq;
import rip.vantage.commons.util.time.a;

public final class ia
extends akg<gq> {
    private final akq rT = new akq("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)50);
    private final double[] rU = new double[]{1.0E-6, aii.predictedMotion(0.03125, 1)};
    private final a rV = new a();
    public static boolean gD;
    public static boolean pw;
    private int hV;
    private int rW;
    private int rX;
    @dm
    public final dk<eo> rY = eo2 -> {};
    @dm
    public final dk<ei> rZ = ei2 -> {
        if (ia.aER.bgK.aO && pw) {
            ia.aER.bgK.crP = true;
            ia.aER.bgK.cso = 0.1f;
            ++this.hV;
            this.rW = 0;
            if (this.hV > 2) {
                ++this.rW;
            }
            switch (this.hV) {
                case 1: {
                    ei2.setPosY(ei2.getPosY() + 0.001);
                    break;
                }
                case 2: {
                    pw = false;
                }
            }
            ei2.setOnGround(false);
            if (this.hV > 4) {
                ia.aER.bgK.cso = 0.6f;
            }
            if (ia.aER.bgK.aO && this.hV < 6) {
                ia.aER.bgK.crP = true;
            }
            if (this.hV > 6) {
                ia.aER.bgK.crP = false;
            }
        } else {
            ++this.rW;
            if (ia.aER.bgK.csW > 4 || this.rW > 4) {
                ia.aER.bgK.cso = 0.6f;
            }
            ia.aER.bgK.crP = this.rW < 5 && ia.aER.bgK.aO && this.hV < 6;
            pw = false;
            this.hV = 0;
        }
    };
    @dm
    public final dk<eq> sa = eq2 -> {
        if (ia.aER.bgK.aO && !ia.aER.bgK.isOnLadder() && this.rV.T(((Number)this.rT.wD()).longValue())) {
            ia.aER.bgK.E(eq2.dc());
            this.rV.aX();
            pw = true;
        }
    };
    @dm(cH=4)
    public final dk<ed> sb = ed2 -> {
        if (this.hV <= 4 && this.rW <= 4 && ia.aER.bgK.crx > 2) {
            ed2.cF();
        }
    };

    public ia(String string, gq gq2) {
        super(string, gq2);
    }
}

