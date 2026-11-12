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
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class ad
extends a {
    @Override
    public String RX() {
        return "whitelist";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.whitelist.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 1) {
            throw new bo("commands.whitelist.usage", new Object[0]);
        }
        MinecraftServer minecraftServer = MinecraftServer.afs();
        if (stringArray[0].equals("on")) {
            minecraftServer.alE().cm(true);
            ad.a(aw2, (au)this, "commands.whitelist.enabled", new Object[0]);
        } else if (stringArray[0].equals("off")) {
            minecraftServer.alE().cm(false);
            ad.a(aw2, (au)this, "commands.whitelist.disabled", new Object[0]);
        } else if (stringArray[0].equals("list")) {
            aw2.a(new t("commands.whitelist.list", minecraftServer.alE().amu().length, minecraftServer.alE().amy().length));
            Object[] objectArray = minecraftServer.alE().amu();
            aw2.a(new s(ad.b(objectArray)));
        } else if (stringArray[0].equals("add")) {
            if (stringArray.length < 2) {
                throw new bo("commands.whitelist.add.usage", new Object[0]);
            }
            GameProfile gameProfile = minecraftServer.alS().fE(stringArray[1]);
            if (gameProfile == null) {
                throw new n("commands.whitelist.add.failed", stringArray[1]);
            }
            minecraftServer.alE().l(gameProfile);
            ad.a(aw2, (au)this, "commands.whitelist.add.success", stringArray[1]);
        } else if (stringArray[0].equals("remove")) {
            if (stringArray.length < 2) {
                throw new bo("commands.whitelist.remove.usage", new Object[0]);
            }
            GameProfile gameProfile = minecraftServer.alE().amt().fK(stringArray[1]);
            if (gameProfile == null) {
                throw new n("commands.whitelist.remove.failed", stringArray[1]);
            }
            minecraftServer.alE().m(gameProfile);
            ad.a(aw2, (au)this, "commands.whitelist.remove.success", stringArray[1]);
        } else if (stringArray[0].equals("reload")) {
            minecraftServer.alE().amx();
            ad.a(aw2, (au)this, "commands.whitelist.reloaded", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        if (stringArray.length == 1) {
            return ad.a(stringArray, "on", "off", "list", "add", "remove", "reload");
        }
        if (stringArray.length == 2) {
            if (stringArray[0].equals("remove")) {
                return ad.a(stringArray, MinecraftServer.afs().alE().amu());
            }
            if (stringArray[0].equals("add")) {
                return ad.a(stringArray, MinecraftServer.afs().alS().Sl());
            }
        }
        return null;
    }
}

