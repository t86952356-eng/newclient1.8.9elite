/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eq;
import hackclient.rise.gq;
import net.minecraft.network.play.client.f;
import rip.vantage.commons.util.time.a;

public final class hx
extends akg<gq> {
    private final akq rK = new akq("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)1);
    private final double[] rL = new double[]{0.42, 0.0};
    private final a rM = new a();
    @dm
    public final dk<eq> rN = eq2 -> {
        if (this.rM.T(((Number)this.rK.wD()).longValue()) && hx.aER.bgK.crx > 0) {
            for (double d2 : this.rL) {
                ahn.m(new f(hx.aER.bgK.gW, hx.aER.bgK.gX + d2, hx.aER.bgK.gY, false));
            }
            hx.aER.bgK.E(eq2.dc());
            this.rM.aX();
        }
    };

    public hx(String string, gq gq2) {
        super(string, gq2);
    }
}

