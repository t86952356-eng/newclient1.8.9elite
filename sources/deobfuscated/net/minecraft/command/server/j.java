/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.t;

public class j
extends a {
    @Override
    public String RX() {
        return "me";
    }

    @Override
    public int RS() {
        return 0;
    }

    @Override
    public String c(aw aw2) {
        return "commands.me.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new bo("commands.me.usage", new Object[0]);
        }
        ba ba2 = j.b(aw2, stringArray, 0, !(aw2 instanceof net.minecraft.entity.player.a));
        MinecraftServer.afs().alE().m(new t("chat.type.emote", aw2.xW(), ba2));
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return j.a(stringArray, MinecraftServer.afs().Sa());
    }
}

