/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class MineLandMode
extends Mode<Flight> {
    private double Hy;
    private double Hz;
    private double HA;
    private boolean zd;
    @EventLink
    public final Listener<PreMotionEvent> HB = preMotionEvent -> {
        if (!this.zd) {
            double d2 = aii.direction();
            double d3 = 6.0;
            if (MineLandMode.aER.bgK.aRg % 3 == 0) {
                ahn.m(new e(MineLandMode.aER.bgK.aO));
                MineLandMode.aER.bgK.setPosition(this.Hy, this.Hz, this.HA);
            }
            preMotionEvent.setPosY(preMotionEvent.getPosY() - 1.1 + (double)(MineLandMode.aER.bgK.aRg % 3 == 0 ? 0.42f : 0.0f));
            preMotionEvent.setPosX(preMotionEvent.getPosX() + (double)bt.bx((float)d2) * 6.0);
            preMotionEvent.setPosZ(preMotionEvent.getPosZ() - (double)bt.bB((float)d2) * 6.0);
        } else {
            MineLandMode.aER.bgC.dAp = 0.3f;
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> HC = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i && !this.zd) {
            packetReceiveEvent.cF();
        } else if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == MineLandMode.aER.bgK.getEntityId() && (double)t2.dcS / 8000.0 > 0.5) {
            this.zd = true;
        }
    };

    public MineLandMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Hy = MineLandMode.aER.bgK.gW;
        this.Hz = MineLandMode.aER.bgK.gX;
        this.HA = MineLandMode.aER.bgK.gY;
        this.zd = false;
    }
}

