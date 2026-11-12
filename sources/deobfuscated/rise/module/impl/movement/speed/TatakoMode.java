/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import hackclient.rise.bs;
import hackclient.rise.cb;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.util.math.Vector2f;

public class TatakoMode
extends Mode<Speed> {
    public da Jr = new da(0.0, 0.0, 0.0);
    int dE = 0;
    float jp = 0.0f;
    float jq = 0.0f;
    @EventLink(cH=3)
    Listener<MoveInputEvent> yv = moveInputEvent -> {
        this.jp = moveInputEvent.getForward();
        this.jq = moveInputEvent.getStrafe();
    };
    @EventLink
    public final Listener<StrafeEvent> QJ = strafeEvent -> {
        double d2;
        if (aii.isMoving() && TatakoMode.aER.bgK.aO) {
            TatakoMode.aER.bgK.jump();
            ++this.dE;
        }
        if (TatakoMode.aER.bgK.aO) {
            aii.moveFlying(0.005);
            aii.partialStrafePercent(95.0);
        }
        if (TatakoMode.aER.bgK.tR == 1) {
            aii.partialStrafePercent(60.0);
        }
        if (TatakoMode.aER.bgK.tR == 2) {
            aii.partialStrafePercent(50.0);
        } else {
            aii.partialStrafePercent(1.0);
        }
        if (TatakoMode.aER.bgK.tR == 1) {
            TatakoMode.aER.bgK.ue = aii.predictedMotion(TatakoMode.aER.bgK.ue + 0.12, 2);
        }
        if ((d2 = Math.hypot(TatakoMode.aER.bgK.ud - (TatakoMode.aER.bgK.csh - TatakoMode.aER.bgK.csk), TatakoMode.aER.bgK.uf - (TatakoMode.aER.bgK.csj - TatakoMode.aER.bgK.csm))) < 0.005) {
            aii.strafe();
        }
        aii.moveFlying(8.0E-4);
        aii.preventDiagonalSpeed();
    };
    @EventLink(cH=1)
    Listener<PreUpdateEvent> dq = preUpdateEvent -> bs.a(new Vector2f((float)Math.toDegrees(aii.g(this.jp, this.jq)), TatakoMode.aER.bgK.pm), 10.0, cb.gG);

    public TatakoMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        this.dE = 0;
    }
}

