/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aei;
import hackclient.rise.ahj;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ea;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.fr;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.entity.r;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

@gl(aliases={"module.ghost.reach.name"}, description="module.ghost.reach.description", category=gj.GHOST)
public class lh
extends gi {
    public final akj BQ = new akj("Range", this, (Number)3, (Number)4, (Number)3, (Number)6, (Number)0.01);
    private final akq BR = new akq("Buffer Decrease", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1, () -> (Boolean)this.BT.wD() == false);
    private final akq BS = new akq("Max Buffer", this, (Number)5, (Number)1, (Number)200, (Number)1, () -> (Boolean)this.BT.wD() == false);
    private final aki BT = new aki("Buffer Abuse", (gi)this, (Boolean)false);
    private int BU;
    private int BV;
    private double BN;
    @dm
    public final dk<ei> BW = ei2 -> ++this.BV;
    @dm
    public final dk<fr> BX = fr2 -> {
        double d2 = ahj.l(((Number)this.BQ.wD()).doubleValue(), this.BQ.wP().doubleValue());
        fr2.i(d2);
        if (this.gR()) {
            return;
        }
        ce ce2 = aei.a(bs.bH(), d2, fr2.dB(), lh.aER.bgK, false);
        if (ce2 != null && ce2.dzu == cf.dzz) {
            fr2.a(ce2);
        }
    };
    @dm
    public final dk<ea> BY = ea2 -> {
        lh.aER.bhc = aei.c(bs.fk, 4.5);
    };
    @dm
    public final dk<eq> BZ = eq2 -> {
        r r2 = eq2.dc();
        if (((Boolean)this.BT.wD()).booleanValue()) {
            if (aei.c((akb)bs.fk, (double)3.0).dzu != cf.dzz) {
                if ((this.BV > 9 || r2.getEntityId() != this.BU) && this.BN < (double)((Number)this.BS.wD()).intValue()) {
                    this.BN += 1.0;
                } else {
                    eq2.cF();
                }
            } else {
                this.BN = Math.max(0.0, this.BN - ((Number)this.BR.wD()).doubleValue());
            }
        } else {
            this.BN = 0.0;
        }
        this.BU = r2.getEntityId();
        this.BV = 0;
    };

    private boolean gR() {
        if (!lh.aER.bhn || lh.aER.bgR != null) {
            return false;
        }
        if (!lh.aER.aIY.chu.Re() && !lh.aER.aIY.chw.Re()) {
            return false;
        }
        ce ce2 = aei.a(new akb(lh.aER.bgK.pl, lh.aER.bgK.pm), lh.aER.bgu.Hr(), 0.0f, lh.aER.bgK, false);
        return ce2 != null && ce2.dzu == cf.dzy;
    }
}

