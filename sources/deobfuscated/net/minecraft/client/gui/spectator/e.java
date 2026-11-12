/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.gui.spectator;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.a;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.play.client.ac;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.util.s;

public class e
implements b {
    private final GameProfile bxn;
    private final cm bxo;

    public e(GameProfile gameProfile) {
        this.bxn = gameProfile;
        this.bxo = a.cE(gameProfile.getName());
        a.a(this.bxo, gameProfile.getName());
    }

    @Override
    public void b(f f2) {
        Minecraft.getMinecraft().AU().u(new ac(this.bxn.getId()));
    }

    @Override
    public ba GP() {
        return new s(this.bxn.getName());
    }

    @Override
    public void a(float f2, int n2) {
        Minecraft.getMinecraft().Bq().a(this.bxo);
        GlStateManager.e(1.0f, 1.0f, 1.0f, (float)n2 / 255.0f);
        net.minecraft.client.gui.b.drawScaledCustomSizeModalRect(2.0, 2.0, 8.0f, 8.0f, 8.0f, 8.0f, 12.0, 12.0, 64.0f, 64.0f);
        net.minecraft.client.gui.b.drawScaledCustomSizeModalRect(2.0, 2.0, 40.0f, 8.0f, 8.0f, 8.0f, 12.0, 12.0, 64.0f, 64.0f);
    }

    @Override
    public boolean GQ() {
        return true;
    }
}

