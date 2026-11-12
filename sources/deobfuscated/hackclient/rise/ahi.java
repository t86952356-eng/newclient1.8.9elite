/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import net.minecraft.entity.c;

public class ahi {
    public static double l(double d2, double d3, double d4) {
        return d3 + (d2 - d3) * d4;
    }

    public static float d(float f2, float f3, float f4) {
        return f3 + (f2 - f3) * f4;
    }

    public static akd a(akd akd2, akd akd3, double d2) {
        return new akd(ahi.l(akd2.getX(), akd3.getX(), d2), ahi.l(akd2.getY(), akd3.getY(), d2), ahi.l(akd2.getZ(), akd3.getZ(), d2));
    }

    public static akd a(c c2, float f2) {
        return new akd(ahi.l(c2.gW, c2.crF, f2), ahi.l(c2.gX, c2.crG, f2), ahi.l(c2.gY, c2.crH, f2));
    }
}

