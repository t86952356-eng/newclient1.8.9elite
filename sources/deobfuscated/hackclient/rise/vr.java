/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import net.minecraft.network.play.client.e;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.impl.exploit.Disabler;
import rise.module.impl.player.Scaffold;
import rise.util.InstanceAccess;

public final class vr
implements InstanceAccess {
    private Scaffold akA;
    private static final double akB = 0.001;
    private boolean akC;
    @EventLink(cH=3)
    public final Listener<PreMotionEvent> akD = preMotionEvent -> {
        if (!this.kT()) {
            this.unregister();
            return;
        }
        if (preMotionEvent.isOnGround() || vr.aER.bgK.aO) {
            if (!((Boolean)this.e(Disabler.class).wu.wD()).booleanValue() || !this.e(Disabler.class).isEnabled()) {
                if (vr.aER.bgK.aRg % 3 == 0 && vr.aER.bgK.crx > 2 && !vr.aER.aIY.chq.Re()) {
                    if (this.e(Scaffold.class).isEnabled() && !vr.aER.aIY.chu.Re() && !vr.aER.aIY.chr.Re()) {
                        preMotionEvent.setPosY(preMotionEvent.getPosY() + 0.001);
                    }
                } else if (this.e(Scaffold.class).isEnabled()) {
                    // empty if block
                }
            }
            this.akC = true;
        } else if (!this.akA.isEnabled()) {
            this.unregister();
        }
        if (this.e(Scaffold.class).isEnabled() && vr.aER.aIY.chr.Rg() && vr.aER.bgK.aRg % 3 == 1) {
            vr.aER.aIY.chr.ay(false);
        }
        if (this.e(Scaffold.class).isEnabled() && vr.aER.aIY.chr.Rg()) {
            aii.stop();
            vr.aER.bgC.dAp = 0.5f;
            ahn.m(new e(vr.aER.bgK.aO));
        }
    };
    @EventLink(cH=4)
    public final Listener<JumpEvent> akE = jumpEvent -> {
        if (vr.aER.bgK.aRg % 3 == 1 && vr.aER.bgK.crx > 2 && this.e(Scaffold.class).isEnabled()) {
            jumpEvent.cF();
        }
    };

    public vr(Scaffold scaffold) {
        this.akA = scaffold;
    }

    private void unregister() {
        Client.a.e().c(this);
        this.akC = false;
    }

    private boolean kT() {
        return this.akA.isEnabled() || this.akC;
    }

    public void onEnable() {
        Client.a.e().b(this);
    }
}

