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
import net.optifine.config.a;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.d;
import net.optifine.shaders.m;
import net.optifine.util.af;
import net.optifine.util.aj;

public class n {
    private static int[] euV = null;
    private static boolean eux;
    private static final int euW = Integer.MIN_VALUE;

    public static int jN(int n2) {
        if (euV == null) {
            return n2;
        }
        if (n2 >= 0 && n2 < euV.length) {
            int n3 = euV[n2];
            return n3 == Integer.MIN_VALUE ? n2 : n3;
        }
        return n2;
    }

    public static void aBA() {
        if (eux) {
            eux = false;
            n.a(ah.aFa());
        }
    }

    public static void a(m m2) {
        n.aX();
        if (m2 != null) {
            if (g.eql.aDA() && net.minecraft.src.a.Br() == null) {
                net.minecraft.src.a.fN("[Shaders] Delayed loading of item mappings after resources are loaded");
                eux = true;
            } else {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                String string = "/shaders/item.properties";
                InputStream inputStream = m2.iz("/shaders/item.properties");
                if (inputStream != null) {
                    n.c(inputStream, "/shaders/item.properties", arrayList);
                }
                n.W(arrayList);
                if (arrayList.size() > 0) {
                    euV = n.V(arrayList);
                }
            }
        }
    }

    private static void W(List<Integer> list) {
        String[] stringArray = l.aDH();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            try {
                cm cm2 = new cm(string, "shaders/item.properties");
                InputStream inputStream = net.minecraft.src.a.u(cm2);
                n.c(inputStream, cm2.toString(), list);
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    private static void c(InputStream inputStream, String string, List<Integer> list) {
        if (inputStream != null) {
            try {
                inputStream = d.b(inputStream, string);
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                net.minecraft.src.a.fN("[Shaders] Parsing item mappings: " + string);
                a a2 = new a("Shaders");
                for (Object object : ((Properties)af2).keySet()) {
                    String string2 = (String)object;
                    String string3 = af2.getProperty(string2);
                    String string4 = "item.";
                    if (!string2.startsWith("item.")) {
                        net.minecraft.src.a.warn("[Shaders] Invalid item ID: " + string2);
                        continue;
                    }
                    String string5 = aj.ax(string2, "item.");
                    int n2 = net.minecraft.src.a.x(string5, -1);
                    if (n2 < 0) {
                        net.minecraft.src.a.warn("[Shaders] Invalid item alias ID: " + n2);
                        continue;
                    }
                    int[] nArray = a2.hU(string3);
                    if (nArray != null && nArray.length >= 1) {
                        for (int i2 = 0; i2 < nArray.length; ++i2) {
                            int n3 = nArray[i2];
                            n.a(list, n3, n2);
                        }
                        continue;
                    }
                    net.minecraft.src.a.warn("[Shaders] Invalid item ID mapping: " + string2 + "=" + string3);
                }
            }
            catch (IOException iOException) {
                net.minecraft.src.a.warn("[Shaders] Error reading: " + string);
            }
        }
    }

    private static void a(List<Integer> list, int n2, int n3) {
        while (list.size() <= n2) {
            list.add(Integer.MIN_VALUE);
        }
        list.set(n2, n3);
    }

    private static int[] V(List<Integer> list) {
        int[] nArray = new int[list.size()];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = list.get(i2);
        }
        return nArray;
    }

    public static void aX() {
        euV = null;
    }
}

