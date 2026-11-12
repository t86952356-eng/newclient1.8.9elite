/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.NumberValue;

public final class BufferAbuseMode
extends Mode<Velocity> {
    private final NumberValue sD = new NumberValue("Horizontal", this, (Number)100, (Number)0, (Number)100, (Number)1);
    private final NumberValue sE = new NumberValue("Vertical", this, (Number)100, (Number)0, (Number)100, (Number)1);
    private final NumberValue sF = new NumberValue("Buffer", this, (Number)1, (Number)1, (Number)3, (Number)1);
    private int sG;
    @EventLink
    public final Listener<PacketReceiveEvent> sH = packetReceiveEvent -> {
        aj<a> aj2;
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !BufferAbuseMode.aER.bgK.cup || packetReceiveEvent.isCancelled()) {
            return;
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        double d2 = ((Number)this.sD.wD()).doubleValue();
        double d3 = ((Number)this.sE.wD()).doubleValue();
        if (aj3 instanceof t && (aj2 = (t)aj3).getEntityID() == BufferAbuseMode.aER.bgK.getEntityId()) {
            if (this.sG < ((Number)this.sF.wD()).intValue()) {
                packetReceiveEvent.cF();
                ++this.sG;
                return;
            }
            packetReceiveEvent.e(aj2);
            this.sG = 0;
        }
        if (aj3 instanceof ar) {
            aj2 = (ar)aj3;
            if (this.sG < ((Number)this.sF.wD()).intValue()) {
                packetReceiveEvent.cF();
                ++this.sG;
                return;
            }
            ((ar)aj2).x *= d2 / 100.0;
            ((ar)aj2).y *= d3 / 100.0;
            ((ar)aj2).z *= d2 / 100.0;
            packetReceiveEvent.e(aj2);
            this.sG = 0;
        }
    };

    public BufferAbuseMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

