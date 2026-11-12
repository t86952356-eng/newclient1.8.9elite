/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahg;
import hackclient.rise.s;
import java.util.Locale;

final class acu {
    private final String aBV;
    private final String[] aBW;
    private final String aBX;
    private final String aBY;
    private final String aBZ;
    private final String aCa;
    private double aCb;

    private acu(s s2) {
        this.aBW = s2.getExpressions();
        this.aBV = this.aBW.length == 0 ? "" : this.aBW[0];
        this.aBX = ahg.cf(s2.getDescription());
        this.aBY = this.aBX.toLowerCase(Locale.ROOT);
        this.aBZ = acu.aV(s2.getDescription());
        this.aCa = acu.c(this.aBW);
    }

    private double aU(String string) {
        if (string.isEmpty()) {
            return 1.0;
        }
        double d2 = 0.0;
        String string2 = this.aBV.toLowerCase(Locale.ROOT);
        if (string2.startsWith(string)) {
            d2 += 6.0;
        } else if (string2.contains(string)) {
            d2 += Math.max(0.0, 4.0 - (double)string2.indexOf(string) * 0.1);
        }
        for (int i2 = 1; i2 < this.aBW.length; ++i2) {
            String string3 = this.aBW[i2].toLowerCase(Locale.ROOT);
            if (string3.startsWith(string)) {
                d2 += 3.0;
                continue;
            }
            if (!string3.contains(string)) continue;
            d2 += Math.max(0.0, 2.0 - (double)string3.indexOf(string) * 0.05);
        }
        if (this.aBY.contains(string)) {
            d2 += 1.0;
        }
        return d2;
    }

    private static String aV(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.endsWith(".description") ? string.replace(".description", ".usage") : string + ".usage";
        String string3 = ahg.cf(string2);
        return string2.equals(string3) ? null : string3;
    }

    private static String c(String[] stringArray) {
        if (stringArray.length <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 1; i2 < Math.min(stringArray.length, 4); ++i2) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(stringArray[i2]);
        }
        return stringBuilder.toString();
    }
}

