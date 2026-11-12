/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.bm;
import hackclient.rise.bu;
import net.minecraft.item.bg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class PeMode
extends Mode<NoSlow> {
    private boolean enabled;
    @EventLink
    public final Listener<PreUpdateEvent> Np = preUpdateEvent -> {
        block5: {
            block4: {
                if (!PeMode.aER.bgK.isUsingItem()) break block4;
                this.d(bu.class);
                if (bu.bO().bP() instanceof bg) break block5;
            }
            return;
        }
        bm.blink();
        if (PeMode.aER.bgK.cIz < -1) {
            PeMode.aER.aIY.chu.ay(false);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Nq = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            afl.b("digging " + String.valueOf((Object)i2.afW()) + " " + packetSendEvent.isCancelled(), new Object[0]);
            this.enabled = false;
        } else if (!this.enabled && aj2 instanceof k) {
            this.d(bu.class);
            if (bu.bO() != null) {
                this.d(bu.class);
                if (bu.bO().bP() instanceof bg) {
                    this.enabled = true;
                    bm.blink();
                    bm.enabled = true;
                    packetSendEvent.cF();
                    ahn.n(aj2);
                    afl.b("Started", new Object[0]);
                }
            }
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> Nr = slowDownEvent -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof bg) {
                slowDownEvent.cF();
            }
        }
    };

    public PeMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

