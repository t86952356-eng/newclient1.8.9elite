/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.src.a;
import net.optifine.shaders.config.aa;
import net.optifine.shaders.config.o;

public class ag {
    public static o a(String string, o[] oArray) {
        if (oArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            o o2 = oArray[i2];
            if (!o2.getName().equals(string)) continue;
            return o2;
        }
        return null;
    }

    public static aa a(aa[] aaArray, o[] oArray, boolean bl2) {
        if (aaArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < aaArray.length; ++i2) {
            aa aa2 = aaArray[i2];
            if (!ag.a(aa2, oArray, bl2)) continue;
            return aa2;
        }
        return null;
    }

    public static boolean a(aa aa2, o[] oArray, boolean bl2) {
        if (aa2 == null) {
            return false;
        }
        if (oArray == null) {
            return false;
        }
        String[] stringArray = aa2.aIq();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string;
            String string2;
            String string3 = stringArray[i2];
            o o2 = ag.a(string3, oArray);
            if (o2 == null || a.a((Object)(string2 = bl2 ? o2.aHp() : o2.SN()), (Object)(string = aa2.jL(string3)))) continue;
            return false;
        }
        return true;
    }
}

