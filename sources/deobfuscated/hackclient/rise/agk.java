/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 */
package hackclient.rise;

import hackclient.rise.agh;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public final class agk {
    private static final Color aJF = new Color(255, 255, 255, 0);
    private static final int aJG = 4;
    private static final int aJH = 255;
    private final Font aJI;
    private final boolean aJJ;
    private final boolean aJK;
    private final ConcurrentHashMap<Integer, Float> aJL = new ConcurrentHashMap();
    private final ConcurrentHashMap<Integer, agh> aJM = new ConcurrentHashMap();

    public agk(Font font, boolean bl2, boolean bl3) {
        this.aJI = font;
        this.aJJ = bl2;
        this.aJK = bl3;
    }

    public float j(char c2) {
        char c3 = c2;
        return this.aJL.computeIfAbsent(Integer.valueOf(c3), n2 -> Float.valueOf(this.k(c2))).floatValue();
    }

    public void a(char c2, float f2, float f3) {
        char c3 = c2;
        agh agh2 = this.aJM.get(c3);
        if (agh2 == null) {
            agh2 = this.l(c2);
            if (agh2 == null) {
                return;
            }
            agh agh3 = this.aJM.putIfAbsent(Integer.valueOf(c3), agh2);
            if (agh3 != null) {
                agh2 = agh3;
            }
        }
        agh2.e(f2, f3);
    }

    private float k(char c2) {
        if (!this.aJI.canDisplay(c2)) {
            return 0.0f;
        }
        BufferedImage bufferedImage = new BufferedImage(1, 1, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(this.aJI);
        this.a(graphics2D);
        FontMetrics fontMetrics = graphics2D.getFontMetrics(this.aJI);
        Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c2), graphics2D);
        int n2 = bt.bM((float)rectangle2D.getWidth()) + 8;
        return Math.max(0.0f, (float)(n2 - 8));
    }

    private agh l(char c2) {
        if (!agk.tP()) {
            return null;
        }
        if (!this.aJI.canDisplay(c2)) {
            return null;
        }
        BufferedImage bufferedImage = new BufferedImage(1, 1, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(this.aJI);
        this.a(graphics2D);
        FontMetrics fontMetrics = graphics2D.getFontMetrics(this.aJI);
        Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c2), graphics2D);
        BufferedImage bufferedImage2 = new BufferedImage(bt.bM((float)rectangle2D.getWidth()) + 8, bt.bM((float)rectangle2D.getHeight()), 2);
        Graphics2D graphics2D2 = (Graphics2D)bufferedImage2.getGraphics();
        graphics2D2.setFont(this.aJI);
        this.a(graphics2D2);
        int n2 = bufferedImage2.getWidth();
        int n3 = bufferedImage2.getHeight();
        graphics2D2.setColor(aJF);
        graphics2D2.fillRect(0, 0, n2, n3);
        graphics2D2.setColor(Color.WHITE);
        graphics2D2.drawString(String.valueOf(c2), 4, this.aJI.getSize());
        int n4 = GL11.glGenTextures();
        this.a(n4, bufferedImage2, n2, n3);
        return new agh(n4, n2, n3);
    }

    private static boolean tP() {
        try {
            if (!Display.isCreated()) {
                return false;
            }
            GLContext.getCapabilities();
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private void a(Graphics2D graphics2D) {
        graphics2D.setColor(Color.WHITE);
        if (this.aJK) {
            graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.aJJ ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    private void a(int n2, BufferedImage bufferedImage, int n3, int n4) {
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
}

