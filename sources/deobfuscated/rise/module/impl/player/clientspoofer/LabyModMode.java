/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package rise.module.impl.player.clientspoofer;

import hackclient.rise.ahn;
import hackclient.rise.ajw;
import hackclient.rise.akr;
import hackclient.rise.st;
import io.netty.buffer.Unpooled;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.module.Mode;
import rise.module.impl.player.ClientSpoofer;

public class LabyModMode
extends Mode<ClientSpoofer> {
    private final akr ZT = new akr("Spoofed Version, Latest would be preferred", (Mode<?>)this, "4.2.31");
    @EventLink
    public final Listener<PacketSendEvent> ZU = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof ab) {
            st st2 = new st(this);
            packetSendEvent.cF();
            for (ajw ajw2 : st2) {
                ak ak2 = new ak(Unpooled.buffer());
                if (((Boolean)ajw2.wk()).booleanValue()) {
                    ak2.eS((String)ajw2.wj());
                } else {
                    ak2.writeBytes(((String)ajw2.wj()).getBytes());
                }
                ab ab2 = new ab((String)ajw2.wi(), ak2);
                ahn.n(ab2);
            }
        }
    };

    public LabyModMode(String string, ClientSpoofer clientSpoofer) {
        super(string, clientSpoofer);
    }
}

