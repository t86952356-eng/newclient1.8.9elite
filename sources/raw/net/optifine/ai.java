/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
package net.optifine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import net.minecraft.network.al;
import net.minecraft.src.a;
import net.optifine.ah;
import net.optifine.util.aj;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class ai {
    private static ah[] ebs = null;
    private static int ebt = 0;

    public static ah aAQ() {
        if (ebs == null) {
            return null;
        }
        int n2 = al.dat;
        int n3 = n2 - ebt;
        ah ah2 = null;
        if (n3 >= 0 && n3 < ebs.length) {
            ah2 = ebs[n3];
        }
        return ah2;
    }

    public static void jA() {
        ebs = null;
        ebt = 0;
        Pair<ah[], Integer> pair = ai.aAR();
        ebs = (ah[])pair.getLeft();
        ebt = (Integer)pair.getRight();
    }

    private static Pair<ah[], Integer> aAR() {
        String string;
        Object[] objectArray;
        String string2 = "optifine/gui/loading/background";
        String string3 = ".png";
        String[] stringArray = net.optifine.util.ah.as("optifine/gui/loading/background", ".png");
        HashMap<Integer, Object[]> hashMap = new HashMap<Integer, Object[]>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            objectArray = stringArray[i2];
            string = aj.j((String)objectArray, "optifine/gui/loading/background", ".png");
            int n2 = a.x(string, Integer.MIN_VALUE);
            if (n2 == Integer.MIN_VALUE) {
                ai.warn("Invalid dimension ID: " + string + ", path: " + (String)objectArray);
                continue;
            }
            hashMap.put(n2, objectArray);
        }
        Set set = hashMap.keySet();
        objectArray = set.toArray(new Integer[set.size()]);
        Arrays.sort(objectArray);
        if (objectArray.length <= 0) {
            return new ImmutablePair(null, (Object)0);
        }
        string = "optifine/gui/loading/loading.properties";
        Properties properties = net.optifine.util.ah.at("optifine/gui/loading/loading.properties", "CustomLoadingScreens");
        int n3 = (Integer)objectArray[0];
        int n4 = (Integer)objectArray[objectArray.length - 1];
        int n5 = n4 - n3 + 1;
        ah[] ahArray = new ah[n5];
        for (int i3 = 0; i3 < objectArray.length; ++i3) {
            Object object = objectArray[i3];
            String string4 = (String)hashMap.get(object);
            ahArray[((Integer)object).intValue() - n3] = ah.a(string4, (Integer)object, properties);
        }
        return new ImmutablePair((Object)ahArray, (Object)n3);
    }

    public static void warn(String string) {
        a.warn("CustomLoadingScreen: " + string);
    }

    public static void fN(String string) {
        a.fN("CustomLoadingScreen: " + string);
    }
}

