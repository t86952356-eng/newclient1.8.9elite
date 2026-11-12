/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.bc;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.lw;
import net.minecraft.network.play.client.f;

public class nd
extends akg<lw> {
    private boolean Gv;
    private int hV;
    @dm
    public final dk<ei> Gz = ei2 -> {
        ++this.hV;
        if (!nd.aER.bgK.aO) {
            return;
        }
        aii.stop();
        if (this.hV == 1 && aik.p(0.0, -2.5, 0.0).isFullBlock()) {
            nd.aER.bgC.dAp = 0.1f;
            bc.cR = true;
            ahn.m(new f(nd.aER.bgK.gW, nd.aER.bgK.gX, nd.aER.bgK.gY, true));
            ahn.m(new f(nd.aER.bgK.gW, aii.roundToGround(nd.aER.bgK.gX - (2.5 - Math.random() / 100.0)), nd.aER.bgK.gY, false));
            ahn.m(new f(nd.aER.bgK.gW, nd.aER.bgK.gX, nd.aER.bgK.gY, false));
            this.Gv = true;
            nd.aER.bgK.jump();
            aii.strafe(7.0 - Math.random() / 10.0);
        }
    };
    @dm
    public final dk<eo> GA = eo2 -> aii.strafe();
    @dm
    public final dk<fd> GB = fd2 -> {
        if (this.Gv) {
            fd2.cF();
            this.Gv = false;
        }
    };

    public nd(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.Gv = false;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        bc.cR = false;
        aii.stop();
    }
}

