/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.mh;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;

public final class iu
extends akg<hf> {
    private final akq uN = new akq("Horizontal", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final akq uO = new akq("Vertical", this, (Number)0, (Number)0, (Number)100, (Number)1);
    @dm
    public final dk<fh> uP = fh2 -> {
        aj<a> aj2;
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !iu.aER.bgK.cup || fh2.isCancelled() || this.e(lw.class).isEnabled() || this.e(lz.class).isEnabled()) {
            return;
        }
        aj<?> aj3 = fh2.dq();
        double d2 = ((Number)this.uN.wD()).doubleValue();
        double d3 = ((Number)this.uO.wD()).doubleValue();
        if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == iu.aER.bgK.getEntityId()) {
            if (!this.e(mh.class).isEnabled() || iu.aER.bgK.tR <= 0 || !(aii.speed() < Math.hypot((double)((t)aj2).agN() / 8000.0, (double)((t)aj2).agP() / 8000.0))) {
                if (!iu.aER.bgK.aO || this.e(mh.class).isEnabled()) {
                    afl.b("no boost", new Object[0]);
                    fh2.cF();
                } else if (!this.e(mh.class).isEnabled()) {
                    iu.aER.bgK.ue = (double)((t)aj2).agO() / 8000.0;
                    fh2.cF();
                }
            }
            fh2.e(aj2);
        }
        if (aj3 instanceof ar) {
            aj2 = (ar)aj3;
            if (d2 == 0.0 && d3 == 0.0) {
                fh2.cF();
                return;
            }
            ((ar)aj2).gW *= d2 / 100.0;
            ((ar)aj2).gX *= d3 / 100.0;
            ((ar)aj2).gY *= d2 / 100.0;
            fh2.e(aj2);
        }
    };

    public iu(String string, hf hf2) {
        super(string, hf2);
    }
}

