/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.minecraft.world.w;
import net.optifine.am;
import net.optifine.render.b;
import net.optifine.util.af;
import net.optifine.util.ak;

public class al {
    private static am[][] ebF = null;

    public static void aX() {
        ebF = null;
    }

    public static void jA() {
        al.aX();
        if (a.aox()) {
            ebF = al.aBc();
        }
    }

    private static am[][] aBc() {
        String string;
        int n2;
        am[][] amArray = new am[10][0];
        String string2 = "mcpatcher/sky/world";
        int n3 = -1;
        for (n2 = 0; n2 < amArray.length; ++n2) {
            string = "mcpatcher/sky/world" + n2 + "/sky";
            ArrayList<am> arrayList = new ArrayList<am>();
            for (int i2 = 1; i2 < 1000; ++i2) {
                String string3 = string + i2 + ".properties";
                try {
                    cm cm2 = new cm(string3);
                    InputStream inputStream = a.u(cm2);
                    if (inputStream == null) break;
                    af af2 = new af();
                    af2.load(inputStream);
                    inputStream.close();
                    a.fN("CustomSky properties: " + string3);
                    String string4 = string + i2 + ".png";
                    am am2 = new am(af2, string4);
                    if (!am2.gY(string3)) continue;
                    cm cm3 = new cm(am2.dXU);
                    ITextureObject iTextureObject = ak.k(cm3);
                    if (iTextureObject == null) {
                        a.fO("CustomSky: Texture not found: " + String.valueOf(cm3));
                        continue;
                    }
                    am2.ebT = iTextureObject.Ll();
                    arrayList.add(am2);
                    inputStream.close();
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    break;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (arrayList.size() <= 0) continue;
            am[] amArray2 = arrayList.toArray(new am[arrayList.size()]);
            amArray[n2] = amArray2;
            n3 = n2;
        }
        if (n3 < 0) {
            return null;
        }
        n2 = n3 + 1;
        string = new am[n2][0];
        System.arraycopy(amArray, 0, string, 0, ((am[][])string).length);
        return string;
    }

    public static void a(w w2, TextureManager textureManager, float f2) {
        am[] amArray;
        int n2;
        if (ebF != null && (n2 = w2.dDl.getDimensionId()) >= 0 && n2 < ebF.length && (amArray = ebF[n2]) != null) {
            long l2 = w2.getWorldTime();
            int n3 = (int)(l2 % 24000L);
            float f3 = w2.bT(f2);
            float f4 = w2.ca(f2);
            float f5 = w2.bY(f2);
            if (f4 > 0.0f) {
                f5 /= f4;
            }
            for (int i2 = 0; i2 < amArray.length; ++i2) {
                am am2 = amArray[i2];
                if (!am2.b(w2, n3)) continue;
                am2.a(w2, n3, f3, f4, f5);
            }
            float f6 = 1.0f - f4;
            b.ch(f6);
        }
    }

    public static boolean r(w w2) {
        if (ebF == null) {
            return false;
        }
        int n2 = w2.dDl.getDimensionId();
        if (n2 >= 0 && n2 < ebF.length) {
            am[] amArray = ebF[n2];
            return amArray != null && amArray.length > 0;
        }
        return false;
    }
}

