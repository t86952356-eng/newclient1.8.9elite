/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fi;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;

public class my
extends akg<lw> {
    private final akq FP = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private final aki FQ = new aki("Send Flying", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<eo> FR = eo2 -> {
        float f2 = ((Number)this.FP.wD()).floatValue();
        eo2.setSpeed(f2);
    };
    @dm
    public final dk<ei> FS = ei2 -> {
        float f2 = ((Number)this.FP.wD()).floatValue();
        my.aER.bgK.ue = -1.0E-10 + (my.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (my.aER.aIY.chr.Re() ? (double)f2 : 0.0);
        if (my.aER.bgK.getDistance(my.aER.bgK.bkg, my.aER.bgK.bkh, my.aER.bgK.bki) <= (double)(10.0f - f2) - 0.15) {
            ei2.cF();
        }
    };
    @dm
    public final dk<dz> FT = dz2 -> dz2.setSneak(false);
    @dm
    public final dk<fi> FU = fi2 -> {
        e e2;
        aj<?> aj2;
        if (!((Boolean)this.FQ.wD()).booleanValue() && (aj2 = fi2.dq()) instanceof e && !(e2 = (e)aj2).isMoving() && !bb.aW()) {
            fi2.cF();
        }
    };

    public my(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
        double d2 = my.aER.bgK.gW;
        double d3 = my.aER.bgK.gX;
        double d4 = my.aER.bgK.gY;
    }
}

