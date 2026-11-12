/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.jg;

public class kd
extends akg<jg> {
    boolean enabled;
    @dm
    public final dk<ei> yo = ei2 -> {
        if (kd.aER.bgK.aRg > 20 && kd.aER.bgK.aRg <= 40 && kd.aER.bgK.aO) {
            this.enabled = true;
        } else if (kd.aER.bgK.aRg == 100) {
            this.enabled = false;
        }
        if (this.enabled) {
            ei2.setOnGround(true);
            ei2.setPosX(kd.aER.bgK.gW - 0.1 * (double)(kd.aER.bgK.aRg % 2 == 0 ? 1 : -1));
            ei2.setPosZ(kd.aER.bgK.gY - 0.1 * (double)(kd.aER.bgK.aRg % 2 == 0 ? 1 : -1));
            ei2.setPosY(aii.roundToGround(kd.aER.bgK.gX + 1.0));
        }
    };
    @dm
    public final dk<fd> yp = fd2 -> {
        this.enabled = false;
    };
    @dm
    public final dk<dz> yq = dz2 -> {
        if (this.enabled) {
            dz2.setForward(0.0f);
            dz2.setStrafe(0.0f);
            dz2.setJump(false);
        }
    };

    public kd(String string, jg jg2) {
        super(string, jg2);
    }
}

