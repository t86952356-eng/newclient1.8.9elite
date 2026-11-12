/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public class nq
extends akg<lw> {
    private int It;
    private int hV;
    private boolean El;
    private final akq Iu = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private double y;
    @dm
    public final dk<fd> Iv = fd2 -> {};
    @dm
    public final dk<ei> Iw = ei2 -> {
        if (!this.El && nq.aER.bgK.aO) {
            nq.aER.bgK.jump();
        }
        if (!this.El) {
            return;
        }
        float f2 = 1.0f;
        this.y = Math.floor(nq.aER.bgK.gX);
        nq.aER.bgK.ue = 0.0 + (nq.aER.aIY.chq.Re() ? 1.0 : 0.0) - (nq.aER.aIY.chr.Re() ? 1.0 : 0.0);
        if (nq.aER.bgK.getDistance(nq.aER.bgK.bkg, nq.aER.bgK.bkh, nq.aER.bgK.bki) <= 8.5) {
            ei2.cF();
        } else {
            ++this.hV;
            if (this.hV >= 20) {
                this.El = false;
                afl.b("s", new Object[0]);
                aii.stop();
            }
        }
    };
    @dm
    public final dk<eo> Ix = eo2 -> {
        if (!this.El) {
            return;
        }
        float f2 = ((Number)this.Iu.wD()).floatValue();
        eo2.setSpeed(f2);
    };
    @dm
    public final dk<es> Iy = es2 -> {
        if (es2.df() instanceof BlockAir && !nq.aER.aIY.chr.Re() && (nq.aER.bgK.gX < this.y + 1.0 || nq.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < nq.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public nq(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
        this.hV = 0;
        this.It = 2;
        this.El = true;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

