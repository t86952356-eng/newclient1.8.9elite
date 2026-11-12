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
package rise.module.impl.movement.flight;

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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class Grim3Mode
extends Mode<Flight> {
    private int Gq;
    @EventLink
    public final Listener<PreUpdateEvent> Gr = preUpdateEvent -> {
        this.Gq = !Grim3Mode.aER.bgK.aO ? ++this.Gq : 0;
    };
    @EventLink
    public final Listener<PostMotionEvent> Gs = postMotionEvent -> {
        if (!Grim3Mode.aER.bgK.aO) {
            this.hp();
        }
    };

    public Grim3Mode(String string, Flight flight) {
        super(string, flight);
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
        packetWrapper.write((Type)Types.VAR_INT, (Object)Grim3Mode.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

