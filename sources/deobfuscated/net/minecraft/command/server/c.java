/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ay;
import net.minecraft.command.bo;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.IPBanEntry;
import net.minecraft.util.b;
import net.minecraft.util.ba;

public class c
extends a {
    public static final Pattern coR = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public String RX() {
        return "ban-ip";
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
        return "commands.banip.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 1) {
            ba ba2 = stringArray.length >= 2 ? c.a(aw2, stringArray, 1) : null;
            Matcher matcher = coR.matcher(stringArray[0]);
            if (matcher.matches()) {
                this.a(aw2, stringArray[0], ba2 == null ? null : ba2.arq());
            } else {
                e e2 = MinecraftServer.afs().alE().fG(stringArray[0]);
                if (e2 == null) {
                    throw new ay("commands.banip.invalid", new Object[0]);
                }
                this.a(aw2, e2.acs(), ba2 == null ? null : ba2.arq());
            }
        } else {
            throw new bo("commands.banip.usage", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? c.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }

    protected void a(aw aw2, String string, String string2) {
        IPBanEntry iPBanEntry = new IPBanEntry(string, null, aw2.xU(), null, string2);
        MinecraftServer.afs().alE().amr().a(iPBanEntry);
        List<e> list = MinecraftServer.afs().alE().fH(string);
        Object[] objectArray = new String[list.size()];
        int n2 = 0;
        for (e e2 : list) {
            e2.cIX.eQ("You have been IP banned.");
            objectArray[n2++] = e2.xU();
        }
        if (list.isEmpty()) {
            c.a(aw2, (au)this, "commands.banip.success", string);
        } else {
            c.a(aw2, (au)this, "commands.banip.success.players", string, c.b(objectArray));
        }
    }
}

