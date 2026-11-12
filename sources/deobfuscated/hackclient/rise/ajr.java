/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajb;
import hackclient.rise.ajd;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;

public class ajr {
    private final ajb aRc = new ajb("rq.frag", "vertex.vsh");

    public void a(float f2, float f3, float f4, float f5, float f6, Color color, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        int n2 = this.aRc.wd();
        this.aRc.rJ();
        ajd.a(n2, "u_size", f4, f5);
        ajd.a(n2, "u_radius", f6);
        ajd.a(n2, "u_color", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        ajd.a(n2, "u_edges", bl2 ? 1.0f : 0.0f, bl3 ? 1.0f : 0.0f, bl4 ? 1.0f : 0.0f, bl5 ? 1.0f : 0.0f);
        GlStateManager.tQ();
        ajb.h(f2, f3, f4, f5);
        GlStateManager.tR();
        ajb.stop();
    }

    public void b(double d2, double d3, double d4, double d5, double d6, Color color, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, bl2, bl3, bl4, bl5);
    }

    public void d(double d2, double d3, double d4, double d5, double d6, Color color) {
        this.a((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, color, true, true, true, true);
    }
}

