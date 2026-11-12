/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network;

import com.mojang.authlib.GameProfile;

public class ar {
    private final int maxPlayers;
    private final int daF;
    private GameProfile[] daG;

    public ar(int n2, int n3) {
        this.maxPlayers = n2;
        this.daF = n3;
    }

    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    public int afG() {
        return this.daF;
    }

    public GameProfile[] afH() {
        return this.daG;
    }

    public void a(GameProfile[] gameProfileArray) {
        this.daG = gameProfileArray;
    }
}

