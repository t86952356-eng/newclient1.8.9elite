/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.Charsets
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
package net.minecraft.client.gui;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import hackclient.rise.aea;
import hackclient.rise.agg;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.gui.af;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.au;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.ce;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.gui.d;
import net.minecraft.client.gui.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.demo.b;
import net.minecraft.world.storage.o;
import net.optifine.aj;
import net.optifine.ak;
import net.optifine.reflect.g;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class am
extends bp
implements aea,
cv {
    private static final AtomicInteger boT = new AtomicInteger(0);
    private static final Logger boU = LogManager.getLogger();
    private static final Random boV = new Random();
    private final float boW;
    private String boX = "missingno";
    private c boY;
    private int boZ;
    private DynamicTexture bpa;
    private final boolean bpb = true;
    private final Object bpc = new Object();
    private String bpd;
    private String bpe = bpj;
    private String bpf;
    private static final cm bpg = new cm("texts/splashes.txt");
    private static final cm bph = new cm("textures/gui/title/minecraft.png");
    private static final cm[] bpi = new cm[]{new cm("textures/gui/title/background/panorama_0.png"), new cm("textures/gui/title/background/panorama_1.png"), new cm("textures/gui/title/background/panorama_2.png"), new cm("textures/gui/title/background/panorama_3.png"), new cm("textures/gui/title/background/panorama_4.png"), new cm("textures/gui/title/background/panorama_5.png")};
    public static final String bpj = "Please click " + String.valueOf((Object)an.dwf) + "here" + String.valueOf((Object)an.dwh) + " for more information.";
    private int bpk;
    private int bpl;
    private int bpm;
    private int bpn;
    private int bpo;
    private int bpp;
    private cm bpq;
    private final boolean bpr;
    private bp bps;
    private c bpt;
    private bp bpu;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public am() {
        this.bpr = false;
        BufferedReader bufferedReader = null;
        try {
            String string;
            ArrayList arrayList = Lists.newArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(net.minecraft.client.d.AZ().Br().v(bpg).getInputStream(), Charsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).isEmpty()) continue;
                arrayList.add(string);
            }
            if (!arrayList.isEmpty()) {
                do {
                    this.boX = (String)arrayList.get(boV.nextInt(arrayList.size()));
                } while (this.boX.hashCode() == 125780783);
            }
        }
        catch (IOException iOException) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        this.boW = boV.nextFloat();
        this.bpd = "";
        if (!GLContext.getCapabilities().OpenGL20 && !OpenGlHelper.Kr()) {
            this.bpd = I18n.a("title.oldgl1", new Object[0]);
            this.bpe = I18n.a("title.oldgl2", new Object[0]);
            this.bpf = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }

    private boolean EK() {
        return net.minecraft.client.d.AZ().aIY.b(net.minecraft.client.settings.c.ckr) && this.bps != null;
    }

    @Override
    public void updateScreen() {
        ++this.boZ;
        if (this.EK()) {
            this.bps.updateScreen();
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void keyTyped(char c2, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void initGui() {
        this.bpa = new DynamicTexture(256, 256);
        this.bpq = aER.Bq().a("background", this.bpa);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            this.boX = "Merry X-mas!";
        } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            this.boX = "Happy new year!";
        } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            this.boX = "OOoooOOOoooo! Spooky!";
        }
        int n2 = 24;
        int n3 = this.height / 4 + 48;
        if (aER.AT()) {
            this.v(n3, 24);
        } else {
            this.u(n3, 24);
        }
        this.buttonList.add(new c(0, this.width / 2 - 100, n3 + 72 + 12, 98, 20, I18n.a("menu.options", new Object[0])));
        this.buttonList.add(new c(4, this.width / 2 + 2, n3 + 72 + 12, 98, 20, I18n.a("menu.quit", new Object[0])));
        this.buttonList.add(new d(5, this.width / 2 - 124, n3 + 72 + 12));
        Object object = this.bpc;
        synchronized (object) {
            this.bpl = this.fontRendererObj.bQ(this.bpd);
            this.bpk = this.fontRendererObj.bQ(this.bpe);
            int n4 = Math.max(this.bpl, this.bpk);
            this.bpm = (this.width - n4) / 2;
            this.bpn = ((c)this.buttonList.get((int)0)).yPosition - 24;
            this.bpo = this.bpm + n4;
            this.bpp = this.bpn + 24;
        }
        aER.R(false);
        if (this.EK()) {
            this.bps.func_183500_a(this.width, this.height);
            this.bps.initGui();
        }
    }

    private void u(int n2, int n3) {
        this.buttonList.add(new c(1, this.width / 2 - 100, n2, I18n.a("menu.singleplayer", new Object[0])));
        this.buttonList.add(new c(2, this.width / 2 - 100, n2 + n3 * 1, I18n.a("menu.multiplayer", new Object[0])));
        if (g.epT.aDA()) {
            this.buttonList.add(new c(14, this.width / 2 + 2, n2 + n3 * 2, 98, 20, "Login"));
            this.bpt = new c(6, this.width / 2 - 100, n2 + n3 * 2, 98, 20, I18n.a("fml.menu.mods", new Object[0]));
            this.buttonList.add(this.bpt);
        } else {
            this.buttonList.add(new c(14, this.width / 2 - 100, n2 + n3 * 2, "Login"));
        }
    }

    private void v(int n2, int n3) {
        this.buttonList.add(new c(11, this.width / 2 - 100, n2, I18n.a("menu.playdemo", new Object[0])));
        this.boY = new c(12, this.width / 2 - 100, n2 + n3 * 1, I18n.a("menu.resetdemo", new Object[0]));
        this.buttonList.add(this.boY);
        net.minecraft.world.storage.c c2 = aER.AB();
        o o2 = c2.gK("Demo_World");
        if (o2 == null) {
            this.boY.enabled = false;
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 0) {
            aER.a(new au(this, am.aER.aIY));
        }
        if (c2.id == 5) {
            aER.a(new af(this, am.aER.aIY, aER.Bt()));
        }
        if (c2.id == 1) {
            aER.a(new ce(this));
        }
        if (c2.id == 2) {
            aER.a(new aq(this));
        }
        if (c2.id == 4) {
            aER.AJ();
        }
        if (c2.id == 6 && g.epT.aDA()) {
            aER.a((bp)g.b(g.epT, this));
        }
        if (c2.id == 11) {
            aER.a("Demo_World", "Demo_World", b.dKe);
        }
        if (c2.id == 12) {
            net.minecraft.world.storage.c c3 = aER.AB();
            o o2 = c3.gK("Demo_World");
            if (o2 != null) {
                cu cu2 = ce.a(this, o2.aln(), 12);
                aER.a(cu2);
            }
        }
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (bl2 && n2 == 12) {
            net.minecraft.world.storage.c c2 = aER.AB();
            c2.axV();
            c2.gM("Demo_World");
            aER.a(this);
        } else if (n2 == 13) {
            if (bl2) {
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI(this.bpf));
                }
                catch (Throwable throwable) {
                    boU.error("Couldn't open link", throwable);
                }
            }
            aER.a(this);
        }
    }

    private void d(int n2, int n3, float f2) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.cR(5889);
        GlStateManager.JV();
        GlStateManager.JU();
        Project.gluPerspective((float)120.0f, (float)1.0f, (float)0.05f, (float)10.0f);
        GlStateManager.cR(5888);
        GlStateManager.JV();
        GlStateManager.JU();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.d(180.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.JI();
        GlStateManager.an(false);
        GlStateManager.h(770, 771, 1, 0);
        int n4 = 8;
        int n5 = 64;
        ak ak2 = aj.aAS();
        if (ak2 != null) {
            n5 = ak2.aAV();
        }
        for (int i2 = 0; i2 < n5; ++i2) {
            GlStateManager.JV();
            float f3 = ((float)(i2 % 8) / 8.0f - 0.5f) / 64.0f;
            float f4 = ((float)(i2 / 8) / 8.0f - 0.5f) / 64.0f;
            float f5 = 0.0f;
            GlStateManager.j(f3, f4, 0.0f);
            GlStateManager.d(bt.bx(((float)this.boZ + f2) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(-((float)this.boZ + f2) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int i3 = 0; i3 < 6; ++i3) {
                GlStateManager.JV();
                if (i3 == 1) {
                    GlStateManager.d(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 2) {
                    GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 3) {
                    GlStateManager.d(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 4) {
                    GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i3 == 5) {
                    GlStateManager.d(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                cm[] cmArray = bpi;
                if (ak2 != null) {
                    cmArray = ak2.aAU();
                }
                aER.Bq().a(cmArray[i3]);
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                int n6 = 255 / (i2 + 1);
                float f6 = 0.0f;
                worldRenderer.F(-1.0, -1.0, 1.0).r(0.0, 0.0).s(255, 255, 255, n6).Lx();
                worldRenderer.F(1.0, -1.0, 1.0).r(1.0, 0.0).s(255, 255, 255, n6).Lx();
                worldRenderer.F(1.0, 1.0, 1.0).r(1.0, 1.0).s(255, 255, 255, n6).Lx();
                worldRenderer.F(-1.0, 1.0, 1.0).r(0.0, 1.0).s(255, 255, 255, n6).Lx();
                tessellator.pZ();
                GlStateManager.JW();
            }
            GlStateManager.JW();
            GlStateManager.a(true, true, true, false);
        }
        worldRenderer.G(0.0, 0.0, 0.0);
        GlStateManager.a(true, true, true, true);
        GlStateManager.cR(5889);
        GlStateManager.JW();
        GlStateManager.cR(5888);
        GlStateManager.JW();
        GlStateManager.an(true);
        GlStateManager.JH();
        GlStateManager.JE();
    }

    private void S(float f2) {
        aER.Bq().a(this.bpq);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)256, (int)256);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.a(true, true, true, false);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        GlStateManager.Jy();
        int n2 = 3;
        int n3 = 3;
        ak ak2 = aj.aAS();
        if (ak2 != null) {
            n3 = ak2.aAW();
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            float f3 = 1.0f / (float)(i2 + 1);
            int n4 = this.width;
            int n5 = this.height;
            float f4 = (float)(i2 - 1) / 256.0f;
            worldRenderer.F(n4, n5, zLevel).r(0.0f + f4, 1.0).g(1.0f, 1.0f, 1.0f, f3).Lx();
            worldRenderer.F(n4, 0.0, zLevel).r(1.0f + f4, 1.0).g(1.0f, 1.0f, 1.0f, f3).Lx();
            worldRenderer.F(0.0, 0.0, zLevel).r(1.0f + f4, 0.0).g(1.0f, 1.0f, 1.0f, f3).Lx();
            worldRenderer.F(0.0, n5, zLevel).r(0.0f + f4, 0.0).g(1.0f, 1.0f, 1.0f, f3).Lx();
        }
        tessellator.pZ();
        GlStateManager.tL();
        GlStateManager.a(true, true, true, true);
    }

    private void e(int n2, int n3, float f2) {
        aER.Aw().Ro();
        GlStateManager.i(0, 0, 256, 256);
        this.d(n2, n3, f2);
        this.S(f2);
        int n4 = 3;
        ak ak2 = aj.aAS();
        if (ak2 != null) {
            n4 = ak2.aAX();
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            this.S(f2);
            this.S(f2);
        }
        aER.Aw().az(true);
        GlStateManager.i(0, 0, am.aER.bgz, am.aER.bgA);
        float f3 = this.width > this.height ? 120.0f / (float)this.width : 120.0f / (float)this.height;
        float f4 = (float)this.height * f3 / 256.0f;
        float f5 = (float)this.width * f3 / 256.0f;
        int n5 = this.width;
        int n6 = this.height;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(0.0, n6, zLevel).r(0.5f - f4, 0.5f + f5).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(n5, n6, zLevel).r(0.5f - f4, 0.5f - f5).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(n5, 0.0, zLevel).r(0.5f + f4, 0.5f - f5).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(0.0, 0.0, zLevel).r(0.5f + f4, 0.5f + f5).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        tessellator.pZ();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        Object object;
        GlStateManager.Jy();
        this.e(n2, n3, f2);
        GlStateManager.tL();
        int n4 = 274;
        int n5 = this.width / 2 - 137;
        int n6 = 30;
        int n7 = -2130706433;
        int n8 = 0xFFFFFF;
        int n9 = 0;
        int n10 = Integer.MIN_VALUE;
        ak ak2 = aj.aAS();
        if (ak2 != null) {
            n7 = ak2.aAY();
            n8 = ak2.aAZ();
            n9 = ak2.aBa();
            n10 = ak2.aBb();
        }
        if (n7 != 0 || n8 != 0) {
            this.drawGradientRect(0, 0, this.width, this.height, n7, n8);
        }
        if (n9 != 0 || n10 != 0) {
            this.drawGradientRect(0, 0, this.width, this.height, n9, n10);
        }
        aER.Bq().a(bph);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        if ((double)this.boW < 1.0E-4) {
            this.drawTexturedModalRect((float)(n5 + 0), 30, 0, 0, 99, 44);
            this.drawTexturedModalRect((float)(n5 + 99), 30, 129, 0, 27, 44);
            this.drawTexturedModalRect((float)(n5 + 99 + 26), 30, 126, 0, 3, 44);
            this.drawTexturedModalRect((float)(n5 + 99 + 26 + 3), 30, 99, 0, 26, 44);
            this.drawTexturedModalRect((float)(n5 + 155), 30, 0, 45, 155, 44);
        } else {
            this.drawTexturedModalRect((float)(n5 + 0), 30, 0, 0, 155, 44);
            this.drawTexturedModalRect((float)(n5 + 155), 30, 0, 45, 155, 44);
        }
        GlStateManager.JV();
        GlStateManager.j(this.width / 2 + 90, 70.0f, 0.0f);
        GlStateManager.d(-20.0f, 0.0f, 0.0f, 1.0f);
        float f3 = 1.8f - bt.bz(bt.bx((float)(net.minecraft.client.d.Bj() % 1000L) / 1000.0f * (float)Math.PI * 2.0f) * 0.1f);
        f3 = f3 * 100.0f / (float)(this.fontRendererObj.bQ(this.boX) + 32);
        GlStateManager.i(f3, f3, f3);
        this.drawCenteredString(this.fontRendererObj, this.boX, 0, -8, -256);
        GlStateManager.JW();
        Object object2 = "Minecraft 1.8.9";
        if (aER.AT()) {
            object2 = (String)object2 + " Demo";
        }
        if (g.enZ.aDA()) {
            object = g.g(g.eoc, new Object[0]);
            List list = Lists.reverse((List)((List)g.g(object, g.enZ, true)));
            for (int i2 = 0; i2 < list.size(); ++i2) {
                String string = (String)list.get(i2);
                if (Strings.isNullOrEmpty((String)string)) continue;
                this.drawString(this.fontRendererObj, string, 2, this.height - (10 + i2 * (agg.aIF + 1)), 0xFFFFFF);
            }
            if (g.epn.aDA()) {
                g.g(g.epn, this, this.fontRendererObj, this.width, this.height);
            }
        } else {
            this.drawString(this.fontRendererObj, (String)object2, 2, this.height - 10, -1);
        }
        object = "Copyright Mojang AB. Do not distribute!";
        this.drawString(this.fontRendererObj, "Copyright Mojang AB. Do not distribute!", this.width - this.fontRendererObj.bQ("Copyright Mojang AB. Do not distribute!") - 2, this.height - 10, -1);
        if (this.bpd != null && this.bpd.length() > 0) {
            am.drawRect(this.bpm - 2, this.bpn - 2, this.bpo + 2, this.bpp - 1, 0x55200000);
            this.drawString(this.fontRendererObj, this.bpd, this.bpm, this.bpn, -1);
            this.drawString(this.fontRendererObj, this.bpe, (this.width - this.bpk) / 2, ((c)this.buttonList.get((int)0)).yPosition - 12, -1);
        }
        aiy.aQy.a(ajc.aQF, f2, null);
        super.drawScreen(n2, n3, f2);
        if (this.EK()) {
            this.bps.drawScreen(n2, n3, f2);
        }
        if (this.bpu != null) {
            this.bpu.drawScreen(n2, n3, f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        Object object = this.bpc;
        synchronized (object) {
            if (this.bpd.length() > 0 && n2 >= this.bpm && n2 <= this.bpo && n3 >= this.bpn && n3 <= this.bpp) {
                i i2 = new i((cv)this, this.bpf, 13, true);
                i2.Ea();
                aER.a(i2);
            }
        }
        if (this.EK()) {
            this.bps.mouseClicked(n2, n3, n4);
        }
    }

    @Override
    public void onGuiClosed() {
        if (this.bps != null) {
            this.bps.onGuiClosed();
        }
    }
}

