/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network.login.client;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.login.b;

public class a
implements aj<b> {
    private GameProfile bxn;

    public a() {
    }

    public a(GameProfile gameProfile) {
        this.bxn = gameProfile;
    }

    @Override
    public void a(ak ak2) {
        this.bxn = new GameProfile(null, ak2.gs(16));
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.bxn.getName());
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public GameProfile afK() {
        return this.bxn;
    }
}

