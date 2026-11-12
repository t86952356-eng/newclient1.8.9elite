/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import hackclient.rise.aea;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.settings.a;
import net.minecraft.util.cm;
import net.optifine.bi;
import net.optifine.bk;
import net.optifine.util.af;
import net.optifine.util.ah;
import net.optifine.util.ak;

public class bm
implements aea {
    private static bk[] eeT = null;
    private static int bZV = 0;
    private static int bZW = 0;

    public static void aX() {
        eeT = null;
    }

    public static void jA() {
        eeT = null;
        bZV = 0;
        IResourcePack[] iResourcePackArray = net.minecraft.src.a.anO();
        eeT = bm.a(iResourcePackArray);
        bm.Ot();
    }

    public static void Ot() {
        if (eeT != null && net.minecraft.src.a.aos()) {
            int n2 = 0;
            for (bk bk2 : eeT) {
                bk2.aBP();
                if (!bk2.bd()) continue;
                ++n2;
            }
            int n3 = net.minecraft.src.a.AZ().bgT.asz;
            if (n3 != bZW) {
                bZV = n2;
                bZW = n3;
            }
            if (bi.bd()) {
                bi.aBL();
            }
        } else {
            bZV = 0;
        }
    }

    private static bk[] a(IResourcePack[] iResourcePackArray) {
        ArrayList<bk> arrayList = new ArrayList<bk>();
        for (int i2 = 0; i2 < iResourcePackArray.length; ++i2) {
            IResourcePack iResourcePack = iResourcePackArray[i2];
            bk[] bkArray = bm.f(iResourcePack);
            if (bkArray == null) continue;
            arrayList.addAll(Arrays.asList(bkArray));
        }
        bk[] bkArray = arrayList.toArray(new bk[arrayList.size()]);
        return bkArray;
    }

    private static bk[] f(IResourcePack iResourcePack) {
        String[] stringArray = ah.a(iResourcePack, "mcpatcher/anim/", ".properties", null);
        if (stringArray.length <= 0) {
            return null;
        }
        ArrayList<bk> arrayList = new ArrayList<bk>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            net.minecraft.src.a.fN("Texture animation: " + string);
            try {
                cm cm2 = new cm(string);
                InputStream inputStream = iResourcePack.r(cm2);
                af af2 = new af();
                af2.load(inputStream);
                bk bk2 = bm.a(af2, cm2);
                if (bk2 == null) continue;
                cm cm3 = new cm(bk2.aBR());
                if (net.minecraft.src.a.H(cm3) != iResourcePack) {
                    net.minecraft.src.a.fN("Skipped: " + string + ", target texture not loaded from same resource pack");
                    continue;
                }
                arrayList.add(bk2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                net.minecraft.src.a.warn("File not found: " + fileNotFoundException.getMessage());
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        bk[] bkArray = arrayList.toArray(new bk[arrayList.size()]);
        return bkArray;
    }

    private static bk a(Properties properties, cm cm2) {
        String string = properties.getProperty("from");
        String string2 = properties.getProperty("to");
        int n2 = net.minecraft.src.a.x(properties.getProperty("x"), -1);
        int n3 = net.minecraft.src.a.x(properties.getProperty("y"), -1);
        int n4 = net.minecraft.src.a.x(properties.getProperty("w"), -1);
        int n5 = net.minecraft.src.a.x(properties.getProperty("h"), -1);
        if (string != null && string2 != null) {
            if (n2 >= 0 && n3 >= 0 && n4 >= 0 && n5 >= 0) {
                string = string.trim();
                string2 = string2.trim();
                String string3 = ak.kf(cm2.atA());
                string = ak.M(string, string3);
                string2 = ak.M(string2, string3);
                byte[] byArray = bm.L(string, n4);
                if (byArray == null) {
                    net.minecraft.src.a.warn("TextureAnimation: Source texture not found: " + string2);
                    return null;
                }
                int n6 = byArray.length / 4;
                int n7 = n6 / (n4 * n5);
                int n8 = n7 * n4 * n5;
                if (n6 != n8) {
                    net.minecraft.src.a.warn("TextureAnimation: Source texture has invalid number of frames: " + string + ", frames: " + (float)n6 / (float)(n4 * n5));
                    return null;
                }
                cm cm3 = new cm(string2);
                try {
                    InputStream inputStream = net.minecraft.src.a.u(cm3);
                    if (inputStream == null) {
                        net.minecraft.src.a.warn("TextureAnimation: Target texture not found: " + string2);
                        return null;
                    }
                    BufferedImage bufferedImage = bm.k(inputStream);
                    if (n2 + n4 <= bufferedImage.getWidth() && n3 + n5 <= bufferedImage.getHeight()) {
                        bk bk2 = new bk(string, byArray, string2, cm3, n2, n3, n4, n5, properties);
                        return bk2;
                    }
                    net.minecraft.src.a.warn("TextureAnimation: Animation coordinates are outside the target texture: " + string2);
                    return null;
                }
                catch (IOException iOException) {
                    net.minecraft.src.a.warn("TextureAnimation: Target texture not found: " + string2);
                    return null;
                }
            }
            net.minecraft.src.a.warn("TextureAnimation: Invalid coordinates");
            return null;
        }
        net.minecraft.src.a.warn("TextureAnimation: Source or target texture not specified");
        return null;
    }

    private static byte[] L(String string, int n2) {
        byte[] byArray = bm.M(string, n2);
        if (byArray == null) {
            byArray = bm.M("/anim" + string, n2);
        }
        return byArray;
    }

    private static byte[] M(String string, int n2) {
        a a2 = net.minecraft.src.a.aoH();
        try {
            cm cm2 = new cm(string);
            InputStream inputStream = net.minecraft.src.a.u(cm2);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = bm.k(inputStream);
            inputStream.close();
            if (bufferedImage == null) {
                return null;
            }
            if (n2 > 0 && bufferedImage.getWidth() != n2) {
                double d2 = bufferedImage.getHeight() / bufferedImage.getWidth();
                int n3 = (int)((double)n2 * d2);
                bufferedImage = bm.a(bufferedImage, n2, n3);
            }
            int n4 = bufferedImage.getWidth();
            int n5 = bufferedImage.getHeight();
            int[] nArray = new int[n4 * n5];
            byte[] byArray = new byte[n4 * n5 * 4];
            bufferedImage.getRGB(0, 0, n4, n5, nArray, 0, n4);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                int n6 = nArray[i2] >> 24 & 0xFF;
                int n7 = nArray[i2] >> 16 & 0xFF;
                int n8 = nArray[i2] >> 8 & 0xFF;
                int n9 = nArray[i2] & 0xFF;
                if (a2 != null && a2.cgt) {
                    int n10 = (n7 * 30 + n8 * 59 + n9 * 11) / 100;
                    int n11 = (n7 * 30 + n8 * 70) / 100;
                    int n12 = (n7 * 30 + n9 * 70) / 100;
                    n7 = n10;
                    n8 = n11;
                    n9 = n12;
                }
                byArray[i2 * 4 + 0] = (byte)n7;
                byArray[i2 * 4 + 1] = (byte)n8;
                byArray[i2 * 4 + 2] = (byte)n9;
                byArray[i2 * 4 + 3] = (byte)n6;
            }
            return byArray;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static BufferedImage k(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }

    private static BufferedImage a(BufferedImage bufferedImage, int n2, int n3) {
        BufferedImage bufferedImage2 = new BufferedImage(n2, n3, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, n2, n3, null);
        return bufferedImage2;
    }

    public static int OA() {
        return eeT == null ? 0 : eeT.length;
    }

    public static int OB() {
        return bZV;
    }
}

