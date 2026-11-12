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
import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class MatrixMode
extends Mode<Flight> {
    private boolean Hs;
    private boolean Ht;
    private boolean Hu;
    @EventLink
    public final Listener<PacketReceiveEvent> Hv = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            packetReceiveEvent.setCancelled(true);
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = MatrixMode.aER.bgK.pl;
            float f3 = MatrixMode.aER.bgK.pm;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)i2.dcm);
                packetWrapper.sendToServer(Protocol1_9To1_8.class);
            }
            ahn.n(new h(d2, d3, d4, f2, f3, false));
            MatrixMode.aER.bgK.setPosition(d2, d3, d4);
            MatrixMode.aER.bgK.jump();
            if (this.Hu) {
                ((Flight)this.wy()).setEnabled(false);
            }
            this.Hu = true;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Hw = moveInputEvent -> {
        if (MatrixMode.aER.bgK.tR > 15 && MatrixMode.aER.bgK.tR < 19) {
            moveInputEvent.setForward(0.0f);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Hx = strafeEvent -> {
        if (MatrixMode.aER.bgK.ae > 1) {
            MatrixMode.aER.bgK.ue += 0.00348;
        }
        if (MatrixMode.aER.bgK.aO) {
            MatrixMode.aER.bgK.jump();
        }
        if ((double)MatrixMode.aER.bgK.csf > 0.1 && !this.Hu) {
            MatrixMode.aER.bgK.ue = 0.42;
            aii.strafe(1.97);
        }
        if (this.Hu && MatrixMode.aER.bgK.tR == 20) {
            MatrixMode.aER.bgK.ue = 0.42;
            aii.strafe(9.3);
        }
    };

    public MatrixMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Hu = false;
        this.Hs = false;
    }

    @Override
    public void onDisable() {
        this.Hu = false;
        this.Hs = false;
    }
}

