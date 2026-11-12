/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.texture;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.az;
import net.optifine.reflect.g;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class TextureUtil {
    private static final Logger caa = LogManager.getLogger();
    private static final IntBuffer cab = GLAllocation.cF(0x400000);
    public static final DynamicTexture cac = new DynamicTexture(16, 16);
    public static final int[] cad = cac.NM();
    private static final int[] cae;
    private static final int[] caf;

    public static int OC() {
        return GlStateManager.JP();
    }

    public static void cO(int n2) {
        GlStateManager.cO(n2);
    }

    public static int a(int n2, BufferedImage bufferedImage) {
        return TextureUtil.a(n2, bufferedImage, false, false);
    }

    public static void a(int n2, int[] nArray, int n3, int n4) {
        TextureUtil.ap(n2);
        TextureUtil.a(0, nArray, n3, n4, 0, 0, false, false, false);
    }

    public static int[][] a(int n2, int n3, int[][] nArray) {
        int[][] nArrayArray = new int[n2 + 1][];
        nArrayArray[0] = nArray[0];
        if (n2 > 0) {
            int n4;
            boolean bl2 = false;
            for (n4 = 0; n4 < nArray[0].length; ++n4) {
                if (nArray[0][n4] >> 24 != 0) continue;
                bl2 = true;
                break;
            }
            for (n4 = 1; n4 <= n2; ++n4) {
                if (nArray[n4] != null) {
                    nArrayArray[n4] = nArray[n4];
                    continue;
                }
                int[] nArray2 = nArrayArray[n4 - 1];
                int[] nArray3 = new int[nArray2.length >> 2];
                int n5 = n3 >> n4;
                int n6 = nArray3.length / n5;
                int n7 = n5 << 1;
                for (int i2 = 0; i2 < n5; ++i2) {
                    for (int i3 = 0; i3 < n6; ++i3) {
                        int n8 = 2 * (i2 + i3 * n7);
                        nArray3[i2 + i3 * n5] = TextureUtil.b(nArray2[n8 + 0], nArray2[n8 + 1], nArray2[n8 + 0 + n7], nArray2[n8 + 1 + n7], bl2);
                    }
                }
                nArrayArray[n4] = nArray3;
            }
        }
        return nArrayArray;
    }

    private static int b(int n2, int n3, int n4, int n5, boolean bl2) {
        return az.H(n2, n3, n4, n5);
    }

    private static int c(int n2, int n3, int n4, int n5, int n6) {
        float f2 = (float)Math.pow((float)(n2 >> n6 & 0xFF) / 255.0f, 2.2);
        float f3 = (float)Math.pow((float)(n3 >> n6 & 0xFF) / 255.0f, 2.2);
        float f4 = (float)Math.pow((float)(n4 >> n6 & 0xFF) / 255.0f, 2.2);
        float f5 = (float)Math.pow((float)(n5 >> n6 & 0xFF) / 255.0f, 2.2);
        float f6 = (float)Math.pow((double)(f2 + f3 + f4 + f5) * 0.25, 0.45454545454545453);
        return (int)((double)f6 * 255.0);
    }

    public static void a(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            TextureUtil.a(i2, nArray2, n2 >> i2, n3 >> i2, n4 >> i2, n5 >> i2, bl2, bl3, nArray.length > 1);
        }
    }

    private static void a(int n2, int[] nArray, int n3, int n4, int n5, int n6, boolean bl2, boolean bl3, boolean bl4) {
        int n7;
        int n8 = 0x400000 / n3;
        TextureUtil.g(bl2, bl4);
        TextureUtil.av(bl3);
        for (int i2 = 0; i2 < n3 * n4; i2 += n3 * n7) {
            int n9 = i2 / n3;
            n7 = Math.min(n8, n4 - n9);
            int n10 = n3 * n7;
            TextureUtil.a(nArray, i2, n10);
            GL11.glTexSubImage2D((int)3553, (int)n2, (int)n5, (int)(n6 + n9), (int)n3, (int)n7, (int)32993, (int)33639, (IntBuffer)cab);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3) {
        TextureUtil.x(n2, bufferedImage.getWidth(), bufferedImage.getHeight());
        return TextureUtil.a(n2, bufferedImage, 0, 0, bl2, bl3);
    }

    public static void x(int n2, int n3, int n4) {
        TextureUtil.t(n2, 0, n3, n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void t(int n2, int n3, int n4, int n5) {
        Class clazz = TextureUtil.class;
        if (g.eqQ.aDA()) {
            clazz = g.eqQ.aDz();
        }
        Class clazz2 = clazz;
        synchronized (clazz2) {
            TextureUtil.cO(n2);
            TextureUtil.ap(n2);
        }
        if (n3 >= 0) {
            GL11.glTexParameteri((int)3553, (int)33085, (int)n3);
            GL11.glTexParameterf((int)3553, (int)33082, (float)0.0f);
            GL11.glTexParameterf((int)3553, (int)33083, (float)n3);
            GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
        }
        for (int i2 = 0; i2 <= n3; ++i2) {
            GL11.glTexImage2D((int)3553, (int)i2, (int)6408, (int)(n4 >> i2), (int)(n5 >> i2), (int)0, (int)32993, (int)33639, (ByteBuffer)null);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl2, boolean bl3) {
        TextureUtil.ap(n2);
        TextureUtil.a(bufferedImage, n3, n4, bl2, bl3);
        return n2;
    }

    private static void a(BufferedImage bufferedImage, int n2, int n3, boolean bl2, boolean bl3) {
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        int n6 = 0x400000 / n4;
        int[] nArray = caf;
        TextureUtil.aw(bl2);
        TextureUtil.av(bl3);
        for (int i2 = 0; i2 < n4 * n5; i2 += n4 * n6) {
            int n7 = i2 / n4;
            int n8 = Math.min(n6, n5 - n7);
            int n9 = n4 * n8;
            bufferedImage.getRGB(0, n7, n4, n8, nArray, 0, n4);
            TextureUtil.a(nArray, n9);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n2, (int)(n3 + n7), (int)n4, (int)n8, (int)32993, (int)33639, (IntBuffer)cab);
        }
    }

    public static void av(boolean bl2) {
        if (bl2) {
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
        } else {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        }
    }

    private static void aw(boolean bl2) {
        TextureUtil.g(bl2, false);
    }

    public static void g(boolean bl2, boolean bl3) {
        if (bl2) {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl3 ? 9987 : 9729));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        } else {
            int n2 = a.ane();
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl3 ? n2 : 9728));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        }
    }

    private static void a(int[] nArray, int n2) {
        TextureUtil.a(nArray, 0, n2);
    }

    private static void a(int[] nArray, int n2, int n3) {
        int[] nArray2 = nArray;
        if (Minecraft.getMinecraft().aIY.cgt) {
            nArray2 = TextureUtil.i(nArray);
        }
        cab.clear();
        cab.put(nArray2, n2, n3);
        cab.position(0).limit(n3);
    }

    static void ap(int n2) {
        GlStateManager.ap(n2);
    }

    public static int[] c(IResourceManager iResourceManager, cm cm2) {
        BufferedImage bufferedImage = TextureUtil.d(iResourceManager.v(cm2).getInputStream());
        if (bufferedImage == null) {
            return null;
        }
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] nArray = new int[n2 * n3];
        bufferedImage.getRGB(0, 0, n2, n3, nArray, 0, n2);
        return nArray;
    }

    public static BufferedImage d(InputStream inputStream) {
        BufferedImage bufferedImage;
        if (inputStream == null) {
            return null;
        }
        try {
            bufferedImage = ImageIO.read(inputStream);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return bufferedImage;
    }

    public static int[] i(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray2[i2] = TextureUtil.dM(nArray[i2]);
        }
        return nArray2;
    }

    public static int dM(int n2) {
        int n3 = n2 >> 24 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        int n7 = (n4 * 30 + n5 * 59 + n6 * 11) / 100;
        int n8 = (n4 * 30 + n5 * 70) / 100;
        int n9 = (n4 * 30 + n6 * 70) / 100;
        return n3 << 24 | n7 << 16 | n8 << 8 | n9;
    }

    public static void b(int[] nArray, int n2, int n3) {
        int[] nArray2 = new int[n2];
        int n4 = n3 / 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            System.arraycopy(nArray, i2 * n2, nArray2, 0, n2);
            System.arraycopy(nArray, (n3 - 1 - i2) * n2, nArray, i2 * n2, n2);
            System.arraycopy(nArray2, 0, nArray, (n3 - 1 - i2) * n2, n2);
        }
    }

    static {
        caf = new int[0x400000];
        int n2 = -16777216;
        int n3 = -524040;
        int[] nArray = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] nArray2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n4 = nArray.length;
        for (int i2 = 0; i2 < 16; ++i2) {
            System.arraycopy(i2 < n4 ? nArray : nArray2, 0, cad, 16 * i2, n4);
            System.arraycopy(i2 < n4 ? nArray2 : nArray, 0, cad, 16 * i2 + n4, n4);
        }
        cac.NL();
        cae = new int[4];
    }
}

