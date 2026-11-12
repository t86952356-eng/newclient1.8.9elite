/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.teleport;

import hackclient.rise.afl;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Teleport;

public final class WatchdogBedWarsMode
extends Mode<Teleport> {
    public da Jr = new da(0.0, 0.0, 0.0);
    @EventLink
    public final Listener<PreMotionEvent> SK = preMotionEvent -> {
        preMotionEvent.setPosY(this.Jr.dAH);
        preMotionEvent.setPosX(this.Jr.dAG);
        preMotionEvent.setPosZ(this.Jr.dAI);
    };

    public WatchdogBedWarsMode(String string, Teleport teleport) {
        super(string, teleport);
    }

    @Override
    public void onEnable() {
        this.Jr = new da(WatchdogBedWarsMode.aER.bgK.gW, WatchdogBedWarsMode.aER.bgK.gX, WatchdogBedWarsMode.aER.bgK.gY);
        afl.b("Die -> Fly to where you want to teleport -> Toggle", new Object[0]);
    }
}

