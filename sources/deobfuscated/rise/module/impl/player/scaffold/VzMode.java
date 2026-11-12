/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aik;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VzMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akP = preMotionEvent -> {
        if (VzMode.aER.aIY.chq.Re() && aik.ay(1)) {
            VzMode.aER.bgK.ue = 0.8f;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> akQ = strafeEvent -> {
        if (!(VzMode.aER.bgK.ue < 0.77) || VzMode.aER.bgK.a(a.dgw)) {
            // empty if block
        }
    };

    public VzMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

