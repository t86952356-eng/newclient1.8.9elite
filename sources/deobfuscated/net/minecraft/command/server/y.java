/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;

public class y
extends a {
    @Override
    public String RX() {
        return "stop";
    }

    @Override
    public String c(aw aw2) {
        return "commands.stop.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (MinecraftServer.afs().dkG != null) {
            y.a(aw2, (au)this, "commands.stop.start", new Object[0]);
        }
        MinecraftServer.afs().akW();
    }
}

