/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.Arrays;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.command.ay;
import net.minecraft.command.bo;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.t;

public class m
extends a {
    @Override
    public List<String> RT() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public String RX() {
        return "tell";
    }

    @Override
    public int RS() {
        return 0;
    }

    @Override
    public String c(aw aw2) {
        return "commands.message.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new bo("commands.message.usage", new Object[0]);
        }
        e e2 = m.a(aw2, stringArray[0]);
        if (e2 == aw2) {
            throw new ay("commands.message.sameTarget", new Object[0]);
        }
        ba ba2 = m.b(aw2, stringArray, 1, !(aw2 instanceof net.minecraft.entity.player.a));
        t t2 = new t("commands.message.display.incoming", aw2.xW(), ba2.arl());
        t t3 = new t("commands.message.display.outgoing", e2.xW(), ba2.arl());
        t2.arp().b(an.dvS).g(true);
        t3.arp().b(an.dvS).g(true);
        ((c)e2).a(t2);
        aw2.a(t3);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return m.a(stringArray, MinecraftServer.afs().Sa());
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

