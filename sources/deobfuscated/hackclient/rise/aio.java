/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aio {
    public static boolean cl(String string) {
        try {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            Process process = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\tasklist.exe");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string2);
            }
            bufferedReader.close();
            return stringBuilder.toString().toLowerCase().contains(string.toLowerCase());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }
}

