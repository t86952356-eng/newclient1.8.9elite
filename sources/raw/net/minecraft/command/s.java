/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.ab;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.i;
import net.minecraft.world.k;

public class s
extends a {
    @Override
    public String RX() {
        return "gamerule";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.gamerule.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        i i2 = this.Si();
        String string = stringArray.length > 0 ? stringArray[0] : "";
        String string2 = stringArray.length > 1 ? s.c(stringArray, 1) : "";
        switch (stringArray.length) {
            case 0: {
                aw2.a(new net.minecraft.util.s(s.b(i2.avi())));
                break;
            }
            case 1: {
                if (!i2.gy(string)) {
                    throw new n("commands.gamerule.norule", string);
                }
                String string3 = i2.gv(string);
                aw2.a(new net.minecraft.util.s(string).ga(" = ").ga(string3));
                aw2.a(ad.coj, i2.gx(string));
                break;
            }
            default: {
                if (i2.a(string, k.dCv) && !"true".equals(string2) && !"false".equals(string2)) {
                    throw new n("commands.generic.boolean.invalid", string2);
                }
                i2.Y(string, string2);
                s.a(i2, string);
                s.a(aw2, (au)this, "commands.gamerule.success", new Object[0]);
            }
        }
    }

    public static void a(i i2, String string) {
        if ("reducedDebugInfo".equals(string)) {
            byte by2 = (byte)(i2.gw(string) ? 22 : 23);
            for (e e2 : MinecraftServer.afs().alE().amB()) {
                e2.cIX.B(new ab(e2, by2));
            }
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        i i2;
        if (stringArray.length == 1) {
            return s.a(stringArray, this.Si().avi());
        }
        if (stringArray.length == 2 && (i2 = this.Si()).a(stringArray[0], k.dCv)) {
            return s.a(stringArray, "true", "false");
        }
        return null;
    }

    private i Si() {
        return MinecraftServer.afs().ha(0).Si();
    }
}

