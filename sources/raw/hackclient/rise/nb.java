/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 */
package hackclient.rise;

import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ej;
import hackclient.rise.lw;

public class nb
extends akg<lw> {
    private int Gq;
    @dm
    public final dk<ej> Gr = ej2 -> {
        this.Gq = !nb.aER.bgK.aO ? ++this.Gq : 0;
    };
    @dm
    public final dk<eg> Gs = eg2 -> {
        if (!nb.aER.bgK.aO) {
            this.hp();
        }
    };

    public nb(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.Gq = 0;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.Gq = 0;
        super.onDisable();
    }

    private void hp() {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            return;
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)nb.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

