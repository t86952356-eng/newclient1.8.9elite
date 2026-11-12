/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import java.util.Random;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.ai;
import net.minecraft.world.storage.o;

public class ap
extends a {
    @Override
    public String RX() {
        return "weather";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.weather.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray.length <= 2) {
            int n2 = (300 + new Random().nextInt(600)) * 20;
            if (stringArray.length >= 2) {
                n2 = ap.h(stringArray[1], 1, 1000000) * 20;
            }
            ai ai2 = MinecraftServer.afs().dkG[0];
            o o2 = ai2.avH();
            if ("clear".equalsIgnoreCase(stringArray[0])) {
                o2.iS(n2);
                o2.iR(0);
                o2.iQ(0);
                o2.cG(false);
                o2.cF(false);
                ap.a(aw2, (au)this, "commands.weather.clear", new Object[0]);
            } else if ("rain".equalsIgnoreCase(stringArray[0])) {
                o2.iS(0);
                o2.iR(n2);
                o2.iQ(n2);
                o2.cG(true);
                o2.cF(false);
                ap.a(aw2, (au)this, "commands.weather.rain", new Object[0]);
            } else {
                if (!"thunder".equalsIgnoreCase(stringArray[0])) {
                    throw new bo("commands.weather.usage", new Object[0]);
                }
                o2.iS(0);
                o2.iR(n2);
                o2.iQ(n2);
                o2.cG(true);
                o2.cF(true);
                ap.a(aw2, (au)this, "commands.weather.thunder", new Object[0]);
            }
        } else {
            throw new bo("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? ap.a(stringArray, "clear", "rain", "thunder") : null;
    }
}

