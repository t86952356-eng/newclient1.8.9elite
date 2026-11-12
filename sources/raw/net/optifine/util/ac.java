/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import net.minecraft.src.a;
import net.optifine.util.ad;
import net.optifine.util.y;

public class ac {
    private static final y eNk = ac.a(new String[][]{{"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}, {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}});
    private static final y eNl = ac.a(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}});

    public static long aJr() {
        return eNk == null ? -1L : eNk.aJp();
    }

    public static long aJs() {
        return eNl == null ? -1L : eNl.aJp();
    }

    private static y a(String[][] stringArray) {
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String[] object = stringArray[i2];
            try {
                y y2 = ac.p(object);
                return y2;
            }
            catch (Throwable throwable) {
                arrayList.add(throwable);
                continue;
            }
        }
        for (Throwable throwable : arrayList) {
            a.warn(throwable.getClass().getName() + ": " + throwable.getMessage());
        }
        return null;
    }

    private static y p(String[] stringArray) {
        String string;
        if (stringArray.length < 2) {
            return null;
        }
        Class<?> clazz = Class.forName(stringArray[0]);
        Method method = clazz.getMethod(stringArray[1], new Class[0]);
        method.setAccessible(true);
        Object object = null;
        for (int i2 = 2; i2 < stringArray.length; ++i2) {
            string = stringArray[i2];
            object = method.invoke(object, new Object[0]);
            method = object.getClass().getMethod(string, new Class[0]);
            method.setAccessible(true);
        }
        Method method2 = method;
        string = object;
        ad ad2 = new ad(method2, string);
        return ad2;
    }
}

