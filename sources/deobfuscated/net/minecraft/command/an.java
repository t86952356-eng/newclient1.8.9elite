/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.storage.o;

public class an
extends a {
    @Override
    public String RX() {
        return "toggledownfall";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.downfall.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        this.Su();
        an.a(aw2, (au)this, "commands.downfall.success", new Object[0]);
    }

    protected void Su() {
        o o2;
        o2.cG(!(o2 = MinecraftServer.afs().dkG[0].avH()).avK());
    }
}

