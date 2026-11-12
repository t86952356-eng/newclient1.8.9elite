/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.r;
import net.optifine.expr.f;
import net.optifine.expr.m;

public final class h
extends Enum<h>
implements m {
    public static final /* enum */ h egT = new h("is_alive");
    public static final /* enum */ h egU = new h("is_burning");
    public static final /* enum */ h egV = new h("is_child");
    public static final /* enum */ h egW = new h("is_glowing");
    public static final /* enum */ h egX = new h("is_hurt");
    public static final /* enum */ h egY = new h("is_in_lava");
    public static final /* enum */ h egZ = new h("is_in_water");
    public static final /* enum */ h eha = new h("is_invisible");
    public static final /* enum */ h ehb = new h("is_on_ground");
    public static final /* enum */ h ehc = new h("is_ridden");
    public static final /* enum */ h ehd = new h("is_riding");
    public static final /* enum */ h ehe = new h("is_sneaking");
    public static final /* enum */ h ehf = new h("is_sprinting");
    public static final /* enum */ h ehg = new h("is_wet");
    private final String name;
    private final RenderManager ehi;
    private static final h[] ehj;
    private static final /* synthetic */ h[] ehk;

    public static h[] values() {
        return (h[])ehk.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private h(String string2) {
        this.name = string2;
        this.ehi = Minecraft.getMinecraft().BF();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public f aCq() {
        return f.ehQ;
    }

    @Override
    public boolean aCt() {
        Render render = this.ehi.bVM;
        if (render == null) {
            return false;
        }
        if (render instanceof RendererLivingEntity) {
            RendererLivingEntity rendererLivingEntity = (RendererLivingEntity)render;
            r r2 = rendererLivingEntity.bWR;
            if (r2 == null) {
                return false;
            }
            switch (this.ordinal()) {
                case 0: {
                    return r2.TS();
                }
                case 1: {
                    return r2.isBurning();
                }
                case 2: {
                    return r2.Uz();
                }
                case 4: {
                    return r2.cus > 0;
                }
                case 5: {
                    return r2.isInLava();
                }
                case 6: {
                    return r2.isInWater();
                }
                case 7: {
                    return r2.isInvisible();
                }
                case 8: {
                    return r2.aO;
                }
                case 9: {
                    return r2.crA != null;
                }
                case 10: {
                    return r2.isRiding();
                }
                case 11: {
                    return r2.isSneaking();
                }
                case 12: {
                    return r2.isSprinting();
                }
                case 13: {
                    return r2.TG();
                }
            }
        }
        return false;
    }

    public static h id(String string) {
        if (string == null) {
            return null;
        }
        for (int i2 = 0; i2 < ehj.length; ++i2) {
            h h2 = ehj[i2];
            if (!h2.getName().equals(string)) continue;
            return h2;
        }
        return null;
    }

    private static /* synthetic */ h[] aCu() {
        return new h[]{egT, egU, egV, egW, egX, egY, egZ, eha, ehb, ehc, ehd, ehe, ehf, ehg};
    }

    static {
        ehk = h.aCu();
        ehj = h.values();
    }
}

