/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class ar
extends a {
    @Override
    public String RX() {
        return "xp";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.xp.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        e e2;
        int n2;
        boolean bl2;
        boolean bl3;
        if (stringArray.length <= 0) {
            throw new bo("commands.xp.usage", new Object[0]);
        }
        String string = stringArray[0];
        boolean bl4 = bl3 = string.endsWith("l") || string.endsWith("L");
        if (bl3 && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        boolean bl5 = bl2 = (n2 = ar.dM(string)) < 0;
        if (bl2) {
            n2 *= -1;
        }
        e e3 = e2 = stringArray.length > 1 ? ar.a(aw2, stringArray[1]) : ar.b(aw2);
        if (bl3) {
            aw2.a(ad.coj, e2.cIu);
            if (bl2) {
                ((net.minecraft.entity.player.a)e2).fG(-n2);
                ar.a(aw2, (au)this, "commands.xp.success.negative.levels", n2, e2.xU());
            } else {
                ((net.minecraft.entity.player.a)e2).fG(n2);
                ar.a(aw2, (au)this, "commands.xp.success.levels", n2, e2.xU());
            }
        } else {
            aw2.a(ad.coj, e2.cIv);
            if (bl2) {
                throw new n("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            e2.fE(n2);
            ar.a(aw2, (au)this, "commands.xp.success", n2, e2.xU());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 2 ? ar.a(stringArray, this.Sa()) : null;
    }

    protected String[] Sa() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 1;
    }
}

