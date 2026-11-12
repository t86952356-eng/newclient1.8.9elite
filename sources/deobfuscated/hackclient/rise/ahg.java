/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import net.minecraft.client.Minecraft;
import net.minecraft.util.cm;
import rise.Client;
import rise.util.Language;

public class ahg {
    private static boolean aNN;

    public static String cf(String string) {
        return ahg.a(string, Client.a.d());
    }

    public static String a(String string, Language language) {
        String string2;
        if (!aNN) {
            ahg.uW();
        }
        if ((string2 = language.uU().get(string)) == null) {
            string2 = Language.aND.uU().get(string);
        }
        return string2 == null ? string : string2;
    }

    public static void uW() {
        for (Language language : Language.values()) {
            cm cm2 = new cm("rise/text/" + language.uT() + ".properties");
            try (InputStream inputStream = Minecraft.getMinecraft().Br().v(cm2).getInputStream();
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
                String string;
                language.uU().clear();
                while ((string = bufferedReader.readLine()) != null) {
                    int n2;
                    if ((string = string.trim()).isEmpty() || string.startsWith("#") || (n2 = string.indexOf(61)) <= 0) continue;
                    String string2 = string.substring(0, n2).trim();
                    String string3 = string.substring(n2 + 1);
                    if (string2.isEmpty()) continue;
                    if (string3.contains("\\u")) {
                        string3 = string3.replace("\\u2022", "\u2022");
                    }
                    language.uU().put(string2, string3);
                }
            }
            catch (Exception exception) {
                System.out.println("Localization exception");
                exception.printStackTrace();
            }
        }
        aNN = true;
    }

    static {
        ahg.uW();
        aNN = false;
    }
}

