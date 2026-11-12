/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package rise.module.impl.combat.velocity;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class LegitJumpResetMode
extends Mode<Velocity> {
    public final NumberValue uC = new NumberValue("Chance", this, (Number)100, (Number)0, (Number)100, (Number)1);
    public final BooleanValue uD = new BooleanValue("Legit Timing", (Mode<?>)this, (Boolean)false);
    private boolean gD;
    @EventLink
    public final Listener<PreMotionEvent> uE = preMotionEvent -> {
        this.gD = false;
    };
    @EventLink
    public final Listener<MoveInputEvent> uF = moveInputEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !LegitJumpResetMode.aER.bgK.cup) {
            return;
        }
        if (this.gD && Math.random() * 100.0 < ((Number)this.uC.wD()).doubleValue()) {
            moveInputEvent.setJump(true);
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2)) {
                // empty if block
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> uG = packetReceiveEvent -> {
        t t2;
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !LegitJumpResetMode.aER.bgK.cup || packetReceiveEvent.isCancelled()) {
            return;
        }
        if (!LegitJumpResetMode.aER.bgK.aO) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == LegitJumpResetMode.aER.bgK.getEntityId() && t2.dcS > 0 && (!((Boolean)this.uD.wD()).booleanValue() || LegitJumpResetMode.aER.bgK.ae <= 14 || LegitJumpResetMode.aER.bgK.crx <= 1)) {
            this.gD = true;
        }
    };

    public LegitJumpResetMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

