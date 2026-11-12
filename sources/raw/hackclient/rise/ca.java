/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.am;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.mh;
import hackclient.rise.tn;
import net.minecraft.potion.a;

public class ca
extends am {
    private boolean gC = false;
    private boolean gD = false;
    @dm
    public final dk<ei> gE = ei2 -> {
        if (((akg)this.e(tn.class).agv.wD()).getName().equals("Watchdog Jump") || ((akg)this.e(tn.class).agv.wD()).getName().equals("Watchdog Fast")) {
            if (this.gD && !ca.aER.aIY.chq.Re() && this.e(tn.class).isEnabled() && !this.e(mh.class).isEnabled() && aii.isMoving()) {
                if (ca.aER.bgK.a(a.dgw)) {
                    aii.strafe(-0.1);
                } else {
                    aii.strafe(-0.1);
                }
                ca.aER.bgK.crP = true;
                bs.d(false);
                bs.a(new akb((float)((double)ca.aER.bgK.pl - 99.99999999999999 + (Math.random() - 0.5) * 3.0), 86.0f), 10.0, cb.gG);
                if (!this.e(mh.class).isEnabled()) {
                    // empty if block
                }
                this.gD = false;
                this.gC = true;
            } else if (!ca.aER.aIY.chq.Re() && this.gC && !this.e(mh.class).isEnabled() && aii.isMoving()) {
                if (this.e(mh.class).isEnabled()) {
                    if (ca.aER.bgK.a(a.dgw)) {
                        aii.strafe(-0.03);
                    } else {
                        aii.strafe(-0.03);
                    }
                }
                if (!this.e(mh.class).isEnabled() && !bb.a(false, false, false, true, false)) {
                    this.e(tn.class).ahh = this.e(tn.class).ahh.v(0.0, -1.0, 0.0);
                }
                ca.aER.bgK.crP = true;
                this.gC = false;
            }
            if (!this.e(tn.class).isEnabled() || ca.aER.bgK.Zz < 2) {
                this.gD = false;
            }
            if (ca.aER.aIY.chq.Re() && this.e(tn.class).isEnabled()) {
                this.gD = true;
            }
        }
    };
    @dm
    public final dk<eo> gF = eo2 -> {
        if (this.gD && !ca.aER.aIY.chq.Re() && this.e(tn.class).isEnabled() && !this.e(mh.class).isEnabled() && aii.isMoving()) {
            aER.AO();
        }
    };
}

