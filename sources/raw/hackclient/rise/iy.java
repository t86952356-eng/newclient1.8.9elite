/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.hf;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;

public final class iy
extends akg<hf> {
    @dm
    public final dk<fh> vb = fh2 -> {
        t t2;
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !iy.aER.bgK.cup || fh2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == iy.aER.bgK.getEntityId()) {
            fh2.cF();
            iy.aER.bgK.ue += 0.1 - Math.random() / 100.0;
        }
        if (aj2 instanceof ar) {
            fh2.cF();
            iy.aER.bgK.ue += 0.1 - Math.random() / 100.0;
        }
    };

    public iy(String string, hf hf2) {
        super(string, hf2);
    }
}

