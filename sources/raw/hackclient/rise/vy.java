/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;

public class vy
extends akg<tn> {
    @dm
    public final dk<ei> akN = ei2 -> {
        if (vy.aER.aIY.chq.Re() && vy.aER.bgK.aO) {
            vy.aER.bgK.ue = 0.42f;
        }
    };
    @dm
    public final dk<fi> akO = fi2 -> {
        k k2;
        aj<?> aj2 = fi2.dq();
        if (vy.aER.bgK.ue > -0.0784000015258789 && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(vy.aER.bgK.gW, Math.floor(vy.aER.bgK.gX) - 2.0, vy.aER.bgK.gY))) {
            vy.aER.bgK.ue = -0.0784000015258789;
        }
    };

    public vy(String string, tn tn2) {
        super(string, tn2);
    }
}

