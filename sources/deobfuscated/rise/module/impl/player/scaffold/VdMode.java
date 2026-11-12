/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.player.scaffold;

import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VdMode
extends Mode<Scaffold> {
    @EventLink(cH=1)
    public final Listener<PreUpdateEvent> ajK = preUpdateEvent -> {
        if (!Keyboard.isKeyDown((int)VdMode.aER.aIY.chr.cO())) {
            return;
        }
        ((Scaffold)this.wy()).ahh = ((Scaffold)this.wy()).ahh.v(0.0, -1.0, 0.0);
    };

    public VdMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

