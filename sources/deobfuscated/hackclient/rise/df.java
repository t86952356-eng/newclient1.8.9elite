/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.am;
import net.minecraft.network.play.client.s;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;

public final class df
extends am {
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> iH = packetSendEvent -> {
        if (packetSendEvent.isCancelled() || !ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17) || packetSendEvent.dq() instanceof s) {
            // empty if block
        }
    };
}

