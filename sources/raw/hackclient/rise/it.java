/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bb;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.mh;
import java.util.List;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

public final class it
extends akg<hf> {
    private boolean gD;
    @dm
    public final dk<fh> uH = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == it.aER.bgK.getEntityId()) {
            this.gD = true;
        }
    };
    @dm
    public final dk<ei> uI = ei2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !it.aER.bgK.cup) {
            return;
        }
        List<r> list = bv.f(7.0);
        if (!it.aER.bgK.aO || it.aER.bgK.cus <= 0 || !bb.a(false, true, false, false, false)) {
            // empty if block
        }
        if (it.aER.bgK.ae == 1) {
            it.aER.bgK.ud *= 0.0;
            it.aER.bgK.uf *= 0.0;
        }
        if (it.aER.bgK.ae == 1 && (it.aER.bgK.cuU || this.e(mh.class).isEnabled())) {
            it.aER.bgK.ue -= 9.0;
        }
        if (it.aER.bgK.crx == 1 && it.aER.bgK.ae < 4 && aii.speed() < 0.31) {
            aii.moveFlying(0.05);
        }
    };
    @dm
    public final dk<dz> uJ = dz2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !it.aER.bgK.cup) {
            return;
        }
        if (this.gD) {
            // empty if block
        }
    };

    public it(String string, hf hf2) {
        super(string, hf2);
    }
}

