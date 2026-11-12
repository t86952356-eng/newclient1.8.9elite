/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.adx;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.aka;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public final class ais {
    private ais() {
    }

    public static void aA(int n2) {
        float f2 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
    }

    public static void d(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static Color a(Color color, float f2) {
        return new Color(Math.max((int)((float)color.getRed() * f2), 0), Math.max((int)((float)color.getGreen() * f2), 0), Math.max((int)((float)color.getBlue() * f2), 0), color.getAlpha());
    }

    public static Color b(Color color, float f2) {
        int n2 = color.getRed();
        int n3 = color.getGreen();
        int n4 = color.getBlue();
        int n5 = color.getAlpha();
        int n6 = (int)(1.0f / (1.0f - f2));
        if (n2 == 0 && n3 == 0 && n4 == 0) {
            return new Color(n6, n6, n6, n5);
        }
        if (n2 > 0 && n2 < n6) {
            n2 = n6;
        }
        if (n3 > 0 && n3 < n6) {
            n3 = n6;
        }
        if (n4 > 0 && n4 < n6) {
            n4 = n6;
        }
        return new Color(Math.min((int)((float)n2 / f2), 255), Math.min((int)((float)n3 / f2), 255), Math.min((int)((float)n4 / f2), 255), n5);
    }

    public static Color a(Color color, int n2) {
        return new Color(n2, color.getGreen(), color.getBlue());
    }

    public static Color b(Color color, int n2) {
        return new Color(color.getRed(), n2, color.getBlue());
    }

    public static Color c(Color color, int n2) {
        return new Color(color.getRed(), color.getGreen(), n2);
    }

    public static Color d(Color color, int n2) {
        if (n2 == color.getAlpha()) {
            return color;
        }
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)ahj.c(0.0, 255.0, n2));
    }

    public static Color a(Color color, Color color2, double d2) {
        double d3 = 1.0 - d2;
        int n2 = (int)((double)color.getRed() * d2 + (double)color2.getRed() * d3);
        int n3 = (int)((double)color.getGreen() * d2 + (double)color2.getGreen() * d3);
        int n4 = (int)((double)color.getBlue() * d2 + (double)color2.getBlue() * d3);
        return new Color(n2, n3, n4);
    }

    public static double k(aka aka2) {
        return Math.sin((double)System.currentTimeMillis() / 600.0 + aka2.getX() * 0.005 + aka2.getY() * 0.06) * 0.5 + 0.5;
    }

    public static Color aB(int n2) {
        double d2 = Math.ceil((double)(System.currentTimeMillis() + (long)n2) / 10.0);
        return Color.getHSBColor((float)((d2 %= 360.0) / 360.0), 0.6f, 1.0f);
    }

    public static void a(agf agf2, String string, double d2, double d3, boolean bl2) {
        float f2 = 0.0f;
        adx adx2 = a.a.k();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            String string2 = String.valueOf(string.charAt(i2));
            Color color = ais.a(adx2.rP().rQ(), adx2.rP().rR(), Math.sin((double)i2 * 0.095) * 0.5 + 0.5);
            if (bl2) {
                agf2.b(string2, d2 + (double)f2, d3, color.getRGB());
            } else {
                agf2.a(string2, d2 + (double)f2, d3, color.getRGB());
            }
            f2 += (float)agf2.bQ(string2) + 0.5f;
        }
    }

    public static void a(agf agf2, String string, double d2, double d3) {
        ais.a(agf2, string, d2, d3, true);
    }
}

