/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.management;

import net.minecraft.network.play.server.by;
import net.minecraft.network.play.server.bz;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.world.border.b;
import net.minecraft.world.border.c;

class ServerConfigurationManager$1
implements b {
    final /* synthetic */ ServerConfigurationManager dmX;

    ServerConfigurationManager$1(ServerConfigurationManager serverConfigurationManager) {
        this.dmX = serverConfigurationManager;
    }

    @Override
    public void a(c c2, double d2) {
        this.dmX.H(new by(c2, bz.dfv));
    }

    @Override
    public void a(c c2, double d2, double d3, long l2) {
        this.dmX.H(new by(c2, bz.dfw));
    }

    @Override
    public void a(c c2, double d2, double d3) {
        this.dmX.H(new by(c2, bz.dfx));
    }

    @Override
    public void a(c c2, int n2) {
        this.dmX.H(new by(c2, bz.dfz));
    }

    @Override
    public void b(c c2, int n2) {
        this.dmX.H(new by(c2, bz.dfA));
    }

    @Override
    public void b(c c2, double d2) {
    }

    @Override
    public void c(c c2, double d2) {
    }
}

