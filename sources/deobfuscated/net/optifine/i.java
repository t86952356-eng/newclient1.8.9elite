/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import net.minecraft.util.av;
import net.minecraft.util.cm;
import net.optifine.config.a;
import net.optifine.config.k;
import net.optifine.config.l;
import net.optifine.config.n;
import net.optifine.config.o;
import net.optifine.j;
import net.optifine.util.ak;
import net.optifine.util.z;

public class i {
    public String gK = null;
    public String bZI = null;
    public net.optifine.config.j[] dVI = null;
    public int[] dVJ = null;
    public String[] dVK = null;
    public int dVL = 0;
    public String[] dVM = null;
    public int dVN = 0;
    public int dVO = 63;
    public net.minecraft.world.biome.j[] dEV = null;
    public o dVP = null;
    public int dVQ = 0;
    public boolean dVR = false;
    public int[] dVS = null;
    public int width = 0;
    public int height = 0;
    public int[] dVT = null;
    public int dVU = 0;
    public int dVV = 1;
    public boolean dVW = false;
    public l dVX = null;
    public int[] dVY = null;
    public int dVZ = 1;
    public TextureAtlasSprite[] dWa = null;
    public TextureAtlasSprite[] dWb = null;
    public net.optifine.config.j[] dWc = null;
    public String[] dWd = null;
    public TextureAtlasSprite[] dWe = null;
    public int bQs = -1;
    public IBlockState dWf = Blocks.cLc.xM();
    public av dWg = null;
    public static final int dWh = 0;
    public static final int dWi = 1;
    public static final int dWj = 2;
    public static final int dWk = 3;
    public static final int dWl = 4;
    public static final int dWm = 5;
    public static final int dWn = 6;
    public static final int dWo = 7;
    public static final int dWp = 8;
    public static final int dWq = 9;
    public static final int dWr = 10;
    public static final int dWs = 11;
    public static final int dWt = 12;
    public static final int dWu = 13;
    public static final int dWv = 14;
    public static final int dWw = 15;
    public static final int dWx = 0;
    public static final int dWy = 1;
    public static final int dWz = 2;
    public static final int dWA = 3;
    public static final int dWB = 128;
    public static final int dWC = 1;
    public static final int dWD = 2;
    public static final int dWE = 4;
    public static final int dWF = 8;
    public static final int dWG = 16;
    public static final int dWH = 32;
    public static final int dWI = 60;
    public static final int dWJ = 63;
    public static final int dWK = 128;
    public static final int dWL = 1;
    public static final int dWM = 2;
    public static final int dWN = 6;
    public static final int dWO = 128;
    public static final String dWP = "<skip>.png";
    public static final String dWQ = "<default>.png";

    public i(Properties properties, String string) {
        a a2 = new a("ConnectedTextures");
        this.gK = a2.gQ(string);
        this.bZI = a2.gR(string);
        this.dVI = a2.hJ(properties.getProperty("matchBlocks"));
        this.dVJ = a2.hO(properties.getProperty("metadata"));
        this.dVK = this.gP(properties.getProperty("matchTiles"));
        this.dVL = i.gX(properties.getProperty("method"));
        this.dVM = this.gS(properties.getProperty("tiles"));
        this.dVN = i.gW(properties.getProperty("connect"));
        this.dVO = i.gU(properties.getProperty("faces"));
        this.dEV = a2.hM(properties.getProperty("biomes"));
        this.dVP = a2.hx(properties.getProperty("heights"));
        if (this.dVP == null) {
            int n2 = a2.x(properties.getProperty("minHeight"), -1);
            int n3 = a2.x(properties.getProperty("maxHeight"), 1024);
            if (n2 != -1 || n3 != 1024) {
                this.dVP = new o(new n(n2, n3));
            }
        }
        this.dVQ = a2.x(properties.getProperty("renderPass"), -1);
        this.dVR = a2.p(properties.getProperty("innerSeams"), false);
        this.dVS = this.a(properties);
        this.width = a2.x(properties.getProperty("width"), -1);
        this.height = a2.x(properties.getProperty("height"), -1);
        this.dVT = a2.hO(properties.getProperty("weights"));
        this.dVU = a2.x(properties.getProperty("randomLoops"), 0);
        this.dVV = i.gT(properties.getProperty("symmetry"));
        this.dVW = a2.p(properties.getProperty("linked"), false);
        this.dVX = a2.ag("name", properties.getProperty("name"));
        this.dWc = a2.hJ(properties.getProperty("connectBlocks"));
        this.dWd = this.gP(properties.getProperty("connectTiles"));
        this.bQs = a2.x(properties.getProperty("tintIndex"), -1);
        this.dWf = a2.a(properties.getProperty("tintBlock"), Blocks.cLc.xM());
        this.dWg = a2.a(properties.getProperty("layer"), av.dxW);
    }

    private int[] a(Properties properties) {
        if (this.dVM == null) {
            return null;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Object object : properties.keySet()) {
            if (!(object instanceof String)) continue;
            String string = (String)object;
            String string2 = "ctm.";
            if (!string.startsWith("ctm.")) continue;
            String string3 = string.substring("ctm.".length());
            String string4 = properties.getProperty(string);
            if (string4 == null) continue;
            string4 = string4.trim();
            int n2 = net.minecraft.src.a.x(string3, -1);
            if (n2 >= 0 && n2 <= 46) {
                int n3 = net.minecraft.src.a.x(string4, -1);
                if (n3 >= 0 && n3 < this.dVM.length) {
                    hashMap.put(n2, n3);
                    continue;
                }
                net.minecraft.src.a.warn("Invalid CTM tile index: " + string4);
                continue;
            }
            net.minecraft.src.a.warn("Invalid CTM index: " + string3);
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        Object object = new int[47];
        for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
            object[i2] = -1;
            if (!hashMap.containsKey(i2)) continue;
            object[i2] = (Integer)hashMap.get(i2);
        }
        return object;
    }

    private String[] gP(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.endsWith(".png")) {
                string2 = string2.substring(0, string2.length() - 4);
            }
            stringArray[i2] = string2 = ak.M(string2, this.bZI);
        }
        return stringArray;
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

    private String[] gS(String string) {
        String[] stringArray;
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : stringArray = net.minecraft.src.a.V(string, " ,")) {
            String[] stringArray2;
            if (string2.contains("-") && (stringArray2 = net.minecraft.src.a.V(string2, "-")).length == 2) {
                int n2 = net.minecraft.src.a.x(stringArray2[0], -1);
                int n3 = net.minecraft.src.a.x(stringArray2[1], -1);
                if (n2 >= 0 && n3 >= 0) {
                    if (n2 > n3) {
                        net.minecraft.src.a.warn("Invalid interval: " + string2 + ", when parsing: " + string);
                        continue;
                    }
                    for (int i2 = n2; i2 <= n3; ++i2) {
                        arrayList.add(String.valueOf(i2));
                    }
                    continue;
                }
            }
            arrayList.add(string2);
        }
        String[] stringArray3 = arrayList.toArray(new String[arrayList.size()]);
        for (int i3 = 0; i3 < stringArray3.length; ++i3) {
            Object object = stringArray3[i3];
            if (!(((String)(object = ak.M((String)object, this.bZI))).startsWith(this.bZI) || ((String)object).startsWith("textures/") || ((String)object).startsWith("mcpatcher/"))) {
                object = this.bZI + "/" + (String)object;
            }
            if (((String)object).endsWith(".png")) {
                object = ((String)object).substring(0, ((String)object).length() - 4);
            }
            if (((String)object).startsWith("/")) {
                object = ((String)object).substring(1);
            }
            stringArray3[i3] = object;
        }
        return stringArray3;
    }

    private static int gT(String string) {
        if (string == null) {
            return 1;
        }
        if ((string = string.trim()).equals("opposite")) {
            return 2;
        }
        if (string.equals("all")) {
            return 6;
        }
        net.minecraft.src.a.warn("Unknown symmetry: " + string);
        return 1;
    }

    private static int gU(String string) {
        if (string == null) {
            return 63;
        }
        String[] stringArray = net.minecraft.src.a.V(string, " ,");
        int n2 = 0;
        for (String string2 : stringArray) {
            int n3 = i.gV(string2);
            n2 |= n3;
        }
        return n2;
    }

    private static int gV(String string) {
        if (!(string = string.toLowerCase()).equals("bottom") && !string.equals("down")) {
            if (!string.equals("top") && !string.equals("up")) {
                switch (string) {
                    case "north": {
                        return 4;
                    }
                    case "south": {
                        return 8;
                    }
                    case "east": {
                        return 32;
                    }
                    case "west": {
                        return 16;
                    }
                    case "sides": {
                        return 60;
                    }
                    case "all": {
                        return 63;
                    }
                }
                net.minecraft.src.a.warn("Unknown face: " + string);
                return 128;
            }
            return 2;
        }
        return 1;
    }

    private static int gW(String string) {
        if (string == null) {
            return 0;
        }
        switch (string = string.trim()) {
            case "block": {
                return 1;
            }
            case "tile": {
                return 2;
            }
            case "material": {
                return 3;
            }
        }
        net.minecraft.src.a.warn("Unknown connect: " + string);
        return 128;
    }

    public static IProperty b(String string, Collection collection) {
        for (Object e2 : collection) {
            IProperty iProperty = (IProperty)e2;
            if (!string.equals(iProperty.getName())) continue;
            return iProperty;
        }
        return null;
    }

    private static int gX(String string) {
        if (string == null) {
            return 1;
        }
        if (!(string = string.trim()).equals("ctm") && !string.equals("glass")) {
            if (string.equals("ctm_compact")) {
                return 10;
            }
            if (!string.equals("horizontal") && !string.equals("bookshelf")) {
                switch (string) {
                    case "vertical": {
                        return 6;
                    }
                    case "top": {
                        return 3;
                    }
                    case "random": {
                        return 4;
                    }
                    case "repeat": {
                        return 5;
                    }
                    case "fixed": {
                        return 7;
                    }
                }
                if (!string.equals("horizontal+vertical") && !string.equals("h+v")) {
                    if (!string.equals("vertical+horizontal") && !string.equals("v+h")) {
                        switch (string) {
                            case "overlay": {
                                return 11;
                            }
                            case "overlay_fixed": {
                                return 12;
                            }
                            case "overlay_random": {
                                return 13;
                            }
                            case "overlay_repeat": {
                                return 14;
                            }
                            case "overlay_ctm": {
                                return 15;
                            }
                        }
                        net.minecraft.src.a.warn("Unknown method: " + string);
                        return 0;
                    }
                    return 9;
                }
                return 8;
            }
            return 2;
        }
        return 1;
    }

    public boolean gY(String string) {
        if (this.gK != null && this.gK.length() > 0) {
            if (this.bZI == null) {
                net.minecraft.src.a.warn("No base path found: " + string);
                return false;
            }
            if (this.dVI == null) {
                this.dVI = this.aAl();
            }
            if (this.dVK == null && this.dVI == null) {
                this.dVK = this.aAn();
            }
            if (this.dVI == null && this.dVK == null) {
                net.minecraft.src.a.warn("No matchBlocks or matchTiles specified: " + string);
                return false;
            }
            if (this.dVL == 0) {
                net.minecraft.src.a.warn("No method: " + string);
                return false;
            }
            if (this.dVM != null && this.dVM.length > 0) {
                if (this.dVN == 0) {
                    this.dVN = this.aAk();
                }
                if (this.dVN == 128) {
                    net.minecraft.src.a.warn("Invalid connect in: " + string);
                    return false;
                }
                if (this.dVQ > 0) {
                    net.minecraft.src.a.warn("Render pass not supported: " + this.dVQ);
                    return false;
                }
                if ((this.dVO & 0x80) != 0) {
                    net.minecraft.src.a.warn("Invalid faces in: " + string);
                    return false;
                }
                if ((this.dVV & 0x80) != 0) {
                    net.minecraft.src.a.warn("Invalid symmetry in: " + string);
                    return false;
                }
                switch (this.dVL) {
                    case 1: {
                        return this.ha(string);
                    }
                    case 2: {
                        return this.hh(string);
                    }
                    case 3: {
                        return this.ho(string);
                    }
                    case 4: {
                        return this.hl(string);
                    }
                    case 5: {
                        return this.hm(string);
                    }
                    case 6: {
                        return this.hi(string);
                    }
                    case 7: {
                        return this.hn(string);
                    }
                    case 8: {
                        return this.hj(string);
                    }
                    case 9: {
                        return this.hk(string);
                    }
                    case 10: {
                        return this.hb(string);
                    }
                    case 11: {
                        return this.hc(string);
                    }
                    case 12: {
                        return this.hd(string);
                    }
                    case 13: {
                        return this.he(string);
                    }
                    case 14: {
                        return this.hf(string);
                    }
                    case 15: {
                        return this.hg(string);
                    }
                }
                net.minecraft.src.a.warn("Unknown method: " + string);
                return false;
            }
            net.minecraft.src.a.warn("No tiles specified: " + string);
            return false;
        }
        net.minecraft.src.a.warn("No name found: " + string);
        return false;
    }

    private int aAk() {
        return this.dVI != null ? 1 : (this.dVK != null ? 2 : 128);
    }

    private net.optifine.config.j[] aAl() {
        int[] nArray = this.aAm();
        if (nArray == null) {
            return null;
        }
        net.optifine.config.j[] jArray = new net.optifine.config.j[nArray.length];
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            jArray[i2] = new net.optifine.config.j(nArray[i2]);
        }
        return jArray;
    }

    private int[] aAm() {
        int[] nArray;
        int n2;
        char c2;
        int n3;
        if (!this.gK.startsWith("block")) {
            return null;
        }
        for (n3 = n2 = "block".length(); n3 < this.gK.length() && (c2 = this.gK.charAt(n3)) >= '0' && c2 <= '9'; ++n3) {
        }
        if (n3 == n2) {
            return null;
        }
        String string = this.gK.substring(n2, n3);
        int n4 = net.minecraft.src.a.x(string, -1);
        if (n4 < 0) {
            nArray = null;
        } else {
            int[] nArray2 = new int[1];
            nArray = nArray2;
            nArray2[0] = n4;
        }
        return nArray;
    }

    private String[] aAn() {
        String[] stringArray;
        TextureAtlasSprite textureAtlasSprite = i.gZ(this.gK);
        if (textureAtlasSprite == null) {
            stringArray = null;
        } else {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = this.gK;
        }
        return stringArray;
    }

    private static TextureAtlasSprite gZ(String string) {
        TextureMap textureMap = Minecraft.getMinecraft().Bu();
        TextureAtlasSprite textureAtlasSprite = textureMap.dt(string);
        if (textureAtlasSprite != null) {
            return textureAtlasSprite;
        }
        textureAtlasSprite = textureMap.dt("blocks/" + string);
        return textureAtlasSprite;
    }

    private boolean ha(String string) {
        if (this.dVM == null) {
            this.dVM = this.gS("0-11 16-27 32-43 48-58");
        }
        if (this.dVM.length < 47) {
            net.minecraft.src.a.warn("Invalid tiles, must be at least 47: " + string);
            return false;
        }
        return true;
    }

    private boolean hb(String string) {
        if (this.dVM == null) {
            this.dVM = this.gS("0-4");
        }
        if (this.dVM.length < 5) {
            net.minecraft.src.a.warn("Invalid tiles, must be at least 5: " + string);
            return false;
        }
        return true;
    }

    private boolean hc(String string) {
        if (this.dVM == null) {
            this.dVM = this.gS("0-16");
        }
        if (this.dVM.length < 17) {
            net.minecraft.src.a.warn("Invalid tiles, must be at least 17: " + string);
            return false;
        }
        if (this.dWg != null && this.dWg != av.dxV) {
            return true;
        }
        net.minecraft.src.a.warn("Invalid overlay layer: " + String.valueOf((Object)this.dWg));
        return false;
    }

    private boolean hd(String string) {
        if (!this.hn(string)) {
            return false;
        }
        if (this.dWg != null && this.dWg != av.dxV) {
            return true;
        }
        net.minecraft.src.a.warn("Invalid overlay layer: " + String.valueOf((Object)this.dWg));
        return false;
    }

    private boolean he(String string) {
        if (!this.hl(string)) {
            return false;
        }
        if (this.dWg != null && this.dWg != av.dxV) {
            return true;
        }
        net.minecraft.src.a.warn("Invalid overlay layer: " + String.valueOf((Object)this.dWg));
        return false;
    }

    private boolean hf(String string) {
        if (!this.hm(string)) {
            return false;
        }
        if (this.dWg != null && this.dWg != av.dxV) {
            return true;
        }
        net.minecraft.src.a.warn("Invalid overlay layer: " + String.valueOf((Object)this.dWg));
        return false;
    }

    private boolean hg(String string) {
        if (!this.ha(string)) {
            return false;
        }
        if (this.dWg != null && this.dWg != av.dxV) {
            return true;
        }
        net.minecraft.src.a.warn("Invalid overlay layer: " + String.valueOf((Object)this.dWg));
        return false;
    }

    private boolean hh(String string) {
        if (this.dVM == null) {
            this.dVM = this.gS("12-15");
        }
        if (this.dVM.length != 4) {
            net.minecraft.src.a.warn("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    private boolean hi(String string) {
        if (this.dVM == null) {
            net.minecraft.src.a.warn("No tiles defined for vertical: " + string);
            return false;
        }
        if (this.dVM.length != 4) {
            net.minecraft.src.a.warn("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    private boolean hj(String string) {
        if (this.dVM == null) {
            net.minecraft.src.a.warn("No tiles defined for horizontal+vertical: " + string);
            return false;
        }
        if (this.dVM.length != 7) {
            net.minecraft.src.a.warn("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private boolean hk(String string) {
        if (this.dVM == null) {
            net.minecraft.src.a.warn("No tiles defined for vertical+horizontal: " + string);
            return false;
        }
        if (this.dVM.length != 7) {
            net.minecraft.src.a.warn("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private boolean hl(String string) {
        if (this.dVM != null && this.dVM.length > 0) {
            if (this.dVT != null) {
                int n2;
                int[] nArray;
                if (this.dVT.length > this.dVM.length) {
                    net.minecraft.src.a.warn("More weights defined than tiles, trimming weights: " + string);
                    nArray = new int[this.dVM.length];
                    System.arraycopy(this.dVT, 0, nArray, 0, nArray.length);
                    this.dVT = nArray;
                }
                if (this.dVT.length < this.dVM.length) {
                    net.minecraft.src.a.warn("Less weights defined than tiles, expanding weights: " + string);
                    nArray = new int[this.dVM.length];
                    System.arraycopy(this.dVT, 0, nArray, 0, this.dVT.length);
                    n2 = z.u(this.dVT);
                    for (int i2 = this.dVT.length; i2 < nArray.length; ++i2) {
                        nArray[i2] = n2;
                    }
                    this.dVT = nArray;
                }
                this.dVY = new int[this.dVT.length];
                int n3 = 0;
                for (n2 = 0; n2 < this.dVT.length; ++n2) {
                    this.dVY[n2] = n3 += this.dVT[n2];
                }
                this.dVZ = n3;
                if (this.dVZ <= 0) {
                    net.minecraft.src.a.warn("Invalid sum of all weights: " + n3);
                    this.dVZ = 1;
                }
            }
            if (this.dVU >= 0 && this.dVU <= 9) {
                return true;
            }
            net.minecraft.src.a.warn("Invalid randomLoops: " + this.dVU);
            return false;
        }
        net.minecraft.src.a.warn("Tiles not defined: " + string);
        return false;
    }

    private boolean hm(String string) {
        if (this.dVM == null) {
            net.minecraft.src.a.warn("Tiles not defined: " + string);
            return false;
        }
        if (this.width <= 0) {
            net.minecraft.src.a.warn("Invalid width: " + string);
            return false;
        }
        if (this.height <= 0) {
            net.minecraft.src.a.warn("Invalid height: " + string);
            return false;
        }
        if (this.dVM.length != this.width * this.height) {
            net.minecraft.src.a.warn("Number of tiles does not equal width x height: " + string);
            return false;
        }
        return true;
    }

    private boolean hn(String string) {
        if (this.dVM == null) {
            net.minecraft.src.a.warn("Tiles not defined: " + string);
            return false;
        }
        if (this.dVM.length != 1) {
            net.minecraft.src.a.warn("Number of tiles should be 1 for method: fixed.");
            return false;
        }
        return true;
    }

    private boolean ho(String string) {
        if (this.dVM == null) {
            this.dVM = this.gS("66");
        }
        if (this.dVM.length != 1) {
            net.minecraft.src.a.warn("Invalid tiles, must be exactly 1: " + string);
            return false;
        }
        return true;
    }

    public void b(TextureMap textureMap) {
        if (this.dVK != null) {
            this.dWa = i.a(this.dVK, textureMap, false, false);
        }
        if (this.dWd != null) {
            this.dWe = i.a(this.dWd, textureMap, false, false);
        }
        if (this.dVM != null) {
            this.dWb = i.a(this.dVM, textureMap, true, !i.iW(this.dVL));
        }
    }

    private static boolean iW(int n2) {
        switch (n2) {
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return true;
            }
        }
        return false;
    }

    private static TextureAtlasSprite[] a(String[] stringArray, TextureMap textureMap, boolean bl2, boolean bl3) {
        if (stringArray == null) {
            return null;
        }
        ArrayList<TextureAtlasSprite> arrayList = new ArrayList<TextureAtlasSprite>();
        for (String string : stringArray) {
            cm cm2 = new cm(string);
            String string2 = cm2.atB();
            Object object = cm2.atA();
            if (!((String)object).contains("/")) {
                object = "textures/blocks/" + (String)object;
            }
            String string3 = (String)object + ".png";
            if (bl2 && string3.endsWith(dWP)) {
                arrayList.add(null);
                continue;
            }
            if (bl3 && string3.endsWith(dWQ)) {
                arrayList.add(j.dXz);
                continue;
            }
            cm cm3 = new cm(string2, string3);
            boolean bl4 = net.minecraft.src.a.F(cm3);
            if (!bl4) {
                net.minecraft.src.a.warn("File not found: " + string3);
            }
            String string4 = "textures/";
            Object object2 = object;
            if (((String)object).startsWith("textures/")) {
                object2 = ((String)object).substring("textures/".length());
            }
            cm cm4 = new cm(string2, (String)object2);
            TextureAtlasSprite textureAtlasSprite = textureMap.n(cm4);
            arrayList.add(textureAtlasSprite);
        }
        return arrayList.toArray(new TextureAtlasSprite[arrayList.size()]);
    }

    public boolean iX(int n2) {
        return k.a(n2, this.dVI);
    }

    public boolean bt(int n2, int n3) {
        return k.a(n2, n3, this.dVI) && k.e(n3, this.dVJ);
    }

    public boolean j(TextureAtlasSprite textureAtlasSprite) {
        return k.a(textureAtlasSprite, this.dWa);
    }

    public String toString() {
        return "CTM name: " + this.gK + ", basePath: " + this.bZI + ", matchBlocks: " + net.minecraft.src.a.c(this.dVI) + ", matchTiles: " + net.minecraft.src.a.c(this.dVK);
    }

    public boolean d(net.minecraft.world.biome.j j2) {
        return k.a(j2, this.dEV);
    }

    public int aAo() {
        int n2 = -1;
        n2 = this.c(this.dVJ, n2);
        if (this.dVI != null) {
            for (net.optifine.config.j j2 : this.dVI) {
                n2 = this.c(j2.aBX(), n2);
            }
        }
        return n2;
    }

    private int c(int[] nArray, int n2) {
        if (nArray != null) {
            for (int n3 : nArray) {
                if (n3 <= n2) continue;
                n2 = n3;
            }
        }
        return n2;
    }
}

