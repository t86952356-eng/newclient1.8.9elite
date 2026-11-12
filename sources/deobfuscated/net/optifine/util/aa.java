/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.util.bt;
import net.optifine.util.ab;
import net.optifine.util.z;

public class aa {
    public static void main(String[] stringArray) {
        ab[] abArray = ab.values();
        for (int i2 = 0; i2 < abArray.length; ++i2) {
            ab ab2 = abArray[i2];
            aa.fN("******** " + String.valueOf((Object)ab2) + " ***********");
            aa.a(ab2, false);
        }
    }

    private static void a(ab ab2, boolean bl2) {
        double d2;
        double d3;
        bt.dyZ = bl2;
        switch (ab2.ordinal()) {
            case 0: 
            case 1: {
                d3 = -bt.dyT;
                d2 = bt.dyT;
                break;
            }
            case 2: 
            case 3: {
                d3 = -1.0;
                d2 = 1.0;
                break;
            }
            default: {
                return;
            }
        }
        int n2 = 10;
        for (int i2 = 0; i2 <= 10; ++i2) {
            float f2;
            float f3;
            double d4 = d3 + (double)i2 * (d2 - d3) / 10.0;
            switch (ab2.ordinal()) {
                case 0: {
                    f3 = (float)Math.sin(d4);
                    f2 = bt.bx((float)d4);
                    break;
                }
                case 1: {
                    f3 = (float)Math.cos(d4);
                    f2 = bt.bB((float)d4);
                    break;
                }
                case 2: {
                    f3 = (float)Math.asin(d4);
                    f2 = z.cn((float)d4);
                    break;
                }
                case 3: {
                    f3 = (float)Math.acos(d4);
                    f2 = z.co((float)d4);
                    break;
                }
                default: {
                    return;
                }
            }
            aa.fN(String.format("%.2f, Math: %f, Helper: %f, diff: %f", d4, Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(Math.abs(f3 - f2))));
        }
    }

    public static void fN(String string) {
        System.out.println(string);
    }
}

