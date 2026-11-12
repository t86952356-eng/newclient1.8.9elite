/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.rcon;

import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.entity.c;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.da;
import net.minecraft.util.s;
import net.minecraft.world.w;

public class a
implements aw {
    private static final a dfO = new a();
    private final StringBuffer dfP = new StringBuffer();

    @Override
    public String xU() {
        return "Rcon";
    }

    @Override
    public ba xW() {
        return new s(this.xU());
    }

    @Override
    public void a(ba ba2) {
        this.dfP.append(ba2.arq());
    }

    @Override
    public boolean c(int n2, String string) {
        return true;
    }

    @Override
    public b yl() {
        return new b(0, 0, 0);
    }

    @Override
    public da Sd() {
        return new da(0.0, 0.0, 0.0);
    }

    @Override
    public w Se() {
        return MinecraftServer.afs().Se();
    }

    @Override
    public c Sf() {
        return null;
    }

    @Override
    public boolean Sg() {
        return true;
    }

    @Override
    public void a(ad ad2, int n2) {
    }
}

