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
import hackclient.rise.ahn;
import hackclient.rise.fg;
import java.util.LinkedList;
import java.util.Queue;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class Grim2Mode
extends Mode<Flight> {
    private boolean Gi = false;
    private boolean Gj = false;
    private int Gk = 0;
    public static final Queue<aj<?>> Gl = new LinkedList();
    @EventLink
    public final Listener<fg> Gm = fg2 -> {
        ((Flight)this.wy()).toggle();
        this.Gk = 0;
        this.Gi = false;
        this.Gj = false;
        Gl.clear();
    };
    @EventLink
    public final Listener<PreMotionEvent> Gn = preMotionEvent -> {
        if (this.Gi) {
            ++this.Gk;
            if (this.Gk >= 8) {
                for (int i2 = 0; i2 < 1; ++i2) {
                    this.hp();
                }
            }
            this.Gk = 0;
            this.Gi = false;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Go = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof s && this.Gj) {
            packetSendEvent.setCancelled(true);
            if (Gl.isEmpty()) {
                this.Gi = true;
            }
            Gl.add(aj2);
        }
        if (aj2 instanceof c && this.Gj && !Gl.isEmpty()) {
            while (!Gl.isEmpty()) {
                ahn.n(Gl.poll());
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> Gp = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i && this.Gj && !Gl.isEmpty()) {
            while (!Gl.isEmpty()) {
                ahn.n(Gl.poll());
            }
        }
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == Grim2Mode.aER.bgK.getEntityId()) {
            if (this.Gj || !Gl.isEmpty()) {
                return;
            }
            this.Gk = 0;
            this.Gj = true;
            packetReceiveEvent.setCancelled(true);
        }
    };

    public Grim2Mode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Gk = 0;
        this.Gi = false;
        this.Gj = false;
        Gl.clear();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.Gk = 0;
        this.Gi = false;
        this.Gj = false;
        while (!Gl.isEmpty()) {
            ahn.n(Gl.poll());
        }
        super.onDisable();
    }

    private void hp() {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            return;
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)Grim2Mode.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

