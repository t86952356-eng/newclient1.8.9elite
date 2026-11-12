/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

public class bn {
    public static boolean h(JsonObject jsonObject, String string) {
        return bn.k(jsonObject, string) && jsonObject.getAsJsonPrimitive(string).isString();
    }

    public static boolean f(JsonElement jsonElement) {
        return jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString();
    }

    public static boolean i(JsonObject jsonObject, String string) {
        return bn.k(jsonObject, string) && jsonObject.getAsJsonPrimitive(string).isBoolean();
    }

    public static boolean j(JsonObject jsonObject, String string) {
        return bn.l(jsonObject, string) && jsonObject.get(string).isJsonArray();
    }

    public static boolean k(JsonObject jsonObject, String string) {
        return bn.l(jsonObject, string) && jsonObject.get(string).isJsonPrimitive();
    }

    public static boolean l(JsonObject jsonObject, String string) {
        return jsonObject != null && jsonObject.get(string) != null;
    }

    public static String a(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + bn.g(jsonElement));
    }

    public static String m(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.a(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    public static String a(JsonObject jsonObject, String string, String string2) {
        return jsonObject.has(string) ? bn.a(jsonObject.get(string), string) : string2;
    }

    public static boolean b(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + bn.g(jsonElement));
    }

    public static boolean n(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.b(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    public static boolean a(JsonObject jsonObject, String string, boolean bl2) {
        return jsonObject.has(string) ? bn.b(jsonObject.get(string), string) : bl2;
    }

    public static float c(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + bn.g(jsonElement));
    }

    public static float o(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.c(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static float a(JsonObject jsonObject, String string, float f2) {
        return jsonObject.has(string) ? bn.c(jsonObject.get(string), string) : f2;
    }

    public static int d(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + bn.g(jsonElement));
    }

    public static int p(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.d(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    public static int a(JsonObject jsonObject, String string, int n2) {
        return jsonObject.has(string) ? bn.d(jsonObject.get(string), string) : n2;
    }

    public static JsonObject e(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + bn.g(jsonElement));
    }

    public static JsonObject q(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.e(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }

    public static JsonObject a(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        return jsonObject.has(string) ? bn.e(jsonObject.get(string), string) : jsonObject2;
    }

    public static JsonArray f(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + bn.g(jsonElement));
    }

    public static JsonArray r(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return bn.f(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    public static JsonArray a(JsonObject jsonObject, String string, JsonArray jsonArray) {
        return jsonObject.has(string) ? bn.f(jsonObject.get(string), string) : jsonArray;
    }

    public static String g(JsonElement jsonElement) {
        String string = StringUtils.abbreviateMiddle((String)String.valueOf(jsonElement), (String)"...", (int)10);
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + string + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + string + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return "a number (" + string + ")";
            }
            if (jsonPrimitive.isBoolean()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }
}

