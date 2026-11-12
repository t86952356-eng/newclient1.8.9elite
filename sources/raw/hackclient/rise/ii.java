/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.hf;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;

public final class ii
extends akg<hf> {
    private final akq sD = new akq("Horizontal", this, (Number)100, (Number)0, (Number)100, (Number)1);
    private final akq sE = new akq("Vertical", this, (Number)100, (Number)0, (Number)100, (Number)1);
    private final akq sF = new akq("Buffer", this, (Number)1, (Number)1, (Number)3, (Number)1);
    private int sG;
    @dm
    public final dk<fh> sH = fh2 -> {
        aj<a> aj2;
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ii.aER.bgK.cup || fh2.isCancelled()) {
            return;
        }
        aj<?> aj3 = fh2.dq();
        double d2 = ((Number)this.sD.wD()).doubleValue();
        double d3 = ((Number)this.sE.wD()).doubleValue();
        if (aj3 instanceof t && (aj2 = (t)aj3).getEntityID() == ii.aER.bgK.getEntityId()) {
            if (this.sG < ((Number)this.sF.wD()).intValue()) {
                fh2.cF();
                ++this.sG;
                return;
            }
            fh2.e(aj2);
            this.sG = 0;
        }
        if (aj3 instanceof ar) {
            aj2 = (ar)aj3;
            if (this.sG < ((Number)this.sF.wD()).intValue()) {
                fh2.cF();
                ++this.sG;
                return;
            }
            ((ar)aj2).gW *= d2 / 100.0;
            ((ar)aj2).gX *= d3 / 100.0;
            ((ar)aj2).gY *= d2 / 100.0;
            fh2.e(aj2);
            this.sG = 0;
        }
    };

    public ii(String string, hf hf2) {
        super(string, hf2);
    }
}

