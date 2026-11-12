/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import hackclient.rise.aks;
import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.ModeValue;

public class VerusMode
extends Mode<Flight> {
    private final ModeValue IE = new ModeValue("Sub-Mode", this).a(new Mode[]{new aks("Fast")}).co("Fast");
    private int hV = 0;
    @EventLink
    public final Listener<PreMotionEvent> IF = preMotionEvent -> {
        if (((Mode)this.IE.wD()).getName().equals("Fast") && VerusMode.aER.aIY.chq.Re() && VerusMode.aER.bgK.aRg % 2 == 0) {
            VerusMode.aER.bgK.ue = 0.42f;
        }
        ++this.hV;
    };
    @EventLink
    public final Listener<MoveEvent> IG = moveEvent -> {
        if (((Mode)this.IE.wD()).getName().equals("Fast")) {
            if (VerusMode.aER.bgK.aO && this.hV % 14 == 0) {
                moveEvent.setPosY(0.42f);
                aii.strafe(0.69);
                VerusMode.aER.bgK.ue = -(VerusMode.aER.bgK.gX - Math.floor(VerusMode.aER.bgK.gX));
            } else if (VerusMode.aER.bgK.aO) {
                aii.strafe(1.01 + aii.speedPotionAmp(0.15));
            } else {
                aii.strafe(0.41 + aii.speedPotionAmp(0.05));
            }
            VerusMode.aER.bgK.setSprinting(true);
            VerusMode.aER.bgK.bkD = true;
        }
        ++this.hV;
    };
    @EventLink
    public final Listener<es> IH = es2 -> {
        if (((Mode)this.IE.wD()).getName().equals("Fast") && (es2.df() instanceof BlockAir && !VerusMode.aER.aIY.chr.Re() || VerusMode.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < VerusMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> II = moveInputEvent -> moveInputEvent.setSneak(false);

    public VerusMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

