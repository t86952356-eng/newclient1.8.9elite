/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.ao;

public class r
extends a {
    @Override
    public String RX() {
        return "publish";
    }

    @Override
    public String c(aw aw2) {
        return "commands.publish.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        String string = MinecraftServer.afs().a(ao.dEx, false);
        if (string != null) {
            r.a(aw2, (au)this, "commands.publish.started", string);
        } else {
            r.a(aw2, (au)this, "commands.publish.failed", new Object[0]);
        }
    }
}

