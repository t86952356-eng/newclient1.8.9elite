/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.akg;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.item.af;
import net.minecraft.network.play.client.m;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class mw
extends akg<lw> {
    @dm
    public final dk<ej> FC = ej2 -> {
        this.d(bu.class);
        bu.setSlot(ain.vM());
    };
    @dm
    public final dk<ei> FD = ei2 -> {
        if (mw.aER.aIY.chq.Re() && aik.ay(3) && mw.aER.bgK.ae > 15) {
            if (Math.abs(aii.predictedMotion(0.42f) - mw.aER.bgK.ue) < 1.0E-4) {
                ei2.setOnGround(true);
            } else {
                afl.b("Not Set", new Object[0]);
                mw.aER.bgK.ue = 0.42f;
            }
            mw.aER.bgK.ue = 0.42f;
        }
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af && aik.p(0.0, -1.0, 0.0) instanceof BlockAir) {
                ahn.m(new m());
                mw.aER.bgu.a(mw.aER.bgK, mw.aER.bgF, mw.aER.bgK.abO(), new b(mw.aER.bgK.gW, Math.floor(mw.aER.bgK.gX) - 1.0, mw.aER.bgK.gY), ao.dwr, new da(mw.aER.bgK.gW, Math.floor(mw.aER.bgK.gX) - 1.0, mw.aER.bgK.gY));
            }
        }
    };

    public mw(String string, lw lw2) {
        super(string, lw2);
    }
}

