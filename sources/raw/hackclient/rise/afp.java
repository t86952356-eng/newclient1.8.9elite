/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package hackclient.rise;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.afr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class afp {
    private static final Gson aHQ = new Gson();
    private static final String aHR = "http://alts.russia-games.eu/api/v1/accounts";
    private static final String aHS = "http://alts.russia-games.eu/api/v1/login";
    public static String aHT = "api-token";

    public static afr[] tm() {
        try {
            String string;
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(aHR).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            httpURLConnection.setRequestMethod("POST");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("api-token", aHT);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.getOutputStream().write(aHQ.toJson((JsonElement)jsonObject).getBytes());
            httpURLConnection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
            }
            jsonObject = JsonParser.parseString((String)stringBuilder.toString()).getAsJsonObject();
            string = jsonObject.get("accounts").getAsJsonArray();
            afr[] afrArray = new afr[string.size()];
            if (afrArray.length == 0) {
                return null;
            }
            for (int i2 = 0; i2 < string.size(); ++i2) {
                afr afr2;
                JsonObject jsonObject2 = string.get(i2).getAsJsonObject();
                afrArray[i2] = afr2 = (afr)aHQ.fromJson((JsonElement)jsonObject2, afr.class);
            }
            return afrArray;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static String am(int n2) {
        try {
            String string;
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(aHS).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            httpURLConnection.setRequestMethod("POST");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("api-token", aHT);
            jsonObject.addProperty("id", (Number)n2);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.getOutputStream().write(aHQ.toJson((JsonElement)jsonObject).getBytes());
            httpURLConnection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
            }
            jsonObject = JsonParser.parseString((String)stringBuilder.toString()).getAsJsonObject();
            if (jsonObject.has("access_token")) {
                return jsonObject.get("access_token").getAsString();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return null;
    }
}

