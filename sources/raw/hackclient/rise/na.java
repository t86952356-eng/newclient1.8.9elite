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
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lw;
import java.util.LinkedList;
import java.util.Queue;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;

public class na
extends akg<lw> {
    private boolean Gi = false;
    private boolean Gj = false;
    private int Gk = 0;
    public static final Queue<aj<?>> Gl = new LinkedList();
    @dm
    public final dk<fg> Gm = fg2 -> {
        ((lw)this.wy()).toggle();
        this.Gk = 0;
        this.Gi = false;
        this.Gj = false;
        Gl.clear();
    };
    @dm
    public final dk<ei> Gn = ei2 -> {
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
    @dm
    public final dk<fi> Go = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof s && this.Gj) {
            fi2.setCancelled(true);
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
    @dm
    public final dk<fh> Gp = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i && this.Gj && !Gl.isEmpty()) {
            while (!Gl.isEmpty()) {
                ahn.n(Gl.poll());
            }
        }
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == na.aER.bgK.getEntityId()) {
            if (this.Gj || !Gl.isEmpty()) {
                return;
            }
            this.Gk = 0;
            this.Gj = true;
            fh2.setCancelled(true);
        }
    };

    public na(String string, lw lw2) {
        super(string, lw2);
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
        packetWrapper.write((Type)Types.VAR_INT, (Object)na.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

