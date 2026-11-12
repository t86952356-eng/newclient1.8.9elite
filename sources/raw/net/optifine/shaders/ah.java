/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBGeometryShader4
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.vector.Vector4f
 */
package net.optifine.shaders;

import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.co;
import net.minecraft.util.av;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.optifine.aw;
import net.optifine.shaders.ab;
import net.optifine.shaders.ac;
import net.optifine.shaders.ad;
import net.optifine.shaders.ae;
import net.optifine.shaders.ag;
import net.optifine.shaders.aj;
import net.optifine.shaders.ak;
import net.optifine.shaders.am;
import net.optifine.shaders.config.a;
import net.optifine.shaders.config.aa;
import net.optifine.shaders.config.r;
import net.optifine.shaders.config.z;
import net.optifine.shaders.d;
import net.optifine.shaders.e;
import net.optifine.shaders.f;
import net.optifine.shaders.i;
import net.optifine.shaders.n;
import net.optifine.shaders.s;
import net.optifine.shaders.t;
import net.optifine.shaders.u;
import net.optifine.shaders.uniform.b;
import net.optifine.shaders.uniform.g;
import net.optifine.shaders.uniform.h;
import net.optifine.shaders.uniform.j;
import net.optifine.shaders.uniform.k;
import net.optifine.shaders.uniform.l;
import net.optifine.shaders.uniform.m;
import net.optifine.shaders.uniform.o;
import net.optifine.shaders.uniform.p;
import net.optifine.shaders.uniform.q;
import net.optifine.shaders.v;
import net.optifine.shaders.w;
import net.optifine.shaders.x;
import net.optifine.texture.c;
import net.optifine.util.af;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector4f;

public class ah {
    static net.minecraft.client.d P;
    static EntityRenderer bgT;
    public static boolean exO;
    public static boolean exP;
    public static ContextCapabilities exQ;
    public static String exR;
    public static String exS;
    public static String exT;
    public static boolean exU;
    public static int exV;
    private static int exW;
    private static int exX;
    public static int exY;
    public static int exZ;
    public static boolean eya;
    public static boolean eyb;
    public static boolean eyc;
    public static boolean eyd;
    public static boolean eye;
    public static boolean eyf;
    public static boolean eyg;
    private static boolean eyh;
    private static boolean eyi;
    private static boolean eyj;
    private static boolean eyk;
    private static boolean eyl;
    public static boolean eym;
    public static boolean eyn;
    public static boolean eyo;
    static float[] eyp;
    static float[] eyq;
    static float[] eyr;
    static float[] eys;
    static float[] eyt;
    static float[] eyu;
    static float[] eyv;
    static float[] eyw;
    private static final float[] eyx;
    static float eyy;
    static float eyz;
    static float eyA;
    static float eyB;
    static float eyC;
    static float eyD;
    static long dcf;
    static long eyE;
    static long eyF;
    static float eyG;
    static float eyH;
    static float eyI;
    static int eyJ;
    static long bgf;
    static long bnS;
    static long eyK;
    static int bYY;
    static float eyL;
    static float eyM;
    static int eyN;
    static float eyO;
    static float eyP;
    public static float eyQ;
    public static float eyR;
    public static float eyS;
    static boolean eyT;
    static int eyU;
    static int eyV;
    static float eyW;
    static float eyX;
    static float eyY;
    static float eyZ;
    static float eza;
    static float ezb;
    static boolean ezc;
    static int ezd;
    static float eze;
    static float ezf;
    static boolean ezg;
    static boolean ezh;
    public static int ezi;
    public static int ezj;
    public static int ezk;
    public static boolean ezl;
    public static boolean ezm;
    public static boolean ezn;
    public static boolean ezo;
    public static boolean ezp;
    public static boolean ezq;
    private static boolean ezr;
    private static int ezs;
    private static boolean ezt;
    public static int ezu;
    public static int ezv;
    private static final p ezw;
    public static l ezx;
    public static h ezy;
    public static h ezz;
    public static h ezA;
    public static h ezB;
    public static h ezC;
    public static h ezD;
    public static h ezE;
    public static h ezF;
    public static h ezG;
    public static h ezH;
    public static h ezI;
    public static h ezJ;
    public static h ezK;
    public static h ezL;
    public static h ezM;
    public static h ezN;
    public static h ezO;
    public static h ezP;
    public static h ezQ;
    public static h ezR;
    public static h ezS;
    public static h ezT;
    public static h ezU;
    public static h ezV;
    public static h ezW;
    public static h ezX;
    public static h ezY;
    public static h ezZ;
    public static h eAa;
    public static h eAb;
    public static h eAc;
    public static h eAd;
    public static h eAe;
    public static h eAf;
    public static h eAg;
    public static h eAh;
    public static h eAi;
    public static h eAj;
    public static h eAk;
    public static h eAl;
    public static g eAm;
    public static k eAn;
    public static k eAo;
    public static h eAp;
    public static h eAq;
    public static h eAr;
    public static h eAs;
    public static g eAt;
    public static g eAu;
    public static g eAv;
    public static g eAw;
    public static g eAx;
    public static g eAy;
    public static g eAz;
    public static g eAA;
    public static g eAB;
    public static g eAC;
    public static k eAD;
    public static k eAE;
    public static k eAF;
    public static k eAG;
    public static k eAH;
    public static k eAI;
    public static o eAJ;
    public static o eAK;
    public static o eAL;
    public static o eAM;
    public static o eAN;
    public static o eAO;
    public static o eAP;
    public static o eAQ;
    public static o eAR;
    public static o eAS;
    public static g eAT;
    public static g eAU;
    public static j eAV;
    public static j eAW;
    public static j eAX;
    public static h eAY;
    public static h eAZ;
    public static g eBa;
    public static g eBb;
    public static g eBc;
    public static h eBd;
    public static g eBe;
    public static j eBf;
    public static m eBg;
    public static h eBh;
    static double eBi;
    static double eBj;
    static double eBk;
    static double eBl;
    static double eBm;
    static double eBn;
    static int eBo;
    static int eBp;
    static int eBq;
    public static boolean eBr;
    static int eBs;
    static int eBt;
    static int eBu;
    static int eBv;
    static float eBw;
    static float eBx;
    static boolean eBy;
    static float eBz;
    static int eBA;
    static int eBB;
    public static boolean eBC;
    static boolean eBD;
    static final int eBE = 8;
    static final int eBF = 8;
    static final int eBG = 3;
    static final int eBH = 8;
    static final int eBI = 2;
    static int eBJ;
    static int eBK;
    static int eBL;
    static int eBM;
    static int eBN;
    static int eBO;
    static int eBP;
    static int eBQ;
    private static final int[] eBR;
    public static boolean[] eBS;
    public static Vector4f[] eBT;
    private static final v eBU;
    public static final s eBV;
    public static final s eBW;
    public static final s eBX;
    public static final s eBY;
    public static final s eBZ;
    public static final s eCa;
    public static final s eCb;
    public static final s eCc;
    public static final s eCd;
    public static final s eCe;
    public static final s eCf;
    public static final s eCg;
    public static final s eCh;
    public static final s eCi;
    public static final s eCj;
    public static final s eCk;
    public static final s eCl;
    public static final s eCm;
    public static final s eCn;
    public static final s eCo;
    public static final s eCp;
    public static final s eCq;
    public static final s eCr;
    public static final s eCs;
    public static final s eCt;
    public static final s[] eCu;
    public static final s eCv;
    public static final s eCw;
    public static final s eCx;
    public static final s eCy;
    public static final s[] eCz;
    public static final s eCA;
    public static final s eCB;
    public static final int eCC;
    public static final s[] eCD;
    public static s eCE;
    public static int eCF;
    private static final t eCG;
    private static boolean eCH;
    static IntBuffer eCI;
    private static int eCJ;
    public static Properties eCK;
    public static Properties eCL;
    public static ITextureObject eCM;
    public static boolean[] eCN;
    public static boolean[] eCO;
    public static boolean[] eCP;
    public static boolean[] eCQ;
    public static boolean[] eCR;
    public static boolean eCS;
    public static boolean eCT;
    public static float eCU;
    public static float eCV;
    public static float eCW;
    public static int eCX;
    public static int eCY;
    public static int eCZ;
    public static int eDa;
    public static int eDb;
    public static int eDc;
    public static boolean eDd;
    public static boolean eDe;
    public static boolean eDf;
    public static net.optifine.shaders.config.h eDg;
    public static net.optifine.shaders.config.h eDh;
    public static int eDi;
    public static final int eDj = 3;
    public static final int eDk = 2;
    public static final String[] eDl;
    public static final String[] eDm;
    public static final int[] eDn;
    public static final int[] eDo;
    private static net.optifine.shaders.m eDp;
    public static boolean eDq;
    public static String eDr;
    public static final String eDs = "OFF";
    public static final String eDt = "(internal)";
    public static final String eDu = "shaderpacks";
    public static final String eDv = "optionsshaders.txt";
    public static final File eDw;
    static File eDx;
    private static net.optifine.shaders.config.o[] eDy;
    private static Set<String> eDz;
    static aa[] eDA;
    static Map<String, net.optifine.shaders.config.j> eDB;
    static Map<String, net.optifine.expr.m> eDC;
    public static final String eDD = "/shaders/shaders.properties";
    public static net.optifine.shaders.config.g eDE;
    public static net.optifine.shaders.config.h eDF;
    public static net.optifine.shaders.config.h eDG;
    public static net.optifine.shaders.config.h eDH;
    public static net.optifine.shaders.config.h eDI;
    public static net.optifine.shaders.config.h eDJ;
    public static net.optifine.shaders.config.h eDK;
    public static net.optifine.shaders.config.h eDL;
    public static net.optifine.shaders.config.h eDM;
    public static net.optifine.shaders.config.h eDN;
    public static net.optifine.shaders.config.h eDO;
    public static net.optifine.shaders.config.h eDP;
    public static net.optifine.shaders.config.h eDQ;
    public static net.optifine.shaders.config.h eDR;
    public static net.optifine.shaders.config.h eDS;
    public static net.optifine.shaders.config.h eDT;
    public static net.optifine.shaders.config.h eDU;
    private static Map<String, String> eDV;
    private static net.minecraft.world.w dFb;
    private static final List<Integer> eDW;
    private static net.optifine.shaders.l[] eDX;
    private static net.optifine.shaders.l[] eDY;
    private static net.optifine.shaders.l[] eDZ;
    private static String eEa;
    private static b eEb;
    private static final int eEc = 0;
    private static final int eEd = 1;
    private static final int eEe = 2;
    private static final String[] eEf;
    public static final boolean eEg = true;
    private static final boolean eEh = true;
    public static final boolean eEi;
    public static float eEj;
    public static float eEk;
    public static float eEl;
    public static float eEm;
    public static float eEn;
    public static float eEo;
    public static int eEp;
    public static float eEq;
    public static float eEr;
    public static float eEs;
    public static float eEt;
    public static float eEu;
    public static int eEv;
    public static int[] eEw;
    private static net.optifine.shaders.l eEx;
    private static boolean eEy;
    private static int eEz;
    static final int[] eEA;
    private static final int eEB;
    private static final ByteBuffer eEC;
    static final float[] eED;
    static final float[] eEE;
    static final float[] eEF;
    static final float[] eEG;
    static final float[] eEH;
    static final float[] eEI;
    static final float[] eEJ;
    static final float[] eEK;
    static final FloatBuffer eEL;
    static final FloatBuffer eEM;
    static final FloatBuffer eEN;
    static final FloatBuffer eEO;
    static final FloatBuffer eEP;
    static final FloatBuffer eEQ;
    static final FloatBuffer eER;
    static final FloatBuffer eES;
    static final FloatBuffer eET;
    static final FloatBuffer eEU;
    static final FloatBuffer eEV;
    static final FloatBuffer eEW;
    static final IntBuffer eEX;
    static final IntBuffer eEY;
    static final IntBuffer eEZ;
    static final IntBuffer eFa;
    static final IntBuffer eFb;
    static final IntBuffer eFc;
    static final IntBuffer eFd;
    static final IntBuffer eFe;
    static final net.optifine.shaders.j eFf;
    static Map<Block, Integer> eFg;
    private static final String[] eFh;
    private static final int[] eFi;
    private static final Pattern eFj;
    public static int[] eFk;
    public static int ewi;

    private static ByteBuffer jR(int n2) {
        ByteBuffer byteBuffer = eEC;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2);
        return byteBuffer.slice();
    }

    public static IntBuffer jS(int n2) {
        ByteBuffer byteBuffer = eEC;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2 * 4);
        return byteBuffer.asIntBuffer();
    }

    private static FloatBuffer jT(int n2) {
        ByteBuffer byteBuffer = eEC;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2 * 4);
        return byteBuffer.asFloatBuffer();
    }

    private static IntBuffer[] bL(int n2, int n3) {
        IntBuffer[] intBufferArray = new IntBuffer[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            intBufferArray[i2] = ah.jS(n3);
        }
        return intBufferArray;
    }

    public static void aEX() {
        Object object;
        w.info("Load shaders configuration.");
        try {
            if (!eDw.exists()) {
                eDw.mkdir();
            }
        }
        catch (Exception exception) {
            w.iG("Failed to open the shaderpacks directory: " + String.valueOf(eDw));
        }
        eCL = new af();
        eCL.setProperty(a.eFN.aHo(), "");
        if (eDx.exists()) {
            try {
                object = new FileReader(eDx);
                eCL.load((Reader)object);
                ((InputStreamReader)object).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (!eDx.exists()) {
            try {
                ah.aEY();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object = a.values();
        for (int i2 = 0; i2 < ((a[])object).length; ++i2) {
            Object object2 = object[i2];
            String string = ((a)((Object)object2)).aHo();
            String string2 = ((a)((Object)object2)).aHp();
            String string3 = eCL.getProperty(string, string2);
            ah.a((a)((Object)object2), string3);
        }
        ah.aEZ();
    }

    private static void a(a a2, String string) {
        if (string == null) {
            string = a2.aHp();
        }
        switch (a2) {
            case eFE: {
                eDi = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFF: {
                eDe = net.minecraft.src.a.p(string, true);
                break;
            }
            case eFG: {
                eDf = net.minecraft.src.a.p(string, true);
                break;
            }
            case eFH: {
                eCV = net.minecraft.src.a.b(string, 1.0f);
                break;
            }
            case eFI: {
                eCW = net.minecraft.src.a.b(string, 1.0f);
                break;
            }
            case eFJ: {
                eCU = net.minecraft.src.a.b(string, 0.125f);
                break;
            }
            case eFK: {
                eCT = net.minecraft.src.a.p(string, true);
                break;
            }
            case eFL: {
                eDh.je(string);
                break;
            }
            case eFM: {
                eDg.je(string);
                break;
            }
            case eFN: {
                eDr = string;
                break;
            }
            case eFO: {
                eCS = net.minecraft.src.a.p(string, true);
                break;
            }
            case eFP: {
                eDd = net.minecraft.src.a.p(string, true);
                break;
            }
            case eFQ: {
                eCX = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFR: {
                eCY = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFS: {
                eCZ = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFT: {
                eDa = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFU: {
                eDa = net.minecraft.src.a.x(string, 0);
                break;
            }
            case eFV: {
                eDa = net.minecraft.src.a.x(string, 0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + String.valueOf((Object)a2));
            }
        }
    }

    public static void aEY() {
        w.info("Save shaders configuration.");
        if (eCL == null) {
            eCL = new af();
        }
        a[] aArray = a.values();
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            a a2 = aArray[i2];
            String string = a2.aHo();
            String string2 = ah.b(a2);
            eCL.setProperty(string, string2);
        }
        try {
            FileWriter fileWriter = new FileWriter(eDx);
            eCL.store(fileWriter, null);
            fileWriter.close();
        }
        catch (Exception exception) {
            w.iG("Error saving configuration: " + exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    public static String b(a a2) {
        switch (a2) {
            case eFE: {
                return Integer.toString(eDi);
            }
            case eFF: {
                return Boolean.toString(eDe);
            }
            case eFG: {
                return Boolean.toString(eDf);
            }
            case eFH: {
                return Float.toString(eCV);
            }
            case eFI: {
                return Float.toString(eCW);
            }
            case eFJ: {
                return Float.toString(eCU);
            }
            case eFK: {
                return Boolean.toString(eCT);
            }
            case eFL: {
                return eDh.aHv();
            }
            case eFM: {
                return eDg.aHv();
            }
            case eFN: {
                return eDr;
            }
            case eFO: {
                return Boolean.toString(eCS);
            }
            case eFP: {
                return Boolean.toString(eDd);
            }
            case eFQ: {
                return Integer.toString(eCX);
            }
            case eFR: {
                return Integer.toString(eCY);
            }
            case eFS: {
                return Integer.toString(eCZ);
            }
            case eFT: {
                return Integer.toString(eDa);
            }
            case eFU: {
                return Integer.toString(eDa);
            }
            case eFV: {
                return Integer.toString(eDa);
            }
        }
        throw new IllegalArgumentException("Unknown option: " + String.valueOf((Object)a2));
    }

    public static void iK(String string) {
        eDr = string;
        eCL.setProperty(a.eFN.aHo(), string);
        ah.aEZ();
    }

    public static void aEZ() {
        boolean bl2;
        boolean bl3 = eDq;
        boolean bl4 = ah.aFk();
        if (ah.P.bgG != null) {
            ah.P.bgG.Ld();
        }
        eDq = false;
        if (eDp != null) {
            eDp.close();
            eDp = null;
            eDV.clear();
            eDW.clear();
            eDy = null;
            eDz = null;
            eDA = null;
            eDB = null;
            eDC.clear();
            eDE.aHy();
            eDG.aHy();
            eDH.aHy();
            eDF.aHy();
            ah.aFd();
            eEa = null;
        }
        boolean bl5 = false;
        if (net.minecraft.src.a.aoi()) {
            w.info("Shaders can not be loaded, Antialiasing is enabled: " + net.minecraft.src.a.aoh() + "x");
            bl5 = true;
        }
        if (net.minecraft.src.a.aog()) {
            w.info("Shaders can not be loaded, Anisotropic Filtering is enabled: " + net.minecraft.src.a.aof() + "x");
            bl5 = true;
        }
        if (net.minecraft.src.a.aoE()) {
            w.info("Shaders can not be loaded, Fast Render is enabled.");
            bl5 = true;
        }
        String string = eCL.getProperty(a.eFN.aHo(), eDt);
        if (!bl5) {
            eDp = ah.iL(string);
            boolean bl6 = eDq = eDp != null;
        }
        if (eDq) {
            w.info("Loaded shaderpack: " + ah.aGB());
        } else {
            w.info("No shaderpack loaded.");
            eDp = new ad();
        }
        if (eEi) {
            ah.l(new File(eDw, "debug"));
        }
        ah.aGE();
        ah.aFb();
        eDy = ah.aFg();
        ah.aFc();
        boolean bl7 = eDq != bl3;
        boolean bl8 = bl2 = ah.aFk() != bl4;
        if (bl7 || bl2) {
            DefaultVertexFormats.OH();
            if (net.optifine.reflect.g.eqf.aDA()) {
                net.optifine.reflect.g.eqg.n(null);
                net.optifine.reflect.g.eqj.n(null);
            }
            ah.aFi();
        }
        if (P.Bs() != null) {
            net.optifine.p.jA();
        }
        if (ah.P.bgG != null) {
            ah.P.bgG.Le();
        }
        if ((bl7 || bl2) && P.Br() != null) {
            P.Ba();
        }
    }

    public static net.optifine.shaders.m iL(String string) {
        if (string == null) {
            return null;
        }
        if (!(string = string.trim()).isEmpty() && !string.equals(eDs)) {
            if (string.equals(eDt)) {
                return new ab();
            }
            try {
                File file = new File(eDw, string);
                return file.isDirectory() ? new ac(string, file) : (file.isFile() && string.toLowerCase().endsWith(".zip") ? new ae(string, file) : null);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static net.optifine.shaders.m aFa() {
        return eDp;
    }

    private static void aFb() {
        eDW.clear();
        for (int i2 = -128; i2 <= 128; ++i2) {
            String string = "/shaders/world" + i2;
            if (!eDp.iA(string)) continue;
            eDW.add(i2);
        }
        if (eDW.size() > 0) {
            Object[] objectArray = eDW.toArray(new Integer[eDW.size()]);
            net.minecraft.src.a.fN("[Shaders] Worlds: " + net.minecraft.src.a.c(objectArray));
        }
    }

    private static void aFc() {
        Object object;
        eDE.aHy();
        eDG.aHy();
        eDH.aHy();
        eDF.aHy();
        eDI.aHy();
        eDJ.aHy();
        eDK.aHy();
        eDL.aHy();
        eDM.aHy();
        eDN.aHy();
        eDO.aHy();
        eDP.aHy();
        eDQ.aHy();
        eDR.aHy();
        eDS.aHy();
        eDT.aHy();
        eDU.aHy();
        net.optifine.shaders.b.aX();
        n.aX();
        i.aX();
        eEb = null;
        for (int i2 = 0; i2 < eCD.length; ++i2) {
            object = eCD[i2];
            ((s)object).aEx();
        }
        if (eDp != null) {
            net.optifine.shaders.b.a(eDp);
            n.a(eDp);
            i.a(eDp);
            String string = eDD;
            try {
                object = eDp.iz(eDD);
                if (object == null) {
                    return;
                }
                object = net.optifine.shaders.config.d.b((InputStream)object, eDD);
                af af2 = new af();
                af2.load((InputStream)object);
                ((InputStream)object).close();
                eDE.c(af2);
                eDG.c(af2);
                eDH.c(af2);
                eDF.c(af2);
                eDI.c(af2);
                eDJ.c(af2);
                eDK.c(af2);
                eDM.c(af2);
                eDL.c(af2);
                eDN.c(af2);
                eDO.c(af2);
                eDP.c(af2);
                eDQ.c(af2);
                eDR.c(af2);
                eDS.c(af2);
                eDT.c(af2);
                eDU.c(af2);
                eDz = net.optifine.shaders.config.x.c(af2, eDy);
                eDA = net.optifine.shaders.config.x.a(af2, eDy);
                eDB = net.optifine.shaders.config.x.a(af2, eDA, eDy);
                eDC = net.optifine.shaders.config.x.b(af2, eDy);
                eDX = ah.b(af2, 0);
                eDY = ah.b(af2, 1);
                eDZ = ah.b(af2, 2);
                eEa = af2.getProperty("texture.noise");
                if (eEa != null) {
                    eEy = true;
                }
                eEb = net.optifine.shaders.config.x.e(af2);
                net.optifine.shaders.config.x.f(af2);
                net.optifine.shaders.config.x.g(af2);
                net.optifine.shaders.config.x.h(af2);
                net.optifine.shaders.config.x.i(af2);
            }
            catch (IOException iOException) {
                net.minecraft.src.a.warn("[Shaders] Error reading: /shaders/shaders.properties");
            }
        }
    }

    private static net.optifine.shaders.l[] b(Properties properties, int n2) {
        String string = "texture." + eEf[n2] + ".";
        Set<Object> set = properties.keySet();
        ArrayList<net.optifine.shaders.l> arrayList = new ArrayList<net.optifine.shaders.l>();
        for (Object object : set) {
            String string2 = (String)object;
            if (!string2.startsWith(string)) continue;
            String string3 = net.optifine.util.aj.ax(string2, string);
            string3 = net.optifine.util.aj.e(string3, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String string4 = properties.getProperty(string2).trim();
            int n3 = ah.m(n2, string3);
            if (n3 < 0) {
                w.iH("Invalid texture name: " + string2);
                continue;
            }
            net.optifine.shaders.l l2 = ah.i(n3, string4);
            if (l2 == null) continue;
            w.info("Custom texture: " + string2 + " = " + string4);
            arrayList.add(l2);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        net.optifine.shaders.l[] lArray = arrayList.toArray(new net.optifine.shaders.l[arrayList.size()]);
        return lArray;
    }

    private static net.optifine.shaders.l i(int n2, String string) {
        if (string == null) {
            return null;
        }
        return (string = string.trim()).indexOf(58) >= 0 ? ah.j(n2, string) : (string.indexOf(32) >= 0 ? ah.k(n2, string) : ah.l(n2, string));
    }

    private static net.optifine.shaders.l j(int n2, String string) {
        String string2 = string.trim();
        int n3 = 0;
        if (string2.startsWith("minecraft:textures/")) {
            if ((string2 = net.optifine.util.aj.az(string2, ".png")).endsWith("_n.png")) {
                string2 = net.optifine.util.aj.h(string2, "_n.png", ".png");
                n3 = 1;
            } else if (string2.endsWith("_s.png")) {
                string2 = net.optifine.util.aj.h(string2, "_s.png", ".png");
                n3 = 2;
            }
        }
        cm cm2 = new cm(string2);
        e e2 = new e(n2, cm2, n3);
        return e2;
    }

    private static net.optifine.shaders.l k(int n2, String string) {
        net.optifine.config.a a2 = new net.optifine.config.a("Shaders");
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>(Arrays.asList(stringArray));
        String string2 = (String)arrayDeque.poll();
        net.optifine.texture.d d2 = (net.optifine.texture.d)a2.a((String)arrayDeque.poll(), net.optifine.texture.d.values(), "texture type");
        if (d2 == null) {
            w.iH("Invalid raw texture type: " + string);
            return null;
        }
        net.optifine.texture.a a3 = (net.optifine.texture.a)a2.a((String)arrayDeque.poll(), net.optifine.texture.a.values(), "internal format");
        if (a3 == null) {
            w.iH("Invalid raw texture internal format: " + string);
            return null;
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        switch (d2) {
            case eMn: {
                n3 = a2.x((String)arrayDeque.poll(), -1);
                break;
            }
            case eMo: {
                n3 = a2.x((String)arrayDeque.poll(), -1);
                n4 = a2.x((String)arrayDeque.poll(), -1);
                break;
            }
            case eMp: {
                n3 = a2.x((String)arrayDeque.poll(), -1);
                n4 = a2.x((String)arrayDeque.poll(), -1);
                n5 = a2.x((String)arrayDeque.poll(), -1);
                break;
            }
            case eMq: {
                n3 = a2.x((String)arrayDeque.poll(), -1);
                n4 = a2.x((String)arrayDeque.poll(), -1);
                break;
            }
            default: {
                w.iH("Invalid raw texture type: " + String.valueOf((Object)d2));
                return null;
            }
        }
        if (n3 >= 0 && n4 >= 0 && n5 >= 0) {
            net.optifine.texture.b b2 = (net.optifine.texture.b)a2.a((String)arrayDeque.poll(), net.optifine.texture.b.values(), "pixel format");
            if (b2 == null) {
                w.iH("Invalid raw texture pixel format: " + string);
                return null;
            }
            c c2 = (c)a2.a((String)arrayDeque.poll(), c.values(), "pixel type");
            if (c2 == null) {
                w.iH("Invalid raw texture pixel type: " + string);
                return null;
            }
            if (!arrayDeque.isEmpty()) {
                w.iH("Invalid raw texture, too many parameters: " + string);
                return null;
            }
            return ah.a(n2, string, string2, d2, a3, n3, n4, n5, b2, c2);
        }
        w.iH("Invalid raw texture size: " + string);
        return null;
    }

    private static net.optifine.shaders.l a(int n2, String string, String string2, net.optifine.texture.d d2, net.optifine.texture.a a2, int n3, int n4, int n5, net.optifine.texture.b b2, c c2) {
        try {
            String string3 = "shaders/" + net.optifine.util.aj.ax(string2, "/");
            InputStream inputStream = eDp.iz(string3);
            if (inputStream == null) {
                w.iH("Raw texture not found: " + string2);
                return null;
            }
            byte[] byArray = net.minecraft.src.a.i(inputStream);
            IOUtils.closeQuietly((InputStream)inputStream);
            ByteBuffer byteBuffer = GLAllocation.cE(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.flip();
            f f2 = new f(d2, a2, n3, n4, n5, b2, c2, byteBuffer, n2);
            return f2;
        }
        catch (IOException iOException) {
            w.iH("Error loading raw texture: " + string2);
            w.iH(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    private static net.optifine.shaders.l l(int n2, String object) {
        if (((String)(object = ((String)object).trim())).indexOf(46) < 0) {
            object = (String)object + ".png";
        }
        try {
            String string = "shaders/" + net.optifine.util.aj.ax((String)object, "/");
            InputStream inputStream = eDp.iz(string);
            if (inputStream == null) {
                w.iH("Texture not found: " + (String)object);
                return null;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
            am am2 = new am(string);
            am2.b(P.Br());
            d d2 = new d(n2, string, am2);
            return d2;
        }
        catch (IOException iOException) {
            w.iH("Error loading texture: " + (String)object);
            w.iH(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    private static int m(int n2, String string) {
        if (n2 == 0) {
            if (string.equals("texture")) {
                return 0;
            }
            if (string.equals("lightmap")) {
                return 1;
            }
            if (string.equals("normals")) {
                return 2;
            }
            if (string.equals("specular")) {
                return 3;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 4;
            }
            if (string.equals("shadow")) {
                return eBD ? 5 : 4;
            }
            if (string.equals("shadowtex1")) {
                return 5;
            }
            if (string.equals("depthtex0")) {
                return 6;
            }
            if (string.equals("gaux1")) {
                return 7;
            }
            if (string.equals("gaux2")) {
                return 8;
            }
            if (string.equals("gaux3")) {
                return 9;
            }
            if (string.equals("gaux4")) {
                return 10;
            }
            if (string.equals("depthtex1")) {
                return 12;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return 13;
            }
            if (string.equals("shadowcolor1")) {
                return 14;
            }
            if (string.equals("noisetex")) {
                return 15;
            }
        }
        if (n2 == 1 || n2 == 2) {
            if (string.equals("colortex0") || string.equals("colortex0")) {
                return 0;
            }
            if (string.equals("colortex1") || string.equals("gdepth")) {
                return 1;
            }
            if (string.equals("colortex2") || string.equals("gnormal")) {
                return 2;
            }
            if (string.equals("colortex3") || string.equals("composite")) {
                return 3;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 4;
            }
            if (string.equals("shadow")) {
                return eBD ? 5 : 4;
            }
            if (string.equals("shadowtex1")) {
                return 5;
            }
            if (string.equals("depthtex0") || string.equals("gdepthtex")) {
                return 6;
            }
            if (string.equals("colortex4") || string.equals("gaux1")) {
                return 7;
            }
            if (string.equals("colortex5") || string.equals("gaux2")) {
                return 8;
            }
            if (string.equals("colortex6") || string.equals("gaux3")) {
                return 9;
            }
            if (string.equals("colortex7") || string.equals("gaux4")) {
                return 10;
            }
            if (string.equals("depthtex1")) {
                return 11;
            }
            if (string.equals("depthtex2")) {
                return 12;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return 13;
            }
            if (string.equals("shadowcolor1")) {
                return 14;
            }
            if (string.equals("noisetex")) {
                return 15;
            }
        }
        return -1;
    }

    private static void a(net.optifine.shaders.l[] lArray) {
        if (lArray != null) {
            for (int i2 = 0; i2 < lArray.length; ++i2) {
                net.optifine.shaders.l l2 = lArray[i2];
                GlStateManager.cN(33984 + l2.aEp());
                int n2 = l2.aEr();
                int n3 = l2.aEt();
                if (n3 == 3553) {
                    GlStateManager.ap(n2);
                    continue;
                }
                GL11.glBindTexture((int)n3, (int)n2);
            }
        }
    }

    private static void aFd() {
        ah.b(eDX);
        ah.b(eDY);
        ah.b(eDZ);
        eDX = null;
        eDY = null;
        eDZ = null;
    }

    private static void b(net.optifine.shaders.l[] lArray) {
        if (lArray != null) {
            for (int i2 = 0; i2 < lArray.length; ++i2) {
                net.optifine.shaders.l l2 = lArray[i2];
                l2.aEs();
            }
        }
    }

    public static net.optifine.shaders.config.o[] iM(String string) {
        Object[] objectArray = (net.optifine.shaders.config.o[])eDy.clone();
        if (eDB == null) {
            if (eDA != null) {
                net.optifine.shaders.config.p p2 = new net.optifine.shaders.config.p(eDA, (net.optifine.shaders.config.o[])objectArray);
                objectArray = (net.optifine.shaders.config.o[])net.minecraft.src.a.a(objectArray, p2, 0);
            }
            objectArray = ah.a((net.optifine.shaders.config.o[])objectArray);
            return objectArray;
        }
        Object object = string != null ? "screen." + string : "screen";
        net.optifine.shaders.config.j j2 = eDB.get(object);
        if (j2 == null) {
            return new net.optifine.shaders.config.o[0];
        }
        net.optifine.shaders.config.o[] oArray = j2.aHH();
        ArrayList<net.optifine.shaders.config.o> arrayList = new ArrayList<net.optifine.shaders.config.o>();
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            net.optifine.shaders.config.o o2 = oArray[i2];
            if (o2 == null) {
                arrayList.add(null);
                continue;
            }
            if (o2 instanceof r) {
                net.optifine.shaders.config.o[] oArray2 = ah.a(eDB, (net.optifine.shaders.config.o[])objectArray);
                arrayList.addAll(Arrays.asList(oArray2));
                continue;
            }
            arrayList.add(o2);
        }
        net.optifine.shaders.config.o[] oArray3 = arrayList.toArray(new net.optifine.shaders.config.o[arrayList.size()]);
        return oArray3;
    }

    public static int T(String string, int n2) {
        Object object;
        Object object2 = object = string != null ? "screen." + string : "screen";
        if (eDB == null) {
            return n2;
        }
        net.optifine.shaders.config.j j2 = eDB.get(object);
        return j2 == null ? n2 : j2.aHI();
    }

    private static net.optifine.shaders.config.o[] a(Map<String, net.optifine.shaders.config.j> map, net.optifine.shaders.config.o[] oArray) {
        Object object;
        Object object2;
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : map.keySet()) {
            object2 = map.get(string);
            object = ((net.optifine.shaders.config.j)object2).aHH();
            for (int i2 = 0; i2 < ((net.optifine.shaders.config.o[])object).length; ++i2) {
                net.optifine.shaders.config.o o2 = object[i2];
                if (o2 == null) continue;
                hashSet.add(o2.getName());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < oArray.length; ++i3) {
            object2 = oArray[i3];
            if (!((net.optifine.shaders.config.o)object2).wE() || hashSet.contains(object = ((net.optifine.shaders.config.o)object2).getName())) continue;
            arrayList.add(object2);
        }
        net.optifine.shaders.config.o[] oArray2 = arrayList.toArray(new net.optifine.shaders.config.o[arrayList.size()]);
        return oArray2;
    }

    public static net.optifine.shaders.config.o iN(String string) {
        return ag.a(string, eDy);
    }

    public static net.optifine.shaders.config.o[] aFe() {
        return eDy;
    }

    public static boolean iO(String string) {
        return eDz != null && eDz.contains(string);
    }

    private static net.optifine.shaders.config.o[] a(net.optifine.shaders.config.o[] oArray) {
        ArrayList<net.optifine.shaders.config.o> arrayList = new ArrayList<net.optifine.shaders.config.o>();
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            net.optifine.shaders.config.o o2 = oArray[i2];
            if (!o2.wE()) continue;
            arrayList.add(o2);
        }
        net.optifine.shaders.config.o[] oArray2 = arrayList.toArray(new net.optifine.shaders.config.o[arrayList.size()]);
        return oArray2;
    }

    public static void aFf() {
        ah.a(eDy, eDp);
    }

    private static void a(net.optifine.shaders.config.o[] oArray, net.optifine.shaders.m m2) {
        af af2 = new af();
        if (eDy != null) {
            for (int i2 = 0; i2 < oArray.length; ++i2) {
                net.optifine.shaders.config.o o2 = oArray[i2];
                if (!o2.aIg() || !o2.isEnabled()) continue;
                af2.setProperty(o2.getName(), o2.SN());
            }
        }
        try {
            ah.a(m2, af2);
        }
        catch (IOException iOException) {
            net.minecraft.src.a.warn("[Shaders] Error saving configuration for " + eDp.getName());
            iOException.printStackTrace();
        }
    }

    private static void a(net.optifine.shaders.m m2, Properties properties) {
        String string = "shaderpacks/" + m2.getName() + ".txt";
        File file = new File(net.minecraft.client.d.AZ().bhf, string);
        if (properties.isEmpty()) {
            file.delete();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, null);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    private static net.optifine.shaders.config.o[] aFg() {
        try {
            String[] stringArray = eBU.aER();
            net.optifine.shaders.config.o[] oArray = net.optifine.shaders.config.x.a(eDp, stringArray, eDW);
            Properties properties = ah.b(eDp);
            for (int i2 = 0; i2 < oArray.length; ++i2) {
                net.optifine.shaders.config.o o2 = oArray[i2];
                String string = properties.getProperty(o2.getName());
                if (string == null) continue;
                o2.aHy();
                if (o2.jq(string)) continue;
                net.minecraft.src.a.warn("[Shaders] Invalid value, option: " + o2.getName() + ", value: " + string);
            }
            return oArray;
        }
        catch (IOException iOException) {
            net.minecraft.src.a.warn("[Shaders] Error reading configuration for " + eDp.getName());
            iOException.printStackTrace();
            return null;
        }
    }

    private static Properties b(net.optifine.shaders.m m2) {
        af af2 = new af();
        String string = "shaderpacks/" + m2.getName() + ".txt";
        File file = new File(net.minecraft.client.d.AZ().bhf, string);
        if (file.exists() && file.isFile() && file.canRead()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            af2.load(fileInputStream);
            fileInputStream.close();
            return af2;
        }
        return af2;
    }

    public static net.optifine.shaders.config.o[] b(net.optifine.shaders.config.o[] oArray) {
        ArrayList<net.optifine.shaders.config.o> arrayList = new ArrayList<net.optifine.shaders.config.o>();
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            net.optifine.shaders.config.o o2 = oArray[i2];
            if (!o2.isEnabled() || !o2.aIg()) continue;
            arrayList.add(o2);
        }
        net.optifine.shaders.config.o[] oArray2 = arrayList.toArray(new net.optifine.shaders.config.o[arrayList.size()]);
        return oArray2;
    }

    private static String b(String string, net.optifine.shaders.config.o[] oArray) {
        if (oArray != null && oArray.length > 0) {
            for (int i2 = 0; i2 < oArray.length; ++i2) {
                net.optifine.shaders.config.o o2 = oArray[i2];
                if (!o2.ju(string)) continue;
                string = o2.aHV();
                break;
            }
            return string;
        }
        return string;
    }

    public static ArrayList aFh() {
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(eDs);
        arrayList.add(eDt);
        int n2 = arrayList.size();
        try {
            if (!eDw.exists()) {
                eDw.mkdir();
            }
            object = eDw.listFiles();
            for (int i2 = 0; i2 < ((File[])object).length; ++i2) {
                File file = object[i2];
                String string = file.getName();
                if (file.isDirectory()) {
                    File file2;
                    if (string.equals("debug") || !(file2 = new File(file, "shaders")).exists() || !file2.isDirectory()) continue;
                    arrayList.add(string);
                    continue;
                }
                if (!file.isFile() || !string.toLowerCase().endsWith(".zip")) continue;
                arrayList.add(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        object = arrayList.subList(n2, arrayList.size());
        Collections.sort(object, String.CASE_INSENSITIVE_ORDER);
        return arrayList;
    }

    public static int iP(String string) {
        int n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
        if (n2 != 36053) {
            System.err.format("FramebufferStatus 0x%04X at %s\n", n2, string);
        }
        return n2;
    }

    public static int iQ(String string) {
        int n2 = GlStateManager.JZ();
        return n2;
    }

    private static String n(int n2, String string) {
        String string2;
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        if (n2 == 1286) {
            int n3 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
            object2 = ah.jV(n3);
            object = ", fbStatus: " + n3 + " (" + (String)object2 + ")";
            stringBuilder.append((String)object);
        }
        if ((string2 = eCE.getName()).isEmpty()) {
            string2 = "none";
        }
        stringBuilder.append(", program: " + string2);
        object2 = ah.jU(eCF);
        if (object2 != eCE) {
            object = ((s)object2).getName();
            if (((String)object).isEmpty()) {
                object = "none";
            }
            stringBuilder.append(" (" + (String)object + ")");
        }
        if (string.equals("setDrawBuffers")) {
            stringBuilder.append(", drawBuffers: " + eCE.aED());
        }
        return stringBuilder.toString();
    }

    private static s jU(int n2) {
        for (int i2 = 0; i2 < eCD.length; ++i2) {
            s s2 = eCD[i2];
            if (s2.getId() != n2) continue;
            return s2;
        }
        return eBV;
    }

    private static String jV(int n2) {
        switch (n2) {
            case 33305: {
                return "Undefined";
            }
            case 36053: {
                return "Complete";
            }
            case 36054: {
                return "Incomplete attachment";
            }
            case 36055: {
                return "Incomplete missing attachment";
            }
            case 36059: {
                return "Incomplete draw buffer";
            }
            case 36060: {
                return "Incomplete read buffer";
            }
            case 36061: {
                return "Unsupported";
            }
            case 36182: {
                return "Incomplete multisample";
            }
            case 36264: {
                return "Incomplete layer targets";
            }
        }
        return "Unknown";
    }

    private static void iR(String string) {
        ah.P.bha.Ey().c(new net.minecraft.util.s(string));
    }

    private static void iS(String string) {
        w.iG(string);
        ah.P.bha.Ey().c(new net.minecraft.util.s(string));
    }

    public static void a(String string, IntBuffer intBuffer) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(string).append(" [pos ").append(intBuffer.position()).append(" lim ").append(intBuffer.limit()).append(" cap ").append(intBuffer.capacity()).append(" :");
        int n2 = intBuffer.limit();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(" ").append(intBuffer.get(i2));
        }
        stringBuilder.append("]");
        w.info(stringBuilder.toString());
    }

    public static void a(net.minecraft.client.d d2) {
        ah.aGD();
        P = d2;
        exQ = GLContext.getCapabilities();
        exR = GL11.glGetString((int)7938);
        exS = GL11.glGetString((int)7936);
        exT = GL11.glGetString((int)7937);
        w.info("OpenGL Version: " + exR);
        w.info("Vendor:  " + exS);
        w.info("Renderer: " + exT);
        w.info("Capabilities: " + (ah.exQ.OpenGL20 ? " 2.0 " : " - ") + (ah.exQ.OpenGL21 ? " 2.1 " : " - ") + (ah.exQ.OpenGL30 ? " 3.0 " : " - ") + (ah.exQ.OpenGL32 ? " 3.2 " : " - ") + (ah.exQ.OpenGL40 ? " 4.0 " : " - "));
        w.info("GL_MAX_DRAW_BUFFERS: " + GL11.glGetInteger((int)34852));
        w.info("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL11.glGetInteger((int)36063));
        w.info("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL11.glGetInteger((int)34930));
        exU = ah.exQ.OpenGL30;
        ah.aEX();
    }

    public static void aFi() {
        if (ah.aFk()) {
            eEj = 0.5f;
            eEk = 0.6f;
            eEl = 0.8f;
        } else {
            eEj = 1.0f;
            eEk = 1.0f;
            eEl = 1.0f;
        }
    }

    public static boolean aFj() {
        return !eDh.aBJ() ? eDh.aHC() : eDG.aBJ() || eDG.aHC();
    }

    public static boolean apc() {
        return eDH.aBJ() || eDH.aHC();
    }

    public static boolean aFk() {
        return !eDg.aBJ() ? eDg.aHC() : eDF.aBJ() || eDF.aHC();
    }

    public static boolean aFl() {
        return !eDI.aHD();
    }

    public static boolean aFm() {
        return !eDJ.aHD();
    }

    public static boolean aFn() {
        return !eDK.aHD();
    }

    public static boolean aFo() {
        return !eDL.aHD();
    }

    public static boolean aFp() {
        return !eDM.aHD();
    }

    public static boolean l(av av2) {
        switch (av2) {
            case dxV: {
                return eDN.aHC();
            }
            case dxX: {
                return eDO.aHC();
            }
            case dxW: {
                return eDP.aHC();
            }
            case dxY: {
                return eDQ.aHC();
            }
        }
        return false;
    }

    public static boolean aFq() {
        return eDR.aHC();
    }

    public static boolean aFr() {
        return eDS.aHC();
    }

    public static boolean aFs() {
        return eDT.aHC();
    }

    public static boolean aFt() {
        return !eDU.aHD();
    }

    public static void init() {
        boolean bl2;
        if (!exO) {
            exO = true;
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (!exP) {
            int n2;
            Object object;
            Object object2;
            int n3;
            ah.iQ("Shaders.init pre");
            if (ah.aGB() != null) {
                // empty if block
            }
            if (!ah.exQ.OpenGL20) {
                ah.iS("No OpenGL 2.0");
            }
            if (!ah.exQ.GL_EXT_framebuffer_object) {
                ah.iS("No EXT_framebuffer_object");
            }
            eFb.position(0).limit(8);
            eEX.position(0).limit(16);
            eEY.position(0).limit(3);
            eFc.position(0).limit(8);
            eFa.position(0).limit(2);
            eEZ.position(0).limit(8);
            eBJ = 4;
            eBK = 1;
            eBL = 0;
            eBM = 0;
            eBN = 1;
            eBO = 1;
            Arrays.fill(eBR, 6408);
            Arrays.fill(eBS, true);
            Arrays.fill(eBT, null);
            Arrays.fill(eCN, false);
            Arrays.fill(eCO, false);
            Arrays.fill(eCP, false);
            Arrays.fill(eCQ, false);
            Arrays.fill(eCR, false);
            ezc = false;
            eEy = false;
            eEn = 0.0f;
            eEu = 2.0f;
            eBs = 1024;
            eBt = 1024;
            eBu = 1024;
            eBv = 1024;
            eBw = 90.0f;
            eBx = 160.0f;
            eBy = true;
            eBz = -1.0f;
            eEm = -1.0f;
            ezl = false;
            ezm = false;
            ezn = false;
            eBD = false;
            ezt = false;
            ah.aFi();
            q.aIS();
            ezw.aX();
            if (eEb != null) {
                eEb.aX();
            }
            aa aa2 = ag.a(eDA, eDy, false);
            Object object3 = "";
            if (dFb != null && eDW.contains(n3 = ah.dFb.dDl.getDimensionId())) {
                object3 = "world" + n3 + "/";
            }
            for (n3 = 0; n3 < eCD.length; ++n3) {
                s s2 = eCD[n3];
                s2.aEy();
                s2.aEz();
                if (s2.aEA() == u.evO) continue;
                object2 = s2.getName();
                object = (String)object3 + (String)object2;
                boolean bl3 = true;
                if (eDC.containsKey(object)) {
                    boolean bl4 = bl3 = bl3 && eDC.get(object).aCt();
                }
                if (aa2 != null) {
                    boolean bl5 = bl3 = bl3 && !aa2.jO((String)object);
                }
                if (!bl3) {
                    w.info("Program disabled: " + (String)object);
                    object2 = "<disabled>";
                    object = (String)object3 + (String)object2;
                }
                String string = "/shaders/" + (String)object;
                String string2 = string + ".vsh";
                String string3 = string + ".gsh";
                String string4 = string + ".fsh";
                ah.a(s2, string2, string3, string4);
                int n4 = s2.getId();
                if (n4 > 0) {
                    w.info("Program loaded: " + (String)object);
                }
                ah.c(s2);
                ah.d(s2);
            }
            eCH = false;
            for (n3 = 0; n3 < eCu.length; ++n3) {
                if (eCu[n3].getId() == 0) continue;
                eCH = true;
                break;
            }
            eBN = eBJ;
            eBq = eBM > 0 ? 1 : 0;
            eBC = eBM > 0;
            w.info("usedColorBuffers: " + eBJ);
            w.info("usedDepthBuffers: " + eBK);
            w.info("usedShadowColorBuffers: " + eBL);
            w.info("usedShadowDepthBuffers: " + eBM);
            w.info("usedColorAttachs: " + eBN);
            w.info("usedDrawBuffers: " + eBO);
            eFb.position(0).limit(eBO);
            eEX.position(0).limit(eBJ * 2);
            eFf.aX();
            for (n3 = 0; n3 < eBO; ++n3) {
                eFb.put(n3, 36064 + n3);
            }
            n3 = GL11.glGetInteger((int)34852);
            if (eBO > n3) {
                ah.iS("[Shaders] Error: Not enough draw buffers, needed: " + eBO + ", available: " + n3);
            }
            eFc.position(0).limit(eBL);
            for (n2 = 0; n2 < eBL; ++n2) {
                eFc.put(n2, 36064 + n2);
            }
            for (n2 = 0; n2 < eCD.length; ++n2) {
                for (object = object2 = eCD[n2]; ((s)object).getId() == 0 && ((s)object).aEB() != object; object = ((s)object).aEB()) {
                }
                if (object == object2 || object2 == eBW) continue;
                ((s)object2).a((s)object);
            }
            ah.aFA();
            ah.aFB();
            if (eEy) {
                ah.aFv();
            }
            if (eCM == null) {
                eCM = ak.aHk();
            }
            GlStateManager.JV();
            GlStateManager.d(-90.0f, 0.0f, 1.0f, 0.0f);
            ah.aFG();
            ah.aFH();
            GlStateManager.JW();
            exP = true;
            ah.aFw();
            ah.aFu();
            if (!bl2) {
                // empty if block
            }
            ah.iQ("Shaders.init");
        }
    }

    private static void c(s s2) {
        int n2 = GL11.glGetInteger((int)34852);
        Arrays.fill(s2.aEM(), false);
        if (s2 == eCB) {
            s2.c((IntBuffer)null);
        } else if (s2.getId() == 0) {
            if (s2 == eBW) {
                s2.c(eFd);
            } else {
                s2.c(eFe);
            }
        } else {
            String string = s2.aED();
            if (string == null) {
                if (s2 != eBW && s2 != eBX && s2 != eBY) {
                    s2.c(eFb);
                    eBO = eBJ;
                    Arrays.fill(s2.aEM(), 0, eBJ, true);
                } else {
                    s2.c(eFc);
                }
            } else {
                IntBuffer intBuffer = s2.aEF();
                int n3 = string.length();
                eBO = Math.max(eBO, n3);
                n3 = Math.min(n3, n2);
                s2.c(intBuffer);
                intBuffer.limit(n3);
                for (int i2 = 0; i2 < n3; ++i2) {
                    int n4 = ah.a(s2, string, i2);
                    intBuffer.put(i2, n4);
                }
            }
        }
    }

    private static int a(s s2, String string, int n2) {
        int n3 = 0;
        if (n2 >= string.length()) {
            return n3;
        }
        int n4 = string.charAt(n2) - 48;
        if (s2 == eBW) {
            if (n4 >= 0 && n4 <= 1) {
                n3 = n4 + 36064;
                eBL = Math.max(eBL, n4);
            }
            return n3;
        }
        if (n4 >= 0 && n4 <= 7) {
            s2.aEM()[n4] = true;
            n3 = n4 + 36064;
            eBN = Math.max(eBN, n4);
            eBJ = Math.max(eBJ, n4);
        }
        return n3;
    }

    private static void d(s s2) {
        boolean[] blArray = s2.aEM();
        Boolean[] booleanArray = s2.aEL();
        for (int i2 = 0; i2 < booleanArray.length; ++i2) {
            Boolean bl2 = booleanArray[i2];
            if (bl2 == null) continue;
            blArray[i2] = bl2;
        }
    }

    public static void aFu() {
        w.info("Reset model renderers");
        ++exV;
        w.info("Reset world renderers");
        ah.P.bgG.KI();
    }

    private static void a(s s2, String string, String string2, String string3) {
        ah.iQ("pre setupProgram");
        int n2 = ARBShaderObjects.glCreateProgramObjectARB();
        ah.iQ("create");
        if (n2 != 0) {
            ezo = false;
            ezp = false;
            ezq = false;
            int n3 = ah.a(s2, string);
            int n4 = ah.b(s2, string2);
            int n5 = ah.c(s2, string3);
            ah.iQ("create");
            if (n3 == 0 && n4 == 0 && n5 == 0) {
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                n2 = 0;
                s2.aEy();
            } else {
                if (n3 != 0) {
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
                    ah.iQ("attach");
                }
                if (n4 != 0) {
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n4);
                    ah.iQ("attach");
                    if (ezr) {
                        ARBGeometryShader4.glProgramParameteriARB((int)n2, (int)36315, (int)4);
                        ARBGeometryShader4.glProgramParameteriARB((int)n2, (int)36316, (int)5);
                        ARBGeometryShader4.glProgramParameteriARB((int)n2, (int)36314, (int)ezs);
                        ah.iQ("arbGeometryShader4");
                    }
                    ezt = true;
                }
                if (n5 != 0) {
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n5);
                    ah.iQ("attach");
                }
                if (ezo) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)ezi, (CharSequence)"mc_Entity");
                    ah.iQ("mc_Entity");
                }
                if (ezp) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)ezj, (CharSequence)"mc_midTexCoord");
                    ah.iQ("mc_midTexCoord");
                }
                if (ezq) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)ezk, (CharSequence)"at_tangent");
                    ah.iQ("at_tangent");
                }
                ARBShaderObjects.glLinkProgramARB((int)n2);
                if (GL20.glGetProgrami((int)n2, (int)35714) != 1) {
                    w.iG("Error linking program: " + n2 + " (" + s2.getName() + ")");
                }
                ah.o(n2, s2.getName());
                if (n3 != 0) {
                    ARBShaderObjects.glDetachObjectARB((int)n2, (int)n3);
                    ARBShaderObjects.glDeleteObjectARB((int)n3);
                }
                if (n4 != 0) {
                    ARBShaderObjects.glDetachObjectARB((int)n2, (int)n4);
                    ARBShaderObjects.glDeleteObjectARB((int)n4);
                }
                if (n5 != 0) {
                    ARBShaderObjects.glDetachObjectARB((int)n2, (int)n5);
                    ARBShaderObjects.glDeleteObjectARB((int)n5);
                }
                s2.k(n2);
                s2.jO(n2);
                ah.e(s2);
                ARBShaderObjects.glValidateProgramARB((int)n2);
                ah.e(eBV);
                ah.o(n2, s2.getName());
                int n6 = GL20.glGetProgrami((int)n2, (int)35715);
                if (n6 != 1) {
                    String string4 = "\"";
                    ah.iS("[Shaders] Error: Invalid program \"" + s2.getName() + "\"");
                    ARBShaderObjects.glDeleteObjectARB((int)n2);
                    n2 = 0;
                    s2.aEy();
                }
            }
        }
    }

    private static int a(s s2, String string) {
        int n2 = ARBShaderObjects.glCreateShaderObjectARB((int)35633);
        if (n2 == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(131072);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(ah.iT(string));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
            return 0;
        }
        net.optifine.shaders.config.o[] oArray = ah.b(eDy);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (bufferedReader != null) {
            try {
                bufferedReader = net.optifine.shaders.config.x.a(bufferedReader, string, eDp, 0, arrayList, 0);
                net.optifine.shaders.config.e e2 = new net.optifine.shaders.config.e();
                while (true) {
                    net.optifine.shaders.config.k k2;
                    String string2;
                    if ((string2 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    string2 = ah.b(string2, oArray);
                    stringBuilder.append(string2).append('\n');
                    if (!e2.jb(string2) || (k2 = z.jC(string2)) == null) continue;
                    if (k2.jg("mc_Entity")) {
                        ezl = true;
                        ezo = true;
                    } else if (k2.jg("mc_midTexCoord")) {
                        ezm = true;
                        ezp = true;
                    } else if (k2.jg("at_tangent")) {
                        ezn = true;
                        ezq = true;
                    }
                    if (!k2.ji("countInstances")) continue;
                    s2.jQ(k2.aHR());
                    w.info("countInstances: " + s2.aEH());
                }
            }
            catch (Exception exception) {
                w.iG("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                return 0;
            }
        }
        if (eEi) {
            ah.aj(string, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)stringBuilder);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (GL20.glGetShaderi((int)n2, (int)35713) != 1) {
            w.iG("Error compiling vertex shader: " + string);
        }
        ah.a(n2, string, arrayList);
        return n2;
    }

    private static int b(s s2, String string) {
        int n2 = ARBShaderObjects.glCreateShaderObjectARB((int)36313);
        if (n2 == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(131072);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(ah.iT(string));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
            return 0;
        }
        net.optifine.shaders.config.o[] oArray = ah.b(eDy);
        ArrayList<String> arrayList = new ArrayList<String>();
        ezr = false;
        ezs = 3;
        if (bufferedReader != null) {
            try {
                bufferedReader = net.optifine.shaders.config.x.a(bufferedReader, string, eDp, 0, arrayList, 0);
                net.optifine.shaders.config.e e2 = new net.optifine.shaders.config.e();
                while (true) {
                    String string2;
                    net.optifine.shaders.config.k k2;
                    String string3;
                    if ((string3 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    string3 = ah.b(string3, oArray);
                    stringBuilder.append(string3).append('\n');
                    if (!e2.jb(string3) || (k2 = z.jC(string3)) == null) continue;
                    if (k2.jm("GL_ARB_geometry_shader4") && ((string2 = net.minecraft.src.a.fS(k2.SN())).equals("enable") || string2.equals("require") || string2.equals("warn"))) {
                        ezr = true;
                    }
                    if (!k2.ji("maxVerticesOut")) continue;
                    ezs = k2.aHR();
                }
            }
            catch (Exception exception) {
                w.iG("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                return 0;
            }
        }
        if (eEi) {
            ah.aj(string, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)stringBuilder);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (GL20.glGetShaderi((int)n2, (int)35713) != 1) {
            w.iG("Error compiling geometry shader: " + string);
        }
        ah.a(n2, string, arrayList);
        return n2;
    }

    private static int c(s s2, String string) {
        int n2 = ARBShaderObjects.glCreateShaderObjectARB((int)35632);
        if (n2 == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(131072);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(ah.iT(string));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
            return 0;
        }
        net.optifine.shaders.config.o[] oArray = ah.b(eDy);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (bufferedReader != null) {
            try {
                bufferedReader = net.optifine.shaders.config.x.a(bufferedReader, string, eDp, 0, arrayList, 0);
                net.optifine.shaders.config.e e2 = new net.optifine.shaders.config.e();
                while (true) {
                    String string2;
                    net.optifine.shaders.config.k k2;
                    String string3;
                    if ((string3 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    string3 = ah.b(string3, oArray);
                    stringBuilder.append(string3).append('\n');
                    if (!e2.jb(string3) || (k2 = z.jC(string3)) == null) continue;
                    if (k2.aHJ()) {
                        string2 = k2.getName();
                        int n3 = z.jD(string2);
                        if (n3 >= 0) {
                            eBM = Math.max(eBM, n3 + 1);
                            continue;
                        }
                        n3 = z.jE(string2);
                        if (n3 >= 0) {
                            eBL = Math.max(eBL, n3 + 1);
                            continue;
                        }
                        n3 = z.jF(string2);
                        if (n3 >= 0) {
                            eBK = Math.max(eBK, n3 + 1);
                            continue;
                        }
                        if (string2.equals("gdepth") && eBR[1] == 6408) {
                            ah.eBR[1] = 34836;
                            continue;
                        }
                        n3 = z.jG(string2);
                        if (n3 >= 0) {
                            eBJ = Math.max(eBJ, n3 + 1);
                            continue;
                        }
                        if (!string2.equals("centerDepthSmooth")) continue;
                        ezc = true;
                        continue;
                    }
                    if (!k2.ji("shadowMapResolution") && !k2.jh("SHADOWRES")) {
                        if (!k2.jk("shadowMapFov") && !k2.jh("SHADOWFOV")) {
                            if (!k2.jk("shadowDistance") && !k2.jh("SHADOWHPL")) {
                                if (k2.jk("shadowDistanceRenderMul")) {
                                    eBz = k2.aHS();
                                    w.info("Shadow distance render mul: " + eBz);
                                    continue;
                                }
                                if (k2.jk("shadowIntervalSize")) {
                                    eEu = k2.aHS();
                                    w.info("Shadow map interval size: " + eEu);
                                    continue;
                                }
                                if (k2.s("generateShadowMipmap", true)) {
                                    Arrays.fill(eCO, true);
                                    w.info("Generate shadow mipmap");
                                    continue;
                                }
                                if (k2.s("generateShadowColorMipmap", true)) {
                                    Arrays.fill(eCQ, true);
                                    w.info("Generate shadow color mipmap");
                                    continue;
                                }
                                if (k2.s("shadowHardwareFiltering", true)) {
                                    Arrays.fill(eCN, true);
                                    w.info("Hardware shadow filtering enabled.");
                                    continue;
                                }
                                if (k2.s("shadowHardwareFiltering0", true)) {
                                    ah.eCN[0] = true;
                                    w.info("shadowHardwareFiltering0");
                                    continue;
                                }
                                if (k2.s("shadowHardwareFiltering1", true)) {
                                    ah.eCN[1] = true;
                                    w.info("shadowHardwareFiltering1");
                                    continue;
                                }
                                if (k2.b("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    ah.eCO[0] = true;
                                    w.info("shadowtex0Mipmap");
                                    continue;
                                }
                                if (k2.s("shadowtex1Mipmap", true)) {
                                    ah.eCO[1] = true;
                                    w.info("shadowtex1Mipmap");
                                    continue;
                                }
                                if (k2.b("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    ah.eCQ[0] = true;
                                    w.info("shadowcolor0Mipmap");
                                    continue;
                                }
                                if (k2.b("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    ah.eCQ[1] = true;
                                    w.info("shadowcolor1Mipmap");
                                    continue;
                                }
                                if (k2.a("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    ah.eCP[0] = true;
                                    w.info("shadowtex0Nearest");
                                    continue;
                                }
                                if (k2.b("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    ah.eCP[1] = true;
                                    w.info("shadowtex1Nearest");
                                    continue;
                                }
                                if (k2.a("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    ah.eCR[0] = true;
                                    w.info("shadowcolor0Nearest");
                                    continue;
                                }
                                if (k2.a("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    ah.eCR[1] = true;
                                    w.info("shadowcolor1Nearest");
                                    continue;
                                }
                                if (!k2.jk("wetnessHalflife") && !k2.jh("WETNESSHL")) {
                                    if (!k2.jk("drynessHalflife") && !k2.jh("DRYNESSHL")) {
                                        int n4;
                                        if (k2.jk("eyeBrightnessHalflife")) {
                                            eyS = k2.aHS();
                                            w.info("Eye brightness halflife: " + eyS);
                                            continue;
                                        }
                                        if (k2.jk("centerDepthHalflife")) {
                                            ezb = k2.aHS();
                                            w.info("Center depth halflife: " + ezb);
                                            continue;
                                        }
                                        if (k2.jk("sunPathRotation")) {
                                            eEn = k2.aHS();
                                            w.info("Sun path rotation: " + eEn);
                                            continue;
                                        }
                                        if (k2.jk("ambientOcclusionLevel")) {
                                            eEm = net.minecraft.src.a.F(k2.aHS(), 0.0f, 1.0f);
                                            w.info("AO Level: " + eEm);
                                            continue;
                                        }
                                        if (k2.ji("superSamplingLevel")) {
                                            int n5 = k2.aHR();
                                            if (n5 > 1) {
                                                w.info("Super sampling level: " + n5 + "x");
                                                ezd = n5;
                                                continue;
                                            }
                                            ezd = 1;
                                            continue;
                                        }
                                        if (k2.ji("noiseTextureResolution")) {
                                            eEz = k2.aHR();
                                            eEy = true;
                                            w.info("Noise texture enabled");
                                            w.info("Noise texture resolution: " + eEz);
                                            continue;
                                        }
                                        if (k2.jj("Format")) {
                                            string2 = net.optifine.util.aj.ay(k2.getName(), "Format");
                                            String string4 = k2.SN();
                                            n4 = ah.iU(string2);
                                            int n6 = ah.iV(string4);
                                            if (n4 < 0 || n6 == 0) continue;
                                            ah.eBR[n4] = n6;
                                            w.info("%s format: %s", string2, string4);
                                            continue;
                                        }
                                        if (k2.r("Clear", false)) {
                                            int n7;
                                            if (!z.jI(string) && !z.jH(string) || (n7 = ah.iU(string2 = net.optifine.util.aj.ay(k2.getName(), "Clear"))) < 0) continue;
                                            ah.eBS[n7] = false;
                                            w.info("%s clear disabled", string2);
                                            continue;
                                        }
                                        if (k2.jo("ClearColor")) {
                                            int n8;
                                            if (!z.jI(string) && !z.jH(string) || (n8 = ah.iU(string2 = net.optifine.util.aj.ay(k2.getName(), "ClearColor"))) < 0) continue;
                                            Vector4f vector4f = k2.aHT();
                                            if (vector4f != null) {
                                                ah.eBT[n8] = vector4f;
                                                w.info("%s clear color: %s %s %s %s", string2, Float.valueOf(vector4f.getX()), Float.valueOf(vector4f.getY()), Float.valueOf(vector4f.getZ()), Float.valueOf(vector4f.getW()));
                                                continue;
                                            }
                                            w.iH("Invalid color value: " + k2.SN());
                                            continue;
                                        }
                                        if (k2.am("GAUX4FORMAT", "RGBA32F")) {
                                            ah.eBR[7] = 34836;
                                            w.info("gaux4 format : RGB32AF");
                                            continue;
                                        }
                                        if (k2.am("GAUX4FORMAT", "RGB32F")) {
                                            ah.eBR[7] = 34837;
                                            w.info("gaux4 format : RGB32F");
                                            continue;
                                        }
                                        if (k2.am("GAUX4FORMAT", "RGB16")) {
                                            ah.eBR[7] = 32852;
                                            w.info("gaux4 format : RGB16");
                                            continue;
                                        }
                                        if (k2.r("MipmapEnabled", true)) {
                                            int n9;
                                            if (!z.jI(string) && !z.jH(string) && !z.jJ(string) || (n9 = ah.iU(string2 = net.optifine.util.aj.ay(k2.getName(), "MipmapEnabled"))) < 0) continue;
                                            n4 = s2.aEG();
                                            s2.jP(n4 |= 1 << n9);
                                            w.info("%s mipmap enabled", string2);
                                            continue;
                                        }
                                        if (!k2.jh("DRAWBUFFERS")) continue;
                                        string2 = k2.SN();
                                        if (z.jK(string2)) {
                                            s2.iB(string2);
                                            continue;
                                        }
                                        w.iH("Invalid draw buffers: " + string2);
                                        continue;
                                    }
                                    eyR = k2.aHS();
                                    w.info("Dryness halflife: " + eyR);
                                    continue;
                                }
                                eyQ = k2.aHS();
                                w.info("Wetness halflife: " + eyQ);
                                continue;
                            }
                            eBx = k2.aHS();
                            eBy = true;
                            w.info("Shadow map distance: " + eBx);
                            continue;
                        }
                        eBw = k2.aHS();
                        eBy = false;
                        w.info("Shadow map field of view: " + eBw);
                        continue;
                    }
                    eBu = eBv = k2.aHR();
                    eBs = eBt = Math.round((float)eBu * eCW);
                    w.info("Shadow map resolution: " + eBu);
                }
            }
            catch (Exception exception) {
                w.iG("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                return 0;
            }
        }
        if (eEi) {
            ah.aj(string, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)stringBuilder);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (GL20.glGetShaderi((int)n2, (int)35713) != 1) {
            w.iG("Error compiling fragment shader: " + string);
        }
        ah.a(n2, string, arrayList);
        return n2;
    }

    private static Reader iT(String string) {
        return new InputStreamReader(eDp.iz(string));
    }

    public static void aj(String string, String string2) {
        try {
            File file = new File(eDw, "debug/" + string);
            file.getParentFile().mkdirs();
            net.minecraft.src.a.f(file, string2);
        }
        catch (IOException iOException) {
            net.minecraft.src.a.warn("Error saving: " + string);
            iOException.printStackTrace();
        }
    }

    private static void l(File file) {
        File[] fileArray;
        if (file.exists() && file.isDirectory() && (fileArray = file.listFiles()) != null) {
            for (int i2 = 0; i2 < fileArray.length; ++i2) {
                File file2 = fileArray[i2];
                if (file2.isDirectory()) {
                    ah.l(file2);
                }
                file2.delete();
            }
        }
    }

    private static boolean o(int n2, String string) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        ARBShaderObjects.glGetObjectParameterARB((int)n2, (int)35716, (IntBuffer)intBuffer);
        int n3 = intBuffer.get();
        if (n3 > 1) {
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)n3);
            intBuffer.flip();
            ARBShaderObjects.glGetInfoLogARB((int)n2, (IntBuffer)intBuffer, (ByteBuffer)byteBuffer);
            byte[] byArray = new byte[n3];
            byteBuffer.get(byArray);
            if (byArray[n3 - 1] == 0) {
                byArray[n3 - 1] = 10;
            }
            String string2 = new String(byArray, Charsets.US_ASCII);
            string2 = net.optifine.util.aj.aB(string2, " \n\r\t");
            w.info("Info log: " + string + "\n" + string2);
            return false;
        }
        return true;
    }

    private static boolean a(int n2, String string, List<String> list) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        int n3 = GL20.glGetShaderi((int)n2, (int)35716);
        if (n3 <= 1) {
            return true;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string2 = list.get(i2);
            w.info("File: " + (i2 + 1) + " = " + string2);
        }
        String string3 = GL20.glGetShaderInfoLog((int)n2, (int)n3);
        string3 = net.optifine.util.aj.aB(string3, " \n\r\t");
        w.info("Shader info log: " + string + "\n" + string3);
        return false;
    }

    public static void c(IntBuffer intBuffer) {
        if (intBuffer == null) {
            intBuffer = eFd;
        }
        if (eCI != intBuffer) {
            eCI = intBuffer;
            GL20.glDrawBuffers((IntBuffer)intBuffer);
            ah.iQ("setDrawBuffers");
        }
    }

    public static void e(s s2) {
        ah.iQ("pre-useProgram");
        if (eye) {
            s2 = eBW;
        } else if (eyf) {
            s2 = eCo;
        }
        if (eCE != s2) {
            int n2;
            ah.b(eCE, s2);
            eCE = s2;
            eCF = n2 = s2.getId();
            ARBShaderObjects.glUseProgramObjectARB((int)n2);
            if (ah.iQ("useProgram") != 0) {
                s2.k(0);
                eCF = n2 = s2.getId();
                ARBShaderObjects.glUseProgramObjectARB((int)n2);
            }
            ezw.kp(n2);
            if (eEb != null) {
                eEb.kp(n2);
            }
            if (n2 != 0) {
                IntBuffer intBuffer = s2.aEE();
                if (eyd) {
                    ah.c(intBuffer);
                }
                eCJ = s2.aEG();
                switch (s2.aEA()) {
                    case evQ: {
                        ah.a(ezA, 0);
                        ah.a(ezB, 1);
                        ah.a(ezC, 2);
                        ah.a(ezD, 3);
                        ah.a(ezE, eBD ? 5 : 4);
                        ah.a(ezF, 4);
                        ah.a(ezG, 4);
                        ah.a(ezH, 5);
                        ah.a(ezI, 6);
                        if (eDX != null || eCH) {
                            ah.a(ezS, 7);
                            ah.a(ezT, 8);
                            ah.a(ezU, 9);
                            ah.a(ezV, 10);
                        }
                        ah.a(ezJ, 11);
                        ah.a(ezK, 13);
                        ah.a(ezL, 13);
                        ah.a(ezM, 14);
                        ah.a(ezN, 15);
                        break;
                    }
                    case evR: 
                    case evS: {
                        ah.a(ezO, 0);
                        ah.a(ezP, 1);
                        ah.a(ezQ, 2);
                        ah.a(ezR, 3);
                        ah.a(ezS, 7);
                        ah.a(ezT, 8);
                        ah.a(ezU, 9);
                        ah.a(ezV, 10);
                        ah.a(ezW, 0);
                        ah.a(ezX, 1);
                        ah.a(ezY, 2);
                        ah.a(ezZ, 3);
                        ah.a(eAa, 7);
                        ah.a(eAb, 8);
                        ah.a(eAc, 9);
                        ah.a(eAd, 10);
                        ah.a(ezE, eBD ? 5 : 4);
                        ah.a(ezF, 4);
                        ah.a(ezG, 4);
                        ah.a(ezH, 5);
                        ah.a(eAe, 6);
                        ah.a(ezI, 6);
                        ah.a(ezJ, 11);
                        ah.a(eAf, 12);
                        ah.a(ezK, 13);
                        ah.a(ezL, 13);
                        ah.a(ezM, 14);
                        ah.a(ezN, 15);
                        break;
                    }
                    case evP: {
                        ah.a(eAg, 0);
                        ah.a(ezA, 0);
                        ah.a(ezB, 1);
                        ah.a(ezC, 2);
                        ah.a(ezD, 3);
                        ah.a(ezE, eBD ? 5 : 4);
                        ah.a(ezF, 4);
                        ah.a(ezG, 4);
                        ah.a(ezH, 5);
                        if (eDX != null) {
                            ah.a(ezS, 7);
                            ah.a(ezT, 8);
                            ah.a(ezU, 9);
                            ah.a(ezV, 10);
                        }
                        ah.a(ezK, 13);
                        ah.a(ezL, 13);
                        ah.a(ezM, 14);
                        ah.a(ezN, 15);
                    }
                }
                co co2 = ah.P.bgK != null ? ah.P.bgK.Vk() : null;
                net.minecraft.item.d d2 = co2 != null ? co2.bP() : null;
                int n3 = -1;
                Block block = null;
                if (d2 != null) {
                    n3 = net.minecraft.item.d.cVi.z(d2);
                    block = Block.aRV.hT(n3);
                    n3 = n.jN(n3);
                }
                int n4 = block != null ? block.wZ() : 0;
                ah.a(eAh, n3);
                ah.a(eAi, n4);
                ah.a(eAl, ezh ? eEp : 0);
                ah.a(eAm, ezh ? eEq : 0.0f);
                ah.a(eAn, eEr, eEs, eEt);
                ah.a(eAo, eyB, eyC, eyD);
                ah.a(eAp, (int)(dcf % 24000L));
                ah.a(eAq, (int)(dcf / 24000L));
                ah.a(eAr, eyJ);
                ah.a(eAs, bYY);
                ah.a(eAt, eyL);
                ah.a(eAu, eyM);
                ah.a(eAv, eyH);
                ah.a(eAw, eyI);
                ah.a(eAx, eyO);
                ah.a(eAy, (float)exY / (float)exZ);
                ah.a(eAz, (float)exY);
                ah.a(eAA, (float)exZ);
                ah.a(eAB, 0.05f);
                ah.a(eAC, (float)(ah.P.aIY.bOt * 16));
                ah.a(eAD, eyp[0], eyp[1], eyp[2]);
                ah.a(eAE, eyq[0], eyq[1], eyq[2]);
                ah.a(eAF, eyr[0], eyr[1], eyr[2]);
                ah.a(eAG, eys[0], eys[1], eys[2]);
                ah.a(eAH, (float)eBi, (float)eBj, (float)eBk);
                ah.a(eAI, (float)eBl, (float)eBm, (float)eBn);
                ah.a(eAJ, false, eEN);
                ah.a(eAK, false, eEO);
                ah.a(eAL, false, eET);
                ah.a(eAM, false, eEL);
                ah.a(eAN, false, eEM);
                ah.a(eAO, false, eEU);
                if (eBM > 0) {
                    ah.a(eAP, false, eEP);
                    ah.a(eAQ, false, eEQ);
                    ah.a(eAR, false, eER);
                    ah.a(eAS, false, eES);
                }
                ah.a(eAT, eyP);
                ah.a(eAU, eyY);
                ah.a(eAV, eyV & 0xFFFF, eyV >> 16);
                ah.a(eAW, Math.round(eyW), Math.round(eyX));
                ah.a(eAX, eEw[0], eEw[1]);
                ah.a(eAY, eEv);
                ah.a(eAZ, eyU);
                ah.a(eBa, eze);
                ah.a(eBb, ezf);
                ah.a(eBc, ah.P.aIY.chW);
                ah.a(eBd, ah.P.aIY.chO ? 1 : 0);
                ah.a(eBe, eza);
                ah.a(eBf, ezu, ezv);
                if (eEb != null) {
                    eEb.jA();
                }
                ah.iQ("end useProgram");
            }
        }
    }

    private static void b(s s2, s s3) {
        net.optifine.render.f f2;
        net.optifine.render.e e2;
        if (s2.aEI() != null) {
            GlStateManager.Kd();
        }
        if (s2.aEJ() != null) {
            GlStateManager.Ke();
        }
        if ((e2 = s3.aEI()) != null) {
            GlStateManager.a(e2);
        }
        if ((f2 = s3.aEJ()) != null) {
            GlStateManager.a(f2);
        }
    }

    private static void a(h h2, int n2) {
        h2.km(n2);
    }

    private static void a(j j2, int n2, int n3) {
        j2.bS(n2, n3);
    }

    private static void a(g g2, float f2) {
        g2.cf(f2);
    }

    private static void a(k k2, float f2, float f3, float f4) {
        k2.O(f2, f3, f4);
    }

    private static void a(o o2, boolean bl2, FloatBuffer floatBuffer) {
        o2.a(bl2, floatBuffer);
    }

    public static int iU(String string) {
        return !string.equals("colortex0") && !string.equals("gcolor") ? (!string.equals("colortex1") && !string.equals("gdepth") ? (!string.equals("colortex2") && !string.equals("gnormal") ? (!string.equals("colortex3") && !string.equals("composite") ? (!string.equals("colortex4") && !string.equals("gaux1") ? (!string.equals("colortex5") && !string.equals("gaux2") ? (!string.equals("colortex6") && !string.equals("gaux3") ? (!string.equals("colortex7") && !string.equals("gaux4") ? -1 : 7) : 6) : 5) : 4) : 3) : 2) : 1) : 0;
    }

    private static int iV(String string) {
        string = string.trim();
        for (int i2 = 0; i2 < eFh.length; ++i2) {
            String string2 = eFh[i2];
            if (!string.equals(string2)) continue;
            return eFi[i2];
        }
        return 0;
    }

    private static void aFv() {
        if (eEx == null && eEa != null) {
            eEx = ah.i(15, eEa);
        }
        if (eEx == null) {
            eEx = new net.optifine.shaders.k(eEz, eEz);
        }
    }

    private static void aFw() {
        Object object;
        eFg = new IdentityHashMap<Block, Integer>(300);
        if (eFg.isEmpty()) {
            for (Object object2 : Block.aRV.aty()) {
                object = Block.aRV.w((cm)object2);
                int n2 = Block.aRV.z((Block)object);
                eFg.put((Block)object, n2);
            }
        }
        Object object3 = null;
        try {
            object3 = new BufferedReader(new InputStreamReader(eDp.iz("/mc_Entity_x.txt")));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (object3 != null) {
            try {
                Object object2;
                while ((object2 = ((BufferedReader)object3).readLine()) != null) {
                    object = eFj.matcher((CharSequence)object2);
                    if (((Matcher)object).matches()) {
                        String string = ((Matcher)object).group(1);
                        String string2 = ((Matcher)object).group(2);
                        int n3 = Integer.parseInt(string2);
                        Block block = Block.cq(string);
                        if (block != null) {
                            eFg.put(block, n3);
                            continue;
                        }
                        w.f("Unknown block name %s", string);
                        continue;
                    }
                    w.f("unmatched %s\n", object2);
                }
            }
            catch (Exception exception) {
                w.iH("Error parsing mc_Entity_x.txt");
            }
        }
        if (object3 != null) {
            try {
                ((BufferedReader)object3).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static IntBuffer d(IntBuffer intBuffer) {
        int n2 = intBuffer.limit();
        for (int i2 = intBuffer.position(); i2 < n2; ++i2) {
            intBuffer.put(i2, 0);
        }
        return intBuffer;
    }

    public static void aFx() {
        if (exP) {
            ah.iQ("Shaders.uninit pre");
            for (int i2 = 0; i2 < eCD.length; ++i2) {
                s s2 = eCD[i2];
                if (s2.aEC() != 0) {
                    ARBShaderObjects.glDeleteObjectARB((int)s2.aEC());
                    ah.iQ("del programRef");
                }
                s2.jO(0);
                s2.k(0);
                s2.iB(null);
                s2.c((IntBuffer)null);
                s2.jP(0);
            }
            eCH = false;
            if (eBP != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)eBP);
                eBP = 0;
                ah.iQ("del dfb");
            }
            if (eBQ != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)eBQ);
                eBQ = 0;
                ah.iQ("del sfb");
            }
            if (eEY != null) {
                GlStateManager.b(eEY);
                ah.d(eEY);
                ah.iQ("del dfbDepthTextures");
            }
            if (eEX != null) {
                GlStateManager.b(eEX);
                ah.d(eEX);
                ah.iQ("del dfbTextures");
            }
            if (eFa != null) {
                GlStateManager.b(eFa);
                ah.d(eFa);
                ah.iQ("del shadow depth");
            }
            if (eEZ != null) {
                GlStateManager.b(eEZ);
                ah.d(eEZ);
                ah.iQ("del shadow color");
            }
            if (eFb != null) {
                ah.d(eFb);
            }
            if (eEx != null) {
                eEx.aEs();
                eEx = null;
            }
            w.info("Uninit");
            eBq = 0;
            eBC = false;
            exP = false;
            ah.iQ("Shaders.uninit");
        }
    }

    public static void aFy() {
        exX = 0;
    }

    public static void aFz() {
        eBr = true;
    }

    private static void aFA() {
        exW = ah.P.bgz;
        exX = ah.P.bgA;
        exY = Math.round((float)exW * eCV);
        exZ = Math.round((float)exX * eCV);
        ah.aFC();
    }

    private static void aFB() {
        eBr = false;
        eBs = Math.round((float)eBu * eCW);
        eBt = Math.round((float)eBv * eCW);
        ah.aFD();
    }

    private static void aFC() {
        int n2;
        if (eBP != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)eBP);
            GlStateManager.b(eEY);
            GlStateManager.b(eEX);
        }
        eBP = EXTFramebufferObject.glGenFramebuffersEXT();
        GL11.glGenTextures((IntBuffer)eEY.clear().limit(eBK));
        GL11.glGenTextures((IntBuffer)eEX.clear().limit(16));
        eEY.position(0);
        eEX.position(0);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)eBP);
        GL20.glDrawBuffers((int)0);
        GL11.glReadBuffer((int)0);
        for (n2 = 0; n2 < eBK; ++n2) {
            GlStateManager.ap(eEY.get(n2));
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)34891, (int)6409);
            GL11.glTexImage2D((int)3553, (int)0, (int)6402, (int)exY, (int)exZ, (int)0, (int)6402, (int)5126, (ByteBuffer)null);
        }
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)eEY.get(0), (int)0);
        GL20.glDrawBuffers((IntBuffer)eFb);
        GL11.glReadBuffer((int)0);
        ah.iQ("FT d");
        for (n2 = 0; n2 < eBJ; ++n2) {
            GlStateManager.ap(eFf.jI(n2));
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexImage2D((int)3553, (int)0, (int)eBR[n2], (int)exY, (int)exZ, (int)0, (int)ah.jW(eBR[n2]), (int)33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n2), (int)3553, (int)eFf.jI(n2), (int)0);
            ah.iQ("FT c");
        }
        for (n2 = 0; n2 < eBJ; ++n2) {
            GlStateManager.ap(eFf.jJ(n2));
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexImage2D((int)3553, (int)0, (int)eBR[n2], (int)exY, (int)exZ, (int)0, (int)ah.jW(eBR[n2]), (int)33639, (ByteBuffer)null);
            ah.iQ("FT ca");
        }
        n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
        if (n2 == 36058) {
            ah.iS("[Shaders] Error: Failed framebuffer incomplete formats");
            for (int i2 = 0; i2 < eBJ; ++i2) {
                GlStateManager.ap(eFf.jI(i2));
                GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)exY, (int)exZ, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jI(i2), (int)0);
                ah.iQ("FT c");
            }
            n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
            if (n2 == 36053) {
                w.info("complete");
            }
        }
        GlStateManager.ap(0);
        if (n2 != 36053) {
            ah.iS("[Shaders] Error: Failed creating framebuffer! (Status " + n2 + ")");
        } else {
            w.info("Framebuffer created.");
        }
    }

    private static int jW(int n2) {
        switch (n2) {
            case 33333: 
            case 33334: 
            case 33339: 
            case 33340: 
            case 36208: 
            case 36209: 
            case 36226: 
            case 36227: {
                return 36251;
            }
        }
        return 32993;
    }

    private static void aFD() {
        if (eBM != 0) {
            int n2;
            int n3;
            if (eBQ != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)eBQ);
                GlStateManager.b(eFa);
                GlStateManager.b(eEZ);
            }
            eBQ = EXTFramebufferObject.glGenFramebuffersEXT();
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)eBQ);
            GL11.glDrawBuffer((int)0);
            GL11.glReadBuffer((int)0);
            GL11.glGenTextures((IntBuffer)eFa.clear().limit(eBM));
            GL11.glGenTextures((IntBuffer)eEZ.clear().limit(eBL));
            eFa.position(0);
            eEZ.position(0);
            for (n3 = 0; n3 < eBM; ++n3) {
                GlStateManager.ap(eFa.get(n3));
                GL11.glTexParameterf((int)3553, (int)10242, (float)33071.0f);
                GL11.glTexParameterf((int)3553, (int)10243, (float)33071.0f);
                n2 = eCP[n3] ? 9728 : 9729;
                GL11.glTexParameteri((int)3553, (int)10241, (int)n2);
                GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
                if (eCN[n3]) {
                    GL11.glTexParameteri((int)3553, (int)34892, (int)34894);
                }
                GL11.glTexImage2D((int)3553, (int)0, (int)6402, (int)eBs, (int)eBt, (int)0, (int)6402, (int)5126, (ByteBuffer)null);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)eFa.get(0), (int)0);
            ah.iQ("FT sd");
            for (n3 = 0; n3 < eBL; ++n3) {
                GlStateManager.ap(eEZ.get(n3));
                GL11.glTexParameterf((int)3553, (int)10242, (float)33071.0f);
                GL11.glTexParameterf((int)3553, (int)10243, (float)33071.0f);
                n2 = eCR[n3] ? 9728 : 9729;
                GL11.glTexParameteri((int)3553, (int)10241, (int)n2);
                GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
                GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)eBs, (int)eBt, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n3), (int)3553, (int)eEZ.get(n3), (int)0);
                ah.iQ("FT sc");
            }
            GlStateManager.ap(0);
            if (eBL > 0) {
                GL20.glDrawBuffers((IntBuffer)eFc);
            }
            if ((n3 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160)) != 36053) {
                ah.iS("[Shaders] Error: Failed creating shadow framebuffer! (Status " + n3 + ")");
            } else {
                w.info("Shadow framebuffer created.");
            }
        }
    }

    public static void a(net.minecraft.client.d d2, float f2, long l2) {
        block13: {
            ah.iQ("pre beginRender");
            ah.u(ah.P.bgF);
            P = d2;
            ah.P.bhw.eY("init");
            bgT = ah.P.bgT;
            if (!exP) {
                try {
                    ah.init();
                }
                catch (IllegalStateException illegalStateException) {
                    if (!net.minecraft.src.a.fS(illegalStateException.getMessage()).equals("Function is not supported")) break block13;
                    ah.iS("[Shaders] Error: " + illegalStateException.getMessage());
                    illegalStateException.printStackTrace();
                    ah.iK(eDs);
                    return;
                }
            }
        }
        if (ah.P.bgz != exW || ah.P.bgA != exX) {
            ah.aFA();
        }
        if (eBr) {
            ah.aFB();
        }
        if ((eyF = ((dcf = ah.P.bgF.getWorldTime()) - eyE) % 24000L) < 0L) {
            eyF += 24000L;
        }
        eyE = dcf;
        eyJ = ah.P.bgF.avs();
        if (++bYY >= 720720) {
            bYY = 0;
        }
        bgf = System.currentTimeMillis();
        if (bnS == 0L) {
            bnS = bgf;
        }
        eyK = bgf - bnS;
        bnS = bgf;
        eyL = (float)eyK / 1000.0f;
        eyM += eyL;
        eyM %= 3600.0f;
        eyO = d2.bgF.ca(f2);
        float f3 = (float)eyK * 0.01f;
        float f4 = (float)Math.exp(Math.log(0.5) * (double)f3 / (double)(eyP < eyO ? eyR : eyQ));
        eyP = eyP * f4 + eyO * (1.0f - f4);
        net.minecraft.entity.c c2 = P.BC();
        if (c2 != null) {
            eyg = c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).Wg();
            eyY = (float)c2.gX * f2 + (float)c2.csi * (1.0f - f2);
            eyV = c2.af(f2);
            f4 = (float)eyK * 0.01f;
            float f5 = (float)Math.exp(Math.log(0.5) * (double)f4 / (double)eyS);
            eyW = eyW * f5 + (float)(eyV & 0xFFFF) * (1.0f - f5);
            eyX = eyX * f5 + (float)(eyV >> 16) * (1.0f - f5);
            Block block = ActiveRenderInfo.a(ah.P.bgF, c2, f2);
            Material material = block.xb();
            eyU = material == Material.bev ? 1 : (material == Material.bew ? 2 : 0);
            if (ah.P.bgK != null) {
                eze = 0.0f;
                if (ah.P.bgK.a(net.minecraft.potion.a.dgL)) {
                    eze = net.minecraft.src.a.AZ().bgT.b(ah.P.bgK, f2);
                }
                ezf = 0.0f;
                if (ah.P.bgK.a(net.minecraft.potion.a.dgK)) {
                    int n2 = ah.P.bgK.b(net.minecraft.potion.a.dgK).getDuration();
                    ezf = net.minecraft.src.a.F((float)n2 / 20.0f, 0.0f, 1.0f);
                }
            }
            da da2 = ah.P.bgF.i(c2, f2);
            da2 = net.optifine.s.b(da2, dFb, c2, f2);
            eyB = (float)da2.dAG;
            eyC = (float)da2.dAH;
            eyD = (float)da2.dAI;
        }
        eya = true;
        eyc = false;
        eye = false;
        eyi = false;
        eyj = false;
        eyk = false;
        eyl = false;
        ah.aFE();
        eBi = eBl;
        eBj = eBm;
        eBk = eBn;
        eET.position(0);
        eEL.position(0);
        eET.put(eEL);
        eET.position(0);
        eEL.position(0);
        eEU.position(0);
        eEN.position(0);
        eEU.put(eEN);
        eEU.position(0);
        eEN.position(0);
        ah.iQ("beginRender");
        aj.a(bgT, 0, f2, l2);
        ah.P.bhw.ajv();
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)eBP);
        for (int i2 = 0; i2 < eBJ; ++i2) {
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jI(i2), (int)0);
        }
        ah.iQ("end beginRender");
    }

    private static void aFE() {
        int n2;
        if (eBM >= 1) {
            GlStateManager.cN(33988);
            GlStateManager.ap(eFa.get(0));
            if (eBM >= 2) {
                GlStateManager.cN(33989);
                GlStateManager.ap(eFa.get(1));
            }
        }
        GlStateManager.cN(33984);
        for (n2 = 0; n2 < eBJ; ++n2) {
            GlStateManager.ap(eFf.jI(n2));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GlStateManager.ap(eFf.jJ(n2));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        }
        GlStateManager.ap(0);
        for (n2 = 0; n2 < 4 && 4 + n2 < eBJ; ++n2) {
            GlStateManager.cN(33991 + n2);
            GlStateManager.ap(eFf.jI(4 + n2));
        }
        GlStateManager.cN(33990);
        GlStateManager.ap(eEY.get(0));
        if (eBK >= 2) {
            GlStateManager.cN(33995);
            GlStateManager.ap(eEY.get(1));
            if (eBK >= 3) {
                GlStateManager.cN(33996);
                GlStateManager.ap(eEY.get(2));
            }
        }
        for (n2 = 0; n2 < eBL; ++n2) {
            GlStateManager.cN(33997 + n2);
            GlStateManager.ap(eEZ.get(n2));
        }
        if (eEy) {
            GlStateManager.cN(33984 + eEx.aEp());
            GlStateManager.ap(eEx.aEr());
        }
        ah.a(eDX);
        GlStateManager.cN(33984);
    }

    public static void u(net.minecraft.world.w w2) {
        if (dFb != w2) {
            net.minecraft.world.w w3 = dFb;
            dFb = w2;
            ah.aJ(P.BC());
            int n2 = ah.v(w3);
            int n3 = ah.v(w2);
            if (n3 != n2) {
                boolean bl2 = eDW.contains(n2);
                boolean bl3 = eDW.contains(n3);
                if (bl2 || bl3) {
                    ah.aFx();
                }
            }
            q.aIS();
        }
    }

    private static int v(net.minecraft.world.w w2) {
        return w2 == null ? Integer.MIN_VALUE : w2.dDl.getDimensionId();
    }

    public static void b(int n2, float f2, long l2) {
        if (!eye) {
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)eBP);
            GL11.glViewport((int)0, (int)0, (int)exY, (int)exZ);
            eCI = null;
            ak.a(eCM.NK());
            ah.e(eCa);
            ah.iQ("end beginRenderPass");
        }
    }

    public static void K(int n2, int n3, int n4, int n5) {
        GlStateManager.a(true, true, true, true);
        if (eye) {
            GL11.glViewport((int)0, (int)0, (int)eBs, (int)eBt);
        } else {
            GL11.glViewport((int)0, (int)0, (int)exY, (int)exZ);
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)eBP);
            eyd = true;
            GlStateManager.JH();
            GlStateManager.JE();
            ah.c(eFd);
            ah.e(eCa);
            ah.iQ("beginRenderPass");
        }
    }

    public static void jX(int n2) {
        eEp = n2;
        if (ezh) {
            ah.a(eAl, n2);
        }
    }

    public static void N(float f2, float f3, float f4) {
        eEr = f2;
        eEs = f3;
        eEt = f4;
        ah.a(eAn, eEr, eEs, eEt);
    }

    public static void n(float f2, float f3, float f4, float f5) {
        GlStateManager.c(f2, f3, f4, f5);
        eyy = f2;
        eyz = f3;
        eyA = f4;
    }

    public static void aFF() {
        if (eye) {
            ah.iQ("shadow clear pre");
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)eFa.get(0), (int)0);
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL20.glDrawBuffers((IntBuffer)eBW.aEE());
            ah.iP("shadow clear");
            GL11.glClear((int)16640);
            ah.iQ("shadow clear");
        } else {
            Vector4f vector4f;
            ah.iQ("clear pre");
            if (eBS[0]) {
                vector4f = eBT[0];
                if (vector4f != null) {
                    GL11.glClearColor((float)vector4f.getX(), (float)vector4f.getY(), (float)vector4f.getZ(), (float)vector4f.getW());
                }
                if (eFf.jL(0)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)eFf.jJ(0), (int)0);
                    GL20.glDrawBuffers((int)36064);
                    GL11.glClear((int)16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)eFf.jI(0), (int)0);
                }
                GL20.glDrawBuffers((int)36064);
                GL11.glClear((int)16384);
            }
            if (eBS[1]) {
                GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                vector4f = eBT[1];
                if (vector4f != null) {
                    GL11.glClearColor((float)vector4f.getX(), (float)vector4f.getY(), (float)vector4f.getZ(), (float)vector4f.getW());
                }
                if (eFf.jL(1)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36065, (int)3553, (int)eFf.jJ(1), (int)0);
                    GL20.glDrawBuffers((int)36065);
                    GL11.glClear((int)16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36065, (int)3553, (int)eFf.jI(1), (int)0);
                }
                GL20.glDrawBuffers((int)36065);
                GL11.glClear((int)16384);
            }
            for (int i2 = 2; i2 < eBJ; ++i2) {
                if (!eBS[i2]) continue;
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                Vector4f vector4f2 = eBT[i2];
                if (vector4f2 != null) {
                    GL11.glClearColor((float)vector4f2.getX(), (float)vector4f2.getY(), (float)vector4f2.getZ(), (float)vector4f2.getW());
                }
                if (eFf.jL(i2)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jJ(i2), (int)0);
                    GL20.glDrawBuffers((int)(36064 + i2));
                    GL11.glClear((int)16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jI(i2), (int)0);
                }
                GL20.glDrawBuffers((int)(36064 + i2));
                GL11.glClear((int)16384);
            }
            ah.c(eFb);
            ah.iP("clear");
            ah.iQ("clear");
        }
    }

    public static void ci(float f2) {
        net.minecraft.entity.c c2 = P.BC();
        double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
        double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
        double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
        ah.aI(c2);
        eBl = d2 - (double)eBo;
        eBm = d3;
        eBn = d4 - (double)eBp;
        GL11.glGetFloat((int)2983, (FloatBuffer)eEL.position(0));
        x.a(eEM.position(0), eEL.position(0), eEE, eED);
        eEL.position(0);
        eEM.position(0);
        GL11.glGetFloat((int)2982, (FloatBuffer)eEN.position(0));
        x.a(eEO.position(0), eEN.position(0), eEG, eEF);
        eEN.position(0);
        eEO.position(0);
        ah.iQ("setCamera");
    }

    private static void aI(net.minecraft.entity.c c2) {
        double d2 = Math.abs(eBl - eBi);
        double d3 = Math.abs(eBn - eBk);
        double d4 = Math.abs(eBl);
        double d5 = Math.abs(eBn);
        if (d2 > 1000.0 || d3 > 1000.0 || d4 > 1000000.0 || d5 > 1000000.0) {
            ah.aJ(c2);
        }
    }

    private static void aJ(net.minecraft.entity.c c2) {
        if (c2 == null) {
            eBo = 0;
            eBp = 0;
        } else {
            eBo = (int)c2.gW / 1000 * 1000;
            eBp = (int)c2.gY / 1000 * 1000;
        }
    }

    public static void cj(float f2) {
        float f3;
        float f4;
        float f5;
        net.minecraft.entity.c c2 = P.BC();
        double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
        double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
        double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
        ah.aI(c2);
        eBl = d2 - (double)eBo;
        eBm = d3;
        eBn = d4 - (double)eBp;
        GL11.glGetFloat((int)2983, (FloatBuffer)eEL.position(0));
        x.a(eEM.position(0), eEL.position(0), eEE, eED);
        eEL.position(0);
        eEM.position(0);
        GL11.glGetFloat((int)2982, (FloatBuffer)eEN.position(0));
        x.a(eEO.position(0), eEN.position(0), eEG, eEF);
        eEN.position(0);
        eEO.position(0);
        GL11.glViewport((int)0, (int)0, (int)eBs, (int)eBt);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        if (eBy) {
            GL11.glOrtho((double)(-eBx), (double)eBx, (double)(-eBx), (double)eBx, (double)0.05f, (double)256.0);
        } else {
            GLU.gluPerspective((float)eBw, (float)((float)eBs / (float)eBt), (float)0.05f, (float)256.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-100.0f);
        GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        eyG = ah.P.bgF.bT(f2);
        eyH = eyG < 0.75f ? eyG + 0.25f : eyG - 0.75f;
        float f6 = eyG * -360.0f;
        float f7 = f5 = eEo > 0.0f ? f6 % eEo - eEo * 0.5f : 0.0f;
        if ((double)eyH <= 0.5) {
            GL11.glRotatef((float)(f6 - f5), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)eEn, (float)1.0f, (float)0.0f, (float)0.0f);
            eyI = eyH;
        } else {
            GL11.glRotatef((float)(f6 + 180.0f - f5), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)eEn, (float)1.0f, (float)0.0f, (float)0.0f);
            eyI = eyH - 0.5f;
        }
        if (eBy) {
            f4 = eEu;
            f3 = f4 / 2.0f;
            GL11.glTranslatef((float)((float)d2 % f4 - f3), (float)((float)d3 % f4 - f3), (float)((float)d4 % f4 - f3));
        }
        f4 = eyH * ((float)Math.PI * 2);
        f3 = (float)Math.cos(f4);
        float f8 = (float)Math.sin(f4);
        float f9 = eEn * ((float)Math.PI * 2);
        float f10 = f3;
        float f11 = f8 * (float)Math.cos(f9);
        float f12 = f8 * (float)Math.sin(f9);
        if ((double)eyH > 0.5) {
            f10 = -f3;
            f11 = -f11;
            f12 = -f12;
        }
        ah.eyt[0] = f10;
        ah.eyt[1] = f11;
        ah.eyt[2] = f12;
        ah.eyt[3] = 0.0f;
        GL11.glGetFloat((int)2983, (FloatBuffer)eEP.position(0));
        x.a(eEQ.position(0), eEP.position(0), eEI, eEH);
        eEP.position(0);
        eEQ.position(0);
        GL11.glGetFloat((int)2982, (FloatBuffer)eER.position(0));
        x.a(eES.position(0), eER.position(0), eEK, eEJ);
        eER.position(0);
        eES.position(0);
        ah.a(eAM, false, eEL);
        ah.a(eAN, false, eEM);
        ah.a(eAL, false, eET);
        ah.a(eAJ, false, eEN);
        ah.a(eAK, false, eEO);
        ah.a(eAO, false, eEU);
        ah.a(eAP, false, eEP);
        ah.a(eAQ, false, eEQ);
        ah.a(eAR, false, eER);
        ah.a(eAS, false, eES);
        ah.P.aIY.chP = 1;
        ah.iQ("setCamera");
    }

    public static void aFG() {
        GL11.glRotatef((float)(eEn * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        ah.iQ("preCelestialRotate");
    }

    public static void aFH() {
        FloatBuffer floatBuffer = eEV;
        floatBuffer.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        floatBuffer.get(eyx, 0, 16);
        x.c(eyp, eyx, eyv);
        x.c(eyq, eyx, eyw);
        System.arraycopy(eyI == eyH ? eyp : eyq, 0, eyr, 0, 3);
        ah.a(eAD, eyp[0], eyp[1], eyp[2]);
        ah.a(eAE, eyq[0], eyq[1], eyq[2]);
        ah.a(eAF, eyr[0], eyr[1], eyr[2]);
        if (eEb != null) {
            eEb.jA();
        }
        ah.iQ("postCelestialRotate");
    }

    public static void aFI() {
        FloatBuffer floatBuffer = eEV;
        floatBuffer.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        floatBuffer.get(eyx, 0, 16);
        x.c(eys, eyx, eyu);
        ah.a(eAG, eys[0], eys[1], eys[2]);
        if (eEb != null) {
            eEb.jA();
        }
    }

    public static void aFJ() {
        if (exU) {
            for (int i2 = 0; i2 < eBJ; ++i2) {
                if ((eCJ & 1 << i2) == 0) continue;
                GlStateManager.cN(33984 + eEA[i2]);
                GL11.glTexParameteri((int)3553, (int)10241, (int)9987);
                GL30.glGenerateMipmap((int)3553);
            }
            GlStateManager.cN(33984);
        }
    }

    public static void aFK() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ah.aFL();
        int n2 = eCE.aEH();
        if (n2 > 1) {
            for (int i2 = 1; i2 < n2; ++i2) {
                eBh.km(i2);
                ah.aFL();
            }
            eBh.km(0);
        }
    }

    private static void aFL() {
        if (!ah.aGT()) {
            GL11.glBegin((int)5);
            GL11.glTexCoord2f((float)0.0f, (float)0.0f);
            GL11.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glTexCoord2f((float)1.0f, (float)0.0f);
            GL11.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTexCoord2f((float)0.0f, (float)1.0f);
            GL11.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTexCoord2f((float)1.0f, (float)1.0f);
            GL11.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glEnd();
        } else {
            GL11.glBegin((int)7);
            GL11.glTexCoord2f((float)0.0f, (float)0.0f);
            GL11.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glTexCoord2f((float)1.0f, (float)0.0f);
            GL11.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTexCoord2f((float)1.0f, (float)1.0f);
            GL11.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
            GL11.glTexCoord2f((float)0.0f, (float)1.0f);
            GL11.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnd();
        }
    }

    public static void aFM() {
        if (!eye) {
            boolean bl2 = ah.f(eCt);
            if (eCH) {
                ah.iQ("pre-render Deferred");
                ah.a(eCu, false);
                bl2 = true;
            }
            if (bl2) {
                ah.aFE();
                for (int i2 = 0; i2 < eBJ; ++i2) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jI(i2), (int)0);
                }
                if (eCw.aEE() != null) {
                    ah.c(eCw.aEE());
                } else {
                    ah.c(eFb);
                }
                GlStateManager.cN(33984);
                P.Bq().a(TextureMap.bZE);
            }
        }
    }

    public static void aFN() {
        if (!eye) {
            ah.f(eCy);
            ah.iQ("pre-render CompositeFinal");
            ah.a(eCz, true);
        }
    }

    private static boolean f(s s2) {
        boolean bl2 = false;
        Boolean[] booleanArray = s2.aEL();
        for (int i2 = 0; i2 < eBJ; ++i2) {
            if (!net.minecraft.src.a.e(booleanArray[i2])) continue;
            eFf.jK(i2);
            bl2 = true;
        }
        return bl2;
    }

    private static void a(s[] sArray, boolean bl2) {
        if (!eye) {
            int n2;
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)1.0, (double)0.0, (double)1.0, (double)0.0, (double)1.0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.JN();
            GlStateManager.Jy();
            GlStateManager.tR();
            GlStateManager.JE();
            GlStateManager.cJ(519);
            GlStateManager.an(false);
            GlStateManager.JA();
            if (eBM >= 1) {
                GlStateManager.cN(33988);
                GlStateManager.ap(eFa.get(0));
                if (eBM >= 2) {
                    GlStateManager.cN(33989);
                    GlStateManager.ap(eFa.get(1));
                }
            }
            for (n2 = 0; n2 < eBJ; ++n2) {
                GlStateManager.cN(33984 + eEA[n2]);
                GlStateManager.ap(eFf.jI(n2));
            }
            GlStateManager.cN(33990);
            GlStateManager.ap(eEY.get(0));
            if (eBK >= 2) {
                GlStateManager.cN(33995);
                GlStateManager.ap(eEY.get(1));
                if (eBK >= 3) {
                    GlStateManager.cN(33996);
                    GlStateManager.ap(eEY.get(2));
                }
            }
            for (n2 = 0; n2 < eBL; ++n2) {
                GlStateManager.cN(33997 + n2);
                GlStateManager.ap(eEZ.get(n2));
            }
            if (eEy) {
                GlStateManager.cN(33984 + eEx.aEp());
                GlStateManager.ap(eEx.aEr());
            }
            if (bl2) {
                ah.a(eDY);
            } else {
                ah.a(eDZ);
            }
            GlStateManager.cN(33984);
            for (n2 = 0; n2 < eBJ; ++n2) {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n2), (int)3553, (int)eFf.jJ(n2), (int)0);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)eEY.get(0), (int)0);
            GL20.glDrawBuffers((IntBuffer)eFb);
            ah.iQ("pre-composite");
            for (n2 = 0; n2 < sArray.length; ++n2) {
                s s2 = sArray[n2];
                if (s2.getId() == 0) continue;
                ah.e(s2);
                ah.iQ(s2.getName());
                if (eCJ != 0) {
                    ah.aFJ();
                }
                ah.aFO();
                ah.aFK();
                ah.aFP();
                for (int i2 = 0; i2 < eBJ; ++i2) {
                    if (!s2.aEM()[i2]) continue;
                    eFf.jK(i2);
                    GlStateManager.cN(33984 + eEA[i2]);
                    GlStateManager.ap(eFf.jI(i2));
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)eFf.jJ(i2), (int)0);
                }
                GlStateManager.cN(33984);
            }
            ah.iQ("composite");
            if (bl2) {
                ah.aFQ();
                eyc = true;
            }
            GlStateManager.Jz();
            GlStateManager.JN();
            GlStateManager.tL();
            GlStateManager.tQ();
            GlStateManager.cJ(515);
            GlStateManager.an(true);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            ah.e(eBV);
        }
    }

    private static void aFO() {
        net.optifine.shaders.config.i i2 = eCE.aEK();
        if (i2 != null) {
            int n2 = (int)((float)exY * i2.aHF());
            int n3 = (int)((float)exZ * i2.aHG());
            int n4 = (int)((float)exY * i2.aHE());
            int n5 = (int)((float)exZ * i2.aHE());
            GL11.glViewport((int)n2, (int)n3, (int)n4, (int)n5);
        }
    }

    private static void aFP() {
        net.optifine.shaders.config.i i2 = eCE.aEK();
        if (i2 != null) {
            GL11.glViewport((int)0, (int)0, (int)exY, (int)exZ);
        }
    }

    private static void aFQ() {
        eyd = false;
        P.Aw().az(true);
        OpenGlHelper.a(OpenGlHelper.bMq, OpenGlHelper.bMs, 3553, ah.P.Aw().cmg, 0);
        GL11.glViewport((int)0, (int)0, (int)ah.P.bgz, (int)ah.P.bgA);
        if (EntityRenderer.bIR) {
            boolean bl2 = EntityRenderer.bIS != 0;
            GlStateManager.a(bl2, !bl2, !bl2, true);
        }
        GlStateManager.an(true);
        GL11.glClearColor((float)eyy, (float)eyz, (float)eyA, (float)1.0f);
        GL11.glClear((int)16640);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.JN();
        GlStateManager.Jy();
        GlStateManager.tR();
        GlStateManager.JE();
        GlStateManager.cJ(519);
        GlStateManager.an(false);
        ah.iQ("pre-final");
        ah.e(eCB);
        ah.iQ("final");
        if (eCJ != 0) {
            ah.aFJ();
        }
        ah.aFK();
        ah.iQ("renderCompositeFinal");
    }

    public static void aBq() {
        if (eye) {
            ah.iQ("shadow endRender");
        } else {
            if (!eyc) {
                ah.aFN();
            }
            eya = false;
            GlStateManager.a(true, true, true, true);
            ah.e(eBV);
            RenderHelper.Lf();
            ah.iQ("endRender end");
        }
    }

    public static void aFR() {
        eyb = true;
        ezh = true;
        ah.c(eFb);
        ah.e(eCd);
        ah.bN(-2, 0);
    }

    public static void C(da da2) {
        eyB = (float)da2.dAG;
        eyC = (float)da2.dAH;
        eyD = (float)da2.dAI;
        ah.a(eAo, eyB, eyC, eyD);
    }

    public static void aFS() {
        WorldRenderer worldRenderer = Tessellator.Li().Lj();
        float f2 = ah.P.aIY.bOt * 16;
        double d2 = (double)f2 * 0.9238;
        double d3 = (double)f2 * 0.3826;
        double d4 = -d3;
        double d5 = -d2;
        double d6 = 16.0;
        double d7 = -eBm;
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        worldRenderer.F(d4, d7, d5).Lx();
        worldRenderer.F(d4, 16.0, d5).Lx();
        worldRenderer.F(d5, 16.0, d4).Lx();
        worldRenderer.F(d5, d7, d4).Lx();
        worldRenderer.F(d5, d7, d4).Lx();
        worldRenderer.F(d5, 16.0, d4).Lx();
        worldRenderer.F(d5, 16.0, d3).Lx();
        worldRenderer.F(d5, d7, d3).Lx();
        worldRenderer.F(d5, d7, d3).Lx();
        worldRenderer.F(d5, 16.0, d3).Lx();
        worldRenderer.F(d4, 16.0, d2).Lx();
        worldRenderer.F(d4, d7, d2).Lx();
        worldRenderer.F(d4, d7, d2).Lx();
        worldRenderer.F(d4, 16.0, d2).Lx();
        worldRenderer.F(d3, 16.0, d2).Lx();
        worldRenderer.F(d3, d7, d2).Lx();
        worldRenderer.F(d3, d7, d2).Lx();
        worldRenderer.F(d3, 16.0, d2).Lx();
        worldRenderer.F(d2, 16.0, d3).Lx();
        worldRenderer.F(d2, d7, d3).Lx();
        worldRenderer.F(d2, d7, d3).Lx();
        worldRenderer.F(d2, 16.0, d3).Lx();
        worldRenderer.F(d2, 16.0, d4).Lx();
        worldRenderer.F(d2, d7, d4).Lx();
        worldRenderer.F(d2, d7, d4).Lx();
        worldRenderer.F(d2, 16.0, d4).Lx();
        worldRenderer.F(d3, 16.0, d5).Lx();
        worldRenderer.F(d3, d7, d5).Lx();
        worldRenderer.F(d3, d7, d5).Lx();
        worldRenderer.F(d3, 16.0, d5).Lx();
        worldRenderer.F(d4, 16.0, d5).Lx();
        worldRenderer.F(d4, d7, d5).Lx();
        Tessellator.Li().pZ();
    }

    public static void aFT() {
        ah.aFI();
        GL11.glColor3f((float)eEr, (float)eEs, (float)eEt);
        ah.aFS();
        GL11.glColor3f((float)eyB, (float)eyC, (float)eyD);
    }

    public static void aFU() {
        eyb = false;
        ah.c(eFb);
        ah.e(ezg ? eCb : eCa);
        ah.aET();
    }

    public static void aFV() {
        ah.iQ("beginUpdateChunks1");
        ah.iP("beginUpdateChunks1");
        if (!eye) {
            ah.e(eCf);
        }
        ah.iQ("beginUpdateChunks2");
        ah.iP("beginUpdateChunks2");
    }

    public static void aFW() {
        ah.iQ("endUpdateChunks1");
        ah.iP("endUpdateChunks1");
        if (!eye) {
            ah.e(eCf);
        }
        ah.iQ("endUpdateChunks2");
        ah.iP("endUpdateChunks2");
    }

    public static boolean b(net.minecraft.client.settings.a a2) {
        if (!eDq) {
            return true;
        }
        ah.iQ("shouldRenderClouds");
        return eye ? eCT : a2.cgw > 0;
    }

    public static void aFX() {
        ezh = true;
        ah.bN(-3, 0);
        ah.e(eCe);
    }

    public static void aFY() {
        ah.JG();
        ah.aET();
        ah.e(ezg ? eCb : eCa);
    }

    public static void aFZ() {
        if (eya) {
            ah.e(eCn);
        }
    }

    public static void aK(net.minecraft.entity.c c2) {
        if (eya) {
            ah.e(eCn);
            ah.aL(c2);
        }
    }

    public static void aL(net.minecraft.entity.c c2) {
        if (ezy.aIP()) {
            int n2 = net.optifine.util.k.aM(c2);
            int n3 = i.jH(n2);
            if (n3 >= 0) {
                n2 = n3;
            }
            ezy.km(n2);
        }
    }

    public static void aGa() {
        if (eya && eCq.getId() != eBV.getId()) {
            ah.e(eCq);
            GlStateManager.tL();
            GlStateManager.e(516, 0.0f);
            GlStateManager.P(770, 771);
        }
    }

    public static void aGb() {
        if (eya && eCq.getId() != eBV.getId()) {
            ah.e(eCn);
            GlStateManager.Jy();
        }
    }

    public static void aGc() {
        if (eya) {
            ah.aL(null);
            ah.e(ezg ? eCb : eCa);
        }
    }

    public static void aGd() {
        if (eya) {
            eyf = true;
        }
    }

    public static void aGe() {
        if (eya) {
            eyf = false;
        }
    }

    public static void o(float f2, float f3, float f4, float f5) {
        if (eya && !eye) {
            ezx.p(f2, f3, f4, f5);
        }
    }

    public static void aGf() {
        if (eya) {
            ak.b(eCM);
            if (!eye) {
                ah.c(eFe);
            }
        }
    }

    public static void aGg() {
        if (eya && !eye) {
            ah.c(eCn.aEE());
        }
    }

    public static void aGh() {
        if (eya) {
            ah.iQ("beginBlockEntities");
            ah.e(eCk);
        }
    }

    public static void i(net.minecraft.tileentity.d d2) {
        if (eya) {
            ah.iQ("nextBlockEntity");
            ah.e(eCk);
            ah.j(d2);
        }
    }

    public static void j(net.minecraft.tileentity.d d2) {
        if (ezz.aIP()) {
            int n2 = ah.k(d2);
            ezz.km(n2);
        }
    }

    private static int k(net.minecraft.tileentity.d d2) {
        int n2;
        if (d2 == null) {
            return -1;
        }
        Block block = d2.ahl();
        if (block == null) {
            return 0;
        }
        int n3 = Block.i(block);
        int n4 = net.optifine.shaders.b.bJ(n3, n2 = d2.zg());
        if (n4 >= 0) {
            n3 = n4;
        }
        return n3;
    }

    public static void aGi() {
        if (eya) {
            ah.iQ("endBlockEntities");
            ah.j(null);
            ah.e(ezg ? eCb : eCa);
            ak.a(eCM.NK());
        }
    }

    public static void aGj() {
        ah.e(eCb);
    }

    public static void aGk() {
        ah.e(eCa);
    }

    public static void aGl() {
        ah.e(eCb);
    }

    public static void aGm() {
        if (!eye && ezc) {
            eEW.clear();
            GL11.glReadPixels((int)(exY / 2), (int)(exZ / 2), (int)1, (int)1, (int)6402, (int)5126, (FloatBuffer)eEW);
            eyZ = eEW.get(0);
            float f2 = (float)eyK * 0.01f;
            float f3 = (float)Math.exp(Math.log(0.5) * (double)f2 / (double)ezb);
            eza = eza * f3 + eyZ * (1.0f - f3);
        }
    }

    public static void aGn() {
        if (!eye) {
            if (eBK >= 3) {
                GlStateManager.cN(33996);
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)exY, (int)exZ);
                GlStateManager.cN(33984);
            }
            GlStateManager.JE();
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.tL();
            ah.e(eCs);
        }
    }

    public static void aGo() {
        GlStateManager.tR();
        ah.e(eCb);
    }

    public static void aGp() {
        if (eBK >= 2) {
            GlStateManager.cN(33995);
            ah.iQ("pre copy depth");
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)exY, (int)exZ);
            ah.iQ("copy depth");
            GlStateManager.cN(33984);
        }
        ak.a(eCM.NK());
    }

    public static void aGq() {
        if (eya) {
            if (!eye) {
                ah.aFM();
                ah.e(eCw);
                GlStateManager.tQ();
                GlStateManager.an(true);
            } else {
                GlStateManager.an(true);
            }
        }
    }

    public static void aGr() {
        if (eya) {
            if (eye) {
                // empty if block
            }
            ah.e(ezg ? eCb : eCa);
        }
    }

    public static void aGs() {
        if ((double)eCU != 1.0) {
            GL11.glScaled((double)1.0, (double)1.0, (double)eCU);
        }
    }

    public static void cQ(boolean bl2) {
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5888);
        if (bl2) {
            ah.e(eCx);
        } else {
            ah.e(eCr);
        }
        ah.iQ("beginHand");
        ah.iP("beginHand");
    }

    public static void aGt() {
        ah.iQ("pre endHand");
        ah.iP("pre endHand");
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GlStateManager.P(770, 771);
        ah.iQ("endHand");
    }

    public static void aGu() {
        GlStateManager.JA();
        GlStateManager.tR();
    }

    public static void aGv() {
    }

    public static void jY(int n2) {
        GL11.glEnable((int)n2);
        if (n2 == 3553) {
            ah.JN();
        } else if (n2 == 2912) {
            ah.JF();
        }
    }

    public static void jZ(int n2) {
        GL11.glDisable((int)n2);
        if (n2 == 3553) {
            ah.JO();
        } else if (n2 == 2912) {
            ah.JG();
        }
    }

    public static void ka(int n2) {
        GL11.glEnable((int)n2);
        ah.JN();
    }

    public static void kb(int n2) {
        GL11.glDisable((int)n2);
        ah.JO();
    }

    public static void kc(int n2) {
        GL11.glEnable((int)n2);
        ah.JF();
    }

    public static void kd(int n2) {
        GL11.glDisable((int)n2);
        ah.JG();
    }

    public static void JN() {
        if (eyb) {
            ah.e(eCd);
        } else if (eCE == eBZ) {
            ah.e(ezg ? eCb : eCa);
        }
    }

    public static void JO() {
        if (eyb) {
            ah.e(eCc);
        } else if (eCE == eCa || eCE == eCb) {
            ah.e(eBZ);
        }
    }

    public static void aGw() {
        eCG.b(eCE);
        ah.e(eBZ);
    }

    public static void aGx() {
        ah.e(eCG.aEO());
    }

    public static void JF() {
        ezh = true;
        ah.a(eAl, eEp);
        ah.a(eAm, eEq);
    }

    public static void JG() {
        ezh = false;
        ah.a(eAl, 0);
    }

    public static void at(float f2) {
        eEq = f2;
        if (ezh) {
            ah.a(eAm, f2);
        }
    }

    public static void bM(int n2, int n3) {
        GL11.glFogi((int)n2, (int)n3);
        if (n2 == 2917) {
            eEp = n3;
            if (ezh) {
                ah.a(eAl, eEp);
            }
        }
    }

    public static void Jk() {
        ezg = true;
        if (eCE == eCa) {
            ah.e(eCb);
        }
    }

    public static void Jj() {
        ezg = false;
        if (eCE == eCb) {
            ah.e(eCa);
        }
    }

    public static int aGy() {
        return eFk[ewi * 2];
    }

    public static int aGz() {
        return eFk[ewi * 2 + 1];
    }

    public static int ke(int n2) {
        ah.eFk[ah.ewi * 2] = eFk[ewi * 2] & 0xFFFF | n2 << 16;
        return n2;
    }

    public static int kf(int n2) {
        ah.eFk[ah.ewi * 2 + 1] = eFk[ewi * 2 + 1] & 0xFFFF0000 | n2 & 0xFFFF;
        return n2;
    }

    public static void bN(int n2, int n3) {
        ah.eFk[++ah.ewi * 2] = n2 & 0xFFFF | n3 << 16;
        ah.eFk[ah.ewi * 2 + 1] = 0;
    }

    public static void kg(int n2) {
        ah.eFk[++ah.ewi * 2] = n2 & 0xFFFF;
        ah.eFk[ah.ewi * 2 + 1] = 0;
    }

    public static void M(Block block) {
        int n2 = block.xg();
        ah.eFk[++ah.ewi * 2] = Block.aRV.z(block) & 0xFFFF | n2 << 16;
        ah.eFk[ah.ewi * 2 + 1] = 0;
    }

    public static void aET() {
        ah.eFk[ah.ewi * 2] = 0;
        ah.eFk[ah.ewi * 2 + 1] = 0;
        --ewi;
    }

    public static void aGA() {
        ah.P.bhw.ajv();
    }

    public static String aGB() {
        return eDp == null ? null : (eDp instanceof ad ? null : eDp.getName());
    }

    public static InputStream iW(String string) {
        return eDp == null ? null : eDp.iz(string);
    }

    public static void aGC() {
        eDi += 2;
        if ((eDi = eDi / 2 * 2) > 4) {
            eDi = 0;
        }
        eDi = net.minecraft.src.a.A(eDi, 0, 4);
    }

    public static void aGD() {
        try {
            Class<?> clazz = Class.forName("shadersmod.transform.SMCClassTransformer");
        }
        catch (Throwable throwable) {
            return;
        }
        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }

    public static void aBA() {
        ah.aGE();
        if (eDq) {
            net.optifine.shaders.b.aBA();
            n.aBA();
            i.aBA();
        }
    }

    private static void aGE() {
        eDV = new HashMap<String, String>();
        if (eDq) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            String string = "/shaders/lang/";
            String string2 = "en_US";
            String string3 = ".lang";
            arrayList.add("/shaders/lang/en_US.lang");
            if (!net.minecraft.src.a.aoH().cia.equals("en_US")) {
                arrayList.add("/shaders/lang/" + net.minecraft.src.a.aoH().cia + ".lang");
            }
            try {
                for (String string4 : arrayList) {
                    InputStream inputStream = eDp.iz(string4);
                    if (inputStream == null) continue;
                    af af2 = new af();
                    aw.a(inputStream, af2);
                    inputStream.close();
                    for (Object object : ((Properties)af2).keySet()) {
                        String string5 = (String)object;
                        String string6 = af2.getProperty(string5);
                        eDV.put(string5, string6);
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static String ak(String string, String string2) {
        String string3 = eDV.get(string);
        return string3 == null ? string2 : string3;
    }

    public static boolean iX(String string) {
        s s2;
        if (string == null) {
            return false;
        }
        if (string.length() <= 0) {
            return false;
        }
        int n2 = string.lastIndexOf("/");
        if (n2 >= 0) {
            string = string.substring(n2 + 1);
        }
        return (s2 = ah.iF(string)) != null;
    }

    public static s iF(String string) {
        return eBU.iF(string);
    }

    public static void bd(co co2) {
        eyn = ah.bf(co2);
    }

    public static void be(co co2) {
        eyo = ah.bf(co2);
    }

    public static boolean aGF() {
        return eyn;
    }

    public static boolean aGG() {
        return eyo;
    }

    public static boolean aGH() {
        return eyi && eyj;
    }

    private static boolean bf(co co2) {
        if (co2 == null) {
            return false;
        }
        net.minecraft.item.d d2 = co2.bP();
        if (d2 == null) {
            return false;
        }
        if (!(d2 instanceof net.minecraft.item.af)) {
            return false;
        }
        net.minecraft.item.af af2 = (net.minecraft.item.af)d2;
        Block block = af2.df();
        if (block == null) {
            return false;
        }
        av av2 = block.xo();
        return av2 == av.dxY;
    }

    public static boolean aGI() {
        return eyk;
    }

    public static boolean aGJ() {
        return !eyk && !eyl;
    }

    public static void k(boolean bl2, boolean bl3) {
        eyk = bl2;
        eyl = bl3;
    }

    public static void l(boolean bl2, boolean bl3) {
        eyi = bl2;
        eyj = bl3;
    }

    public static boolean aGK() {
        return eyi;
    }

    public static boolean aGL() {
        return eyj;
    }

    public static float aGM() {
        return eBz < 0.0f ? -1.0f : eBx * eBz;
    }

    public static void cR(boolean bl2) {
        eyh = bl2;
    }

    public static boolean aGN() {
        return eyh;
    }

    public static void aGO() {
        if (eya) {
            ah.e(eCl);
        }
    }

    public static void aGP() {
        if (eya) {
            ah.e(eCk);
        }
    }

    public static net.minecraft.world.w aGQ() {
        return dFb;
    }

    public static net.minecraft.util.b aGR() {
        return new net.minecraft.util.b(eBl, eBm, eBn);
    }

    public static boolean aGS() {
        return eEb != null;
    }

    public static boolean aGT() {
        return !ezt || ah.exQ.GL_NV_geometry_shader4;
    }

    static {
        exO = false;
        exP = false;
        exU = false;
        exV = 0;
        exW = 0;
        exX = 0;
        exY = 0;
        exZ = 0;
        eya = false;
        eyb = false;
        eyc = false;
        eyd = false;
        eye = false;
        eyf = false;
        eym = false;
        eyn = false;
        eyo = false;
        eyp = new float[4];
        eyq = new float[4];
        eyr = new float[4];
        eys = new float[4];
        eyt = new float[4];
        eyu = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        eyv = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        eyw = new float[]{0.0f, -100.0f, 0.0f, 0.0f};
        eyx = new float[16];
        dcf = 0L;
        eyE = 0L;
        eyF = 0L;
        eyG = 0.0f;
        eyH = 0.0f;
        eyI = 0.0f;
        eyJ = 0;
        bgf = 0L;
        bnS = 0L;
        eyK = 0L;
        bYY = 0;
        eyL = 0.0f;
        eyM = 0.0f;
        eyN = 0;
        eyO = 0.0f;
        eyP = 0.0f;
        eyQ = 600.0f;
        eyR = 200.0f;
        eyS = 10.0f;
        eyT = false;
        eyU = 0;
        eyV = 0;
        eyW = 0.0f;
        eyX = 0.0f;
        eyY = 0.0f;
        eyZ = 0.0f;
        eza = 0.0f;
        ezb = 1.0f;
        ezc = false;
        ezd = 1;
        eze = 0.0f;
        ezf = 0.0f;
        ezg = false;
        ezh = true;
        ezi = 10;
        ezj = 11;
        ezk = 12;
        ezl = false;
        ezm = false;
        ezn = false;
        ezo = false;
        ezp = false;
        ezq = false;
        ezr = false;
        ezs = 3;
        ezt = false;
        ezu = 0;
        ezv = 0;
        ezw = new p();
        ezx = ezw.jW("entityColor");
        ezy = ezw.jR("entityId");
        ezz = ezw.jR("blockEntityId");
        ezA = ezw.jR("texture");
        ezB = ezw.jR("lightmap");
        ezC = ezw.jR("normals");
        ezD = ezw.jR("specular");
        ezE = ezw.jR("shadow");
        ezF = ezw.jR("watershadow");
        ezG = ezw.jR("shadowtex0");
        ezH = ezw.jR("shadowtex1");
        ezI = ezw.jR("depthtex0");
        ezJ = ezw.jR("depthtex1");
        ezK = ezw.jR("shadowcolor");
        ezL = ezw.jR("shadowcolor0");
        ezM = ezw.jR("shadowcolor1");
        ezN = ezw.jR("noisetex");
        ezO = ezw.jR("gcolor");
        ezP = ezw.jR("gdepth");
        ezQ = ezw.jR("gnormal");
        ezR = ezw.jR("composite");
        ezS = ezw.jR("gaux1");
        ezT = ezw.jR("gaux2");
        ezU = ezw.jR("gaux3");
        ezV = ezw.jR("gaux4");
        ezW = ezw.jR("colortex0");
        ezX = ezw.jR("colortex1");
        ezY = ezw.jR("colortex2");
        ezZ = ezw.jR("colortex3");
        eAa = ezw.jR("colortex4");
        eAb = ezw.jR("colortex5");
        eAc = ezw.jR("colortex6");
        eAd = ezw.jR("colortex7");
        eAe = ezw.jR("gdepthtex");
        eAf = ezw.jR("depthtex2");
        eAg = ezw.jR("tex");
        eAh = ezw.jR("heldItemId");
        eAi = ezw.jR("heldBlockLightValue");
        eAj = ezw.jR("heldItemId2");
        eAk = ezw.jR("heldBlockLightValue2");
        eAl = ezw.jR("fogMode");
        eAm = ezw.jU("fogDensity");
        eAn = ezw.jV("fogColor");
        eAo = ezw.jV("skyColor");
        eAp = ezw.jR("worldTime");
        eAq = ezw.jR("worldDay");
        eAr = ezw.jR("moonPhase");
        eAs = ezw.jR("frameCounter");
        eAt = ezw.jU("frameTime");
        eAu = ezw.jU("frameTimeCounter");
        eAv = ezw.jU("sunAngle");
        eAw = ezw.jU("shadowAngle");
        eAx = ezw.jU("rainStrength");
        eAy = ezw.jU("aspectRatio");
        eAz = ezw.jU("viewWidth");
        eAA = ezw.jU("viewHeight");
        eAB = ezw.jU("near");
        eAC = ezw.jU("far");
        eAD = ezw.jV("sunPosition");
        eAE = ezw.jV("moonPosition");
        eAF = ezw.jV("shadowLightPosition");
        eAG = ezw.jV("upPosition");
        eAH = ezw.jV("previousCameraPosition");
        eAI = ezw.jV("cameraPosition");
        eAJ = ezw.jX("gbufferModelView");
        eAK = ezw.jX("gbufferModelViewInverse");
        eAL = ezw.jX("gbufferPreviousProjection");
        eAM = ezw.jX("gbufferProjection");
        eAN = ezw.jX("gbufferProjectionInverse");
        eAO = ezw.jX("gbufferPreviousModelView");
        eAP = ezw.jX("shadowProjection");
        eAQ = ezw.jX("shadowProjectionInverse");
        eAR = ezw.jX("shadowModelView");
        eAS = ezw.jX("shadowModelViewInverse");
        eAT = ezw.jU("wetness");
        eAU = ezw.jU("eyeAltitude");
        eAV = ezw.jS("eyeBrightness");
        eAW = ezw.jS("eyeBrightnessSmooth");
        eAX = ezw.jS("terrainTextureSize");
        eAY = ezw.jR("terrainIconSize");
        eAZ = ezw.jR("isEyeInWater");
        eBa = ezw.jU("nightVision");
        eBb = ezw.jU("blindness");
        eBc = ezw.jU("screenBrightness");
        eBd = ezw.jR("hideGUI");
        eBe = ezw.jU("centerDepthSmooth");
        eBf = ezw.jS("atlasSize");
        eBg = ezw.jT("blendFunc");
        eBh = ezw.jR("instanceId");
        eBq = 0;
        eBr = false;
        eBs = 1024;
        eBt = 1024;
        eBu = 1024;
        eBv = 1024;
        eBw = 90.0f;
        eBx = 160.0f;
        eBy = true;
        eBz = -1.0f;
        eBA = 0;
        eBC = false;
        eBD = false;
        eBJ = 0;
        eBK = 0;
        eBL = 0;
        eBM = 0;
        eBN = 0;
        eBO = 0;
        eBP = 0;
        eBQ = 0;
        eBR = new int[8];
        eBS = new boolean[8];
        eBT = new Vector4f[8];
        eBU = new v();
        eBV = eBU.aEQ();
        eBW = eBU.b("shadow", eBV);
        eBX = eBU.b("shadow_solid", eBW);
        eBY = eBU.b("shadow_cutout", eBW);
        eBZ = eBU.a("gbuffers_basic", eBV);
        eCa = eBU.a("gbuffers_textured", eBZ);
        eCb = eBU.a("gbuffers_textured_lit", eCa);
        eCc = eBU.a("gbuffers_skybasic", eBZ);
        eCd = eBU.a("gbuffers_skytextured", eCa);
        eCe = eBU.a("gbuffers_clouds", eCa);
        eCf = eBU.a("gbuffers_terrain", eCb);
        eCg = eBU.a("gbuffers_terrain_solid", eCf);
        eCh = eBU.a("gbuffers_terrain_cutout_mip", eCf);
        eCi = eBU.a("gbuffers_terrain_cutout", eCf);
        eCj = eBU.a("gbuffers_damagedblock", eCf);
        eCk = eBU.a("gbuffers_block", eCf);
        eCl = eBU.a("gbuffers_beaconbeam", eCa);
        eCm = eBU.a("gbuffers_item", eCb);
        eCn = eBU.a("gbuffers_entities", eCb);
        eCo = eBU.a("gbuffers_entities_glowing", eCn);
        eCp = eBU.a("gbuffers_armor_glint", eCa);
        eCq = eBU.a("gbuffers_spidereyes", eCa);
        eCr = eBU.a("gbuffers_hand", eCb);
        eCs = eBU.a("gbuffers_weather", eCb);
        eCt = eBU.iE("deferred_pre");
        eCu = eBU.S("deferred", 16);
        eCv = eCu[0];
        eCw = eBU.a("gbuffers_water", eCf);
        eCx = eBU.a("gbuffers_hand_water", eCr);
        eCy = eBU.iE("composite_pre");
        eCz = eBU.R("composite", 16);
        eCA = eCz[0];
        eCB = eBU.iC("final");
        eCC = eBU.akg();
        eCD = eBU.aES();
        eCE = eBV;
        eCF = 0;
        eCG = new t();
        eCH = false;
        eCI = null;
        eCJ = 0;
        eCK = null;
        eCL = null;
        eCM = null;
        eCN = new boolean[2];
        eCO = new boolean[2];
        eCP = new boolean[2];
        eCQ = new boolean[8];
        eCR = new boolean[8];
        eCS = false;
        eCT = false;
        eCU = 0.125f;
        eCV = 1.0f;
        eCW = 1.0f;
        eCX = 0;
        eCY = 0;
        eCZ = 0;
        eDa = 0;
        eDb = 0;
        eDc = 0;
        eDd = true;
        eDe = true;
        eDf = true;
        eDg = new net.optifine.shaders.config.h("oldLighting", "Classic Lighting", 0);
        eDh = new net.optifine.shaders.config.h("oldHandLight", "Old Hand Light", 0);
        eDi = 0;
        eDl = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
        eDm = new String[]{"Nearest", "Linear"};
        eDn = new int[]{9728, 9984, 9986};
        eDo = new int[]{9728, 9729};
        eDp = null;
        eDq = false;
        eDy = null;
        eDz = null;
        eDA = null;
        eDB = null;
        eDC = new HashMap<String, net.optifine.expr.m>();
        eDE = new net.optifine.shaders.config.g("clouds", "Clouds", 0);
        eDF = new net.optifine.shaders.config.h("oldLighting", "Classic Lighting", 0);
        eDG = new net.optifine.shaders.config.h("oldHandLight", "Old Hand Light", 0);
        eDH = new net.optifine.shaders.config.h("dynamicHandLight", "Dynamic Hand Light", 0);
        eDI = new net.optifine.shaders.config.h("shadowTranslucent", "Shadow Translucent", 0);
        eDJ = new net.optifine.shaders.config.h("underwaterOverlay", "Underwater Overlay", 0);
        eDK = new net.optifine.shaders.config.h("sun", "Sun", 0);
        eDL = new net.optifine.shaders.config.h("moon", "Moon", 0);
        eDM = new net.optifine.shaders.config.h("vignette", "Vignette", 0);
        eDN = new net.optifine.shaders.config.h("backFace.solid", "Back-face Solid", 0);
        eDO = new net.optifine.shaders.config.h("backFace.cutout", "Back-face Cutout", 0);
        eDP = new net.optifine.shaders.config.h("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
        eDQ = new net.optifine.shaders.config.h("backFace.translucent", "Back-face Translucent", 0);
        eDR = new net.optifine.shaders.config.h("rain.depth", "Rain Depth", 0);
        eDS = new net.optifine.shaders.config.h("beacon.beam.depth", "Rain Depth", 0);
        eDT = new net.optifine.shaders.config.h("separateAo", "Separate AO", 0);
        eDU = new net.optifine.shaders.config.h("frustum.culling", "Frustum Culling", 0);
        eDV = new HashMap<String, String>();
        dFb = null;
        eDW = new ArrayList<Integer>();
        eDX = null;
        eDY = null;
        eDZ = null;
        eEa = null;
        eEb = null;
        eEf = new String[]{"gbuffers", "composite", "deferred"};
        eEi = System.getProperty("shaders.debug.save", "false").equals("true");
        eEj = 0.5f;
        eEk = 0.6f;
        eEl = 0.8f;
        eEm = -1.0f;
        eEn = 0.0f;
        eEo = 0.0f;
        eEp = 0;
        eEq = 0.0f;
        eEu = 2.0f;
        eEv = 16;
        eEw = new int[2];
        eEy = false;
        eEz = 256;
        eEA = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
        eEB = (285 + 8 * eCC) * 4;
        eEC = BufferUtils.createByteBuffer((int)eEB).limit(0);
        eED = new float[16];
        eEE = new float[16];
        eEF = new float[16];
        eEG = new float[16];
        eEH = new float[16];
        eEI = new float[16];
        eEJ = new float[16];
        eEK = new float[16];
        eEL = ah.jT(16);
        eEM = ah.jT(16);
        eEN = ah.jT(16);
        eEO = ah.jT(16);
        eEP = ah.jT(16);
        eEQ = ah.jT(16);
        eER = ah.jT(16);
        eES = ah.jT(16);
        eET = ah.jT(16);
        eEU = ah.jT(16);
        eEV = ah.jT(16);
        eEW = ah.jT(16);
        eEX = ah.jS(16);
        eEY = ah.jS(3);
        eEZ = ah.jS(8);
        eFa = ah.jS(2);
        eFb = ah.jS(8);
        eFc = ah.jS(8);
        eFd = ah.jS(8).limit(0);
        eFe = ah.jS(8).put(36064).position(0).limit(1);
        eFf = new net.optifine.shaders.j(eEX, 8);
        eFh = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
        eFi = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
        eFj = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
        eFk = new int[32];
        ewi = 0;
        eDw = new File(net.minecraft.client.d.AZ().bhf, eDu);
        eDx = new File(net.minecraft.client.d.AZ().bhf, eDv);
    }
}

