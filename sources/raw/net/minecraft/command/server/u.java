/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.ai;

public class u
extends a {
    @Override
    public String RX() {
        return "save-on";
    }

    @Override
    public String c(aw aw2) {
        return "commands.save-on.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        boolean bl2 = false;
        for (int i2 = 0; i2 < minecraftServer.dkG.length; ++i2) {
            if (minecraftServer.dkG[i2] == null) continue;
            ai ai2 = minecraftServer.dkG[i2];
            if (!ai2.dEc) continue;
            ai2.dEc = false;
            bl2 = true;
        }
        if (!bl2) {
            throw new n("commands.save-on.alreadyOn", new Object[0]);
        }
        u.a(aw2, (au)this, "commands.save.enabled", new Object[0]);
    }
}

