/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.connection.UserConnection
 */
package de.florianmichael.vialoadingbase.command;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.connection.UserConnection;
import java.util.UUID;

public class UserCommandSender
implements ViaCommandSender {
    private final UserConnection user;

    public UserCommandSender(UserConnection userConnection) {
        this.user = userConnection;
    }

    public boolean hasPermission(String string) {
        return false;
    }

    public void sendMessage(String string) {
        Via.getPlatform().sendMessage(this.user, string);
    }

    public UUID getUUID() {
        return this.user.getProtocolInfo().getUuid();
    }

    public String getName() {
        return this.user.getProtocolInfo().getUsername();
    }
}

