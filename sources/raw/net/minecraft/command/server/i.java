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

public class i
extends a {
    @Override
    public String RX() {
        return "deop";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.deop.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        GameProfile gameProfile;
        MinecraftServer minecraftServer;
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            minecraftServer = MinecraftServer.afs();
            gameProfile = minecraftServer.alE().amv().fJ(stringArray[0]);
            if (gameProfile == null) {
                throw new n("commands.deop.failed", stringArray[0]);
            }
        } else {
            throw new bo("commands.deop.usage", new Object[0]);
        }
        minecraftServer.alE().i(gameProfile);
        i.a(aw2, (au)this, "commands.deop.success", stringArray[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? i.a(stringArray, MinecraftServer.afs().alE().amw()) : null;
    }
}

