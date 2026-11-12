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
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.ft;
import hackclient.rise.lz;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;

public class op
extends akg<lz> {
    private final aki Ll = new aki("Silent", (akg<?>)this, (Boolean)false);
    private boolean Hs;
    private double Lm;
    private double Ln;
    private double Lo;
    private boolean Lp;
    @dm
    public final dk<fh> Lq = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            fh2.setCancelled(true);
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = op.aER.bgK.pl;
            float f3 = op.aER.bgK.pm;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)i2.dcm);
                packetWrapper.sendToServer(Protocol1_9To1_8.class);
            }
            ahn.n(new h(d2, d3, d4, f2, f3, false));
            op.aER.bgK.setPosition(d2, d3, d4);
            op.aER.bgK.jump();
            ((lz)this.wy()).setEnabled(false);
        }
    };
    @dm
    public final dk<dz> Lr = dz2 -> {
        if (!aii.isMoving()) {
            dz2.setForward(1.0f);
        }
    };
    @dm
    public final dk<ft> Ls = ft2 -> {
        if (((Boolean)this.Ll.wD()).booleanValue()) {
            double d2 = op.aER.bgC.bWY;
            double d3 = this.Lm;
            double d4 = this.Lo;
            double d5 = this.Ln;
            op.aER.aIY.cgs = false;
            c c2 = aER.BC();
            c2.gW = d3;
            c2.gX = d4;
            c2.gY = d5;
            c2.crF = d3;
            c2.crG = d4;
            c2.crH = d5;
        }
    };
    @dm
    public final dk<eo> Lt = eo2 -> {
        if (op.aER.bgK.aO) {
            op.aER.bgK.jump();
        }
        this.Hs = true;
        if (op.aER.bgK.ae > 1) {
            op.aER.bgK.ue += 0.00348;
        }
        if (this.Hs && (double)op.aER.bgK.csf > 0.1) {
            op.aER.bgK.ue = 0.42;
            aii.strafe(1.97);
        }
    };

    public op(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onDisable() {
        this.Hs = false;
        if (this.Lp) {
            op.aER.aIY.cgs = true;
        }
    }

    @Override
    public void onEnable() {
        this.Lp = op.aER.aIY.cgs;
        this.Lm = op.aER.bgK.gW;
        this.Ln = op.aER.bgK.gY;
        this.Lo = op.aER.bgK.gX;
    }
}

