/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.NumberValue;

public class MatrixMode
extends Mode<Speed> {
    private final NumberValue Qj = new NumberValue("Timer Boost (on sneak)", this, (Number)30, (Number)1, (Number)100, (Number)0.1);
    private int PR = 0;
    @EventLink
    public final Listener<JumpEvent> Qk = jumpEvent -> ++this.PR;
    @EventLink
    public final Listener<StrafeEvent> Ql = strafeEvent -> {
        boolean bl2;
        boolean bl3 = MatrixMode.aER.bgK.gX % 0.015625 == 0.0;
        boolean bl4 = bl2 = aii.speed() < 0.2;
        if (bl3 || bl2) {
            aii.strafe();
        }
        if (MatrixMode.aER.bgK.isUsingItem()) {
            // empty if block
        }
        if (aii.speed() < 0.195 && !MatrixMode.aER.bgK.isUsingItem()) {
            aii.strafe(0.195);
        }
        if (MatrixMode.aER.bgK.aO) {
            MatrixMode.aER.bgK.ud *= 1.001;
            MatrixMode.aER.bgK.uf *= 1.001;
            aii.strafe();
        }
        if (MatrixMode.aER.bgK.ae > 1) {
            MatrixMode.aER.bgK.ue -= 0.00348;
        }
        if (MatrixMode.aER.bgK.tR == 1) {
            aii.partialStrafePercent(65.0);
        }
        if (aik.ae(MatrixMode.aER.bgK.ue)) {
            aii.partialStrafePercent(65.0);
        }
        if (MatrixMode.aER.bgK.ae < 12) {
            aii.strafe();
        }
        aii.useDiagonalSpeed();
        if (MatrixMode.aER.aIY.chr.Re()) {
            this.PR = 0;
            aii.strafe(0.07);
            MatrixMode.aER.bgC.dAp = ((Number)this.Qj.wD()).floatValue();
        } else {
            ++this.PR;
            if (this.PR == 1) {
                ahn.n(new h(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX, MatrixMode.aER.bgK.gY, MatrixMode.aER.bgK.pl, MatrixMode.aER.bgK.pm, false));
                ahn.n(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX, MatrixMode.aER.bgK.gY, false));
                ahn.n(new h(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX, MatrixMode.aER.bgK.gY, MatrixMode.aER.bgK.pl, MatrixMode.aER.bgK.pm, false));
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Qm = moveInputEvent -> {
        moveInputEvent.setSneak(false);
        moveInputEvent.setJump(true);
    };
    @EventLink
    public final Listener<PreMotionEvent> Qn = preMotionEvent -> {
        if (MatrixMode.aER.bgK.aO && !MatrixMode.aER.bgK.isUsingItem()) {
            MatrixMode.aER.bgK.jump();
        }
    };

    public MatrixMode(String string, Speed speed) {
        super(string, speed);
    }
}

