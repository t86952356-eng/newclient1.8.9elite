/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.jg;
import hackclient.rise.tn;
import net.minecraft.network.play.client.e;

public final class vr
implements aea {
    private tn akA;
    private static final double akB = 0.001;
    private boolean akC;
    @dm(cH=3)
    public final dk<ei> akD = ei2 -> {
        if (!this.kT()) {
            this.unregister();
            return;
        }
        if (ei2.isOnGround() || vr.aER.bgK.aO) {
            if (!((Boolean)this.e(jg.class).wu.wD()).booleanValue() || !this.e(jg.class).isEnabled()) {
                if (vr.aER.bgK.aRg % 3 == 0 && vr.aER.bgK.crx > 2 && !vr.aER.aIY.chq.Re()) {
                    if (this.e(tn.class).isEnabled() && !vr.aER.aIY.chu.Re() && !vr.aER.aIY.chr.Re()) {
                        ei2.setPosY(ei2.getPosY() + 0.001);
                    }
                } else if (this.e(tn.class).isEnabled()) {
                    // empty if block
                }
            }
            this.akC = true;
        } else if (!this.akA.isEnabled()) {
            this.unregister();
        }
        if (this.e(tn.class).isEnabled() && vr.aER.aIY.chr.Rg() && vr.aER.bgK.aRg % 3 == 1) {
            vr.aER.aIY.chr.ay(false);
        }
        if (this.e(tn.class).isEnabled() && vr.aER.aIY.chr.Rg()) {
            aii.stop();
            vr.aER.bgC.dAp = 0.5f;
            ahn.m(new e(vr.aER.bgK.aO));
        }
    };
    @dm(cH=4)
    public final dk<ed> akE = ed2 -> {
        if (vr.aER.bgK.aRg % 3 == 1 && vr.aER.bgK.crx > 2 && this.e(tn.class).isEnabled()) {
            ed2.cF();
        }
    };

    public vr(tn tn2) {
        this.akA = tn2;
    }

    private void unregister() {
        a.a.e().c(this);
        this.akC = false;
    }

    private boolean kT() {
        return this.akA.isEnabled() || this.akC;
    }

    public void onEnable() {
        a.a.e().b(this);
    }
}

