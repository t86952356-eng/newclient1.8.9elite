/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.mh;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

public class qi
extends akg<mh> {
    private boolean LK;
    private double LL;
    private final akq Qw = new akq("Jump Motion", this, (Number)0.4, (Number)0.4, (Number)0.42, (Number)0.01);
    private final akq Qx = new akq("Ground Speed", this, (Number)1.75, (Number)0.1, (Number)2.5, (Number)0.05);
    private final akq Qy = new akq("Bunny Slope", this, (Number)0.66, (Number)0, (Number)1, (Number)0.01);
    private final akq Qz = new akq("Timer", this, (Number)1, (Number)0.1, (Number)10, (Number)0.05);
    private final aki QA = new aki("Damage Boost", (akg<?>)this, (Boolean)true);
    private final aki QB = new aki("Custom Boost", (akg<?>)this, (Boolean)false);
    private final akq QC = new akq("Boost Speed", this, (Number)0.8, (Number)0.1, (Number)9.5, (Number)0.1);
    private final aki QD = new aki("Low Hop", (akg<?>)this, (Boolean)false);
    private final aki QE = new aki("Y-port Hop", (akg<?>)this, (Boolean)false);
    private final akq QF = new akq("Hurt Time", this, (Number)6, (Number)1, (Number)10, (Number)1);
    @dm
    public final dk<fh> QG = fh2 -> {
        t t2;
        if (!((Boolean)this.QA.wD()).booleanValue()) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == qi.aER.bgK.getEntityId()) {
            this.LL = Math.hypot((double)t2.dcR / 8000.0, (double)t2.dcT / 8000.0);
        }
    };
    @dm
    public final dk<eo> QH = eo2 -> {
        if (((Boolean)this.QD.wD()).booleanValue() && qi.aER.bgK.tR == 4) {
            qi.aER.bgK.ue = -0.09800000190734864;
        }
        if (((Boolean)this.QE.wD()).booleanValue() && qi.aER.bgK.tR == 5 && Math.abs(qi.aER.bgK.ue - 0.09800000190734864) < 0.12) {
            qi.aER.bgK.ue = -0.09800000190734864;
        }
        if (((Boolean)this.QB.wD()).booleanValue() && qi.aER.bgK.css <= ((Number)this.QF.wD()).intValue()) {
            this.LL = ((Number)this.QC.wD()).doubleValue();
        }
        double d2 = aii.getAllowedHorizontalDistance();
        if (aii.isMoving()) {
            switch (qi.aER.bgK.tR) {
                case 0: {
                    float f2 = ((Number)this.Qw.wD()).floatValue();
                    float f3 = qi.aER.bgK.crR ? 0.42f : (f2 == 0.4f ? f2 : 0.42f);
                    qi.aER.bgK.ue = aii.jumpBoostMotion(f3);
                    this.LL = d2 * ((Number)this.Qx.wD()).doubleValue();
                    break;
                }
                case 1: {
                    this.LL -= ((Number)this.Qy.wD()).doubleValue() * (this.LL - d2);
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            qi.aER.bgC.dAp = ((Number)this.Qz.wD()).floatValue();
            this.LK = false;
        } else if (!this.LK) {
            this.LL = aii.getAllowedHorizontalDistance();
            qi.aER.bgC.dAp = 1.0f;
            this.LK = true;
        }
        if (qi.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        eo2.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @dm
    public final dk<fd> QI = fd2 -> {
        this.LL = 0.0;
    };

    public qi(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }
}

