/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.mh;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;

public class qg
extends akg<mh> {
    private final akq Qj = new akq("Timer Boost (on sneak)", this, (Number)30, (Number)1, (Number)100, (Number)0.1);
    private int PR = 0;
    @dm
    public final dk<ed> Qk = ed2 -> ++this.PR;
    @dm
    public final dk<eo> Ql = eo2 -> {
        boolean bl2;
        boolean bl3 = qg.aER.bgK.gX % 0.015625 == 0.0;
        boolean bl4 = bl2 = aii.speed() < 0.2;
        if (bl3 || bl2) {
            aii.strafe();
        }
        if (qg.aER.bgK.isUsingItem()) {
            // empty if block
        }
        if (aii.speed() < 0.195 && !qg.aER.bgK.isUsingItem()) {
            aii.strafe(0.195);
        }
        if (qg.aER.bgK.aO) {
            qg.aER.bgK.ud *= 1.001;
            qg.aER.bgK.uf *= 1.001;
            aii.strafe();
        }
        if (qg.aER.bgK.ae > 1) {
            qg.aER.bgK.ue -= 0.00348;
        }
        if (qg.aER.bgK.tR == 1) {
            aii.partialStrafePercent(65.0);
        }
        if (aik.ae(qg.aER.bgK.ue)) {
            aii.partialStrafePercent(65.0);
        }
        if (qg.aER.bgK.ae < 12) {
            aii.strafe();
        }
        aii.useDiagonalSpeed();
        if (qg.aER.aIY.chr.Re()) {
            this.PR = 0;
            aii.strafe(0.07);
            qg.aER.bgC.dAp = ((Number)this.Qj.wD()).floatValue();
        } else {
            ++this.PR;
            if (this.PR == 1) {
                ahn.n(new h(qg.aER.bgK.gW, qg.aER.bgK.gX, qg.aER.bgK.gY, qg.aER.bgK.pl, qg.aER.bgK.pm, false));
                ahn.n(new f(qg.aER.bgK.gW, qg.aER.bgK.gX, qg.aER.bgK.gY, false));
                ahn.n(new h(qg.aER.bgK.gW, qg.aER.bgK.gX, qg.aER.bgK.gY, qg.aER.bgK.pl, qg.aER.bgK.pm, false));
            }
        }
    };
    @dm
    public final dk<dz> Qm = dz2 -> {
        dz2.setSneak(false);
        dz2.setJump(true);
    };
    @dm
    public final dk<ei> Qn = ei2 -> {
        if (qg.aER.bgK.aO && !qg.aER.bgK.isUsingItem()) {
            qg.aER.bgK.jump();
        }
    };

    public qg(String string, mh mh2) {
        super(string, mh2);
    }
}

