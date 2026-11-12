/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.command.server;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class o
extends a {
    @Override
    public String RX() {
        return "op";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.op.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        GameProfile gameProfile;
        MinecraftServer minecraftServer;
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            minecraftServer = MinecraftServer.afs();
            gameProfile = minecraftServer.alS().fE(stringArray[0]);
            if (gameProfile == null) {
                throw new n("commands.op.failed", stringArray[0]);
            }
        } else {
            throw new bo("commands.op.usage", new Object[0]);
        }
        minecraftServer.alE().h(gameProfile);
        o.a(aw2, (au)this, "commands.op.success", stringArray[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        if (stringArray.length == 1) {
            String string = stringArray[stringArray.length - 1];
            ArrayList arrayList = Lists.newArrayList();
            for (GameProfile gameProfile : MinecraftServer.afs().alf()) {
                if (MinecraftServer.afs().alE().k(gameProfile) || !o.N(string, gameProfile.getName())) continue;
                arrayList.add(gameProfile.getName());
            }
            return arrayList;
        }
        return null;
    }
}

