/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.agy;
import hackclient.rise.ahb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import net.minecraft.client.Minecraft;
import net.minecraft.util.cm;

public final class agx {
    private final NavigableMap<String, List<String>> aKw;
    private static final int aKx = 64;
    private static final String[] aKy = new String[]{"rise/ime/rise.dict.yaml", "rise/ime/rise_extra_common_words.dict.yaml", "rise/ime/luna_pinyin.sogou2.dict.yaml"};

    private agx(NavigableMap<String, List<String>> navigableMap) {
        this.aKw = navigableMap;
    }

    public List<String> s(String string, int n2) {
        if (string == null) {
            return Collections.emptyList();
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        List list = (List)this.aKw.get(string2);
        if (list != null && !list.isEmpty()) {
            return agx.a(string2, list, n2);
        }
        if (n2 <= 0) {
            return Collections.emptyList();
        }
        ArrayList<String> arrayList = new ArrayList<String>(n2);
        String string3 = string2;
        String string4 = string2 + "\uffff";
        for (List list2 : this.aKw.subMap(string3, true, string4, true).values()) {
            for (String string5 : list2) {
                if (string5 == null || string5.isEmpty()) continue;
                arrayList.add(string5);
                if (arrayList.size() < n2) continue;
                return arrayList;
            }
        }
        return agx.a(string2, arrayList, n2);
    }

    private static List<String> a(String string, List<String> list, int n2) {
        int n3;
        Object object;
        int n4;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        if (list.size() <= 1) {
            return list;
        }
        ahb ahb2 = ahb.uR();
        ArrayList<agy> arrayList = new ArrayList<agy>(list.size());
        for (n4 = 0; n4 < list.size(); ++n4) {
            object = list.get(n4);
            if (object == null || ((String)object).isEmpty()) continue;
            n3 = ahb2.C(string, (String)object);
            int n5 = ahb2.cc((String)object);
            int n6 = n3 * 1000 + n5;
            arrayList.add(new agy((String)object, n6, n4));
        }
        arrayList.sort((agy2, agy3) -> {
            int n2 = Integer.compare(agy3.aKA, agy2.aKA);
            if (n2 != 0) {
                return n2;
            }
            return Integer.compare(agy2.aKB, agy3.aKB);
        });
        n4 = n2 <= 0 ? arrayList.size() : Math.min(n2, arrayList.size());
        object = new ArrayList(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            ((ArrayList)object).add(((agy)arrayList.get((int)n3)).aKz);
        }
        return object;
    }

    public static agx uB() {
        TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>();
        agx.a(treeMap, "a", "\u554a", "\u963f", "\u5416");
        agx.a(treeMap, "o", "\u54e6", "\u5662", "\u5594");
        agx.a(treeMap, "e", "\u5443", "\u989d", "\u9e45");
        agx.a(treeMap, "ai", "\u7231", "\u77ee", "\u6328", "\u54ce");
        agx.a(treeMap, "ei", "\u8bf6", "\u6b38");
        agx.a(treeMap, "ao", "\u5965", "\u71ac", "\u50b2", "\u51f9");
        agx.a(treeMap, "ou", "\u6b27", "\u5076", "\u54e6");
        agx.a(treeMap, "an", "\u5b89", "\u6309", "\u6848");
        agx.a(treeMap, "en", "\u55ef", "\u6069");
        agx.a(treeMap, "ang", "\u6602", "\u76ce");
        agx.a(treeMap, "eng", "\u55ef");
        agx.a(treeMap, "er", "\u4e8c", "\u800c", "\u8033");
        agx.a(treeMap, "ni", "\u4f60", "\u5c3c", "\u5462");
        agx.a(treeMap, "hao", "\u597d", "\u53f7", "\u6d69");
        agx.a(treeMap, "ma", "\u5417", "\u5988", "\u9a6c");
        agx.a(treeMap, "wo", "\u6211", "\u63e1", "\u7a9d");
        agx.a(treeMap, "shi", "\u662f", "\u65f6", "\u4e8b", "\u5341");
        agx.a(treeMap, "xian", "\u663e", "\u73b0", "\u5148", "\u7ebf");
        agx.a(treeMap, "xianshi", "\u663e\u793a");
        agx.a(treeMap, "xuan", "\u6e32", "\u9009", "\u5ba3");
        agx.a(treeMap, "ran", "\u67d3", "\u7136", "\u71c3");
        agx.a(treeMap, "xuanran", "\u6e32\u67d3");
        agx.a(treeMap, "bps", "BPS");
        agx.a(treeMap, "de", "\u7684", "\u5f97", "\u5fb7");
        agx.a(treeMap, "le", "\u4e86", "\u4e50", "\u52d2");
        agx.a(treeMap, "bu", "\u4e0d", "\u90e8", "\u6b65");
        agx.a(treeMap, "zai", "\u5728", "\u518d", "\u8f7d");
        agx.a(treeMap, "you", "\u6709", "\u53c8", "\u53cb", "\u53f3");
        agx.a(treeMap, "mei", "\u6ca1", "\u7f8e", "\u6bcf");
        agx.a(treeMap, "yao", "\u8981", "\u6447", "\u836f");
        agx.a(treeMap, "hen", "\u5f88", "\u72e0", "\u6068");
        agx.a(treeMap, "kan", "\u770b", "\u780d", "\u520a");
        agx.a(treeMap, "ting", "\u542c", "\u505c", "\u5385");
        agx.a(treeMap, "shuo", "\u8bf4", "\u7855", "\u6714");
        agx.a(treeMap, "xie", "\u5199", "\u4e9b", "\u8c22");
        agx.a(treeMap, "qing", "\u8bf7", "\u6e05", "\u60c5");
        agx.a(treeMap, "xiexie", "\u8c22\u8c22");
        agx.a(treeMap, "nihao", "\u4f60\u597d");
        agx.a(treeMap, "zaijian", "\u518d\u89c1");
        agx.a(treeMap, "shiwo", "\u662f\u6211");
        agx.a(treeMap, "li", "\u91cc", "\u674e", "\u7406", "\u529b", "\u793c", "\u5229", "\u79bb", "\u68a8");
        agx.a(treeMap, "liu", "\u516d", "\u6d41", "\u5218", "\u7559", "\u67f3", "\u6e9c");
        agx.a(treeMap, "lin", "\u6797", "\u4e34", "\u90bb", "\u7433", "\u6dcb");
        agx.a(treeMap, "ling", "\u96f6", "\u9886", "\u4ee4", "\u7075", "\u73b2");
        agx.a(treeMap, "lian", "\u8fde", "\u8138", "\u7ec3", "\u604b", "\u83b2");
        agx.a(treeMap, "liang", "\u4e24", "\u91cf", "\u4eae", "\u826f", "\u51c9");
        agx.a(treeMap, "lu", "\u8def", "\u5f55", "\u9732", "\u5362", "\u9c81");
        agx.a(treeMap, "lou", "\u697c", "\u55bd", "\u6f0f", "\u6402");
        agx.a(treeMap, "yi", "\u4e00", "\u4ebf", "\u4ee5");
        agx.a(treeMap, "er", "\u4e8c", "\u800c", "\u5c14");
        agx.a(treeMap, "san", "\u4e09", "\u6563", "\u4f1e");
        agx.a(treeMap, "si", "\u56db", "\u6b7b", "\u53f8");
        agx.a(treeMap, "wu", "\u4e94", "\u65e0", "\u5434");
        agx.a(treeMap, "liu", "\u516d", "\u6d41", "\u5218");
        agx.a(treeMap, "qi", "\u4e03", "\u8d77", "\u5176");
        agx.a(treeMap, "ba", "\u516b", "\u5427", "\u628a");
        agx.a(treeMap, "jiu", "\u4e5d", "\u4e45", "\u9152");
        agx.a(treeMap, "shi", "\u5341");
        agx.a(treeMap, "lv", "\u7eff", "\u5415", "\u65c5");
        agx.a(treeMap, "nve", "\u8650");
        agx.c(treeMap);
        agx.b(treeMap);
        return new agx(agx.a(treeMap));
    }

    private static void a(Map<String, List<String>> map, String string, String ... stringArray) {
        if (string == null || string.isEmpty() || stringArray == null || stringArray.length == 0) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length);
        for (String string2 : stringArray) {
            if (string2 == null || string2.isEmpty()) continue;
            arrayList.add(string2);
        }
        if (!arrayList.isEmpty()) {
            map.put(string.toLowerCase(Locale.ROOT), Collections.unmodifiableList(arrayList));
        }
    }

    private static void b(Map<String, List<String>> map) {
        try {
            File file;
            File file2 = Minecraft.getMinecraft().bhf;
            if (file2 == null) {
                return;
            }
            File file3 = new File(file2, "Rise");
            if (!file3.isDirectory()) {
                return;
            }
            File file4 = new File(file3, "pinyin_dict.properties");
            if (file4.isFile()) {
                agx.a(file4, map, true);
            }
            if ((file = agx.e(file3)) == null) {
                return;
            }
            File file5 = new File(file3, "pinyin_dict.cache.properties");
            if (file5.isFile() && file5.lastModified() >= file.lastModified()) {
                agx.a(file5, map, true);
                return;
            }
            LinkedHashMap<String, LinkedHashSet<String>> linkedHashMap = new LinkedHashMap<String, LinkedHashSet<String>>();
            agx.a(file, linkedHashMap);
            if (linkedHashMap.isEmpty()) {
                return;
            }
            agx.a(map, linkedHashMap, true);
            agx.b(file5, linkedHashMap);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static NavigableMap<String, List<String>> a(NavigableMap<String, List<String>> navigableMap) {
        return Collections.unmodifiableNavigableMap(navigableMap);
    }

    private static void c(Map<String, List<String>> map) {
        try {
            Minecraft minecraft = Minecraft.getMinecraft();
            if (minecraft == null || minecraft.Br() == null) {
                return;
            }
            for (String string : aKy) {
                if (string == null || string.isEmpty()) continue;
                cm cm2 = new cm(string);
                InputStream inputStream = minecraft.Br().v(cm2).getInputStream();
                if (inputStream == null) continue;
                LinkedHashMap<String, LinkedHashSet<String>> linkedHashMap = new LinkedHashMap<String, LinkedHashSet<String>>();
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
                    agx.a(bufferedReader, linkedHashMap);
                }
                agx.a(map, linkedHashMap, false);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void a(Map<String, List<String>> map, Map<String, LinkedHashSet<String>> map2, boolean bl2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry<String, LinkedHashSet<String>> entry : map2.entrySet()) {
            String string = entry.getKey();
            LinkedHashSet<String> linkedHashSet = entry.getValue();
            if (string == null || string.isEmpty() || linkedHashSet == null || linkedHashSet.isEmpty()) continue;
            LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>();
            List<String> list = map.get(string);
            if (bl2) {
                linkedHashSet2.addAll(linkedHashSet);
                if (list != null) {
                    linkedHashSet2.addAll(list);
                }
            } else {
                if (list != null) {
                    linkedHashSet2.addAll(list);
                }
                linkedHashSet2.addAll(linkedHashSet);
            }
            ArrayList<String> arrayList = new ArrayList<String>(Math.min(64, linkedHashSet2.size()));
            for (String string2 : linkedHashSet2) {
                if (string2 == null || string2.isEmpty()) continue;
                arrayList.add(string2);
                if (arrayList.size() < 64) continue;
                break;
            }
            if (arrayList.isEmpty()) continue;
            map.put(string, Collections.unmodifiableList(arrayList));
        }
    }

    private static void a(File file, Map<String, List<String>> map, boolean bl2) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), StandardCharsets.UTF_8));){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                int n2;
                if ((string = string.trim()).isEmpty() || string.startsWith("#") || (n2 = string.indexOf(61)) <= 0) continue;
                String string2 = string.substring(0, n2).trim().toLowerCase(Locale.ROOT);
                String string3 = string.substring(n2 + 1).trim();
                if (string2.isEmpty() || string3.isEmpty()) continue;
                String[] stringArray = string3.split(",");
                ArrayList<String> arrayList = new ArrayList<String>(Math.min(stringArray.length, 64));
                for (String string4 : stringArray) {
                    String string5 = string4.trim();
                    if (string5.isEmpty()) continue;
                    arrayList.add(string5);
                    if (arrayList.size() >= 64) break;
                }
                if (arrayList.isEmpty()) continue;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(string2, new LinkedHashSet(arrayList));
                agx.a(map, linkedHashMap, bl2);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static File e(File file2) {
        try {
            File file3 = new File(file2, "pinyin.dict.yaml");
            if (file3.isFile()) {
                return file3;
            }
            File file4 = new File(file2, "pinyin_dict.dict.yaml");
            if (file4.isFile()) {
                return file4;
            }
            File file5 = new File(file2, "pinyin_dict.tsv");
            if (file5.isFile()) {
                return file5;
            }
            File file6 = new File(file2, "pinyin_dict.txt");
            if (file6.isFile()) {
                return file6;
            }
            File[] fileArray = file2.listFiles((file, string) -> string != null && string.toLowerCase(Locale.ROOT).endsWith(".dict.yaml"));
            if (fileArray != null && fileArray.length > 0) {
                File file7 = fileArray[0];
                for (File file8 : fileArray) {
                    if (file8 == null || !file8.isFile() || file8.lastModified() <= file7.lastModified()) continue;
                    file7 = file8;
                }
                return file7;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    private static void a(File file, Map<String, LinkedHashSet<String>> map) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), StandardCharsets.UTF_8));){
            agx.a(bufferedReader, map);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void a(BufferedReader bufferedReader, Map<String, LinkedHashSet<String>> map) {
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            LinkedHashSet linkedHashSet;
            String string3;
            String[] stringArray;
            int n2;
            if ((string2 = string2.trim()).isEmpty() || string2.startsWith("#") || (n2 = string2.indexOf(9)) <= 0 || (stringArray = string2.split("\t")).length < 2) continue;
            String string4 = stringArray[0].trim();
            String string5 = stringArray[1].trim();
            if (string4.isEmpty() || string5.isEmpty() || (string3 = agx.ca(string5)).isEmpty() || (linkedHashSet = map.computeIfAbsent(string3, string -> new LinkedHashSet())).size() >= 64) continue;
            linkedHashSet.add(string4);
        }
    }

    private static String ca(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        string2 = string2.replace(" ", "");
        string2 = string2.replace("'", "");
        string2 = string2.replace("u:", "v");
        string2 = string2.replace("\u00fc", "v");
        return string2;
    }

    private static void b(File file, Map<String, LinkedHashSet<String>> map) {
        try {
            if (file == null || map == null || map.isEmpty()) {
                return;
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
                fileOutputStream.write("# Auto-generated cache. Source: user IME dict file\n# Do not edit; edit your *.dict.yaml / pinyin_dict.tsv instead.\n".getBytes(StandardCharsets.UTF_8));
                for (Map.Entry<String, LinkedHashSet<String>> entry : map.entrySet()) {
                    String string = entry.getKey();
                    LinkedHashSet<String> linkedHashSet = entry.getValue();
                    if (string == null || string.isEmpty() || linkedHashSet == null || linkedHashSet.isEmpty()) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    boolean bl2 = true;
                    for (String string2 : linkedHashSet) {
                        if (string2 == null || string2.isEmpty()) continue;
                        if (!bl2) {
                            stringBuilder.append(',');
                        }
                        stringBuilder.append(string2.replace(",", "\uff0c"));
                        bl2 = false;
                    }
                    if (bl2) continue;
                    fileOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.write(61);
                    fileOutputStream.write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.write(10);
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

