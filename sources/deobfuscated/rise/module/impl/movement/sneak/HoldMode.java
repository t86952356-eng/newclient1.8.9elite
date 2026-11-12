/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.movement.sneak;

import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Sneak;

public class HoldMode
extends Mode<Sneak> {
    @EventLink
    public final Listener<PreMotionEvent> Pi = preMotionEvent -> HoldMode.aER.aIY.chr.ay(true);

    public HoldMode(String string, Sneak sneak) {
        super(string, sneak);
    }

    @Override
    public void onDisable() {
        HoldMode.aER.aIY.chr.ay(Keyboard.isKeyDown((int)HoldMode.aER.aIY.chr.cO()));
    }
}

