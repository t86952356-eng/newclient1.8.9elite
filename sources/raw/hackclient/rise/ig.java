/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bb;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.hf;
import java.util.List;
import net.minecraft.entity.r;

public final class ig
extends akg<hf> {
    private boolean gD;
    @dm
    public final dk<ei> sx = ei2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ig.aER.bgK.cup) {
            return;
        }
        List<r> list = bv.f(7.0);
        if (ig.aER.bgK.aO && ig.aER.bgK.cus > 0 && !bb.a(false, true, false, false, false)) {
            ig.aER.bgK.ud *= 0.6;
            ig.aER.bgK.uf *= 0.6;
        }
        this.gD = false;
    };
    @dm
    public final dk<dz> sy = dz2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ig.aER.bgK.cup) {
            return;
        }
        if (this.gD) {
            dz2.setJump(true);
        }
    };

    public ig(String string, hf hf2) {
        super(string, hf2);
    }
}

