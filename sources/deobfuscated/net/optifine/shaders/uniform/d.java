/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.optifine.expr.f;
import net.optifine.expr.m;

public final class d
extends Enum<d>
implements m {
    public static final /* enum */ d eIR = new d("is_alive");
    public static final /* enum */ d eIS = new d("is_burning");
    public static final /* enum */ d eIT = new d("is_child");
    public static final /* enum */ d eIU = new d("is_glowing");
    public static final /* enum */ d eIV = new d("is_hurt");
    public static final /* enum */ d eIW = new d("is_in_lava");
    public static final /* enum */ d eIX = new d("is_in_water");
    public static final /* enum */ d eIY = new d("is_invisible");
    public static final /* enum */ d eIZ = new d("is_on_ground");
    public static final /* enum */ d eJa = new d("is_ridden");
    public static final /* enum */ d eJb = new d("is_riding");
    public static final /* enum */ d eJc = new d("is_sneaking");
    public static final /* enum */ d eJd = new d("is_sprinting");
    public static final /* enum */ d eJe = new d("is_wet");
    private final String name;
    private final RenderManager eJg;
    private static final d[] eJh;
    private static final /* synthetic */ d[] eJi;

    public static d[] values() {
        return (d[])eJi.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private d(String string2) {
        this.name = string2;
        this.eJg = Minecraft.getMinecraft().BF();
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
        c c2 = Minecraft.getMinecraft().BC();
        if (c2 instanceof r) {
            r r2 = (r)c2;
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

    public static d jQ(String string) {
        if (string == null) {
            return null;
        }
        for (int i2 = 0; i2 < eJh.length; ++i2) {
            d d2 = eJh[i2];
            if (!d2.getName().equals(string)) continue;
            return d2;
        }
        return null;
    }

    private static /* synthetic */ d[] aIG() {
        return new d[]{eIR, eIS, eIT, eIU, eIV, eIW, eIX, eIY, eIZ, eJa, eJb, eJc, eJd, eJe};
    }

    static {
        eJi = d.aIG();
        eJh = d.values();
    }
}

