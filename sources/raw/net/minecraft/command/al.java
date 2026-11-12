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
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.ai;

public class al
extends a {
    @Override
    public String RX() {
        return "time";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.time.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length > 1) {
            if (stringArray[0].equals("set")) {
                int n2 = stringArray[1].equals("day") ? 1000 : (stringArray[1].equals("night") ? 13000 : al.x(stringArray[1], 0));
                this.a(aw2, n2);
                al.a(aw2, (au)this, "commands.time.set", n2);
                return;
            }
            if (stringArray[0].equals("add")) {
                int n3 = al.x(stringArray[1], 0);
                this.b(aw2, n3);
                al.a(aw2, (au)this, "commands.time.added", n3);
                return;
            }
            if (stringArray[0].equals("query")) {
                if (stringArray[1].equals("daytime")) {
                    int n4 = (int)(aw2.Se().getWorldTime() % Integer.MAX_VALUE);
                    aw2.a(ad.coj, n4);
                    al.a(aw2, (au)this, "commands.time.query", n4);
                    return;
                }
                if (stringArray[1].equals("gametime")) {
                    int n5 = (int)(aw2.Se().getTotalWorldTime() % Integer.MAX_VALUE);
                    aw2.a(ad.coj, n5);
                    al.a(aw2, (au)this, "commands.time.query", n5);
                    return;
                }
            }
        }
        throw new bo("commands.time.usage", new Object[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? al.a(stringArray, "set", "add", "query") : (stringArray.length == 2 && stringArray[0].equals("set") ? al.a(stringArray, "day", "night") : (stringArray.length == 2 && stringArray[0].equals("query") ? al.a(stringArray, "daytime", "gametime") : null));
    }

    protected void a(aw aw2, int n2) {
        for (int i2 = 0; i2 < MinecraftServer.afs().dkG.length; ++i2) {
            MinecraftServer.afs().dkG[i2].o(n2);
        }
    }

    protected void b(aw aw2, int n2) {
        for (int i2 = 0; i2 < MinecraftServer.afs().dkG.length; ++i2) {
            ai ai2 = MinecraftServer.afs().dkG[i2];
            ai2.o(ai2.getWorldTime() + (long)n2);
        }
    }
}

