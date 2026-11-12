/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.t;
import net.minecraft.world.w;

public class ah
extends a {
    @Override
    public boolean a(aw aw2) {
        return MinecraftServer.afs().all() || super.a(aw2);
    }

    @Override
    public String RX() {
        return "seed";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.seed.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        w w2 = aw2 instanceof net.minecraft.entity.player.a ? ((net.minecraft.entity.player.a)aw2).baU : MinecraftServer.afs().ha(0);
        aw2.a(new t("commands.seed.success", w2.avD()));
    }
}

