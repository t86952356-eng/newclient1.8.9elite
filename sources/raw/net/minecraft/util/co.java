/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.util;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import net.minecraft.client.d;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.event.b;
import net.minecraft.src.a;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class co {
    private static final Logger dzP = LogManager.getLogger();
    private static final DateFormat dzQ = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer fN;
    public static int[] fO;

    public static ba a(File file, int n2, int n3, net.minecraft.client.shader.a a2) {
        return co.a(file, null, n2, n3, a2);
    }

    public static ba a(File file, String string, int n2, int n3, net.minecraft.client.shader.a a2) {
        try {
            boolean bl2;
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            d d2 = d.AZ();
            int n4 = a.aoH().chY;
            cz cz2 = new cz(d2);
            int n5 = cz2.getScaleFactor();
            int n6 = a.apf();
            boolean bl3 = bl2 = OpenGlHelper.Ky() && n6 > 1;
            if (bl2) {
                a.aoH().chY = n5 * n6;
                co.q(n2 * n6, n3 * n6);
                GlStateManager.JV();
                GlStateManager.cQ(16640);
                d2.Aw().az(true);
                d2.bgT.a(a.bWY, System.nanoTime());
            }
            if (OpenGlHelper.Ky()) {
                n2 = a2.cma;
                n3 = a2.cmb;
            }
            int n7 = n2 * n3;
            if (fN == null || fN.capacity() < n7) {
                fN = BufferUtils.createIntBuffer((int)n7);
                fO = new int[n7];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            fN.clear();
            if (OpenGlHelper.Ky()) {
                GlStateManager.ap(a2.cmg);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)fN);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)fN);
            }
            fN.get(fO);
            TextureUtil.b(fO, n2, n3);
            BufferedImage bufferedImage = null;
            if (OpenGlHelper.Ky()) {
                int n8;
                bufferedImage = new BufferedImage(a2.cmc, a2.cmd, 1);
                for (int i2 = n8 = a2.cmb - a2.cmd; i2 < a2.cmb; ++i2) {
                    for (int i3 = 0; i3 < a2.cmc; ++i3) {
                        bufferedImage.setRGB(i3, i2 - n8, fO[i2 * a2.cma + i3]);
                    }
                }
            } else {
                bufferedImage = new BufferedImage(n2, n3, 1);
                bufferedImage.setRGB(0, 0, n2, n3, fO, 0, n2);
            }
            if (bl2) {
                d2.Aw().Ro();
                GlStateManager.JW();
                a.aoH().chY = n4;
                co.q(n2, n3);
            }
            File file3 = string == null ? co.k(file2) : new File(file2, string);
            file3 = file3.getCanonicalFile();
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            s s2 = new s(file3.getName());
            s2.arp().a(new net.minecraft.event.a(b.cKJ, file3.getAbsolutePath()));
            s2.arp().i(true);
            return new t("screenshot.success", s2);
        }
        catch (Exception exception) {
            dzP.warn("Couldn't save screenshot", (Throwable)exception);
            return new t("screenshot.failure", exception.getMessage());
        }
    }

    private static File k(File file) {
        String string = dzQ.format(new Date());
        int n2 = 1;
        File file2;
        while ((file2 = new File(file, string + (String)(n2 == 1 ? "" : "_" + n2) + ".png")).exists()) {
            ++n2;
        }
        return file2;
    }

    private static void q(int n2, int n3) {
        d d2 = d.AZ();
        d2.bgz = Math.max(1, n2);
        d2.bgA = Math.max(1, n3);
        if (d2.bgR != null) {
            cz cz2 = new cz(d2);
            d2.bgR.onResize(d2, cz2.getScaledWidth(), cz2.getScaledHeight());
        }
        co.AQ();
    }

    private static void AQ() {
        d d2 = d.AZ();
        d2.Aw().ai(d2.bgz, d2.bgA);
        if (d2.bgT != null) {
            d2.bgT.L(d2.bgz, d2.bgA);
        }
    }
}

