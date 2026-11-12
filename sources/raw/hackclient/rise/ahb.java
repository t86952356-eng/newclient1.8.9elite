/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.minecraft.client.d;

public final class ahb {
    private static final String aKN = "*";
    private static final String aKO = "|";
    private static final ahb aKP = new ahb();
    private final Map<String, Integer> aKQ = new HashMap<String, Integer>();
    private boolean loaded;

    public static ahb uR() {
        return aKP;
    }

    private ahb() {
    }

    public synchronized int C(String string, String string2) {
        this.ta();
        if (string2 == null || string2.isEmpty()) {
            return 0;
        }
        String string3 = ahb.E(string, string2);
        Integer n2 = this.aKQ.get(string3);
        return n2 == null ? 0 : n2;
    }

    public synchronized int cc(String string) {
        this.ta();
        if (string == null || string.isEmpty()) {
            return 0;
        }
        String string2 = ahb.E(aKN, string);
        Integer n2 = this.aKQ.get(string2);
        return n2 == null ? 0 : n2;
    }

    public synchronized void D(String string, String string2) {
        this.ta();
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        this.cd(ahb.E(string, string2));
        this.cd(ahb.E(aKN, string2));
        this.sJ();
    }

    private void cd(String string) {
        int n2 = this.aKQ.getOrDefault(string, 0);
        int n3 = n2 >= 0x7FFFFFFE ? Integer.MAX_VALUE : n2 + 1;
        this.aKQ.put(string, n3);
    }

    private synchronized void ta() {
        if (this.loaded) {
            return;
        }
        this.loaded = true;
        try {
            File file = ahb.uS();
            if (file == null || !file.isFile()) {
                return;
            }
            Properties properties = new Properties();
            try (FileInputStream fileInputStream = new FileInputStream(file);){
                properties.load(fileInputStream);
            }
            for (String string : properties.stringPropertyNames()) {
                String string2 = properties.getProperty(string);
                if (string2 == null) continue;
                try {
                    int n2 = Integer.parseInt(string2.trim());
                    if (n2 <= 0) continue;
                    this.aKQ.put(string, n2);
                }
                catch (NumberFormatException numberFormatException) {}
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private synchronized void sJ() {
        try {
            File file = ahb.uS();
            if (file == null) {
                return;
            }
            File file2 = file.getParentFile();
            if (file2 != null && !file2.isDirectory()) {
                file2.mkdirs();
            }
            Properties properties = new Properties();
            for (Map.Entry<String, Integer> entry : this.aKQ.entrySet()) {
                Integer n2;
                if (entry.getKey() == null || entry.getKey().isEmpty() || (n2 = entry.getValue()) == null || n2 <= 0) continue;
                properties.setProperty(entry.getKey(), String.valueOf(n2));
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
                fileOutputStream.write("# Rise Pinyin IME usage weights (auto-generated)\n".getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write("# Format: pinyin|word = count, and *|word = global count\n".getBytes(StandardCharsets.UTF_8));
                properties.store(fileOutputStream, null);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static String E(String string, String string2) {
        String string3 = string == null || string.isEmpty() ? aKN : string;
        return string3 + aKO + string2;
    }

    private static File uS() {
        try {
            d d2 = d.AZ();
            if (d2 == null || d2.bhf == null) {
                return null;
            }
            File file = new File(d2.bhf, "Rise");
            return new File(file, "pinyin_usage.properties");
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

