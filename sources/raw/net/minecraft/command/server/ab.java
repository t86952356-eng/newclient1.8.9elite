/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.server.MinecraftServer;

public class ab
extends a {
    @Override
    public String RX() {
        return "testfor";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.testfor.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 1) {
            throw new bo("commands.testfor.usage", new Object[0]);
        }
        c c2 = ab.b(aw2, stringArray[0]);
        net.minecraft.nbt.n n2 = null;
        if (stringArray.length >= 2) {
            try {
                n2 = b.ez(ab.c(stringArray, 1));
            }
            catch (i i2) {
                throw new n("commands.testfor.tagError", i2.getMessage());
            }
        }
        if (n2 != null) {
            net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
            c2.b(n3);
            if (!aa.a(n2, n3, true)) {
                throw new n("commands.testfor.failure", c2.xU());
            }
        }
        ab.a(aw2, (au)this, "commands.testfor.success", c2.xU());
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length == 1 ? ab.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }
}

