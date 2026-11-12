/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 */
package hackclient.rise;

import com.google.gson.JsonArray;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import rise.Client;
import rise.util.InstanceAccess;

public class aef
implements InstanceAccess {
    public static String t(String string, String string2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
            httpURLConnection.setRequestMethod(string2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            return bufferedReader.readLine();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String aY(String string) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            String string2 = "";
            StringBuilder stringBuilder = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static JsonArray aZ(String string) {
        String string2 = aef.aY(string);
        assert (string2 != null);
        return (JsonArray)Client.a.A().fromJson(string2, JsonArray.class);
    }
}

