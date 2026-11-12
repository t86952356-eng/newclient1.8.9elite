/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.fi;
import hackclient.rise.mh;
import net.minecraft.network.play.client.n;
import net.minecraft.potion.a;

public class qa
extends akg<mh> {
    private boolean LK;
    private double LL;
    @dm
    public final dk<eo> Pm = eo2 -> {
        double d2 = aii.getAllowedHorizontalDistance();
        boolean bl2 = qa.aER.bgK.a(a.dgw);
        if (aii.isMoving()) {
            switch (qa.aER.bgK.tR) {
                case 0: {
                    qa.aER.bgK.ue = aii.jumpBoostMotion(0.42f);
                    this.LL = d2 * (bl2 ? 1.4 : 2.15);
                    break;
                }
                case 1: {
                    this.LL -= 0.8 * (this.LL - d2);
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            this.LK = false;
        } else if (!this.LK) {
            this.LL = 0.0;
            this.LK = true;
            this.LL = aii.getAllowedHorizontalDistance();
        }
        if (qa.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        eo2.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @dm
    public final dk<fd> Pn = fd2 -> {
        this.LL = 0.0;
    };
    @dm
    public final dk<ei> Po = ei2 -> {
        if (!aii.isMoving()) {
            ei2.setPosX(ei2.getPosX() + (Math.random() - 0.5) / 3.0);
            ei2.setPosZ(ei2.getPosZ() + (Math.random() - 0.5) / 3.0);
        }
    };
    @dm
    public final dk<fi> Pp = fi2 -> {
        if (fi2.dq() instanceof n) {
            // empty if block
        }
    };

    public qa(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }
}

