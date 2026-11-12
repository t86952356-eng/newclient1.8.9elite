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
import hackclient.rise.ua;
import net.minecraft.block.Block;
import net.minecraft.util.b;

public class ut
extends akg<ua> {
    private boolean ajg = false;
    @dm
    public final dk<eg> ajh = eg2 -> {
        this.ajg = ut.aER.aIY.chq.Re();
        if ((double)ut.aER.bgK.csf > 2.5) {
            ut.aER.aIY.chq.ay(true);
            int n2 = (int)Math.floor(ut.aER.bgK.gW);
            int n3 = (int)Math.floor(ut.aER.bgK.gX);
            int n4 = (int)Math.floor(ut.aER.bgK.gY);
            b b2 = new b(n2, n3 - 1, n4);
            Block block = ut.aER.bgF.L(b2).df();
            if (!block.xb().zE()) {
                this.hp();
                ut.aER.bgK.jump();
                ut.aER.aIY.chq.ay(this.ajg);
            }
        }
    };

    public ut(String string, ua ua2) {
        super(string, ua2);
    }

    @Override
    public void onDisable() {
        ut.aER.aIY.chq.ay(false);
    }

    private void hp() {
        try {
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                return;
            }
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)ut.aER.bgK.getEntityId());
            packetWrapper.write((Type)Types.VAR_INT, (Object)8);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper.sendToServer(Protocol1_9To1_8.class);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

