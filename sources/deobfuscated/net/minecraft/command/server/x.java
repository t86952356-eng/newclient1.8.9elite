/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.network.play.server.f;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class x
extends a {
    @Override
    public String RX() {
        return "setworldspawn";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.setworldspawn.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        b b2;
        if (stringArray.length == 0) {
            b2 = x.b(aw2).yl();
        } else {
            if (stringArray.length != 3 || aw2.Se() == null) {
                throw new bo("commands.setworldspawn.usage", new Object[0]);
            }
            b2 = x.a(aw2, stringArray, 0, true);
        }
        aw2.Se().bd(b2);
        MinecraftServer.afs().alE().H(new f(b2));
        x.a(aw2, (au)this, "commands.setworldspawn.success", b2.wt(), b2.wu(), b2.wx());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? x.a(stringArray, 0, b2) : null;
    }
}

