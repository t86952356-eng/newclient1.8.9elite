/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import net.minecraft.server.management.IPBanEntry;
import net.minecraft.server.management.UserList;
import net.minecraft.server.management.UserListEntry;

public class BanList
extends UserList<String, IPBanEntry> {
    public BanList(File file) {
        super(file);
    }

    @Override
    protected UserListEntry<String> y(JsonObject jsonObject) {
        return new IPBanEntry(jsonObject);
    }

    public boolean b(SocketAddress socketAddress) {
        String string = this.d(socketAddress);
        return this.u(string);
    }

    public IPBanEntry c(SocketAddress socketAddress) {
        String string = this.d(socketAddress);
        return (IPBanEntry)this.r(string);
    }

    private String d(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }
}

