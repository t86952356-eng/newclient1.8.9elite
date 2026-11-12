/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class k
extends a {
    @Override
    public String RX() {
        return "banlist";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public boolean a(aw aw2) {
        return (MinecraftServer.afs().alE().amr().amC() || MinecraftServer.afs().alE().amq().amC()) && super.a(aw2);
    }

    @Override
    public String c(aw aw2) {
        return "commands.banlist.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].equalsIgnoreCase("ips")) {
            aw2.a(new t("commands.banlist.ips", MinecraftServer.afs().alE().amr().amD().length));
            aw2.a(new s(k.b(MinecraftServer.afs().alE().amr().amD())));
        } else {
            aw2.a(new t("commands.banlist.players", MinecraftServer.afs().alE().amq().amD().length));
            aw2.a(new s(k.b(MinecraftServer.afs().alE().amq().amD())));
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? k.a(stringArray, "players", "ips") : null;
    }
}

