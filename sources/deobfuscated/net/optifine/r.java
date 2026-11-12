/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.l;
import net.optifine.config.a;
import net.optifine.config.j;
import net.optifine.config.k;
import net.optifine.d;
import net.optifine.s;
import net.optifine.util.ak;
import net.optifine.y;

public class r
implements y {
    public String gK = null;
    public String bZI = null;
    private int dXT = -1;
    private j[] dVI = null;
    private String dXU = null;
    private int lp = -1;
    private int dXV = 0;
    private int dXW = 0;
    private int width = 0;
    private int height = 0;
    private int[] dXX = null;
    private float[][] dXY = null;
    private static final int dXZ = -1;
    private static final int dYa = 0;
    private static final int dYb = 1;
    private static final int dYc = 2;
    public static final String dYd = "vanilla";
    public static final String dYe = "grid";
    public static final String dYf = "fixed";
    public static final String[] dYg = new String[]{"vanilla", "grid", "fixed"};
    public static final String dYh = "format";
    public static final String dYi = "blocks";
    public static final String dYj = "source";
    public static final String dYk = "color";
    public static final String dYl = "yVariance";
    public static final String dYm = "yOffset";

    public r(Properties properties, String string, int n2, int n3, String string2) {
        a a2 = new a("Colormap");
        this.gK = a2.gQ(string);
        this.bZI = a2.gR(string);
        this.dXT = this.hp(properties.getProperty(dYh, string2));
        this.dVI = a2.hJ(properties.getProperty(dYi));
        this.dXU = r.d(properties.getProperty(dYj), string, this.bZI);
        this.lp = a.N(properties.getProperty(dYk), -1);
        this.dXV = a2.x(properties.getProperty(dYl), 0);
        this.dXW = a2.x(properties.getProperty(dYm), 0);
        this.width = n2;
        this.height = n3;
    }

    private int hp(String string) {
        if (string == null) {
            return 0;
        }
        switch (string = string.trim()) {
            case "vanilla": {
                return 0;
            }
            case "grid": {
                return 1;
            }
            case "fixed": {
                return 2;
            }
        }
        r.warn("Unknown format: " + string);
        return -1;
    }

    public boolean gY(String string) {
        if (this.dXT != 0 && this.dXT != 1) {
            if (this.dXT != 2) {
                return false;
            }
            if (this.lp < 0) {
                this.lp = 0xFFFFFF;
            }
        } else {
            if (this.dXU == null) {
                r.warn("Source not defined: " + string);
                return false;
            }
            this.aAt();
            if (this.dXX == null) {
                return false;
            }
            if (this.lp < 0) {
                if (this.dXT == 0) {
                    this.lp = this.bz(127, 127);
                }
                if (this.dXT == 1) {
                    this.lp = this.d(net.minecraft.world.biome.j.dGg, new b(0, 64, 0));
                }
            }
        }
        return true;
    }

    public boolean hq(String string) {
        if (this.dVI == null) {
            this.dVI = this.aAl();
            if (this.dVI == null) {
                r.warn("Match blocks not defined: " + string);
                return false;
            }
        }
        return true;
    }

    private j[] aAl() {
        Object object;
        int n2;
        Block block = Block.cq(this.gK);
        if (block != null) {
            return new j[]{new j(Block.i(block))};
        }
        Pattern pattern = Pattern.compile("^block([0-9]+).*$");
        Matcher matcher = pattern.matcher(this.gK);
        if (matcher.matches() && (n2 = net.minecraft.src.a.x((String)(object = matcher.group(1)), -1)) >= 0) {
            return new j[]{new j(n2)};
        }
        object = new a("Colormap");
        return ((a)object).hK(this.gK);
    }

    private void aAt() {
        try {
            boolean bl2;
            this.dXX = null;
            if (this.dXU == null) {
                return;
            }
            String string = this.dXU + ".png";
            cm cm2 = new cm(string);
            InputStream inputStream = net.minecraft.src.a.u(cm2);
            if (inputStream == null) {
                return;
            }
            BufferedImage bufferedImage = TextureUtil.d(inputStream);
            if (bufferedImage == null) {
                return;
            }
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            boolean bl3 = this.width < 0 || this.width == n2;
            boolean bl4 = bl2 = this.height < 0 || this.height == n3;
            if (!bl3 || !bl2) {
                r.fN("Non-standard palette size: " + n2 + "x" + n3 + ", should be: " + this.width + "x" + this.height + ", path: " + string);
            }
            this.width = n2;
            this.height = n3;
            if (this.width <= 0 || this.height <= 0) {
                r.warn("Invalid palette size: " + n2 + "x" + n3 + ", path: " + string);
                return;
            }
            this.dXX = new int[n2 * n3];
            bufferedImage.getRGB(0, 0, n2, n3, this.dXX, 0, n2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void fN(String string) {
        net.minecraft.src.a.fN("CustomColors: " + string);
    }

    private static void warn(String string) {
        net.minecraft.src.a.warn("CustomColors: " + string);
    }

    private static String d(String string, String string2, String string3) {
        int n2;
        if (string != null) {
            string = string.trim();
            String string4 = ".png";
            if (string.endsWith(".png")) {
                string = string.substring(0, string.length() - ".png".length());
            }
            string = r.aa(string, string3);
            return string;
        }
        String string5 = string2;
        int n3 = string2.lastIndexOf(47);
        if (n3 >= 0) {
            string5 = string2.substring(n3 + 1);
        }
        if ((n2 = string5.lastIndexOf(46)) >= 0) {
            string5 = string5.substring(0, n2);
        }
        string5 = r.aa(string5, string3);
        return string5;
    }

    private static String aa(String object, String string) {
        if (!(((String)(object = ak.M((String)object, string))).startsWith(string) || ((String)object).startsWith("textures/") || ((String)object).startsWith("mcpatcher/"))) {
            object = string + "/" + (String)object;
        }
        if (((String)object).endsWith(".png")) {
            object = ((String)object).substring(0, ((String)object).length() - 4);
        }
        String string2 = "textures/blocks/";
        if (((String)object).startsWith("textures/blocks/")) {
            object = ((String)object).substring("textures/blocks/".length());
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    public boolean a(BlockStateBase blockStateBase) {
        return k.a(blockStateBase, this.dVI);
    }

    public int aAu() {
        if (this.dXT == 2) {
            return this.lp;
        }
        int n2 = s.od.nextInt(this.dXX.length);
        return this.dXX[n2];
    }

    public int iY(int n2) {
        n2 = net.minecraft.src.a.A(n2, 0, this.dXX.length - 1);
        return this.dXX[n2] & 0xFFFFFF;
    }

    public int bz(int n2, int n3) {
        n2 = net.minecraft.src.a.A(n2, 0, this.width - 1);
        n3 = net.minecraft.src.a.A(n3, 0, this.height - 1);
        return this.dXX[n3 * this.width + n2] & 0xFFFFFF;
    }

    public float[][] aAv() {
        if (this.dXY == null) {
            this.dXY = r.p(this.dXX);
        }
        return this.dXY;
    }

    @Override
    public int c(IBlockState iBlockState, l l2, b b2) {
        return this.A(l2, b2);
    }

    public int A(l l2, b b2) {
        net.minecraft.world.biome.j j2 = s.B(l2, b2);
        return this.b(j2, b2);
    }

    @Override
    public boolean aAw() {
        return this.dXT == 2;
    }

    public int b(net.minecraft.world.biome.j j2, b b2) {
        return this.dXT == 0 ? this.c(j2, b2) : (this.dXT == 1 ? this.d(j2, b2) : this.lp);
    }

    public int a(l l2, double d2, double d3, double d4, int n2) {
        int n3;
        int n4;
        int n5;
        if (this.dXT == 2) {
            return this.lp;
        }
        int n6 = bt.aF(d2);
        int n7 = bt.aF(d3);
        int n8 = bt.aF(d4);
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        d d5 = new d(0, 0, 0);
        for (n5 = n6 - n2; n5 <= n6 + n2; ++n5) {
            for (n4 = n8 - n2; n4 <= n8 + n2; ++n4) {
                d5.ah(n5, n7, n4);
                n3 = this.A(l2, d5);
                n9 += n3 >> 16 & 0xFF;
                n10 += n3 >> 8 & 0xFF;
                n11 += n3 & 0xFF;
                ++n12;
            }
        }
        n5 = n9 / n12;
        n4 = n10 / n12;
        n3 = n11 / n12;
        return n5 << 16 | n4 << 8 | n3;
    }

    private int c(net.minecraft.world.biome.j j2, b b2) {
        double d2 = bt.I(j2.bi(b2), 0.0f, 1.0f);
        double d3 = bt.I(j2.axb(), 0.0f, 1.0f);
        int n2 = (int)((1.0 - d2) * (double)(this.width - 1));
        int n3 = (int)((1.0 - (d3 *= d2)) * (double)(this.height - 1));
        return this.bz(n2, n3);
    }

    private int d(net.minecraft.world.biome.j j2, b b2) {
        int n2 = j2.dHo;
        int n3 = b2.wu() - this.dXW;
        if (this.dXV > 0) {
            int n4 = b2.wt() << 16 + b2.wx();
            int n5 = net.minecraft.src.a.hh(n4);
            int n6 = this.dXV * 2 + 1;
            int n7 = (n5 & 0xFF) % n6 - this.dXV;
            n3 += n7;
        }
        return this.bz(n2, n3);
    }

    public int aAx() {
        return this.dXT == 2 ? 1 : this.dXX.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    private static float[][] p(int[] nArray) {
        float[][] fArray = new float[nArray.length][3];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2];
            float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n2 & 0xFF) / 255.0f;
            float[] fArray2 = fArray[i2];
            fArray2[0] = f2;
            fArray2[1] = f3;
            fArray2[2] = f4;
        }
        return fArray;
    }

    public void a(j j2) {
        if (this.dVI == null) {
            this.dVI = new j[0];
        }
        this.dVI = (j[])net.minecraft.src.a.a((Object[])this.dVI, (Object)j2);
    }

    public void bA(int n2, int n3) {
        j j2 = this.iZ(n2);
        if (j2 != null) {
            if (n3 >= 0) {
                j2.js(n3);
            }
        } else {
            this.a(new j(n2, n3));
        }
    }

    private j iZ(int n2) {
        if (this.dVI != null) {
            for (j j2 : this.dVI) {
                if (j2.zW() != n2) continue;
                return j2;
            }
        }
        return null;
    }

    public int[] aAy() {
        if (this.dVI == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (j j2 : this.dVI) {
            if (j2.zW() < 0) continue;
            hashSet.add(j2.zW());
        }
        Object[] objectArray = hashSet.toArray(new Integer[hashSet.size()]);
        int[] nArray = new int[objectArray.length];
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            nArray[i2] = (Integer)objectArray[i2];
        }
        return nArray;
    }

    public String toString() {
        return this.bZI + "/" + this.gK + ", blocks: " + net.minecraft.src.a.c(this.dVI) + ", source: " + this.dXU;
    }
}

