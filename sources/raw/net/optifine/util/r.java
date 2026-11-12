/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.optifine.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class r {
    public static float a(JsonObject jsonObject, String string, float f2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? f2 : jsonElement.getAsFloat();
    }

    public static boolean a(JsonObject jsonObject, String string, boolean bl2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? bl2 : jsonElement.getAsBoolean();
    }

    public static String m(JsonObject jsonObject, String string) {
        return r.a(jsonObject, string, null);
    }

    public static String a(JsonObject jsonObject, String string, String string2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? string2 : jsonElement.getAsString();
    }

    public static float[] a(JsonElement jsonElement, int n2) {
        return r.a(jsonElement, n2, null);
    }

    public static float[] a(JsonElement jsonElement, int n2, float[] fArray) {
        if (jsonElement == null) {
            return fArray;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n2) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n2 + ", array: " + String.valueOf(jsonArray));
        }
        float[] fArray2 = new float[jsonArray.size()];
        for (int i2 = 0; i2 < fArray2.length; ++i2) {
            fArray2[i2] = jsonArray.get(i2).getAsFloat();
        }
        return fArray2;
    }

    public static int[] b(JsonElement jsonElement, int n2) {
        return r.a(jsonElement, n2, null);
    }

    public static int[] a(JsonElement jsonElement, int n2, int[] nArray) {
        if (jsonElement == null) {
            return nArray;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n2) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n2 + ", array: " + String.valueOf(jsonArray));
        }
        int[] nArray2 = new int[jsonArray.size()];
        for (int i2 = 0; i2 < nArray2.length; ++i2) {
            nArray2[i2] = jsonArray.get(i2).getAsInt();
        }
        return nArray2;
    }
}

