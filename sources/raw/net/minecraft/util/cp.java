/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.util;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import net.minecraft.util.cq;

public class cp {
    private final String dzR;
    private final String dzS;
    private final String dzT;
    private final cq dzU;

    public cp(String string, String string2, String string3, String string4) {
        this.dzR = string;
        this.dzS = string2;
        this.dzT = string3;
        this.dzU = cq.gl(string4);
    }

    public String atD() {
        return "token:" + this.dzT + ":" + this.dzS;
    }

    public String getPlayerID() {
        return this.dzS;
    }

    public String bX() {
        return this.dzR;
    }

    public String atE() {
        return this.dzT;
    }

    public GameProfile afK() {
        try {
            UUID uUID = UUIDTypeAdapter.fromString((String)this.getPlayerID());
            return new GameProfile(uUID, this.bX());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile(null, this.bX());
        }
    }

    public cq atF() {
        return this.dzU;
    }
}

