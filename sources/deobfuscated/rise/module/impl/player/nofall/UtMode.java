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
package rise.module.impl.player.nofall;

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
import net.minecraft.block.Block;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class UtMode
extends Mode<NoFall> {
    private boolean ajg = false;
    @EventLink
    public final Listener<PostMotionEvent> ajh = postMotionEvent -> {
        this.ajg = UtMode.aER.aIY.chq.Re();
        if ((double)UtMode.aER.bgK.csf > 2.5) {
            UtMode.aER.aIY.chq.ay(true);
            int n2 = (int)Math.floor(UtMode.aER.bgK.gW);
            int n3 = (int)Math.floor(UtMode.aER.bgK.gX);
            int n4 = (int)Math.floor(UtMode.aER.bgK.gY);
            b b2 = new b(n2, n3 - 1, n4);
            Block block = UtMode.aER.bgF.L(b2).df();
            if (!block.xb().zE()) {
                this.hp();
                UtMode.aER.bgK.jump();
                UtMode.aER.aIY.chq.ay(this.ajg);
            }
        }
    };

    public UtMode(String string, NoFall noFall) {
        super(string, noFall);
    }

    @Override
    public void onDisable() {
        UtMode.aER.aIY.chq.ay(false);
    }

    private void hp() {
        try {
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                return;
            }
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)UtMode.aER.bgK.getEntityId());
            packetWrapper.write((Type)Types.VAR_INT, (Object)8);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper.sendToServer(Protocol1_9To1_8.class);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

