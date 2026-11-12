/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.akd;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VeMode
extends Mode<Scaffold> {
    int bj;
    @EventLink(cH=0)
    public final Listener<StrafeEvent> ajL = strafeEvent -> {
        if (!Keyboard.isKeyDown((int)VeMode.aER.aIY.chr.cO())) {
            return;
        }
        VeMode.aER.aIY.chs.ay(false);
        VeMode.aER.bgK.setSprinting(false);
    };
    @EventLink(cH=3)
    public final Listener<PreUpdateEvent> ajM = preUpdateEvent -> {
        if (!Keyboard.isKeyDown((int)VeMode.aER.aIY.chr.cO()) || VeMode.aER.bgK.cst > 20) {
            this.bj = 1000;
            return;
        }
        ++this.bj;
        if (VeMode.aER.bgK.gX % 1.0 != 0.0) {
            this.bj = 0;
        }
        if (VeMode.aER.bgK.ue <= 0.0 && this.bj >= 15) {
            ((Scaffold)this.wy()).ahh = ((Scaffold)this.wy()).ahh.v(0.0, -1.0, 0.0);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> ajN = packetSendEvent -> {
        k k2;
        aj<?> aj2 = packetSendEvent.dq();
        if (!(aj2 instanceof k) || (k2 = (k)aj2).yl().h(new akd(-1.0, -1.0, -1.0)) || k2.getPlacedBlockDirection() == ao.dwq.OY()) {
            // empty if block
        }
    };

    public VeMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onEnable() {
        this.bj = 1000;
    }
}

