/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ay;
import net.minecraft.command.bo;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class ae
extends a {
    @Override
    public String RX() {
        return "kick";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.kick.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length > 0 && stringArray[0].length() > 1) {
            e e2 = MinecraftServer.afs().alE().fG(stringArray[0]);
            String string = "Kicked by an operator.";
            boolean bl2 = false;
            if (e2 == null) {
                throw new ay();
            }
            if (stringArray.length >= 2) {
                string = ae.a(aw2, stringArray, 1).arq();
                bl2 = true;
            }
            e2.cIX.eQ(string);
            if (bl2) {
                ae.a(aw2, (au)this, "commands.kick.success.reason", e2.xU(), string);
            } else {
                ae.a(aw2, (au)this, "commands.kick.success", e2.xU());
            }
        } else {
            throw new bo("commands.kick.usage", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length >= 1 ? ae.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }
}

