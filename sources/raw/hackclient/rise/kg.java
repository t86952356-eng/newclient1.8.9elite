/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bb;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.fs;
import hackclient.rise.jg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import rip.vantage.commons.util.time.a;

public class kg
extends akg<jg> {
    private final aki yw = new aki("Reset On World Change", (akg<?>)this, (Boolean)false);
    private final aki yx = new aki("Force low timer when Balance is below 0", (akg<?>)this, (Boolean)false);
    private final aki yy = new aki("Display", (akg<?>)this, (Boolean)false);
    private final aki yz = new aki("Pulse", (akg<?>)this, (Boolean)false);
    private final aki yA = new aki("Hypixel", (akg<?>)this, (Boolean)false);
    private final aki yB = new aki("Only Still", (akg<?>)this, (Boolean)false);
    private double yC = 0.0;
    private final a yD = new a();
    private final a yE = new a();
    @dm
    public final dk<fi> yF = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            e e2 = (e)aj2;
            if (!(e2.afV() || e2.isMoving() || bb.aW() || ((Boolean)this.yB.wD()).booleanValue() && (kg.aER.bgK.gW != kg.aER.bgK.csh || kg.aER.bgK.gX != kg.aER.bgK.csi || kg.aER.bgK.gY != kg.aER.bgK.csj))) {
                fi2.cF();
            }
            if (!fi2.isCancelled() || bc.cR) {
                this.yC -= 50.0;
            }
            this.yC += (double)this.yD.aKM();
            this.yD.aX();
        }
    };
    @dm(cH=0)
    public final dk<ej> yG = ej2 -> {
        if (((Boolean)this.yA.wD()).booleanValue()) {
            bm.a(14000, true, false, false, false);
        }
    };
    @dm
    public final dk<ei> yH = ei2 -> {
        if (kg.aER.bgK.aRg % 20 == 0 && ((Boolean)this.yy.wD()).booleanValue()) {
            afl.b("Balance: " + this.yC, new Object[0]);
        }
        if (((Boolean)this.yz.wD()).booleanValue() && kg.aER.bgC.dAp > 1.0f) {
            bc.cR = true;
            if (this.yE.T(450L)) {
                this.yE.aX();
                bc.dispatch();
            }
        }
    };
    @dm
    public final dk<fg> yI = fg2 -> {
        if (((Boolean)this.yw.wD()).booleanValue()) {
            this.aX();
            this.yC = 0.0;
        }
    };
    @dm
    public final dk<fs> yJ = fs2 -> {
        if (((Boolean)this.yx.wD()).booleanValue() && this.yC < 200.0) {
            kg.aER.bgC.dAp = this.yC < 0.0 ? 0.5f : 1.0f;
        }
    };

    public kg(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onEnable() {
        this.aX();
    }

    @Override
    public void onDisable() {
        bc.cR = false;
    }

    private void aX() {
        this.yC = 0.0;
        this.yD.aX();
    }
}

