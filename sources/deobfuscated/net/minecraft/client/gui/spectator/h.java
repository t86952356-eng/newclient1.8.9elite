/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.spectator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cp;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.util.ba;
import net.minecraft.util.s;

class h
implements net.minecraft.client.gui.spectator.b {
    private h() {
    }

    @Override
    public void b(f f2) {
        f2.GU();
    }

    @Override
    public ba GP() {
        return new s("Close menu");
    }

    @Override
    public void a(float f2, int n2) {
        Minecraft.getMinecraft().Bq().a(cp.bti);
        b.drawModalRectWithCustomSizedTexture(0.0f, 0.0f, 128.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    @Override
    public boolean GQ() {
        return true;
    }
}

