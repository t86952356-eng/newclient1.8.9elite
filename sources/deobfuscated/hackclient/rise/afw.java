/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package hackclient.rise;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.aeo;
import hackclient.rise.aep;
import hackclient.rise.aer;
import hackclient.rise.aes;
import hackclient.rise.aet;
import hackclient.rise.aft;
import hackclient.rise.afv;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import rise.Client;

public class afw
extends aft {
    private static final SimpleDateFormat aIp = new SimpleDateFormat("dd.MM.yyyy");
    private static final long aIq = 172800000L;

    public afw(File file, afv afv2) {
        super(file, afv2);
    }

    private static boolean a(aeo aeo2) {
        if (!(aeo2 instanceof aes)) {
            return false;
        }
        String string = ((aes)aeo2).sE();
        if (string != null && !string.isEmpty()) {
            return false;
        }
        long l2 = aeo2.sz();
        return l2 > 0L && System.currentTimeMillis() - l2 > 172800000L;
    }

    @Override
    public boolean tt() {
        if (!this.sZ().exists()) {
            return false;
        }
        try {
            FileReader fileReader = new FileReader(this.sZ());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            JsonObject jsonObject = (JsonObject)this.A().fromJson((Reader)bufferedReader, JsonObject.class);
            bufferedReader.close();
            fileReader.close();
            if (jsonObject == null) {
                return false;
            }
            List<aeo> list = Client.a.q().tA();
            list.clear();
            JsonArray jsonArray = jsonObject.getAsJsonArray("data");
            if (jsonArray != null) {
                for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                    JsonObject jsonObject2 = jsonArray.get(i2).getAsJsonObject();
                    aeo aeo2 = new aeo(aep.aFz, "", "", "");
                    aeo2.b(jsonObject2);
                    switch (aeo2.sw()) {
                        case aFz: {
                            aeo2 = new aer("");
                            aeo2.b(jsonObject2);
                            break;
                        }
                        case aFA: {
                            aeo2 = new aes("", "", "", "");
                            aeo2.b(jsonObject2);
                            break;
                        }
                        case aFB: {
                            aeo2 = new aet("", "", "", "");
                            aeo2.b(jsonObject2);
                        }
                    }
                    if (afw.a(aeo2)) {
                        System.out.println("purging expired access-only account: " + aeo2.getName());
                        continue;
                    }
                    list.add(aeo2);
                    System.out.println("loading account: " + aeo2.getName());
                }
            }
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    @Override
    public boolean tu() {
        try {
            List<aeo> list;
            if (!this.sZ().exists()) {
                this.sZ().createNewFile();
            }
            if ((list = Client.a.q().tA()).isEmpty()) {
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("version", "6");
            jsonObject2.addProperty("creationDate", aIp.format(new Date()));
            jsonObject.add("Metadata", (JsonElement)jsonObject2);
            JsonArray jsonArray = new JsonArray();
            for (aeo object2 : list) {
                jsonArray.add((JsonElement)object2.sv());
                System.out.println("writing account: " + object2.getName());
            }
            jsonObject.add("data", (JsonElement)jsonArray);
            FileWriter fileWriter = new FileWriter(this.sZ());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            this.A().toJson((JsonElement)jsonObject, (Appendable)bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }
}

