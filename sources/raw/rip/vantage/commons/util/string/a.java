/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.string;

import java.util.Arrays;

public class a {
    public static double aH(String string, String string2) {
        int n2;
        int n3 = string.length();
        int n4 = string2.length();
        int[][] nArray = new int[n3 + 1][n4 + 1];
        for (n2 = 0; n2 <= n3; ++n2) {
            for (int i2 = 0; i2 <= n4; ++i2) {
                nArray[n2][i2] = n2 == 0 ? i2 : (i2 == 0 ? n2 : a.w(nArray[n2 - 1][i2 - 1] + a.a(string.charAt(n2 - 1), string2.charAt(i2 - 1)), nArray[n2 - 1][i2] + 1, nArray[n2][i2 - 1] + 1));
            }
        }
        n2 = Math.max(n3, n4);
        return 1.0 - (double)nArray[n3][n4] / (double)n2;
    }

    private static int a(char c2, char c3) {
        return c2 == c3 ? 0 : 1;
    }

    private static int w(int ... nArray) {
        return Arrays.stream(nArray).min().orElse(Integer.MAX_VALUE);
    }
}

