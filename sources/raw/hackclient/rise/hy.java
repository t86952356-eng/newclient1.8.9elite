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

public final class hy
extends akg<gq> {
    private final akq rO = new akq("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)1);
    private final double[] rP = new double[]{0.0625, 0.0};
    private final a rQ = new a();
    @dm
    public final dk<eq> rR = eq2 -> {
        if (this.rQ.T(((Number)this.rO.wD()).longValue()) && hy.aER.bgK.crx > 2 && hy.aER.bgK.cus != 0) {
            for (double d2 : this.rP) {
                ahn.m(new f(hy.aER.bgK.gW, hy.aER.bgK.gX + d2, hy.aER.bgK.gY, false));
            }
            hy.aER.bgK.E(eq2.dc());
            this.rQ.aX();
        }
    };

    public hy(String string, gq gq2) {
        super(string, gq2);
    }
}

