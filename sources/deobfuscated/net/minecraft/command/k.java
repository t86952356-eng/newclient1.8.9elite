/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ax;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.r;
import net.minecraft.potion.d;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.t;

public class k
extends a {
    @Override
    public String RX() {
        return "effect";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.effect.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(aw aw2, String[] stringArray) {
        boolean bl2;
        int n2;
        if (stringArray.length < 2) {
            throw new bo("commands.effect.usage", new Object[0]);
        }
        r r2 = k.a(aw2, stringArray[0], r.class);
        if (stringArray[1].equals("clear")) {
            if (r2.VL().isEmpty()) {
                throw new n("commands.effect.failure.notActive.all", r2.xU());
            }
            r2.VK();
            k.a(aw2, (au)this, "commands.effect.success.removed.all", r2.xU());
            return;
        }
        try {
            n2 = k.x(stringArray[1], 1);
        }
        catch (ax ax2) {
            net.minecraft.potion.a a2 = net.minecraft.potion.a.eW(stringArray[1]);
            if (a2 == null) {
                throw ax2;
            }
            n2 = a2.id;
        }
        int n3 = 600;
        int n4 = 30;
        int n5 = 0;
        if (n2 < 0 || n2 >= net.minecraft.potion.a.dgt.length || net.minecraft.potion.a.dgt[n2] == null) throw new ax("commands.effect.notFound", n2);
        net.minecraft.potion.a a3 = net.minecraft.potion.a.dgt[n2];
        if (stringArray.length >= 3) {
            n4 = k.h(stringArray[2], 0, 1000000);
            n3 = a3.aiW() ? n4 : n4 * 20;
        } else if (a3.aiW()) {
            n3 = 1;
        }
        if (stringArray.length >= 4) {
            n5 = k.h(stringArray[3], 0, 255);
        }
        boolean bl3 = bl2 = stringArray.length < 5 || !"true".equalsIgnoreCase(stringArray[4]);
        if (n4 > 0) {
            d d2 = new d(n2, n3, n5, false, bl2);
            r2.b(d2);
            k.a(aw2, (au)this, "commands.effect.success", new t(d2.ajj(), new Object[0]), n2, n5, r2.xU(), n4);
            return;
        } else {
            if (!r2.isPotionActive(n2)) throw new n("commands.effect.failure.notActive", new t(a3.getName(), new Object[0]), r2.xU());
            r2.eL(n2);
            k.a(aw2, (au)this, "commands.effect.success.removed", new t(a3.getName(), new Object[0]), r2.xU());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? k.a(stringArray, this.Sa()) : (stringArray.length == 2 ? k.a(stringArray, net.minecraft.potion.a.aiV()) : (stringArray.length == 5 ? k.a(stringArray, "true", "false") : null));
    }

    protected String[] Sa() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

