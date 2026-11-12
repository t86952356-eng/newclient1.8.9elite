/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net.minecraft.tileentity;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.network.play.server.bf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.d;
import net.minecraft.util.ct;

public class aj
extends d {
    private int dtE;
    private int dtF;
    private GameProfile dtG = null;

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.a("SkullType", (byte)(this.dtE & 0xFF));
        n2.a("Rot", (byte)(this.dtF & 0xFF));
        if (this.dtG != null) {
            n n3 = new n();
            aa.a(n3, this.dtG);
            n2.b("Owner", n3);
        }
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dtE = n2.eE("SkullType");
        this.dtF = n2.eE("Rot");
        if (this.dtE == 3) {
            String string;
            if (n2.C("Owner", 10)) {
                this.dtG = aa.x(n2.eN("Owner"));
            } else if (n2.C("ExtraType", 8) && !ct.cU(string = n2.eK("ExtraType"))) {
                this.dtG = new GameProfile(null, string);
                this.aqS();
            }
        }
    }

    public GameProfile aqR() {
        return this.dtG;
    }

    @Override
    public net.minecraft.network.aj apQ() {
        n n2 = new n();
        this.b(n2);
        return new bf(this.aZf, 4, n2);
    }

    public void ho(int n2) {
        this.dtE = n2;
        this.dtG = null;
    }

    public void s(GameProfile gameProfile) {
        this.dtE = 3;
        this.dtG = gameProfile;
        this.aqS();
    }

    private void aqS() {
        this.dtG = aj.t(this.dtG);
        this.Lw();
    }

    public static GameProfile t(GameProfile gameProfile) {
        if (gameProfile != null && !ct.cU(gameProfile.getName())) {
            if (gameProfile.isComplete() && gameProfile.getProperties().containsKey((Object)"textures")) {
                return gameProfile;
            }
            if (MinecraftServer.afs() == null) {
                return gameProfile;
            }
            GameProfile gameProfile2 = MinecraftServer.afs().alS().fE(gameProfile.getName());
            if (gameProfile2 == null) {
                return gameProfile;
            }
            Property property = (Property)Iterables.getFirst((Iterable)gameProfile2.getProperties().get((Object)"textures"), null);
            if (property == null) {
                gameProfile2 = MinecraftServer.afs().alQ().fillProfileProperties(gameProfile2, true);
            }
            return gameProfile2;
        }
        return gameProfile;
    }

    public int aqT() {
        return this.dtE;
    }

    public int aqU() {
        return this.dtF;
    }

    public void hp(int n2) {
        this.dtF = n2;
    }
}

