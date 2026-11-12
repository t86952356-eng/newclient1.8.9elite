/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.bb;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tn;
import net.minecraft.item.ci;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.network.play.client.k;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.player.autohead.name"}, description="module.player.autohead.description", category=gj.PLAYER)
public class tc
extends gi {
    private final akq abr = new akq("Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private final akj abs = new akj("Delay", this, (Number)500, (Number)1000, (Number)50, (Number)5000, (Number)50);
    private final a abt = new a();
    private long abu;
    @dm
    public final dk<ei> abv = ei2 -> {
        if (!this.abt.T(this.abu) || tc.aER.bgK.Wi() > 0.0f || this.e(tn.class).isEnabled()) {
            return;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            d d2;
            co co2 = tc.aER.bgK.cHV.fi(i2);
            if (co2 == null || !((d2 = co2.bP()) instanceof ci) || tc.aER.bgK.getHealth() > ((Number)this.abr.wD()).floatValue()) continue;
            this.d(bu.class);
            bu.setSlot(i2);
            if (bb.aW()) continue;
            tc.aER.bgu.Ht();
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
            this.abu = Math.round(ahj.l(((Number)this.abs.wD()).longValue(), this.abs.wP().longValue()));
            this.abt.aX();
        }
    };
}

