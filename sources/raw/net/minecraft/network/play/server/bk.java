/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network.play.server;

import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.play.server.bi;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.world.ao;

public class bk {
    private final int deE;
    private final ao deF;
    private final GameProfile deG;
    private ba bFo;

    public bk(bi bi2, GameProfile gameProfile, int n2, ao ao2, ba ba2) {
        this.deG = gameProfile;
        this.deE = n2;
        this.deF = ao2;
        this.bFo = ba2;
    }

    public GameProfile afK() {
        return this.deG;
    }

    public int aG() {
        return this.deE;
    }

    public ao ahQ() {
        return this.deF;
    }

    public ba xW() {
        return this.bFo;
    }

    public void g(ba ba2) {
        this.bFo = ba2;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("latency", this.deE).add("gameMode", (Object)this.deF).add("profile", (Object)this.deG).add("displayName", this.bFo == null ? null : bb.q(this.bFo)).toString();
    }
}

