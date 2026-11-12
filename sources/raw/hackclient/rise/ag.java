/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package hackclient.rise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hackclient.rise.afl;
import hackclient.rise.afu;
import hackclient.rise.s;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class ag
extends s {
    public final File bv = new File(afu.aIj, "data");
    private static final String bw = "spotify.json";

    public ag() {
        super("set Spotify API secret & ID", "spotify", "music");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length >= 3) {
            String string = stringArray[1];
            String string2 = stringArray[2];
            Map<String, String> map = this.aS();
            switch (string) {
                case "clientsecret": {
                    map.remove("client_secret");
                    map.put("client_secret", string2);
                    afl.b("Successfully Set clientsecret", new Object[0]);
                    break;
                }
                case "clientid": {
                    map.remove("client_id");
                    map.put("client_id", string2);
                    afl.b("Successfully Set clientid", new Object[0]);
                }
            }
            this.a(map);
        } else {
            afl.b("command.spotify.usage", new Object[0]);
        }
    }

    private Map<String, String> aS() {
        File file = new File(this.bv, bw);
        Map<String, String> map = new HashMap<String, String>();
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file);){
                Gson gson = new Gson();
                map = (Map)gson.fromJson((Reader)fileReader, Map.class);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return map;
    }

    private void a(Map<String, String> map) {
        File file = new File(this.bv, bw);
        try (FileWriter fileWriter = new FileWriter(file);){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(map, (Appendable)fileWriter);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

