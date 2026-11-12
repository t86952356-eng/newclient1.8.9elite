/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;

public class vt
extends akg<tn> {
    private int akG = 5;
    @dm
    public final dk<ei> akH = ei2 -> {
        if (vt.aER.aIY.chq.Re() && aik.ay(2) && !aii.isMoving()) {
            if (vt.aER.bgK.gX % 1.0 <= 0.00153598) {
                vt.aER.bgK.setPosition(vt.aER.bgK.gW, Math.floor(vt.aER.bgK.gX), vt.aER.bgK.gY);
                vt.aER.bgK.ue = 0.42f;
            } else if (vt.aER.bgK.gX % 1.0 < 0.1 && vt.aER.bgK.tR != 0) {
                vt.aER.bgK.ue = 0.0;
                vt.aER.bgK.setPosition(vt.aER.bgK.gW, Math.floor(vt.aER.bgK.gX), vt.aER.bgK.gY);
            }
        }
        if (aii.isMoving() && vt.aER.aIY.chq.Re() && vt.aER.bgK.aO) {
            vt.aER.bgK.jump();
        }
    };
    @dm
    public final dk<fi> akI = fi2 -> {
        k k2;
        aj<?> aj2 = fi2.dq();
        if (aii.isMoving() && vt.aER.bgK.ue > -0.09800000190734864 && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(vt.aER.bgK.gW, vt.aER.bgK.gX - 1.4, vt.aER.bgK.gY))) {
            vt.aER.bgK.ue = -0.09800000190734864;
        }
    };

    public vt(String string, tn tn2) {
        super(string, tn2);
    }
}

