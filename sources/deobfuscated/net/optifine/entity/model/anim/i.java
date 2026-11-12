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
import net.optifine.expr.o;

public final class i
extends Enum<i>
implements o {
    public static final /* enum */ i ehl = new i("limb_swing");
    public static final /* enum */ i ehm = new i("limb_speed");
    public static final /* enum */ i ehn = new i("age");
    public static final /* enum */ i eho = new i("head_yaw");
    public static final /* enum */ i ehp = new i("head_pitch");
    public static final /* enum */ i ehq = new i("scale");
    public static final /* enum */ i ehr = new i("health");
    public static final /* enum */ i ehs = new i("hurt_time");
    public static final /* enum */ i eht = new i("idle_time");
    public static final /* enum */ i ehu = new i("max_health");
    public static final /* enum */ i ehv = new i("move_forward");
    public static final /* enum */ i ehw = new i("move_strafing");
    public static final /* enum */ i ehx = new i("partial_ticks");
    public static final /* enum */ i ehy = new i("pos_x");
    public static final /* enum */ i ehz = new i("pos_Y");
    public static final /* enum */ i ehA = new i("pos_Z");
    public static final /* enum */ i ehB = new i("revenge_time");
    public static final /* enum */ i ehC = new i("swing_progress");
    private final String name;
    private final RenderManager ehE;
    private static final i[] ehF;
    private static final /* synthetic */ i[] ehG;

    public static i[] values() {
        return (i[])ehG.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private i(String string2) {
        this.name = string2;
        this.ehE = Minecraft.getMinecraft().BF();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public f aCq() {
        return f.ehO;
    }

    @Override
    public float aCr() {
        Render render = this.ehE.bVM;
        if (render == null) {
            return 0.0f;
        }
        if (render instanceof RendererLivingEntity) {
            RendererLivingEntity rendererLivingEntity = (RendererLivingEntity)render;
            switch (this.ordinal()) {
                case 0: {
                    return rendererLivingEntity.bWS;
                }
                case 1: {
                    return rendererLivingEntity.bWT;
                }
                case 2: {
                    return rendererLivingEntity.bWU;
                }
                case 3: {
                    return rendererLivingEntity.bWV;
                }
                case 4: {
                    return rendererLivingEntity.bWW;
                }
                case 5: {
                    return rendererLivingEntity.bWX;
                }
            }
            r r2 = rendererLivingEntity.bWR;
            if (r2 == null) {
                return 0.0f;
            }
            switch (this.ordinal()) {
                case 6: {
                    return r2.getHealth();
                }
                case 7: {
                    return r2.cus;
                }
                case 8: {
                    return r2.VG();
                }
                case 9: {
                    return r2.getMaxHealth();
                }
                case 10: {
                    return r2.cuW;
                }
                case 11: {
                    return r2.cuV;
                }
                case 13: {
                    return (float)r2.gW;
                }
                case 14: {
                    return (float)r2.gX;
                }
                case 15: {
                    return (float)r2.gY;
                }
                case 16: {
                    return r2.VD();
                }
                case 17: {
                    return r2.ba(rendererLivingEntity.bWY);
                }
            }
        }
        return 0.0f;
    }

    public static i ie(String string) {
        if (string == null) {
            return null;
        }
        for (int i2 = 0; i2 < ehF.length; ++i2) {
            i i3 = ehF[i2];
            if (!i3.getName().equals(string)) continue;
            return i3;
        }
        return null;
    }

    private static /* synthetic */ i[] aCv() {
        return new i[]{ehl, ehm, ehn, eho, ehp, ehq, ehr, ehs, eht, ehu, ehv, ehw, ehx, ehy, ehz, ehA, ehB, ehC};
    }

    static {
        ehG = i.aCv();
        ehF = i.values();
    }
}

