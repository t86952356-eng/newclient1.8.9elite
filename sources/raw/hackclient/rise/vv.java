/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;

public class vv
extends akg<tn> {
    @dm
    public final dk<fi> akK = fi2 -> {
        k k2;
        aj<?> aj2 = fi2.dq();
        if (vv.aER.aIY.chq.Re() && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(vv.aER.bgK.gW, vv.aER.bgK.gX - 1.4, vv.aER.bgK.gY))) {
            vv.aER.aIY.chs.ay(false);
            vv.aER.bgK.setSprinting(false);
            vv.aER.bgK.ue = 0.42f;
        }
    };

    public vv(String string, tn tn2) {
        super(string, tn2);
    }
}

