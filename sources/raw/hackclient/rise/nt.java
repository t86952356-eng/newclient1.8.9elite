/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;
import net.minecraft.network.play.client.h;

public class nt
extends akg<lw> {
    private int hQ;
    private int hV;
    private boolean IJ;
    public final aki IK = new aki("Self Damage (May Flag More) if not fly will wait for fall damage", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<ei> IL = ei2 -> {
        if (((Boolean)this.IK.wD()).booleanValue()) {
            aii.stop();
        }
        if (nt.aER.bgK.ae == 1) {
            ahn.m(new h(nt.aER.bgK.gW, nt.aER.bgK.gX - 2.0, nt.aER.bgK.gY, nt.aER.bgK.pl, nt.aER.bgK.pm, false));
            this.IJ = true;
        }
        float f2 = 3.0f;
        if (!this.IJ) {
            return;
        }
        ++this.hQ;
        if (this.hQ < 10) {
            aii.stop();
        }
        nt.aER.bgK.ue = 1.0E-10 + (nt.aER.aIY.chq.Re() ? 0.0 : 0.0) - (nt.aER.aIY.chr.Re() ? 0.0 : 0.0);
        if (nt.aER.bgK.getDistance(nt.aER.bgK.bkg, nt.aER.bgK.bkh, nt.aER.bgK.bki) <= 9.0) {
            ei2.cF();
        } else {
            ++this.hV;
            if (this.hV >= 3) {
                aii.stop();
                ((lw)this.wy()).toggle();
            }
        }
    };
    @dm
    public final dk<eo> IM = eo2 -> {
        if (this.hQ < 10) {
            return;
        }
        if (!this.IJ) {
            return;
        }
        float f2 = 1.0f;
        eo2.setSpeed(1.0);
    };

    public nt(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        this.hV = 0;
        this.IJ = false;
        if (((Boolean)this.IK.wD()).booleanValue()) {
            aic.a(aid.aOJ, 3.42f, 1, false, false);
        } else {
            afl.b("take fall damage or turn on self damage", new Object[0]);
        }
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

