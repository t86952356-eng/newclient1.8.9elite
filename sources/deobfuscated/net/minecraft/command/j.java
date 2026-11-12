/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.t;
import net.minecraft.world.f;

public class j
extends a {
    @Override
    public String RX() {
        return "difficulty";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.difficulty.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new bo("commands.difficulty.usage", new Object[0]);
        }
        f f2 = this.dQ(stringArray[0]);
        MinecraftServer.afs().b(f2);
        j.a(aw2, (au)this, "commands.difficulty.success", new t(f2.ava(), new Object[0]));
    }

    protected f dQ(String string) {
        return !string.equalsIgnoreCase("peaceful") && !string.equalsIgnoreCase("p") ? (!string.equalsIgnoreCase("easy") && !string.equalsIgnoreCase("e") ? (!string.equalsIgnoreCase("normal") && !string.equalsIgnoreCase("n") ? (!string.equalsIgnoreCase("hard") && !string.equalsIgnoreCase("h") ? f.ib(j.h(string, 0, 3)) : f.dBU) : f.dBT) : f.dBS) : f.dBR;
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? j.a(stringArray, "peaceful", "easy", "normal", "hard") : null;
    }
}

