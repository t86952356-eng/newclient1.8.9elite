/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.aw;

@gl(aliases={"module.combat.lightningtracker.name"}, description="module.exploit.lightningtracker.description", category=gj.EXPLOIT)
public class jj
extends gi {
    @dm
    public final dk<fh> wY = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof aw) {
            aw aw2 = (aw)aj2;
            int n2 = (int)((float)Math.round((double)aw2.ahx() / 32.0 * 100.0) / 100.0f);
            int n3 = (int)((float)Math.round((double)aw2.ahy() / 32.0 * 100.0) / 100.0f);
            int n4 = (int)((float)Math.round((double)aw2.ahz() / 32.0 * 100.0) / 100.0f);
            if (aw2.ahA() == 1) {
                afl.b("Lightning struck at " + n2 + ", " + n3 + ", " + n4 + " (" + (int)jj.aER.bgK.getDistance(n2, n3, n4) + " blocks away)", new Object[0]);
            }
        }
    };
}

