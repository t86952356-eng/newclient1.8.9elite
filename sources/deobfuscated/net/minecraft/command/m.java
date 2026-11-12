/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;

public class m
extends a {
    @Override
    public String RX() {
        return "entitydata";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.entitydata.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        net.minecraft.nbt.n n2;
        if (stringArray.length < 2) {
            throw new bo("commands.entitydata.usage", new Object[0]);
        }
        c c2 = m.b(aw2, stringArray[0]);
        if (c2 instanceof net.minecraft.entity.player.a) {
            throw new n("commands.entitydata.noPlayers", c2.xW());
        }
        net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
        c2.b(n3);
        net.minecraft.nbt.n n4 = (net.minecraft.nbt.n)n3.aeG();
        try {
            n2 = b.ez(m.a(aw2, stringArray, 1).arq());
        }
        catch (i i2) {
            throw new n("commands.entitydata.tagError", i2.getMessage());
        }
        n2.eP("UUIDMost");
        n2.eP("UUIDLeast");
        n3.w(n2);
        if (n3.equals(n4)) {
            throw new n("commands.entitydata.failed", n3.toString());
        }
        c2.a(n3);
        m.a(aw2, (au)this, "commands.entitydata.success", n3.toString());
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

