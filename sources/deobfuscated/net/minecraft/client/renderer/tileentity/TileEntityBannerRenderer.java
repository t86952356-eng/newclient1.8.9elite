/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.tileentity;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.LayeredColorMaskTexture;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer$TimedBannerTexture;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.i;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class TileEntityBannerRenderer
extends TileEntitySpecialRenderer<h> {
    private static final Map<String, TileEntityBannerRenderer$TimedBannerTexture> car = Maps.newHashMap();
    private static final cm cas = new cm("textures/entity/banner_base.png");
    private final c cat = new c();

    @Override
    public void a(h h2, double d2, double d3, double d4, float f2, int n2) {
        boolean bl2 = h2.de() != null;
        boolean bl3 = !bl2 || h2.ahl() == Blocks.cOM;
        int n3 = bl2 ? h2.zg() : 0;
        long l2 = bl2 ? h2.de().getTotalWorldTime() : 0L;
        GlStateManager.JV();
        float f3 = 0.6666667f;
        if (bl3) {
            GlStateManager.j((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            var16_12 = (float)(n3 * 360) / 16.0f;
            GlStateManager.d(-var16_12, 0.0f, 1.0f, 0.0f);
            this.cat.bym.bBL = true;
        } else {
            var16_12 = 0.0f;
            if (n3 == 2) {
                var16_12 = 180.0f;
            }
            if (n3 == 4) {
                var16_12 = 90.0f;
            }
            if (n3 == 5) {
                var16_12 = -90.0f;
            }
            GlStateManager.j((float)d2 + 0.5f, (float)d3 - 0.16666667f, (float)d4 + 0.5f);
            GlStateManager.d(-var16_12, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.0f, -0.3125f, -0.4375f);
            this.cat.bym.bBL = false;
        }
        b b2 = h2.Ab();
        float f4 = (float)(b2.wt() * 7 + b2.wu() * 9 + b2.wx() * 13) + (float)l2 + f2;
        this.cat.byl.bBF = (-0.0125f + 0.01f * bt.bB(f4 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        GlStateManager.JS();
        cm cm2 = this.a(h2);
        if (cm2 != null) {
            this.a(cm2);
            GlStateManager.JV();
            GlStateManager.i(0.6666667f, -0.6666667f, -0.6666667f);
            this.cat.GY();
            GlStateManager.JW();
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JW();
    }

    @Override
    public void b(h h2, double d2, double d3, double d4, float f2, int n2) {
    }

    private cm a(h h2) {
        String string = h2.aqa();
        if (string.isEmpty()) {
            return null;
        }
        TileEntityBannerRenderer$TimedBannerTexture tileEntityBannerRenderer$TimedBannerTexture = car.get(string);
        if (tileEntityBannerRenderer$TimedBannerTexture == null) {
            Object object;
            if (car.size() >= 256) {
                long l2 = System.currentTimeMillis();
                object = car.keySet().iterator();
                while (object.hasNext()) {
                    String string2 = (String)object.next();
                    TileEntityBannerRenderer$TimedBannerTexture object2 = car.get(string2);
                    if (l2 - object2.bgf <= 60000L) continue;
                    Minecraft.getMinecraft().Bq().l(object2.cau);
                    object.remove();
                }
                if (car.size() >= 256) {
                    return null;
                }
            }
            List<i> list = h2.apX();
            List<net.minecraft.item.b> list2 = h2.apZ();
            object = Lists.newArrayList();
            for (i i2 : list) {
                object.add("textures/entity/banner/" + i2.aqc() + ".png");
            }
            tileEntityBannerRenderer$TimedBannerTexture = new TileEntityBannerRenderer$TimedBannerTexture();
            tileEntityBannerRenderer$TimedBannerTexture.cau = new cm(string);
            Minecraft.getMinecraft().Bq().a(tileEntityBannerRenderer$TimedBannerTexture.cau, new LayeredColorMaskTexture(cas, (List<String>)object, list2));
            car.put(string, tileEntityBannerRenderer$TimedBannerTexture);
        }
        tileEntityBannerRenderer$TimedBannerTexture.bgf = System.currentTimeMillis();
        return tileEntityBannerRenderer$TimedBannerTexture.cau;
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((h)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((h)d2, d3, d4, d5, f2, n2);
    }
}

