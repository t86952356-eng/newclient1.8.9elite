/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package hackclient.rise;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.afu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public final class afe {
    private static final File aGH = new File(afu.aIj, "alts/localts_config.json");
    private static String cs = "";
    private static String aGI = "";

    private afe() {
    }

    public static void init() {
        afe.load();
    }

    public static void load() {
        if (!aGH.exists()) {
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(aGH));){
            JsonObject jsonObject = JsonParser.parseReader((Reader)bufferedReader).getAsJsonObject();
            if (jsonObject.has("apiKey")) {
                cs = jsonObject.get("apiKey").getAsString();
            }
            if (jsonObject.has("lastProductId")) {
                aGI = jsonObject.get("lastProductId").getAsString();
            }
        }
        catch (Exception exception) {
            System.err.println("Failed to load Localts config: " + exception.getMessage());
        }
    }

    public static void sJ() {
        try {
            File file = aGH.getParentFile();
            if (!file.exists()) {
                file.mkdirs();
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("apiKey", cs);
            jsonObject.addProperty("lastProductId", aGI);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(aGH));){
                bufferedWriter.write(jsonObject.toString());
            }
        }
        catch (Exception exception) {
            System.err.println("Failed to save Localts config: " + exception.getMessage());
        }
    }

    public static String sK() {
        return cs;
    }

    public static void bw(String string) {
        cs = string == null ? "" : string;
        afe.sJ();
    }

    public static String sL() {
        return aGI;
    }

    public static void bx(String string) {
        aGI = string == null ? "" : string;
        afe.sJ();
    }
}

