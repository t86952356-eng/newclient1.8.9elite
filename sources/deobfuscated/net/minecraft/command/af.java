/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.server.MinecraftServer;

public class af
extends a {
    @Override
    public String RX() {
        return "setidletimeout";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.setidletimeout.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length != 1) {
            throw new bo("commands.setidletimeout.usage", new Object[0]);
        }
        int n2 = af.x(stringArray[0], 0);
        MinecraftServer.afs().hc(n2);
        af.a(aw2, (au)this, "commands.setidletimeout.success", n2);
    }
}

