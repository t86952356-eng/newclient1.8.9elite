/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.t;
import net.minecraft.world.an;
import net.minecraft.world.ao;

public class r
extends a {
    @Override
    public String RX() {
        return "gamemode";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.gamemode.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new bo("commands.gamemode.usage", new Object[0]);
        }
        ao ao2 = this.h(aw2, stringArray[0]);
        e e2 = stringArray.length >= 2 ? r.a(aw2, stringArray[1]) : r.b(aw2);
        ((net.minecraft.entity.player.a)e2).a(ao2);
        e2.csf = 0.0f;
        if (aw2.Se().Si().gw("sendCommandFeedback")) {
            ((c)e2).a(new t("gameMode.changed", new Object[0]));
        }
        t t2 = new t("gameMode." + ao2.getName(), new Object[0]);
        if (e2 != aw2) {
            r.a(aw2, (au)this, 1, "commands.gamemode.success.other", e2.xU(), t2);
        } else {
            r.a(aw2, (au)this, 1, "commands.gamemode.success.self", t2);
        }
    }

    protected ao h(aw aw2, String string) {
        return !string.equalsIgnoreCase(ao.dEx.getName()) && !string.equalsIgnoreCase("s") ? (!string.equalsIgnoreCase(ao.dEy.getName()) && !string.equalsIgnoreCase("c") ? (!string.equalsIgnoreCase(ao.dEz.getName()) && !string.equalsIgnoreCase("a") ? (!string.equalsIgnoreCase(ao.dEA.getName()) && !string.equalsIgnoreCase("sp") ? an.ih(r.h(string, 0, ao.values().length - 2)) : ao.dEA) : ao.dEz) : ao.dEy) : ao.dEx;
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? r.a(stringArray, "survival", "creative", "adventure", "spectator") : (stringArray.length == 2 ? r.a(stringArray, this.Sh()) : null);
    }

    protected String[] Sh() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 1;
    }
}

