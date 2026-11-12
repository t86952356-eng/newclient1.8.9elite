/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dq;
import hackclient.rise.er;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.util.an;
import org.apache.commons.lang3.StringUtils;
import rip.vantage.commons.packet.impl.client.community.b;
import rip.vantage.commons.util.vantage.a;

@gl(aliases={"module.other.irc.name"}, description="module.other.irc.description", category=gj.RENDER, autoEnabled=true)
public final class rw
extends gi {
    private static final String UX = "[Rise] ";
    private static final String[] UY = new String[]{".png", ".jpg", ".jpeg", ".gif", ".webp", ".bmp"};
    @dm
    public final dk<dq> UZ = dq2 -> {
        String string = dq2.getMessage();
        if (string.startsWith("#") && string.length() > 1) {
            dq2.cF();
            string = StringUtils.normalizeSpace((String)string.substring(1));
            rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new b(string).aJz());
        }
    };
    @dm
    public final dk<er> Va = er2 -> {
        if (!(er2.dd() instanceof rip.vantage.commons.packet.impl.server.community.b)) {
            return;
        }
        rip.vantage.commons.packet.impl.server.community.b b2 = (rip.vantage.commons.packet.impl.server.community.b)er2.dd();
        a a2 = a.values()[b2.aJK()];
        String string = b2.getMessage();
        String string2 = "\u00a7" + b2.getAuthor();
        String string3 = String.valueOf((Object)an.dvS) + string;
        if (this.B(string)) {
            afl.d(afl.getPrefix() + String.valueOf((Object)an.dvX) + "Discord attachment URL arrived truncated before the client. The bridge/backend must send the full link.", new Object[0]);
        }
        String string4 = Math.random() > 0.9 ? String.valueOf((Object)an.dvS) + " Start your msg with # to chat" : "";
        afl.d(UX + string2 + String.valueOf((Object)an.dvS) + ": " + string3 + string4, new Object[0]);
    };

    private boolean B(String string) {
        if (string == null) {
            return false;
        }
        String string2 = string.toLowerCase();
        if (!string2.contains("discordapp.com/attachments/") && !string2.contains("discord.com/attachments/")) {
            return false;
        }
        for (String string3 : UY) {
            if (!string2.contains(string3)) continue;
            return false;
        }
        return true;
    }
}

