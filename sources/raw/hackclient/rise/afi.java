/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.net.ssl.HttpsURLConnection;

public class afi {
    private static final String aGP = "https://raw.githubusercontent.com/jeanphorn/wordlist/master/usernames.txt";

    public static String[] sM() {
        try {
            String string;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(aGP).openConnection();
            httpsURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0");
            int n2 = httpsURLConnection.getResponseCode();
            boolean bl2 = n2 / 100 != 2 && n2 / 100 != 3;
            InputStream inputStream2 = inputStream = bl2 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream();
            if (inputStream == null) {
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string).append(System.lineSeparator());
            }
            bufferedReader.close();
            return stringBuilder.toString().split(System.lineSeparator());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static String sN() {
        String[] stringArray = afi.ak(1);
        return stringArray == null ? null : stringArray[0];
    }

    public static String[] ak(int n2) {
        String[] stringArray = afi.sM();
        if (stringArray == null) {
            return null;
        }
        String[] stringArray2 = new String[n2];
        List list = Arrays.stream(stringArray).filter(string -> string.length() >= 3 && string.length() <= 6).collect(Collectors.toList());
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = (String)list.get((int)(Math.random() * (double)list.size()));
            String string3 = (String)list.get((int)(Math.random() * (double)list.size()));
            String string4 = afi.B(string2, string3);
            stringArray2[i2] = afi.by(string4);
        }
        return stringArray2;
    }

    private static String B(String string, String string2) {
        int n2 = (int)(Math.random() * 4.0);
        switch (n2) {
            case 0: {
                return string + "_" + string2;
            }
            case 1: {
                return string + string2.substring(0, 2) + (int)(Math.random() * 100.0);
            }
            case 2: {
                int n3 = (int)(Math.random() * (double)Math.min(string.length(), string2.length()));
                return string.substring(0, n3) + "_" + string2.substring(n3);
            }
            case 3: {
                StringBuilder stringBuilder = new StringBuilder(string).append(string2);
                int n4 = (int)(Math.random() * (double)stringBuilder.length());
                int n5 = (int)(Math.random() * (double)stringBuilder.length());
                stringBuilder.insert(n4, "_");
                stringBuilder.insert(n5, (int)(Math.random() * 100.0));
                return stringBuilder.toString();
            }
        }
        return string + string2;
    }

    private static String by(String string) {
        double d2 = 0.125;
        double d3 = 0.25;
        char[] cArray = string.toCharArray();
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char c2 = cArray[i2];
            if ((i2 == 0 || (cArray[i2 - 1] == '_' || Character.isDigit(cArray[i2 - 1])) && Character.isLetter(c2)) && Math.random() < d3) {
                cArray[i2] = Character.toUpperCase(c2);
                continue;
            }
            char c3 = Character.toLowerCase(c2);
            char c4 = afi.a(c3);
            if (c4 == c3 || !(Math.random() < d2)) continue;
            cArray[i2] = c4;
            d2 *= 0.5;
        }
        return new String(cArray);
    }

    private static char a(char c2) {
        if (c2 == 'a') {
            return '4';
        }
        if (c2 == 'e') {
            return '3';
        }
        if (c2 == 'i') {
            return '1';
        }
        if (c2 == 'o') {
            return '0';
        }
        if (c2 == 't') {
            return '7';
        }
        return c2;
    }
}

