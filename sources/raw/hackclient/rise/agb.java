/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package hackclient.rise;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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

public class agb
extends aft {
    private static final SimpleDateFormat aIz = new SimpleDateFormat("dd.MM.yyyy");
    private boolean aIA;

    public agb(File file, afv afv2) {
        super(file, afv2);
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
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    @Override
    public boolean tu() {
        try {
            this.sZ().createNewFile();
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("version", "6");
            jsonObject2.addProperty("creationDate", aIz.format(new Date()));
            jsonObject.add("Metadata", (JsonElement)jsonObject2);
            FileWriter fileWriter = new FileWriter(this.sZ());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            this.A().toJson((JsonElement)jsonObject, (Appendable)bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
        return true;
    }

    public void tE() {
        this.aIA = true;
    }
}

