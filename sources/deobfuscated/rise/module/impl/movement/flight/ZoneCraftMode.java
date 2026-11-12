/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import hackclient.rise.cg;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class ZoneCraftMode
extends Mode<Flight> {
    public da Jr = new da(0.0, 0.0, 0.0);
    @EventLink
    public final Listener<PreMotionEvent> Js = preMotionEvent -> {
        preMotionEvent.setPosX(this.Jr.dAG);
        preMotionEvent.setPosY(this.Jr.dAH);
        preMotionEvent.setPosZ(this.Jr.dAI);
        preMotionEvent.setOnGround(true);
    };
    @EventLink
    public final Listener<StrafeEvent> Jt = strafeEvent -> {
        float f2 = 3.0f;
        strafeEvent.setSpeed(3.0);
        ZoneCraftMode.aER.bgK.ue = 0.0;
    };

    public ZoneCraftMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        if (!ZoneCraftMode.aER.bgK.aO) {
            this.toggle();
        }
        cg.e("Flight", "This feature is only enabled for developers atm");
        this.Jr = new da(ZoneCraftMode.aER.bgK.gW, ZoneCraftMode.aER.bgK.gX, ZoneCraftMode.aER.bgK.gY);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

