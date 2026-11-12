/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.afl;
import java.util.Random;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class Grim2Mode
extends Mode<Velocity> {
    private final BooleanValue um = new BooleanValue("Full Rotation Fix", (Mode<?>)this, (Boolean)true);
    private final BooleanValue un = new BooleanValue("Fake S08", (Mode<?>)this, (Boolean)true);
    private final BooleanValue uo = new BooleanValue("Cancel Velocity", (Mode<?>)this, (Boolean)true);
    private final NumberValue up = new NumberValue("Rotation Noise", this, (Number)0.001, (Number)0.0, (Number)0.1, (Number)0.001);
    private final BooleanValue uq = new BooleanValue("Debug Log", (Mode<?>)this, (Boolean)false);
    private final Random ur = new Random();
    @EventLink
    public final Listener<PacketSendEvent> us = packetSendEvent -> {
        e e2;
        if (Grim2Mode.aER.bgK == null || Grim2Mode.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (((Boolean)this.um.wD()).booleanValue() && aj2 instanceof e && (e2 = (e)aj2).afV()) {
            float f2 = e2.getYaw();
            float f3 = e2.getPitch();
            if (this.h(f2) || this.h(f3)) {
                float f4 = ((Number)this.up.wD()).floatValue();
                e e3 = e2.isMoving() ? new h(e2.afS(), e2.afT(), e2.afU(), f2, f3, e2.isOnGround()) : new g(f2 += (float)(this.ur.nextBoolean() ? 1 : -1) * f4, f3 += (float)(this.ur.nextBoolean() ? 1 : -1) * f4, e2.isOnGround());
                packetSendEvent.e(e3);
                this.debug("Full rotation bypass");
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> ut = packetReceiveEvent -> {
        aj<a> aj2;
        if (Grim2Mode.aER.bgK == null || Grim2Mode.aER.bgF == null) {
            return;
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        if (((Boolean)this.un.wD()).booleanValue() && aj3 instanceof i) {
            aj2 = (i)aj3;
            Grim2Mode.aER.bgK.setPosition(((i)aj2).getX(), ((i)aj2).getY(), ((i)aj2).getZ());
            Grim2Mode.aER.bgK.ud = 0.0;
            Grim2Mode.aER.bgK.ue = 0.0;
            Grim2Mode.aER.bgK.uf = 0.0;
            packetReceiveEvent.setCancelled(true);
            this.debug("Fake S08");
        }
        if (((Boolean)this.uo.wD()).booleanValue() && aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == Grim2Mode.aER.bgK.getEntityId()) {
            packetReceiveEvent.setCancelled(true);
            this.debug("Velocity cancelled");
        }
    };

    public Grim2Mode(String string, Velocity velocity) {
        super(string, velocity);
    }

    private boolean h(float f2) {
        float f3 = Math.abs(f2 % 90.0f);
        return f3 < 0.01f || f3 > 89.99f;
    }

    private void debug(String string) {
        if (((Boolean)this.uq.wD()).booleanValue()) {
            afl.b("\u00a78[\u00a7cGrimVelocity2\u00a78] \u00a77" + string, new Object[0]);
        }
    }
}

