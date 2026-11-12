/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package net.minecraft.command.server;

import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.command.bn;
import net.minecraft.command.bo;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.m;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class n
extends a {
    @Override
    public String RX() {
        return "tellraw";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.tellraw.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new bo("commands.tellraw.usage", new Object[0]);
        }
        e e2 = n.a(aw2, stringArray[0]);
        String string = n.c(stringArray, 1);
        try {
            ba ba2 = bb.gi(string);
            ((c)e2).a(m.a(aw2, ba2, e2));
        }
        catch (JsonParseException jsonParseException) {
            Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
            throw new bn("commands.tellraw.jsonException", throwable == null ? "" : throwable.getMessage());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? n.a(stringArray, MinecraftServer.afs().Sa()) : null;
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

