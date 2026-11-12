/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.afl;
import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.value.NumberValue;

public final class WatchdogDamageBoostFlyDisablerMode
extends Mode<Velocity> {
    private final NumberValue uN = new NumberValue("Horizontal", this, (Number)0, (Number)0, (Number)100, (Number)1);
    private final NumberValue uO = new NumberValue("Vertical", this, (Number)0, (Number)0, (Number)100, (Number)1);
    @EventLink
    public final Listener<PacketReceiveEvent> uP = packetReceiveEvent -> {
        aj<a> aj2;
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !WatchdogDamageBoostFlyDisablerMode.aER.bgK.cup || packetReceiveEvent.isCancelled() || this.e(Flight.class).isEnabled() || this.e(LongJump.class).isEnabled()) {
            return;
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        double d2 = ((Number)this.uN.wD()).doubleValue();
        double d3 = ((Number)this.uO.wD()).doubleValue();
        if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == WatchdogDamageBoostFlyDisablerMode.aER.bgK.getEntityId()) {
            if (!this.e(Speed.class).isEnabled() || WatchdogDamageBoostFlyDisablerMode.aER.bgK.tR <= 0 || !(aii.speed() < Math.hypot((double)((t)aj2).agN() / 8000.0, (double)((t)aj2).agP() / 8000.0))) {
                if (!WatchdogDamageBoostFlyDisablerMode.aER.bgK.aO || this.e(Speed.class).isEnabled()) {
                    afl.b("no boost", new Object[0]);
                    packetReceiveEvent.cF();
                } else if (!this.e(Speed.class).isEnabled()) {
                    WatchdogDamageBoostFlyDisablerMode.aER.bgK.ue = (double)((t)aj2).agO() / 8000.0;
                    packetReceiveEvent.cF();
                }
            }
            packetReceiveEvent.e(aj2);
        }
        if (aj3 instanceof ar) {
            aj2 = (ar)aj3;
            if (d2 == 0.0 && d3 == 0.0) {
                packetReceiveEvent.cF();
                return;
            }
            ((ar)aj2).x *= d2 / 100.0;
            ((ar)aj2).y *= d3 / 100.0;
            ((ar)aj2).z *= d2 / 100.0;
            packetReceiveEvent.e(aj2);
        }
    };

    public WatchdogDamageBoostFlyDisablerMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

