/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
package net.optifine.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.src.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.entity.model.b;
import net.optifine.player.c;
import net.optifine.player.h;
import net.optifine.player.j;
import net.optifine.util.r;

public class i {
    private static final JsonParser emr = new JsonParser();
    public static final String ems = "type";
    public static final String emt = "textureSize";
    public static final String emu = "usePlayerTexture";
    public static final String emv = "models";
    public static final String emw = "id";
    public static final String emx = "baseId";
    public static final String emy = "type";
    public static final String emz = "texture";
    public static final String emA = "textureSize";
    public static final String emB = "attachTo";
    public static final String emC = "invertAxis";
    public static final String emD = "mirrorTexture";
    public static final String emE = "translate";
    public static final String emF = "rotate";
    public static final String emG = "scale";
    public static final String emH = "boxes";
    public static final String emI = "sprites";
    public static final String emJ = "submodel";
    public static final String emK = "submodels";
    public static final String emL = "textureOffset";
    public static final String emM = "coordinates";
    public static final String emN = "sizeAdd";
    public static final String emO = "uvDown";
    public static final String emP = "uvUp";
    public static final String emQ = "uvNorth";
    public static final String emR = "uvSouth";
    public static final String emS = "uvWest";
    public static final String emT = "uvEast";
    public static final String emU = "uvFront";
    public static final String emV = "uvBack";
    public static final String emW = "uvLeft";
    public static final String emX = "uvRight";
    public static final String emY = "PlayerItem";
    public static final String emZ = "ModelBox";

    public static h D(JsonObject jsonObject) {
        String string = r.m(jsonObject, "type");
        if (!a.a((Object)string, (Object)emY)) {
            throw new JsonParseException("Unknown model type: " + string);
        }
        int[] nArray = r.b(jsonObject.get("textureSize"), 2);
        i.a(nArray, "Missing texture size");
        Dimension dimension = new Dimension(nArray[0], nArray[1]);
        boolean bl2 = r.a(jsonObject, emu, false);
        JsonArray jsonArray = (JsonArray)jsonObject.get(emv);
        i.a(jsonArray, "Missing elements");
        HashMap<String, JsonObject> hashMap = new HashMap<String, JsonObject>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        new ArrayList();
        for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
            Object object;
            String string2;
            JsonObject jsonObject2 = (JsonObject)jsonArray.get(i2);
            String string3 = r.m(jsonObject2, emx);
            if (string3 != null) {
                string2 = (JsonObject)hashMap.get(string3);
                if (string2 == null) {
                    a.warn("BaseID not found: " + string3);
                    continue;
                }
                object = string2.entrySet().iterator();
                while (object.hasNext()) {
                    Map.Entry entry = (Map.Entry)object.next();
                    if (jsonObject2.has((String)entry.getKey())) continue;
                    jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
                }
            }
            if ((string2 = r.m(jsonObject2, emw)) != null) {
                if (!hashMap.containsKey(string2)) {
                    hashMap.put(string2, jsonObject2);
                } else {
                    a.warn("Duplicate model ID: " + string2);
                }
            }
            if ((object = i.a(jsonObject2, dimension)) == null) continue;
            arrayList.add(object);
        }
        j[] jArray = arrayList.toArray(new j[arrayList.size()]);
        return new h(dimension, bl2, jArray);
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    private static cm is(String string) {
        int n2 = string.indexOf(58);
        if (n2 < 0) {
            return new cm(string);
        }
        String string2 = string.substring(0, n2);
        String string3 = string.substring(n2 + 1);
        return new cm(string2, string3);
    }

    private static int it(String string) {
        if (string == null) {
            return 0;
        }
        if (string.equals("body")) {
            return 0;
        }
        if (string.equals("head")) {
            return 1;
        }
        if (string.equals("leftArm")) {
            return 2;
        }
        if (string.equals("rightArm")) {
            return 3;
        }
        if (string.equals("leftLeg")) {
            return 4;
        }
        if (string.equals("rightLeg")) {
            return 5;
        }
        if (string.equals("cape")) {
            return 6;
        }
        a.warn("Unknown attachModel: " + string);
        return 0;
    }

    public static j a(JsonObject jsonObject, Dimension dimension) {
        String string = r.m(jsonObject, "type");
        if (!a.a((Object)string, (Object)emZ)) {
            a.warn("Unknown model type: " + string);
            return null;
        }
        String string2 = r.m(jsonObject, emB);
        int n2 = i.it(string2);
        c c2 = new c();
        c2.bys = dimension.width;
        c2.byt = dimension.height;
        ag ag2 = i.a(jsonObject, c2, null, null);
        j j2 = new j(n2, ag2);
        return j2;
    }

    public static ag a(JsonObject jsonObject, d d2, int[] nArray, String string) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        float f2;
        Object object;
        Object object2;
        Object object3;
        JsonArray jsonArray2;
        int[] nArray2;
        float f3;
        ag ag2 = new ag(d2);
        String string2 = r.m(jsonObject, emw);
        ag2.cX(string2);
        ag2.bBW = f3 = r.a(jsonObject, emG, 1.0f);
        ag2.bBX = f3;
        ag2.bBY = f3;
        String string3 = r.m(jsonObject, emz);
        if (string3 != null) {
            ag2.g(b.e(string, string3, ".png"));
        }
        if ((nArray2 = r.b(jsonObject.get("textureSize"), 2)) == null) {
            nArray2 = nArray;
        }
        if (nArray2 != null) {
            ag2.D(nArray2[0], nArray2[1]);
        }
        String string4 = r.a(jsonObject, emC, "").toLowerCase();
        boolean bl2 = string4.contains("x");
        boolean bl3 = string4.contains("y");
        boolean bl4 = string4.contains("z");
        float[] fArray = r.a(jsonObject.get(emE), 3, new float[3]);
        if (bl2) {
            fArray[0] = -fArray[0];
        }
        if (bl3) {
            fArray[1] = -fArray[1];
        }
        if (bl4) {
            fArray[2] = -fArray[2];
        }
        float[] fArray2 = r.a(jsonObject.get(emF), 3, new float[3]);
        for (int i2 = 0; i2 < fArray2.length; ++i2) {
            fArray2[i2] = fArray2[i2] / 180.0f * bt.dyT;
        }
        if (bl2) {
            fArray2[0] = -fArray2[0];
        }
        if (bl3) {
            fArray2[1] = -fArray2[1];
        }
        if (bl4) {
            fArray2[2] = -fArray2[2];
        }
        ag2.g(fArray[0], fArray[1], fArray[2]);
        ag2.bBF = fArray2[0];
        ag2.bBG = fArray2[1];
        ag2.bBH = fArray2[2];
        String string5 = r.a(jsonObject, emD, "").toLowerCase();
        boolean bl5 = string5.contains("com.alan.clients.protection.external.u");
        boolean bl6 = string5.contains("v");
        if (bl5) {
            ag2.bBK = true;
        }
        if (bl6) {
            ag2.bBV = true;
        }
        if ((jsonArray2 = jsonObject.getAsJsonArray(emH)) != null) {
            for (int i3 = 0; i3 < jsonArray2.size(); ++i3) {
                JsonObject jsonObject3 = jsonArray2.get(i3).getAsJsonObject();
                object3 = r.b(jsonObject3.get(emL), 2);
                object2 = i.E(jsonObject3);
                if (object3 == null && object2 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object = r.a(jsonObject3.get(emM), 6);
                if (object == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl2) {
                    object[0] = -object[0] - object[3];
                }
                if (bl3) {
                    object[1] = -object[1] - object[4];
                }
                if (bl4) {
                    object[2] = -object[2] - object[5];
                }
                f2 = r.a(jsonObject3, emN, 0.0f);
                if (object2 != null) {
                    ag2.a((int[][])object2, object[0], object[1], object[2], object[3], object[4], object[5], f2);
                    continue;
                }
                ag2.C(object3[0], object3[1]);
                ag2.a(object[0], object[1], object[2], (int)object[3], (int)object[4], (int)object[5], f2);
            }
        }
        if ((jsonArray = jsonObject.getAsJsonArray(emI)) != null) {
            for (int i4 = 0; i4 < jsonArray.size(); ++i4) {
                object3 = jsonArray.get(i4).getAsJsonObject();
                object2 = r.b(object3.get(emL), 2);
                if (object2 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object = r.a(object3.get(emM), 6);
                if (object == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl2) {
                    object[0] = -object[0] - object[3];
                }
                if (bl3) {
                    object[1] = -object[1] - object[4];
                }
                if (bl4) {
                    object[2] = -object[2] - object[5];
                }
                f2 = r.a((JsonObject)object3, emN, 0.0f);
                ag2.C((int)object2[0], (int)object2[1]);
                ag2.b(object[0], object[1], object[2], (int)object[3], (int)object[4], (int)object[5], f2);
            }
        }
        if ((jsonObject2 = (JsonObject)jsonObject.get(emJ)) != null) {
            object3 = i.a(jsonObject2, d2, nArray2, string);
            ag2.a((ag)object3);
        }
        if ((object3 = (Object)((JsonArray)jsonObject.get(emK))) != null) {
            for (int i5 = 0; i5 < object3.size(); ++i5) {
                ag ag3;
                object = (JsonObject)object3.get(i5);
                ag ag4 = i.a((JsonObject)object, d2, nArray2, string);
                if (ag4.tn() != null && (ag3 = ag2.cY(ag4.tn())) != null) {
                    a.warn("Duplicate model ID: " + ag4.tn());
                }
                ag2.a(ag4);
            }
        }
        return ag2;
    }

    private static int[][] E(JsonObject jsonObject) {
        int[][] nArrayArray = new int[][]{r.b(jsonObject.get(emO), 4), r.b(jsonObject.get(emP), 4), r.b(jsonObject.get(emQ), 4), r.b(jsonObject.get(emR), 4), r.b(jsonObject.get(emS), 4), r.b(jsonObject.get(emT), 4)};
        if (nArrayArray[2] == null) {
            nArrayArray[2] = r.b(jsonObject.get(emU), 4);
        }
        if (nArrayArray[3] == null) {
            nArrayArray[3] = r.b(jsonObject.get(emV), 4);
        }
        if (nArrayArray[4] == null) {
            nArrayArray[4] = r.b(jsonObject.get(emW), 4);
        }
        if (nArrayArray[5] == null) {
            nArrayArray[5] = r.b(jsonObject.get(emX), 4);
        }
        boolean bl2 = false;
        for (int[] nArray : nArrayArray) {
            if (nArray == null) continue;
            bl2 = true;
            break;
        }
        if (!bl2) {
            return null;
        }
        return nArrayArray;
    }
}

