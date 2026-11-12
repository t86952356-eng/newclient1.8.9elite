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
import hackclient.rise.eo;
import hackclient.rise.mh;
import net.minecraft.util.da;

public class qj
extends akg<mh> {
    public da Jr = new da(0.0, 0.0, 0.0);
    int dE = 0;
    float jp = 0.0f;
    float jq = 0.0f;
    @dm(cH=3)
    dk<dz> yv = dz2 -> {
        this.jp = dz2.getForward();
        this.jq = dz2.getStrafe();
    };
    @dm
    public final dk<eo> QJ = eo2 -> {
        double d2;
        if (aii.isMoving() && qj.aER.bgK.aO) {
            qj.aER.bgK.jump();
            ++this.dE;
        }
        if (qj.aER.bgK.aO) {
            aii.moveFlying(0.005);
            aii.partialStrafePercent(95.0);
        }
        if (qj.aER.bgK.tR == 1) {
            aii.partialStrafePercent(60.0);
        }
        if (qj.aER.bgK.tR == 2) {
            aii.partialStrafePercent(50.0);
        } else {
            aii.partialStrafePercent(1.0);
        }
        if (qj.aER.bgK.tR == 1) {
            qj.aER.bgK.ue = aii.predictedMotion(qj.aER.bgK.ue + 0.12, 2);
        }
        if ((d2 = Math.hypot(qj.aER.bgK.ud - (qj.aER.bgK.csh - qj.aER.bgK.csk), qj.aER.bgK.uf - (qj.aER.bgK.csj - qj.aER.bgK.csm))) < 0.005) {
            aii.strafe();
        }
        aii.moveFlying(8.0E-4);
        aii.preventDiagonalSpeed();
    };
    @dm(cH=1)
    dk<ej> dq = ej2 -> bs.a(new akb((float)Math.toDegrees(aii.g(this.jp, this.jq)), qj.aER.bgK.pm), 10.0, cb.gG);

    public qj(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        this.dE = 0;
    }
}

