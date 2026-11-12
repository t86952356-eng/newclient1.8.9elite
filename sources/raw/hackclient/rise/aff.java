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
import hackclient.rise.aeu;
import hackclient.rise.aex;
import hackclient.rise.afg;
import hackclient.rise.afu;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class aff {
    public static final File aGJ = new File(afu.aIj, "alts/localts_orders");
    private static final SimpleDateFormat aGK = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");

    private aff() {
    }

    public static void init() {
        if (!aGJ.exists()) {
            aGJ.mkdirs();
        }
    }

    public static File g(long l2) {
        File[] fileArray = aGJ.listFiles(file -> file.isDirectory() && file.getName().startsWith("order_"));
        if (fileArray == null || fileArray.length == 0) {
            return null;
        }
        File file2 = null;
        long l3 = 0L;
        for (File file3 : fileArray) {
            long l4;
            File file4 = new File(file3, "order.txt");
            long l5 = l4 = file4.isFile() ? file4.lastModified() : file3.lastModified();
            if (l4 <= l3) continue;
            file2 = file3;
            l3 = l4;
        }
        return file2 != null && System.currentTimeMillis() - l3 <= l2 ? file2 : null;
    }

    public static afg a(aex aex2) {
        return aff.a(aex2, null);
    }

    public static afg a(aex aex2, File file) {
        afg afg2;
        File file2;
        aff.init();
        String string = aex2.aGb.isEmpty() ? "pending" : aex2.aGb;
        boolean bl2 = file != null;
        File file3 = file2 = bl2 ? file : new File(aGJ, "order_" + string);
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        File file4 = new File(file2, "order.txt");
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = bl2 ? aff.b(file2) : 1;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file4, bl2));
        try {
            if (bl2) {
                bufferedWriter.write("\nReplacement order ID: " + string + "\n");
                bufferedWriter.write("Saved: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n");
            } else {
                bufferedWriter.write("===========================================\n");
                bufferedWriter.write("             LOCALTS ORDER\n");
                bufferedWriter.write("===========================================\n");
                bufferedWriter.write("Order ID: " + string + "\n");
                bufferedWriter.write("Status: " + aex2.aGc + "\n");
                bufferedWriter.write("Product: " + aex2.aGd + "\n");
                bufferedWriter.write("Saved: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n");
                bufferedWriter.write("===========================================\n\n");
            }
            for (JsonElement jsonElement : aex2.aGe) {
                JsonObject jsonObject;
                String string2;
                if (!jsonElement.isJsonObject() || (string2 = aff.f(jsonObject = jsonElement.getAsJsonObject(), "content")).trim().isEmpty()) continue;
                String string3 = String.format("item-%02d", n5++);
                ++n4;
                if (aff.a(string2, file2, string3 + ".zip")) {
                    ++n3;
                    bufferedWriter.write("Item #" + n4 + ": extracted archive\n");
                    continue;
                }
                if (aeu.bo(string2)) {
                    aff.d(new File(file2, string3 + ".txt"), string2);
                    ++n2;
                    bufferedWriter.write("Item #" + n4 + ": MSAAUTH cookie saved as " + string3 + ".txt\n");
                    continue;
                }
                aff.c(new File(file2, string3 + ".txt"), string2);
                bufferedWriter.write("Item #" + n4 + ": delivery saved as " + string3 + ".txt\n");
            }
            bufferedWriter.write("\nPurchased via Localts: https://localts.store/?campaign=rise\n");
            afg2 = new afg(file2, n4, n2, n3);
        }
        catch (Throwable throwable) {
            try {
                try {
                    bufferedWriter.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception exception) {
                System.err.println("Failed to save Localts order: " + exception.getMessage());
                return null;
            }
        }
        bufferedWriter.close();
        return afg2;
    }

    private static int b(File file) {
        int n2 = 0;
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return 1;
        }
        for (File file2 : fileArray) {
            String string = file2.getName();
            if (!string.startsWith("item-")) continue;
            int n3 = string.indexOf(46, 5);
            String string2 = n3 < 0 ? string.substring(5) : string.substring(5, n3);
            try {
                n2 = Math.max(n2, Integer.parseInt(string2));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return n2 + 1;
    }

    private static void c(File file, String string) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));){
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
    }

    private static void d(File file, String string) {
        int n2;
        String string2 = string.trim();
        int n3 = string2.indexOf(59);
        if (n3 >= 0) {
            string2 = string2.substring(0, n3);
        }
        if ((n2 = string2.indexOf(61)) <= 0 || n2 == string2.length() - 1) {
            throw new IOException("Invalid MSAAUTH cookie");
        }
        String string3 = string2.substring(0, n2);
        String string4 = string2.substring(n2 + 1);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));){
            bufferedWriter.write("# Netscape HTTP Cookie File\n");
            bufferedWriter.write(".login.live.com\tTRUE\t/\tTRUE\t2147483647\t" + string3 + "\t" + string4 + "\n");
        }
    }

    private static boolean a(String string, File file, String string2) {
        try {
            String string3 = string.startsWith("data:") && string.contains(",") ? string.substring(string.indexOf(44) + 1) : string;
            byte[] byArray = Base64.getDecoder().decode(string3.replaceAll("\\s", ""));
            if (byArray.length < 4 || byArray[0] != 80 || byArray[1] != 75) {
                return false;
            }
            File file2 = new File(file, string2);
            try (Object object = new FileOutputStream(file2);){
                ((FileOutputStream)object).write(byArray);
            }
            object = file.getCanonicalPath() + File.separator;
            try (ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(byArray));){
                ZipEntry zipEntry;
                while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                    File file3 = new File(file, zipEntry.getName());
                    if (!file3.getCanonicalPath().startsWith((String)object)) {
                        throw new IOException("Invalid archive path");
                    }
                    if (zipEntry.isDirectory()) {
                        file3.mkdirs();
                        continue;
                    }
                    File file4 = file3.getParentFile();
                    if (!file4.exists() && !file4.mkdirs()) {
                        throw new IOException("Could not create delivery folder");
                    }
                    aff.a(zipInputStream, file3);
                }
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static void a(InputStream inputStream, File file) {
        byte[] byArray = new byte[8192];
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
            int n2;
            while ((n2 = inputStream.read(byArray)) >= 0) {
                fileOutputStream.write(byArray, 0, n2);
            }
        }
    }

    private static String f(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsString() : "";
    }
}

