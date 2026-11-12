/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ax;
import net.minecraft.command.bo;
import net.minecraft.command.x;
import net.minecraft.event.b;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.minecraft.util.t;

public class v
extends a {
    @Override
    public String RX() {
        return "help";
    }

    @Override
    public int RS() {
        return 0;
    }

    @Override
    public String c(aw aw2) {
        return "commands.help.usage";
    }

    @Override
    public List<String> RT() {
        return Arrays.asList("?");
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        List<au> list = this.e(aw2);
        int n2 = 7;
        int n3 = (list.size() - 1) / 7;
        int n4 = 0;
        try {
            n4 = stringArray.length == 0 ? 0 : v.h(stringArray[0], 1, n3 + 1) - 1;
        }
        catch (ax ax2) {
            Map<String, au> map = this.Sk();
            au au2 = map.get(stringArray[0]);
            if (au2 != null) {
                throw new bo(au2.c(aw2), new Object[0]);
            }
            if (bt.w(stringArray[0], -1) != -1) {
                throw ax2;
            }
            throw new x();
        }
        int n5 = Math.min((n4 + 1) * 7, list.size());
        t t2 = new t("commands.help.header", n4 + 1, n3 + 1);
        t2.arp().b(an.dvN);
        aw2.a(t2);
        for (int i2 = n4 * 7; i2 < n5; ++i2) {
            au au3 = list.get(i2);
            t t3 = new t(au3.c(aw2), new Object[0]);
            t3.arp().a(new net.minecraft.event.a(b.cKM, "/" + au3.RX() + " "));
            aw2.a(t3);
        }
        if (n4 == 0 && aw2 instanceof net.minecraft.entity.player.a) {
            t t4 = new t("commands.help.footer", new Object[0]);
            t4.arp().b(an.dvV);
            aw2.a(t4);
        }
    }

    protected List<au> e(aw aw2) {
        List<au> list = MinecraftServer.afs().ali().d(aw2);
        Collections.sort(list);
        return list;
    }

    protected Map<String, au> Sk() {
        return MinecraftServer.afs().ali().Sk();
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        if (stringArray.length == 1) {
            Set<String> set = this.Sk().keySet();
            return v.a(stringArray, set.toArray(new String[set.size()]));
        }
        return null;
    }
}

