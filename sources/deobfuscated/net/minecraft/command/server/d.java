/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.command.server;

import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.UserListBansEntry;
import net.minecraft.util.b;

public class d
extends a {
    @Override
    public String RX() {
        return "ban";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.ban.usage";
    }

    @Override
    public boolean a(aw aw2) {
        return MinecraftServer.afs().alE().amq().amC() && super.a(aw2);
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 0) {
            MinecraftServer minecraftServer = MinecraftServer.afs();
            GameProfile gameProfile = minecraftServer.alS().fE(stringArray[0]);
            if (gameProfile == null) {
                throw new n("commands.ban.failed", stringArray[0]);
            }
            String string = null;
            if (stringArray.length >= 2) {
                string = d.a(aw2, stringArray, 1).arq();
            }
            UserListBansEntry userListBansEntry = new UserListBansEntry(gameProfile, null, aw2.xU(), null, string);
            minecraftServer.alE().amq().a(userListBansEntry);
            e e2 = minecraftServer.alE().fG(stringArray[0]);
            if (e2 != null) {
                e2.cIX.eQ("You are banned from this server.");
            }
        } else {
            throw new bo("commands.ban.usage", new Object[0]);
        }
        d.a(aw2, (au)this, "commands.ban.success", stringArray[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length >= 1 ? d.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }
}

