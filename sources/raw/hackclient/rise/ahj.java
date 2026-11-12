/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.akd;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.util.bt;

public final class ahj {
    public static double l(double d2, double d3) {
        if (d2 == d3) {
            return d2;
        }
        if (d2 > d3) {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
        }
        return ThreadLocalRandom.current().nextDouble(d2, d3);
    }

    public static double a(double d2, int n2) {
        try {
            BigDecimal bigDecimal = BigDecimal.valueOf(d2);
            return bigDecimal.setScale(n2, RoundingMode.HALF_UP).doubleValue();
        }
        catch (Exception exception) {
            return 0.0;
        }
    }

    public static float f(float f2, float f3) {
        float f4 = Math.round(f2 / f3);
        return f3 * f4;
    }

    public static double a(double d2, int n2, double d3) {
        double d4 = d3 / 2.0;
        double d5 = Math.floor(d2 / d3) * d3;
        if (d2 >= d5 + d4) {
            return new BigDecimal(Math.ceil(d2 / d3) * d3).setScale(n2, RoundingMode.HALF_UP).doubleValue();
        }
        return new BigDecimal(d5).setScale(n2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double m(double d2, double d3) {
        double d4 = (double)Math.round(d2 / d3) * d3;
        d4 *= 1000.0;
        d4 = (int)d4;
        return d4 /= 1000.0;
    }

    public static double m(double d2, double d3, double d4) {
        return d2 + d4 * (d3 - d2);
    }

    public static float e(float f2, float f3, float f4) {
        return f2 + f4 * (f3 - f2);
    }

    public static double d(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        double d10 = d7 - d4;
        return bt.aD(d8 * d8 + d9 * d9 + d10 * d10);
    }

    public static double c(double d2, double d3, double d4) {
        return Math.max(d2, Math.min(d3, d4));
    }

    public static double n(double d2, double d3) {
        return Math.min(Math.abs(d2 - d3), Math.min(Math.abs(d2 - 360.0) - Math.abs(d3 - 0.0), Math.abs(d3 - 360.0) - Math.abs(d2 - 0.0)));
    }

    public static double b(akd akd2, akd akd3) {
        double d2 = akd3.x - akd2.x;
        double d3 = akd3.z - akd2.z;
        double d4 = Math.toDegrees(Math.atan2(d3, d2)) - 90.0;
        return bt.bN((float)d4);
    }

    @Generated
    private ahj() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

