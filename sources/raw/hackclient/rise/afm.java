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
import hackclient.rise.a;
import hackclient.rise.afz;
import hackclient.rise.agc;
import hackclient.rise.gi;
import hackclient.rise.s;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class afm {
    private static final afm aHx = new afm();
    private final Map<String, Long> aHy = new HashMap<String, Long>();
    private final Map<String, Long> aHz = new HashMap<String, Long>();
    private final Map<String, Long> aHA = new HashMap<String, Long>();
    private final long aHB = System.currentTimeMillis();
    private long aHC;
    private long aHD;
    private final Map<String, String> aHE = new HashMap<String, String>();
    private String aHF;
    private String aHG;
    private String aHH;
    private String aHI;
    private long aHJ;
    private long aHK;
    private String aHL;
    private boolean loaded;

    public static afm sY() {
        return aHx;
    }

    private afm() {
    }

    private File sZ() {
        return new File(agc.aIB, "command_usage.json");
    }

    private synchronized void ta() {
        if (this.loaded) {
            return;
        }
        this.loaded = true;
        this.load();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long bA(String string) {
        if (string == null || string.isEmpty()) {
            return 0L;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHy.getOrDefault(string, 0L);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String tb() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHF;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String tc() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHG;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String td() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHI;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long te() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHJ;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long tf() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHK;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String tg() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHL;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bB(String string) {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            String string2 = this.bC(string);
            if (string2 == null) {
                return;
            }
            String string3 = this.bC(this.aHL);
            if (string3 != null && string2.equalsIgnoreCase(string3) && this.aHK >= this.aHB) {
                return;
            }
            this.aHK = System.currentTimeMillis();
            this.aHL = string2;
            this.aHA.put("event:serverJoin", this.aHK);
            this.sJ();
        }
    }

    private String bC(String string) {
        int n2;
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return null;
        }
        if (string2.startsWith("http://")) {
            string2 = string2.substring("http://".length());
        }
        if (string2.startsWith("https://")) {
            string2 = string2.substring("https://".length());
        }
        if ((n2 = string2.indexOf(58)) > 0) {
            string2 = string2.substring(0, n2);
        }
        return (string2 = string2.trim()).isEmpty() ? null : string2.toLowerCase(Locale.ROOT);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bD(String string) {
        if (string == null) {
            return;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return;
        }
        if ("latest".equalsIgnoreCase(string2)) {
            return;
        }
        this.ta();
        try {
            JsonObject jsonObject = afz.b(false, false);
            String string3 = this.a(jsonObject);
            afm afm2 = this;
            synchronized (afm2) {
                this.aHG = string2;
                this.aHI = string3;
                this.aHJ = System.currentTimeMillis();
                this.aHE.clear();
                this.aHE.putAll(this.d(jsonObject));
            }
            this.sJ();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void th() {
        afm afm2 = this;
        synchronized (afm2) {
            this.aHD = this.aHC;
            this.aHC = System.currentTimeMillis();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long ti() {
        afm afm2 = this;
        synchronized (afm2) {
            if (this.aHD <= 0L || this.aHC <= 0L) {
                return -1L;
            }
            return Math.max(0L, this.aHC - this.aHD);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int tj() {
        try {
            JsonObject jsonObject = afz.b(false, false);
            Map<String, String> map = this.d(jsonObject);
            afm afm2 = this;
            synchronized (afm2) {
                if (this.aHE.isEmpty()) {
                    return -1;
                }
                int n2 = 0;
                for (Map.Entry<String, String> entry : this.aHE.entrySet()) {
                    String string = entry.getKey();
                    String string2 = entry.getValue();
                    String string3 = map.get(string);
                    if (string3 == null || string2 == null || string3.equals(string2)) continue;
                    ++n2;
                }
                return n2;
            }
        }
        catch (Throwable throwable) {
            return -1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String tk() {
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            return this.aHH;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bE(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            this.aHy.put(string, this.aHy.getOrDefault(string, 0L) + 1L);
            this.sJ();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(String string, long l2) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (l2 <= 0L) {
            return false;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            long l3 = this.aHA.getOrDefault(string, 0L);
            return l3 > 0L && System.currentTimeMillis() - l3 <= l2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(String string, String[] stringArray) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }
        if (stringArray == null || stringArray.length == 0) {
            return null;
        }
        this.ta();
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        afm afm2 = this;
        synchronized (afm2) {
            String string3;
            String string4 = null;
            long l2 = -1L;
            long l3 = -1L;
            int n2 = Integer.MAX_VALUE;
            for (String string5 : stringArray) {
                if (string5 == null || (string3 = string5.trim()).isEmpty()) continue;
                String string6 = string3.toLowerCase(Locale.ROOT);
                String string7 = "cmd.alias:" + string2 + ":" + string6;
                long l4 = this.aHy.getOrDefault(string7, 0L);
                long l5 = this.aHA.getOrDefault(string7, 0L);
                int n3 = string3.length();
                if (l4 <= l2 && (l4 != l2 || l5 <= l3) && (l4 != l2 || l5 != l3 || n3 >= n2)) continue;
                string4 = string3;
                l2 = l4;
                l3 = l5;
                n2 = n3;
            }
            if (l2 <= 0L) {
                string4 = null;
                n2 = Integer.MAX_VALUE;
                for (String string5 : stringArray) {
                    int n4;
                    if (string5 == null || (string3 = string5.trim()).isEmpty() || (n4 = string3.length()) >= n2) continue;
                    n2 = n4;
                    string4 = string3;
                }
            }
            return string4;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bF(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            long l2 = System.currentTimeMillis();
            this.aHA.put(string, l2);
            this.aHy.put(string, this.aHy.getOrDefault(string, 0L) + 1L);
            this.sJ();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<String> j(String string, int n2) {
        if (string == null || string.isEmpty()) {
            return Collections.emptyList();
        }
        if (n2 <= 0) {
            return Collections.emptyList();
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            ArrayList<Map.Entry> arrayList = new ArrayList<Map.Entry>();
            for (Map.Entry<String, Long> entry2 : this.aHy.entrySet()) {
                String string2 = entry2.getKey();
                Long l2 = entry2.getValue();
                if (string2 == null || l2 == null || !string2.startsWith(string) || l2 <= 0L) continue;
                arrayList.add(entry2);
            }
            arrayList.sort(Comparator.comparingLong(entry -> (Long)entry.getValue()).reversed());
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < Math.min(n2, arrayList.size()); ++i2) {
                arrayList2.add((String)((Map.Entry)arrayList.get(i2)).getKey());
            }
            return arrayList2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean bG(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            long l2 = System.currentTimeMillis();
            long l3 = this.aHz.getOrDefault(string, 0L);
            return l2 >= l3;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bH(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            this.aHy.put("suggest.shown:" + string, this.aHy.getOrDefault("suggest.shown:" + string, 0L) + 1L);
            this.sJ();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bI(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            long l2 = System.currentTimeMillis();
            this.aHz.put(string, Math.max(this.aHz.getOrDefault(string, 0L), l2 + 60000L));
            this.aHy.put("suggest.accepted:" + string, this.aHy.getOrDefault("suggest.accepted:" + string, 0L) + 1L);
            this.sJ();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bJ(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        this.ta();
        afm afm2 = this;
        synchronized (afm2) {
            long l2 = System.currentTimeMillis();
            String string2 = "suggest.ignored:" + string;
            long l3 = this.aHy.getOrDefault(string2, 0L) + 1L;
            this.aHy.put(string2, l3);
            long l4 = Math.min(4L, l3 - 1L);
            long l5 = string.startsWith("config.save.dirty:") ? Math.min(1800000L, 300000L * (1L << (int)l4)) : Math.min(600000L, 30000L * (1L << (int)l4));
            this.aHz.put(string, Math.max(this.aHz.getOrDefault(string, 0L), l2 + l5));
            this.sJ();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(s s2, String[] stringArray) {
        Object object;
        String[] stringArray2;
        block16: {
            if (s2 == null) {
                return;
            }
            if (stringArray == null || stringArray.length == 0) {
                return;
            }
            try {
                stringArray2 = String.join((CharSequence)" ", stringArray).trim();
                if (stringArray2.isEmpty()) break block16;
                this.ta();
                object = this;
                synchronized (object) {
                    this.aHF = "." + (String)stringArray2;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        stringArray2 = s2.getExpressions();
        Object object2 = object = stringArray2 == null || stringArray2.length == 0 ? null : stringArray2[0];
        if (object == null || ((String)object).trim().isEmpty()) {
            object = stringArray[0];
        }
        if (object == null || ((String)object).trim().isEmpty()) {
            return;
        }
        String string = ((String)object).trim().toLowerCase(Locale.ROOT);
        this.bF("cmd:" + string);
        try {
            String string2;
            String string3 = string2 = stringArray[0] == null ? "" : stringArray[0].trim();
            if (!string2.isEmpty()) {
                this.bF("cmd.alias:" + string + ":" + string2.toLowerCase(Locale.ROOT));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        for (int i2 = 1; i2 < stringArray.length; ++i2) {
            String string4;
            String string5 = stringArray[i2];
            if (string5 == null || (string5 = string5.trim()).isEmpty()) continue;
            String string6 = string5.toLowerCase(Locale.ROOT);
            int n2 = i2 - 1;
            this.bF("arg:" + string + ":" + n2 + ":" + string6);
            String string7 = this.bK(string5);
            if (string7 == null || (string4 = string7.toLowerCase(Locale.ROOT)).isEmpty() || string4.equals(string6)) continue;
            this.bF("arg:" + string + ":" + n2 + ":" + string4);
        }
        if (string.equals("config")) {
            this.d(stringArray);
        } else if (string.equals("bind")) {
            this.e(stringArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(String[] stringArray) {
        if (stringArray.length < 3) {
            return;
        }
        String string = stringArray[1];
        String string2 = stringArray[2];
        if (string == null || string2 == null) {
            return;
        }
        if (!string.equalsIgnoreCase("load")) {
            return;
        }
        String string3 = string2.trim();
        if (string3.isEmpty()) {
            return;
        }
        this.bF("config.load:" + string3.toLowerCase(Locale.ROOT));
        try {
            afm afm2 = this;
            synchronized (afm2) {
                if (!"latest".equalsIgnoreCase(string3)) {
                    this.aHG = string3;
                    this.aHI = null;
                    this.aHJ = 0L;
                }
            }
            this.sJ();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void e(String[] stringArray) {
        if (stringArray.length < 2) {
            return;
        }
        String string = stringArray[1];
        if (string == null) {
            return;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return;
        }
        this.bF("bind.target:" + string2.toLowerCase(Locale.ROOT));
        try {
            afm afm2 = this;
            synchronized (afm2) {
                this.aHH = string2.replace(" ", "");
            }
            this.sJ();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private String bK(String string) {
        try {
            Object t2;
            String string2;
            String string3 = string2 = string == null ? "" : string.trim();
            if (string2.isEmpty()) {
                return null;
            }
            try {
                t2 = a.a.t().a(string2);
                if (t2 != null) {
                    return this.b(t2.getAliases(), t2.getName());
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                t2 = a.a.g().q(string2);
                if (t2 != null) {
                    return this.b(((gi)t2).getAliases(), ((gi)t2).getName());
                }
            }
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    private String b(String[] stringArray, String string) {
        String string2 = null;
        if (stringArray != null) {
            for (String string3 : stringArray) {
                String string4;
                String string5;
                if (string3 == null || (string5 = string3.trim()).isEmpty() || (string4 = string5.replace(" ", "")).isEmpty()) continue;
                if (!string5.contains(" ")) {
                    return string4;
                }
                if (string2 != null) continue;
                string2 = string4;
            }
        }
        if (string2 != null) {
            return string2;
        }
        if (string == null) {
            return null;
        }
        String string6 = string.trim().replace(" ", "");
        return string6.isEmpty() ? null : string6;
    }

    private void load() {
        try {
            File file = this.sZ();
            if (!file.exists()) {
                return;
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
                long l2;
                JsonElement jsonElement;
                String string;
                String string2;
                JsonObject jsonObject = (JsonObject)a.a.A().fromJson((Reader)bufferedReader, JsonObject.class);
                if (jsonObject == null) {
                    return;
                }
                if (jsonObject.has("lastExecuted") && jsonObject.get("lastExecuted").isJsonPrimitive()) {
                    try {
                        string2 = jsonObject.get("lastExecuted").getAsString();
                        if (string2 != null && !string2.trim().isEmpty()) {
                            this.aHF = string2.trim();
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastLoadedConfig") && jsonObject.get("lastLoadedConfig").isJsonPrimitive()) {
                    try {
                        string2 = jsonObject.get("lastLoadedConfig").getAsString();
                        if (string2 != null && !string2.trim().isEmpty()) {
                            this.aHG = string2.trim();
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastLoadedConfigFingerprint") && jsonObject.get("lastLoadedConfigFingerprint").isJsonPrimitive()) {
                    try {
                        string2 = jsonObject.get("lastLoadedConfigFingerprint").getAsString();
                        if (string2 != null && !string2.trim().isEmpty()) {
                            this.aHI = string2.trim();
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastLoadedConfigAt") && jsonObject.get("lastLoadedConfigAt").isJsonPrimitive()) {
                    try {
                        this.aHJ = jsonObject.get("lastLoadedConfigAt").getAsLong();
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastBindTarget") && jsonObject.get("lastBindTarget").isJsonPrimitive()) {
                    try {
                        string2 = jsonObject.get("lastBindTarget").getAsString();
                        if (string2 != null && !string2.trim().isEmpty()) {
                            this.aHH = string2.trim();
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastServerJoinAt") && jsonObject.get("lastServerJoinAt").isJsonPrimitive()) {
                    try {
                        this.aHK = jsonObject.get("lastServerJoinAt").getAsLong();
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("lastServerHost") && jsonObject.get("lastServerHost").isJsonPrimitive()) {
                    try {
                        string2 = jsonObject.get("lastServerHost").getAsString();
                        if (string2 != null && !string2.trim().isEmpty()) {
                            this.aHL = string2.trim();
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (jsonObject.has("suggestionNextEligibleAt") && jsonObject.get("suggestionNextEligibleAt").isJsonObject()) {
                    try {
                        string2 = jsonObject.getAsJsonObject("suggestionNextEligibleAt");
                        for (Map.Entry entry : string2.entrySet()) {
                            string = (String)entry.getKey();
                            jsonElement = (JsonElement)entry.getValue();
                            if (string == null || string.isEmpty() || jsonElement == null || !jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isNumber() || (l2 = jsonElement.getAsLong()) <= 0L) continue;
                            this.aHz.put(string, l2);
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                Object object = string2 = jsonObject.has("counts") && jsonObject.get("counts").isJsonObject() ? jsonObject.getAsJsonObject("counts") : null;
                if (string2 == null) {
                    return;
                }
                for (Map.Entry entry : string2.entrySet()) {
                    string = (String)entry.getKey();
                    jsonElement = (JsonElement)entry.getValue();
                    if (string == null || string.isEmpty() || jsonElement == null || !jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isNumber() || (l2 = jsonElement.getAsLong()) <= 0L) continue;
                    this.aHy.put(string, l2);
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private void sJ() {
        try {
            Object object;
            File file = this.sZ();
            File file2 = file.getParentFile();
            if (file2 != null && !file2.exists()) {
                file2.mkdirs();
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("version", "6.9.9");
            if (this.aHF != null && !this.aHF.trim().isEmpty()) {
                jsonObject.addProperty("lastExecuted", this.aHF.trim());
            }
            if (this.aHG != null && !this.aHG.trim().isEmpty()) {
                jsonObject.addProperty("lastLoadedConfig", this.aHG.trim());
            }
            if (this.aHI != null && !this.aHI.trim().isEmpty()) {
                jsonObject.addProperty("lastLoadedConfigFingerprint", this.aHI.trim());
            }
            if (this.aHJ > 0L) {
                jsonObject.addProperty("lastLoadedConfigAt", (Number)this.aHJ);
            }
            if (this.aHH != null && !this.aHH.trim().isEmpty()) {
                jsonObject.addProperty("lastBindTarget", this.aHH.trim());
            }
            if (this.aHK > 0L) {
                jsonObject.addProperty("lastServerJoinAt", (Number)this.aHK);
            }
            if (this.aHL != null && !this.aHL.trim().isEmpty()) {
                jsonObject.addProperty("lastServerHost", this.aHL.trim());
            }
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry<String, Long> object22 : this.aHz.entrySet()) {
                String string = object22.getKey();
                object = object22.getValue();
                if (string == null || string.isEmpty() || object == null || (Long)object <= 0L) continue;
                jsonObject2.addProperty(string, (Number)object);
            }
            jsonObject.add("suggestionNextEligibleAt", (JsonElement)jsonObject2);
            JsonObject jsonObject3 = new JsonObject();
            for (Map.Entry<String, Long> entry : this.aHy.entrySet()) {
                object = entry.getKey();
                Long l2 = entry.getValue();
                if (object == null || ((String)object).isEmpty() || l2 == null || l2 <= 0L) continue;
                jsonObject3.addProperty((String)object, (Number)l2);
            }
            jsonObject.add("counts", (JsonElement)jsonObject3);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));){
                a.a.A().toJson((JsonElement)jsonObject, (Appendable)bufferedWriter);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private String a(JsonObject jsonObject) {
        try {
            if (jsonObject == null) {
                return null;
            }
            JsonObject jsonObject2 = jsonObject.deepCopy();
            jsonObject2.remove("Metadata");
            jsonObject2.remove("theme");
            String string = a.a.A().toJson((JsonElement)jsonObject2);
            return afm.aO(string);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private Map<String, String> d(JsonObject jsonObject) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            if (jsonObject == null) {
                return hashMap;
            }
            for (Map.Entry entry : jsonObject.entrySet()) {
                String string;
                String string2;
                String string3 = (String)entry.getKey();
                JsonElement jsonElement = (JsonElement)entry.getValue();
                if (string3 == null || string3.isEmpty() || jsonElement == null || "Metadata".equalsIgnoreCase(string3) || "theme".equalsIgnoreCase(string3) || !jsonElement.isJsonObject() || (string2 = afm.aO(string = a.a.A().toJson(jsonElement))) == null) continue;
                hashMap.put(string3, string2);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return hashMap;
    }

    private static String aO(String string) {
        if (string == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
            byte[] byArray2 = messageDigest.digest(byArray);
            StringBuilder stringBuilder = new StringBuilder(byArray2.length * 2);
            for (byte by2 : byArray2) {
                stringBuilder.append(String.format("%02x", by2));
            }
            return stringBuilder.toString();
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

