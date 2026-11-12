/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network.login.server;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.login.a;

public class c
implements aj<a> {
    private GameProfile bxn;

    public c() {
    }

    public c(GameProfile gameProfile) {
        this.bxn = gameProfile;
    }

    @Override
    public void a(ak ak2) {
        String string = ak2.gs(36);
        String string2 = ak2.gs(16);
        UUID uUID = UUID.fromString(string);
        this.bxn = new GameProfile(uUID, string2);
    }

    @Override
    public void b(ak ak2) {
        UUID uUID = this.bxn.getId();
        ak2.eS(uUID == null ? "" : uUID.toString());
        ak2.eS(this.bxn.getName());
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public GameProfile afK() {
        return this.bxn;
    }
}

