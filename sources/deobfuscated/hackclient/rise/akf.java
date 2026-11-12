/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;

public class akf {
    public static String a(String string, String string2, boolean bl2) {
        try {
            String string3;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
            httpsURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            byte[] byArray = string2.getBytes(StandardCharsets.UTF_8);
            int n2 = byArray.length;
            httpsURLConnection.setFixedLengthStreamingMode(n2);
            httpsURLConnection.addRequestProperty("Content-Type", bl2 ? "application/json" : "application/x-www-form-urlencoded; charset=UTF-8");
            httpsURLConnection.addRequestProperty("Accept", "application/json");
            httpsURLConnection.connect();
            try (OutputStream outputStream = httpsURLConnection.getOutputStream();){
                outputStream.write(byArray);
            }
            int n3 = httpsURLConnection.getResponseCode();
            InputStream inputStream2 = inputStream = n3 / 100 == 2 || n3 / 100 == 3 ? httpsURLConnection.getInputStream() : httpsURLConnection.getErrorStream();
            if (inputStream == null) {
                System.err.println(n3 + ": " + string);
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string3 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string3);
            }
            bufferedReader.close();
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String I(String string, String string2) {
        try {
            String string3;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
            httpsURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
            httpsURLConnection.addRequestProperty("Accept", "application/json");
            httpsURLConnection.addRequestProperty("Authorization", "Bearer " + string2);
            if (httpsURLConnection.getResponseCode() == 200) {
                String string4;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                while ((string4 = bufferedReader.readLine()) != null) {
                    stringBuilder.append(string4);
                }
                return stringBuilder.toString();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getErrorStream()));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string3 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string3);
            }
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return null;
        }
    }
}

