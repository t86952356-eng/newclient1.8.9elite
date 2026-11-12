/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.fg;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import net.minecraft.client.settings.d;
import net.minecraft.entity.c;
import net.minecraft.entity.item.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.server.bc;
import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public final class WatchdogBoatMode
extends Mode<Flight> {
    private static final long IN = 1000L;
    private static final double IO = 0.42;
    private final NumberValue IP = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private final Deque<aj<?>> IQ = new ConcurrentLinkedDeque();
    private double IR;
    private b IS;
    private boolean IT;
    private boolean IU;
    private long IV;
    @EventLink
    public final Listener<fg> IW = fg2 -> {
        if (((Flight)this.wy()).isEnabled()) {
            ((Flight)this.wy()).toggle();
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> IX = packetSendEvent -> {
        if (this.j(packetSendEvent.dq())) {
            packetSendEvent.cF();
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> IY = packetReceiveEvent -> {
        if (this.IT && packetReceiveEvent.dq() instanceof bc) {
            this.IQ.offer(packetReceiveEvent.dq());
            packetReceiveEvent.cF();
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> IZ = preUpdateEvent -> {
        this.hq();
        if (this.hs()) {
            this.IR = 0.0;
            this.ht();
            return;
        }
        if (!this.IU) {
            return;
        }
        this.IR = 0.0;
        if (WatchdogBoatMode.aER.bgR != null) {
            return;
        }
        if (Keyboard.isKeyDown((int)WatchdogBoatMode.aER.aIY.chq.cO())) {
            this.IR = 0.42;
        } else if (Keyboard.isKeyDown((int)WatchdogBoatMode.aER.aIY.chr.cO())) {
            this.IR = -0.42;
        }
        WatchdogBoatMode.aER.aIY.chr.ay(false);
    };
    @EventLink
    public final Listener<StrafeEvent> Ja = strafeEvent -> {
        if (this.hs()) {
            this.ht();
            strafeEvent.setStrafe(0.0f);
            strafeEvent.setForward(0.0f);
            strafeEvent.setFriction(0.0f);
            return;
        }
        if (!this.IU) {
            return;
        }
        if (WatchdogBoatMode.aER.bgK.gX % 1.0 != 0.0) {
            WatchdogBoatMode.aER.bgK.ue = this.IR;
        }
        WatchdogBoatMode.aER.bgK.ud = 0.0;
        WatchdogBoatMode.aER.bgK.uf = 0.0;
        strafeEvent.setFriction(((Number)this.IP.wD()).floatValue());
    };

    public WatchdogBoatMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.gS();
    }

    @Override
    public void onDisable() {
        this.hu();
    }

    private void hq() {
        if (this.hs()) {
            this.ht();
        }
        if (!this.IT && WatchdogBoatMode.aER.bgK.crC instanceof b) {
            this.IS = (b)WatchdogBoatMode.aER.bgK.crC;
            WatchdogBoatMode.aER.bgK.swingItem();
            ahn.m(new net.minecraft.network.play.client.c((c)this.IS, net.minecraft.network.play.client.d.daU));
            this.IT = true;
            this.IV = System.currentTimeMillis() + 1000L;
            this.ht();
        }
        if (this.IT && !this.IU && this.hr()) {
            this.IU = true;
            this.IV = System.currentTimeMillis() + 1000L;
            this.ht();
        }
    }

    private boolean hr() {
        return this.IS == null || this.IS.csb || WatchdogBoatMode.aER.bgF == null || WatchdogBoatMode.aER.bgF.cn(this.IS.getEntityId()) != this.IS;
    }

    private boolean j(aj<?> aj2) {
        if (!(aj2 instanceof n)) {
            return false;
        }
        n n2 = (n)aj2;
        return n2.agb() == o.dbp && (WatchdogBoatMode.aER.bgK.crC instanceof b || this.IS != null);
    }

    private boolean hs() {
        return this.IV > System.currentTimeMillis();
    }

    private void ht() {
        if (WatchdogBoatMode.aER.bgK == null) {
            return;
        }
        WatchdogBoatMode.aER.bgK.ud = 0.0;
        WatchdogBoatMode.aER.bgK.ue = 0.0;
        WatchdogBoatMode.aER.bgK.uf = 0.0;
    }

    private void hu() {
        this.hv();
        this.gS();
        this.ht();
        if (WatchdogBoatMode.aER.aIY != null) {
            int n2 = WatchdogBoatMode.aER.aIY.chr.cO();
            d.k(n2, Keyboard.isKeyDown((int)n2));
        }
    }

    private void hv() {
        aj<?> aj2;
        while ((aj2 = this.IQ.poll()) != null) {
            if (aER.AU() == null) continue;
            try {
                aj2.a(aER.AU());
            }
            catch (Exception exception) {}
        }
    }

    private void gS() {
        this.IS = null;
        this.IT = false;
        this.IU = false;
        this.IV = 0L;
        this.IR = 0.0;
        this.IQ.clear();
    }
}

