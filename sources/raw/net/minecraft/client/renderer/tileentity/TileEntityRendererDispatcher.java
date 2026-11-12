/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.tileentity;

import com.google.common.collect.Maps;
import hackclient.rise.agg;
import java.util.Map;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityPistonRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.entity.c;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.ae;
import net.minecraft.tileentity.ag;
import net.minecraft.tileentity.aj;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.j;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.u;
import net.minecraft.tileentity.v;
import net.minecraft.tileentity.w;
import net.minecraft.util.b;
import net.minecraft.util.cl;
import net.optifine.aq;
import net.optifine.reflect.g;

public class TileEntityRendererDispatcher {
    public Map<Class, TileEntitySpecialRenderer> caU = Maps.newHashMap();
    public static TileEntityRendererDispatcher caV = new TileEntityRendererDispatcher();
    public agg bov;
    public static double caW;
    public static double caX;
    public static double caY;
    public TextureManager aIK;
    public net.minecraft.world.w baU;
    public c jM;
    public float caZ;
    public float cba;
    public double cbb;
    public double cbc;
    public double cbd;
    public net.minecraft.tileentity.d cbe;
    private final Tessellator cbf = new Tessellator(0x200000);
    private boolean cbg = false;

    private TileEntityRendererDispatcher() {
        this.caU.put(ag.class, new TileEntitySignRenderer());
        this.caU.put(ab.class, new TileEntityMobSpawnerRenderer());
        this.caU.put(ae.class, new TileEntityPistonRenderer());
        this.caU.put(m.class, new TileEntityChestRenderer());
        this.caU.put(w.class, new TileEntityEnderChestRenderer());
        this.caU.put(u.class, new TileEntityEnchantmentTableRenderer());
        this.caU.put(v.class, new TileEntityEndPortalRenderer());
        this.caU.put(j.class, new TileEntityBeaconRenderer());
        this.caU.put(aj.class, new TileEntitySkullRenderer());
        this.caU.put(h.class, new TileEntityBannerRenderer());
        for (TileEntitySpecialRenderer tileEntitySpecialRenderer : this.caU.values()) {
            tileEntitySpecialRenderer.a(this);
        }
    }

    public <T extends net.minecraft.tileentity.d> TileEntitySpecialRenderer<T> h(Class<? extends net.minecraft.tileentity.d> clazz) {
        TileEntitySpecialRenderer<T> tileEntitySpecialRenderer = this.caU.get(clazz);
        if (tileEntitySpecialRenderer == null && clazz != net.minecraft.tileentity.d.class) {
            tileEntitySpecialRenderer = this.h(clazz.getSuperclass());
            this.caU.put(clazz, tileEntitySpecialRenderer);
        }
        return tileEntitySpecialRenderer;
    }

    public <T extends net.minecraft.tileentity.d> TileEntitySpecialRenderer<T> b(net.minecraft.tileentity.d d2) {
        return d2 != null && !d2.apR() ? this.h(d2.getClass()) : null;
    }

    public void a(net.minecraft.world.w w2, TextureManager textureManager, agg agg2, c c2, float f2) {
        if (this.baU != w2) {
            this.b(w2);
        }
        this.aIK = textureManager;
        this.jM = c2;
        this.bov = agg2;
        this.caZ = c2.crM + (c2.pl - c2.crM) * f2;
        this.cba = c2.crO + (c2.pm - c2.crO) * f2;
        this.cbb = c2.csh + (c2.gW - c2.csh) * (double)f2;
        this.cbc = c2.csi + (c2.gX - c2.csi) * (double)f2;
        this.cbd = c2.csj + (c2.gY - c2.csj) * (double)f2;
    }

    public void a(net.minecraft.tileentity.d d2, float f2) {
        if (d2.M(this.cbb, this.cbc, this.cbd) < d2.apP()) {
            RenderHelper.Lg();
            b b2 = d2.Ab();
            if (!this.baU.b(b2, false)) {
                return;
            }
            this.b(d2, (double)b2.wt() - caW, (double)b2.wu() - caX, (double)b2.wx() - caY, f2, -1);
        }
    }

    public void b(net.minecraft.tileentity.d d2, float f2) {
        if (d2.M(this.cbb, this.cbc, this.cbd) < d2.apP()) {
            GlStateManager.Jy();
            GlStateManager.tR();
            b b2 = d2.Ab();
            if (!this.baU.b(b2, false)) {
                return;
            }
            this.a(d2, (double)b2.wt() - caW, (double)b2.wu() - caX, (double)b2.wx() - caY, f2, -1);
        }
    }

    public void a(net.minecraft.tileentity.d d2, float f2, int n2) {
        if (d2.M(this.cbb, this.cbc, this.cbd) < d2.apP()) {
            b b2;
            boolean bl2 = true;
            if (g.epF.aDA()) {
                boolean bl3 = bl2 = !this.cbg || !g.b((Object)d2, g.epF, new Object[0]);
            }
            if (bl2) {
                RenderHelper.Lg();
                int n3 = this.baU.b(d2.Ab(), 0);
                int n4 = n3 % 65536;
                int n5 = n3 / 65536;
                OpenGlHelper.a(OpenGlHelper.bMJ, (float)n4, (float)n5);
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            }
            if (!this.baU.b(b2 = d2.Ab(), false)) {
                return;
            }
            if (aq.bd()) {
                aq.aBm();
            }
            this.b(d2, (double)b2.wt() - caW, (double)b2.wu() - caX, (double)b2.wx() - caY, f2, n2);
            if (aq.bd()) {
                if (aq.aBn()) {
                    aq.aBo();
                    this.b(d2, (double)b2.wt() - caW, (double)b2.wu() - caX, (double)b2.wx() - caY, f2, n2);
                    aq.aBp();
                }
                aq.aBq();
            }
        }
    }

    public void a(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2) {
        this.b(d2, d3, d4, d5, f2, -1);
    }

    public void b(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        TileEntitySpecialRenderer<net.minecraft.tileentity.d> tileEntitySpecialRenderer = this.b(d2);
        if (tileEntitySpecialRenderer != null) {
            try {
                this.cbe = d2;
                tileEntitySpecialRenderer.b(d2, d3, d4, d5, f2, n2);
                this.cbe = null;
            }
            catch (Throwable throwable) {
                a a2 = a.a(throwable, "Rendering Block Entity");
                i i2 = a2.dY("Block Entity Details");
                d2.b(i2);
                throw new cl(a2);
            }
        }
    }

    public void a(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        TileEntitySpecialRenderer<net.minecraft.tileentity.d> tileEntitySpecialRenderer = this.b(d2);
        if (tileEntitySpecialRenderer != null) {
            try {
                this.cbe = d2;
                tileEntitySpecialRenderer.a(d2, d3, d4, d5, f2, n2);
                this.cbe = null;
            }
            catch (Throwable throwable) {
                a a2 = a.a(throwable, "Rendering Block Entity");
                i i2 = a2.dY("Block Entity Details");
                d2.b(i2);
                throw new cl(a2);
            }
        }
    }

    public void b(net.minecraft.world.w w2) {
        this.baU = w2;
    }

    public agg EA() {
        return this.bov;
    }

    public void OF() {
        this.cbf.Lj().a(7, DefaultVertexFormats.cbv);
        this.cbg = true;
    }

    public void dN(int n2) {
        this.aIK.a(TextureMap.bZE);
        RenderHelper.Lf();
        GlStateManager.P(770, 771);
        GlStateManager.tQ();
        GlStateManager.JI();
        if (d.AX()) {
            GlStateManager.cP(7425);
        } else {
            GlStateManager.cP(7424);
        }
        if (n2 > 0) {
            this.cbf.Lj().l((float)caW, (float)caX, (float)caY);
        }
        this.cbf.pZ();
        RenderHelper.Lg();
        this.cbg = false;
    }
}

