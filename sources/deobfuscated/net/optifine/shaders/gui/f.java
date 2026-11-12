/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
package net.optifine.shaders.gui;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.optifine.aw;
import net.optifine.gui.n;
import net.optifine.gui.p;
import net.optifine.shaders.ah;
import net.optifine.shaders.ak;
import net.optifine.shaders.gui.a;
import net.optifine.shaders.gui.b;
import net.optifine.shaders.gui.e;
import net.optifine.shaders.gui.i;
import org.lwjgl.Sys;

public class f
extends GuiScreen {
    protected GuiScreen eIq;
    protected String blo = "Shaders";
    private final n eIr = new n(this, new p());
    private int eIs = -1;
    private i eIt;
    private boolean eIu = false;
    private static final float[] eIv = new float[]{0.5f, 0.70710677f, 1.0f, 1.4142135f, 2.0f};
    private static final String[] eIw = new String[]{"0.5x", "0.7x", "1x", "1.5x", "2x"};
    private static final float[] eIx = new float[]{0.0625f, 0.125f, 0.25f};
    private static final String[] eIy = new String[]{"0.5x", "1x", "2x"};
    public static final int eIz = 0;
    public static final int eIA = 1;
    public static final int eIB = 2;
    public static final int eIC = 3;
    public static final int eID = 4;

    public f(GuiScreen guiScreen, net.minecraft.client.settings.a a2) {
        this.eIq = guiScreen;
    }

    @Override
    public void initGui() {
        this.blo = I18n.a("of.options.shadersTitle", new Object[0]);
        if (ah.eCL == null) {
            ah.aEX();
        }
        int n2 = 120;
        int n3 = 20;
        int n4 = this.width - 120 - 10;
        int n5 = 30;
        int n6 = 20;
        int n7 = this.width - 120 - 20;
        this.eIt = new i(this, n7, this.height, 30, this.height - 50, 16);
        this.eIt.registerScrollButtons(7, 8);
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFE, n4, 30, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFF, n4, 50, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFG, n4, 70, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFH, n4, 90, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFI, n4, 110, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFJ, n4, 130, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFL, n4, 150, 120, 20));
        this.buttonList.add(new b(net.optifine.shaders.config.a.eFM, n4, 170, 120, 20));
        int n8 = Math.min(150, n7 / 2 - 10);
        int n9 = n7 / 4 - n8 / 2;
        int n10 = this.height - 25;
        this.buttonList.add(new c(201, n9, n10, n8 - 22 + 1, 20, aw.cf("of.options.shaders.shadersFolder")));
        this.buttonList.add(new a(210, n9 + n8 - 22 - 1, n10));
        this.buttonList.add(new c(202, n7 / 4 * 3 - n8 / 2, this.height - 25, n8, 20, I18n.a("gui.done", new Object[0])));
        this.buttonList.add(new c(203, n4, this.height - 25, 120, 20, aw.cf("of.options.shaders.shaderOptions")));
        this.FC();
    }

    public void FC() {
        boolean bl2 = net.minecraft.src.a.aoG();
        for (c c2 : this.buttonList) {
            if (c2.id == 201 || c2.id == 202 || c2.id == 210 || c2.id == net.optifine.shaders.config.a.eFE.ordinal()) continue;
            c2.enabled = bl2;
        }
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.eIt.handleMouseInput();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2 instanceof b) {
                b b2 = (b)c2;
                switch (b2.aIs()) {
                    case eFE: {
                        ah.aGC();
                        ah.aFx();
                        break;
                    }
                    case eFF: {
                        ah.eDe = !ah.eDe;
                        ah.aFx();
                        aER.Ba();
                        break;
                    }
                    case eFG: {
                        ah.eDf = !ah.eDf;
                        ah.aFx();
                        aER.Ba();
                        break;
                    }
                    case eFH: {
                        float f2 = ah.eCV;
                        float[] fArray = eIv;
                        String[] stringArray = eIw;
                        int n2 = f.a(f2, fArray);
                        if (f.isShiftKeyDown()) {
                            if (--n2 < 0) {
                                n2 = fArray.length - 1;
                            }
                        } else if (++n2 >= fArray.length) {
                            n2 = 0;
                        }
                        ah.eCV = fArray[n2];
                        ah.aFx();
                        ah.aFy();
                        break;
                    }
                    case eFI: {
                        float f3 = ah.eCW;
                        float[] fArray = eIv;
                        String[] stringArray = eIw;
                        int n3 = f.a(f3, fArray);
                        if (f.isShiftKeyDown()) {
                            if (--n3 < 0) {
                                n3 = fArray.length - 1;
                            }
                        } else if (++n3 >= fArray.length) {
                            n3 = 0;
                        }
                        ah.eCW = fArray[n3];
                        ah.aFx();
                        ah.aFz();
                        break;
                    }
                    case eFJ: {
                        float f4 = ah.eCU;
                        float[] fArray = eIx;
                        String[] stringArray = eIy;
                        int n4 = f.a(f4, fArray);
                        if (f.isShiftKeyDown()) {
                            if (--n4 < 0) {
                                n4 = fArray.length - 1;
                            }
                        } else if (++n4 >= fArray.length) {
                            n4 = 0;
                        }
                        ah.eCU = fArray[n4];
                        ah.aFx();
                        break;
                    }
                    case eFL: {
                        ah.eDh.aHs();
                        ah.aFx();
                        break;
                    }
                    case eFM: {
                        ah.eDg.aHs();
                        ah.aFi();
                        ah.aFx();
                        aER.Ba();
                        break;
                    }
                    case eFO: {
                        ah.eCS = !ah.eCS;
                        break;
                    }
                    case eFK: {
                        ah.eCT = !ah.eCT;
                        break;
                    }
                    case eFQ: {
                        ah.eCY = ah.eCZ = (ah.eCX = (ah.eCX + 1) % 3);
                        c2.displayString = "Tex Min: " + ah.eDl[ah.eCX];
                        ak.aHl();
                        break;
                    }
                    case eFU: {
                        ah.eDb = (ah.eDb + 1) % 2;
                        c2.displayString = "Tex_n Mag: " + ah.eDm[ah.eDb];
                        ak.aHl();
                        break;
                    }
                    case eFV: {
                        ah.eDc = (ah.eDc + 1) % 2;
                        c2.displayString = "Tex_s Mag: " + ah.eDm[ah.eDc];
                        ak.aHl();
                        break;
                    }
                    case eFP: {
                        ah.eDd = !ah.eDd;
                        c2.displayString = "ShadowClipFrustrum: " + f.cS(ah.eDd);
                        ak.aHl();
                    }
                }
                b2.aIt();
            } else {
                switch (c2.id) {
                    case 201: {
                        switch (f.aIz()) {
                            case 1: {
                                String string = String.format("cmd.exe /C start \"Open file\" \"%s\"", ah.eDw.getAbsolutePath());
                                try {
                                    Runtime.getRuntime().exec(string);
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                    break;
                                }
                            }
                            case 2: {
                                try {
                                    Runtime.getRuntime().exec(new String[]{"/usr/bin/open", ah.eDw.getAbsolutePath()});
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                            }
                        }
                        boolean bl2 = false;
                        try {
                            Class<?> clazz = Class.forName("java.awt.Desktop");
                            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                            Object[] objectArray = new Object[1];
                            objectArray[0] = new File(f.aER.bhf, "shaderpacks").toURI();
                            clazz.getMethod("browse", URI.class).invoke(object, objectArray);
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                            bl2 = true;
                        }
                        if (!bl2) break;
                        net.minecraft.src.a.fN("Opening via system class!");
                        Sys.openURL((String)("file://" + ah.eDw.getAbsolutePath()));
                        break;
                    }
                    case 202: {
                        ah.aEY();
                        this.eIu = true;
                        aER.a(this.eIq);
                        break;
                    }
                    case 203: {
                        e e2 = new e(this, net.minecraft.src.a.aoH());
                        net.minecraft.src.a.AZ().a(e2);
                        break;
                    }
                    case 210: {
                        try {
                            Class<?> clazz = Class.forName("java.awt.Desktop");
                            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                            clazz.getMethod("browse", URI.class).invoke(object, new URI("http://optifine.net/shaderPacks"));
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }
                    default: {
                        this.eIt.actionPerformed(c2);
                    }
                }
            }
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        if (!this.eIu) {
            ah.aEY();
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.eIt.drawScreen(n2, n3, f2);
        if (this.eIs <= 0) {
            this.eIt.aIA();
            this.eIs += 20;
        }
        this.drawCenteredString(this.fontRendererObj, this.blo + " ", this.width / 2, 15, 0xFFFFFF);
        String string = "OpenGL: " + ah.exR + ", " + ah.exS + ", " + ah.exT;
        int n4 = this.fontRendererObj.bQ(string);
        if (n4 < this.width - 5) {
            this.drawCenteredString(this.fontRendererObj, string, this.width / 2, this.height - 40, 0x808080);
        } else {
            this.drawString(this.fontRendererObj, string, 5, this.height - 40, 0x808080);
        }
        super.drawScreen(n2, n3, f2);
        this.eIr.b(n2, n3, this.buttonList);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        --this.eIs;
    }

    public Minecraft aIy() {
        return aER;
    }

    public void drawCenteredString(String string, int n2, int n3, int n4) {
        this.drawCenteredString(this.fontRendererObj, string, n2, n3, n4);
    }

    public static String cS(boolean bl2) {
        String string = aw.aBB();
        String string2 = aw.aBC();
        return bl2 ? string : string2;
    }

    public static String kn(int n2) {
        return n2 == 2 ? "FXAA 2x" : (n2 == 4 ? "FXAA 4x" : aw.aBC());
    }

    public static String a(float f2, float[] fArray, String[] stringArray) {
        int n2 = f.a(f2, fArray);
        return stringArray[n2];
    }

    public static int a(float f2, float[] fArray) {
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            float f3 = fArray[i2];
            if (!(f3 >= f2)) continue;
            return i2;
        }
        return fArray.length - 1;
    }

    public static String cl(float f2) {
        return f.a(f2, eIv, eIw);
    }

    public static String cm(float f2) {
        return f.a(f2, eIx, eIy);
    }

    public static int aIz() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? 1 : (string.contains("mac") ? 2 : (string.contains("solaris") ? 3 : (string.contains("sunos") ? 3 : (string.contains("linux") ? 4 : (string.contains("unix") ? 4 : 0)))));
    }
}

