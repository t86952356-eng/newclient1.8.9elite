/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.server.MinecraftServer;

public class ao
extends a {
    @Override
    public String RX() {
        return "trigger";
    }

    @Override
    public int RS() {
        return 0;
    }

    @Override
    public String c(aw aw2) {
        return "commands.trigger.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        Object object;
        e e2;
        if (stringArray.length < 3) {
            throw new bo("commands.trigger.usage", new Object[0]);
        }
        if (aw2 instanceof e) {
            e2 = (e)aw2;
        } else {
            object = aw2.Sf();
            if (!(object instanceof e)) {
                throw new n("commands.trigger.invalidPlayer", new Object[0]);
            }
            e2 = (e)object;
        }
        object = MinecraftServer.afs().ha(0).SD();
        g g2 = ((i)object).fo(stringArray[0]);
        if (g2 != null && g2.akp() == b.djr) {
            int n2 = ao.dM(stringArray[2]);
            if (!((i)object).a(e2.xU(), g2)) {
                throw new n("commands.trigger.invalidObjective", stringArray[0]);
            }
            d d2 = ((i)object).b(e2.xU(), g2);
            if (d2.IH()) {
                throw new n("commands.trigger.disabled", stringArray[0]);
            }
            if ("set".equals(stringArray[1])) {
                d2.gW(n2);
            } else {
                if (!"add".equals(stringArray[1])) {
                    throw new n("commands.trigger.invalidMode", stringArray[1]);
                }
                d2.gU(n2);
            }
            d2.ca(true);
            if (e2.cIZ.amh()) {
                ao.a(aw2, (au)this, "commands.trigger.success", stringArray[0], stringArray[1], stringArray[2]);
            }
        } else {
            throw new n("commands.trigger.invalidObjective", stringArray[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        if (stringArray.length == 1) {
            i i2 = MinecraftServer.afs().ha(0).SD();
            ArrayList arrayList = Lists.newArrayList();
            for (g g2 : i2.akA()) {
                if (g2.akp() != b.djr) continue;
                arrayList.add(g2.getName());
            }
            return ao.a(stringArray, arrayList.toArray(new String[arrayList.size()]));
        }
        return stringArray.length == 2 ? ao.a(stringArray, "add", "set") : null;
    }
}

