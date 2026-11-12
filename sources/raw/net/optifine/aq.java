/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.util.af;

public class aq {
    private static String ecu = null;
    private static String ecv = null;
    private static boolean dj = false;
    private static boolean fX = false;
    private static boolean ecw = false;
    private static boolean ecx = false;
    private static float ecy;
    private static float ecz;
    private static final String ecA = ".png";
    private static final cm ecB;

    public static boolean bd() {
        return dj;
    }

    public static String aBl() {
        return ecu;
    }

    public static void aBm() {
        fX = true;
        ecw = false;
    }

    public static ITextureObject a(ITextureObject iTextureObject, Map<cm, ITextureObject> map) {
        ITextureObject iTextureObject2;
        if (!fX) {
            return iTextureObject;
        }
        if (!(iTextureObject instanceof SimpleTexture)) {
            return iTextureObject;
        }
        SimpleTexture simpleTexture = (SimpleTexture)iTextureObject;
        cm cm2 = simpleTexture.bYu;
        if (!ecx) {
            if (cm2 != null) {
                ecw = true;
            }
            return iTextureObject;
        }
        if (cm2 == null) {
            cm2 = ecB;
        }
        if ((iTextureObject2 = map.get(cm2)) == null) {
            iTextureObject2 = new SimpleTexture(cm2);
            TextureManager textureManager = a.Bq();
            textureManager.a(cm2, iTextureObject2);
        }
        return iTextureObject2;
    }

    public static boolean aBn() {
        return ecw;
    }

    public static void aBo() {
        ecy = OpenGlHelper.bNq;
        ecz = OpenGlHelper.bNr;
        OpenGlHelper.a(OpenGlHelper.bMJ, 240.0f, ecz);
        ecx = true;
    }

    public static void aBp() {
        ecx = false;
        OpenGlHelper.a(OpenGlHelper.bMJ, ecy, ecz);
    }

    public static void aBq() {
        fX = false;
        ecw = false;
    }

    public static void jA() {
        dj = false;
        ecu = null;
        ecv = null;
        if (a.aoC()) {
            try {
                String string = "optifine/emissive.properties";
                cm cm2 = new cm("optifine/emissive.properties");
                InputStream inputStream = a.u(cm2);
                if (inputStream == null) {
                    return;
                }
                aq.fN("Loading optifine/emissive.properties");
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                ecu = af2.getProperty("suffix.emissive");
                if (ecu != null) {
                    ecv = ecu + ecA;
                }
                dj = ecu != null;
            }
            catch (FileNotFoundException fileNotFoundException) {
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static void fN(String string) {
        a.fN("EmissiveTextures: " + string);
    }

    private static void warn(String string) {
        a.warn("EmissiveTextures: " + string);
    }

    public static boolean K(cm cm2) {
        return ecv != null && cm2.atA().endsWith(ecv);
    }

    public static void a(cm cm2, SimpleTexture simpleTexture) {
        if (cm2 != null && simpleTexture != null) {
            String string;
            simpleTexture.bYv = false;
            simpleTexture.bYu = null;
            if (ecv != null && (string = cm2.atA()).endsWith(ecA)) {
                if (string.endsWith(ecv)) {
                    simpleTexture.bYv = true;
                } else {
                    String string2 = string.substring(0, string.length() - ecA.length()) + ecv;
                    cm cm3 = new cm(cm2.atB(), string2);
                    if (a.F(cm3)) {
                        simpleTexture.bYu = cm3;
                    }
                }
            }
        }
    }

    static {
        ecB = new cm("mcpatcher/ctm/default/empty.png");
    }
}

