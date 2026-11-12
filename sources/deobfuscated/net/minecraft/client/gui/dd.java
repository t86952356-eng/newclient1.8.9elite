/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.gui;

import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import hackclient.rise.agg;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.de;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.an;
import net.minecraft.util.cm;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dd
implements aj {
    private static final Logger but = LogManager.getLogger();
    private static final ThreadPoolExecutor buu = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private static final cm buv = new cm("textures/misc/unknown_server.png");
    private static final cm buw = new cm("textures/gui/server_selection.png");
    private final aq bux;
    private final Minecraft buy;
    private final f buz;
    private final cm buA;
    private String buB;
    private DynamicTexture buC;
    private long buD;

    protected dd(aq aq2, f f2) {
        this.bux = aq2;
        this.buz = f2;
        this.buy = Minecraft.getMinecraft();
        this.buA = new cm("servers/" + f2.bDH + "/icon");
        this.buC = (DynamicTexture)this.buy.Bq().k(this.buA);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        Object object;
        int n9;
        if (!this.buz.bDN) {
            this.buz.bDN = true;
            this.buz.bDK = -2L;
            this.buz.bDJ = "";
            this.buz.bDI = "";
            buu.submit(new de(this));
        }
        boolean bl3 = this.buz.bDL > 47;
        boolean bl4 = this.buz.bDL < 47;
        boolean bl5 = bl3 || bl4;
        this.buy.fontRendererObj.a(this.buz.fc, (double)(n3 + 32 + 3), (double)(n4 + 1), 0xFFFFFF);
        List<String> list = this.buy.fontRendererObj.m(this.buz.bDJ, n5 - 32 - 2);
        for (int i2 = 0; i2 < Math.min(list.size(), 2); ++i2) {
            agg cfr_ignored_0 = this.buy.fontRendererObj;
            this.buy.fontRendererObj.a(list.get(i2), (double)(n3 + 32 + 3), (double)(n4 + 12 + agg.aIF * i2), 0x808080);
        }
        String string = bl5 ? String.valueOf((Object)an.dvP) + this.buz.bDM : this.buz.bDI;
        int n10 = this.buy.fontRendererObj.bQ(string);
        this.buy.fontRendererObj.a(string, (double)(n3 + n5 - n10 - 15 - 2), (double)(n4 + 1), 0x808080);
        int n11 = 0;
        String string2 = null;
        if (bl5) {
            n9 = 5;
            object = bl3 ? "Client out of date!" : "Server out of date!";
            string2 = this.buz.bDO;
        } else if (this.buz.bDN && this.buz.bDK != -2L) {
            n9 = this.buz.bDK < 0L ? 5 : (this.buz.bDK < 150L ? 0 : (this.buz.bDK < 300L ? 1 : (this.buz.bDK < 600L ? 2 : (this.buz.bDK < 1000L ? 3 : 4))));
            if (this.buz.bDK < 0L) {
                object = "(no connection)";
            } else {
                object = this.buz.bDK + "ms";
                string2 = this.buz.bDO;
            }
        } else {
            n11 = 1;
            n9 = (int)(Minecraft.Bj() / 100L + (long)n2 * 2L & 7L);
            if (n9 > 4) {
                n9 = 8 - n9;
            }
            object = "Pinging...";
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.buy.Bq().a(b.icons);
        b.drawModalRectWithCustomSizedTexture(n3 + n5 - 15, n4, n11 * 10, 176 + n9 * 8, 10.0f, 8.0f, 256.0f, 256.0f);
        if (this.buz.HF() != null && !this.buz.HF().equals(this.buB)) {
            this.buB = this.buz.HF();
            this.Gu();
            this.bux.EQ().HK();
        }
        if (this.buC != null) {
            this.b(n3, n4, this.buA);
        } else {
            this.b(n3, n4, buv);
        }
        int n12 = n7 - n3;
        int n13 = n8 - n4;
        if (n12 >= n5 - 15 && n12 <= n5 - 5 && n13 >= 0 && n13 <= 8) {
            this.bux.cN((String)object);
        } else if (n12 >= n5 - n10 - 15 - 2 && n12 <= n5 - 15 - 2 && n13 >= 0 && n13 <= 8) {
            this.bux.cN(string2);
        }
        if (this.buy.aIY.cgO || bl2) {
            this.buy.Bq().a(buw);
            b.drawRect(n3, n4, n3 + 32, n4 + 32, -1601138544);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            int n14 = n7 - n3;
            int n15 = n8 - n4;
            if (this.Gt()) {
                if (n14 < 32 && n14 > 16) {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 0.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                } else {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 0.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                }
            }
            if (this.bux.a(this, n2)) {
                if (n14 < 16 && n15 < 16) {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 96.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                } else {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 96.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                }
            }
            if (this.bux.b(this, n2)) {
                if (n14 < 16 && n15 > 16) {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 64.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                } else {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 64.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                }
            }
        }
    }

    protected void b(int n2, int n3, cm cm2) {
        this.buy.Bq().a(cm2);
        GlStateManager.tQ();
        b.drawModalRectWithCustomSizedTexture(n2, n3, 0.0f, 0.0f, 32.0f, 32.0f, 32.0f, 32.0f);
        GlStateManager.tR();
    }

    private boolean Gt() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Gu() {
        if (this.buz.HF() == null) {
            this.buy.Bq().l(this.buA);
            this.buC = null;
        } else {
            BufferedImage bufferedImage;
            block8: {
                ByteBuf byteBuf = Unpooled.copiedBuffer((CharSequence)this.buz.HF(), (Charset)Charsets.UTF_8);
                ByteBuf byteBuf2 = Base64.decode((ByteBuf)byteBuf);
                try {
                    bufferedImage = TextureUtil.d((InputStream)new ByteBufInputStream(byteBuf2));
                    Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                    Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                    break block8;
                }
                catch (Throwable throwable) {
                    but.error("Invalid icon for server " + this.buz.fc + " (" + this.buz.bDH + ")", throwable);
                    this.buz.dc(null);
                }
                finally {
                    byteBuf.release();
                    byteBuf2.release();
                }
                return;
            }
            if (this.buC == null) {
                this.buC = new DynamicTexture(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.buy.Bq().a(this.buA, (ITextureObject)this.buC);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.buC.NM(), 0, bufferedImage.getWidth());
            this.buC.NL();
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n6 <= 32) {
            if (n6 < 32 && n6 > 16 && this.Gt()) {
                this.bux.bC(n2);
                this.bux.EO();
                return true;
            }
            if (n6 < 16 && n7 < 16 && this.bux.a(this, n2)) {
                this.bux.a(this, n2, GuiScreen.isShiftKeyDown());
                return true;
            }
            if (n6 < 16 && n7 > 16 && this.bux.b(this, n2)) {
                this.bux.b(this, n2, GuiScreen.isShiftKeyDown());
                return true;
            }
        }
        this.bux.bC(n2);
        if (Minecraft.Bj() - this.buD < 250L) {
            this.bux.EO();
        }
        this.buD = Minecraft.Bj();
        return false;
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public f Gv() {
        return this.buz;
    }
}

