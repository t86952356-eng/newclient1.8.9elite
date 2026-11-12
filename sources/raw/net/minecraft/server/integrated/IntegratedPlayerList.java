/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.server.integrated;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.entity.player.e;
import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.server.management.ServerConfigurationManager;

public class IntegratedPlayerList
extends ServerConfigurationManager {
    private n dlt;

    public IntegratedPlayerList(IntegratedServer integratedServer) {
        super(integratedServer);
        this.hg(10);
    }

    @Override
    protected void j(e e2) {
        if (e2.xU().equals(this.alX().alk())) {
            this.dlt = new n();
            e2.b(this.dlt);
        }
        super.j(e2);
    }

    @Override
    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.alX().alk()) && this.fG(gameProfile.getName()) != null ? "That name is already taken." : super.a(socketAddress, gameProfile);
    }

    public IntegratedServer alX() {
        return (IntegratedServer)super.alZ();
    }

    @Override
    public n alY() {
        return this.dlt;
    }

    @Override
    public /* synthetic */ MinecraftServer alZ() {
        return this.alX();
    }
}

