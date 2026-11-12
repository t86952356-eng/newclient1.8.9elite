/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.player.scaffold;

import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VfMode
extends Mode<Scaffold> {
    public static int bj;
    @EventLink(cH=0)
    public final Listener<StrafeEvent> ajO = strafeEvent -> {
        if (!Keyboard.isKeyDown((int)VfMode.aER.aIY.chr.cO())) {
            return;
        }
    };
    @EventLink(cH=3)
    public final Listener<PreUpdateEvent> ajP = preUpdateEvent -> {
        if (!Keyboard.isKeyDown((int)VfMode.aER.aIY.chr.cO()) || VfMode.aER.bgK.cst > 20) {
            return;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> ajQ = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k) {
            k k2 = (k)aj2;
        }
    };

    public VfMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onEnable() {
        bj = 0;
    }
}

