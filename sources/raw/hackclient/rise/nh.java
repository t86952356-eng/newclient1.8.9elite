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
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;

public class nh
extends akg<lw> {
    private boolean Hs;
    private boolean Ht;
    private boolean Hu;
    @dm
    public final dk<fh> Hv = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            fh2.setCancelled(true);
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = nh.aER.bgK.pl;
            float f3 = nh.aER.bgK.pm;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)i2.dcm);
                packetWrapper.sendToServer(Protocol1_9To1_8.class);
            }
            ahn.n(new h(d2, d3, d4, f2, f3, false));
            nh.aER.bgK.setPosition(d2, d3, d4);
            nh.aER.bgK.jump();
            if (this.Hu) {
                ((lw)this.wy()).setEnabled(false);
            }
            this.Hu = true;
        }
    };
    @dm
    public final dk<dz> Hw = dz2 -> {
        if (nh.aER.bgK.tR > 15 && nh.aER.bgK.tR < 19) {
            dz2.setForward(0.0f);
        }
    };
    @dm
    public final dk<eo> Hx = eo2 -> {
        if (nh.aER.bgK.ae > 1) {
            nh.aER.bgK.ue += 0.00348;
        }
        if (nh.aER.bgK.aO) {
            nh.aER.bgK.jump();
        }
        if ((double)nh.aER.bgK.csf > 0.1 && !this.Hu) {
            nh.aER.bgK.ue = 0.42;
            aii.strafe(1.97);
        }
        if (this.Hu && nh.aER.bgK.tR == 20) {
            nh.aER.bgK.ue = 0.42;
            aii.strafe(9.3);
        }
    };

    public nh(String string, lw lw2) {
        super(string, lw2);
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

