/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.settings.a;

@gl(aliases={"module.other.antiafk.name"}, description="module.other.antiafk.description", category=gj.MOVEMENT)
public final class rk
extends gi {
    private int TB;
    @dm
    public final dk<ei> TC = ei2 -> {
        a a2 = rk.aER.aIY;
        if (a2.chq.Rg() || a2.chp.Rg() || a2.chm.Rg() || a2.chn.Rg() || a2.cho.Rg()) {
            this.TB = 0;
        }
        ++this.TB;
        if (this.TB < 200) {
            return;
        }
        if (rk.aER.bgK.aRg % 5 == 0) {
            rk.aER.aIY.chp.ay(false);
            rk.aER.aIY.chn.ay(false);
            rk.aER.aIY.chq.ay(false);
        }
        if (rk.aER.bgK.aRg % 20 == 0) {
            if (rk.aER.bgK.aRg % 40 == 0) {
                rk.aER.aIY.chp.ay(true);
            } else {
                rk.aER.aIY.chn.ay(true);
            }
        }
        if (rk.aER.bgK.aRg % 100 == 0) {
            rk.aER.aIY.chq.ay(true);
        }
    };
}

