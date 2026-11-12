/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.au;

public class ba
extends am {
    @dm
    public final dk<fh> cH = fh2 -> {
        au au2;
        double d2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof au && (d2 = ba.aER.bgK.M((au2 = (au)aj2).ahr(), au2.ahs(), au2.aht())) >= 36.0) {
            fh2.cF();
        }
    };
}

