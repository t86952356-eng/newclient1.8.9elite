/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.j;
import net.minecraft.entity.c;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.ac;
import net.minecraft.world.ai;
import net.minecraft.world.chunk.e;

public class n {
    public static ai amk() {
        Minecraft minecraft = a.AZ();
        j j2 = minecraft.bgF;
        if (j2 == null) {
            return null;
        }
        if (!minecraft.Bf()) {
            return null;
        }
        IntegratedServer integratedServer = minecraft.Bg();
        if (integratedServer == null) {
            return null;
        }
        ac ac2 = j2.dDl;
        if (ac2 == null) {
            return null;
        }
        int n2 = ac2.getDimensionId();
        try {
            ai ai2 = integratedServer.ha(n2);
            return ai2;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static c o(UUID uUID) {
        ai ai2 = n.amk();
        if (ai2 == null) {
            return null;
        }
        c c2 = ai2.j(uUID);
        return c2;
    }

    public static d K(b b2) {
        ai ai2 = n.amk();
        if (ai2 == null) {
            return null;
        }
        net.minecraft.world.chunk.a a2 = ai2.avF().H(b2.wt() >> 4, b2.wx() >> 4);
        if (a2 == null) {
            return null;
        }
        d d2 = a2.a(b2, e.dJh);
        return d2;
    }
}

