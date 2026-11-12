/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.aik;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.AntiVoid;
import rise.value.NumberValue;

public class PositionMode
extends Mode<AntiVoid> {
    private final NumberValue air = new NumberValue("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> ais = preMotionEvent -> {
        if (PositionMode.aER.bgK.csf > ((Number)this.air.wD()).floatValue() && !aik.vw()) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + (double)PositionMode.aER.bgK.csf);
        }
    };

    public PositionMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

