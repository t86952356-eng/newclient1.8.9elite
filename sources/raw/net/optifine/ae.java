/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.ad;
import net.optifine.af;
import net.optifine.ag;
import net.optifine.config.l;
import net.optifine.render.b;
import net.optifine.shaders.ah;
import net.optifine.shaders.aj;

public class ae {
    private static ad[][] eaR = null;
    private static ad[][] eaS = null;
    private static Map eaT = null;
    private static final ItemModelGenerator eaU = new ItemModelGenerator();
    private static boolean eaV = true;
    private static final boolean eaW = false;
    public static final int eaX = 16384;
    public static final int eaY = 63;
    public static final int eaZ = 64;
    public static final String eba = "texture.potion_overlay";
    public static final String ebb = "texture.potion_bottle_splash";
    public static final String ebc = "texture.potion_bottle_drinkable";
    public static final String ebd = "items/potion_overlay";
    public static final String ebe = "items/potion_bottle_splash";
    public static final String ebf = "items/potion_bottle_drinkable";
    private static final int[][] ebg = new int[0][];
    private static final String ebh = "normal";
    private static final String ebi = "splash";
    private static final String ebj = "linger";

    public static void jA() {
        eaR = null;
        eaS = null;
        eaV = true;
        if (a.aoT()) {
            ae.hC("mcpatcher/cit.properties");
            IResourcePack[] iResourcePackArray = a.anO();
            for (int i2 = iResourcePackArray.length - 1; i2 >= 0; --i2) {
                IResourcePack iResourcePack = iResourcePackArray[i2];
                ae.d(iResourcePack);
            }
            ae.d(a.anQ());
            if (eaR.length <= 0) {
                eaR = null;
            }
            if (eaS.length <= 0) {
                eaS = null;
            }
        }
    }

    private static void hC(String string) {
        try {
            cm cm2 = new cm(string);
            InputStream inputStream = a.u(cm2);
            if (inputStream == null) {
                return;
            }
            a.fN("CustomItems: Loading " + string);
            net.optifine.util.af af2 = new net.optifine.util.af();
            af2.load(inputStream);
            inputStream.close();
            eaV = a.p(af2.getProperty("useGlint"), true);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void d(IResourcePack iResourcePack) {
        int n2;
        Object object;
        Object[] objectArray;
        Collection<Object> collection;
        Object[] objectArray2 = net.optifine.util.ah.a(iResourcePack, "mcpatcher/cit/", ".properties", null);
        Map map = ae.e(iResourcePack);
        if (map.size() > 0) {
            collection = map.keySet();
            objectArray = collection.toArray(new String[collection.size()]);
            objectArray2 = (String[])a.a(objectArray2, objectArray);
        }
        Arrays.sort(objectArray2);
        collection = ae.a(eaR);
        objectArray = ae.a(eaS);
        for (int i2 = 0; i2 < objectArray2.length; ++i2) {
            Object object2 = objectArray2[i2];
            a.fN("CustomItems: " + (String)object2);
            try {
                object = null;
                if (map.containsKey(object2)) {
                    object = (ad)map.get(object2);
                }
                if (object == null) {
                    cm cm2 = new cm((String)object2);
                    InputStream inputStream = iResourcePack.r(cm2);
                    if (inputStream == null) {
                        a.warn("CustomItems file not found: " + (String)object2);
                        continue;
                    }
                    net.optifine.util.af af2 = new net.optifine.util.af();
                    af2.load(inputStream);
                    object = new ad(af2, (String)object2);
                }
                if (!object.gY((String)object2)) continue;
                ae.a((ad)object, collection);
                ae.b((ad)object, (List)objectArray);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.warn("CustomItems file not found: " + (String)object2);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        eaR = ae.P(collection);
        eaS = ae.P((List)objectArray);
        Comparator comparator = ae.aAL();
        for (n2 = 0; n2 < eaR.length; ++n2) {
            object = eaR[n2];
            if (object == null) continue;
            Arrays.sort(object, comparator);
        }
        for (n2 = 0; n2 < eaS.length; ++n2) {
            object = eaS[n2];
            if (object == null) continue;
            Arrays.sort(object, comparator);
        }
    }

    private static Comparator aAL() {
        af af2 = new af();
        return af2;
    }

    public static void b(TextureMap textureMap) {
        for (ad ad2 : ae.aAN()) {
            ad2.b(textureMap);
        }
    }

    public static void a(ModelBakery modelBakery) {
        for (ad ad2 : ae.aAN()) {
            ad2.a(modelBakery);
        }
    }

    public static void aAM() {
        for (ad ad2 : ae.aAN()) {
            if (ad2.bif != 1) continue;
            TextureMap textureMap = net.minecraft.client.d.AZ().Bu();
            ad2.a(textureMap, eaU);
            ad2.aAK();
        }
    }

    private static List<ad> aAN() {
        ArrayList<ad> arrayList = new ArrayList<ad>();
        ae.a(eaR, arrayList);
        ae.a(eaS, arrayList);
        return arrayList;
    }

    private static void a(ad[][] adArray, List<ad> list) {
        if (adArray != null) {
            for (int i2 = 0; i2 < adArray.length; ++i2) {
                ad[] adArray2 = adArray[i2];
                if (adArray2 == null) continue;
                for (int i3 = 0; i3 < adArray2.length; ++i3) {
                    ad ad2 = adArray2[i3];
                    if (ad2 == null) continue;
                    list.add(ad2);
                }
            }
        }
    }

    private static Map e(IResourcePack iResourcePack) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(ae.a(iResourcePack, ebh, d.p(Items.cRD)));
        hashMap.putAll(ae.a(iResourcePack, ebi, d.p(Items.cRD)));
        hashMap.putAll(ae.a(iResourcePack, ebj, d.p(Items.cRD)));
        return hashMap;
    }

    private static Map a(IResourcePack iResourcePack, String string, int n2) {
        HashMap<CallSite, ad> hashMap = new HashMap<CallSite, ad>();
        String string2 = string + "/";
        String[] stringArray = new String[]{"mcpatcher/cit/potion/" + string2, "mcpatcher/cit/Potion/" + string2};
        String[] stringArray2 = new String[]{".png"};
        String[] stringArray3 = net.optifine.util.ah.a(iResourcePack, stringArray, stringArray2);
        for (int i2 = 0; i2 < stringArray3.length; ++i2) {
            String string3 = stringArray3[i2];
            String string4 = net.optifine.util.aj.a(string3, stringArray, stringArray2);
            Properties properties = ae.a(string4, string, n2, string3);
            if (properties == null) continue;
            String string5 = net.optifine.util.aj.e(string3, stringArray2) + ".properties";
            ad ad2 = new ad(properties, string5);
            hashMap.put((CallSite)((Object)string5), ad2);
        }
        return hashMap;
    }

    private static Properties a(String string, String string2, int n2, String string3) {
        int n3;
        if (net.optifine.util.aj.d(string, new String[]{"_n", "_s"})) {
            return null;
        }
        if (string.equals("empty") && string2.equals(ebh)) {
            n2 = d.p(Items.cRE);
            net.optifine.util.af af2 = new net.optifine.util.af();
            ((Properties)af2).put("type", "item");
            ((Properties)af2).put("items", "" + n2);
            return af2;
        }
        int[] nArray = (int[])ae.aAO().get(string);
        if (nArray == null) {
            a.warn("Potion not found for image: " + string3);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n3 = 0; n3 < nArray.length; ++n3) {
            int n4 = nArray[n3];
            if (string2.equals(ebi)) {
                n4 |= 0x4000;
            }
            if (n3 > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(n4);
        }
        n3 = 16447;
        if (string.equals("water") || string.equals("mundane")) {
            n3 |= 0x40;
        }
        net.optifine.util.af af3 = new net.optifine.util.af();
        ((Properties)af3).put("type", "item");
        ((Properties)af3).put("items", "" + n2);
        ((Properties)af3).put("damage", String.valueOf(stringBuffer));
        ((Properties)af3).put("damageMask", "" + n3);
        if (string2.equals(ebi)) {
            ((Properties)af3).put(ebb, string);
        } else {
            ((Properties)af3).put(ebc, string);
        }
        return af3;
    }

    private static Map aAO() {
        if (eaT == null) {
            eaT = new LinkedHashMap();
            eaT.put("water", ae.bD(0, 0));
            eaT.put("awkward", ae.bD(0, 1));
            eaT.put("thick", ae.bD(0, 2));
            eaT.put("potent", ae.bD(0, 3));
            eaT.put("regeneration", ae.je(1));
            eaT.put("movespeed", ae.je(2));
            eaT.put("fireresistance", ae.je(3));
            eaT.put("poison", ae.je(4));
            eaT.put("heal", ae.je(5));
            eaT.put("nightvision", ae.je(6));
            eaT.put("clear", ae.bD(7, 0));
            eaT.put("bungling", ae.bD(7, 1));
            eaT.put("charming", ae.bD(7, 2));
            eaT.put("rank", ae.bD(7, 3));
            eaT.put("weakness", ae.je(8));
            eaT.put("damageboost", ae.je(9));
            eaT.put("moveslowdown", ae.je(10));
            eaT.put("leaping", ae.je(11));
            eaT.put("harm", ae.je(12));
            eaT.put("waterbreathing", ae.je(13));
            eaT.put("invisibility", ae.je(14));
            eaT.put("thin", ae.bD(15, 0));
            eaT.put("debonair", ae.bD(15, 1));
            eaT.put("sparkling", ae.bD(15, 2));
            eaT.put("stinky", ae.bD(15, 3));
            eaT.put("mundane", ae.bD(0, 4));
            eaT.put("speed", eaT.get("movespeed"));
            eaT.put("fire_resistance", eaT.get("fireresistance"));
            eaT.put("instant_health", eaT.get("heal"));
            eaT.put("night_vision", eaT.get("nightvision"));
            eaT.put("strength", eaT.get("damageboost"));
            eaT.put("slowness", eaT.get("moveslowdown"));
            eaT.put("instant_damage", eaT.get("harm"));
            eaT.put("water_breathing", eaT.get("waterbreathing"));
        }
        return eaT;
    }

    private static int[] je(int n2) {
        return new int[]{n2, n2 + 16, n2 + 32, n2 + 48};
    }

    private static int[] bD(int n2, int n3) {
        return new int[]{n2 + n3 * 16};
    }

    private static int hD(String string) {
        String string2 = "potion." + string;
        net.minecraft.potion.a[] aArray = net.minecraft.potion.a.dgt;
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            String string3;
            net.minecraft.potion.a a2 = aArray[i2];
            if (a2 == null || !string2.equals(string3 = a2.getName())) continue;
            return a2.getId();
        }
        return -1;
    }

    private static List a(ad[][] adArray) {
        ArrayList<ArrayList<ad>> arrayList = new ArrayList<ArrayList<ad>>();
        if (adArray != null) {
            for (int i2 = 0; i2 < adArray.length; ++i2) {
                ad[] adArray2 = adArray[i2];
                ArrayList<ad> arrayList2 = null;
                if (adArray2 != null) {
                    arrayList2 = new ArrayList<ad>(Arrays.asList(adArray2));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static ad[][] P(List list) {
        ad[][] adArray = new ad[list.size()][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            List list2 = (List)list.get(i2);
            if (list2 == null) continue;
            ad[] adArray2 = list2.toArray(new ad[list2.size()]);
            Arrays.sort(adArray2, new ag());
            adArray[i2] = adArray2;
        }
        return adArray;
    }

    private static void a(ad ad2, List list) {
        if (ad2.ean != null) {
            for (int i2 = 0; i2 < ad2.ean.length; ++i2) {
                int n2 = ad2.ean[i2];
                if (n2 <= 0) {
                    a.warn("Invalid item ID: " + n2);
                    continue;
                }
                ae.a(ad2, list, n2);
            }
        }
    }

    private static void b(ad ad2, List list) {
        if (ad2.bif == 2 && ad2.eav != null) {
            for (int i2 = 0; i2 < 256; ++i2) {
                if (!ad2.eav.jt(i2)) continue;
                ae.a(ad2, list, i2);
            }
        }
    }

    private static void a(ad ad2, List list, int n2) {
        while (n2 >= list.size()) {
            list.add(null);
        }
        ArrayList<ad> arrayList = (ArrayList<ad>)list.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<ad>();
            arrayList.set(n2, (ad)((Object)arrayList));
        }
        arrayList.add(ad2);
    }

    public static IBakedModel a(co co2, IBakedModel iBakedModel, cm cm2, boolean bl2) {
        if (!bl2 && iBakedModel.Ms()) {
            return iBakedModel;
        }
        if (eaR == null) {
            return iBakedModel;
        }
        ad ad2 = ae.g(co2, 1);
        if (ad2 == null) {
            return iBakedModel;
        }
        IBakedModel iBakedModel2 = ad2.a(cm2, bl2);
        return iBakedModel2 != null ? iBakedModel2 : iBakedModel;
    }

    public static boolean a(co co2, int n2, String string) {
        if (eaR == null) {
            return false;
        }
        cm cm2 = ae.b(co2, n2, string);
        if (cm2 == null) {
            return false;
        }
        a.Bq().a(cm2);
        return true;
    }

    private static cm b(co co2, int n2, String string) {
        String string2;
        cm cm2;
        ad ad2 = ae.g(co2, 3);
        if (ad2 == null) {
            return null;
        }
        if (ad2.eaD == null) {
            return ad2.bCa;
        }
        d d2 = co2.bP();
        if (!(d2 instanceof y)) {
            return null;
        }
        y y2 = (y)d2;
        String string3 = y2.adN().getName();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("texture.");
        stringBuffer.append(string3);
        stringBuffer.append("_layer_");
        stringBuffer.append(n2);
        if (string != null) {
            stringBuffer.append("_");
            stringBuffer.append(string);
        }
        return (cm2 = (cm)ad2.eaD.get(string2 = stringBuffer.toString())) == null ? ad2.bCa : cm2;
    }

    private static ad g(co co2, int n2) {
        ad[] adArray;
        if (eaR == null) {
            return null;
        }
        if (co2 == null) {
            return null;
        }
        d d2 = co2.bP();
        int n3 = d.p(d2);
        if (n3 >= 0 && n3 < eaR.length && (adArray = eaR[n3]) != null) {
            for (int i2 = 0; i2 < adArray.length; ++i2) {
                ad ad2 = adArray[i2];
                if (ad2.bif != n2 || !ae.a(ad2, co2, null)) continue;
                return ad2;
            }
        }
        return null;
    }

    private static boolean a(ad ad2, co co2, int[][] nArray) {
        int n2;
        int n3;
        int n4;
        d d2 = co2.bP();
        if (ad2.ear != null) {
            int n5 = co2.aef();
            if (ad2.eat != 0) {
                n5 &= ad2.eat;
            }
            if (ad2.eas) {
                n4 = d2.adt();
                n5 = (int)((double)(n5 * 100) / (double)n4);
            }
            if (!ad2.ear.jt(n5)) {
                return false;
            }
        }
        if (ad2.eau != null && !ad2.eau.jt(co2.cWZ)) {
            return false;
        }
        int[][] nArray2 = nArray;
        if (ad2.eav != null) {
            if (nArray == null) {
                nArray2 = ae.ba(co2);
            }
            n4 = 0;
            for (n3 = 0; n3 < nArray2.length; ++n3) {
                n2 = nArray2[n3][0];
                if (!ad2.eav.jt(n2)) continue;
                n4 = 1;
                break;
            }
            if (n4 == 0) {
                return false;
            }
        }
        if (ad2.eaw != null) {
            if (nArray2 == null) {
                nArray2 = ae.ba(co2);
            }
            n4 = 0;
            for (n3 = 0; n3 < nArray2.length; ++n3) {
                n2 = nArray2[n3][1];
                if (!ad2.eaw.jt(n2)) continue;
                n4 = 1;
                break;
            }
            if (n4 == 0) {
                return false;
            }
        }
        if (ad2.eax != null) {
            n n6 = co2.aek();
            for (n3 = 0; n3 < ad2.eax.length; ++n3) {
                l l2 = ad2.eax[n3];
                if (l2.Q(n6)) continue;
                return false;
            }
        }
        if (ad2.eay != 0) {
            if (ad2.eay == 1) {
                // empty if block
            }
            return ad2.eay != 2;
        }
        return true;
    }

    private static int[][] ba(co co2) {
        v v2;
        d d2 = co2.bP();
        v v3 = v2 = d2 == Items.cSh ? Items.cSh.aD(co2) : co2.ael();
        if (v2 != null && v2.aeS() > 0) {
            int[][] nArray = new int[v2.aeS()][2];
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                n n2 = v2.gi(i2);
                short s2 = n2.eF("id");
                short s3 = n2.eF("lvl");
                nArray[i2][0] = s2;
                nArray[i2][1] = s3;
            }
            return nArray;
        }
        return ebg;
    }

    public static boolean a(RenderItem renderItem, co co2, IBakedModel iBakedModel) {
        if (eaS == null) {
            return false;
        }
        if (co2 == null) {
            return false;
        }
        int[][] nArray = ae.ba(co2);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet<Integer> hashSet = null;
        boolean bl2 = false;
        TextureManager textureManager = a.Bq();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            ad[] adArray;
            int n2 = nArray[i2][0];
            if (n2 < 0 || n2 >= eaS.length || (adArray = eaS[n2]) == null) continue;
            for (int i3 = 0; i3 < adArray.length; ++i3) {
                ad ad2 = adArray[i3];
                if (hashSet == null) {
                    hashSet = new HashSet<Integer>();
                }
                if (!hashSet.add(n2) || !ae.a(ad2, co2, nArray) || ad2.bCa == null) continue;
                textureManager.a(ad2.bCa);
                float f2 = ad2.c(textureManager);
                if (!bl2) {
                    bl2 = true;
                    GlStateManager.an(false);
                    GlStateManager.cJ(514);
                    GlStateManager.JA();
                    GlStateManager.cR(5890);
                }
                b.i(ad2.eaz, 1.0f);
                GlStateManager.JV();
                GlStateManager.i(f2 / 2.0f, f2 / 2.0f, f2 / 2.0f);
                float f3 = ad2.cGM * (float)(net.minecraft.client.d.Bj() % 3000L) / 3000.0f / 8.0f;
                GlStateManager.j(f3, 0.0f, 0.0f);
                GlStateManager.d(ad2.eaA, 0.0f, 0.0f, 1.0f);
                renderItem.a(iBakedModel, -1);
                GlStateManager.JW();
            }
        }
        if (bl2) {
            GlStateManager.tL();
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.cR(5888);
            GlStateManager.Jz();
            GlStateManager.cJ(515);
            GlStateManager.an(true);
            textureManager.a(TextureMap.bZE);
        }
        return bl2;
    }

    public static boolean a(r r2, co co2, net.minecraft.client.model.d d2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (eaS == null) {
            return false;
        }
        if (a.aoG() && ah.eye) {
            return false;
        }
        if (co2 == null) {
            return false;
        }
        int[][] nArray = ae.ba(co2);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet<Integer> hashSet = null;
        boolean bl2 = false;
        TextureManager textureManager = a.Bq();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            ad[] adArray;
            int n2 = nArray[i2][0];
            if (n2 < 0 || n2 >= eaS.length || (adArray = eaS[n2]) == null) continue;
            for (int i3 = 0; i3 < adArray.length; ++i3) {
                ad ad2 = adArray[i3];
                if (hashSet == null) {
                    hashSet = new HashSet<Integer>();
                }
                if (!hashSet.add(n2) || !ae.a(ad2, co2, nArray) || ad2.bCa == null) continue;
                textureManager.a(ad2.bCa);
                float f9 = ad2.c(textureManager);
                if (!bl2) {
                    bl2 = true;
                    if (a.aoG()) {
                        aj.aHi();
                    }
                    GlStateManager.tQ();
                    GlStateManager.cJ(514);
                    GlStateManager.an(false);
                }
                b.i(ad2.eaz, 1.0f);
                GlStateManager.JA();
                GlStateManager.cR(5890);
                GlStateManager.JU();
                GlStateManager.d(ad2.eaA, 0.0f, 0.0f, 1.0f);
                float f10 = f9 / 8.0f;
                GlStateManager.i(f10, f10 / 2.0f, f10);
                float f11 = ad2.cGM * (float)(net.minecraft.client.d.Bj() % 3000L) / 3000.0f / 8.0f;
                GlStateManager.j(0.0f, f11, 0.0f);
                GlStateManager.cR(5888);
                d2.a(r2, f2, f3, f5, f6, f7, f8);
            }
        }
        if (bl2) {
            GlStateManager.tL();
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.cR(5890);
            GlStateManager.JU();
            GlStateManager.cR(5888);
            GlStateManager.Jz();
            GlStateManager.an(true);
            GlStateManager.cJ(515);
            GlStateManager.tR();
            if (a.aoG()) {
                aj.aHj();
            }
        }
        return bl2;
    }

    public static boolean aAP() {
        return eaV;
    }
}

