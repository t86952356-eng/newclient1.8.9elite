/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.agf;
import hackclient.rise.agh;
import hackclient.rise.agk;
import hackclient.rise.ais;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class agi
extends agf {
    private static final String aJh = "ABCDEFGHOKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String aJi = "0123456789abcdefklmnor";
    private static final Color aJj = new Color(255, 255, 255, 0);
    private static final float aJk = 0.5f;
    private static final float aJl = 2.0f;
    private static final char aJm = '\u00a7';
    private static final int[] aJn = new int[32];
    private static final int aJo = 256;
    private static final int aJp = 65535;
    private static final int aJq = 4;
    private static final int aJr = 255;
    private final Font aJs;
    private final boolean aJt;
    private final float aJu;
    private final agh[] aJv = new agh[256];
    private final agh[] aJw = new agh[65535];
    private final agh[] aJx = new agh[256];
    private boolean aJy = true;
    private boolean aJz = false;
    private agk aJA;
    private agk aJB;
    private agk aJC;
    private agk aJD;

    public void a(agk agk2) {
        this.aJA = agk2;
    }

    public void b(agk agk2) {
        this.aJB = agk2;
    }

    public void c(agk agk2) {
        this.aJC = agk2;
    }

    public void d(agk agk2) {
        this.aJD = agk2;
    }

    public agi(Font font, boolean bl2, boolean bl3, boolean bl4) {
        agi.tO();
        this.aJy = bl3;
        this.aJs = font;
        this.aJt = bl2;
        this.aJu = (float)(font.getStringBounds(aJh, new FontRenderContext(new AffineTransform(), bl3, bl2)).getHeight() / 2.0);
        this.a(this.aJv, 0);
        this.a(this.aJx, 1);
        this.aJz = bl4;
        if (this.aJz) {
            this.a(this.aJw, 0);
        }
    }

    public agi(Font font, boolean bl2, boolean bl3) {
        agi.tO();
        this.aJy = bl3;
        this.aJs = font;
        this.aJt = bl2;
        this.aJu = (float)(font.getStringBounds(aJh, new FontRenderContext(new AffineTransform(), bl3, bl2)).getHeight() / 2.0);
        this.a(this.aJv, 0);
        this.a(this.aJx, 1);
    }

    public agi(Font font, boolean bl2) {
        agi.tO();
        this.aJs = font;
        this.aJt = bl2;
        this.aJu = (float)(font.getStringBounds(aJh, new FontRenderContext(new AffineTransform(), true, bl2)).getHeight() / 2.0);
        this.a(this.aJv, 0);
        this.a(this.aJx, 1);
    }

    public static void tO() {
        for (int i2 = 0; i2 < 32; ++i2) {
            int n2 = (i2 >> 3 & 1) * 85;
            int n3 = (i2 >> 2 & 1) * 170 + n2;
            int n4 = (i2 >> 1 & 1) * 170 + n2;
            int n5 = (i2 & 1) * 170 + n2;
            if (i2 == 6) {
                n3 += 85;
            }
            if (i2 >= 16) {
                n3 /= 4;
                n4 /= 4;
                n5 /= 4;
            }
            agi.aJn[i2] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
        }
    }

    public void a(agh[] aghArray, int n2) {
        Font font = this.aJs.deriveFont(n2);
        BufferedImage bufferedImage = new BufferedImage(1, 1, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        FontMetrics fontMetrics = graphics2D.getFontMetrics(font);
        for (int i2 = 0; i2 < aghArray.length; ++i2) {
            char c2 = (char)i2;
            Rectangle2D rectangle2D = fontMetrics.getStringBounds("" + c2, graphics2D);
            BufferedImage bufferedImage2 = new BufferedImage(bt.bM((float)rectangle2D.getWidth()) + 8, bt.bM((float)rectangle2D.getHeight()), 2);
            Graphics2D graphics2D2 = (Graphics2D)bufferedImage2.getGraphics();
            graphics2D2.setFont(font);
            int n3 = bufferedImage2.getWidth();
            int n4 = bufferedImage2.getHeight();
            graphics2D2.setColor(aJj);
            graphics2D2.fillRect(0, 0, n3, n4);
            this.a(graphics2D2);
            graphics2D2.drawString("" + c2, 4, font.getSize());
            int n5 = GL11.glGenTextures();
            this.a(n5, bufferedImage2, n3, n4);
            aghArray[i2] = new agh(n5, n3, n4);
        }
    }

    public void a(Graphics2D graphics2D) {
        graphics2D.setColor(Color.WHITE);
        if (this.aJy) {
            graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.aJt ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    public void a(int n2, BufferedImage bufferedImage, int n3, int n4) {
        int[] nArray = bufferedImage.getRGB(0, 0, n3, n4, new int[n3 * n4], 0, n3);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(n3 * n4 * 4));
        for (int i2 = 0; i2 < n4; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                int n5 = nArray[i3 + i2 * n3];
                byteBuffer.put((byte)(n5 >> 16 & 0xFF));
                byteBuffer.put((byte)(n5 >> 8 & 0xFF));
                byteBuffer.put((byte)(n5 & 0xFF));
                byteBuffer.put((byte)(n5 >> 24 & 0xFF));
            }
        }
        byteBuffer.flip();
        GlStateManager.ap(n2);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n3, (int)n4, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
    }

    @Override
    public int a(String string, double d2, double d3, int n2) {
        return this.b(string, d2, d3, n2, false);
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
    public int b(String string, double d2, double d3, int n2) {
        return this.b(string, d2, d3, n2, false);
    }

    public void a(String string, float f2, float f3, int n2) {
        this.b(string, f2 - (float)(this.bQ(string) >> 1), f3, n2, false);
    }

    @Override
    public int b(String string, double d2, double d3, int n2, boolean bl2) {
        if (string == null) {
            return 0;
        }
        if (agi.bU(string)) {
            return d.AZ().fontRendererObj.b(string, d2, d3, n2, bl2);
        }
        agh[] aghArray = this.aJz ? this.aJw : this.aJv;
        double d4 = d2;
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)1048575);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        d2 -= 2.0;
        d3 -= 2.0;
        d3 *= 2.0;
        d3 -= (double)(this.aJu / 5.0f);
        double d5 = d2 *= 2.0;
        ais.aA(bl2 ? Color.white.getRGB() : n2);
        string = string.replaceAll("\u00a7l", "");
        try {
            char[] cArray = string.toCharArray();
            int n3 = (int)(this.tF() * 2.0f);
            int n4 = 8;
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                char c2;
                char c3 = cArray[i2];
                if (c3 == '\n') {
                    d2 = d5;
                    d3 += (double)n3;
                    continue;
                }
                if (c3 == '\u00a7' && i2 + 1 < cArray.length) {
                    if ((c2 = aJi.indexOf(cArray[++i2])) < '\u0000' || c2 >= aJn.length) continue;
                    ais.d(new Color(aJn[c2]));
                    continue;
                }
                c2 = c3;
                if (c2 < '\u0000' || c2 >= aghArray.length) {
                    if (this.aJA != null && agi.g(c3)) {
                        this.aJA.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJA.j(c3);
                        continue;
                    }
                    if (this.aJC != null && agi.h(c3)) {
                        this.aJC.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJC.j(c3);
                        continue;
                    }
                    if (this.aJD != null && agi.i(c3)) {
                        this.aJD.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJD.j(c3);
                        continue;
                    }
                    if (this.aJB == null) continue;
                    this.aJB.a(c3, (float)d2, (float)d3);
                    d2 += (double)this.aJB.j(c3);
                    continue;
                }
                agh agh2 = aghArray[c2];
                if (agh2 == null) {
                    if (this.aJA != null && agi.g(c3)) {
                        this.aJA.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJA.j(c3);
                        continue;
                    }
                    if (this.aJC != null && agi.h(c3)) {
                        this.aJC.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJC.j(c3);
                        continue;
                    }
                    if (this.aJD != null && agi.i(c3)) {
                        this.aJD.a(c3, (float)d2, (float)d3);
                        d2 += (double)this.aJD.j(c3);
                        continue;
                    }
                    if (this.aJB == null) continue;
                    this.aJB.a(c3, (float)d2, (float)d3);
                    d2 += (double)this.aJB.j(c3);
                    continue;
                }
                float f2 = agh2.tN();
                agh2.e((float)d2, (float)d3);
                d2 += (double)(f2 - 8.0f);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        GL11.glDisable((int)3042);
        GL11.glDisable((int)3553);
        GlStateManager.ap(0);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
        return (int)(d2 - d4);
    }

    @Override
    public void a(char c2, int n2, int n3, Color color) {
        agh[] aghArray;
        agh[] aghArray2 = aghArray = this.aJz ? this.aJw : this.aJv;
        if (c2 >= aghArray.length || aghArray[c2] == null) {
            return;
        }
        agh agh2 = aghArray[c2];
        GlStateManager.e((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        agh2.e(n2, n3);
    }

    @Override
    public int bQ(String string) {
        if (agi.bU(string = string.replaceAll("\u00a7l", ""))) {
            return d.AZ().fontRendererObj.bQ(string);
        }
        agh[] aghArray = this.aJz ? this.aJw : this.aJv;
        int n2 = string.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\u00a7') {
                ++i2;
                continue;
            }
            char c3 = c2;
            if (c3 < '\u0000' || c3 >= aghArray.length) {
                if (this.aJA != null && agi.g(c2)) {
                    n3 = (int)((float)n3 + this.aJA.j(c2));
                    continue;
                }
                if (this.aJC != null && agi.h(c2)) {
                    n3 = (int)((float)n3 + this.aJC.j(c2));
                    continue;
                }
                if (this.aJD != null && agi.i(c2)) {
                    n3 = (int)((float)n3 + this.aJD.j(c2));
                    continue;
                }
                if (this.aJB == null) continue;
                n3 = (int)((float)n3 + this.aJB.j(c2));
                continue;
            }
            agh agh2 = aghArray[c3];
            if (agh2 == null) {
                if (this.aJA != null && agi.g(c2)) {
                    n3 = (int)((float)n3 + this.aJA.j(c2));
                    continue;
                }
                if (this.aJC != null && agi.h(c2)) {
                    n3 = (int)((float)n3 + this.aJC.j(c2));
                    continue;
                }
                if (this.aJD != null && agi.i(c2)) {
                    n3 = (int)((float)n3 + this.aJD.j(c2));
                    continue;
                }
                if (this.aJB == null) continue;
                n3 = (int)((float)n3 + this.aJB.j(c2));
                continue;
            }
            n3 = (int)((float)n3 + (agh2.tN() - 8.0f));
        }
        return n3 / 2;
    }

    @Override
    public float tF() {
        return this.aJu;
    }

    private static boolean g(char c2) {
        char c3 = c2;
        if (Character.UnicodeScript.of(c3) == Character.UnicodeScript.HAN) {
            return true;
        }
        if (c3 >= '\u3000' && c3 <= '\u303f') {
            return true;
        }
        if (c3 >= '\uff00' && c3 <= '\uffef') {
            return true;
        }
        return c3 == '\u2022' || c3 == '\u00b7' || c3 == '\u2026' || c3 == '\u2013' || c3 == '\u2014' || c3 >= '\u2018' && c3 <= '\u201f';
    }

    private static boolean h(char c2) {
        char c3 = c2;
        if (c3 >= '\u3040' && c3 <= '\u309f') {
            return true;
        }
        if (c3 >= '\u30a0' && c3 <= '\u30ff') {
            return true;
        }
        if (c3 >= '\u31f0' && c3 <= '\u31ff') {
            return true;
        }
        return c3 >= '\uff65' && c3 <= '\uff9f';
    }

    private static boolean i(char c2) {
        char c3 = c2;
        if (c3 >= '\u1100' && c3 <= '\u11ff') {
            return true;
        }
        if (c3 >= '\u3130' && c3 <= '\u318f') {
            return true;
        }
        if (c3 >= '\uac00' && c3 <= '\ud7af') {
            return true;
        }
        if (c3 >= '\ua960' && c3 <= '\ua97f') {
            return true;
        }
        return c3 >= '\ud7b0' && c3 <= '\ud7ff';
    }

    private static boolean bU(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(string.codePointAt(i2))) {
            Character.UnicodeScript unicodeScript;
            int n2 = string.codePointAt(i2);
            if (n2 <= 127 || agi.g((char)n2) || agi.h((char)n2) || agi.i((char)n2) || (unicodeScript = Character.UnicodeScript.of(n2)) == Character.UnicodeScript.CYRILLIC || unicodeScript == Character.UnicodeScript.LATIN || unicodeScript == Character.UnicodeScript.COMMON || unicodeScript == Character.UnicodeScript.INHERITED) continue;
            return true;
        }
        return false;
    }
}

