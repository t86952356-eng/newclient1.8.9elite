/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fi;
import hackclient.rise.go;
import hackclient.rise.mh;
import hackclient.rise.tn;

public class qf
extends akg<mh> {
    private final akp Qd = new akp("Rotation Exploit Mode", this).a(new akg[]{new aks("Off")}).a(new akg[]{new aks("Rotate (Fully Legit)")}).a(new akg[]{new aks("Speed Equivalent (Almost legit, Very hard to flag)")}).co("Speed Equivalent (Almost legit, Very hard to flag)");
    private final aki Qe = new aki("CPU SpeedUp Exploit", (akg<?>)this, (Boolean)true);
    private final aki Qf = new aki("No Jump Delay", (akg<?>)this, (Boolean)true);
    @dm(cH=1)
    public final dk<ej> Qg = ej2 -> {
        switch (((akg)this.Qd.wD()).getName()) {
            case "Rotate (Fully Legit)": {
                if (go.mB && this.e(go.class).isEnabled() || qf.aER.bgK.aO || qf.aER.aIY.chp.Re() || qf.aER.aIY.chn.Re() || qf.aER.bgK.Zz <= 5) break;
                bs.a(new akb(qf.aER.bgK.pl + 45.0f, qf.aER.bgK.pm), 10.0, cb.gH);
                break;
            }
            case "Speed Equivalent (Almost legit, Very hard to flag)": {
                aii.useDiagonalSpeed();
            }
        }
        if (((Boolean)this.Qf.wD()).booleanValue()) {
            qf.aER.bgK.cvk = 0;
        }
        if (((Boolean)this.Qe.wD()).booleanValue()) {
            qf.aER.bgC.dAp = 1.004f;
        }
    };
    @dm
    dk<fi> Qh = fi2 -> {
        boolean bl2 = qf.aER.bgK.isSprinting();
        if (!qf.aER.bgK.isSprinting() || !bl2) {
            // empty if block
        }
    };
    @dm(cH=4)
    public final dk<eo> Qi = eo2 -> {
        if (!qf.aER.bgK.crR || !this.e(tn.class).isEnabled()) {
            // empty if block
        }
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2) && qf.aER.bgK.ae > 2 && qf.aER.bgK.Zz > 2 && ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            aii.moveFlying(1.0E-5);
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().equalTo(ProtocolVersion.v1_8)) {
            // empty if block
        }
        if (qf.aER.bgK.aO && aii.isMoving() && qf.aER.aIY.chq.Re() && !qf.aER.bgK.csz) {
            qf.aER.bgK.jump();
        }
    };

    public qf(String string, mh mh2) {
        super(string, mh2);
    }
}

