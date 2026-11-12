/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import net.minecraft.src.a;
import net.minecraft.util.cy;
import net.minecraft.util.cz;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.l;

public class m {
    private static final String eGS = "MC_";
    public static final String eGT = "MC_VERSION";
    public static final String eGU = "MC_GL_VERSION";
    public static final String eGV = "MC_GLSL_VERSION";
    public static final String eGW = "MC_OS_WINDOWS";
    public static final String eGX = "MC_OS_MAC";
    public static final String eGY = "MC_OS_LINUX";
    public static final String eGZ = "MC_OS_OTHER";
    public static final String eHa = "MC_GL_VENDOR_ATI";
    public static final String eHb = "MC_GL_VENDOR_INTEL";
    public static final String eHc = "MC_GL_VENDOR_NVIDIA";
    public static final String eHd = "MC_GL_VENDOR_XORG";
    public static final String eHe = "MC_GL_VENDOR_OTHER";
    public static final String eHf = "MC_GL_RENDERER_RADEON";
    public static final String eHg = "MC_GL_RENDERER_GEFORCE";
    public static final String eHh = "MC_GL_RENDERER_QUADRO";
    public static final String eHi = "MC_GL_RENDERER_INTEL";
    public static final String eHj = "MC_GL_RENDERER_GALLIUM";
    public static final String eHk = "MC_GL_RENDERER_MESA";
    public static final String eHl = "MC_GL_RENDERER_OTHER";
    public static final String eHm = "MC_FXAA_LEVEL";
    public static final String eHn = "MC_NORMAL_MAP";
    public static final String eHo = "MC_SPECULAR_MAP";
    public static final String eHp = "MC_RENDER_QUALITY";
    public static final String eHq = "MC_SHADOW_QUALITY";
    public static final String eHr = "MC_HAND_DEPTH";
    public static final String eHs = "MC_OLD_HAND_LIGHT";
    public static final String eHt = "MC_OLD_LIGHTING";
    private static l[] eHu;

    public static String aHW() {
        cz cz2 = cy.atP();
        switch (cz2) {
            case dAC: {
                return eGW;
            }
            case dAD: {
                return eGX;
            }
            case dAA: {
                return eGY;
            }
        }
        return eGZ;
    }

    public static String aHX() {
        String string = a.dnU;
        if (string == null) {
            return eHe;
        }
        return (string = string.toLowerCase()).startsWith("ati") ? eHa : (string.startsWith("intel") ? eHb : (string.startsWith("nvidia") ? eHc : (string.startsWith("x.org") ? eHd : eHe)));
    }

    public static String aHY() {
        String string = a.dnT;
        if (string == null) {
            return eHl;
        }
        return (string = string.toLowerCase()).startsWith("amd") ? eHf : (string.startsWith("ati") ? eHf : (string.startsWith("radeon") ? eHf : (string.startsWith("gallium") ? eHj : (string.startsWith("intel") ? eHi : (string.startsWith("geforce") ? eHg : (string.startsWith("nvidia") ? eHg : (string.startsWith("quadro") ? eHh : (string.startsWith("nvs") ? eHh : (string.startsWith("mesa") ? eHk : eHl)))))))));
    }

    public static String aHZ() {
        return eGS;
    }

    public static l[] aIa() {
        if (eHu == null) {
            String[] stringArray = a.amY();
            l[] lArray = new l[stringArray.length];
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                lArray[i2] = new l(eGS + stringArray[i2], "");
            }
            eHu = lArray;
        }
        return eHu;
    }

    public static String aIb() {
        StringBuilder stringBuilder = new StringBuilder();
        m.a(stringBuilder, eGT, a.amT());
        m.a(stringBuilder, "MC_GL_VERSION " + a.amW().aBW());
        m.a(stringBuilder, "MC_GLSL_VERSION " + a.amX().aBW());
        m.a(stringBuilder, m.aHW());
        m.a(stringBuilder, m.aHX());
        m.a(stringBuilder, m.aHY());
        return stringBuilder.toString();
    }

    public static String aIc() {
        StringBuilder stringBuilder = new StringBuilder();
        if (ah.eDi > 0) {
            m.a(stringBuilder, eHm, ah.eDi);
        }
        if (ah.eDe) {
            m.a(stringBuilder, eHn);
        }
        if (ah.eDf) {
            m.a(stringBuilder, eHo);
        }
        m.a(stringBuilder, eHp, ah.eCV);
        m.a(stringBuilder, eHq, ah.eCW);
        m.a(stringBuilder, eHr, ah.eCU);
        if (ah.aFj()) {
            m.a(stringBuilder, eHs);
        }
        if (ah.aFk()) {
            m.a(stringBuilder, eHt);
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, String string, int n2) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n2);
        stringBuilder.append("\n");
    }

    private static void a(StringBuilder stringBuilder, String string, float f2) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(f2);
        stringBuilder.append("\n");
    }

    private static void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append("\n");
    }
}

