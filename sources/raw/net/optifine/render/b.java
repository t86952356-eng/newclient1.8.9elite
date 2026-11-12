/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.src.a;

public class b {
    public static final int etn = 0;
    public static final int eto = 1;
    public static final int etp = 2;
    public static final int etq = 3;
    public static final int etr = 4;
    public static final int ets = 5;
    public static final int ett = 6;
    public static final int etu = 7;
    public static final int etv = 8;
    public static final int etw = 1;

    public static int iy(String string) {
        if (string == null) {
            return 1;
        }
        if ((string = string.toLowerCase().trim()).equals("alpha")) {
            return 0;
        }
        if (string.equals("add")) {
            return 1;
        }
        if (string.equals("subtract")) {
            return 2;
        }
        if (string.equals("multiply")) {
            return 3;
        }
        if (string.equals("dodge")) {
            return 4;
        }
        if (string.equals("burn")) {
            return 5;
        }
        if (string.equals("screen")) {
            return 6;
        }
        if (string.equals("overlay")) {
            return 7;
        }
        if (string.equals("replace")) {
            return 8;
        }
        a.warn("Unknown blend: " + string);
        return 1;
    }

    public static void i(int n2, float f2) {
        switch (n2) {
            case 0: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(770, 771);
                GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
                break;
            }
            case 1: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(770, 1);
                GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
                break;
            }
            case 2: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(775, 0);
                GlStateManager.e(f2, f2, f2, 1.0f);
                break;
            }
            case 3: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(774, 771);
                GlStateManager.e(f2, f2, f2, f2);
                break;
            }
            case 4: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(1, 1);
                GlStateManager.e(f2, f2, f2, 1.0f);
                break;
            }
            case 5: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(0, 769);
                GlStateManager.e(f2, f2, f2, 1.0f);
                break;
            }
            case 6: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(1, 769);
                GlStateManager.e(f2, f2, f2, 1.0f);
                break;
            }
            case 7: {
                GlStateManager.Jy();
                GlStateManager.tQ();
                GlStateManager.P(774, 768);
                GlStateManager.e(f2, f2, f2, 1.0f);
                break;
            }
            case 8: {
                GlStateManager.tL();
                GlStateManager.tR();
                GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
            }
        }
        GlStateManager.JN();
    }

    public static void ch(float f2) {
        GlStateManager.Jy();
        GlStateManager.tQ();
        GlStateManager.P(770, 1);
        GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
    }
}

