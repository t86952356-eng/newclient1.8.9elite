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
package rise.module.impl.movement.phase;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.eh;
import hackclient.rise.fd;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.j;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;

public class WatchdogPredictionFullBlockMode
extends Mode<Phase> {
    private boolean ys;
    @EventLink
    private Listener<fd> FK = fd2 -> {
        this.ys = this.ys;
    };
    @EventLink
    private Listener<eh> FL = eh2 -> {
        aii.stop();
        if (WatchdogPredictionFullBlockMode.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (WatchdogPredictionFullBlockMode.aER.bgK.aO) {
            // empty if block
        }
        if (WatchdogPredictionFullBlockMode.aER.bgK.tR == 5) {
            this.ys = true;
        }
        if (!WatchdogPredictionFullBlockMode.aER.bgK.aO && WatchdogPredictionFullBlockMode.aER.bgK.Zz != 1) {
            WatchdogPredictionFullBlockMode.aER.bgK.cIc = 0.1f;
        }
        if (!(WatchdogPredictionFullBlockMode.aER.bgK.ue < 0.0) || WatchdogPredictionFullBlockMode.aER.bgK.tR > 11) {
            // empty if block
        }
        if (this.ys) {
            // empty if block
        }
        WatchdogPredictionFullBlockMode.aER.bgK.ue = 0.0;
    };
    @EventLink
    private Listener<PacketReceiveEvent> FM = packetReceiveEvent -> {
        aj<a> aj2;
        i i2 = packetReceiveEvent.dq();
        if (!(i2 instanceof t) || (aj2 = (t)((Object)i2)).getEntityID() == WatchdogPredictionFullBlockMode.aER.bgK.getEntityId()) {
            // empty if block
        }
        if ((i2 = packetReceiveEvent.dq()) instanceof net.minecraft.network.play.server.a) {
            aj2 = (net.minecraft.network.play.server.a)((Object)i2);
        }
        if ((aj2 = packetReceiveEvent.dq()) instanceof i && this.ys) {
            i2 = (i)aj2;
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = i2.getYaw();
            float f3 = i2.getPitch();
        }
    };
    @EventLink
    private Listener<PreMotionEvent> yu = preMotionEvent -> {
        if (WatchdogPredictionFullBlockMode.aER.bgK.aRg % 2 == 0) {
            double d2 = aii.direction();
            double d3 = -bt.bx((float)d2) * 100.0f;
            double d4 = bt.bB((float)d2) * 100.0f;
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 100.0);
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            j j2 = Minecraft.getMinecraft().bgF;
            int n2 = Minecraft.getMinecraft().bgF.Ho();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)12);
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        j j3 = Minecraft.getMinecraft().bgF;
        int n3 = Minecraft.getMinecraft().bgF.Ho();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)10);
    };
    @EventLink
    private Listener<PacketSendEvent> FN = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof f) {
            f f2 = (f)aj2;
        }
    };
    @EventLink
    private final Listener<fd> Ph = fd2 -> {};

    public WatchdogPredictionFullBlockMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        afl.c("collide with a block and wait until the server clips you down", new Object[0]);
        if (WatchdogPredictionFullBlockMode.aER.bgK.aO) {
            // empty if block
        }
        this.ys = false;
    }

    @Override
    public void onDisable() {
        this.ys = false;
        WatchdogPredictionFullBlockMode.aER.bgK.cIt.cJK = false;
    }
}

