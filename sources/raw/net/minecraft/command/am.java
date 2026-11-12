/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package net.minecraft.command;

import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bn;
import net.minecraft.command.bo;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.ca;
import net.minecraft.network.play.server.cb;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.m;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class am
extends a {
    private static final Logger cop = LogManager.getLogger();

    @Override
    public String RX() {
        return "title";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.title.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new bo("commands.title.usage", new Object[0]);
        }
        if (stringArray.length < 3) {
            if ("title".equals(stringArray[1]) || "subtitle".equals(stringArray[1])) {
                throw new bo("commands.title.usage.title", new Object[0]);
            }
            if ("times".equals(stringArray[1])) {
                throw new bo("commands.title.usage.times", new Object[0]);
            }
        }
        e e2 = am.a(aw2, stringArray[0]);
        cb cb2 = cb.eV(stringArray[1]);
        if (cb2 != cb.dfJ && cb2 != cb.dfK) {
            if (cb2 == cb.dfI) {
                if (stringArray.length != 5) {
                    throw new bo("commands.title.usage", new Object[0]);
                }
                int n2 = am.dM(stringArray[2]);
                int n3 = am.dM(stringArray[3]);
                int n4 = am.dM(stringArray[4]);
                ca ca2 = new ca(n2, n3, n4);
                e2.cIX.B(ca2);
                am.a(aw2, (au)this, "commands.title.success", new Object[0]);
            } else {
                ba ba2;
                if (stringArray.length < 3) {
                    throw new bo("commands.title.usage", new Object[0]);
                }
                String string = am.c(stringArray, 2);
                try {
                    ba2 = bb.gi(string);
                }
                catch (JsonParseException jsonParseException) {
                    Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
                    throw new bn("commands.tellraw.jsonException", throwable == null ? "" : throwable.getMessage());
                }
                ca ca3 = new ca(cb2, m.a(aw2, ba2, e2));
                e2.cIX.B(ca3);
                am.a(aw2, (au)this, "commands.title.success", new Object[0]);
            }
        } else {
            if (stringArray.length != 2) {
                throw new bo("commands.title.usage", new Object[0]);
            }
            ca ca4 = new ca(cb2, null);
            e2.cIX.B(ca4);
            am.a(aw2, (au)this, "commands.title.success", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? am.a(stringArray, MinecraftServer.afs().Sa()) : (stringArray.length == 2 ? am.a(stringArray, cb.air()) : null);
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

