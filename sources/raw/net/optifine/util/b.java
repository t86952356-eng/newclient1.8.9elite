/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class b {
    public static boolean c(Object[] objectArray, Object object) {
        if (objectArray == null) {
            return false;
        }
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object2 = objectArray[i2];
            if (object2 != object) continue;
            return true;
        }
        return false;
    }
}

