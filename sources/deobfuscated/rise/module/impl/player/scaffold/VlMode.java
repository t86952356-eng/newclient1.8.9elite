/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VlMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> ajX = preMotionEvent -> {
        if (VlMode.aER.bgK.aO) {
            VlMode.aER.bgK.ue = 0.0;
            aii.strafe(0.5);
            if (VlMode.aER.bgK.a(a.dgw)) {
                aii.strafe(0.06 * (double)(1 + VlMode.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> ajY = strafeEvent -> {
        if (VlMode.aER.bgK.aO) {
            strafeEvent.setSpeed(0.61);
            if (VlMode.aER.bgK.a(a.dgw)) {
                aii.strafe(0.06 * (double)(1 + VlMode.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        } else if (VlMode.aER.bgK.ue < 0.77) {
            strafeEvent.setSpeed(0.4);
            if (VlMode.aER.bgK.a(a.dgw)) {
                aii.strafe(0.01 * (double)(1 + VlMode.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        }
    };

    public VlMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

