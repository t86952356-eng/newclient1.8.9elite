/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaAPIBase
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.buffer.ByteBuf
 */
package de.florianmichael.vialoadingbase.platform.viaversion;

import com.viaversion.viaversion.ViaAPIBase;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.buffer.ByteBuf;

public class VLBViaAPIWrapper
extends ViaAPIBase<UserConnection> {
    public ProtocolVersion getPlayerProtocolVersion(UserConnection userConnection) {
        return userConnection.getProtocolInfo().protocolVersion();
    }

    public void sendRawPacket(UserConnection userConnection, ByteBuf byteBuf) {
        userConnection.scheduleSendRawPacket(byteBuf);
    }
}

