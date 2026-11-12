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
package net.optifine.entity.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ag;
import net.minecraft.util.cm;
import net.optifine.entity.model.a;
import net.optifine.entity.model.anim.d;
import net.optifine.entity.model.anim.g;
import net.optifine.entity.model.f;
import net.optifine.player.i;
import net.optifine.util.r;

public class b {
    public static final String efC = "entity";
    public static final String efD = "texture";
    public static final String efE = "shadowSize";
    public static final String efF = "type";
    public static final String efG = "textureSize";
    public static final String efH = "usePlayerTexture";
    public static final String efI = "models";
    public static final String efJ = "animations";
    public static final String efK = "id";
    public static final String efL = "baseId";
    public static final String efM = "model";
    public static final String efN = "type";
    public static final String efO = "part";
    public static final String efP = "attach";
    public static final String efQ = "invertAxis";
    public static final String efR = "mirrorTexture";
    public static final String efS = "translate";
    public static final String efT = "rotate";
    public static final String efU = "scale";
    public static final String efV = "boxes";
    public static final String efW = "sprites";
    public static final String efX = "submodel";
    public static final String efY = "submodels";
    public static final String efZ = "textureOffset";
    public static final String ega = "coordinates";
    public static final String egb = "sizeAdd";
    public static final String egc = "EntityModel";
    public static final String egd = "EntityModelPart";

    public static net.optifine.entity.model.d s(JsonObject jsonObject, String string) {
        Object object;
        Object object2;
        net.optifine.config.a a2 = new net.optifine.config.a("CustomEntityModels");
        String string2 = a2.gQ(string);
        String string3 = a2.gR(string);
        String string4 = r.m(jsonObject, efD);
        int[] nArray = r.b(jsonObject.get(efG), 2);
        float f2 = r.a(jsonObject, efE, -1.0f);
        JsonArray jsonArray = (JsonArray)jsonObject.get(efI);
        b.a(jsonArray, "Missing models");
        HashMap hashMap = new HashMap();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
            object2 = (JsonObject)jsonArray.get(i2);
            b.a(object2, hashMap);
            b.a(object2, hashMap, string3);
            b.b(object2, hashMap);
            object = b.a(object2, nArray, string3);
            if (object == null) continue;
            arrayList.add(object);
        }
        f[] fArray = arrayList.toArray(new f[arrayList.size()]);
        object2 = null;
        if (string4 != null) {
            object2 = b.e(string3, string4, ".png");
        }
        object = new net.optifine.entity.model.d(string2, string3, (cm)object2, fArray, f2);
        return object;
    }

    private static void a(JsonObject jsonObject, Map map) {
        String string = r.m(jsonObject, efL);
        if (string != null) {
            JsonObject jsonObject2 = (JsonObject)map.get(string);
            if (jsonObject2 == null) {
                net.minecraft.src.a.warn("BaseID not found: " + string);
            } else {
                b.a(jsonObject2, jsonObject);
            }
        }
    }

    private static void a(JsonObject jsonObject, Map map, String string) {
        String string2 = r.m(jsonObject, efM);
        if (string2 != null) {
            cm cm2 = b.e(string, string2, ".jpm");
            try {
                JsonObject jsonObject2 = b.M(cm2);
                if (jsonObject2 == null) {
                    net.minecraft.src.a.warn("Model not found: " + String.valueOf(cm2));
                    return;
                }
                b.a(jsonObject2, jsonObject);
            }
            catch (IOException iOException) {
                net.minecraft.src.a.error(iOException.getClass().getName() + ": " + iOException.getMessage());
            }
            catch (JsonParseException jsonParseException) {
                net.minecraft.src.a.error(((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void a(JsonObject jsonObject, JsonObject jsonObject2) {
        for (Map.Entry entry : jsonObject.entrySet()) {
            if (((String)entry.getKey()).equals(efK) || jsonObject2.has((String)entry.getKey())) continue;
            jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
        }
    }

    public static cm e(String string, String object, String string2) {
        if (!((String)object).endsWith(string2)) {
            object = (String)object + string2;
        }
        if (!((String)object).contains("/")) {
            object = string + "/" + (String)object;
        } else if (((String)object).startsWith("./")) {
            object = string + "/" + ((String)object).substring(2);
        } else if (((String)object).startsWith("~/")) {
            object = "optifine/" + ((String)object).substring(2);
        }
        return new cm((String)object);
    }

    private static void b(JsonObject jsonObject, Map map) {
        String string = r.m(jsonObject, efK);
        if (string != null) {
            if (string.length() < 1) {
                net.minecraft.src.a.warn("Empty model ID: " + string);
            } else if (map.containsKey(string)) {
                net.minecraft.src.a.warn("Duplicate model ID: " + string);
            } else {
                map.put(string, jsonObject);
            }
        }
    }

    public static f a(JsonObject jsonObject, int[] nArray, String string) {
        Object object;
        String string2 = r.m(jsonObject, efO);
        b.a(string2, "Model part not specified, missing \"replace\" or \"attachTo\".");
        boolean bl2 = r.a(jsonObject, efP, false);
        a a2 = new a();
        if (nArray != null) {
            a2.bys = nArray[0];
            a2.byt = nArray[1];
        }
        d d2 = null;
        JsonArray jsonArray = (JsonArray)jsonObject.get(efJ);
        if (jsonArray != null) {
            object = new ArrayList();
            for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i2);
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    String string3 = (String)entry.getKey();
                    String string4 = ((JsonElement)entry.getValue()).getAsString();
                    g g2 = new g(string3, string4);
                    object.add(g2);
                }
            }
            if (object.size() > 0) {
                g[] gArray = object.toArray(new g[object.size()]);
                d2 = new d(gArray);
            }
        }
        object = i.a(jsonObject, a2, nArray, string);
        f f2 = new f(string2, bl2, (ag)object, d2);
        return f2;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    public static JsonObject M(cm cm2) {
        InputStream inputStream = net.minecraft.src.a.u(cm2);
        if (inputStream == null) {
            return null;
        }
        String string = net.minecraft.src.a.a(inputStream, "ASCII");
        inputStream.close();
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject)jsonParser.parse(string);
        return jsonObject;
    }
}

