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

public class h
extends a {
    @Override
    public String RX() {
        return "say";
    }

    @Override
    public int RS() {
        return 1;
    }

    @Override
    public String c(aw aw2) {
        return "commands.say.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length <= 0 || stringArray[0].length() <= 0) {
            throw new bo("commands.say.usage", new Object[0]);
        }
        ba ba2 = h.b(aw2, stringArray, 0, true);
        MinecraftServer.afs().alE().m(new t("chat.type.announcement", aw2.xW(), ba2));
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length >= 1 ? h.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }
}

