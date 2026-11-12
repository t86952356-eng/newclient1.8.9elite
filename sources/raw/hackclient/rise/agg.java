/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import hackclient.rise.agf;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.settings.a;
import net.minecraft.util.cm;
import net.optifine.render.f;
import net.optifine.s;
import net.optifine.util.l;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class agg
extends agf
implements IResourceManagerReloadListener {
    private static final cm[] aID = new cm[256];
    private final int[] aIE = new int[256];
    public static int aIF = 9;
    public Random aIG = new Random();
    private final byte[] aIH = new byte[65536];
    private final int[] aII = new int[32];
    private cm aIJ;
    private final TextureManager aIK;
    private float aIL;
    private float aIM;
    private boolean aIN;
    private boolean aIO;
    private float aIP;
    private float aIQ;
    private float aIR;
    private float apt;
    private int aIS;
    private boolean aIT;
    private boolean aIU;
    private boolean aIV;
    private boolean aIW;
    private boolean aIX;
    public a aIY;
    public cm aIZ;
    public float aJa = 1.0f;
    private final float[] aJb = new float[256];
    private boolean aJc = false;
    private final f aJd = new f();

    public agg(a a2, cm cm2, TextureManager textureManager, boolean bl2) {
        this.aIY = a2;
        this.aIZ = cm2;
        this.aIJ = cm2;
        this.aIK = textureManager;
        this.aIN = bl2;
        this.aIJ = l.R(this.aIZ);
        this.a(this.aIJ);
        for (int i2 = 0; i2 < 32; ++i2) {
            int n2 = (i2 >> 3 & 1) * 85;
            int n3 = (i2 >> 2 & 1) * 170 + n2;
            int n4 = (i2 >> 1 & 1) * 170 + n2;
            int n5 = (i2 & 1) * 170 + n2;
            if (i2 == 6) {
                n3 += 85;
            }
            if (a2.cgt) {
                int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
                int n7 = (n3 * 30 + n4 * 70) / 100;
                int n8 = (n3 * 30 + n5 * 70) / 100;
                n3 = n6;
                n4 = n7;
                n5 = n8;
            }
            if (i2 >= 16) {
                n3 /= 4;
                n4 /= 4;
                n5 /= 4;
            }
            this.aII[i2] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
        }
        this.tH();
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        this.aIJ = l.R(this.aIZ);
        for (int i2 = 0; i2 < aID.length; ++i2) {
            agg.aID[i2] = null;
        }
        this.tG();
        this.tH();
    }

    private void tG() {
        int n2;
        BufferedImage bufferedImage;
        try {
            bufferedImage = TextureUtil.d(this.b(this.aIJ));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        Properties properties = l.Q(this.aIJ);
        this.aJc = l.b(properties, "blend", false);
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = n3 / 16;
        int n6 = n4 / 16;
        float f2 = (float)n3 / 128.0f;
        float f3 = net.minecraft.src.a.F(f2, 1.0f, 2.0f);
        this.aJa = 1.0f / f3;
        float f4 = l.a(properties, "offsetBold", -1.0f);
        if (f4 >= 0.0f) {
            this.aJa = f4;
        }
        int[] nArray = new int[n3 * n4];
        bufferedImage.getRGB(0, 0, n3, n4, nArray, 0, n3);
        for (n2 = 0; n2 < 256; ++n2) {
            int n7 = n2 % 16;
            int n8 = n2 / 16;
            int n9 = 0;
            for (n9 = n5 - 1; n9 >= 0; --n9) {
                int n10 = n7 * n5 + n9;
                boolean bl2 = true;
                for (int i2 = 0; i2 < n6 && bl2; ++i2) {
                    int n11 = (n8 * n6 + i2) * n3;
                    int n12 = nArray[n10 + n11];
                    int n13 = n12 >> 24 & 0xFF;
                    if (n13 <= 16) continue;
                    bl2 = false;
                    break;
                }
                if (!bl2) break;
            }
            if (n2 == 65) {
                // empty if block
            }
            if (n2 == 32) {
                n9 = n5 <= 8 ? (int)(2.0f * f2) : (int)(1.5f * f2);
            }
            this.aJb[n2] = (float)(n9 + 1) / f2 + 1.0f;
        }
        l.a(properties, this.aJb);
        for (n2 = 0; n2 < this.aIE.length; ++n2) {
            this.aIE[n2] = Math.round(this.aJb[n2]);
        }
    }

    private void tH() {
        InputStream inputStream = null;
        try {
            inputStream = this.b(new cm("font/glyph_sizes.bin"));
            inputStream.read(this.aIH);
        }
        catch (IOException iOException) {
            try {
                throw new RuntimeException(iOException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    private float a(char c2, boolean bl2) {
        if (c2 != ' ' && c2 != '\u00a0') {
            int n2 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c2);
            return n2 != -1 && !this.aIN ? this.g(n2, bl2) : this.b(c2, bl2);
        }
        return !this.aIN ? this.aJb[c2] : 4.0f;
    }

    private float g(int n2, boolean bl2) {
        int n3 = n2 % 16 * 8;
        int n4 = n2 / 16 * 8;
        boolean bl3 = bl2;
        this.a(this.aIJ);
        float f2 = this.aJb[n2];
        float f3 = 7.99f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)((float)n3 / 128.0f), (float)((float)n4 / 128.0f));
        GL11.glVertex3f((float)(this.aIL + (float)bl3), (float)this.aIM, (float)0.0f);
        GL11.glTexCoord2f((float)((float)n3 / 128.0f), (float)(((float)n4 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.aIL - (float)bl3), (float)(this.aIM + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n3 + 7.99f - 1.0f) / 128.0f), (float)((float)n4 / 128.0f));
        GL11.glVertex3f((float)(this.aIL + 7.99f - 1.0f + (float)bl3), (float)this.aIM, (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n3 + 7.99f - 1.0f) / 128.0f), (float)(((float)n4 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.aIL + 7.99f - 1.0f - (float)bl3), (float)(this.aIM + 7.99f), (float)0.0f);
        GL11.glEnd();
        return f2;
    }

    private cm an(int n2) {
        if (aID[n2] == null) {
            agg.aID[n2] = new cm(String.format("textures/font/unicode_page_%02x.png", n2));
            agg.aID[n2] = l.R(aID[n2]);
        }
        return aID[n2];
    }

    private void ao(int n2) {
        this.a(this.an(n2));
    }

    private float b(char c2, boolean bl2) {
        if (this.aIH[c2] == 0) {
            return 0.0f;
        }
        int n2 = c2 / 256;
        this.ao(n2);
        int n3 = this.aIH[c2] >>> 4;
        int n4 = this.aIH[c2] & 0xF;
        float f2 = n3;
        float f3 = n4 + 1;
        float f4 = (float)(c2 % 16 * 16) + f2;
        float f5 = (c2 & 0xFF) / 16 * 16;
        float f6 = f3 - f2 - 0.02f;
        float f7 = bl2 ? 1.0f : 0.0f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)(f4 / 256.0f), (float)(f5 / 256.0f));
        GL11.glVertex3f((float)(this.aIL + f7), (float)this.aIM, (float)0.0f);
        GL11.glTexCoord2f((float)(f4 / 256.0f), (float)((f5 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.aIL - f7), (float)(this.aIM + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)((f4 + f6) / 256.0f), (float)(f5 / 256.0f));
        GL11.glVertex3f((float)(this.aIL + f6 / 2.0f + f7), (float)this.aIM, (float)0.0f);
        GL11.glTexCoord2f((float)((f4 + f6) / 256.0f), (float)((f5 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.aIL + f6 / 2.0f - f7), (float)(this.aIM + 7.99f), (float)0.0f);
        GL11.glEnd();
        return (f3 - f2) / 2.0f + 1.0f;
    }

    @Override
    public int b(String string, double d2, double d3, int n2) {
        return this.b(string, d2, d3, n2, true);
    }

    @Override
    public int a(String string, double d2, double d3, int n2) {
        return this.b(string, d2, d3, n2, false);
    }

    @Override
    public int b(String string, double d2, double d3, int n2, boolean bl2) {
        int n3;
        d3 -= 1.0;
        this.tL();
        if (this.aJc) {
            GlStateManager.b(this.aJd);
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
        }
        this.tI();
        if (bl2) {
            n3 = this.a(string, (float)d2 + 1.0f, (float)d3 + 1.0f, n2, true);
            n3 = Math.max(n3, this.a(string, (float)d2, (float)d3, n2, false));
        } else {
            n3 = this.a(string, (float)d2, (float)d3, n2, false);
        }
        if (this.aJc) {
            GlStateManager.c(this.aJd);
        }
        return n3;
    }

    private String bR(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private void tI() {
        this.aIT = false;
        this.aIU = false;
        this.aIV = false;
        this.aIW = false;
        this.aIX = false;
    }

    private void f(String string, boolean bl2) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n2;
            char c2 = string.charAt(i2);
            if (c2 == '\u00a7' && i2 + 1 < string.length()) {
                int n3 = "0123456789abcdefklmnor".indexOf(string.toLowerCase(Locale.ENGLISH).charAt(i2 + 1));
                if (n3 < 16) {
                    this.aIT = false;
                    this.aIU = false;
                    this.aIX = false;
                    this.aIW = false;
                    this.aIV = false;
                    if (n3 < 0) {
                        n3 = 15;
                    }
                    if (bl2) {
                        n3 += 16;
                    }
                    n2 = this.aII[n3];
                    if (net.minecraft.src.a.aow()) {
                        n2 = s.bB(n3, n2);
                    }
                    this.aIS = n2;
                    this.a((float)(n2 >> 16) / 255.0f, (float)(n2 >> 8 & 0xFF) / 255.0f, (float)(n2 & 0xFF) / 255.0f, this.apt);
                } else if (n3 == 17) {
                    this.aIU = true;
                } else if (n3 == 21) {
                    this.aIT = false;
                    this.aIU = false;
                    this.aIX = false;
                    this.aIW = false;
                    this.aIV = false;
                    this.a(this.aIP, this.aIQ, this.aIR, this.apt);
                }
                ++i2;
                continue;
            }
            float f2 = !this.aIN ? this.aJa : 0.5f;
            int n4 = n2 = (c2 == '\u0000' || this.aIN) && bl2 ? 1 : 0;
            if (n2 != 0) {
                this.aIL -= f2;
                this.aIM -= f2;
            }
            float f3 = this.a(c2, this.aIV);
            if (n2 != 0) {
                this.aIL += f2;
                this.aIM += f2;
            }
            if (this.aIU) {
                this.aIL += f2;
                if (n2 != 0) {
                    this.aIL -= f2;
                    this.aIM -= f2;
                }
                this.a(c2, this.aIV);
                this.aIL -= f2;
                if (n2 != 0) {
                    this.aIL += f2;
                    this.aIM += f2;
                }
                f3 += f2;
            }
            this.y(f3);
        }
    }

    protected void y(float f2) {
        if (this.aIW) {
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            GlStateManager.JO();
            worldRenderer.a(7, DefaultVertexFormats.cbE);
            int n2 = this.aIW ? -1 : 0;
            worldRenderer.F(this.aIL + (float)n2, this.aIM + (float)aIF, 0.0).Lx();
            worldRenderer.F(this.aIL + f2, this.aIM + (float)aIF, 0.0).Lx();
            worldRenderer.F(this.aIL + f2, this.aIM + (float)aIF - 1.0f, 0.0).Lx();
            worldRenderer.F(this.aIL + (float)n2, this.aIM + (float)aIF - 1.0f, 0.0).Lx();
            tessellator.pZ();
            GlStateManager.JN();
        }
        this.aIL += f2;
    }

    private int a(String string, int n2, int n3, int n4, int n5, boolean bl2) {
        if (this.aIO) {
            int n6 = this.bQ(this.bR(string));
            n2 = n2 + n4 - n6;
        }
        return this.a(string, (float)n2, (float)n3, n5, bl2);
    }

    private int a(String string, float f2, float f3, int n2, boolean bl2) {
        if (string == null) {
            return 0;
        }
        if (this.aIO) {
            string = this.bR(string);
        }
        if ((n2 & 0xFC000000) == 0) {
            n2 |= 0xFF000000;
        }
        if (bl2) {
            n2 = (n2 & 0xFCFCFC) >> 2 | n2 & 0xFF000000;
        }
        this.aIP = (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.aIQ = (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.aIR = (float)(n2 & 0xFF) / 255.0f;
        this.apt = (float)(n2 >> 24 & 0xFF) / 255.0f;
        this.a(this.aIP, this.aIQ, this.aIR, this.apt);
        this.aIL = f2;
        this.aIM = f3;
        this.f(string, bl2);
        return (int)this.aIL;
    }

    @Override
    public int bQ(String string) {
        if (string == null) {
            return 0;
        }
        float f2 = 0.0f;
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            float f3 = this.c(c2);
            if (f3 < 0.0f && i2 < string.length() - 1) {
                if ((c2 = string.charAt(++i2)) != 'l' && c2 != 'L') {
                    if (c2 == 'r' || c2 == 'R') {
                        bl2 = false;
                    }
                } else {
                    bl2 = true;
                }
                f3 = 0.0f;
            }
            f2 += f3;
            if (!bl2 || !(f3 > 0.0f)) continue;
            f2 += this.aIN ? 1.0f : this.aJa;
        }
        return Math.round(f2);
    }

    @Override
    public int c(String string, double d2, double d3, int n2) {
        return this.b(string, d2 - (double)(this.bQ(string) >> 1), d3, n2, false);
    }

    @Override
    public int d(String string, double d2, double d3, int n2) {
        return this.b(string, d2 - (double)this.bQ(string), d3, n2, false);
    }

    @Override
    public float tF() {
        return aIF;
    }

    @Override
    public void a(char c2, int n2, int n3, Color color) {
        this.b(String.valueOf(c2), n2, n3, color.getRGB());
    }

    public int b(char c2) {
        return Math.round(this.c(c2));
    }

    private float c(char c2) {
        if (c2 == '\u00a7') {
            return -1.0f;
        }
        if (c2 != ' ' && c2 != '\u00a0') {
            int n2 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c2);
            if (c2 > '\u0000' && n2 != -1 && !this.aIN) {
                return this.aJb[n2];
            }
            if (this.aIH[c2] != 0) {
                int n3 = this.aIH[c2] >>> 4;
                int n4 = this.aIH[c2] & 0xF;
                if (n4 > 7) {
                    n4 = 15;
                    n3 = 0;
                }
                return (++n4 - n3) / 2 + 1;
            }
            return 0.0f;
        }
        return this.aJb[32];
    }

    public String k(String string, int n2) {
        return this.a(string, n2, false);
    }

    public String a(String string, int n2, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        float f2 = 0.0f;
        int n3 = bl2 ? string.length() - 1 : 0;
        int n4 = bl2 ? -1 : 1;
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i2 = n3; i2 >= 0 && i2 < string.length() && f2 < (float)n2; i2 += n4) {
            char c2 = string.charAt(i2);
            float f3 = this.c(c2);
            if (bl3) {
                bl3 = false;
                if (c2 != 'l' && c2 != 'L') {
                    if (c2 == 'r' || c2 == 'R') {
                        bl4 = false;
                    }
                } else {
                    bl4 = true;
                }
            } else if (f3 < 0.0f) {
                bl3 = true;
            } else {
                f2 += f3;
                if (bl4) {
                    f2 += 1.0f;
                }
            }
            if (f2 > (float)n2) break;
            if (bl2) {
                stringBuilder.insert(0, c2);
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private String bS(String string) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public void a(String string, int n2, int n3, int n4, int n5) {
        if (this.aJc) {
            GlStateManager.b(this.aJd);
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
        }
        this.tI();
        this.aIS = n5;
        string = this.bS(string);
        this.a(string, n2, n3, n4, false);
        if (this.aJc) {
            GlStateManager.c(this.aJd);
        }
    }

    private void a(String string, int n2, int n3, int n4, boolean bl2) {
        for (String string2 : this.m(string, n4)) {
            this.a(string2, n2, n3, n4, this.aIS, bl2);
            n3 += aIF;
        }
    }

    public int l(String string, int n2) {
        return aIF * this.m(string, n2).size();
    }

    public void C(boolean bl2) {
        this.aIN = bl2;
    }

    public boolean tJ() {
        return this.aIN;
    }

    public void D(boolean bl2) {
        this.aIO = bl2;
    }

    public List<String> m(String string, int n2) {
        return Arrays.asList(this.n(string, n2).split("\n"));
    }

    String n(String string, int n2) {
        if (string.length() <= 1) {
            return string;
        }
        int n3 = this.o(string, n2);
        if (string.length() <= n3) {
            return string;
        }
        String string2 = string.substring(0, n3);
        char c2 = string.charAt(n3);
        boolean bl2 = c2 == ' ' || c2 == '\n';
        String string3 = agg.bT(string2) + string.substring(n3 + (bl2 ? 1 : 0));
        return string2 + "\n" + this.n(string3, n2);
    }

    private int o(String string, int n2) {
        int n3;
        int n4 = string.length();
        float f2 = 0.0f;
        int n5 = -1;
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            char c2 = string.charAt(n3);
            switch (c2) {
                case '\n': {
                    --n3;
                    break;
                }
                case ' ': {
                    n5 = n3;
                }
                default: {
                    f2 += (float)this.b(c2);
                    if (!bl2) break;
                    f2 += 1.0f;
                    break;
                }
                case '\u00a7': {
                    char c3;
                    if (n3 >= n4 - 1) break;
                    if ((c3 = string.charAt(++n3)) != 'l' && c3 != 'L') {
                        if (c3 != 'r' && c3 != 'R' && !agg.d(c3)) break;
                        bl2 = false;
                        break;
                    }
                    bl2 = true;
                }
            }
            if (c2 == '\n') {
                n5 = ++n3;
                break;
            }
            if (Math.round(f2) > n2) break;
        }
        return n3 != n4 && n5 != -1 && n5 < n3 ? n5 : n3;
    }

    private static boolean d(char c2) {
        return c2 >= '0' && c2 <= '9' || c2 >= 'a' && c2 <= 'f' || c2 >= 'A' && c2 <= 'F';
    }

    private static boolean e(char c2) {
        return c2 >= 'k' && c2 <= 'o' || c2 >= 'K' && c2 <= 'O' || c2 == 'r' || c2 == 'R';
    }

    public static String bT(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = -1;
        int n3 = string.length();
        while ((n2 = string.indexOf(167, n2 + 1)) != -1) {
            if (n2 >= n3 - 1) continue;
            char c2 = string.charAt(n2 + 1);
            if (agg.d(c2)) {
                stringBuilder = new StringBuilder("\u00a7" + c2);
                continue;
            }
            if (!agg.e(c2)) continue;
            stringBuilder.append("\u00a7").append(c2);
        }
        return stringBuilder.toString();
    }

    public boolean tK() {
        return this.aIO;
    }

    public int f(char c2) {
        int n2 = "0123456789abcdef".indexOf(c2);
        if (n2 >= 0 && n2 < this.aII.length) {
            int n3 = this.aII[n2];
            if (net.minecraft.src.a.aow()) {
                n3 = s.bB(n2, n3);
            }
            return n3;
        }
        return 0xFFFFFF;
    }

    protected void a(float f2, float f3, float f4, float f5) {
        GlStateManager.e(f2, f3, f4, f5);
    }

    protected void tL() {
        GlStateManager.tL();
    }

    protected void a(cm cm2) {
        this.aIK.a(cm2);
    }

    protected InputStream b(cm cm2) {
        return d.AZ().Br().v(cm2).getInputStream();
    }
}

