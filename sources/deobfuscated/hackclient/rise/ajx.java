/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajy;
import hackclient.rise.ajz;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ajx {
    static String aRk = ajx.j(ajx.wp()) + "dleotn6oc94kb" + ajx.wm();

    public static String wl() {
        return aRk;
    }

    private static String wm() {
        String string = ajx.wn();
        String string2 = ajx.wo();
        if (ajy.wq().equals((Object)ajz.aRm) && string.length() >= 5 && string2.length() >= 5) {
            return new String(Base64.getEncoder().encode((string + "_" + string2).getBytes())).replaceAll("==", "");
        }
        return ajx.j(ajx.wp());
    }

    private static String wn() {
        return ajx.f(new String[]{"cmd.exe", "/c", "wmic baseboard get serialnumber"});
    }

    private static String wo() {
        return ajx.f(new String[]{"cmd.exe", "/c", "wmic cpu get processorid"});
    }

    private static String f(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String string;
            Process process = Runtime.getRuntime().exec(stringArray);
            process.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            boolean bl2 = false;
            while ((string = bufferedReader.readLine()) != null) {
                if (bl2 && !string.trim().isEmpty()) {
                    stringBuilder.append(string.trim());
                    break;
                }
                bl2 = true;
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            return "unknown";
        }
        return stringBuilder.toString();
    }

    private static byte[] wp() {
        try {
            ajz ajz2 = ajy.wq();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String string = ajz2.equals((Object)ajz.aRm) ? "VANTAGE_" + System.getProperty("os.name") + System.getProperty("os.arch") + System.getProperty("os.version") + System.getProperty("user.name") + System.getProperty("user.home") + System.getenv("NUMBER_OF_PROCESSORS") : "VANTAGE_" + ajz2.wr() + System.getProperty("os.arch") + Runtime.getRuntime().availableProcessors() + System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("PROCESSOR_ARCHITECTURE") + System.getenv("PROCESSOR_ARCHITEW6432") + System.getenv("NUMBER_OF_PROCESSORS") + System.getenv("COMPUTERNAME") + System.getenv("os") + System.getenv("SystemRoot") + System.getenv("HOMEDRIVE") + System.getenv("PROCESSOR_LEVEL") + System.getenv("PROCESSOR_REVISION") + System.getenv("HOME") + System.getenv("HOSTNAME") + System.getenv("SHELL") + System.getenv("LOGNAME") + System.getenv("USERNAME");
            return messageDigest.digest(string.getBytes());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error("HWIDException: ", noSuchAlgorithmException);
        }
    }

    private static String j(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(2 * byArray.length);
        for (byte by2 : byArray) {
            String string = Integer.toHexString(0xFF & by2);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

