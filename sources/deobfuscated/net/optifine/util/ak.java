/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 */
package net.optifine.util;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerMooshroomMushroom;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.a;
import net.optifine.ac;
import net.optifine.ae;
import net.optifine.ai;
import net.optifine.aj;
import net.optifine.al;
import net.optifine.aw;
import net.optifine.b;
import net.optifine.bb;
import net.optifine.bd;
import net.optifine.bj;
import net.optifine.bm;
import net.optifine.entity.model.c;
import net.optifine.p;
import net.optifine.s;
import net.optifine.shaders.ah;
import net.optifine.util.am;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class ak {
    public static final String eNt = "grass_top";
    public static final String eNu = "stone";
    public static final String eNv = "dirt";
    public static final String eNw = "coarse_dirt";
    public static final String eNx = "grass_side";
    public static final String eNy = "stone_slab_side";
    public static final String eNz = "stone_slab_top";
    public static final String eNA = "bedrock";
    public static final String eNB = "sand";
    public static final String eNC = "gravel";
    public static final String eND = "log_oak";
    public static final String eNE = "log_big_oak";
    public static final String eNF = "log_acacia";
    public static final String eNG = "log_spruce";
    public static final String eNH = "log_birch";
    public static final String eNI = "log_jungle";
    public static final String eNJ = "log_oak_top";
    public static final String eNK = "log_big_oak_top";
    public static final String eNL = "log_acacia_top";
    public static final String eNM = "log_spruce_top";
    public static final String eNN = "log_birch_top";
    public static final String eNO = "log_jungle_top";
    public static final String eNP = "leaves_oak";
    public static final String eNQ = "leaves_big_oak";
    public static final String eNR = "leaves_acacia";
    public static final String eNS = "leaves_birch";
    public static final String eNT = "leaves_spruce";
    public static final String eNU = "leaves_jungle";
    public static final String eNV = "gold_ore";
    public static final String eNW = "iron_ore";
    public static final String eNX = "coal_ore";
    public static final String eNY = "obsidian";
    public static final String eNZ = "grass_side_overlay";
    public static final String eOa = "snow";
    public static final String eOb = "grass_side_snowed";
    public static final String eOc = "mycelium_side";
    public static final String eOd = "mycelium_top";
    public static final String eOe = "diamond_ore";
    public static final String eOf = "redstone_ore";
    public static final String eOg = "lapis_ore";
    public static final String eOh = "cactus_side";
    public static final String eOi = "clay";
    public static final String eOj = "farmland_wet";
    public static final String eOk = "farmland_dry";
    public static final String eOl = "netherrack";
    public static final String eOm = "soul_sand";
    public static final String eOn = "glowstone";
    public static final String eOo = "leaves_spruce";
    public static final String eOp = "leaves_spruce_opaque";
    public static final String eOq = "end_stone";
    public static final String eOr = "sandstone_top";
    public static final String eOs = "sandstone_bottom";
    public static final String eOt = "redstone_lamp_off";
    public static final String eOu = "redstone_lamp_on";
    public static final String eOv = "water_still";
    public static final String eOw = "water_flow";
    public static final String eOx = "lava_still";
    public static final String eOy = "lava_flow";
    public static final String eOz = "fire_layer_0";
    public static final String eOA = "fire_layer_1";
    public static final String eOB = "portal";
    public static final String eOC = "glass";
    public static final String eOD = "glass_pane_top";
    public static final String eOE = "compass";
    public static final String eOF = "clock";
    public static TextureAtlasSprite eOG;
    public static TextureAtlasSprite eOH;
    public static TextureAtlasSprite eOI;
    public static TextureAtlasSprite eOJ;
    public static TextureAtlasSprite eOK;
    public static TextureAtlasSprite eOL;
    public static TextureAtlasSprite eOM;
    public static TextureAtlasSprite eON;
    public static TextureAtlasSprite eOO;
    public static TextureAtlasSprite eOP;
    public static TextureAtlasSprite eOQ;
    public static TextureAtlasSprite eOR;
    public static TextureAtlasSprite eOS;
    public static TextureAtlasSprite eOT;
    public static TextureAtlasSprite eOU;
    public static TextureAtlasSprite eOV;
    public static TextureAtlasSprite eOW;
    public static TextureAtlasSprite eOX;
    public static final String eOY = "minecraft:blocks/";
    public static final String eOZ = "minecraft:items/";
    private static final IntBuffer ePa;

    public static void jA() {
        TextureMap textureMap = ak.Bu();
        if (textureMap != null) {
            String string = eOY;
            eOG = textureMap.dt("minecraft:blocks/grass_top");
            eOH = textureMap.dt("minecraft:blocks/grass_side");
            eOI = textureMap.dt("minecraft:blocks/grass_side_overlay");
            eOJ = textureMap.dt("minecraft:blocks/snow");
            eOK = textureMap.dt("minecraft:blocks/grass_side_snowed");
            eOL = textureMap.dt("minecraft:blocks/mycelium_side");
            eOM = textureMap.dt("minecraft:blocks/mycelium_top");
            eON = textureMap.dt("minecraft:blocks/water_still");
            eOO = textureMap.dt("minecraft:blocks/water_flow");
            eOP = textureMap.dt("minecraft:blocks/lava_still");
            eOQ = textureMap.dt("minecraft:blocks/lava_flow");
            eOS = textureMap.dt("minecraft:blocks/fire_layer_0");
            eOT = textureMap.dt("minecraft:blocks/fire_layer_1");
            eOR = textureMap.dt("minecraft:blocks/portal");
            eOU = textureMap.dt("minecraft:blocks/glass");
            eOV = textureMap.dt("minecraft:blocks/glass_pane_top");
            String string2 = eOZ;
            eOW = textureMap.dt("minecraft:items/compass");
            eOX = textureMap.dt("minecraft:items/clock");
        }
    }

    public static BufferedImage a(String string, BufferedImage bufferedImage) {
        int n2;
        int n3;
        if ((string.startsWith("/mob/zombie") || string.startsWith("/mob/pigzombie")) && (n3 = bufferedImage.getWidth()) == (n2 = bufferedImage.getHeight()) * 2) {
            BufferedImage bufferedImage2 = new BufferedImage(n3, n2 * 2, 2);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            graphics2D.drawImage(bufferedImage, 0, 0, n3, n2, null);
            return bufferedImage2;
        }
        return bufferedImage;
    }

    public static int kA(int n2) {
        int n3;
        for (n3 = 1; n3 < n2; n3 *= 2) {
        }
        return n3;
    }

    public static int kB(int n2) {
        int n3 = 1;
        int n4 = 0;
        while (n3 < n2) {
            n3 *= 2;
            ++n4;
        }
        return n4;
    }

    public static int kC(int n2) {
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 *= 2;
        }
        return n3;
    }

    public static ITextureObject k(cm cm2) {
        ITextureObject iTextureObject = net.minecraft.src.a.Bq().k(cm2);
        if (iTextureObject != null) {
            return iTextureObject;
        }
        if (!net.minecraft.src.a.F(cm2)) {
            return null;
        }
        SimpleTexture simpleTexture = new SimpleTexture(cm2);
        net.minecraft.src.a.Bq().a(cm2, simpleTexture);
        return simpleTexture;
    }

    public static void d(IResourceManager iResourceManager) {
        if (ak.Bu() != null) {
            net.minecraft.src.a.fN("*** Reloading custom textures ***");
            al.aX();
            bm.aX();
            ak.jA();
            bb.jA();
            a.jA();
            b.jA();
            bm.jA();
            s.jA();
            al.jA();
            bd.jA();
            ae.aAM();
            c.jA();
            ah.aBA();
            aw.aBA();
            net.minecraft.src.a.ans();
            bj.aBM();
            aj.jA();
            ac.jA();
            LayerMooshroomMushroom.jA();
            ai.jA();
            p.jA();
            net.minecraft.src.a.Bq().tick();
        }
    }

    public static TextureMap Bu() {
        return Minecraft.getMinecraft().Bu();
    }

    public static void aJx() {
        Object object;
        Object object2;
        IResourceManager iResourceManager = net.minecraft.src.a.Br();
        if (iResourceManager instanceof IReloadableResourceManager) {
            object2 = (IReloadableResourceManager)iResourceManager;
            object = new net.optifine.util.al();
            object2.a((IResourceManagerReloadListener)object);
        }
        object2 = new am();
        object = new cm("optifine/TickableTextures");
        net.minecraft.src.a.Bq().a((cm)object, (ITickableTextureObject)object2);
    }

    public static cm e(cm cm2, String string) {
        if (!cm2.atB().equals("minecraft")) {
            return cm2;
        }
        String string2 = cm2.atA();
        String string3 = ak.M(string2, string);
        if (string3 != string2) {
            cm2 = new cm(cm2.atB(), string3);
        }
        return cm2;
    }

    public static String M(String object, String object2) {
        String string = "assets/minecraft/";
        if (((String)object).startsWith("assets/minecraft/")) {
            object = ((String)object).substring("assets/minecraft/".length());
            return object;
        }
        if (((String)object).startsWith("./")) {
            object = ((String)object).substring(2);
            if (!((String)object2).endsWith("/")) {
                object2 = (String)object2 + "/";
            }
            object = (String)object2 + (String)object;
            return object;
        }
        if (((String)object).startsWith("/~")) {
            object = ((String)object).substring(1);
        }
        String string2 = "mcpatcher/";
        if (((String)object).startsWith("~/")) {
            object = ((String)object).substring(2);
            object = "mcpatcher/" + (String)object;
            return object;
        }
        if (((String)object).startsWith("/")) {
            object = "mcpatcher/" + ((String)object).substring(1);
            return object;
        }
        return object;
    }

    public static String kf(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public static void aJy() {
        if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            float f2 = GL11.glGetFloat((int)34047);
            float f3 = net.minecraft.src.a.aof();
            f3 = Math.min(f3, f2);
            GL11.glTexParameterf((int)3553, (int)34046, (float)f3);
        }
    }

    public static void ap(int n2) {
        GlStateManager.ap(n2);
    }

    public static boolean hP(int n2) {
        int n3 = bt.hO(n2);
        return n3 == n2;
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n2) {
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = n4 * n2 / n3;
        BufferedImage bufferedImage2 = new BufferedImage(n2, n5, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (n2 < n3 || n2 % n3 != 0) {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D.drawImage(bufferedImage, 0, 0, n2, n5, null);
        return bufferedImage2;
    }

    public static int ca(int n2, int n3) {
        int n4;
        if (n2 == n3) {
            return n2;
        }
        for (n4 = n2 / n3 * n3; n4 < n2; n4 += n3) {
        }
        return n4;
    }

    public static int cb(int n2, int n3) {
        int n4;
        if (n2 >= n3) {
            return n2;
        }
        for (n4 = n3 / n2 * n2; n4 < n3; n4 += n2) {
        }
        return n4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Dimension d(InputStream inputStream, String string) {
        Iterator<ImageReader> iterator = ImageIO.getImageReadersBySuffix(string);
        while (iterator.hasNext()) {
            Dimension dimension;
            ImageReader imageReader = iterator.next();
            try {
                ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
                imageReader.setInput(imageInputStream);
                int n2 = imageReader.getWidth(imageReader.getMinIndex());
                int n3 = imageReader.getHeight(imageReader.getMinIndex());
                dimension = new Dimension(n2, n3);
            }
            catch (IOException iOException) {}
            continue;
            finally {
                imageReader.dispose();
                continue;
            }
            return dimension;
        }
        return null;
    }

    public static void m(TextureAtlasSprite textureAtlasSprite) {
        int[][] nArray = textureAtlasSprite.dD(0);
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            if (nArray2 == null) {
                net.minecraft.src.a.fN(i2 + ": " + String.valueOf(nArray2));
                continue;
            }
            net.minecraft.src.a.fN(i2 + ": " + nArray2.length);
        }
    }

    public static void b(String string, int n2, int n3, int n4, int n5) {
        File file;
        int n6;
        ak.ap(n2);
        GL11.glPixelStorei((int)3333, (int)1);
        GL11.glPixelStorei((int)3317, (int)1);
        File file2 = new File(string);
        File file3 = file2.getParentFile();
        if (file3 != null) {
            file3.mkdirs();
        }
        for (n6 = 0; n6 < 16; ++n6) {
            file = new File(string + "_" + n6 + ".png");
            file.delete();
        }
        for (n6 = 0; n6 <= n3; ++n6) {
            file = new File(string + "_" + n6 + ".png");
            int n7 = n4 >> n6;
            int n8 = n5 >> n6;
            int n9 = n7 * n8;
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)n9);
            int[] nArray = new int[n9];
            GL11.glGetTexImage((int)3553, (int)n6, (int)32993, (int)33639, (IntBuffer)intBuffer);
            intBuffer.get(nArray);
            BufferedImage bufferedImage = new BufferedImage(n7, n8, 2);
            bufferedImage.setRGB(0, 0, n7, n8, nArray, 0, n7);
            try {
                ImageIO.write((RenderedImage)bufferedImage, "png", file);
                net.minecraft.src.a.fN("Exported: " + String.valueOf(file));
                continue;
            }
            catch (Exception exception) {
                net.minecraft.src.a.warn("Error writing: " + String.valueOf(file));
                net.minecraft.src.a.warn(exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }

    public static void c(TextureAtlasSprite textureAtlasSprite, int n2) {
        ArrayList<int[][]> arrayList;
        int n3 = textureAtlasSprite.NW();
        int n4 = textureAtlasSprite.NX();
        if (textureAtlasSprite.Of() < 1) {
            arrayList = new ArrayList<int[][]>();
            int[][] nArrayArray = new int[n2 + 1][];
            int[] nArray = new int[n3 * n4];
            nArrayArray[0] = nArray;
            arrayList.add(nArrayArray);
            textureAtlasSprite.u(arrayList);
        }
        arrayList = new ArrayList();
        int n5 = textureAtlasSprite.Of();
        for (int i2 = 0; i2 < n5; ++i2) {
            int[] nArray = ak.a(textureAtlasSprite, i2, 0);
            if (nArray == null || nArray.length < 1) {
                nArray = new int[n3 * n4];
            }
            if (nArray.length != n3 * n4) {
                int n6 = (int)Math.round(Math.sqrt(nArray.length));
                if (n6 * n6 != nArray.length) {
                    nArray = new int[1];
                    n6 = 1;
                }
                BufferedImage bufferedImage = new BufferedImage(n6, n6, 2);
                bufferedImage.setRGB(0, 0, n6, n6, nArray, 0, n6);
                BufferedImage bufferedImage2 = ak.a(bufferedImage, n3);
                int[] nArray2 = new int[n3 * n4];
                bufferedImage2.getRGB(0, 0, n3, n4, nArray2, 0, n3);
                nArray = nArray2;
            }
            int[][] nArrayArray = new int[n2 + 1][];
            nArrayArray[0] = nArray;
            arrayList.add(nArrayArray);
        }
        textureAtlasSprite.u(arrayList);
        textureAtlasSprite.dG(n2);
    }

    public static int[] a(TextureAtlasSprite textureAtlasSprite, int n2, int n3) {
        List<int[][]> list = textureAtlasSprite.Oo();
        if (list.size() <= n2) {
            return null;
        }
        int[][] nArray = list.get(n2);
        if (nArray != null && nArray.length > n3) {
            int[] nArray2 = nArray[n3];
            return nArray2;
        }
        return null;
    }

    public static int Bc() {
        for (int i2 = 65536; i2 > 0; i2 >>= 1) {
            GlStateManager.a(32868, 0, 6408, i2, i2, 0, 6408, 5121, null);
            int n2 = GL11.glGetError();
            int n3 = GlStateManager.t(32868, 0, 4096);
            if (n3 == 0) continue;
            return i2;
        }
        return -1;
    }

    static {
        ePa = GLAllocation.cF(256);
    }
}

