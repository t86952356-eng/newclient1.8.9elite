/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.client.resources.model.SimpleBakedModel$Builder;
import net.minecraft.init.Items;
import net.minecraft.item.aa;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.cm;
import net.optifine.config.h;
import net.optifine.config.l;
import net.optifine.config.m;
import net.optifine.config.n;
import net.optifine.config.o;
import net.optifine.reflect.g;
import net.optifine.render.b;
import net.optifine.util.aj;
import net.optifine.util.ak;
import org.lwjgl.opengl.GL11;

public class ad {
    public String gK = null;
    public String bZI = null;
    public int bif = 1;
    public int[] ean = null;
    public String bQJ = null;
    public Map<String, String> eao = null;
    public String eap = null;
    public Map<String, String> eaq = null;
    public o ear = null;
    public boolean eas = false;
    public int eat = 0;
    public o eau = null;
    public o eav = null;
    public o eaw = null;
    public l[] eax = null;
    public int eay = 0;
    public int eaz = 1;
    public float cGM = 0.0f;
    public float eaA = 0.0f;
    public int eaB = 0;
    public float eaC = 1.0f;
    public int biW = 0;
    public cm bCa = null;
    public Map eaD = null;
    public TextureAtlasSprite bQt = null;
    public Map eaE = null;
    public IBakedModel eaF = null;
    public Map<String, IBakedModel> eaG = null;
    public IBakedModel eaH = null;
    public Map<String, IBakedModel> eaI = null;
    private int bys = 0;
    private int byt = 0;
    public static final int eaJ = 0;
    public static final int eaK = 1;
    public static final int eaL = 2;
    public static final int eaM = 3;
    public static final int eaN = 0;
    public static final int eaO = 1;
    public static final int eaP = 2;
    public static final String eaQ = "inventory";

    public ad(Properties properties, String string) {
        this.gK = ad.gQ(string);
        this.bZI = ad.gR(string);
        this.bif = this.dG(properties.getProperty("type"));
        this.ean = this.ac(properties.getProperty("items"), properties.getProperty("matchItems"));
        this.eaq = ad.e(properties, this.bZI);
        this.eap = ad.a(properties.getProperty("model"), string, this.bZI, this.bif, this.eaq);
        this.eao = ad.d(properties, this.bZI);
        boolean bl2 = this.eaq == null && this.eap == null;
        this.bQJ = ad.a(properties.getProperty("texture"), properties.getProperty("tile"), properties.getProperty("source"), string, this.bZI, this.bif, this.eao, bl2);
        String string2 = properties.getProperty("damage");
        if (string2 != null) {
            this.eas = string2.contains("%");
            string2 = string2.replace("%", "");
            this.ear = this.hx(string2);
            this.eat = this.x(properties.getProperty("damageMask"), 0);
        }
        this.eau = this.hx(properties.getProperty("stackSize"));
        this.eav = this.a(properties.getProperty("enchantmentIDs"), new m());
        this.eaw = this.hx(properties.getProperty("enchantmentLevels"));
        this.eax = this.b(properties);
        this.eay = this.hz(properties.getProperty("hand"));
        this.eaz = b.iy(properties.getProperty("blend"));
        this.cGM = this.b(properties.getProperty("speed"), 0.0f);
        this.eaA = this.b(properties.getProperty("rotation"), 0.0f);
        this.eaB = this.x(properties.getProperty("layer"), 0);
        this.biW = this.x(properties.getProperty("weight"), 0);
        this.eaC = this.b(properties.getProperty("duration"), 1.0f);
    }

    private static String gQ(String string) {
        int n2;
        String string2 = string;
        int n3 = string.lastIndexOf(47);
        if (n3 >= 0) {
            string2 = string.substring(n3 + 1);
        }
        if ((n2 = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    private static String gR(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    private int dG(String string) {
        if (string == null) {
            return 1;
        }
        if (string.equals("item")) {
            return 1;
        }
        if (string.equals("enchantment")) {
            return 2;
        }
        if (string.equals("armor")) {
            return 3;
        }
        a.warn("Unknown method: " + string);
        return 0;
    }

    private int[] ac(String string, String string2) {
        int n2;
        Object object;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            return null;
        }
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n3;
            String[] stringArray2;
            object = stringArray[i2];
            n2 = a.x((String)object, -1);
            if (n2 >= 0) {
                treeSet.add(new Integer(n2));
                continue;
            }
            if (((String)object).contains("-") && (stringArray2 = a.V((String)object, "-")).length == 2) {
                n3 = a.x(stringArray2[0], -1);
                int n4 = a.x(stringArray2[1], -1);
                if (n3 >= 0 && n4 >= 0) {
                    int n5 = Math.min(n3, n4);
                    int n6 = Math.max(n3, n4);
                    for (int i3 = n5; i3 <= n6; ++i3) {
                        treeSet.add(new Integer(i3));
                    }
                    continue;
                }
            }
            if ((stringArray2 = d.et((String)object)) == null) {
                a.warn("Item not found: " + (String)object);
                continue;
            }
            n3 = d.p((d)stringArray2);
            if (n3 <= 0) {
                a.warn("Item not found: " + (String)object);
                continue;
            }
            treeSet.add(new Integer(n3));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        object = new int[integerArray.length];
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            object[n2] = integerArray[n2];
        }
        return object;
    }

    private static String a(String string, String string2, String string3, String string4, String string5, int n2, Map<String, String> map, boolean bl2) {
        int n3;
        String string6;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            string = string3;
        }
        if (string != null) {
            String string7 = ".png";
            if (string.endsWith(".png")) {
                string = string.substring(0, string.length() - ".png".length());
            }
            string = ad.aa(string, string5);
            return string;
        }
        if (n2 == 3) {
            return null;
        }
        if (map != null && (string6 = map.get("texture.bow_standby")) != null) {
            return string6;
        }
        if (!bl2) {
            return null;
        }
        string6 = string4;
        int n4 = string4.lastIndexOf(47);
        if (n4 >= 0) {
            string6 = string4.substring(n4 + 1);
        }
        if ((n3 = string6.lastIndexOf(46)) >= 0) {
            string6 = string6.substring(0, n3);
        }
        string6 = ad.aa(string6, string5);
        return string6;
    }

    private static Map d(Properties properties, String string) {
        String string2 = "texture.";
        Map map = ad.f(properties, "texture.");
        if (map.size() <= 0) {
            return null;
        }
        Set set = map.keySet();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (Object k2 : set) {
            String string3 = (String)k2;
            String string4 = (String)map.get(string3);
            string4 = ad.aa(string4, string);
            linkedHashMap.put(string3, string4);
        }
        return linkedHashMap;
    }

    private static String aa(String object, String string) {
        if (!(((String)(object = ak.M((String)object, string))).startsWith(string) || ((String)object).startsWith("textures/") || ((String)object).startsWith("mcpatcher/"))) {
            object = string + "/" + (String)object;
        }
        if (((String)object).endsWith(".png")) {
            object = ((String)object).substring(0, ((String)object).length() - 4);
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    private static String a(String string, String string2, String string3, int n2, Map<String, String> map) {
        String string4;
        if (string != null) {
            String string5 = ".json";
            if (string.endsWith(".json")) {
                string = string.substring(0, string.length() - ".json".length());
            }
            string = ad.ad(string, string3);
            return string;
        }
        if (n2 == 3) {
            return null;
        }
        if (map != null && (string4 = map.get("model.bow_standby")) != null) {
            return string4;
        }
        return string;
    }

    private static Map e(Properties properties, String string) {
        String string2 = "model.";
        Map map = ad.f(properties, "model.");
        if (map.size() <= 0) {
            return null;
        }
        Set set = map.keySet();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (Object k2 : set) {
            String string3 = (String)k2;
            String string4 = (String)map.get(string3);
            string4 = ad.ad(string4, string);
            linkedHashMap.put(string3, string4);
        }
        return linkedHashMap;
    }

    private static String ad(String object, String string) {
        boolean bl2;
        boolean bl3 = bl2 = ((String)(object = ak.M((String)object, string))).startsWith("block/") || ((String)object).startsWith("item/");
        if (!(((String)object).startsWith(string) || bl2 || ((String)object).startsWith("mcpatcher/"))) {
            object = string + "/" + (String)object;
        }
        String string2 = ".json";
        if (((String)object).endsWith(".json")) {
            object = ((String)object).substring(0, ((String)object).length() - ".json".length());
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    private int x(String string, int n2) {
        if (string == null) {
            return n2;
        }
        int n3 = a.x(string = string.trim(), Integer.MIN_VALUE);
        if (n3 == Integer.MIN_VALUE) {
            a.warn("Invalid integer: " + string);
            return n2;
        }
        return n3;
    }

    private float b(String string, float f2) {
        if (string == null) {
            return f2;
        }
        float f3 = a.b(string = string.trim(), Float.MIN_VALUE);
        if (f3 == Float.MIN_VALUE) {
            a.warn("Invalid float: " + string);
            return f2;
        }
        return f3;
    }

    private o hx(String string) {
        return this.a(string, null);
    }

    private o a(String string, h h2) {
        if (string == null) {
            return null;
        }
        String[] stringArray = a.V(string, " ");
        o o2 = new o();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n2;
            String string2 = stringArray[i2];
            if (h2 != null && (n2 = h2.P(string2, Integer.MIN_VALUE)) != Integer.MIN_VALUE) {
                o2.a(new n(n2, n2));
                continue;
            }
            n n3 = this.hy(string2);
            if (n3 == null) {
                a.warn("Invalid range list: " + string);
                return null;
            }
            o2.a(n3);
        }
        return o2;
    }

    private n hy(String string) {
        int n2;
        if (string == null) {
            return null;
        }
        int n3 = (string = string.trim()).length() - string.replace("-", "").length();
        if (n3 > 1) {
            a.warn("Invalid range: " + string);
            return null;
        }
        String[] stringArray = a.V(string, "- ");
        int[] nArray = new int[stringArray.length];
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            String string2 = stringArray[n2];
            int n4 = a.x(string2, -1);
            if (n4 < 0) {
                a.warn("Invalid range: " + string);
                return null;
            }
            nArray[n2] = n4;
        }
        if (nArray.length == 1) {
            n2 = nArray[0];
            if (string.startsWith("-")) {
                return new n(0, n2);
            }
            if (string.endsWith("-")) {
                return new n(n2, 65535);
            }
            return new n(n2, n2);
        }
        if (nArray.length == 2) {
            n2 = Math.min(nArray[0], nArray[1]);
            int n5 = Math.max(nArray[0], nArray[1]);
            return new n(n2, n5);
        }
        a.warn("Invalid range: " + string);
        return null;
    }

    private l[] b(Properties properties) {
        String string = "nbt.";
        Map map = ad.f(properties, "nbt.");
        if (map.size() <= 0) {
            return null;
        }
        ArrayList<l> arrayList = new ArrayList<l>();
        for (Object k2 : map.keySet()) {
            String string2 = (String)k2;
            String string3 = (String)map.get(string2);
            String string4 = string2.substring("nbt.".length());
            l l2 = new l(string4, string3);
            arrayList.add(l2);
        }
        l[] lArray = arrayList.toArray(new l[arrayList.size()]);
        return lArray;
    }

    private static Map f(Properties properties, String string) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (Object object : properties.keySet()) {
            String string2 = (String)object;
            String string3 = properties.getProperty(string2);
            if (!string2.startsWith(string)) continue;
            linkedHashMap.put(string2, string3);
        }
        return linkedHashMap;
    }

    private int hz(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.toLowerCase()).equals("any")) {
            return 0;
        }
        if (string.equals("main")) {
            return 1;
        }
        if (string.equals("off")) {
            return 2;
        }
        a.warn("Invalid hand: " + string);
        return 0;
    }

    public boolean gY(String string) {
        if (this.gK != null && this.gK.length() > 0) {
            if (this.bZI == null) {
                a.warn("No base path found: " + string);
                return false;
            }
            if (this.bif == 0) {
                a.warn("No type defined: " + string);
                return false;
            }
            if (this.bif == 1 || this.bif == 3) {
                if (this.ean == null) {
                    this.ean = this.aAH();
                }
                if (this.ean == null) {
                    a.warn("No items defined: " + string);
                    return false;
                }
            }
            if (this.bQJ == null && this.eao == null && this.eap == null && this.eaq == null) {
                a.warn("No texture or model specified: " + string);
                return false;
            }
            if (this.bif == 2 && this.eav == null) {
                a.warn("No enchantmentIDs specified: " + string);
                return false;
            }
            return true;
        }
        a.warn("No name found: " + string);
        return false;
    }

    private int[] aAH() {
        int[] nArray;
        d d2 = d.et(this.gK);
        if (d2 == null) {
            return null;
        }
        int n2 = d.p(d2);
        if (n2 <= 0) {
            nArray = null;
        } else {
            int[] nArray2 = new int[1];
            nArray = nArray2;
            nArray2[0] = n2;
        }
        return nArray;
    }

    public void b(TextureMap textureMap) {
        if (this.bQJ != null) {
            this.bCa = this.hA(this.bQJ);
            if (this.bif == 1) {
                cm cm2 = this.J(this.bCa);
                this.bQt = textureMap.n(cm2);
            }
        }
        if (this.eao != null) {
            this.eaD = new HashMap();
            this.eaE = new HashMap();
            for (String string : this.eao.keySet()) {
                String string2 = this.eao.get(string);
                cm cm3 = this.hA(string2);
                this.eaD.put(string, cm3);
                if (this.bif != 1) continue;
                cm cm4 = this.J(cm3);
                TextureAtlasSprite textureAtlasSprite = textureMap.n(cm4);
                this.eaE.put(string, textureAtlasSprite);
            }
        }
    }

    private cm hA(String string) {
        String string2;
        cm cm2;
        boolean bl2;
        if (string == null) {
            return null;
        }
        cm cm3 = new cm(string);
        String string3 = cm3.atB();
        Object object = cm3.atA();
        if (!((String)object).contains("/")) {
            object = "textures/items/" + (String)object;
        }
        if (!(bl2 = a.F(cm2 = new cm(string3, string2 = (String)object + ".png")))) {
            a.warn("File not found: " + string2);
        }
        return cm2;
    }

    private cm J(cm cm2) {
        String string = cm2.atA();
        string = aj.ax(string, "textures/");
        string = aj.ay(string, ".png");
        cm cm3 = new cm(cm2.atB(), string);
        return cm3;
    }

    public void a(TextureMap textureMap, ItemModelGenerator itemModelGenerator) {
        if (this.bQJ != null || this.eao != null) {
            String[] stringArray = this.aAJ();
            boolean bl2 = this.aAI();
            this.eaF = ad.a(textureMap, itemModelGenerator, stringArray, bl2);
            if (this.bif == 1 && this.eao != null) {
                for (String string : this.eao.keySet()) {
                    String string2 = this.eao.get(string);
                    String string3 = aj.ax(string, "texture.");
                    if (!string3.startsWith("bow") && !string3.startsWith("fishing_rod") && !string3.startsWith("shield")) continue;
                    String[] stringArray2 = new String[]{string2};
                    IBakedModel iBakedModel = ad.a(textureMap, itemModelGenerator, stringArray2, bl2);
                    if (this.eaG == null) {
                        this.eaG = new HashMap<String, IBakedModel>();
                    }
                    String string4 = "item/" + string3;
                    this.eaG.put(string4, iBakedModel);
                }
            }
        }
    }

    private boolean aAI() {
        return true;
    }

    private static IBakedModel a(TextureMap textureMap, ItemModelGenerator itemModelGenerator, String[] stringArray, boolean bl2) {
        Object object;
        String[] stringArray2 = new String[stringArray.length];
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            object = stringArray[i2];
            stringArray2[i2] = aj.ax((String)object, "textures/");
        }
        ModelBlock modelBlock = ad.l(stringArray2);
        object = itemModelGenerator.a(textureMap, modelBlock);
        IBakedModel iBakedModel = ad.a(textureMap, (ModelBlock)object, bl2);
        return iBakedModel;
    }

    private String[] aAJ() {
        if (this.bif == 1 && this.ean.length == 1) {
            y y2;
            d d2 = d.fT(this.ean[0]);
            if (d2 == Items.cRD && this.ear != null && this.ear.aCa() > 0) {
                n n2 = this.ear.ju(0);
                int n3 = n2.aBY();
                boolean bl2 = (n3 & 0x4000) != 0;
                String string = this.a(this.eao, "texture.potion_overlay", "items/potion_overlay");
                String string2 = null;
                string2 = bl2 ? this.a(this.eao, "texture.potion_bottle_splash", "items/potion_bottle_splash") : this.a(this.eao, "texture.potion_bottle_drinkable", "items/potion_bottle_drinkable");
                return new String[]{string, string2};
            }
            if (d2 instanceof y && (y2 = (y)d2).adN() == aa.cVL) {
                String string = "leather";
                String string3 = "helmet";
                if (y2.cVH == 0) {
                    string3 = "helmet";
                }
                if (y2.cVH == 1) {
                    string3 = "chestplate";
                }
                if (y2.cVH == 2) {
                    string3 = "leggings";
                }
                if (y2.cVH == 3) {
                    string3 = "boots";
                }
                String string4 = "leather_" + string3;
                String string5 = this.a(this.eao, "texture." + string4, "items/" + string4);
                String string6 = this.a(this.eao, "texture." + string4 + "_overlay", "items/" + string4 + "_overlay");
                return new String[]{string5, string6};
            }
        }
        return new String[]{this.bQJ};
    }

    private String a(Map<String, String> map, String string, String string2) {
        if (map == null) {
            return string2;
        }
        String string3 = map.get(string);
        return string3 == null ? string2 : string3;
    }

    private static ModelBlock l(String[] stringArray) {
        Object object;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\"parent\": \"builtin/generated\",\"textures\": {");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            object = stringArray[i2];
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"layer").append(i2).append("\": \"").append((String)object).append("\"");
        }
        stringBuffer.append("}}");
        String string = stringBuffer.toString();
        object = ModelBlock.dh(string);
        return object;
    }

    private static IBakedModel a(TextureMap textureMap, ModelBlock modelBlock, boolean bl2) {
        ModelRotation modelRotation = ModelRotation.cfs;
        boolean bl3 = false;
        String string = modelBlock.dj("particle");
        TextureAtlasSprite textureAtlasSprite = textureMap.dq(new cm(string).toString());
        SimpleBakedModel$Builder simpleBakedModel$Builder = new SimpleBakedModel$Builder(modelBlock).i(textureAtlasSprite);
        for (BlockPart blockPart : modelBlock.Mp()) {
            for (ao ao2 : blockPart.bQC.keySet()) {
                BlockPartFace blockPartFace = blockPart.bQC.get(ao2);
                if (!bl2) {
                    blockPartFace = new BlockPartFace(blockPartFace.bQH, -1, blockPartFace.bQJ, blockPartFace.bQK);
                }
                String string2 = modelBlock.dj(blockPartFace.bQJ);
                TextureAtlasSprite textureAtlasSprite2 = textureMap.dq(new cm(string2).toString());
                BakedQuad bakedQuad = ad.a(blockPart, blockPartFace, textureAtlasSprite2, ao2, modelRotation, false);
                if (blockPartFace.bQH == null) {
                    simpleBakedModel$Builder.a(bakedQuad);
                    continue;
                }
                simpleBakedModel$Builder.a(modelRotation.q(blockPartFace.bQH), bakedQuad);
            }
        }
        return simpleBakedModel$Builder.QF();
    }

    private static BakedQuad a(BlockPart blockPart, BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, ModelRotation modelRotation, boolean bl2) {
        FaceBakery faceBakery = new FaceBakery();
        return faceBakery.a(blockPart.bQA, blockPart.bQB, blockPartFace, textureAtlasSprite, ao2, modelRotation, blockPart.bQD, bl2, blockPart.bQE);
    }

    public String toString() {
        return this.bZI + "/" + this.gK + ", type: " + this.bif + ", items: [" + a.k(this.ean) + "], textture: " + this.bQJ;
    }

    public float c(TextureManager textureManager) {
        if (this.bys <= 0) {
            if (this.bCa != null) {
                ITextureObject iTextureObject = textureManager.k(this.bCa);
                int n2 = iTextureObject.Ll();
                int n3 = GlStateManager.Kc();
                GlStateManager.ap(n2);
                this.bys = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4096);
                GlStateManager.ap(n3);
            }
            if (this.bys <= 0) {
                this.bys = 16;
            }
        }
        return this.bys;
    }

    public float d(TextureManager textureManager) {
        if (this.byt <= 0) {
            if (this.bCa != null) {
                ITextureObject iTextureObject = textureManager.k(this.bCa);
                int n2 = iTextureObject.Ll();
                int n3 = GlStateManager.Kc();
                GlStateManager.ap(n2);
                this.byt = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4097);
                GlStateManager.ap(n3);
            }
            if (this.byt <= 0) {
                this.byt = 16;
            }
        }
        return this.byt;
    }

    public IBakedModel a(cm cm2, boolean bl2) {
        String string;
        IBakedModel iBakedModel;
        Map<String, IBakedModel> map;
        IBakedModel iBakedModel2;
        if (bl2) {
            iBakedModel2 = this.eaH;
            map = this.eaI;
        } else {
            iBakedModel2 = this.eaF;
            map = this.eaG;
        }
        if (cm2 != null && map != null && (iBakedModel = map.get(string = cm2.atA())) != null) {
            return iBakedModel;
        }
        return iBakedModel2;
    }

    public void a(ModelBakery modelBakery) {
        if (this.eap != null) {
            ad.a(modelBakery, this.eap);
        }
        if (this.bif == 1 && this.eaq != null) {
            for (String string : this.eaq.keySet()) {
                String string2 = this.eaq.get(string);
                String string3 = aj.ax(string, "model.");
                if (!string3.startsWith("bow") && !string3.startsWith("fishing_rod") && !string3.startsWith("shield")) continue;
                ad.a(modelBakery, string2);
            }
        }
    }

    public void aAK() {
        ModelManager modelManager = a.IV();
        IBakedModel iBakedModel = modelManager.QA();
        if (this.eap != null) {
            cm cm2 = ad.hB(this.eap);
            ModelResourceLocation object = new ModelResourceLocation(cm2, eaQ);
            this.eaH = modelManager.a(object);
            if (this.eaH == iBakedModel) {
                a.warn("Custom Items: Model not found " + object.atA());
                this.eaH = null;
            }
        }
        if (this.bif == 1 && this.eaq != null) {
            for (String string : this.eaq.keySet()) {
                String string2 = this.eaq.get(string);
                String string3 = aj.ax(string, "model.");
                if (!string3.startsWith("bow") && !string3.startsWith("fishing_rod") && !string3.startsWith("shield")) continue;
                cm cm2 = ad.hB(string2);
                ModelResourceLocation modelResourceLocation = new ModelResourceLocation(cm2, eaQ);
                IBakedModel iBakedModel2 = modelManager.a(modelResourceLocation);
                if (iBakedModel2 == iBakedModel) {
                    a.warn("Custom Items: Model not found " + modelResourceLocation.atA());
                    continue;
                }
                if (this.eaI == null) {
                    this.eaI = new HashMap<String, IBakedModel>();
                }
                String string4 = "item/" + string3;
                this.eaI.put(string4, iBakedModel2);
            }
        }
    }

    private static void a(ModelBakery modelBakery, String string) {
        cm cm2 = ad.hB(string);
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(cm2, eaQ);
        if (g.equ.aDA()) {
            try {
                Object object = g.eqA.wD();
                ad.a(object, "vanillaLoader is null");
                Object object2 = g.g(object, g.eqB, modelResourceLocation);
                ad.a(object2, "iModel is null");
                Map map = (Map)g.a(modelBakery, g.eqv);
                ad.a(map, "stateModels is null");
                map.put(modelResourceLocation, object2);
                Set set = (Set)g.a(modelBakery, g.eqy);
                ad.a(set, "registryTextures is null");
                Collection collection = (Collection)g.g(object2, g.epY, new Object[0]);
                ad.a(collection, "modelTextures is null");
                set.addAll(collection);
            }
            catch (Exception exception) {
                a.warn("Error registering model with ModelLoader: " + String.valueOf(modelResourceLocation) + ", " + exception.getClass().getName() + ": " + exception.getMessage());
            }
        } else {
            modelBakery.a(cm2.toString(), modelResourceLocation, cm2);
        }
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new NullPointerException(string);
        }
    }

    private static cm hB(String string) {
        return g.equ.aDA() && !string.startsWith("mcpatcher/") && !string.startsWith("optifine/") ? new cm("models/" + string) : new cm(string);
    }
}

