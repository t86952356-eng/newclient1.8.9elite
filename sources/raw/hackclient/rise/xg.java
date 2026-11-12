/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abs;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

@gl(aliases={"module.render.hurtcamera.name"}, description="module.render.hurtcamera.description", category=gj.RENDER)
public final class xg
extends gi {
    public final akq aoC = new akq("Intensity", this, (Number)1, (Number)0, (Number)1, (Number)0.1);
    @dm
    public final dk<fh> aoD = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == xg.aER.bgK.getEntityId()) {
            double d2 = (double)t2.dcR / 8000.0;
            double d3 = (double)t2.dcT / 8000.0;
            xg.aER.bgK.cuu = (float)(bt.y(d2, d3) * 180.0 / abs.aHM - (double)xg.aER.bgK.pl);
        }
    };

    @Override
    public void onDisable() {
        xg.aER.bgK.cuu = 0.0f;
    }
}

