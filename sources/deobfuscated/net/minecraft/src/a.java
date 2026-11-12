/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.PixelFormat
 */
package net.minecraft.src;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.c;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository$Entry;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.util.ax;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.ao;
import net.optifine.bn;
import net.optifine.gui.e;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.shaders.ah;
import net.optifine.util.af;
import net.optifine.util.ak;
import net.optifine.util.j;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;

public class a {
    public static final String dnK = "OptiFine";
    public static final String dnL = "1.8.9";
    public static final String dnM = "HD_U";
    public static final String dnN = "L5";
    public static final String dnO = "OptiFine_1.8.9_HD_U_L5";
    private static String dnP = null;
    private static String dnQ = null;
    private static boolean dnR = false;
    public static String dnS = null;
    public static String dnT = null;
    public static String dnU = null;
    public static String[] dnV = null;
    public static net.optifine.config.e dnW = null;
    public static net.optifine.config.e dnX = null;
    public static int dnY = -1;
    public static boolean dnZ = false;
    public static boolean doa = false;
    private static net.minecraft.client.settings.a aIY = null;
    private static final Minecraft dob = Minecraft.getMinecraft();
    private static boolean Mq = false;
    private static Thread doc = null;
    private static DisplayMode dod = null;
    private static DisplayMode[] doe = null;
    private static int dof = 0;
    private static int dog = 0;
    public static boolean doh = false;
    private static int doi = 0;
    public static boolean doj = false;
    private static boolean dok = false;
    private static boolean dol = false;
    private static DefaultResourcePack dom = null;
    public static final Float don = Float.valueOf(0.1f);
    private static final Logger doo = LogManager.getLogger();
    public static final boolean dop = System.getProperty("log.detail", "false").equals("true");
    private static String doq = null;
    private static int dor = 0;
    public static float bWY;

    public static String getVersion() {
        return dnO;
    }

    public static String amM() {
        StringBuffer stringBuffer = new StringBuffer(32);
        if (a.apa()) {
            stringBuffer.append("DL: ");
            stringBuffer.append(ao.akg());
            stringBuffer.append(", ");
        }
        stringBuffer.append(dnO);
        String string = ah.aGB();
        if (string != null) {
            stringBuffer.append(", ");
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static void a(net.minecraft.client.settings.a a2) {
        if (aIY == null) {
            aIY = a2;
            dod = Display.getDesktopDisplayMode();
            a.aoK();
            l.f("optifine.ForgeSplashCompatible", Boolean.TRUE);
        }
    }

    public static void amN() {
        a.amO();
        dof = a.aIY.cim;
        a.aoR();
        a.aoS();
        doc = Thread.currentThread();
        a.ana();
        ah.a(Minecraft.getMinecraft());
    }

    public static void amO() {
        if (!Mq && Display.isCreated()) {
            Mq = true;
            a.amP();
        }
    }

    private static void amP() {
        a.fO("");
        a.fO(a.getVersion());
        a.fO("Build: " + a.amQ());
        a.fO("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        a.fO("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        a.fO("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        a.fO("LWJGL: " + Sys.getVersion());
        dnS = GL11.glGetString((int)7938);
        dnT = GL11.glGetString((int)7937);
        dnU = GL11.glGetString((int)7936);
        a.fO("OpenGL: " + dnT + ", version " + dnS + ", " + dnU);
        a.fO("OpenGL Version: " + a.amU());
        if (!GLContext.getCapabilities().OpenGL12) {
            a.fO("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        if (!(dnZ = GLContext.getCapabilities().GL_NV_fog_distance)) {
            a.fO("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        if (!(doa = GLContext.getCapabilities().GL_ARB_occlusion_query)) {
            a.fO("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        int n2 = ak.Bc();
        a.fN("Maximum texture size: " + n2 + "x" + n2);
    }

    public static String amQ() {
        if (dnP == null) {
            try {
                InputStream inputStream = a.class.getResourceAsStream("/buildof.txt");
                if (inputStream == null) {
                    return null;
                }
                dnP = a.g(inputStream)[0];
            }
            catch (Exception exception) {
                a.warn(exception.getClass().getName() + ": " + exception.getMessage());
                dnP = "";
            }
        }
        return dnP;
    }

    public static boolean amR() {
        return dnZ;
    }

    public static boolean amS() {
        return doa;
    }

    public static int amT() {
        if (dnY < 0) {
            String[] stringArray = a.V(dnL, ".");
            int n2 = 0;
            if (stringArray.length > 0) {
                n2 += 10000 * a.x(stringArray[0], 0);
            }
            if (stringArray.length > 1) {
                n2 += 100 * a.x(stringArray[1], 0);
            }
            if (stringArray.length > 2) {
                n2 += 1 * a.x(stringArray[2], 0);
            }
            dnY = n2;
        }
        return dnY;
    }

    public static String amU() {
        net.optifine.config.e e2 = a.amW();
        String string = e2.aBT() + "." + e2.aBU() + "." + e2.aBV();
        return string;
    }

    private static net.optifine.config.e amV() {
        return GLContext.getCapabilities().OpenGL44 ? new net.optifine.config.e(4, 4) : (GLContext.getCapabilities().OpenGL43 ? new net.optifine.config.e(4, 3) : (GLContext.getCapabilities().OpenGL42 ? new net.optifine.config.e(4, 2) : (GLContext.getCapabilities().OpenGL41 ? new net.optifine.config.e(4, 1) : (GLContext.getCapabilities().OpenGL40 ? new net.optifine.config.e(4, 0) : (GLContext.getCapabilities().OpenGL33 ? new net.optifine.config.e(3, 3) : (GLContext.getCapabilities().OpenGL32 ? new net.optifine.config.e(3, 2) : (GLContext.getCapabilities().OpenGL31 ? new net.optifine.config.e(3, 1) : (GLContext.getCapabilities().OpenGL30 ? new net.optifine.config.e(3, 0) : (GLContext.getCapabilities().OpenGL21 ? new net.optifine.config.e(2, 1) : (GLContext.getCapabilities().OpenGL20 ? new net.optifine.config.e(2, 0) : (GLContext.getCapabilities().OpenGL15 ? new net.optifine.config.e(1, 5) : (GLContext.getCapabilities().OpenGL14 ? new net.optifine.config.e(1, 4) : (GLContext.getCapabilities().OpenGL13 ? new net.optifine.config.e(1, 3) : (GLContext.getCapabilities().OpenGL12 ? new net.optifine.config.e(1, 2) : (GLContext.getCapabilities().OpenGL11 ? new net.optifine.config.e(1, 1) : new net.optifine.config.e(1, 0))))))))))))))));
    }

    public static net.optifine.config.e amW() {
        if (dnW == null) {
            String string = GL11.glGetString((int)7938);
            dnW = a.a(string, null);
            if (dnW == null) {
                dnW = a.amV();
            }
            if (dnW == null) {
                dnW = new net.optifine.config.e(1, 0);
            }
        }
        return dnW;
    }

    public static net.optifine.config.e amX() {
        String string;
        if (dnX == null && (dnX = a.a(string = GL11.glGetString((int)35724), null)) == null) {
            dnX = new net.optifine.config.e(1, 10);
        }
        return dnX;
    }

    public static net.optifine.config.e a(String string, net.optifine.config.e e2) {
        try {
            if (string == null) {
                return e2;
            }
            Pattern pattern = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return e2;
            }
            int n2 = Integer.parseInt(matcher.group(1));
            int n3 = Integer.parseInt(matcher.group(2));
            int n4 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4)) : 0;
            String string2 = matcher.group(5);
            return new net.optifine.config.e(n2, n3, n4, string2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return e2;
        }
    }

    public static String[] amY() {
        if (dnV == null) {
            dnV = a.amZ();
        }
        return dnV;
    }

    private static String[] amZ() {
        Object object;
        try {
            int n2;
            object = a.amW();
            if (((net.optifine.config.e)object).aBT() >= 3 && (n2 = GL11.glGetInteger((int)33309)) > 0) {
                String[] stringArray = new String[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    stringArray[i2] = GL30.glGetStringi((int)7939, (int)i2);
                }
                return stringArray;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = GL11.glGetString((int)7939);
            String[] stringArray = ((String)object).split(" ");
            return stringArray;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[0];
        }
    }

    public static void ana() {
        a.aoK();
        int n2 = 8;
        if (a.aoL()) {
            if (a.aoM()) {
                doc.setPriority(10);
                a.G("Server thread", 1);
            } else {
                doc.setPriority(5);
                a.G("Server thread", 5);
            }
        } else {
            doc.setPriority(10);
            a.G("Server thread", 5);
        }
    }

    private static void G(String string, int n2) {
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            int n3 = (threadGroup.activeCount() + 10) * 2;
            Thread[] threadArray = new Thread[n3];
            threadGroup.enumerate(threadArray, false);
            for (int i2 = 0; i2 < threadArray.length; ++i2) {
                Thread thread = threadArray[i2];
                if (thread == null || !thread.getName().startsWith(string)) continue;
                thread.setPriority(n2);
            }
        }
        catch (Throwable throwable) {
            a.warn(throwable.getClass().getName() + ": " + throwable.getMessage());
        }
    }

    public static boolean anb() {
        return Thread.currentThread() == doc;
    }

    private static void anc() {
        bn bn2 = new bn();
        bn2.start();
    }

    public static boolean and() {
        return a.aIY.bZj > 0;
    }

    public static int Ow() {
        return a.aIY.bZj;
    }

    public static int ane() {
        switch (a.aIY.cie) {
            case 0: {
                return 9986;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (a.LE()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (a.LE()) {
                    return 9987;
                }
                return 9986;
            }
        }
        return 9986;
    }

    public static boolean anf() {
        float f2 = a.ang();
        return f2 > don.floatValue() + 1.0E-5f;
    }

    public static float ang() {
        return don.floatValue();
    }

    public static boolean anh() {
        return a.amR() && a.aIY.cic == 2;
    }

    public static boolean ani() {
        return a.aIY.cic == 1;
    }

    public static boolean anj() {
        return a.aIY.cic == 3;
    }

    public static boolean ank() {
        return a.aIY.cic != 3;
    }

    public static float anl() {
        return a.aIY.cid;
    }

    public static void fM(String string) {
        if (dop) {
            doo.info("[OptiFine] " + string);
        }
    }

    public static void fN(String string) {
        doo.info("[OptiFine] " + string);
    }

    public static void warn(String string) {
        doo.warn("[OptiFine] " + string);
    }

    public static void error(String string) {
        doo.error("[OptiFine] " + string);
    }

    public static void fO(String string) {
        a.fN(string);
    }

    public static int anm() {
        return a.aIY.ciD;
    }

    public static boolean ann() {
        return a.aIY.ciE;
    }

    public static boolean ano() {
        return a.aIY.cir == 0 ? a.aIY.aWD : a.aIY.cir == 2;
    }

    public static boolean anp() {
        return a.aIY.cir == 3;
    }

    public static boolean anq() {
        return a.aIY.cio != 0 ? a.aIY.cio == 2 : (a.aoG() && !ah.eDE.aBJ() ? ah.eDE.aHA() : (doi != 0 ? doi == 2 : a.aIY.aWD));
    }

    public static boolean anr() {
        return a.aIY.cio != 0 ? a.aIY.cio == 3 : (a.aoG() && !ah.eDE.aBJ() ? ah.eDE.aHB() : doi != 0 && doi == 3);
    }

    public static void ans() {
        doi = 0;
        IResourceManager iResourceManager = a.Br();
        if (iResourceManager != null) {
            try {
                InputStream inputStream = iResourceManager.v(new cm("mcpatcher/color.properties")).getInputStream();
                if (inputStream == null) {
                    return;
                }
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                String string = af2.getProperty("clouds");
                if (string == null) {
                    return;
                }
                a.fN("Texture pack clouds: " + string);
                string = string.toLowerCase();
                if (string.equals("fast")) {
                    doi = 1;
                }
                if (string.equals("fancy")) {
                    doi = 2;
                }
                if (string.equals("off")) {
                    doi = 3;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static ModelManager IV() {
        return a.dob.BG().bhN;
    }

    public static boolean ant() {
        return a.aIY.ciq == 0 ? a.aIY.aWD : a.aIY.ciq != 1;
    }

    public static boolean anu() {
        return a.aIY.ciq == 4;
    }

    public static boolean anv() {
        return a.aIY.ciq == 0 ? !a.aIY.aWD : a.aIY.ciq == 4;
    }

    public static boolean anw() {
        return a.aIY.cis == 0 ? a.aIY.aWD : a.aIY.cis == 2;
    }

    public static int A(int n2, int n3, int n4) {
        return n2 < n3 ? n3 : (n2 > n4 ? n4 : n2);
    }

    public static float F(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : (f2 > f4 ? f4 : f2);
    }

    public static double ab(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : (d2 > d4 ? d4 : d2);
    }

    public static float bE(float f2) {
        return f2 < 0.0f ? 0.0f : (f2 > 1.0f ? 1.0f : f2);
    }

    public static boolean anx() {
        return a.aIY.cje != 2;
    }

    public static boolean any() {
        return a.aIY.cje == 1;
    }

    public static boolean anz() {
        return a.aIY.cjh;
    }

    public static boolean anA() {
        return a.aIY.cjf != 2;
    }

    public static boolean anB() {
        return a.aIY.cjf == 1;
    }

    public static boolean anC() {
        return a.aIY.cjg;
    }

    public static boolean anD() {
        return a.aIY.cji;
    }

    public static boolean anE() {
        return a.aIY.cjj;
    }

    public static boolean anF() {
        return a.aIY.cjk;
    }

    public static boolean anG() {
        return a.aIY.cjl;
    }

    public static boolean anH() {
        return a.aIY.cjm;
    }

    public static boolean anI() {
        return a.aIY.cjn;
    }

    public static boolean anJ() {
        return a.aIY.cjo;
    }

    public static boolean anK() {
        return a.aIY.cjp;
    }

    public static boolean anL() {
        return a.aIY.cjq;
    }

    public static boolean anM() {
        return a.aIY.cjr;
    }

    public static float anN() {
        return a.aoG() && ah.eEm >= 0.0f ? ah.eEm : a.aIY.cil;
    }

    public static String J(List list) {
        return a.b(list, ", ");
    }

    public static String b(List list, String string) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(list.size() * 5);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object e2 = list.get(i2);
            if (i2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(e2);
        }
        return stringBuffer.toString();
    }

    public static String c(Object[] objectArray) {
        return a.a(objectArray, ", ");
    }

    public static String a(Object[] objectArray, String string) {
        if (objectArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(objectArray.length * 5);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (i2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(object);
        }
        return stringBuffer.toString();
    }

    public static String k(int[] nArray) {
        return a.a(nArray, ", ");
    }

    public static String a(int[] nArray, String string) {
        if (nArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(nArray.length * 5);
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2];
            if (i2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(n2);
        }
        return stringBuffer.toString();
    }

    public static String f(float[] fArray) {
        return a.a(fArray, ", ");
    }

    public static String a(float[] fArray, String string) {
        if (fArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(fArray.length * 5);
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            float f2 = fArray[i2];
            if (i2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(f2);
        }
        return stringBuffer.toString();
    }

    public static Minecraft AZ() {
        return dob;
    }

    public static TextureManager Bq() {
        return dob.Bq();
    }

    public static IResourceManager Br() {
        return dob.Br();
    }

    public static InputStream u(cm cm2) {
        return a.d(dob.Br(), cm2);
    }

    public static InputStream d(IResourceManager iResourceManager, cm cm2) {
        IResource iResource = iResourceManager.v(cm2);
        return iResource == null ? null : iResource.getInputStream();
    }

    public static IResource v(cm cm2) {
        return dob.Br().v(cm2);
    }

    public static boolean F(cm cm2) {
        if (cm2 == null) {
            return false;
        }
        IResourcePack iResourcePack = a.H(cm2);
        return iResourcePack != null;
    }

    public static boolean e(IResourceManager iResourceManager, cm cm2) {
        try {
            IResource iResource = iResourceManager.v(cm2);
            return iResource != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static IResourcePack[] anO() {
        ResourcePackRepository resourcePackRepository = dob.Bs();
        List<ResourcePackRepository$Entry> list = resourcePackRepository.PJ();
        ArrayList<IResourcePack> arrayList = new ArrayList<IResourcePack>();
        IResourcePack[] iResourcePackArray = list.iterator();
        while (iResourcePackArray.hasNext()) {
            ResourcePackRepository$Entry resourcePackRepository$Entry;
            ResourcePackRepository$Entry resourcePackRepository$Entry2 = resourcePackRepository$Entry = iResourcePackArray.next();
            arrayList.add(resourcePackRepository$Entry2.PQ());
        }
        if (resourcePackRepository.PM() != null) {
            arrayList.add(resourcePackRepository.PM());
        }
        iResourcePackArray = arrayList.toArray(new IResourcePack[arrayList.size()]);
        return iResourcePackArray;
    }

    public static String anP() {
        if (dob.Bs() == null) {
            return "";
        }
        IResourcePack[] iResourcePackArray = a.anO();
        if (iResourcePackArray.length <= 0) {
            return a.anQ().Pf();
        }
        Object[] objectArray = new String[iResourcePackArray.length];
        for (int i2 = 0; i2 < iResourcePackArray.length; ++i2) {
            objectArray[i2] = iResourcePackArray[i2].Pf();
        }
        String string = a.c(objectArray);
        return string;
    }

    public static DefaultResourcePack anQ() {
        ResourcePackRepository resourcePackRepository;
        Minecraft minecraft;
        if (dom == null && (dom = (DefaultResourcePack)g.a(minecraft = Minecraft.getMinecraft(), g.ero)) == null && (resourcePackRepository = minecraft.Bs()) != null) {
            dom = (DefaultResourcePack)resourcePackRepository.cdx;
        }
        return dom;
    }

    public static boolean G(cm cm2) {
        IResourcePack iResourcePack = a.H(cm2);
        return iResourcePack == a.anQ();
    }

    public static IResourcePack H(cm cm2) {
        ResourcePackRepository resourcePackRepository = dob.Bs();
        IResourcePack iResourcePack = resourcePackRepository.PM();
        if (iResourcePack != null && iResourcePack.s(cm2)) {
            return iResourcePack;
        }
        List<ResourcePackRepository$Entry> list = resourcePackRepository.cdE;
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            ResourcePackRepository$Entry resourcePackRepository$Entry = list.get(i2);
            IResourcePack iResourcePack2 = resourcePackRepository$Entry.PQ();
            if (!iResourcePack2.s(cm2)) continue;
            return iResourcePack2;
        }
        if (a.anQ().s(cm2)) {
            return a.anQ();
        }
        return null;
    }

    public static RenderGlobal anR() {
        return a.dob.bgG;
    }

    public static boolean anS() {
        return a.aIY.cit != 3;
    }

    public static boolean anT() {
        return a.aIY.cit == 2;
    }

    public static boolean anU() {
        return a.aIY.ciy;
    }

    public static boolean anV() {
        return a.aIY.ciz;
    }

    public static boolean anW() {
        return a.aIY.ciB;
    }

    public static boolean anX() {
        return a.anW() && (!a.aoG() || ah.aFn());
    }

    public static boolean anY() {
        return a.anW() && (!a.aoG() || ah.aFo());
    }

    public static boolean anZ() {
        return (!a.aoG() || ah.aFp()) && (a.aIY.ciC == 0 ? a.aIY.aWD : a.aIY.ciC == 2);
    }

    public static boolean aoa() {
        return a.aIY.ciA;
    }

    public static void k(long l2) {
        try {
            Thread.sleep(l2);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public static boolean aob() {
        return a.aIY.ciF == 1;
    }

    public static boolean aoc() {
        return a.aIY.ciF == 0;
    }

    public static boolean aod() {
        return a.aIY.ciF == 2;
    }

    public static boolean aoe() {
        return a.aIY.ciG;
    }

    public static int aof() {
        return a.aIY.cin;
    }

    public static boolean aog() {
        return a.aof() > 1;
    }

    public static int aoh() {
        return dof;
    }

    public static boolean aoi() {
        return a.aoh() > 0;
    }

    public static boolean aoj() {
        return a.aoH().cim > 0;
    }

    public static boolean LE() {
        return a.aof() > 1 || a.aoh() > 0;
    }

    public static boolean B(int n2, int n3, int n4) {
        return n2 >= n3 && n2 <= n4;
    }

    public static boolean G(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }

    public static boolean aok() {
        return a.aIY.cjs;
    }

    public static boolean aol() {
        return a.aIY.ciH;
    }

    public static Dimension aom() {
        if (dod == null) {
            return null;
        }
        if (aIY == null) {
            return new Dimension(dod.getWidth(), dod.getHeight());
        }
        String string = a.aIY.ciI;
        if (string.equals("Default")) {
            return new Dimension(dod.getWidth(), dod.getHeight());
        }
        String[] stringArray = a.V(string, " x");
        return stringArray.length < 2 ? new Dimension(dod.getWidth(), dod.getHeight()) : new Dimension(a.x(stringArray[0], -1), a.x(stringArray[1], -1));
    }

    public static int x(String string, int n2) {
        try {
            if (string == null) {
                return n2;
            }
            string = string.trim();
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static float b(String string, float f2) {
        try {
            if (string == null) {
                return f2;
            }
            string = string.trim();
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f2;
        }
    }

    public static boolean p(String string, boolean bl2) {
        try {
            if (string == null) {
                return bl2;
            }
            string = string.trim();
            return Boolean.parseBoolean(string);
        }
        catch (NumberFormatException numberFormatException) {
            return bl2;
        }
    }

    public static Boolean a(String string, Boolean bl2) {
        try {
            if (string == null) {
                return bl2;
            }
            return (string = string.trim().toLowerCase()).equals("true") ? Boolean.TRUE : (string.equals("false") ? Boolean.FALSE : bl2);
        }
        catch (NumberFormatException numberFormatException) {
            return bl2;
        }
    }

    public static String[] V(String string, String string2) {
        String[] stringArray;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        while (stringTokenizer.hasMoreTokens()) {
            stringArray = stringTokenizer.nextToken();
            arrayList.add(stringArray);
        }
        stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }

    public static DisplayMode aon() {
        return dod;
    }

    public static DisplayMode[] aoo() {
        if (doe == null) {
            try {
                DisplayMode[] displayModeArray = Display.getAvailableDisplayModes();
                Set<Dimension> set = a.a(displayModeArray);
                ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
                for (Dimension dimension : set) {
                    DisplayMode[] displayModeArray2 = a.a(displayModeArray, dimension);
                    DisplayMode displayMode = a.a(displayModeArray2, dod);
                    if (displayMode == null) continue;
                    arrayList.add(displayMode);
                }
                DisplayMode[] displayModeArray3 = arrayList.toArray(new DisplayMode[arrayList.size()]);
                Arrays.sort(displayModeArray3, new j());
                return displayModeArray3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                doe = new DisplayMode[]{dod};
            }
        }
        return doe;
    }

    public static DisplayMode aop() {
        DisplayMode[] displayModeArray = a.aoo();
        if (displayModeArray != null && displayModeArray.length >= 1) {
            DisplayMode displayMode = displayModeArray[displayModeArray.length - 1];
            return dod.getWidth() > displayMode.getWidth() ? dod : (dod.getWidth() == displayMode.getWidth() && dod.getHeight() > displayMode.getHeight() ? dod : displayMode);
        }
        return dod;
    }

    private static Set<Dimension> a(DisplayMode[] displayModeArray) {
        HashSet<Dimension> hashSet = new HashSet<Dimension>();
        for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
            DisplayMode displayMode = displayModeArray[i2];
            Dimension dimension = new Dimension(displayMode.getWidth(), displayMode.getHeight());
            hashSet.add(dimension);
        }
        return hashSet;
    }

    private static DisplayMode[] a(DisplayMode[] displayModeArray, Dimension dimension) {
        ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
        for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
            DisplayMode displayMode = displayModeArray[i2];
            if ((double)displayMode.getWidth() != dimension.getWidth() || (double)displayMode.getHeight() != dimension.getHeight()) continue;
            arrayList.add(displayMode);
        }
        DisplayMode[] displayModeArray2 = arrayList.toArray(new DisplayMode[arrayList.size()]);
        return displayModeArray2;
    }

    private static DisplayMode a(DisplayMode[] displayModeArray, DisplayMode displayMode) {
        if (displayMode != null) {
            for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
                DisplayMode displayMode2 = displayModeArray[i2];
                if (displayMode2.getBitsPerPixel() != displayMode.getBitsPerPixel() || displayMode2.getFrequency() != displayMode.getFrequency()) continue;
                return displayMode2;
            }
        }
        if (displayModeArray.length <= 0) {
            return null;
        }
        Arrays.sort(displayModeArray, new j());
        return displayModeArray[displayModeArray.length - 1];
    }

    public static String[] aoq() {
        DisplayMode[] displayModeArray = a.aoo();
        String[] stringArray = new String[displayModeArray.length];
        for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
            DisplayMode displayMode = displayModeArray[i2];
            String string = displayMode.getWidth() + "x" + displayMode.getHeight();
            stringArray[i2] = string;
        }
        return stringArray;
    }

    public static DisplayMode a(Dimension dimension) {
        DisplayMode[] displayModeArray = a.aoo();
        for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
            DisplayMode displayMode = displayModeArray[i2];
            if (displayMode.getWidth() != dimension.width || displayMode.getHeight() != dimension.height) continue;
            return displayMode;
        }
        return dod;
    }

    public static boolean aor() {
        return a.aIY.cjt;
    }

    public static boolean aos() {
        return a.aIY.cju;
    }

    public static boolean aot() {
        return a.aIY.ciJ;
    }

    public static boolean aou() {
        return a.aIY.ciK;
    }

    public static void fP(String string) {
    }

    public static boolean aov() {
        return a.aIY.ciL;
    }

    public static boolean aow() {
        return a.aIY.ciN;
    }

    public static boolean aox() {
        return a.aIY.ciO;
    }

    public static boolean aoy() {
        return a.aIY.ciM;
    }

    public static boolean aoz() {
        return a.aIY.ciP;
    }

    public static boolean aoA() {
        return a.aIY.ciQ != 3;
    }

    public static boolean aoB() {
        return a.aIY.ciS;
    }

    public static boolean aoC() {
        return a.aIY.ciT;
    }

    public static boolean aoD() {
        return a.aIY.ciQ == 2;
    }

    public static boolean aoE() {
        return a.aIY.ciV;
    }

    public static boolean aoF() {
        return a.aIY.ciW == 0 ? a.aIY.aWD : a.aIY.ciW == 2;
    }

    public static boolean aoG() {
        return ah.eDq;
    }

    public static String[] i(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        return a.g(fileInputStream);
    }

    public static String[] g(InputStream inputStream) {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String string;
            if ((string = bufferedReader.readLine()) == null) {
                String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
                return stringArray;
            }
            arrayList.add(string);
        }
    }

    public static String j(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        return a.a(fileInputStream, "ASCII");
    }

    public static String h(InputStream inputStream) {
        return a.a(inputStream, "ASCII");
    }

    public static String a(InputStream inputStream, String string) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer();
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            stringBuffer.append(string2);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static byte[] i(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        while (true) {
            int n2;
            if ((n2 = inputStream.read(byArray)) < 0) {
                inputStream.close();
                byte[] byArray2 = byteArrayOutputStream.toByteArray();
                return byArray2;
            }
            byteArrayOutputStream.write(byArray, 0, n2);
        }
    }

    public static net.minecraft.client.settings.a aoH() {
        return aIY;
    }

    public static String aoI() {
        return dnQ;
    }

    public static void fQ(String string) {
        dnQ = string;
    }

    public static int W(String string, String string2) {
        int n2;
        String[] stringArray;
        String string3;
        String[] stringArray2 = a.fR(string);
        String string4 = stringArray2[0];
        if (!string4.equals(string3 = (stringArray = a.fR(string2))[0])) {
            return string4.compareTo(string3);
        }
        int n3 = a.x(stringArray2[1], -1);
        if (n3 != (n2 = a.x(stringArray[1], -1))) {
            return n3 - n2;
        }
        String string5 = stringArray2[2];
        String string6 = stringArray[2];
        if (!string5.equals(string6)) {
            if (string5.isEmpty()) {
                return 1;
            }
            if (string6.isEmpty()) {
                return -1;
            }
        }
        return string5.compareTo(string6);
    }

    private static String[] fR(String string) {
        if (string != null && string.length() > 0) {
            Pattern pattern = Pattern.compile("([A-Z])([0-9]+)(.*)");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return new String[]{"", "", ""};
            }
            String string2 = a.fS(matcher.group(1));
            String string3 = a.fS(matcher.group(2));
            String string4 = a.fS(matcher.group(3));
            return new String[]{string2, string3, string4};
        }
        return new String[]{"", "", ""};
    }

    public static int hh(int n2) {
        n2 = n2 ^ 0x3D ^ n2 >> 16;
        n2 += n2 << 3;
        n2 ^= n2 >> 4;
        n2 *= 668265261;
        n2 ^= n2 >> 15;
        return n2;
    }

    public static int d(b b2, int n2) {
        int n3 = a.hh(n2 + 37);
        n3 = a.hh(n3 + b2.wt());
        n3 = a.hh(n3 + b2.wx());
        n3 = a.hh(n3 + b2.wu());
        return n3;
    }

    public static int aoJ() {
        return dog;
    }

    public static void aoK() {
        dog = Runtime.getRuntime().availableProcessors();
    }

    public static boolean aoL() {
        return a.aoJ() <= 1;
    }

    public static boolean aoM() {
        return a.aIY.cih;
    }

    public static boolean aoN() {
        return a.aIY.cii;
    }

    public static boolean aoO() {
        return a.aIY.ciX;
    }

    public static boolean aoP() {
        return a.aIY.ciY;
    }

    public static int aoQ() {
        if (aIY == null) {
            return 10;
        }
        int n2 = a.aIY.bOt;
        return n2;
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    public static boolean e(Object object, Object[] objectArray) {
        if (objectArray == null) {
            return false;
        }
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object2 = objectArray[i2];
            if (!a.a(object, object2)) continue;
            return true;
        }
        return false;
    }

    public static boolean d(int n2, int[] nArray) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean f(Object object, Object[] objectArray) {
        if (objectArray == null) {
            return false;
        }
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object2 = objectArray[i2];
            if (object != object2) continue;
            return true;
        }
        return false;
    }

    public static String fS(String string) {
        return string == null ? "" : string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void aoR() {
        int n2 = a.aoh();
        if (n2 > 0) {
            DisplayMode displayMode = Display.getDisplayMode();
            a.fN("FSAA Samples: " + n2);
            try {
                Display.destroy();
                Display.setDisplayMode((DisplayMode)displayMode);
                Display.create((PixelFormat)new PixelFormat().withDepthBits(24).withSamples(n2));
                Display.setResizable((boolean)false);
                Display.setResizable((boolean)true);
            }
            catch (LWJGLException lWJGLException) {
                a.warn("Error setting FSAA: " + n2 + "x");
                lWJGLException.printStackTrace();
                try {
                    Display.setDisplayMode((DisplayMode)displayMode);
                    Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
                    Display.setResizable((boolean)false);
                    Display.setResizable((boolean)true);
                }
                catch (LWJGLException lWJGLException2) {
                    lWJGLException2.printStackTrace();
                    try {
                        Display.setDisplayMode((DisplayMode)displayMode);
                        Display.create();
                        Display.setResizable((boolean)false);
                        Display.setResizable((boolean)true);
                    }
                    catch (LWJGLException lWJGLException3) {
                        lWJGLException3.printStackTrace();
                    }
                }
            }
            if (!Minecraft.bgl && a.anQ() != null) {
                InputStream inputStream;
                InputStream inputStream2;
                block12: {
                    inputStream2 = null;
                    inputStream = null;
                    try {
                        inputStream2 = a.anQ().t(new cm("icons/icon_16x16.png"));
                        inputStream = a.anQ().t(new cm("icons/icon_32x32.png"));
                        if (inputStream2 == null || inputStream == null) break block12;
                        Display.setIcon((ByteBuffer[])new ByteBuffer[]{a.j(inputStream2), a.j(inputStream)});
                    }
                    catch (IOException iOException) {
                        try {
                            a.warn("Error setting window icon: " + iOException.getClass().getName() + ": " + iOException.getMessage());
                        }
                        catch (Throwable throwable) {
                            IOUtils.closeQuietly(inputStream2);
                            IOUtils.closeQuietly(inputStream);
                            throw throwable;
                        }
                        IOUtils.closeQuietly((InputStream)inputStream2);
                        IOUtils.closeQuietly((InputStream)inputStream);
                    }
                }
                IOUtils.closeQuietly((InputStream)inputStream2);
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
    }

    private static ByteBuffer j(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] nArray = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * nArray.length);
        for (int n2 : nArray) {
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static void aoS() {
        try {
            if (dob.Bk()) {
                if (dok) {
                    return;
                }
                dok = true;
                dol = false;
                DisplayMode displayMode = Display.getDisplayMode();
                Dimension dimension = a.aom();
                if (dimension == null) {
                    return;
                }
                if (displayMode.getWidth() == dimension.width && displayMode.getHeight() == dimension.height) {
                    return;
                }
                DisplayMode displayMode2 = a.a(dimension);
                if (displayMode2 == null) {
                    return;
                }
                Display.setDisplayMode((DisplayMode)displayMode2);
                a.dob.bgz = Display.getDisplayMode().getWidth();
                a.dob.bgA = Display.getDisplayMode().getHeight();
                if (a.dob.bgz <= 0) {
                    a.dob.bgz = 1;
                }
                if (a.dob.bgA <= 0) {
                    a.dob.bgA = 1;
                }
                if (a.dob.bgR != null) {
                    cz cz2 = new cz(dob);
                    int n2 = cz2.getScaledWidth();
                    int n3 = cz2.getScaledHeight();
                    a.dob.bgR.setWorldAndResolution(dob, n2, n3);
                }
                a.AQ();
                Display.setFullscreen((boolean)true);
                a.dob.aIY.QT();
                GlStateManager.JN();
            } else {
                if (dol) {
                    return;
                }
                dol = true;
                dok = false;
                a.dob.aIY.QT();
                Display.update();
                GlStateManager.JN();
                Display.setResizable((boolean)false);
                Display.setResizable((boolean)true);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            a.aIY.ciI = "Default";
            aIY.QQ();
        }
    }

    public static void AQ() {
        dob.Aw().ai(a.dob.bgz, a.dob.bgA);
        if (a.dob.bgT != null) {
            a.dob.bgT.L(a.dob.bgz, a.dob.bgA);
        }
        a.dob.bgS = new c(dob);
    }

    public static Object[] a(Object[] objectArray, Object object) {
        if (objectArray == null) {
            throw new NullPointerException("The given array is NULL");
        }
        int n2 = objectArray.length;
        int n3 = n2 + 1;
        Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n3);
        System.arraycopy(objectArray, 0, objectArray2, 0, n2);
        objectArray2[n2] = object;
        return objectArray2;
    }

    public static Object[] a(Object[] objectArray, Object object, int n2) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
        arrayList.add(n2, object);
        Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), arrayList.size());
        return arrayList.toArray(objectArray2);
    }

    public static Object[] a(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (objectArray2.length == 0) {
            return objectArray;
        }
        int n2 = objectArray.length;
        int n3 = n2 + objectArray2.length;
        Object[] objectArray3 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n3);
        System.arraycopy(objectArray, 0, objectArray3, 0, n2);
        System.arraycopy(objectArray2, 0, objectArray3, n2, objectArray2.length);
        return objectArray3;
    }

    public static Object[] b(Object[] objectArray, Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
        arrayList.remove(object);
        Object[] objectArray2 = a.a(arrayList, objectArray.getClass().getComponentType());
        return objectArray2;
    }

    public static Object[] a(Collection collection, Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + String.valueOf(clazz));
        }
        Object[] objectArray = (Object[])Array.newInstance(clazz, collection.size());
        return collection.toArray(objectArray);
    }

    public static boolean aoT() {
        return a.aIY.ciR;
    }

    public static void aoU() {
        int n2 = Minecraft.BI();
        String string = a.fT(a.dob.bhQ);
        int n3 = a.dob.bgG.KV();
        int n4 = a.dob.bgG.KW();
        int n5 = a.dob.bgG.KX();
        String string2 = n2 + "/" + a.aoV() + " fps, C: " + n3 + ", E: " + n4 + "+" + n5 + ", U: " + string;
        a.dob.fontRendererObj.a(string2, 2.0, 2.0, -2039584);
    }

    public static int aoV() {
        long l2;
        int n2;
        if (a.dob.bhQ == doq) {
            return dor;
        }
        doq = a.dob.bhQ;
        ax ax2 = dob.BJ();
        long[] lArray = ax2.ati();
        int n3 = ax2.ath();
        if (n3 == (n2 = ax2.atg())) {
            return dor;
        }
        int n4 = Minecraft.BI();
        if (n4 <= 0) {
            n4 = 1;
        }
        long l3 = l2 = (long)(1.0 / (double)n4 * 1.0E9);
        long l4 = 0L;
        int n5 = bt.aG(n3 - 1, lArray.length);
        while (n5 != n2 && (double)l4 < 1.0E9) {
            long l5 = lArray[n5];
            if (l5 > l3) {
                l3 = l5;
            }
            l4 += l5;
            n5 = bt.aG(n5 - 1, lArray.length);
        }
        double d2 = (double)l3 / 1.0E9;
        dor = (int)(1.0 / d2);
        return dor;
    }

    private static String fT(String string) {
        int n2 = string.indexOf(40);
        if (n2 < 0) {
            return "";
        }
        int n3 = string.indexOf(32, n2);
        return n3 < 0 ? "" : string.substring(n2 + 1, n3);
    }

    public static int aoW() {
        String string = System.getenv("ProgramFiles(X86)");
        return string != null ? 64 : 32;
    }

    public static int aoX() {
        String[] stringArray = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return 64;
        }
        return 32;
    }

    public static boolean aoY() {
        return dnR;
    }

    public static void cp(boolean bl2) {
        dnR = bl2;
    }

    public static boolean aoZ() {
        return false;
    }

    public static void X(String string, String string2) {
        e e2 = new e(a.dob.bgR, string, string2);
        dob.a(e2);
    }

    public static int[] b(int[] nArray, int n2) {
        return a.a(nArray, new int[]{n2});
    }

    public static int[] a(int[] nArray, int[] nArray2) {
        if (nArray != null && nArray2 != null) {
            int n2 = nArray.length;
            int n3 = n2 + nArray2.length;
            int[] nArray3 = new int[n3];
            System.arraycopy(nArray, 0, nArray3, 0, n2);
            System.arraycopy(nArray2, 0, nArray3, n2, nArray2.length);
            return nArray3;
        }
        throw new NullPointerException("The given array is NULL");
    }

    public static DynamicTexture a(DynamicTexture dynamicTexture) {
        try {
            cm cm2 = new cm("textures/gui/title/mojang.png");
            InputStream inputStream = a.u(cm2);
            if (inputStream == null) {
                return dynamicTexture;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            if (bufferedImage == null) {
                return dynamicTexture;
            }
            DynamicTexture dynamicTexture2 = new DynamicTexture(bufferedImage);
            return dynamicTexture2;
        }
        catch (Exception exception) {
            a.warn(exception.getClass().getName() + ": " + exception.getMessage());
            return dynamicTexture;
        }
    }

    public static void f(File file, String string) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] byArray = string.getBytes(StandardCharsets.US_ASCII);
        fileOutputStream.write(byArray);
        fileOutputStream.close();
    }

    public static TextureMap QB() {
        return a.AZ().Bu();
    }

    public static boolean apa() {
        return a.aIY.ciZ != 3;
    }

    public static boolean apb() {
        return a.aIY.ciZ == 1;
    }

    public static boolean apc() {
        return a.apa() && (!a.aoG() || ah.apc());
    }

    public static boolean apd() {
        return a.aIY.cja;
    }

    public static boolean ape() {
        return a.aIY.cjb;
    }

    public static int apf() {
        return a.aIY.cjd;
    }

    public static int[] a(Integer[] integerArray) {
        if (integerArray == null) {
            return null;
        }
        if (integerArray.length == 0) {
            return new int[0];
        }
        int[] nArray = new int[integerArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = integerArray[i2];
        }
        return nArray;
    }

    public static boolean apg() {
        return a.aIY.cij;
    }

    public static boolean aph() {
        return OpenGlHelper.Kv();
    }

    public static boolean api() {
        return a.aIY.cig;
    }

    public static boolean a(URI uRI) {
        try {
            Desktop.getDesktop().browse(uRI);
            return true;
        }
        catch (Exception exception) {
            a.warn("Error opening link: " + String.valueOf(uRI));
            a.warn(exception.getClass().getName() + ": " + exception.getMessage());
            return false;
        }
    }

    public static boolean apj() {
        return a.aIY.cjc;
    }

    public static String a(boolean[] blArray, String string) {
        if (blArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(blArray.length * 5);
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            boolean bl2 = blArray[i2];
            if (i2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(bl2);
        }
        return stringBuffer.toString();
    }

    public static boolean Bf() {
        return dob.Bg() != null && dob.Bf();
    }

    public static IntBuffer cF(int n2) {
        return GLAllocation.cE(n2 << 2).asIntBuffer();
    }

    public static String hi(int n2) {
        switch (n2) {
            case 0: {
                return "No error";
            }
            case 1280: {
                return "Invalid enum";
            }
            case 1281: {
                return "Invalid value";
            }
            case 1282: {
                return "Invalid operation";
            }
            case 1283: {
                return "Stack overflow";
            }
            case 1284: {
                return "Stack underflow";
            }
            case 1285: {
                return "Out of memory";
            }
            case 1286: {
                return "Invalid framebuffer operation";
            }
        }
        return "Unknown";
    }

    public static boolean e(Boolean bl2) {
        return bl2 != null && bl2 != false;
    }

    public static boolean apk() {
        return a.aoG() && !ah.aGT();
    }
}

