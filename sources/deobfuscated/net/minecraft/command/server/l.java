/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class l
extends a {
    @Override
    public String RX() {
        return "list";
    }

    @Override
    public int RS() {
        return 0;
    }

    @Override
    public String c(aw aw2) {
        return "commands.players.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        int n2 = MinecraftServer.afs().ale();
        aw2.a(new t("commands.players.list", n2, MinecraftServer.afs().getMaxPlayers()));
        aw2.a(new s(MinecraftServer.afs().alE().cl(stringArray.length > 0 && "uuids".equalsIgnoreCase(stringArray[0]))));
        aw2.a(ad.coj, n2);
    }
}

