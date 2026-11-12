/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package hackclient.rise;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.aex;
import hackclient.rise.aey;
import hackclient.rise.aez;
import hackclient.rise.afa;
import hackclient.rise.afb;
import hackclient.rise.afc;
import hackclient.rise.afd;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public final class aew {
    private static final String aFW = "https://localts.store/v1";
    private static final String aFX = "campaign=rise";
    private static final int aFY = 10000;
    private static final int aFZ = 15000;

    private aew() {
    }

    public static afa bu(String string) {
        afc afc2 = aew.b("GET", "/products?campaign=rise", string);
        if (!afc2.sI()) {
            return new afa(false, Collections.emptyList(), afc2.aGC);
        }
        JsonObject jsonObject = afc2.aGB;
        if (!aew.c(jsonObject)) {
            return new afa(false, Collections.emptyList(), aew.a(jsonObject, "Localts did not return products"));
        }
        ArrayList<aez> arrayList = new ArrayList<aez>();
        JsonArray jsonArray = aew.e(jsonObject, "products");
        for (JsonElement jsonElement : jsonArray) {
            if (!jsonElement.isJsonObject()) continue;
            JsonObject jsonObject2 = jsonElement.getAsJsonObject();
            arrayList.add(new aez(aew.b(jsonObject2, "id"), aew.b(jsonObject2, "name"), aew.b(jsonObject2, "description"), aew.b(jsonObject2, "category"), aew.d(jsonObject2, "priceInCredits"), aew.c(jsonObject2, "stock"), aew.b(jsonObject2, "type")));
        }
        return new afa(true, arrayList, "");
    }

    public static afd bv(String string) {
        afc afc2 = aew.b("GET", "/me?campaign=rise", string);
        if (!afc2.sI()) {
            return new afd(false, "", 0, afc2.aGC);
        }
        JsonObject jsonObject = afc2.aGB;
        if (!aew.c(jsonObject)) {
            return new afd(false, "", 0, aew.a(jsonObject, "Invalid Localts API key"));
        }
        return new afd(true, aew.b(jsonObject, "username"), aew.d(jsonObject, "balance"), "");
    }

    public static afb c(String string, String string2, int n2) {
        if (string2 == null || string2.isEmpty()) {
            return new afb(false, "", "Choose a Localts product first");
        }
        try {
            String string3 = "/products/" + URLEncoder.encode(string2, "UTF-8") + "/purchase?amount=" + n2 + "&campaign=rise";
            afc afc2 = aew.b("POST", string3, string);
            if (!afc2.sI()) {
                return new afb(false, "", afc2.aGC);
            }
            JsonObject jsonObject = afc2.aGB;
            if (!aew.c(jsonObject)) {
                return new afb(false, "", aew.a(jsonObject, "Purchase failed"));
            }
            return new afb(true, aew.b(jsonObject, "orderId"), "");
        }
        catch (Exception exception) {
            return new afb(false, "", "Unable to create Localts purchase request");
        }
    }

    public static aex z(String string, String string2) {
        try {
            afc afc2 = aew.b("GET", "/orders/get-order?id=" + URLEncoder.encode(string2, "UTF-8") + "&campaign=rise", string);
            if (!afc2.sI()) {
                return new aex(false, string2, "", "", new JsonArray(), afc2.aGC);
            }
            JsonObject jsonObject = afc2.aGB;
            if (!aew.c(jsonObject)) {
                return new aex(false, string2, "", "", new JsonArray(), aew.a(jsonObject, "Could not retrieve order"));
            }
            return new aex(true, aew.b(jsonObject, "order-id"), aew.b(jsonObject, "status"), aew.b(jsonObject, "product-name"), aew.e(jsonObject, "items"), "");
        }
        catch (Exception exception) {
            return new aex(false, string2, "", "", new JsonArray(), "Unable to retrieve Localts order");
        }
    }

    public static aey b(String string, int n2, int n3) {
        if (n2 < 0 || n3 < 1 || n3 > 100) {
            return new aey(false, new JsonArray(), 0, 0, 0, 0, "Invalid order page or size");
        }
        afc afc2 = aew.b("GET", "/orders?page=" + n2 + "&size=" + n3 + "&campaign=rise", string);
        if (!afc2.sI()) {
            return new aey(false, new JsonArray(), 0, 0, 0, 0, afc2.aGC);
        }
        JsonObject jsonObject = afc2.aGB;
        if (!aew.c(jsonObject)) {
            return new aey(false, new JsonArray(), 0, 0, 0, 0, aew.a(jsonObject, "Could not retrieve Localts orders"));
        }
        return new aey(true, aew.e(jsonObject, "orders"), aew.c(jsonObject, "page"), aew.c(jsonObject, "size"), aew.c(jsonObject, "totalPages"), aew.c(jsonObject, "totalElements"), "");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static afc b(String string, String string2, String string3) {
        Object object;
        HttpURLConnection httpURLConnection = null;
        try {
            JsonElement jsonElement;
            int n2;
            httpURLConnection = (HttpURLConnection)new URL(aFW + string2).openConnection();
            httpURLConnection.setRequestMethod(string);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("User-Agent", "Rise-Client/6.7.10");
            if (string3 != null && !string3.trim().isEmpty()) {
                httpURLConnection.setRequestProperty("X-API-Key", string3.trim());
            }
            object = (n2 = httpURLConnection.getResponseCode()) >= 200 && n2 < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            String string4 = aew.a((InputStream)object);
            JsonElement jsonElement2 = jsonElement = string4.isEmpty() ? null : JsonParser.parseString((String)string4);
            if (jsonElement != null && jsonElement.isJsonObject()) {
                afc afc2 = new afc(n2, jsonElement.getAsJsonObject(), "");
                return afc2;
            }
            afc afc3 = new afc(n2, null, (String)(n2 == 401 ? "Invalid Localts API key" : "Localts API returned HTTP " + n2));
            return afc3;
        }
        catch (Exception exception) {
            object = new afc(0, null, "Unable to reach Localts API");
            return object;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private static String a(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean c(JsonObject jsonObject) {
        return jsonObject.has("success") && !jsonObject.get("success").isJsonNull() && jsonObject.get("success").getAsBoolean();
    }

    private static String a(JsonObject jsonObject, String string) {
        return jsonObject.has("error") && !jsonObject.get("error").isJsonNull() ? jsonObject.get("error").getAsString() : string;
    }

    private static String b(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsString() : "";
    }

    private static int c(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsInt() : 0;
    }

    private static int d(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsInt() : 0;
    }

    private static JsonArray e(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && jsonObject.get(string).isJsonArray() ? jsonObject.getAsJsonArray(string) : new JsonArray();
    }
}

