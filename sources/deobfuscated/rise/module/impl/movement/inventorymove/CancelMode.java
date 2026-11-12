/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.inventorymove;

import hackclient.rise.en;
import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.z;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.InventoryMove;

public class CancelMode
extends Mode<InventoryMove> {
    @EventLink
    public final Listener<PacketSendEvent> JN = packetSendEvent -> {
        aj<b> aj2;
        aj<?> aj3 = packetSendEvent.dq();
        if (aj3 instanceof z && ((z)(aj2 = (z)aj3)).agh() == aa.dbR) {
            packetSendEvent.cF();
        }
        if (aj3 instanceof n && ((n)(aj2 = (n)aj3)).agb() == o.dbv) {
            packetSendEvent.cF();
        }
        if (aj3 instanceof q) {
            packetSendEvent.cF();
        }
    };
    private final d[] JO;
    @EventLink
    public final Listener<en> JP;
    @EventLink
    public final Listener<PreUpdateEvent> JQ;

    public CancelMode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.JO = new d[]{CancelMode.aER.aIY.chm, CancelMode.aER.aIY.cho, CancelMode.aER.aIY.chp, CancelMode.aER.aIY.chn, CancelMode.aER.aIY.chq};
        this.JP = en2 -> {};
        this.JQ = preUpdateEvent -> {
            if (CancelMode.aER.bgR instanceof f || CancelMode.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JO) {
                d2.ay(a.a(d2));
            }
        };
    }
}

