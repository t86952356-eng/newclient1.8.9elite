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

public class q
extends a {
    @Override
    public String RX() {
        return "pardon";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.unban.usage";
    }

    @Override
    public boolean a(aw aw2) {
        return MinecraftServer.afs().alE().amq().amC() && super.a(aw2);
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        GameProfile gameProfile;
        MinecraftServer minecraftServer;
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            minecraftServer = MinecraftServer.afs();
            gameProfile = minecraftServer.alE().amq().fI(stringArray[0]);
            if (gameProfile == null) {
                throw new n("commands.unban.failed", stringArray[0]);
            }
        } else {
            throw new bo("commands.unban.usage", new Object[0]);
        }
        minecraftServer.alE().amq().s(gameProfile);
        q.a(aw2, (au)this, "commands.unban.success", stringArray[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? q.a(stringArray, MinecraftServer.afs().alE().amq().amD()) : null;
    }
}

