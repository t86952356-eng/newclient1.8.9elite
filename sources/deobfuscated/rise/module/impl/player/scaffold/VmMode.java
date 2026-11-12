/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;
import rise.value.NumberValue;

public class VmMode
extends Mode<Scaffold> {
    private final NumberValue ajZ = new NumberValue("Speed", this, (Number)1.3, (Number)0.9, (Number)1.3, (Number)0.05);
    private int dm;
    private int aka;
    @EventLink
    public final Listener<PreMotionEvent> akb = preMotionEvent -> {
        VmMode.aER.bgK.setSprinting(false);
        double d2 = ((Number)this.ajZ.wD()).doubleValue();
        if (!VmMode.aER.aIY.chq.Re() && d2 > 0.9 && VmMode.aER.bgK.crx >= 2 && this.aka <= 10) {
            aii.strafe(aii.getAllowedHorizontalDistance() * d2);
            VmMode.aER.bgK.jump();
            VmMode.aER.bgK.ue = 0.012500047683714;
        }
        if (VmMode.aER.bgK.aO) {
            aii.strafe();
        }
        ++this.dm;
        ++this.aka;
        switch (this.dm) {
            case 1: {
                ahn.m(new n(VmMode.aER.bgK, o.dbp));
                break;
            }
            case 10: {
                this.dm = 0;
            }
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> akc = packetSendEvent -> {
        k k2;
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && (k2 = (k)aj2).getPlacedBlockDirection() != 255) {
            this.aka = 0;
        }
    };

    public VmMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onDisable() {
        if (this.dm == 1) {
            ahn.m(new n(VmMode.aER.bgK, o.dbq));
        }
    }
}

