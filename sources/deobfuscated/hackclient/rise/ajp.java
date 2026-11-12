/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajb;
import hackclient.rise.ajd;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;

public class ajp {
    private final ajb aRa = new ajb("rogq.frag", "vertex.vsh");

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, Color color, Color color2) {
        int n2 = this.aRa.wd();
        this.aRa.rJ();
        ajd.a(n2, "u_size", f4, f5);
        ajd.a(n2, "u_radius", f6);
        ajd.a(n2, "u_border_size", f7);
        ajd.a(n2, "u_color_1", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        ajd.a(n2, "u_color_2", (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        ajb.h(f2, f3, f4, f5);
        GlStateManager.tR();
        ajb.stop();
    }

    public void b(double d2, double d3, double d4, double d5, double d6, double d7, Color color, Color color2) {
        this.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, color, color2);
    }
}

