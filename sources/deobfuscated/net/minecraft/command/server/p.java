/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bn;
import net.minecraft.command.bo;
import net.minecraft.command.server.c;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class p
extends a {
    @Override
    public String RX() {
        return "pardon-ip";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public boolean a(aw aw2) {
        return MinecraftServer.afs().alE().amr().amC() && super.a(aw2);
    }

    @Override
    public String c(aw aw2) {
        return "commands.unbanip.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length == 1 && stringArray[0].length() > 1) {
            Matcher matcher = c.coR.matcher(stringArray[0]);
            if (!matcher.matches()) {
                throw new bn("commands.unbanip.invalid", new Object[0]);
            }
        } else {
            throw new bo("commands.unbanip.usage", new Object[0]);
        }
        MinecraftServer.afs().alE().amr().s(stringArray[0]);
        p.a(aw2, (au)this, "commands.unbanip.success", stringArray[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? p.a(stringArray, MinecraftServer.afs().alE().amr().amD()) : null;
    }
}

