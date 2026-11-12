/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Properties;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.ai;

public class ah {
    private final cm ebk;
    private int ebl = 0;
    private int ebm = 2;
    private final boolean ebn;
    private static final int ebo = 2;
    private static final int ebp = 0;
    private static final int ebq = 1;
    private static final int ebr = 2;

    public ah(cm cm2, int n2, int n3, boolean bl2) {
        this.ebk = cm2;
        this.ebl = n2;
        this.ebm = n3;
        this.ebn = bl2;
    }

    public static ah a(String string, int n2, Properties properties) {
        cm cm2 = new cm(string);
        int n3 = ah.hE(ah.b("scaleMode", n2, properties));
        int n4 = n3 == 0 ? 2 : 1;
        int n5 = ah.J(ah.b("scale", n2, properties), n4);
        boolean bl2 = a.p(ah.b("center", n2, properties), false);
        ah ah2 = new ah(cm2, n3, n5, bl2);
        return ah2;
    }

    private static String b(String string, int n2, Properties properties) {
        if (properties == null) {
            return null;
        }
        String string2 = properties.getProperty("dim" + n2 + "." + string);
        if (string2 != null) {
            return string2;
        }
        string2 = properties.getProperty(string);
        return string2;
    }

    private static int hE(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.toLowerCase().trim()).equals("fixed")) {
            return 0;
        }
        if (string.equals("full")) {
            return 1;
        }
        if (string.equals("stretch")) {
            return 2;
        }
        ai.warn("Invalid scale mode: " + string);
        return 0;
    }

    private static int J(String string, int n2) {
        if (string == null) {
            return n2;
        }
        int n3 = a.x(string = string.trim(), -1);
        if (n3 < 1) {
            ai.warn("Invalid scale: " + string);
            return n2;
        }
        return n3;
    }

    public void bE(int n2, int n3) {
        GlStateManager.JA();
        GlStateManager.JG();
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        a.Bq().a(this.ebk);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        double d2 = 16 * this.ebm;
        double d3 = (double)n2 / d2;
        double d4 = (double)n3 / d2;
        double d5 = 0.0;
        double d6 = 0.0;
        if (this.ebn) {
            d5 = (d2 - (double)n2) / (d2 * 2.0);
            d6 = (d2 - (double)n3) / (d2 * 2.0);
        }
        switch (this.ebl) {
            case 1: {
                d2 = Math.max(n2, n3);
                d3 = (double)(this.ebm * n2) / d2;
                d4 = (double)(this.ebm * n3) / d2;
                if (!this.ebn) break;
                d5 = (double)this.ebm * (d2 - (double)n2) / (d2 * 2.0);
                d6 = (double)this.ebm * (d2 - (double)n3) / (d2 * 2.0);
                break;
            }
            case 2: {
                d3 = this.ebm;
                d4 = this.ebm;
                d5 = 0.0;
                d6 = 0.0;
            }
        }
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(0.0, n3, 0.0).r(d5, d6 + d4).s(255, 255, 255, 255).Lx();
        worldRenderer.F(n2, n3, 0.0).r(d5 + d3, d6 + d4).s(255, 255, 255, 255).Lx();
        worldRenderer.F(n2, 0.0, 0.0).r(d5 + d3, d6).s(255, 255, 255, 255).Lx();
        worldRenderer.F(0.0, 0.0, 0.0).r(d5, d6).s(255, 255, 255, 255).Lx();
        tessellator.pZ();
    }
}

