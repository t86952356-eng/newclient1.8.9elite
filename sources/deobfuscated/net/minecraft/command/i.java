/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.r;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.t;
import net.minecraft.world.ao;

public class i
extends r {
    @Override
    public String RX() {
        return "defaultgamemode";
    }

    @Override
    public String c(aw aw2) {
        return "commands.defaultgamemode.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new bo("commands.defaultgamemode.usage", new Object[0]);
        }
        ao ao2 = this.h(aw2, stringArray[0]);
        this.a(ao2);
        i.a(aw2, (au)this, "commands.defaultgamemode.success", new t("gameMode." + ao2.getName(), new Object[0]));
    }

    protected void a(ao ao2) {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        minecraftServer.a(ao2);
        if (minecraftServer.alL()) {
            for (e e2 : MinecraftServer.afs().alE().amB()) {
                e2.a(ao2);
                e2.csf = 0.0f;
            }
        }
    }
}

