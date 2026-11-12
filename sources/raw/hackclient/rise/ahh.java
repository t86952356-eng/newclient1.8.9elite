/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import net.minecraft.util.bt;

public class ahh {
    public static final float aNO = (float)Math.PI;
    public static final float aNP = (float)Math.PI / 180;
    public static final float aNQ = 57.295776f;
    public static final float[] aNR = new float[361];
    public static final float[] aNS = new float[361];

    public static int C(float f2) {
        return (int)(f2 % 360.0f + 360.0f) % 360;
    }

    static {
        for (int i2 = 0; i2 <= 360; ++i2) {
            ahh.aNR[i2] = bt.bB((float)i2 * ((float)Math.PI / 180));
            ahh.aNS[i2] = bt.bx((float)i2 * ((float)Math.PI / 180));
        }
    }
}

