/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.c;
import net.minecraft.client.gui.spectator.categories.a;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class cp
extends net.minecraft.client.gui.b
implements c {
    private static final cm bth = new cm("textures/gui/widgets.png");
    public static final cm bti = new cm("textures/gui/spectator_widgets.png");
    private final d btj;
    private long btk;
    private f btl;

    public cp(d d2) {
        this.btj = d2;
    }

    public void bO(int n2) {
        this.btk = d.Bj();
        if (this.btl != null) {
            this.btl.cj(n2);
        } else {
            this.btl = new f(this);
        }
    }

    private float FY() {
        long l2 = this.btk - d.Bj() + 5000L;
        return bt.I((float)l2 / 2000.0f, 0.0f, 1.0f);
    }

    public void a(cz cz2, float f2) {
        if (this.btl != null) {
            float f3 = this.FY();
            if (f3 <= 0.0f) {
                this.btl.GU();
            } else {
                int n2 = cz2.getScaledWidth() / 2;
                float f4 = zLevel;
                zLevel = -90.0f;
                float f5 = (float)cz2.getScaledHeight() - 22.0f * f3;
                a a2 = this.btl.GW();
                this.a(cz2, f3, n2, f5, a2);
                zLevel = f4;
            }
        }
    }

    protected void a(cz cz2, float f2, int n2, float f3, a a2) {
        GlStateManager.JS();
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
        this.btj.Bq().a(bth);
        this.drawTexturedModalRect((float)(n2 - 91), f3, 0, 0, 182, 22);
        if (a2.GX() >= 0) {
            this.drawTexturedModalRect((float)(n2 - 91 - 1 + a2.GX() * 20), f3 - 1.0f, 0, 22, 24, 22);
        }
        RenderHelper.Lh();
        for (int i2 = 0; i2 < 9; ++i2) {
            this.a(i2, cz2.getScaledWidth() / 2 - 90 + i2 * 20 + 2, f3 + 3.0f, f2, a2.ck(i2));
        }
        RenderHelper.Lf();
        GlStateManager.JT();
        GlStateManager.tR();
    }

    private void a(int n2, int n3, float f2, float f3, b b2) {
        this.btj.Bq().a(bti);
        if (b2 != f.bxt) {
            int n4 = (int)(f3 * 255.0f);
            GlStateManager.JV();
            GlStateManager.j(n3, f2, 0.0f);
            float f4 = b2.GQ() ? 1.0f : 0.25f;
            GlStateManager.e(f4, f4, f4, f3);
            b2.a(f4, n4);
            GlStateManager.JW();
            String string = String.valueOf(net.minecraft.client.settings.a.dY(this.btj.aIY.chK[n2].cO()));
            if (n4 > 3 && b2.GQ()) {
                this.btj.fontRendererObj.b(string, n3 + 19 - 2 - this.btj.fontRendererObj.bQ(string), f2 + 6.0f + 3.0f, 0xFFFFFF + (n4 << 24));
            }
        }
    }

    public void k(cz cz2) {
        int n2 = (int)(this.FY() * 255.0f);
        if (n2 > 3 && this.btl != null) {
            String string;
            b b2 = this.btl.GS();
            String string2 = string = b2 != f.bxt ? b2.GP().getFormattedText() : this.btl.GT().GO().getFormattedText();
            if (string != null) {
                int n3 = (cz2.getScaledWidth() - this.btj.fontRendererObj.bQ(string)) / 2;
                int n4 = cz2.getScaledHeight() - 35;
                GlStateManager.JV();
                GlStateManager.tQ();
                GlStateManager.h(770, 771, 1, 0);
                this.btj.fontRendererObj.b(string, n3, n4, 0xFFFFFF + (n2 << 24));
                GlStateManager.tR();
                GlStateManager.JW();
            }
        }
    }

    @Override
    public void a(f f2) {
        this.btl = null;
        this.btk = 0L;
    }

    public boolean FZ() {
        return this.btl != null;
    }

    public void bP(int n2) {
        int n3;
        for (n3 = this.btl.GV() + n2; !(n3 < 0 || n3 > 8 || this.btl.ci(n3) != f.bxt && this.btl.ci(n3).GQ()); n3 += n2) {
        }
        if (n3 >= 0 && n3 <= 8) {
            this.btl.cj(n3);
            this.btk = d.Bj();
        }
    }

    public void Ga() {
        this.btk = d.Bj();
        if (this.FZ()) {
            int n2 = this.btl.GV();
            if (n2 != -1) {
                this.btl.cj(n2);
            }
        } else {
            this.btl = new f(this);
        }
    }
}

