/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
package net.optifine;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.bs;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.optifine.ax;
import net.optifine.ay;
import net.optifine.config.a;
import net.optifine.config.j;
import net.optifine.d;
import net.optifine.q;
import net.optifine.r;
import net.optifine.render.g;
import net.optifine.t;
import net.optifine.u;
import net.optifine.util.af;
import net.optifine.util.ah;
import net.optifine.util.aj;
import net.optifine.util.ak;
import net.optifine.util.k;
import net.optifine.v;
import net.optifine.w;
import net.optifine.x;
import net.optifine.y;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class s {
    private static String dYn = "vanilla";
    private static r dYo = null;
    private static r dYp = null;
    private static r dYq = null;
    private static r dYr = null;
    private static r dYs = null;
    private static r[] dYt = null;
    private static r[][] dYu = null;
    private static r dYv = null;
    private static final q dYw = new q();
    private static r dYx = null;
    private static final q dYy = new q();
    private static r dYz = null;
    private static final q dYA = new q();
    private static r dYB = null;
    private static final q dYC = new q();
    private static ay[] dYD = null;
    private static int dYE = 0;
    private static r dYF = null;
    private static r dYG = null;
    private static int dYH = -1;
    private static r dYI = null;
    private static r dYJ = null;
    private static r dYK = null;
    private static r dYL = null;
    private static r dYM = null;
    private static boolean dYN = true;
    private static int dYO = -1;
    private static int dYP = -1;
    private static int dYQ = -1;
    private static int dYR = -1;
    private static int dYS = -1;
    private static int dYT = -1;
    private static da dYU = null;
    private static da dYV = null;
    private static da dYW = null;
    private static int[] dYX = null;
    private static int[] dYY = null;
    private static float[][] dYZ = null;
    private static float[][] dZa = null;
    private static int[] dZb = null;
    private static int[] dZc = null;
    private static int[] dZd = null;
    private static final IBlockState dZe = Blocks.cLf.xM();
    private static final IBlockState dZf = Blocks.cLl.xM();
    public static Random od = new Random();
    private static final y dZg = new t();
    private static final y dZh = new u();
    private static final y dZi = new v();
    private static final y dZj = new w();
    private static final y dZk = new x();

    public static void jA() {
        dYn = "vanilla";
        dYo = null;
        dYq = null;
        dYp = null;
        dYs = null;
        dYr = null;
        dYv = null;
        dYx = null;
        dYz = null;
        dYB = null;
        dYF = null;
        dYG = null;
        dYH = -1;
        dYI = null;
        dYJ = null;
        dYM = null;
        dYD = null;
        dYO = -1;
        dYP = -1;
        dYQ = -1;
        dYR = -1;
        dYS = -1;
        dYT = -1;
        dYU = null;
        dYV = null;
        dYW = null;
        dYt = null;
        dYu = null;
        dYN = true;
        dYX = null;
        dYY = null;
        dYZ = null;
        dZa = null;
        dZb = null;
        s.q(dZc);
        dZd = null;
        dYn = s.a("mcpatcher/color.properties", "palette.format", r.dYg, "vanilla");
        String string = "mcpatcher/colormap/";
        String[] stringArray = new String[]{"water.png", "watercolorX.png"};
        dYo = s.a("mcpatcher/colormap/", stringArray, 256, 256);
        s.aAA();
        if (net.minecraft.src.a.aow()) {
            String[] stringArray2 = new String[]{"pine.png", "pinecolor.png"};
            dYp = s.a("mcpatcher/colormap/", stringArray2, 256, 256);
            String[] stringArray3 = new String[]{"birch.png", "birchcolor.png"};
            dYq = s.a("mcpatcher/colormap/", stringArray3, 256, 256);
            String[] stringArray4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
            dYs = s.a("mcpatcher/colormap/", stringArray4, 256, 256);
            String[] stringArray5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
            dYr = s.a("mcpatcher/colormap/", stringArray5, 256, 256);
            String[] stringArray6 = new String[]{"sky0.png", "skycolor0.png"};
            dYv = s.a("mcpatcher/colormap/", stringArray6, 256, 256);
            String[] stringArray7 = new String[]{"fog0.png", "fogcolor0.png"};
            dYx = s.a("mcpatcher/colormap/", stringArray7, 256, 256);
            String[] stringArray8 = new String[]{"underwater.png", "underwatercolor.png"};
            dYz = s.a("mcpatcher/colormap/", stringArray8, 256, 256);
            String[] stringArray9 = new String[]{"underlava.png", "underlavacolor.png"};
            dYB = s.a("mcpatcher/colormap/", stringArray9, 256, 256);
            String[] stringArray10 = new String[]{"redstone.png", "redstonecolor.png"};
            dYF = s.a("mcpatcher/colormap/", stringArray10, 16, 1);
            dYG = s.k("mcpatcher/colormap/xporb.png", -1, -1);
            dYI = s.k("mcpatcher/colormap/durability.png", -1, -1);
            String[] stringArray11 = new String[]{"stem.png", "stemcolor.png"};
            dYJ = s.a("mcpatcher/colormap/", stringArray11, 8, 1);
            dYL = s.k("mcpatcher/colormap/pumpkinstem.png", 8, 1);
            dYK = s.k("mcpatcher/colormap/melonstem.png", 8, 1);
            String[] stringArray12 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
            dYM = s.a("mcpatcher/colormap/", stringArray12, -1, -1);
            Pair<ay[], Integer> pair = s.aAz();
            dYD = (ay[])pair.getLeft();
            dYE = (Integer)pair.getRight();
            s.hr("mcpatcher/color.properties");
            dYu = s.a(new String[]{"mcpatcher/colormap/custom/", "mcpatcher/colormap/blocks/"}, dYt, 256, 256);
            s.aAA();
        }
    }

    private static String a(String string, String string2, String[] stringArray, String string3) {
        try {
            cm cm2 = new cm(string);
            InputStream inputStream = net.minecraft.src.a.u(cm2);
            if (inputStream == null) {
                return string3;
            }
            af af2 = new af();
            af2.load(inputStream);
            inputStream.close();
            String string4 = af2.getProperty(string2);
            if (string4 == null) {
                return string3;
            }
            List<String> list = Arrays.asList(stringArray);
            if (!list.contains(string4)) {
                s.warn("Invalid value: " + string2 + "=" + string4);
                s.warn("Expected values: " + net.minecraft.src.a.c(stringArray));
                return string3;
            }
            s.fN(string2 + "=" + string4);
            return string4;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return string3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return string3;
        }
    }

    private static Pair<ay[], Integer> aAz() {
        Object object;
        Object object2;
        int n2;
        Object[] objectArray;
        String string = "mcpatcher/lightmap/world";
        String string2 = ".png";
        String[] stringArray = ah.as("mcpatcher/lightmap/world", ".png");
        HashMap<Integer, Object[]> hashMap = new HashMap<Integer, Object[]>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            objectArray = stringArray[i2];
            String string3 = aj.j((String)objectArray, "mcpatcher/lightmap/world", ".png");
            n2 = net.minecraft.src.a.x(string3, Integer.MIN_VALUE);
            if (n2 == Integer.MIN_VALUE) {
                s.warn("Invalid dimension ID: " + string3 + ", path: " + (String)objectArray);
                continue;
            }
            hashMap.put(n2, objectArray);
        }
        Set set = hashMap.keySet();
        objectArray = set.toArray(new Integer[set.size()]);
        Arrays.sort(objectArray);
        if (objectArray.length <= 0) {
            return new ImmutablePair(null, (Object)0);
        }
        int n3 = (Integer)objectArray[0];
        n2 = (Integer)objectArray[objectArray.length - 1];
        int n4 = n2 - n3 + 1;
        r[] rArray = new r[n4];
        for (int i3 = 0; i3 < objectArray.length; ++i3) {
            Object object3 = objectArray[i3];
            object2 = (String)hashMap.get(object3);
            object = s.k((String)object2, -1, -1);
            if (object == null) continue;
            if (((r)object).getWidth() < 16) {
                s.warn("Invalid lightmap width: " + ((r)object).getWidth() + ", path: " + (String)object2);
                continue;
            }
            int n5 = (Integer)object3 - n3;
            rArray[n5] = object;
        }
        ay[] ayArray = new ay[rArray.length];
        for (int i4 = 0; i4 < rArray.length; ++i4) {
            ay ay2;
            object2 = rArray[i4];
            if (object2 == null) continue;
            object = ((r)object2).gK;
            String string4 = ((r)object2).bZI;
            r r2 = s.k(string4 + "/" + (String)object + "_rain.png", -1, -1);
            r r3 = s.k(string4 + "/" + (String)object + "_thunder.png", -1, -1);
            ax ax2 = new ax((r)object2);
            ax ax3 = r2 != null ? new ax(r2) : null;
            ax ax4 = r3 != null ? new ax(r3) : null;
            ayArray[i4] = ay2 = new ay(ax2, ax3, ax4);
        }
        return new ImmutablePair((Object)ayArray, (Object)n3);
    }

    private static int I(String string, int n2) {
        try {
            InputStream inputStream = net.minecraft.src.a.u(new cm(string));
            if (inputStream == null) {
                return n2;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            return bufferedImage == null ? n2 : bufferedImage.getHeight();
        }
        catch (IOException iOException) {
            return n2;
        }
    }

    private static void hr(String string) {
        try {
            cm cm2 = new cm(string);
            InputStream inputStream = net.minecraft.src.a.u(cm2);
            if (inputStream == null) {
                return;
            }
            s.fN("Loading " + string);
            af af2 = new af();
            af2.load(inputStream);
            inputStream.close();
            dYO = s.a((Properties)af2, new String[]{"particle.water", "drop.water"});
            dYP = s.b(af2, "particle.portal");
            dYQ = s.b(af2, "lilypad");
            dYR = s.b(af2, "text.xpbar");
            dYS = s.b(af2, "text.boss");
            dYT = s.b(af2, "text.sign");
            dYU = s.c(af2, "fog.nether");
            dYV = s.c(af2, "fog.end");
            dYW = s.c(af2, "sky.end");
            dYt = s.a((Properties)af2, string);
            dYX = s.a(af2, string, "egg.shell.", "Spawn egg shell");
            dYY = s.a(af2, string, "egg.spots.", "Spawn egg spot");
            dYZ = s.b(af2, string, "collar.", "Wolf collar");
            dZa = s.b(af2, string, "sheep.", "Sheep");
            dZb = s.c(af2, string, "text.code.", "Text");
            int[] nArray = s.d(af2, string, "map.", "Map");
            if (nArray != null) {
                if (dZc == null) {
                    dZc = s.aAB();
                }
                s.q(nArray);
            }
            dZd = s.e(af2, string, "potion.", "Potion");
            dYH = net.minecraft.src.a.x(af2.getProperty("xporb.time"), -1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static r[] a(Properties properties, String string) {
        String string2;
        String string3;
        ArrayList<r> arrayList = new ArrayList<r>();
        String string4 = "palette.block.";
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Object object : properties.keySet()) {
            string3 = (String)object;
            string2 = properties.getProperty(string3);
            if (!string3.startsWith("palette.block.")) continue;
            hashMap.put(string3, string2);
        }
        String[] stringArray = hashMap.keySet().toArray(new String[hashMap.size()]);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            string3 = stringArray[i2];
            string2 = properties.getProperty(string3);
            s.fN("Block palette: " + string3 + " = " + string2);
            String string5 = string3.substring("palette.block.".length());
            String string6 = ak.kf(string);
            string5 = ak.M(string5, string6);
            r r2 = s.k(string5, 256, 256);
            if (r2 == null) {
                s.warn("Colormap not found: " + string5);
                continue;
            }
            a a2 = new a("CustomColors");
            j[] jArray = a2.hJ(string2);
            if (jArray != null && jArray.length > 0) {
                for (int i3 = 0; i3 < jArray.length; ++i3) {
                    j j2 = jArray[i3];
                    r2.a(j2);
                }
                arrayList.add(r2);
                continue;
            }
            s.warn("Invalid match blocks: " + string2);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        r[] rArray = arrayList.toArray(new r[arrayList.size()]);
        return rArray;
    }

    private static r[][] a(String[] stringArray, r[] rArray, int n2, int n3) {
        Object object;
        int n4;
        Object[] objectArray = ah.b(stringArray, new String[]{".properties"});
        Arrays.sort(objectArray);
        ArrayList arrayList = new ArrayList();
        for (n4 = 0; n4 < objectArray.length; ++n4) {
            object = objectArray[n4];
            s.fN("Block colormap: " + (String)object);
            try {
                cm cm2 = new cm("minecraft", (String)object);
                InputStream inputStream = net.minecraft.src.a.u(cm2);
                if (inputStream == null) {
                    s.warn("File not found: " + (String)object);
                    continue;
                }
                af af2 = new af();
                af2.load(inputStream);
                r r2 = new r(af2, (String)object, n2, n3, dYn);
                if (!r2.gY((String)object) || !r2.hq((String)object)) continue;
                s.a(r2, arrayList);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                s.warn("File not found: " + (String)object);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (rArray != null) {
            for (n4 = 0; n4 < rArray.length; ++n4) {
                object = rArray[n4];
                s.a((r)object, arrayList);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        r[][] rArray2 = s.N(arrayList);
        return rArray2;
    }

    private static void a(r r2, List list) {
        int[] nArray = r2.aAy();
        if (nArray != null && nArray.length > 0) {
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                int n2 = nArray[i2];
                if (n2 < 0) {
                    s.warn("Invalid block ID: " + n2);
                    continue;
                }
                s.a(r2, list, n2);
            }
        } else {
            s.warn("No match blocks: " + net.minecraft.src.a.k(nArray));
        }
    }

    private static void a(r r2, List list, int n2) {
        while (n2 >= list.size()) {
            list.add(null);
        }
        ArrayList<r> arrayList = (ArrayList<r>)list.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<r>();
            arrayList.set(n2, (r)((Object)arrayList));
        }
        arrayList.add(r2);
    }

    private static r[][] N(List list) {
        r[][] rArray = new r[list.size()][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            List list2 = (List)list.get(i2);
            if (list2 == null) continue;
            r[] rArray2 = list2.toArray(new r[list2.size()]);
            rArray[i2] = rArray2;
        }
        return rArray;
    }

    private static int a(Properties properties, String[] stringArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            int n2 = s.b(properties, string);
            if (n2 < 0) continue;
            return n2;
        }
        return -1;
    }

    private static int b(Properties properties, String string) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return -1;
        }
        int n2 = s.hs(string2 = string2.trim());
        if (n2 < 0) {
            s.warn("Invalid color: " + string + " = " + string2);
            return n2;
        }
        s.fN(string + " = " + string2);
        return n2;
    }

    private static int hs(String string) {
        if (string == null) {
            return -1;
        }
        string = string.trim();
        try {
            int n2 = Integer.parseInt(string, 16) & 0xFFFFFF;
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    private static da c(Properties properties, String string) {
        int n2 = s.b(properties, string);
        if (n2 < 0) {
            return null;
        }
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)n5 / 255.0f;
        return new da(f2, f3, f4);
    }

    private static r a(String string, String[] stringArray, int n2, int n3) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            Object object = stringArray[i2];
            r r2 = s.k((String)(object = string + (String)object), n2, n3);
            if (r2 == null) continue;
            return r2;
        }
        return null;
    }

    public static r k(String string, int n2, int n3) {
        try {
            Object object;
            cm cm2 = new cm(string);
            if (!net.minecraft.src.a.F(cm2)) {
                return null;
            }
            s.fN("Colormap " + string);
            af af2 = new af();
            String string2 = aj.h(string, ".png", ".properties");
            cm cm3 = new cm(string2);
            if (net.minecraft.src.a.F(cm3)) {
                object = net.minecraft.src.a.u(cm3);
                af2.load((InputStream)object);
                ((InputStream)object).close();
                s.fN("Colormap properties: " + string2);
            } else {
                ((Properties)af2).put("format", dYn);
                ((Properties)af2).put("source", string);
                string2 = string;
            }
            object = new r(af2, string2, n2, n3, dYn);
            return !((r)object).gY(string2) ? null : object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void aAA() {
        dYN = dYq == null && dYp == null && dYs == null && dYr == null && net.minecraft.src.a.aot() && net.minecraft.src.a.aov();
    }

    public static int a(BakedQuad bakedQuad, IBlockState iBlockState, l l2, b b2, g g2) {
        y y2;
        Block block = iBlockState.df();
        IBlockState iBlockState2 = g2.yU();
        if (dYu != null) {
            r r2;
            if (!bakedQuad.LQ()) {
                if (block == Blocks.cLe) {
                    iBlockState2 = dZe;
                }
                if (block == Blocks.cMh) {
                    return -1;
                }
            }
            if (block == Blocks.cOH && g2.yc() >= 8) {
                b2 = b2.aqY();
                iBlockState2 = l2.L(b2);
            }
            if ((r2 = s.I(iBlockState2)) != null) {
                if (net.minecraft.src.a.aov() && !r2.aAw()) {
                    return s.a(iBlockState, l2, b2, r2, g2.aDZ());
                }
                return r2.A(l2, b2);
            }
        }
        if (!bakedQuad.LQ()) {
            return -1;
        }
        if (block == Blocks.cNz) {
            return s.C(l2, b2);
        }
        if (block == Blocks.cMh) {
            return s.J(g2.yU());
        }
        if (block instanceof BlockStem) {
            return s.a(block, l2, b2, g2);
        }
        if (dYN) {
            return -1;
        }
        int n2 = g2.yc();
        if (block != Blocks.cLe && block != Blocks.cLJ && block != Blocks.cOH) {
            if (block == Blocks.cOH) {
                y2 = dZg;
                if (n2 >= 8) {
                    b2 = b2.aqY();
                }
            } else if (block == Blocks.cLv) {
                switch (n2 & 3) {
                    case 0: {
                        y2 = dZh;
                        break;
                    }
                    case 1: {
                        y2 = dZi;
                        break;
                    }
                    case 2: {
                        y2 = dZj;
                        break;
                    }
                    default: {
                        y2 = dZh;
                        break;
                    }
                }
            } else if (block == Blocks.cLw) {
                y2 = dZh;
            } else {
                if (block != Blocks.cNp) {
                    return -1;
                }
                y2 = dZh;
            }
        } else {
            y2 = dZg;
        }
        return net.minecraft.src.a.aov() && !y2.aAw() ? s.a(iBlockState, l2, b2, y2, g2.aDZ()) : y2.c(iBlockState2, l2, b2);
    }

    protected static net.minecraft.world.biome.j B(l l2, b b2) {
        net.minecraft.world.biome.j j2 = l2.aF(b2);
        if (j2 == net.minecraft.world.biome.j.dGl && !net.minecraft.src.a.aot()) {
            j2 = net.minecraft.world.biome.j.dGg;
        }
        return j2;
    }

    private static r I(IBlockState iBlockState) {
        if (dYu == null) {
            return null;
        }
        if (!(iBlockState instanceof BlockStateBase)) {
            return null;
        }
        BlockStateBase blockStateBase = (BlockStateBase)iBlockState;
        int n2 = blockStateBase.zW();
        if (n2 >= 0 && n2 < dYu.length) {
            r[] rArray = dYu[n2];
            if (rArray == null) {
                return null;
            }
            for (int i2 = 0; i2 < rArray.length; ++i2) {
                r r2 = rArray[i2];
                if (!r2.a(blockStateBase)) continue;
                return r2;
            }
            return null;
        }
        return null;
    }

    private static int a(IBlockState iBlockState, l l2, b b2, y y2, d d2) {
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = b2.wt();
        int n9 = b2.wu();
        int n10 = b2.wx();
        d d3 = d2;
        for (n4 = n8 - 1; n4 <= n8 + 1; ++n4) {
            for (n3 = n10 - 1; n3 <= n10 + 1; ++n3) {
                d3.ah(n4, n9, n3);
                n2 = y2.c(iBlockState, l2, d3);
                n5 += n2 >> 16 & 0xFF;
                n6 += n2 >> 8 & 0xFF;
                n7 += n2 & 0xFF;
            }
        }
        n4 = n5 / 9;
        n3 = n6 / 9;
        n2 = n7 / 9;
        return n4 << 16 | n3 << 8 | n2;
    }

    public static int a(l l2, IBlockState iBlockState, b b2, g g2) {
        Block block = iBlockState.df();
        y y2 = s.I(iBlockState);
        if (y2 == null && iBlockState.df().xb() == Material.bev) {
            y2 = dZk;
        }
        return y2 == null ? block.a(l2, b2, 0) : (net.minecraft.src.a.aov() && !y2.aAw() ? s.a(iBlockState, l2, b2, y2, g2.aDZ()) : y2.c(iBlockState, l2, b2));
    }

    public static void e(ae ae2) {
        if (dYP >= 0) {
            int n2 = dYP;
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            float f4 = (float)n5 / 255.0f;
            ae2.h(f2, f3, f4);
        }
    }

    public static void f(ae ae2) {
        if (dYM != null) {
            int n2 = dYM.aAu();
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            float f4 = (float)n5 / 255.0f;
            ae2.h(f2, f3, f4);
        }
    }

    private static int J(IBlockState iBlockState) {
        if (dYF == null) {
            return -1;
        }
        int n2 = s.b(iBlockState, 15);
        int n3 = dYF.iY(n2);
        return n3;
    }

    public static void a(ae ae2, l l2, double d2, double d3, double d4) {
        if (dYF != null) {
            IBlockState iBlockState = l2.L(new b(d2, d3, d4));
            int n2 = s.b(iBlockState, 15);
            int n3 = dYF.iY(n2);
            int n4 = n3 >> 16 & 0xFF;
            int n5 = n3 >> 8 & 0xFF;
            int n6 = n3 & 0xFF;
            float f2 = (float)n4 / 255.0f;
            float f3 = (float)n5 / 255.0f;
            float f4 = (float)n6 / 255.0f;
            ae2.h(f2, f3, f4);
        }
    }

    private static int b(IBlockState iBlockState, int n2) {
        Block block = iBlockState.df();
        if (!(block instanceof BlockRedstoneWire)) {
            return n2;
        }
        Integer n3 = iBlockState.b(BlockRedstoneWire.aZR);
        if (!(n3 instanceof Integer)) {
            return n2;
        }
        Integer n4 = n3;
        return n4;
    }

    public static float cd(float f2) {
        if (dYH <= 0) {
            return f2;
        }
        float f3 = 628.0f / (float)dYH;
        return f2 * f3;
    }

    public static int ce(float f2) {
        if (dYG == null) {
            return -1;
        }
        int n2 = (int)Math.round((double)((bt.bx(f2) + 1.0f) * (float)(dYG.aAx() - 1)) / 2.0);
        int n3 = dYG.iY(n2);
        return n3;
    }

    public static int ja(int n2) {
        if (dYI == null) {
            return -1;
        }
        int n3 = n2 * dYI.aAx() / 255;
        int n4 = dYI.iY(n3);
        return n4;
    }

    public static void a(ae ae2, l l2, double d2, double d3, double d4, g g2) {
        if (dYo != null || dYu != null || dYO >= 0) {
            b b2 = new b(d2, d3, d4);
            g2.c(dZf, b2);
            int n2 = s.a(l2, dZf, b2, g2);
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            float f4 = (float)n5 / 255.0f;
            if (dYO >= 0) {
                int n6 = dYO >> 16 & 0xFF;
                int n7 = dYO >> 8 & 0xFF;
                int n8 = dYO & 0xFF;
                f2 *= (float)n6 / 255.0f;
                f3 *= (float)n7 / 255.0f;
                f4 *= (float)n8 / 255.0f;
            }
            ae2.h(f2, f3, f4);
        }
    }

    private static int C(l l2, b b2) {
        return dYQ < 0 ? Blocks.cNz.d(l2, b2) : dYQ;
    }

    private static da z(da da2) {
        return dYU == null ? da2 : dYU;
    }

    private static da A(da da2) {
        return dYV == null ? da2 : dYV;
    }

    private static da B(da da2) {
        return dYW == null ? da2 : dYW;
    }

    public static da a(da da2, l l2, double d2, double d3, double d4) {
        if (dYv == null) {
            return da2;
        }
        int n2 = dYv.a(l2, d2, d3, d4, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)n5 / 255.0f;
        float f5 = (float)da2.dAG / 0.5f;
        float f6 = (float)da2.dAH / 0.66275f;
        float f7 = (float)da2.dAI;
        da da3 = dYw.ar(f2 *= f5, f3 *= f6, f4 *= f7);
        return da3;
    }

    private static da b(da da2, l l2, double d2, double d3, double d4) {
        if (dYx == null) {
            return da2;
        }
        int n2 = dYx.a(l2, d2, d3, d4, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)n5 / 255.0f;
        float f5 = (float)da2.dAG / 0.753f;
        float f6 = (float)da2.dAH / 0.8471f;
        float f7 = (float)da2.dAI;
        da da3 = dYy.ar(f2 *= f5, f3 *= f6, f4 *= f7);
        return da3;
    }

    public static da a(l l2, double d2, double d3, double d4) {
        return s.a(l2, d2, d3, d4, dYz, dYA);
    }

    public static da b(l l2, double d2, double d3, double d4) {
        return s.a(l2, d2, d3, d4, dYB, dYC);
    }

    public static da a(l l2, double d2, double d3, double d4, r r2, q q2) {
        if (r2 == null) {
            return null;
        }
        int n2 = r2.a(l2, d2, d3, d4, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)n5 / 255.0f;
        da da2 = q2.ar(f2, f3, f4);
        return da2;
    }

    private static int a(Block block, l l2, b b2, g g2) {
        r r2 = dYJ;
        if (block == Blocks.cNn && dYL != null) {
            r2 = dYL;
        }
        if (block == Blocks.cNo && dYK != null) {
            r2 = dYK;
        }
        if (r2 == null) {
            return -1;
        }
        int n2 = g2.yc();
        return r2.iY(n2);
    }

    public static boolean a(net.minecraft.world.w w2, float f2, int[] nArray, boolean bl2, float f3) {
        if (w2 == null) {
            return false;
        }
        if (dYD == null) {
            return false;
        }
        int n2 = w2.dDl.getDimensionId();
        int n3 = n2 - dYE;
        if (n3 >= 0 && n3 < dYD.length) {
            ay ay2 = dYD[n3];
            return ay2 != null && ay2.a(w2, f2, nArray, bl2, f3);
        }
        return false;
    }

    public static da a(da da2, net.minecraft.world.w w2, c c2, float f2) {
        int n2 = w2.dDl.getDimensionId();
        switch (n2) {
            case -1: {
                da2 = s.z(da2);
                break;
            }
            case 0: {
                net.minecraft.client.d d2 = net.minecraft.client.d.AZ();
                da2 = s.b(da2, d2.bgF, c2.gW, c2.gX + 1.0, c2.gY);
                break;
            }
            case 1: {
                da2 = s.A(da2);
            }
        }
        return da2;
    }

    public static da b(da da2, net.minecraft.world.w w2, c c2, float f2) {
        int n2 = w2.dDl.getDimensionId();
        switch (n2) {
            case 0: {
                net.minecraft.client.d d2 = net.minecraft.client.d.AZ();
                da2 = s.a(da2, (l)d2.bgF, c2.gW, c2.gX + 1.0, c2.gY);
                break;
            }
            case 1: {
                da2 = s.B(da2);
            }
        }
        return da2;
    }

    private static int[] a(Properties properties, String string, String string2, String string3) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Set<Object> set = properties.keySet();
        int n2 = 0;
        for (Object object : set) {
            String string4 = (String)object;
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            String string6 = aj.ax(string4, string2);
            int n3 = k.ka(string6);
            if (n3 < 0) {
                s.warn("Invalid spawn egg name: " + string4);
                continue;
            }
            int n4 = s.hs(string5);
            if (n4 < 0) {
                s.warn("Invalid spawn egg color: " + string4 + " = " + string5);
                continue;
            }
            while (arrayList.size() <= n3) {
                arrayList.add(-1);
            }
            arrayList.set(n3, n4);
            ++n2;
        }
        if (n2 <= 0) {
            return null;
        }
        s.fN(string3 + " colors: " + n2);
        Object object = new int[arrayList.size()];
        for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
            object[i2] = (Integer)arrayList.get(i2);
        }
        return object;
    }

    private static int a(bs bs2, co co2, int n2, int n3) {
        int[] nArray;
        int n4 = co2.yc();
        int[] nArray2 = nArray = n2 == 0 ? dYX : dYY;
        if (nArray == null) {
            return n3;
        }
        if (n4 >= 0 && n4 < nArray.length) {
            int n5 = nArray[n4];
            return n5 < 0 ? n3 : n5;
        }
        return n3;
    }

    public static int b(co co2, int n2, int n3) {
        if (co2 == null) {
            return n3;
        }
        net.minecraft.item.d d2 = co2.bP();
        return d2 == null ? n3 : (d2 instanceof bs ? s.a((bs)d2, co2, n2, n3) : n3);
    }

    private static float[][] b(Properties properties, String string, String string2, String string3) {
        net.minecraft.item.b[] bArray = net.minecraft.item.b.values();
        HashMap<String, net.minecraft.item.b> hashMap = new HashMap<String, net.minecraft.item.b>();
        for (int i2 = 0; i2 < bArray.length; ++i2) {
            net.minecraft.item.b b2 = bArray[i2];
            hashMap.put(b2.getName(), b2);
        }
        float[][] fArrayArray = new float[bArray.length][];
        int n2 = 0;
        for (Object object : properties.keySet()) {
            String string4 = (String)object;
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            String string6 = aj.ax(string4, string2);
            if (string6.equals("lightBlue")) {
                string6 = "light_blue";
            }
            net.minecraft.item.b b3 = (net.minecraft.item.b)hashMap.get(string6);
            int n3 = s.hs(string5);
            if (b3 != null && n3 >= 0) {
                float[] fArray = new float[]{(float)(n3 >> 16 & 0xFF) / 255.0f, (float)(n3 >> 8 & 0xFF) / 255.0f, (float)(n3 & 0xFF) / 255.0f};
                fArrayArray[b3.ordinal()] = fArray;
                ++n2;
                continue;
            }
            s.warn("Invalid color: " + string4 + " = " + string5);
        }
        if (n2 <= 0) {
            return null;
        }
        s.fN(string3 + " colors: " + n2);
        return fArrayArray;
    }

    private static float[] a(net.minecraft.item.b b2, float[][] fArray, float[] fArray2) {
        if (fArray == null) {
            return fArray2;
        }
        if (b2 == null) {
            return fArray2;
        }
        float[] fArray3 = fArray[b2.ordinal()];
        return fArray3 == null ? fArray2 : fArray3;
    }

    public static float[] a(net.minecraft.item.b b2, float[] fArray) {
        return s.a(b2, dYZ, fArray);
    }

    public static float[] b(net.minecraft.item.b b2, float[] fArray) {
        return s.a(b2, dZa, fArray);
    }

    private static int[] c(Properties properties, String string, String string2, String string3) {
        int[] nArray = new int[32];
        Arrays.fill(nArray, -1);
        int n2 = 0;
        for (Object object : properties.keySet()) {
            String string4 = (String)object;
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            String string6 = aj.ax(string4, string2);
            int n3 = net.minecraft.src.a.x(string6, -1);
            int n4 = s.hs(string5);
            if (n3 >= 0 && n3 < nArray.length && n4 >= 0) {
                nArray[n3] = n4;
                ++n2;
                continue;
            }
            s.warn("Invalid color: " + string4 + " = " + string5);
        }
        if (n2 <= 0) {
            return null;
        }
        s.fN(string3 + " colors: " + n2);
        return nArray;
    }

    public static int bB(int n2, int n3) {
        if (dZb == null) {
            return n3;
        }
        if (n2 >= 0 && n2 < dZb.length) {
            int n4 = dZb[n2];
            return n4 < 0 ? n3 : n4;
        }
        return n3;
    }

    private static int[] d(Properties properties, String string, String string2, String string3) {
        int[] nArray = new int[MapColor.bdB.length];
        Arrays.fill(nArray, -1);
        int n2 = 0;
        for (Object object : properties.keySet()) {
            String string4 = (String)object;
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            String string6 = aj.ax(string4, string2);
            int n3 = s.hu(string6);
            int n4 = s.hs(string5);
            if (n3 >= 0 && n3 < nArray.length && n4 >= 0) {
                nArray[n3] = n4;
                ++n2;
                continue;
            }
            s.warn("Invalid color: " + string4 + " = " + string5);
        }
        if (n2 <= 0) {
            return null;
        }
        s.fN(string3 + " colors: " + n2);
        return nArray;
    }

    private static int[] e(Properties properties, String string, String string2, String string3) {
        int[] nArray = new int[net.minecraft.potion.a.dgt.length];
        Arrays.fill(nArray, -1);
        int n2 = 0;
        for (Object object : properties.keySet()) {
            String string4 = (String)object;
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            int n3 = s.ht(string4);
            int n4 = s.hs(string5);
            if (n3 >= 0 && n3 < nArray.length && n4 >= 0) {
                nArray[n3] = n4;
                ++n2;
                continue;
            }
            s.warn("Invalid color: " + string4 + " = " + string5);
        }
        if (n2 <= 0) {
            return null;
        }
        s.fN(string3 + " colors: " + n2);
        return nArray;
    }

    private static int ht(String string) {
        if (string.equals("potion.water")) {
            return 0;
        }
        net.minecraft.potion.a[] aArray = net.minecraft.potion.a.dgt;
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            net.minecraft.potion.a a2 = aArray[i2];
            if (a2 == null || !a2.getName().equals(string)) continue;
            return a2.getId();
        }
        return -1;
    }

    public static int bC(int n2, int n3) {
        if (dZd == null) {
            return n3;
        }
        if (n2 >= 0 && n2 < dZd.length) {
            int n4 = dZd[n2];
            return n4 < 0 ? n3 : n4;
        }
        return n3;
    }

    private static int hu(String string) {
        return string == null ? -1 : (string.equals("air") ? MapColor.bdC.ben : (string.equals("grass") ? MapColor.bdD.ben : (string.equals("sand") ? MapColor.bdE.ben : (string.equals("cloth") ? MapColor.bdF.ben : (string.equals("tnt") ? MapColor.bdG.ben : (string.equals("ice") ? MapColor.bdH.ben : (string.equals("iron") ? MapColor.bdI.ben : (string.equals("foliage") ? MapColor.bdJ.ben : (string.equals("clay") ? MapColor.bdL.ben : (string.equals("dirt") ? MapColor.bdM.ben : (string.equals("stone") ? MapColor.bdN.ben : (string.equals("water") ? MapColor.bdO.ben : (string.equals("wood") ? MapColor.bdP.ben : (string.equals("quartz") ? MapColor.bdQ.ben : (string.equals("gold") ? MapColor.beg.ben : (string.equals("diamond") ? MapColor.beh.ben : (string.equals("lapis") ? MapColor.bei.ben : (string.equals("emerald") ? MapColor.bej.ben : (string.equals("podzol") ? MapColor.bek.ben : (string.equals("netherrack") ? MapColor.bel.ben : (!string.equals("snow") && !string.equals("white") ? (!string.equals("adobe") && !string.equals("orange") ? (string.equals("magenta") ? MapColor.bdS.ben : (!string.equals("light_blue") && !string.equals("lightBlue") ? (string.equals("yellow") ? MapColor.bdU.ben : (string.equals("lime") ? MapColor.bdV.ben : (string.equals("pink") ? MapColor.bdW.ben : (string.equals("gray") ? MapColor.bdX.ben : (string.equals("silver") ? MapColor.bdY.ben : (string.equals("cyan") ? MapColor.bdZ.ben : (string.equals("purple") ? MapColor.bea.ben : (string.equals("blue") ? MapColor.beb.ben : (string.equals("brown") ? MapColor.bec.ben : (string.equals("green") ? MapColor.bed.ben : (string.equals("red") ? MapColor.bee.ben : (string.equals("black") ? MapColor.bef.ben : -1)))))))))))) : MapColor.bdT.ben)) : MapColor.bdR.ben) : MapColor.bdK.ben)))))))))))))))))))));
    }

    private static int[] aAB() {
        MapColor[] mapColorArray = MapColor.bdB;
        int[] nArray = new int[mapColorArray.length];
        Arrays.fill(nArray, -1);
        for (int i2 = 0; i2 < mapColorArray.length && i2 < nArray.length; ++i2) {
            MapColor mapColor = mapColorArray[i2];
            if (mapColor == null) continue;
            nArray[i2] = mapColor.bem;
        }
        return nArray;
    }

    private static void q(int[] nArray) {
        if (nArray != null) {
            MapColor[] mapColorArray = MapColor.bdB;
            boolean bl2 = false;
            for (int i2 = 0; i2 < mapColorArray.length && i2 < nArray.length; ++i2) {
                int n2;
                MapColor mapColor = mapColorArray[i2];
                if (mapColor == null || (n2 = nArray[i2]) < 0 || mapColor.bem == n2) continue;
                mapColor.bem = n2;
                bl2 = true;
            }
            if (bl2) {
                net.minecraft.client.d.AZ().Bq().Or();
            }
        }
    }

    private static void fN(String string) {
        net.minecraft.src.a.fN("CustomColors: " + string);
    }

    private static void warn(String string) {
        net.minecraft.src.a.warn("CustomColors: " + string);
    }

    public static int jb(int n2) {
        return dYR < 0 ? n2 : dYR;
    }

    public static int jc(int n2) {
        return dYS < 0 ? n2 : dYS;
    }

    public static int jd(int n2) {
        return dYT < 0 ? n2 : dYT;
    }
}

