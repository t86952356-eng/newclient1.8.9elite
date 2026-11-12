/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.bb;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class CubeCraftMode
extends Mode<Flight> {
    private final NumberValue FP = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private final BooleanValue FQ = new BooleanValue("Send Flying", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<StrafeEvent> FR = strafeEvent -> {
        float f2 = ((Number)this.FP.wD()).floatValue();
        strafeEvent.setSpeed(f2);
    };
    @EventLink
    public final Listener<PreMotionEvent> FS = preMotionEvent -> {
        float f2 = ((Number)this.FP.wD()).floatValue();
        CubeCraftMode.aER.bgK.ue = -1.0E-10 + (CubeCraftMode.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (CubeCraftMode.aER.aIY.chr.Re() ? (double)f2 : 0.0);
        if (CubeCraftMode.aER.bgK.getDistance(CubeCraftMode.aER.bgK.bkg, CubeCraftMode.aER.bgK.bkh, CubeCraftMode.aER.bgK.bki) <= (double)(10.0f - f2) - 0.15) {
            preMotionEvent.cF();
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> FT = moveInputEvent -> moveInputEvent.setSneak(false);
    @EventLink
    public final Listener<PacketSendEvent> FU = packetSendEvent -> {
        e e2;
        aj<?> aj2;
        if (!((Boolean)this.FQ.wD()).booleanValue() && (aj2 = packetSendEvent.dq()) instanceof e && !(e2 = (e)aj2).isMoving() && !bb.aW()) {
            packetSendEvent.cF();
        }
    };

    public CubeCraftMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
        double d2 = CubeCraftMode.aER.bgK.gW;
        double d3 = CubeCraftMode.aER.bgK.gX;
        double d4 = CubeCraftMode.aER.bgK.gY;
    }
}

