/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.bs;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VjMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> ajV = preMotionEvent -> {
        if (Math.abs(bt.bN(VjMode.aER.bgK.pl) - bt.bN(bs.fk.x)) > 90.0f) {
            VjMode.aER.aIY.chs.ay(false);
            VjMode.aER.bgK.setSprinting(false);
        }
    };

    public VjMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

