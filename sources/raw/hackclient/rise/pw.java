/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 */
package hackclient.rise;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.md;
import net.minecraft.client.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

public class pw
extends akg<md> {
    private boolean ys;
    @dm
    private dk<fd> FK = fd2 -> {
        this.ys = this.ys;
    };
    @dm
    private dk<eh> FL = eh2 -> {
        aii.stop();
        if (pw.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (pw.aER.bgK.aO) {
            // empty if block
        }
        if (pw.aER.bgK.tR == 5) {
            this.ys = true;
        }
        if (!pw.aER.bgK.aO && pw.aER.bgK.Zz != 1) {
            pw.aER.bgK.cIc = 0.1f;
        }
        if (!(pw.aER.bgK.ue < 0.0) || pw.aER.bgK.tR > 11) {
            // empty if block
        }
        if (this.ys) {
            // empty if block
        }
        pw.aER.bgK.ue = 0.0;
    };
    @dm
    private dk<fh> FM = fh2 -> {
        aj<a> aj2;
        i i2 = fh2.dq();
        if (!(i2 instanceof t) || (aj2 = (t)((Object)i2)).getEntityID() == pw.aER.bgK.getEntityId()) {
            // empty if block
        }
        if ((i2 = fh2.dq()) instanceof net.minecraft.network.play.server.a) {
            aj2 = (net.minecraft.network.play.server.a)((Object)i2);
        }
        if ((aj2 = fh2.dq()) instanceof i && this.ys) {
            i2 = (i)aj2;
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = i2.getYaw();
            float f3 = i2.getPitch();
        }
    };
    @dm
    private dk<ei> yu = ei2 -> {
        if (pw.aER.bgK.aRg % 2 == 0) {
            double d2 = aii.direction();
            double d3 = -bt.bx((float)d2) * 100.0f;
            double d4 = bt.bB((float)d2) * 100.0f;
            ei2.setPosY(ei2.getPosY() + 100.0);
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            j j2 = d.AZ().bgF;
            int n2 = d.AZ().bgF.Ho();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)12);
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        j j3 = d.AZ().bgF;
        int n3 = d.AZ().bgF.Ho();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)10);
    };
    @dm
    private dk<fi> FN = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof f) {
            f f2 = (f)aj2;
        }
    };
    @dm
    private final dk<fd> Ph = fd2 -> {};

    public pw(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        afl.c("collide with a block and wait until the server clips you down", new Object[0]);
        if (pw.aER.bgK.aO) {
            // empty if block
        }
        this.ys = false;
    }

    @Override
    public void onDisable() {
        this.ys = false;
        pw.aER.bgK.cIt.cJK = false;
    }
}

