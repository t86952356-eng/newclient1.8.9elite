/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dr;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.lc;
import hackclient.rise.lh;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

@gl(aliases={"Peircing", "Piercing"}, description="Allows attacks to raycast through blocks", category=gj.COMBAT)
public final class gz
extends gi {
    @dm
    public final dk<dr> qg = dr2 -> {
        if (gz.aER.bgK == null || gz.aER.bgF == null) {
            return;
        }
        if (gz.aER.bhc != null && gz.aER.bhc.dzu == cf.dzz) {
            return;
        }
        ce ce2 = aei.a(bs.bH(), this.gq(), this.gr(), gz.aER.bgK, true);
        if (ce2 != null && ce2.dzu == cf.dzz) {
            gz.aER.bhc = ce2;
            gz.aER.bgM = ce2.dzw;
        }
    };

    public double gq() {
        lh lh2 = this.e(lh.class);
        if (lh2 == null || !lh2.isEnabled()) {
            return 3.0;
        }
        return Math.max(((Number)lh2.BQ.wD()).doubleValue(), lh2.BQ.wP().doubleValue());
    }

    public float gr() {
        lc lc2 = this.e(lc.class);
        if (lc2 == null || !lc2.isEnabled()) {
            return 0.0f;
        }
        return ((Number)lc2.Bj.wD()).floatValue();
    }
}

