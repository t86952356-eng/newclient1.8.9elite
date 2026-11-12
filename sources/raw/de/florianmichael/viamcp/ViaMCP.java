/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4
 *  com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 */
package de.florianmichael.viamcp;

import com.mojang.authlib.GameProfile;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2;
import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase$ViaLoadingBaseBuilder;
import de.florianmichael.viamcp.gui.AsyncVersionSlider;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import net.minecraft.client.d;

public class ViaMCP {
    public static final int NATIVE_VERSION = 47;
    public static ViaMCP INSTANCE;
    public UserConnection user;
    private AsyncVersionSlider asyncVersionSlider;

    public static void create() {
        INSTANCE = new ViaMCP();
    }

    public ViaMCP() {
        ViaLoadingBase$ViaLoadingBaseBuilder.create().runDirectory(new File("ViaMCP")).nativeVersion(47).onProtocolReload(protocolVersion -> {
            if (this.getAsyncVersionSlider() != null) {
                this.getAsyncVersionSlider().setVersion(protocolVersion.getVersion());
            }
        }).build();
        Protocol1_20_3To1_20_2 protocol1_20_3To1_20_2 = (Protocol1_20_3To1_20_2)Via.getManager().getProtocolManager().getProtocol(Protocol1_20_3To1_20_2.class);
        protocol1_20_3To1_20_2.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.LOGIN_ACKNOWLEDGED, packetWrapper -> {
            this.user = packetWrapper.user();
        });
        protocol1_20_3To1_20_2.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, packetWrapper -> {
            packetWrapper.cancel();
            PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ServerboundLoginPackets.HELLO, (UserConnection)packetWrapper.user());
            GameProfile gameProfile = d.AZ().Bl().afK();
            packetWrapper2.write(Types.STRING, (Object)gameProfile.getName());
            UUID uUID = gameProfile.getId();
            if (uUID != null) {
                System.out.println("online");
                packetWrapper2.write(Types.UUID, (Object)uUID);
            } else {
                System.out.println("offline");
                packetWrapper2.write(Types.UUID, (Object)UUID.nameUUIDFromBytes(gameProfile.getName().getBytes(StandardCharsets.UTF_8)));
            }
            packetWrapper2.sendToServer(Protocol1_20_3To1_20_2.class);
        });
        this.fixTransactions();
        Protocol1_9To1_8 protocol1_9To1_8 = (Protocol1_9To1_8)Via.getManager().getProtocolManager().getProtocol(Protocol1_9To1_8.class);
        protocol1_9To1_8.registerClientbound((ClientboundPacketType)ClientboundPackets1_9.PLAYER_POSITION, (ClientboundPacketType)ClientboundPackets1_8.PLAYER_POSITION, packetWrapper -> {}, true);
    }

    private void fixTransactions() {
        Protocol1_17To1_16_4 protocol1_17To1_16_4 = (Protocol1_17To1_16_4)Via.getManager().getProtocolManager().getProtocol(Protocol1_17To1_16_4.class);
        protocol1_17To1_16_4.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.PING, (ClientboundPacketType)ClientboundPackets1_16_2.CONTAINER_ACK, packetWrapper -> {}, true);
        protocol1_17To1_16_4.registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.CONTAINER_ACK, (ServerboundPacketType)ServerboundPackets1_17.PONG, packetWrapper -> {}, true);
    }

    public void initAsyncSlider() {
        this.initAsyncSlider(5, 5, 110, 20);
    }

    public void initAsyncSlider(int n2, int n3, int n4, int n5) {
        this.asyncVersionSlider = new AsyncVersionSlider(-1, n2, n3, Math.max(n4, 110), n5);
    }

    public AsyncVersionSlider getAsyncVersionSlider() {
        return this.asyncVersionSlider;
    }
}

