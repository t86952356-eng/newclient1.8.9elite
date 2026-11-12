/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;
import net.minecraft.network.play.client.k;

public class vx
extends akg<tn> {
    @dm
    public final dk<ei> akM = ei2 -> {
        if (vx.aER.aIY.chq.Re() && aik.ay(2)) {
            ahn.n(new k(null));
            if (vx.aER.bgK.gX % 1.0 <= 0.00153598) {
                vx.aER.bgK.setPosition(vx.aER.bgK.gW, Math.floor(vx.aER.bgK.gX), vx.aER.bgK.gY);
                vx.aER.bgK.ue = 0.42f;
            } else if (vx.aER.bgK.gX % 1.0 < 0.1 && vx.aER.bgK.tR != 0) {
                vx.aER.bgK.ue = 0.0;
                vx.aER.bgK.setPosition(vx.aER.bgK.gW, Math.floor(vx.aER.bgK.gX), vx.aER.bgK.gY);
            }
        }
    };

    public vx(String string, tn tn2) {
        super(string, tn2);
    }
}

