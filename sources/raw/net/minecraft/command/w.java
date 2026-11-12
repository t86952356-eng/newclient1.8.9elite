/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class w
extends a {
    @Override
    public String RX() {
        return "kill";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.kill.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length == 0) {
            e e2 = w.b(aw2);
            e2.To();
            w.a(aw2, (au)this, "commands.kill.successful", e2.xW());
        } else {
            c c2 = w.b(aw2, stringArray[0]);
            c2.To();
            w.a(aw2, (au)this, "commands.kill.successful", c2.xW());
        }
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? w.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }
}

