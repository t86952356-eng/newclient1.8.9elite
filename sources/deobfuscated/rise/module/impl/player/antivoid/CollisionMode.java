/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.aik;
import hackclient.rise.bd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.AntiVoid;
import rise.value.NumberValue;

public class CollisionMode
extends Mode<AntiVoid> {
    private final NumberValue ain = new NumberValue("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> aio = preMotionEvent -> {
        if (bd.cY > (float)((Number)this.ain.wD()).intValue() && !aik.vw() && CollisionMode.aER.bgK.gX + CollisionMode.aER.bgK.ue < Math.floor(CollisionMode.aER.bgK.gX)) {
            CollisionMode.aER.bgK.ue = Math.floor(CollisionMode.aER.bgK.gX) - CollisionMode.aER.bgK.gX;
            if (CollisionMode.aER.bgK.ue == 0.0) {
                CollisionMode.aER.bgK.aO = true;
                preMotionEvent.setOnGround(true);
            }
        }
    };

    public CollisionMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

