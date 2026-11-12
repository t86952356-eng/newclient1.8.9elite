/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.am;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;

public class ca
extends am {
    private boolean gC = false;
    private boolean gD = false;
    @EventLink
    public final Listener<PreMotionEvent> gE = preMotionEvent -> {
        if (((Mode)this.e(Scaffold.class).agv.wD()).getName().equals("Watchdog Jump") || ((Mode)this.e(Scaffold.class).agv.wD()).getName().equals("Watchdog Fast")) {
            if (this.gD && !ca.aER.aIY.chq.Re() && this.e(Scaffold.class).isEnabled() && !this.e(Speed.class).isEnabled() && aii.isMoving()) {
                if (ca.aER.bgK.a(a.dgw)) {
                    aii.strafe(-0.1);
                } else {
                    aii.strafe(-0.1);
                }
                ca.aER.bgK.crP = true;
                bs.d(false);
                bs.a(new Vector2f((float)((double)ca.aER.bgK.pl - 99.99999999999999 + (Math.random() - 0.5) * 3.0), 86.0f), 10.0, cb.gG);
                if (!this.e(Speed.class).isEnabled()) {
                    // empty if block
                }
                this.gD = false;
                this.gC = true;
            } else if (!ca.aER.aIY.chq.Re() && this.gC && !this.e(Speed.class).isEnabled() && aii.isMoving()) {
                if (this.e(Speed.class).isEnabled()) {
                    if (ca.aER.bgK.a(a.dgw)) {
                        aii.strafe(-0.03);
                    } else {
                        aii.strafe(-0.03);
                    }
                }
                if (!this.e(Speed.class).isEnabled() && !bb.a(false, false, false, true, false)) {
                    this.e(Scaffold.class).ahh = this.e(Scaffold.class).ahh.v(0.0, -1.0, 0.0);
                }
                ca.aER.bgK.crP = true;
                this.gC = false;
            }
            if (!this.e(Scaffold.class).isEnabled() || ca.aER.bgK.Zz < 2) {
                this.gD = false;
            }
            if (ca.aER.aIY.chq.Re() && this.e(Scaffold.class).isEnabled()) {
                this.gD = true;
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> gF = strafeEvent -> {
        if (this.gD && !ca.aER.aIY.chq.Re() && this.e(Scaffold.class).isEnabled() && !this.e(Speed.class).isEnabled() && aii.isMoving()) {
            aER.AO();
        }
    };
}

