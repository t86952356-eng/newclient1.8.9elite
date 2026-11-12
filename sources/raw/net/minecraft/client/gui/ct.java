/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.Charsets
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import net.minecraft.client.audio.MusicTicker;
import net.minecraft.client.audio.MusicTicker$MusicType;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bp;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.z;
import net.minecraft.util.an;
import net.minecraft.util.cm;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ct
extends bp {
    private static final Logger btG = LogManager.getLogger();
    private static final cm btH = new cm("textures/gui/title/minecraft.png");
    private static final cm btI = new cm("textures/misc/vignette.png");
    private int btJ;
    private List<String> btK;
    private int btL;
    private final float btM = 0.5f;

    @Override
    public void updateScreen() {
        MusicTicker musicTicker = aER.AR();
        SoundHandler soundHandler = aER.Bx();
        if (this.btJ == 0) {
            musicTicker.Co();
            musicTicker.a(MusicTicker$MusicType.bis);
            soundHandler.CC();
        }
        soundHandler.jA();
        ++this.btJ;
        float f2 = (float)(this.btL + this.height + this.height + 24) / this.btM;
        if ((float)this.btJ > f2) {
            this.Gm();
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            this.Gm();
        }
    }

    private void Gm() {
        ct.aER.bgK.bkd.u(new z(aa.dbP));
        aER.a((bp)null);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }

    @Override
    public void initGui() {
        if (this.btK == null) {
            this.btK = Lists.newArrayList();
            try {
                Object object = "";
                String string = String.valueOf((Object)an.dwa) + String.valueOf((Object)an.dwc) + String.valueOf((Object)an.dvV) + String.valueOf((Object)an.dvW);
                int n2 = 274;
                InputStream inputStream = aER.Br().v(new cm("texts/end.txt")).getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                Random random = new Random(8124371L);
                while ((object = bufferedReader.readLine()) != null) {
                    object = ((String)object).replaceAll("PLAYERNAME", aER.Bl().bX());
                    while (((String)object).contains(string)) {
                        int n3 = ((String)object).indexOf(string);
                        String string2 = ((String)object).substring(0, n3);
                        String string3 = ((String)object).substring(n3 + string.length());
                        object = string2 + String.valueOf((Object)an.dwa) + String.valueOf((Object)an.dwc) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string3;
                    }
                    this.btK.addAll(ct.aER.fontRendererObj.m((String)object, 274));
                    this.btK.add("");
                }
                inputStream.close();
                for (int i2 = 0; i2 < 8; ++i2) {
                    this.btK.add("");
                }
                inputStream = aER.Br().v(new cm("texts/credits.txt")).getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                while ((object = bufferedReader.readLine()) != null) {
                    object = ((String)object).replaceAll("PLAYERNAME", aER.Bl().bX());
                    object = ((String)object).replaceAll("\t", "    ");
                    this.btK.addAll(ct.aER.fontRendererObj.m((String)object, 274));
                    this.btK.add("");
                }
                inputStream.close();
                this.btL = this.btK.size() * 12;
            }
            catch (Exception exception) {
                btG.error("Couldn't load credits", (Throwable)exception);
            }
        }
    }

    private void g(int n2, int n3, float f2) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        aER.Bq().a(b.optionsBackground);
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        int n4 = this.width;
        float f3 = 0.0f - ((float)this.btJ + f2) * 0.5f * this.btM;
        float f4 = (float)this.height - ((float)this.btJ + f2) * 0.5f * this.btM;
        float f5 = 0.015625f;
        float f6 = ((float)this.btJ + f2 - 0.0f) * 0.02f;
        float f7 = (float)(this.btL + this.height + this.height + 24) / this.btM;
        float f8 = (f7 - 20.0f - ((float)this.btJ + f2)) * 0.005f;
        if (f8 < f6) {
            f6 = f8;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        f6 *= f6;
        f6 = f6 * 96.0f / 255.0f;
        worldRenderer.F(0.0, this.height, zLevel).r(0.0, f3 * 0.015625f).g(f6, f6, f6, 1.0f).Lx();
        worldRenderer.F(n4, this.height, zLevel).r((float)n4 * 0.015625f, f3 * 0.015625f).g(f6, f6, f6, 1.0f).Lx();
        worldRenderer.F(n4, 0.0, zLevel).r((float)n4 * 0.015625f, f4 * 0.015625f).g(f6, f6, f6, 1.0f).Lx();
        worldRenderer.F(0.0, 0.0, zLevel).r(0.0, f4 * 0.015625f).g(f6, f6, f6, 1.0f).Lx();
        tessellator.pZ();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        int n4;
        this.g(n2, n3, f2);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        int n5 = 274;
        int n6 = this.width / 2 - 137;
        int n7 = this.height + 50;
        float f3 = -((float)this.btJ + f2) * this.btM;
        GlStateManager.JV();
        GlStateManager.j(0.0f, f3, 0.0f);
        aER.Bq().a(btH);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.drawTexturedModalRect((float)n6, n7, 0, 0, 155, 44);
        this.drawTexturedModalRect((float)(n6 + 155), n7, 0, 45, 155, 44);
        int n8 = n7 + 200;
        for (n4 = 0; n4 < this.btK.size(); ++n4) {
            float f4;
            if (n4 == this.btK.size() - 1 && (f4 = (float)n8 + f3 - (float)(this.height / 2 - 6)) < 0.0f) {
                GlStateManager.j(0.0f, -f4, 0.0f);
            }
            if ((float)n8 + f3 + 12.0f + 8.0f > 0.0f && (float)n8 + f3 < (float)this.height) {
                String string = this.btK.get(n4);
                if (string.startsWith("[C]")) {
                    this.fontRendererObj.b(string.substring(3), n6 + (274 - this.fontRendererObj.bQ(string.substring(3))) / 2, n8, 0xFFFFFF);
                } else {
                    this.fontRendererObj.aIG.setSeed((long)n4 * 4238972211L + (long)(this.btJ / 4));
                    this.fontRendererObj.b(string, n6, n8, 0xFFFFFF);
                }
            }
            n8 += 12;
        }
        GlStateManager.JW();
        aER.Bq().a(btI);
        GlStateManager.tQ();
        GlStateManager.P(0, 769);
        n4 = this.width;
        int n9 = this.height;
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(0.0, n9, zLevel).r(0.0, 1.0).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(n4, n9, zLevel).r(1.0, 1.0).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(n4, 0.0, zLevel).r(1.0, 0.0).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        worldRenderer.F(0.0, 0.0, zLevel).r(0.0, 0.0).g(1.0f, 1.0f, 1.0f, 1.0f).Lx();
        tessellator.pZ();
        GlStateManager.tR();
        super.drawScreen(n2, n3, f2);
    }
}

