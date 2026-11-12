/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import java.util.function.Function;
import org.apache.commons.lang3.StringUtils;

public final class afk
extends Enum<afk> {
    public static final /* enum */ afk aGW = new afk(d2 -> d2);
    public static final /* enum */ afk aGX = new afk(d2 -> d2 * d2);
    public static final /* enum */ afk aGY = new afk(d2 -> d2 * (2.0 - d2));
    public static final /* enum */ afk aGZ = new afk(d2 -> d2 < 0.5 ? 2.0 * d2 * d2 : -1.0 + (4.0 - 2.0 * d2) * d2);
    public static final /* enum */ afk aHa = new afk(d2 -> d2 * d2 * d2);
    public static final /* enum */ afk aHb = new afk(d2 -> {
        d2 = d2 - 1.0;
        return d2 * d2 * d2 + 1.0;
    });
    public static final /* enum */ afk aHc = new afk(d2 -> d2 < 0.5 ? 4.0 * d2 * d2 * d2 : (d2 - 1.0) * (2.0 * d2 - 2.0) * (2.0 * d2 - 2.0) + 1.0);
    public static final /* enum */ afk aHd = new afk(d2 -> d2 * d2 * d2 * d2);
    public static final /* enum */ afk aHe = new afk(d2 -> {
        d2 = d2 - 1.0;
        return 1.0 - d2 * d2 * d2 * d2;
    });
    public static final /* enum */ afk aHf = new afk(d2 -> {
        double d3;
        if (d2 < 0.5) {
            d3 = 8.0 * d2 * d2 * d2 * d2;
        } else {
            d2 = d2 - 1.0;
            d3 = 1.0 - 8.0 * d2 * d2 * d2 * d2;
        }
        return d3;
    });
    public static final /* enum */ afk aHg = new afk(d2 -> d2 * d2 * d2 * d2 * d2);
    public static final /* enum */ afk aHh = new afk(d2 -> {
        d2 = d2 - 1.0;
        return 1.0 + d2 * d2 * d2 * d2 * d2;
    });
    public static final /* enum */ afk aHi = new afk(d2 -> {
        double d3;
        if (d2 < 0.5) {
            d3 = 16.0 * d2 * d2 * d2 * d2 * d2;
        } else {
            d2 = d2 - 1.0;
            d3 = 1.0 + 16.0 * d2 * d2 * d2 * d2 * d2;
        }
        return d3;
    });
    public static final /* enum */ afk aHj = new afk(d2 -> 1.0 - Math.cos(d2 * Math.PI / 2.0));
    public static final /* enum */ afk aHk = new afk(d2 -> Math.sin(d2 * Math.PI / 2.0));
    public static final /* enum */ afk aHl = new afk(d2 -> 1.0 - Math.cos(Math.PI * d2 / 2.0));
    public static final /* enum */ afk aHm = new afk(d2 -> d2 == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * d2 - 10.0));
    public static final /* enum */ afk aHn = new afk(d2 -> d2 == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * d2));
    public static final /* enum */ afk aHo = new afk(d2 -> d2 == 0.0 ? 0.0 : (d2 == 1.0 ? 1.0 : (d2 < 0.5 ? Math.pow(2.0, 20.0 * d2 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * d2 + 10.0)) / 2.0)));
    public static final /* enum */ afk aHp = new afk(d2 -> 1.0 - Math.sqrt(1.0 - d2 * d2));
    public static final /* enum */ afk aHq = new afk(d2 -> {
        d2 = d2 - 1.0;
        return Math.sqrt(1.0 - d2 * d2);
    });
    public static final /* enum */ afk aHr = new afk(d2 -> d2 < 0.5 ? (1.0 - Math.sqrt(1.0 - 4.0 * d2 * d2)) / 2.0 : (Math.sqrt(1.0 - 4.0 * (d2 - 1.0) * d2) + 1.0) / 2.0);
    public static final /* enum */ afk aHs = new afk(d2 -> 1.0 / (1.0 + Math.exp(-d2.doubleValue())));
    public static final /* enum */ afk aHt = new afk(d2 -> d2 == 0.0 ? 0.0 : (d2 == 1.0 ? 1.0 : Math.pow(2.0, -10.0 * d2) * Math.sin((d2 * 10.0 - 0.75) * 2.0943951023931953) * 0.5 + 1.0));
    public static final /* enum */ afk aHu = new afk(d2 -> 2.70158 * d2 * d2 * d2 - 1.70158 * d2 * d2);
    private final Function<Double, Double> aHv;
    private static final /* synthetic */ afk[] aHw;

    public static afk[] values() {
        return (afk[])aHw.clone();
    }

    public static afk valueOf(String string) {
        return Enum.valueOf(afk.class, string);
    }

    private afk(Function<Double, Double> function) {
        this.aHv = function;
    }

    public Function<Double, Double> sW() {
        return this.aHv;
    }

    public String toString() {
        return StringUtils.capitalize((String)super.toString().toLowerCase().replace("_", " "));
    }

    private static /* synthetic */ afk[] sX() {
        return new afk[]{aGW, aGX, aGY, aGZ, aHa, aHb, aHc, aHd, aHe, aHf, aHg, aHh, aHi, aHj, aHk, aHl, aHm, aHn, aHo, aHp, aHq, aHr, aHs, aHt, aHu};
    }

    static {
        aHw = afk.sX();
    }
}

