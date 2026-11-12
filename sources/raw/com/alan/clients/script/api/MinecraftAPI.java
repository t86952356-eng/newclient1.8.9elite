/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.API;
import net.minecraft.client.d;

public class MinecraftAPI
extends API {
    public int getDisplayWidth() {
        return MinecraftAPI.MC.bgz;
    }

    public int getDisplayHeight() {
        return MinecraftAPI.MC.bgA;
    }

    public float getTimerSpeed() {
        return MinecraftAPI.MC.Bm().dAp;
    }

    public void setTimerSpeed(float f2) {
        MinecraftAPI.MC.Bm().dAp = f2;
    }

    public float getPartialTicks() {
        return MinecraftAPI.MC.bgC.dAq;
    }

    public float getRenderPartialTicks() {
        return MinecraftAPI.MC.bgC.bWY;
    }

    public int getFPS() {
        return d.BI();
    }
}

