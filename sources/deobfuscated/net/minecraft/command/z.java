/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.at;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class z
extends a {
    @Override
    public String RX() {
        return "playsound";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.playsound.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new bo(this.c(aw2), new Object[0]);
        }
        int n2 = 0;
        String string = stringArray[n2++];
        e e2 = z.a(aw2, stringArray[n2++]);
        da da2 = aw2.Sd();
        double d2 = da2.dAG;
        if (stringArray.length > n2) {
            d2 = z.b(d2, stringArray[n2++], true);
        }
        double d3 = da2.dAH;
        if (stringArray.length > n2) {
            d3 = z.b(d3, stringArray[n2++], 0, 0, false);
        }
        double d4 = da2.dAI;
        if (stringArray.length > n2) {
            d4 = z.b(d4, stringArray[n2++], true);
        }
        double d5 = 1.0;
        if (stringArray.length > n2) {
            d5 = z.a(stringArray[n2++], 0.0, 3.4028234663852886E38);
        }
        double d6 = 1.0;
        if (stringArray.length > n2) {
            d6 = z.a(stringArray[n2++], 0.0, 2.0);
        }
        double d7 = 0.0;
        if (stringArray.length > n2) {
            d7 = z.a(stringArray[n2], 0.0, 1.0);
        }
        double d8 = d5 > 1.0 ? d5 * 16.0 : 16.0;
        double d9 = e2.getDistance(d2, d3, d4);
        if (d9 > d8) {
            if (d7 <= 0.0) {
                throw new n("commands.playsound.playerTooFar", e2.xU());
            }
            double d10 = d2 - e2.gW;
            double d11 = d3 - e2.gX;
            double d12 = d4 - e2.gY;
            double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
            if (d13 > 0.0) {
                d2 = e2.gW + d10 / d13 * 2.0;
                d3 = e2.gX + d11 / d13 * 2.0;
                d4 = e2.gY + d12 / d13 * 2.0;
            }
            d5 = d7;
        }
        e2.cIX.B(new at(string, d2, d3, d4, (float)d5, (float)d6));
        z.a(aw2, (au)this, "commands.playsound.success", string, e2.xU());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 2 ? z.a(stringArray, MinecraftServer.afs().Sa()) : (stringArray.length > 2 && stringArray.length <= 5 ? z.a(stringArray, 2, b2) : null);
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 1;
    }
}

