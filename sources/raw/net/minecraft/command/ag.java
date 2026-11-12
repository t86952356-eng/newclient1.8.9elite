/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class ag
extends a {
    @Override
    public String RX() {
        return "spawnpoint";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.spawnpoint.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        b b2;
        if (stringArray.length > 1 && stringArray.length < 4) {
            throw new bo("commands.spawnpoint.usage", new Object[0]);
        }
        e e2 = stringArray.length > 0 ? ag.a(aw2, stringArray[0]) : ag.b(aw2);
        b b3 = b2 = stringArray.length > 3 ? ag.a(aw2, stringArray, 1, true) : e2.yl();
        if (e2.baU != null) {
            e2.a(b2, true);
            ag.a(aw2, (au)this, "commands.spawnpoint.success", e2.xU(), b2.wt(), b2.wu(), b2.wx());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? ag.a(stringArray, MinecraftServer.afs().Sa()) : (stringArray.length > 1 && stringArray.length <= 4 ? ag.a(stringArray, 1, b2) : null);
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

