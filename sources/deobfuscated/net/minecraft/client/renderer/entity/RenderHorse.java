/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.entity;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.u;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderHorse
extends RenderLiving<f> {
    private static final Map<String, cm> bVa = Maps.newHashMap();
    private static final cm bVb = new cm("textures/entity/horse/horse_white.png");
    private static final cm bVc = new cm("textures/entity/horse/mule.png");
    private static final cm bVd = new cm("textures/entity/horse/donkey.png");
    private static final cm bVe = new cm("textures/entity/horse/horse_zombie.png");
    private static final cm bVf = new cm("textures/entity/horse/horse_skeleton.png");

    public RenderHorse(RenderManager renderManager, u u2, float f2) {
        super(renderManager, u2, f2);
    }

    @Override
    protected void a(f f2, float f3) {
        float f4 = 1.0f;
        int n2 = f2.ZX();
        if (n2 == 1) {
            f4 *= 0.87f;
        } else if (n2 == 2) {
            f4 *= 0.92f;
        }
        GlStateManager.i(f4, f4, f4);
        super.c(f2, f3);
    }

    protected cm a(f f2) {
        if (!f2.aav()) {
            switch (f2.ZX()) {
                default: {
                    return bVb;
                }
                case 1: {
                    return bVd;
                }
                case 2: {
                    return bVc;
                }
                case 3: {
                    return bVe;
                }
                case 4: 
            }
            return bVf;
        }
        return this.b(f2);
    }

    private cm b(f f2) {
        String string = f2.aaz();
        if (!f2.aax()) {
            return null;
        }
        cm cm2 = bVa.get(string);
        if (cm2 == null) {
            cm2 = new cm(string);
            Minecraft.getMinecraft().Bq().a(cm2, new LayeredTexture(f2.aaA()));
            bVa.put(string, cm2);
        }
        return cm2;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((f)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((f)c2);
    }
}

