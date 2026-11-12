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
package rise.module.impl.movement.longjump;

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
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.Render3DEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.value.BooleanValue;

public class Matrix2Mode
extends Mode<LongJump> {
    private final BooleanValue Ll = new BooleanValue("Silent", (Mode<?>)this, (Boolean)false);
    private boolean Hs;
    private double Lm;
    private double Ln;
    private double Lo;
    private boolean Lp;
    @EventLink
    public final Listener<PacketReceiveEvent> Lq = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            packetReceiveEvent.setCancelled(true);
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = Matrix2Mode.aER.bgK.pl;
            float f3 = Matrix2Mode.aER.bgK.pm;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)i2.dcm);
                packetWrapper.sendToServer(Protocol1_9To1_8.class);
            }
            ahn.n(new h(d2, d3, d4, f2, f3, false));
            Matrix2Mode.aER.bgK.setPosition(d2, d3, d4);
            Matrix2Mode.aER.bgK.jump();
            ((LongJump)this.wy()).setEnabled(false);
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Lr = moveInputEvent -> {
        if (!aii.isMoving()) {
            moveInputEvent.setForward(1.0f);
        }
    };
    @EventLink
    public final Listener<Render3DEvent> Ls = render3DEvent -> {
        if (((Boolean)this.Ll.wD()).booleanValue()) {
            double d2 = Matrix2Mode.aER.bgC.bWY;
            double d3 = this.Lm;
            double d4 = this.Lo;
            double d5 = this.Ln;
            Matrix2Mode.aER.aIY.cgs = false;
            c c2 = aER.BC();
            c2.gW = d3;
            c2.gX = d4;
            c2.gY = d5;
            c2.crF = d3;
            c2.crG = d4;
            c2.crH = d5;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Lt = strafeEvent -> {
        if (Matrix2Mode.aER.bgK.aO) {
            Matrix2Mode.aER.bgK.jump();
        }
        this.Hs = true;
        if (Matrix2Mode.aER.bgK.ae > 1) {
            Matrix2Mode.aER.bgK.ue += 0.00348;
        }
        if (this.Hs && (double)Matrix2Mode.aER.bgK.csf > 0.1) {
            Matrix2Mode.aER.bgK.ue = 0.42;
            aii.strafe(1.97);
        }
    };

    public Matrix2Mode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
        this.Hs = false;
        if (this.Lp) {
            Matrix2Mode.aER.aIY.cgs = true;
        }
    }

    @Override
    public void onEnable() {
        this.Lp = Matrix2Mode.aER.aIY.cgs;
        this.Lm = Matrix2Mode.aER.bgK.gW;
        this.Ln = Matrix2Mode.aER.bgK.gY;
        this.Lo = Matrix2Mode.aER.bgK.gX;
    }
}

