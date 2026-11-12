/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eq;
import hackclient.rise.fh;
import hackclient.rise.fi;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;

public class ao
extends am {
    @dm(cH=0)
    public final dk<fi> bC = fi2 -> {
        if (aER == null || ao.aER.bgF == null || fi2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k && !((k)aj2).yl().h(new akd(-1.0, -1.0, -1.0))) {
            ao.aER.bgK.cst = 0;
        }
    };
    @dm(cH=0)
    public final dk<eq> bD = eq2 -> {
        ao.aER.bgK.aY = 0;
    };
    @dm(cH=0)
    public final dk<fh> bE = fh2 -> {
        if (aER == null || ao.aER.bgF == null || fh2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            c c2 = ao.aER.bgF.cn(t2.getEntityID());
            if (c2 == null) {
                return;
            }
            c2.csu = (double)t2.dcR / 8000.0;
            c2.csv = (double)t2.dcS / 8000.0;
            c2.csw = (double)t2.dcT / 8000.0;
            c2.ae = 0;
            if ((double)t2.dcS / 8000.0 > 0.1 && Math.hypot((double)t2.dcT / 8000.0, (double)t2.dcR / 8000.0) > 0.2) {
                c2.css = 0;
            }
        } else if (aj2 instanceof i) {
            ao.aER.bgK.Zz = 0;
        }
    };
}

