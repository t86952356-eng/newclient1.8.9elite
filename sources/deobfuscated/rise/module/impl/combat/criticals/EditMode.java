/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.criticals;

import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Criticals;
import rise.value.NumberValue;

public final class EditMode
extends Mode<Criticals> {
    private final NumberValue rE = new NumberValue("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)50);
    private final double[] rF = new double[]{5.0E-4, 1.0E-4};
    private final a rG = new a();
    private boolean pw;
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> rH = preMotionEvent -> {
        if (EditMode.aER.bgK.aO && this.pw) {
            ++this.hV;
            switch (this.hV) {
                case 1: {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + this.rF[0]);
                    break;
                }
                case 2: {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + this.rF[1]);
                    this.pw = false;
                }
            }
            preMotionEvent.setOnGround(false);
        } else {
            this.pw = false;
            this.hV = 0;
        }
    };
    @EventLink
    public final Listener<AttackEvent> rI = attackEvent -> {
        if (EditMode.aER.bgK.aO && !EditMode.aER.bgK.isOnLadder() && this.rG.T(((Number)this.rE.wD()).longValue())) {
            EditMode.aER.bgK.E(attackEvent.dc());
            this.rG.aX();
            this.pw = true;
        }
    };

    public EditMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

