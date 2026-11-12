/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajb;
import hackclient.rise.ajd;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public final class ajo {
    private final ajb aQZ = new ajb("rgqtest.glsl", "vertex.vsh");

    public void a(float f2, float f3, float f4, float f5, float f6, Color color, Color color2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        int n2 = this.aQZ.wd();
        this.aQZ.rJ();
        ajd.a(n2, "u_size", f4, f5);
        ajd.a(n2, "u_radius", f6);
        ajd.a(n2, "u_first_color", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        ajd.a(n2, "u_second_color", (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f);
        ajd.a(n2, "u_direction", bl2 ? 1 : 0);
        ajd.a(n2, "u_time", (float)(System.currentTimeMillis() - Minecraft.getMinecraft().BM()) / 1000.0f);
        ajd.a(n2, "u_edges", bl3 ? 1.0f : 0.0f, bl4 ? 1.0f : 0.0f, bl5 ? 1.0f : 0.0f, bl6 ? 1.0f : 0.0f);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        ajb.h(f2, f3, f4, f5);
        GlStateManager.tR();
        ajb.stop();
    }

    public void c(double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl2) {
        this.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, color2, bl2, true, true, true, true);
    }
}

