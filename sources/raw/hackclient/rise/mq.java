/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

public class mq
extends akg<lw> {
    private boolean Fg;
    @dm
    public final dk<ei> Fh = ei2 -> {
        if (mq.aER.bgK.ae == 1) {
            mq.aER.bgK.uf *= 1.004;
            mq.aER.bgK.ud *= 1.004;
        }
    };
    @dm
    public final dk<eo> Fi = eo2 -> {
        if (mq.aER.bgK.tR == 20) {
            this.Fg = true;
        }
        if (mq.aER.bgK.ae > 1 && mq.aER.bgK.ae < 5) {
            mq.aER.bgK.ue += 0.0445;
        } else if (mq.aER.bgK.ae > 1 && mq.aER.bgK.tR > 11) {
            mq.aER.bgK.ue += 0.028;
        }
        if (this.Fg && mq.aER.bgK.aO) {
            this.e(lw.class).setEnabled(false);
        }
        eo2.setFriction((float)((double)eo2.getFriction() + 0.005));
        aii.useDiagonalSpeed();
        aii.strafe();
        if (mq.aER.bgK.ae < 6) {
            // empty if block
        }
    };
    @dm
    public final dk<ej> Fj = ej2 -> {};
    @dm(cH=0)
    public final dk<fh> Fk = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == mq.aER.bgK.getEntityId()) {
            mq.aER.bgK.ue = (double)t2.agO() / 8000.0;
        }
    };
    @dm
    private final dk<ez> Fl = ez2 -> {};

    public mq(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        if (mq.aER.bgK.ae < 4 && !mq.aER.bgK.aO) {
            aii.stop();
        }
        this.Fg = false;
    }

    @Override
    public void onEnable() {
        if (mq.aER.bgK.aO) {
            // empty if block
        }
    }
}

