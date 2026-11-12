/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.ahn;
import hackclient.rise.am;
import hackclient.rise.bs;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.util.math.Vector2f;

public final class cw
extends am {
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> ij = packetSendEvent -> {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
            aj<b> aj2;
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            aj<?> aj3 = packetSendEvent.dq();
            if (aj3 instanceof i && (((i)(aj2 = (i)aj3)).afW() == j.dbd || ((i)aj2).afW() == j.dbc)) {
                ahn.m(new m());
            }
            if (aj3 instanceof r && ((r)(aj2 = (r)aj3)).getMode() == 4) {
                ahn.m(new m());
            }
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17) && ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_21) && aj3 instanceof k && ((k)(aj2 = (k)aj3)).getPlacedBlockDirection() == 255) {
                Vector2f vector2f = bs.bH();
            }
        }
    };
}

