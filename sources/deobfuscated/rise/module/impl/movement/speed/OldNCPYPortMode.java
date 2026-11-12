/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import net.minecraft.entity.c;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;

public class OldNCPYPortMode
extends Mode<Speed> {
    public final BooleanValue QO = new BooleanValue("Smooth Camera", (Mode<?>)this, (Boolean)false);
    private boolean LK;
    private double LL;
    private boolean HJ;
    private double QP;
    private int FX;
    private double QQ;
    private final double QR = 0.2873;
    @EventLink
    public final Listener<PreMotionEvent> QS = preMotionEvent -> {
        double d2 = OldNCPYPortMode.aER.bgK.gW - OldNCPYPortMode.aER.bgK.csh;
        double d3 = OldNCPYPortMode.aER.bgK.gY - OldNCPYPortMode.aER.bgK.csj;
        this.QQ = Math.sqrt(d2 * d2 + d3 * d3);
        if (this.FX == 3) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 0.4);
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> QT = moveInputEvent -> moveInputEvent.setJump(false);
    @EventLink
    public final Listener<StrafeEvent> QU = strafeEvent -> {
        if (!aii.isMoving()) {
            // empty if block
        }
        switch (this.FX) {
            case 2: {
                this.LL *= 2.14;
                this.FX = 3;
                break;
            }
            case 3: {
                this.FX = 2;
                double d2 = 0.66 * (this.QQ - 0.2873);
                this.LL = this.QQ - d2;
                break;
            }
            default: {
                if (OldNCPYPortMode.aER.bgF.a((c)OldNCPYPortMode.aER.bgK, OldNCPYPortMode.aER.bgK.Us().ae(0.0, OldNCPYPortMode.aER.bgK.ue, 0.0)).size() > 0 || OldNCPYPortMode.aER.bgK.crW) {
                    this.FX = 1;
                }
                this.LL = this.QQ - this.QQ / 159.0;
            }
        }
        if (OldNCPYPortMode.aER.bgK.crR) {
            this.LL = 0.2873;
        }
        if (OldNCPYPortMode.aER.bgK.tR == 1 && OldNCPYPortMode.aER.bgK.Zz > 2) {
            this.LL = 0.3873;
        }
        if (!OldNCPYPortMode.aER.bgK.aO) {
            ++this.FX;
        }
        strafeEvent.setSpeed(this.LL);
        aii.preventDiagonalSpeed();
    };
    @EventLink
    public final Listener<MoveInputEvent> QV = moveInputEvent -> moveInputEvent.setJump(false);
    @EventLink
    public final Listener<JumpEvent> QW = jumpEvent -> jumpEvent.setJumpMotion(0.4f);

    public OldNCPYPortMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }

    @Override
    public void onEnable() {
        this.FX = 2;
        this.LL = 0.2873;
        this.QQ = 0.0;
    }
}

