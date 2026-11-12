/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package net.optifine.shaders;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.client.renderer.texture.Stitcher;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;
import net.optifine.shaders.r;
import net.optifine.shaders.w;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class ak {
    public static final int eFq = 0x100000;
    public static ByteBuffer bPP = BufferUtils.createByteBuffer((int)0x400000);
    public static IntBuffer eFr = bPP.asIntBuffer();
    public static int[] cYx = new int[0x100000];
    public static final int eFs = 0;
    public static final int eFt = -8421377;
    public static final int eFu = 0;
    public static Map<Integer, r> eFv = new HashMap<Integer, r>();
    public static TextureMap eFw = null;
    public static TextureAtlasSprite eFx = null;
    public static r eFy = null;
    public static r eFz = null;
    public static int eFA = 0;
    public static String bYQ = null;
    public static IResourceManager eFB = null;

    public static IntBuffer kh(int n2) {
        if (eFr.capacity() < n2) {
            int n3 = ak.kj(n2);
            bPP = BufferUtils.createByteBuffer((int)(n3 * 4));
            eFr = bPP.asIntBuffer();
        }
        return eFr;
    }

    public static int[] ki(int n2) {
        if (cYx == null) {
            cYx = new int[0x100000];
        }
        if (cYx.length < n2) {
            cYx = new int[ak.kj(n2)];
        }
        return cYx;
    }

    public static int kj(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    public static int gN(int n2) {
        int n3 = 0;
        if ((n2 & 0xFFFF0000) != 0) {
            n3 += 16;
            n2 >>= 16;
        }
        if ((n2 & 0xFF00) != 0) {
            n3 += 8;
            n2 >>= 8;
        }
        if ((n2 & 0xF0) != 0) {
            n3 += 4;
            n2 >>= 4;
        }
        if ((n2 & 6) != 0) {
            n3 += 2;
            n2 >>= 2;
        }
        if ((n2 & 2) != 0) {
            ++n3;
        }
        return n3;
    }

    public static IntBuffer bO(int n2, int n3) {
        int[] nArray = ak.ki(n2);
        IntBuffer intBuffer = ak.kh(n2);
        Arrays.fill(cYx, 0, n2, n3);
        eFr.put(cYx, 0, n2);
        return eFr;
    }

    public static int[] kk(int n2) {
        int[] nArray = new int[n2 * 3];
        Arrays.fill(nArray, 0, n2, 0);
        Arrays.fill(nArray, n2, n2 * 2, -8421377);
        Arrays.fill(nArray, n2 * 2, n2 * 3, 0);
        return nArray;
    }

    public static int[] bP(int n2, int n3) {
        int[] nArray = new int[n2 * 3];
        Arrays.fill(nArray, 0, n2, n3);
        Arrays.fill(nArray, n2, n2 * 2, -8421377);
        Arrays.fill(nArray, n2 * 2, n2 * 3, 0);
        return nArray;
    }

    public static r a(AbstractTexture abstractTexture) {
        r r2 = abstractTexture.bYi;
        if (r2 == null) {
            int n2 = abstractTexture.Ll();
            r2 = eFv.get(n2);
            if (r2 == null) {
                r2 = new r(n2, GL11.glGenTextures(), GL11.glGenTextures());
                eFv.put(n2, r2);
            }
            abstractTexture.bYi = r2;
        }
        return r2;
    }

    public static void a(AbstractTexture abstractTexture, int n2) {
        r r2 = abstractTexture.bYi;
        if (r2 != null) {
            abstractTexture.bYi = null;
            eFv.remove(r2.qN);
            GlStateManager.cO(r2.evw);
            GlStateManager.cO(r2.evx);
            if (r2.qN != n2) {
                w.iH("Error : MultiTexID.base mismatch: " + r2.qN + ", texid: " + n2);
                GlStateManager.cO(r2.qN);
            }
        }
    }

    public static void bQ(int n2, int n3) {
        if (ah.eya && GlStateManager.Ka() == 33984) {
            GlStateManager.cN(33986);
            GlStateManager.ap(n2);
            GlStateManager.cN(33987);
            GlStateManager.ap(n3);
            GlStateManager.cN(33984);
        }
    }

    public static void a(r r2) {
        ak.bQ(r2.evw, r2.evx);
    }

    public static void am(int n2, int n3, int n4) {
        if (ah.eya && GlStateManager.Ka() == 33984) {
            GlStateManager.cN(33986);
            GlStateManager.ap(n3);
            GlStateManager.cN(33987);
            GlStateManager.ap(n4);
            GlStateManager.cN(33984);
        }
        GlStateManager.ap(n2);
    }

    public static void b(r r2) {
        eFz = r2;
        if (ah.eya && GlStateManager.Ka() == 33984) {
            if (ah.eDe) {
                GlStateManager.cN(33986);
                GlStateManager.ap(r2.evw);
            }
            if (ah.eDf) {
                GlStateManager.cN(33987);
                GlStateManager.ap(r2.evx);
            }
            GlStateManager.cN(33984);
        }
        GlStateManager.ap(r2.qN);
    }

    public static void b(ITextureObject iTextureObject) {
        int n2 = iTextureObject.Ll();
        ak.b(iTextureObject.NK());
        if (GlStateManager.Ka() == 33984) {
            int n3 = ah.ezu;
            int n4 = ah.ezv;
            if (iTextureObject instanceof TextureMap) {
                ah.ezu = ((TextureMap)iTextureObject).bZT;
                ah.ezv = ((TextureMap)iTextureObject).bZU;
            } else {
                ah.ezu = 0;
                ah.ezv = 0;
            }
            if (ah.ezu != n3 || ah.ezv != n4) {
                ah.eBf.bS(ah.ezu, ah.ezv);
            }
        }
    }

    public static void b(TextureManager textureManager, cm cm2) {
        TextureMap textureMap = (TextureMap)textureManager.k(cm2);
        ah.ezu = textureMap.bZT;
        ah.ezv = textureMap.bZU;
        eFy = textureMap.NK();
        ak.b(eFy);
    }

    public static void kl(int n2) {
        r r2 = eFv.get(n2);
        ak.b(r2);
    }

    public static void a(int n2, int n3, int n4, DynamicTexture dynamicTexture) {
        r r2 = dynamicTexture.NK();
        int[] nArray = dynamicTexture.NM();
        int n5 = n3 * n4;
        Arrays.fill(nArray, n5, n5 * 2, -8421377);
        Arrays.fill(nArray, n5 * 2, n5 * 3, 0);
        TextureUtil.x(r2.qN, n3, n4);
        TextureUtil.g(false, false);
        TextureUtil.av(false);
        TextureUtil.x(r2.evw, n3, n4);
        TextureUtil.g(false, false);
        TextureUtil.av(false);
        TextureUtil.x(r2.evx, n3, n4);
        TextureUtil.g(false, false);
        TextureUtil.av(false);
        GlStateManager.ap(r2.qN);
    }

    public static void a(int n2, int[] nArray, int n3, int n4, DynamicTexture dynamicTexture) {
        r r2 = dynamicTexture.NK();
        GlStateManager.ap(r2.qN);
        ak.a(nArray, n3, n4, 0, 0, 0);
        GlStateManager.ap(r2.evw);
        ak.a(nArray, n3, n4, 0, 0, 1);
        GlStateManager.ap(r2.evx);
        ak.a(nArray, n3, n4, 0, 0, 2);
        GlStateManager.ap(r2.qN);
    }

    public static void a(int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 * n3;
        IntBuffer intBuffer = ak.kh(n7);
        intBuffer.clear();
        int n8 = n6 * n7;
        if (nArray.length >= n8 + n7) {
            intBuffer.put(nArray, n8, n7).position(0).limit(n7);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
            intBuffer.clear();
        }
    }

    public static ITextureObject aHk() {
        DynamicTexture dynamicTexture = new DynamicTexture(1, 1);
        dynamicTexture.NM()[0] = -1;
        dynamicTexture.NL();
        return dynamicTexture;
    }

    public static void a(int n2, int n3, int n4, int n5, Stitcher stitcher, TextureMap textureMap) {
        r r2;
        w.info("allocateTextureMap " + n3 + " " + n4 + " " + n5 + " ");
        eFw = textureMap;
        textureMap.bZT = n4;
        textureMap.bZU = n5;
        eFy = r2 = ak.a(textureMap);
        TextureUtil.t(r2.qN, n3, n4, n5);
        if (ah.eDe) {
            TextureUtil.t(r2.evw, n3, n4, n5);
        }
        if (ah.eDf) {
            TextureUtil.t(r2.evx, n3, n4, n5);
        }
        GlStateManager.ap(n2);
    }

    public static TextureAtlasSprite l(TextureAtlasSprite textureAtlasSprite) {
        eFx = textureAtlasSprite;
        return textureAtlasSprite;
    }

    public static String iY(String string) {
        bYQ = string;
        return string;
    }

    public static void b(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        int[][] nArray2;
        TextureUtil.a(nArray, n2, n3, n4, n5, bl2, bl3);
        boolean bl4 = false;
        if (ah.eDe) {
            nArray2 = ak.a(bYQ + "_n", n2, n3, nArray.length, false, -8421377);
            GlStateManager.ap(ak.eFy.evw);
            TextureUtil.a(nArray2, n2, n3, n4, n5, bl2, bl3);
        }
        if (ah.eDf) {
            nArray2 = ak.a(bYQ + "_s", n2, n3, nArray.length, false, 0);
            GlStateManager.ap(ak.eFy.evx);
            TextureUtil.a(nArray2, n2, n3, n4, n5, bl2, bl3);
        }
        GlStateManager.ap(ak.eFy.qN);
    }

    public static int[][] a(String string, int n2, int n3, int n4, boolean bl2, int n5) {
        Object object = new int[n4][];
        int[] nArray = new int[n2 * n3];
        object[0] = nArray;
        boolean bl3 = false;
        BufferedImage bufferedImage = ak.P(eFw.m(new cm(string)));
        if (bufferedImage != null) {
            int n6 = bufferedImage.getWidth();
            int n7 = bufferedImage.getHeight();
            if (n6 + (bl2 ? 16 : 0) == n2) {
                bl3 = true;
                bufferedImage.getRGB(0, 0, n6, n6, nArray, 0, n6);
            }
        }
        if (!bl3) {
            Arrays.fill(nArray, n5);
        }
        GlStateManager.ap(ak.eFy.evx);
        object = ak.b(((int[][])object).length - 1, n2, object);
        return object;
    }

    public static BufferedImage P(cm cm2) {
        try {
            if (!a.F(cm2)) {
                return null;
            }
            InputStream inputStream = a.u(cm2);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            return bufferedImage;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static int[][] b(int n2, int n3, int[][] nArray) {
        for (int i2 = 1; i2 <= n2; ++i2) {
            if (nArray[i2] != null) continue;
            int n4 = n3 >> i2;
            int n5 = n4 * 2;
            int[] nArray2 = nArray[i2 - 1];
            nArray[i2] = new int[n4 * n4];
            int[] nArray3 = nArray[i2];
            for (int i3 = 0; i3 < n4; ++i3) {
                for (int i4 = 0; i4 < n4; ++i4) {
                    int n6 = i3 * 2 * n5 + i4 * 2;
                    nArray3[i3 * n4 + i4] = ak.M(nArray2[n6], nArray2[n6 + 1], nArray2[n6 + n5], nArray2[n6 + n5 + 1]);
                }
            }
        }
        return nArray;
    }

    public static void c(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        TextureUtil.a(nArray, n2, n3, n4, n5, bl2, bl3);
        if (ah.eDe || ah.eDf) {
            if (ah.eDe) {
                GlStateManager.ap(ak.eFy.evw);
                ak.a(nArray, n2, n3, n4, n5, 1);
            }
            if (ah.eDf) {
                GlStateManager.ap(ak.eFy.evx);
                ak.a(nArray, n2, n3, n4, n5, 2);
            }
            GlStateManager.ap(ak.eFy.qN);
        }
    }

    public static void a(int[][] nArray, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 * n3;
        IntBuffer intBuffer = ak.kh(n7);
        int n8 = nArray.length;
        int n9 = 0;
        int n10 = n2;
        int n11 = n3;
        int n12 = n4;
        int n13 = n5;
        while (n10 > 0 && n11 > 0 && n9 < n8) {
            int n14 = n10 * n11;
            int[] nArray2 = nArray[n9];
            intBuffer.clear();
            if (nArray2.length >= n14 * (n6 + 1)) {
                intBuffer.put(nArray2, n14 * n6, n14).position(0).limit(n14);
                GL11.glTexSubImage2D((int)3553, (int)n9, (int)n12, (int)n13, (int)n10, (int)n11, (int)32993, (int)33639, (IntBuffer)intBuffer);
            }
            n10 >>= 1;
            n11 >>= 1;
            n12 >>= 1;
            n13 >>= 1;
            ++n9;
        }
        intBuffer.clear();
    }

    public static int L(int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n2 >>> 24 & 0xFF;
        int n8 = n3 >>> 24 & 0xFF;
        int n9 = n4 >>> 24 & 0xFF;
        int n10 = n5 >>> 24 & 0xFF;
        int n11 = n7 + n8 + n9 + n10;
        int n12 = (n11 + 2) / 4;
        if (n11 != 0) {
            n6 = n11;
        } else {
            n6 = 4;
            n7 = 1;
            n8 = 1;
            n9 = 1;
            n10 = 1;
        }
        int n13 = (n6 + 1) / 2;
        int n14 = n12 << 24 | ((n2 >>> 16 & 0xFF) * n7 + (n3 >>> 16 & 0xFF) * n8 + (n4 >>> 16 & 0xFF) * n9 + (n5 >>> 16 & 0xFF) * n10 + n13) / n6 << 16 | ((n2 >>> 8 & 0xFF) * n7 + (n3 >>> 8 & 0xFF) * n8 + (n4 >>> 8 & 0xFF) * n9 + (n5 >>> 8 & 0xFF) * n10 + n13) / n6 << 8 | ((n2 >>> 0 & 0xFF) * n7 + (n3 >>> 0 & 0xFF) * n8 + (n4 >>> 0 & 0xFF) * n9 + (n5 >>> 0 & 0xFF) * n10 + n13) / n6 << 0;
        return n14;
    }

    public static int M(int n2, int n3, int n4, int n5) {
        int n6 = ((n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + (n5 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + (n5 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + (n5 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + (n5 >>> 0 & 0xFF) + 2) / 4 << 0;
        return n6;
    }

    public static void a(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        Math.min(n3, n4);
        int n8 = n2;
        int n9 = n3;
        int n10 = n4;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        while (n9 > 1 && n10 > 1) {
            n11 = n8 + n9 * n10;
            n12 = n9 / 2;
            n13 = n10 / 2;
            for (n7 = 0; n7 < n13; ++n7) {
                n6 = n11 + n7 * n12;
                n5 = n8 + n7 * 2 * n9;
                for (int i2 = 0; i2 < n12; ++i2) {
                    nArray[n6 + i2] = ak.L(nArray[n5 + i2 * 2], nArray[n5 + i2 * 2 + 1], nArray[n5 + n9 + i2 * 2], nArray[n5 + n9 + i2 * 2 + 1]);
                }
            }
            ++n14;
            n9 = n12;
            n10 = n13;
            n8 = n11;
        }
        while (n14 > 0) {
            n9 = n3 >> --n14;
            n10 = n4 >> n14;
            n7 = n8 = n11 - n9 * n10;
            for (n6 = 0; n6 < n10; ++n6) {
                for (n5 = 0; n5 < n9; ++n5) {
                    if (nArray[n7] == 0) {
                        nArray[n7] = nArray[n11 + n6 / 2 * n12 + n5 / 2] & 0xFFFFFF;
                    }
                    ++n7;
                }
            }
            n11 = n8;
            n12 = n9;
        }
    }

    public static void b(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        Math.min(n3, n4);
        int n8 = n2;
        int n9 = n3;
        int n10 = n4;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        while (n9 > 1 && n10 > 1) {
            n11 = n8 + n9 * n10;
            n12 = n9 / 2;
            n13 = n10 / 2;
            for (n7 = 0; n7 < n13; ++n7) {
                n6 = n11 + n7 * n12;
                n5 = n8 + n7 * 2 * n9;
                for (int i2 = 0; i2 < n12; ++i2) {
                    nArray[n6 + i2] = ak.M(nArray[n5 + i2 * 2], nArray[n5 + i2 * 2 + 1], nArray[n5 + n9 + i2 * 2], nArray[n5 + n9 + i2 * 2 + 1]);
                }
            }
            ++n14;
            n9 = n12;
            n10 = n13;
            n8 = n11;
        }
        while (n14 > 0) {
            n9 = n3 >> --n14;
            n10 = n4 >> n14;
            n7 = n8 = n11 - n9 * n10;
            for (n6 = 0; n6 < n10; ++n6) {
                for (n5 = 0; n5 < n9; ++n5) {
                    if (nArray[n7] == 0) {
                        nArray[n7] = nArray[n11 + n6 / 2 * n12 + n5 / 2] & 0xFFFFFF;
                    }
                    ++n7;
                }
            }
            n11 = n8;
            n12 = n9;
        }
    }

    public static boolean c(int[] nArray, int n2, int n3) {
        int n4 = n2 * n3;
        if (nArray[0] >>> 24 == 255 && nArray[n4 - 1] == 0) {
            return true;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = nArray[i2] >>> 24;
            if (n5 == 0 || n5 == 255) continue;
            return true;
        }
        return false;
    }

    public static void b(int[] nArray, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        int n10 = n5;
        while (n7 > 0 && n8 > 0) {
            GL11.glCopyTexSubImage2D((int)3553, (int)n6, (int)n9, (int)n10, (int)0, (int)0, (int)n7, (int)n8);
            ++n6;
            n7 /= 2;
            n8 /= 2;
            n9 /= 2;
            n10 /= 2;
        }
    }

    public static void a(r r2, int[] nArray, int n2, int n3, boolean bl2, boolean bl3) {
        int n4 = bl2 ? 9729 : 9728;
        int n5 = bl3 ? 33071 : 10497;
        int n6 = n2 * n3;
        IntBuffer intBuffer = ak.kh(n6);
        intBuffer.clear();
        intBuffer.put(nArray, 0, n6).position(0).limit(n6);
        GlStateManager.ap(r2.qN);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n5);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n5);
        intBuffer.put(nArray, n6, n6).position(0).limit(n6);
        GlStateManager.ap(r2.evw);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n5);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n5);
        intBuffer.put(nArray, n6 * 2, n6).position(0).limit(n6);
        GlStateManager.ap(r2.evx);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n5);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n5);
        GlStateManager.ap(r2.qN);
    }

    public static void a(r r2, int[] nArray, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        int n6 = n2 * n3;
        IntBuffer intBuffer = ak.kh(n6);
        intBuffer.clear();
        intBuffer.put(nArray, 0, n6);
        intBuffer.position(0).limit(n6);
        GlStateManager.ap(r2.qN);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n6 * 3) {
            intBuffer.clear();
            intBuffer.put(nArray, n6, n6).position(0);
            intBuffer.position(0).limit(n6);
        }
        GlStateManager.ap(r2.evw);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n6 * 3) {
            intBuffer.clear();
            intBuffer.put(nArray, n6 * 2, n6);
            intBuffer.position(0).limit(n6);
        }
        GlStateManager.ap(r2.evx);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GlStateManager.cN(33984);
    }

    public static cm d(cm cm2, String string) {
        if (cm2 == null) {
            return null;
        }
        String string2 = cm2.atA();
        String[] stringArray = string2.split(".png");
        String string3 = stringArray[0];
        return new cm(cm2.atB(), string3 + "_" + string + ".png");
    }

    public static void a(IResourceManager iResourceManager, cm cm2, int n2, int n3, int[] nArray) {
        if (ah.eDe) {
            ak.a(iResourceManager, ak.d(cm2, "n"), n2, n3, nArray, n2 * n3, -8421377);
        }
        if (ah.eDf) {
            ak.a(iResourceManager, ak.d(cm2, "s"), n2, n3, nArray, n2 * n3 * 2, 0);
        }
    }

    private static void a(IResourceManager iResourceManager, cm cm2, int n2, int n3, int[] nArray, int n4, int n5) {
        if (!ak.a(iResourceManager, cm2, n2, n3, nArray, n4)) {
            Arrays.fill(nArray, n4, n4 + n2 * n3, n5);
        }
    }

    private static boolean a(IResourceManager iResourceManager, cm cm2, int n2, int n3, int[] nArray, int n4) {
        if (cm2 == null) {
            return false;
        }
        try {
            IResource iResource = iResourceManager.v(cm2);
            BufferedImage bufferedImage = ImageIO.read(iResource.getInputStream());
            if (bufferedImage == null) {
                return false;
            }
            if (bufferedImage.getWidth() == n2 && bufferedImage.getHeight() == n3) {
                bufferedImage.getRGB(0, 0, n2, n3, nArray, n4, n2);
                return true;
            }
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3, IResourceManager iResourceManager, cm cm2, r r2) {
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = n3 * n4;
        int[] nArray = ak.ki(n5 * 3);
        bufferedImage.getRGB(0, 0, n3, n4, nArray, 0, n3);
        ak.a(iResourceManager, cm2, n3, n4, nArray);
        ak.a(r2, nArray, n3, n4, bl2, bl3);
        return n2;
    }

    public static void c(int[] nArray, int n2, int n3, int n4) {
    }

    public static int an(int n2, int n3, int n4) {
        int n5 = 255 - n4;
        return ((n2 >>> 24 & 0xFF) * n4 + (n3 >>> 24 & 0xFF) * n5) / 255 << 24 | ((n2 >>> 16 & 0xFF) * n4 + (n3 >>> 16 & 0xFF) * n5) / 255 << 16 | ((n2 >>> 8 & 0xFF) * n4 + (n3 >>> 8 & 0xFF) * n5) / 255 << 8 | ((n2 >>> 0 & 0xFF) * n4 + (n3 >>> 0 & 0xFF) * n5) / 255 << 0;
    }

    public static void a(LayeredTexture layeredTexture, IResourceManager iResourceManager, List list) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int[] nArray = null;
        for (Object e2 : list) {
            String string = (String)e2;
            if (string == null) continue;
            try {
                cm cm2 = new cm(string);
                InputStream inputStream = iResourceManager.v(cm2).getInputStream();
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                if (n4 == 0) {
                    n2 = bufferedImage.getWidth();
                    n3 = bufferedImage.getHeight();
                    n4 = n2 * n3;
                    nArray = ak.bP(n4, 0);
                }
                int[] nArray2 = ak.ki(n4 * 3);
                bufferedImage.getRGB(0, 0, n2, n3, nArray2, 0, n2);
                ak.a(iResourceManager, cm2, n2, n3, nArray2);
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n5 = nArray2[i2] >>> 24 & 0xFF;
                    nArray[n4 * 0 + i2] = ak.an(nArray2[n4 * 0 + i2], nArray[n4 * 0 + i2], n5);
                    nArray[n4 * 1 + i2] = ak.an(nArray2[n4 * 1 + i2], nArray[n4 * 1 + i2], n5);
                    nArray[n4 * 2 + i2] = ak.an(nArray2[n4 * 2 + i2], nArray[n4 * 2 + i2], n5);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        ak.a(layeredTexture.NK(), nArray, n2, n3, false, false);
    }

    public static void aHl() {
        TextureManager textureManager = d.AZ().Bq();
        ITextureObject iTextureObject = textureManager.k(TextureMap.bZE);
        if (iTextureObject != null) {
            r r2 = iTextureObject.NK();
            GlStateManager.ap(r2.qN);
            GL11.glTexParameteri((int)3553, (int)10241, (int)ah.eDn[ah.eCX]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)ah.eDo[ah.eDa]);
            GlStateManager.ap(r2.evw);
            GL11.glTexParameteri((int)3553, (int)10241, (int)ah.eDn[ah.eCY]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)ah.eDo[ah.eDb]);
            GlStateManager.ap(r2.evx);
            GL11.glTexParameteri((int)3553, (int)10241, (int)ah.eDn[ah.eCZ]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)ah.eDo[ah.eDc]);
            GlStateManager.ap(0);
        }
    }

    public static int[][] b(int[][] nArray, int n2, int n3, int n4) {
        int n5 = nArray.length;
        int[][] nArrayArray = new int[n5][];
        for (int i2 = 0; i2 < n5; ++i2) {
            int[] nArray2 = nArray[i2];
            if (nArray2 == null) continue;
            int n6 = (n2 >> i2) * (n3 >> i2);
            int[] nArray3 = new int[n6 * 3];
            nArrayArray[i2] = nArray3;
            int n7 = nArray2.length / 3;
            int n8 = n6 * n4;
            int n9 = 0;
            System.arraycopy(nArray2, n8, nArray3, n9, n6);
            System.arraycopy(nArray2, n8 += n7, nArray3, n9 += n6, n6);
            System.arraycopy(nArray2, n8 += n7, nArray3, n9 += n6, n6);
        }
        return nArrayArray;
    }

    public static int[][] a(TextureAtlasSprite textureAtlasSprite, int[][] nArray, int n2, int n3) {
        boolean bl2 = true;
        return nArray;
    }

    public static void a(TextureAtlasSprite textureAtlasSprite, int[] nArray) {
    }
}

