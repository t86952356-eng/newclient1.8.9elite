/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.minecraft.util.cm;
import net.optifine.config.j;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.shaders.a;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.d;
import net.optifine.shaders.m;
import net.optifine.util.af;
import net.optifine.util.aj;

public class b {
    private static a[][] euv = null;
    private static af euw = null;
    private static boolean eux;

    public static int bJ(int n2, int n3) {
        if (euv == null) {
            return n2;
        }
        if (n2 >= 0 && n2 < euv.length) {
            a[] aArray = euv[n2];
            if (aArray == null) {
                return n2;
            }
            for (int i2 = 0; i2 < aArray.length; ++i2) {
                a a2 = aArray[i2];
                if (!a2.bH(n2, n3)) continue;
                return a2.aEn();
            }
            return n2;
        }
        return n2;
    }

    public static void aBA() {
        if (eux) {
            eux = false;
            b.a(ah.aFa());
        }
    }

    public static void a(m m2) {
        b.aX();
        if (m2 != null) {
            if (g.eql.aDA() && net.minecraft.client.d.AZ().Bs() == null) {
                net.minecraft.src.a.fN("[Shaders] Delayed loading of block mappings after resources are loaded");
                eux = true;
            } else {
                ArrayList<List<a>> arrayList = new ArrayList<List<a>>();
                String string = "/shaders/block.properties";
                InputStream inputStream = m2.iz("/shaders/block.properties");
                if (inputStream != null) {
                    b.a(inputStream, "/shaders/block.properties", arrayList);
                }
                b.S(arrayList);
                if (arrayList.size() > 0) {
                    euv = b.T(arrayList);
                }
            }
        }
    }

    private static void S(List<List<a>> list) {
        String[] stringArray = l.aDH();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            try {
                cm cm2 = new cm(string, "shaders/block.properties");
                InputStream inputStream = net.minecraft.src.a.u(cm2);
                b.a(inputStream, cm2.toString(), list);
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    private static void a(InputStream inputStream, String string, List<List<a>> list) {
        if (inputStream != null) {
            try {
                inputStream = d.b(inputStream, string);
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                net.minecraft.src.a.fN("[Shaders] Parsing block mappings: " + string);
                net.optifine.config.a a2 = new net.optifine.config.a("Shaders");
                for (Object object : ((Properties)af2).keySet()) {
                    String string2 = (String)object;
                    String string3 = af2.getProperty(string2);
                    if (string2.startsWith("layer.")) {
                        if (euw == null) {
                            euw = new af();
                        }
                        euw.put(string2, string3);
                        continue;
                    }
                    String string4 = "block.";
                    if (!string2.startsWith("block.")) {
                        net.minecraft.src.a.warn("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    String string5 = aj.ax(string2, "block.");
                    int n2 = net.minecraft.src.a.x(string5, -1);
                    if (n2 < 0) {
                        net.minecraft.src.a.warn("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    j[] jArray = a2.hJ(string3);
                    if (jArray != null && jArray.length >= 1) {
                        a a3 = new a(n2, jArray);
                        b.a(list, a3);
                        continue;
                    }
                    net.minecraft.src.a.warn("[Shaders] Invalid block ID mapping: " + string2 + "=" + string3);
                }
            }
            catch (IOException iOException) {
                net.minecraft.src.a.warn("[Shaders] Error reading: " + string);
            }
        }
    }

    private static void a(List<List<a>> list, a a2) {
        int[] nArray = a2.aAy();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2];
            while (n2 >= list.size()) {
                list.add(null);
            }
            List<a> list2 = list.get(n2);
            if (list2 == null) {
                list2 = new ArrayList<a>();
                list.set(n2, list2);
            }
            a a3 = new a(a2.aEn(), a2.jG(n2));
            list2.add(a3);
        }
    }

    private static a[][] T(List<List<a>> list) {
        a[][] aArray = new a[list.size()][];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            List<a> list2 = list.get(i2);
            if (list2 == null) continue;
            aArray[i2] = list2.toArray(new a[list2.size()]);
        }
        return aArray;
    }

    public static af aEo() {
        return euw;
    }

    public static void aX() {
        euv = null;
        euw = null;
    }
}

