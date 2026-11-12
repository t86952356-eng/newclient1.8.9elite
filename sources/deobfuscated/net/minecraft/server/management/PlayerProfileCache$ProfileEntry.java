/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.server.management;

import com.mojang.authlib.GameProfile;
import java.util.Date;
import net.minecraft.server.management.PlayerProfileCache;

class PlayerProfileCache$ProfileEntry {
    private final GameProfile dmu;
    private final Date dmv;

    private PlayerProfileCache$ProfileEntry(PlayerProfileCache playerProfileCache, GameProfile gameProfile, Date date) {
        this.dmu = gameProfile;
        this.dmv = date;
    }

    public GameProfile Ie() {
        return this.dmu;
    }

    public Date amn() {
        return this.dmv;
    }
}

