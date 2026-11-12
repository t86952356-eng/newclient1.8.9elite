/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.criticals;

import hackclient.rise.aii;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.Criticals;
import rise.value.NumberValue;

public final class WatchdogMode
extends Mode<Criticals> {
    private final NumberValue rT = new NumberValue("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)50);
    private final double[] rU = new double[]{1.0E-6, aii.predictedMotion(0.03125, 1)};
    private final a rV = new a();
    public static boolean gD;
    public static boolean pw;
    private int hV;
    private int rW;
    private int rX;
    @EventLink
    public final Listener<StrafeEvent> rY = strafeEvent -> {};
    @EventLink
    public final Listener<PreMotionEvent> rZ = preMotionEvent -> {
        if (WatchdogMode.aER.bgK.aO && pw) {
            WatchdogMode.aER.bgK.crP = true;
            WatchdogMode.aER.bgK.cso = 0.1f;
            ++this.hV;
            this.rW = 0;
            if (this.hV > 2) {
                ++this.rW;
            }
            switch (this.hV) {
                case 1: {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + 0.001);
                    break;
                }
                case 2: {
                    pw = false;
                }
            }
            preMotionEvent.setOnGround(false);
            if (this.hV > 4) {
                WatchdogMode.aER.bgK.cso = 0.6f;
            }
            if (WatchdogMode.aER.bgK.aO && this.hV < 6) {
                WatchdogMode.aER.bgK.crP = true;
            }
            if (this.hV > 6) {
                WatchdogMode.aER.bgK.crP = false;
            }
        } else {
            ++this.rW;
            if (WatchdogMode.aER.bgK.csW > 4 || this.rW > 4) {
                WatchdogMode.aER.bgK.cso = 0.6f;
            }
            WatchdogMode.aER.bgK.crP = this.rW < 5 && WatchdogMode.aER.bgK.aO && this.hV < 6;
            pw = false;
            this.hV = 0;
        }
    };
    @EventLink
    public final Listener<AttackEvent> sa = attackEvent -> {
        if (WatchdogMode.aER.bgK.aO && !WatchdogMode.aER.bgK.isOnLadder() && this.rV.T(((Number)this.rT.wD()).longValue())) {
            WatchdogMode.aER.bgK.E(attackEvent.dc());
            this.rV.aX();
            pw = true;
        }
    };
    @EventLink(cH=4)
    public final Listener<JumpEvent> sb = jumpEvent -> {
        if (this.hV <= 4 && this.rW <= 4 && WatchdogMode.aER.bgK.crx > 2) {
            jumpEvent.cF();
        }
    };

    public WatchdogMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

