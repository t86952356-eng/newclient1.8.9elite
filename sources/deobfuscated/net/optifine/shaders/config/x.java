/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.optifine.expr.b;
import net.optifine.expr.c;
import net.optifine.expr.d;
import net.optifine.expr.f;
import net.optifine.render.e;
import net.optifine.shaders.ag;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.aa;
import net.optifine.shaders.config.i;
import net.optifine.shaders.config.j;
import net.optifine.shaders.config.l;
import net.optifine.shaders.config.o;
import net.optifine.shaders.config.p;
import net.optifine.shaders.config.q;
import net.optifine.shaders.config.r;
import net.optifine.shaders.config.t;
import net.optifine.shaders.config.u;
import net.optifine.shaders.config.v;
import net.optifine.shaders.config.y;
import net.optifine.shaders.m;
import net.optifine.shaders.s;
import net.optifine.shaders.uniform.a;
import net.optifine.shaders.w;
import net.optifine.util.aj;

public class x {
    private static final Pattern eHL = Pattern.compile("^\\s*#version\\s+.*$");
    private static final Pattern eHM = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
    private static final Set<String> eHN = x.aIn();
    private static final Map<String, Integer> eHO = x.aIo();
    private static final Map<String, Integer> eHP = x.aIp();

    public static o[] a(m m2, String[] stringArray, List<Integer> list) {
        String string;
        if (m2 == null) {
            return new o[0];
        }
        HashMap<String, o> hashMap = new HashMap<String, o>();
        x.a(m2, "/shaders", stringArray, hashMap);
        for (int n2 : list) {
            string = "/shaders/world" + n2;
            x.a(m2, string, stringArray, hashMap);
        }
        Collection collection = hashMap.values();
        string = collection.toArray(new o[collection.size()]);
        y y2 = new y();
        Arrays.sort(string, y2);
        return string;
    }

    private static void a(m m2, String string, String[] stringArray, Map<String, o> map) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.equals("")) continue;
            String string3 = string + "/" + string2 + ".vsh";
            String string4 = string + "/" + string2 + ".fsh";
            x.a(m2, string3, map);
            x.a(m2, string4, map);
        }
    }

    private static void a(m m2, String string, Map<String, o> map) {
        String[] stringArray = x.a(m2, string);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            o o2 = x.aq(string2, string);
            if (o2 == null || o2.getName().startsWith(net.optifine.shaders.config.m.aHZ()) || o2.aIi() && !x.a(o2, stringArray)) continue;
            String string3 = o2.getName();
            o o3 = map.get(string3);
            if (o3 != null) {
                if (!net.minecraft.src.a.a((Object)o3.aHp(), (Object)o2.aHp())) {
                    net.minecraft.src.a.warn("Ambiguous shader option: " + o2.getName());
                    net.minecraft.src.a.warn(" - in " + net.minecraft.src.a.c(o3.aIf()) + ": " + o3.aHp());
                    net.minecraft.src.a.warn(" - in " + net.minecraft.src.a.c(o2.aIf()) + ": " + o2.aHp());
                    o3.setEnabled(false);
                }
                if (o3.getDescription() == null || o3.getDescription().length() <= 0) {
                    o3.jp(o2.getDescription());
                }
                o3.o(o2.aIf());
                continue;
            }
            map.put(string3, o2);
        }
    }

    private static boolean a(o o2, String[] stringArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (!o2.jv(string)) continue;
            return true;
        }
        return false;
    }

    private static String[] a(m m2, String string) {
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string2 = x.a(string, m2, 0, arrayList, 0);
            if (string2 == null) {
                return new String[0];
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string2.getBytes());
            String[] stringArray = net.minecraft.src.a.g(byteArrayInputStream);
            return stringArray;
        }
        catch (IOException iOException) {
            net.minecraft.src.a.fN(iOException.getClass().getName() + ": " + iOException.getMessage());
            return new String[0];
        }
    }

    private static o aq(String string, String string2) {
        o o2 = null;
        if (o2 == null) {
            o2 = t.ao(string, string2);
        }
        if (o2 == null) {
            o2 = v.ao(string, string2);
        }
        if (o2 != null) {
            return o2;
        }
        if (o2 == null) {
            o2 = u.ao(string, string2);
        }
        if (o2 == null) {
            o2 = net.optifine.shaders.config.w.ao(string, string2);
        }
        return o2 != null && eHN.contains(o2.getName()) ? o2 : null;
    }

    private static Set<String> aIn() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("shadowMapResolution");
        hashSet.add("shadowMapFov");
        hashSet.add("shadowDistance");
        hashSet.add("shadowDistanceRenderMul");
        hashSet.add("shadowIntervalSize");
        hashSet.add("generateShadowMipmap");
        hashSet.add("generateShadowColorMipmap");
        hashSet.add("shadowHardwareFiltering");
        hashSet.add("shadowHardwareFiltering0");
        hashSet.add("shadowHardwareFiltering1");
        hashSet.add("shadowtex0Mipmap");
        hashSet.add("shadowtexMipmap");
        hashSet.add("shadowtex1Mipmap");
        hashSet.add("shadowcolor0Mipmap");
        hashSet.add("shadowColor0Mipmap");
        hashSet.add("shadowcolor1Mipmap");
        hashSet.add("shadowColor1Mipmap");
        hashSet.add("shadowtex0Nearest");
        hashSet.add("shadowtexNearest");
        hashSet.add("shadow0MinMagNearest");
        hashSet.add("shadowtex1Nearest");
        hashSet.add("shadow1MinMagNearest");
        hashSet.add("shadowcolor0Nearest");
        hashSet.add("shadowColor0Nearest");
        hashSet.add("shadowColor0MinMagNearest");
        hashSet.add("shadowcolor1Nearest");
        hashSet.add("shadowColor1Nearest");
        hashSet.add("shadowColor1MinMagNearest");
        hashSet.add("wetnessHalflife");
        hashSet.add("drynessHalflife");
        hashSet.add("eyeBrightnessHalflife");
        hashSet.add("centerDepthHalflife");
        hashSet.add("sunPathRotation");
        hashSet.add("ambientOcclusionLevel");
        hashSet.add("superSamplingLevel");
        hashSet.add("noiseTextureResolution");
        return hashSet;
    }

    public static aa[] a(Properties properties, o[] oArray) {
        String string = "profile.";
        ArrayList<aa> arrayList = new ArrayList<aa>();
        for (Object object : properties.keySet()) {
            String string2 = (String)object;
            if (!string2.startsWith("profile.")) continue;
            String string3 = string2.substring("profile.".length());
            properties.getProperty(string2);
            HashSet<String> hashSet = new HashSet<String>();
            aa aa2 = x.a(string3, properties, hashSet, oArray);
            if (aa2 == null) continue;
            arrayList.add(aa2);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        aa[] aaArray = arrayList.toArray(new aa[arrayList.size()]);
        return aaArray;
    }

    public static Map<String, net.optifine.expr.m> b(Properties properties, o[] oArray) {
        String string = "program.";
        Pattern pattern = Pattern.compile("program\\.([^.]+)\\.enabled");
        HashMap<String, net.optifine.expr.m> hashMap = new HashMap<String, net.optifine.expr.m>();
        for (Object object : properties.keySet()) {
            String string2 = (String)object;
            Matcher matcher = pattern.matcher(string2);
            if (!matcher.matches()) continue;
            String string3 = matcher.group(1);
            String string4 = properties.getProperty(string2).trim();
            net.optifine.expr.m m2 = x.c(string4, oArray);
            if (m2 == null) {
                w.iG("Error parsing program condition: " + string2);
                continue;
            }
            hashMap.put(string3, m2);
        }
        return hashMap;
    }

    private static net.optifine.expr.m c(String string, o[] oArray) {
        try {
            q q2 = new q(oArray);
            d d2 = new d(q2);
            net.optifine.expr.m m2 = d2.ig(string);
            return m2;
        }
        catch (net.optifine.expr.u u2) {
            w.iH(u2.getClass().getName() + ": " + u2.getMessage());
            return null;
        }
    }

    public static Set<String> c(Properties properties, o[] oArray) {
        HashSet<String> hashSet = new HashSet<String>();
        String string = properties.getProperty("sliders");
        if (string == null) {
            return hashSet;
        }
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            o o2 = ag.a(string2, oArray);
            if (o2 == null) {
                net.minecraft.src.a.warn("Invalid shader option: " + string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    private static aa a(String string, Properties properties, Set<String> set, o[] oArray) {
        String string2 = "profile.";
        String string3 = "profile." + string;
        if (set.contains(string3)) {
            net.minecraft.src.a.warn("[Shaders] Profile already parsed: " + string);
            return null;
        }
        set.add(string);
        aa aa2 = new aa(string);
        String string4 = properties.getProperty(string3);
        String[] stringArray = net.minecraft.src.a.V(string4, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            Object object;
            Object object2;
            Object object3;
            String string5 = stringArray[i2];
            if (string5.startsWith("profile.")) {
                object3 = string5.substring("profile.".length());
                object2 = x.a((String)object3, properties, set, oArray);
                if (aa2 == null) continue;
                aa2.a((aa)object2);
                aa2.j(((aa)object2).aIr());
                continue;
            }
            object3 = net.minecraft.src.a.V(string5, ":=");
            if (((String[])object3).length == 1) {
                Object object4;
                object2 = object3[0];
                boolean bl2 = true;
                if (((String)object2).startsWith("!")) {
                    bl2 = false;
                    object2 = ((String)object2).substring(1);
                }
                object = "program.";
                if (((String)object2).startsWith("program.")) {
                    object4 = ((String)object2).substring("program.".length());
                    if (!ah.iX((String)object4)) {
                        net.minecraft.src.a.warn("Invalid program: " + (String)object4 + " in profile: " + aa2.getName());
                        continue;
                    }
                    if (bl2) {
                        aa2.jN((String)object4);
                        continue;
                    }
                    aa2.jM((String)object4);
                    continue;
                }
                object4 = ag.a((String)object2, oArray);
                if (!(object4 instanceof t)) {
                    net.minecraft.src.a.warn("[Shaders] Invalid option: " + (String)object2);
                    continue;
                }
                aa2.ar((String)object2, String.valueOf(bl2));
                ((o)object4).M(true);
                continue;
            }
            if (((String[])object3).length != 2) {
                net.minecraft.src.a.warn("[Shaders] Invalid option value: " + string5);
                continue;
            }
            object2 = object3[0];
            String string6 = object3[1];
            object = ag.a((String)object2, oArray);
            if (object == null) {
                net.minecraft.src.a.warn("[Shaders] Invalid option: " + string5);
                continue;
            }
            if (!((o)object).jr(string6)) {
                net.minecraft.src.a.warn("[Shaders] Invalid value: " + string5);
                continue;
            }
            ((o)object).M(true);
            aa2.ar((String)object2, string6);
        }
        return aa2;
    }

    public static Map<String, j> a(Properties properties, aa[] aaArray, o[] oArray) {
        HashMap<String, j> hashMap = new HashMap<String, j>();
        x.a("screen", properties, hashMap, aaArray, oArray);
        return hashMap.isEmpty() ? null : hashMap;
    }

    private static boolean a(String string, Properties properties, Map<String, j> map, aa[] aaArray, o[] oArray) {
        Object object;
        String string2;
        String string3 = properties.getProperty(string);
        if (string3 == null) {
            return false;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        HashSet<String> hashSet = new HashSet<String>();
        String[] stringArray = net.minecraft.src.a.V(string3, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            Object object2;
            string2 = stringArray[i2];
            if (string2.equals("<empty>")) {
                arrayList.add(null);
                continue;
            }
            if (hashSet.contains(string2)) {
                net.minecraft.src.a.warn("[Shaders] Duplicate option: " + string2 + ", key: " + string);
                continue;
            }
            hashSet.add(string2);
            if (string2.equals("<profile>")) {
                if (aaArray == null) {
                    net.minecraft.src.a.warn("[Shaders] Option profile can not be used, no profiles defined: " + string2 + ", key: " + string);
                    continue;
                }
                object2 = new p(aaArray, oArray);
                arrayList.add(object2);
                continue;
            }
            if (string2.equals("*")) {
                object2 = new r("<rest>");
                arrayList.add(object2);
                continue;
            }
            if (string2.startsWith("[") && string2.endsWith("]")) {
                object2 = aj.j(string2, "[", "]");
                if (!((String)object2).matches("^[a-zA-Z0-9_]+$")) {
                    net.minecraft.src.a.warn("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                if (!x.a("screen." + (String)object2, properties, map, aaArray, oArray)) {
                    net.minecraft.src.a.warn("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                object = new net.optifine.shaders.config.s((String)object2);
                arrayList.add(object);
                continue;
            }
            object2 = ag.a(string2, oArray);
            if (object2 == null) {
                net.minecraft.src.a.warn("[Shaders] Invalid option: " + string2 + ", key: " + string);
                arrayList.add(null);
                continue;
            }
            ((o)object2).M(true);
            arrayList.add(object2);
        }
        o[] oArray2 = arrayList.toArray(new o[arrayList.size()]);
        string2 = properties.getProperty(string + ".columns");
        int n2 = net.minecraft.src.a.x(string2, 2);
        object = new j(string, oArray2, n2);
        map.put(string, (j)object);
        return true;
    }

    public static BufferedReader a(BufferedReader bufferedReader, String string, m m2, int n2, List<String> list, int n3) {
        String string2 = "/";
        int n4 = string.lastIndexOf("/");
        if (n4 >= 0) {
            string2 = string.substring(0, n4);
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n5 = -1;
        LinkedHashSet<l> linkedHashSet = new LinkedHashSet<l>();
        int n6 = 1;
        while (true) {
            Object object2;
            Object object3;
            Object object4;
            if ((object4 = bufferedReader.readLine()) == null) {
                object3 = charArrayWriter.toCharArray();
                if (n5 >= 0 && linkedHashSet.size() > 0) {
                    object2 = new StringBuilder();
                    for (l l2 : linkedHashSet) {
                        object2.append("#define ");
                        object2.append(l2.getName());
                        object2.append(" ");
                        object2.append(l2.SN());
                        object2.append("\n");
                    }
                    String string3 = object2.toString();
                    StringBuilder stringBuilder = new StringBuilder(new String((char[])object3));
                    stringBuilder.insert(n5, string3);
                    String string4 = stringBuilder.toString();
                    object3 = string4.toCharArray();
                }
                object2 = new CharArrayReader((char[])object3);
                return new BufferedReader((Reader)object2);
            }
            if (n5 < 0 && (object3 = (Object)eHL.matcher((CharSequence)object4)).matches()) {
                object2 = net.optifine.shaders.config.m.aIb() + net.optifine.shaders.config.m.aIc();
                String string5 = (String)object4 + "\n" + (String)object2;
                String string6 = "#line " + (n6 + 1) + " " + n2;
                object4 = string5 + string6;
                n5 = charArrayWriter.size() + string5.length();
            }
            if ((object3 = (Object)eHM.matcher((CharSequence)object4)).matches()) {
                int n7;
                String string7;
                object2 = object3.group(1);
                boolean bl2 = object2.startsWith("/");
                String string8 = string7 = bl2 ? "/shaders" + (String)object2 : string2 + "/" + (String)object2;
                if (!list.contains(string7)) {
                    list.add(string7);
                }
                if ((object4 = x.a(string7, m2, n7 = list.indexOf(string7) + 1, list, n3)) == null) {
                    throw new IOException("Included file not found: " + string);
                }
                if (((String)object4).endsWith("\n")) {
                    object4 = ((String)object4).substring(0, ((String)object4).length() - 1);
                }
                Object object = "#line 1 " + n7 + "\n";
                if (((String)object4).startsWith("#version ")) {
                    object = "";
                }
                object4 = (String)object + (String)object4 + "\n#line " + (n6 + 1) + " " + n2;
            }
            if (n5 >= 0 && ((String)object4).contains(net.optifine.shaders.config.m.aHZ())) {
                object2 = x.a((String)object4, net.optifine.shaders.config.m.aIa());
                linkedHashSet.addAll(Arrays.asList(object2));
            }
            charArrayWriter.write((String)object4);
            charArrayWriter.write("\n");
            ++n6;
        }
    }

    private static l[] a(String string, l[] lArray) {
        ArrayList<l> arrayList = new ArrayList<l>();
        for (int i2 = 0; i2 < lArray.length; ++i2) {
            l l2 = lArray[i2];
            if (!string.contains(l2.getName())) continue;
            arrayList.add(l2);
        }
        l[] lArray2 = arrayList.toArray(new l[arrayList.size()]);
        return lArray2;
    }

    private static String a(String string, m m2, int n2, List<String> list, int n3) {
        if (n3 >= 10) {
            throw new IOException("#include depth exceeded: " + n3 + ", file: " + string);
        }
        ++n3;
        InputStream inputStream = m2.iz(string);
        if (inputStream == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader = x.a(bufferedReader, string, m2, n2, list, n3);
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            charArrayWriter.write(string2);
            charArrayWriter.write("\n");
        }
        return charArrayWriter.toString();
    }

    public static net.optifine.shaders.uniform.b e(Properties properties) {
        Object object2;
        String string = "uniform";
        String string2 = "variable";
        String string3 = "uniform.";
        String string4 = "variable.";
        HashMap<String, net.optifine.expr.l> hashMap = new HashMap<String, net.optifine.expr.l>();
        ArrayList<a> arrayList = new ArrayList<a>();
        for (Object object2 : properties.keySet()) {
            String string5 = (String)object2;
            String[] stringArray = net.minecraft.src.a.V(string5, ".");
            if (stringArray.length != 3) continue;
            String string6 = stringArray[0];
            String string7 = stringArray[1];
            String string8 = stringArray[2];
            String string9 = properties.getProperty(string5).trim();
            if (hashMap.containsKey(string8)) {
                w.iH("Expression already defined: " + string8);
                continue;
            }
            if (!string6.equals("uniform") && !string6.equals("variable")) continue;
            w.info("Custom " + string6 + ": " + string8);
            a a2 = x.a(string6, string8, string7, string9, hashMap);
            if (a2 == null) continue;
            hashMap.put(string8, a2.aIC());
            if (string6.equals("variable")) continue;
            arrayList.add(a2);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        a[] aArray = arrayList.toArray(new a[arrayList.size()]);
        object2 = new net.optifine.shaders.uniform.b(aArray, hashMap);
        return object2;
    }

    private static a a(String string, String string2, String string3, String string4, Map<String, net.optifine.expr.l> map) {
        try {
            net.optifine.shaders.uniform.r r2 = net.optifine.shaders.uniform.r.jZ(string3);
            if (r2 == null) {
                w.iH("Unknown " + string + " type: " + String.valueOf((Object)r2));
                return null;
            }
            net.optifine.shaders.uniform.c c2 = new net.optifine.shaders.uniform.c(map);
            d d2 = new d(c2);
            net.optifine.expr.l l2 = d2.ih(string4);
            f f2 = l2.aCq();
            if (!r2.a(f2)) {
                w.iH("Expression type does not match " + string + " type, expression: " + String.valueOf((Object)f2) + ", " + string + ": " + String.valueOf((Object)r2) + " " + string2);
                return null;
            }
            l2 = x.a(l2);
            a a2 = new a(string2, r2, l2);
            return a2;
        }
        catch (net.optifine.expr.u u2) {
            w.iH(u2.getClass().getName() + ": " + u2.getMessage());
            return null;
        }
    }

    private static net.optifine.expr.l a(net.optifine.expr.l l2) {
        return l2 instanceof net.optifine.expr.o ? new c((net.optifine.expr.o)l2) : (l2 instanceof net.optifine.expr.p ? new b((net.optifine.expr.p)l2) : l2);
    }

    public static void f(Properties properties) {
        for (Object object : properties.keySet()) {
            String string = (String)object;
            String[] stringArray = net.minecraft.src.a.V(string, ".");
            if (stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (!string2.equals("alphaTest")) continue;
            s s2 = ah.iF(string3);
            if (s2 == null) {
                w.iG("Invalid program name: " + string3);
                continue;
            }
            String string4 = properties.getProperty(string).trim();
            e e2 = x.jz(string4);
            if (e2 == null) continue;
            s2.c(e2);
        }
    }

    private static e jz(String string) {
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        if (stringArray.length == 1) {
            String string2 = stringArray[0];
            if (string2.equals("off") || string2.equals("false")) {
                return new e(false);
            }
        } else if (stringArray.length == 2) {
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            Integer n2 = eHO.get(string3);
            float f2 = net.minecraft.src.a.b(string4, -1.0f);
            if (n2 != null && f2 >= 0.0f) {
                return new e(true, n2, f2);
            }
        }
        w.iG("Invalid alpha test: " + string);
        return null;
    }

    public static void g(Properties properties) {
        for (Object object : properties.keySet()) {
            String string = (String)object;
            String[] stringArray = net.minecraft.src.a.V(string, ".");
            if (stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (!string2.equals("blend")) continue;
            s s2 = ah.iF(string3);
            if (s2 == null) {
                w.iG("Invalid program name: " + string3);
                continue;
            }
            String string4 = properties.getProperty(string).trim();
            net.optifine.render.f f2 = x.jA(string4);
            if (f2 == null) continue;
            s2.c(f2);
        }
    }

    private static net.optifine.render.f jA(String string) {
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        if (stringArray.length == 1) {
            String string2 = stringArray[0];
            if (string2.equals("off") || string2.equals("false")) {
                return new net.optifine.render.f(false);
            }
        } else if (stringArray.length == 2 || stringArray.length == 4) {
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            String string5 = string3;
            String string6 = string4;
            if (stringArray.length == 4) {
                string5 = stringArray[2];
                string6 = stringArray[3];
            }
            Integer n2 = eHP.get(string3);
            Integer n3 = eHP.get(string4);
            Integer n4 = eHP.get(string5);
            Integer n5 = eHP.get(string6);
            if (n2 != null && n3 != null && n4 != null && n5 != null) {
                return new net.optifine.render.f(true, n2, n3, n4, n5);
            }
        }
        w.iG("Invalid blend mode: " + string);
        return null;
    }

    public static void h(Properties properties) {
        for (Object object : properties.keySet()) {
            String string = (String)object;
            String[] stringArray = net.minecraft.src.a.V(string, ".");
            if (stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (!string2.equals("scale")) continue;
            s s2 = ah.iF(string3);
            if (s2 == null) {
                w.iG("Invalid program name: " + string3);
                continue;
            }
            String string4 = properties.getProperty(string).trim();
            i i2 = x.jB(string4);
            if (i2 == null) continue;
            s2.a(i2);
        }
    }

    private static i jB(String string) {
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        float f2 = net.minecraft.src.a.b(stringArray[0], -1.0f);
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (stringArray.length > 1) {
            if (stringArray.length != 3) {
                w.iG("Invalid render scale: " + string);
                return null;
            }
            f3 = net.minecraft.src.a.b(stringArray[1], -1.0f);
            f4 = net.minecraft.src.a.b(stringArray[2], -1.0f);
        }
        if (net.minecraft.src.a.G(f2, 0.0f, 1.0f) && net.minecraft.src.a.G(f3, 0.0f, 1.0f) && net.minecraft.src.a.G(f4, 0.0f, 1.0f)) {
            return new i(f2, f3, f4);
        }
        w.iG("Invalid render scale: " + string);
        return null;
    }

    public static void i(Properties properties) {
        for (Object object : properties.keySet()) {
            String string = (String)object;
            String[] stringArray = net.minecraft.src.a.V(string, ".");
            if (stringArray.length != 3) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            String string4 = stringArray[2];
            if (!string2.equals("flip")) continue;
            s s2 = ah.iF(string3);
            if (s2 == null) {
                w.iG("Invalid program name: " + string3);
                continue;
            }
            Boolean[] booleanArray = s2.aEL();
            int n2 = ah.iU(string4);
            if (n2 >= 0 && n2 < booleanArray.length) {
                String string5 = properties.getProperty(string).trim();
                Boolean bl2 = net.minecraft.src.a.a(string5, null);
                if (bl2 == null) {
                    w.iG("Invalid boolean value: " + string5);
                    continue;
                }
                booleanArray[n2] = bl2;
                continue;
            }
            w.iG("Invalid buffer name: " + string4);
        }
    }

    private static Map<String, Integer> aIo() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("NEVER", new Integer(512));
        hashMap.put("LESS", new Integer(513));
        hashMap.put("EQUAL", new Integer(514));
        hashMap.put("LEQUAL", new Integer(515));
        hashMap.put("GREATER", new Integer(516));
        hashMap.put("NOTEQUAL", new Integer(517));
        hashMap.put("GEQUAL", new Integer(518));
        hashMap.put("ALWAYS", new Integer(519));
        return Collections.unmodifiableMap(hashMap);
    }

    private static Map<String, Integer> aIp() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("ZERO", new Integer(0));
        hashMap.put("ONE", new Integer(1));
        hashMap.put("SRC_COLOR", new Integer(768));
        hashMap.put("ONE_MINUS_SRC_COLOR", new Integer(769));
        hashMap.put("DST_COLOR", new Integer(774));
        hashMap.put("ONE_MINUS_DST_COLOR", new Integer(775));
        hashMap.put("SRC_ALPHA", new Integer(770));
        hashMap.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
        hashMap.put("DST_ALPHA", new Integer(772));
        hashMap.put("ONE_MINUS_DST_ALPHA", new Integer(773));
        hashMap.put("CONSTANT_COLOR", new Integer(32769));
        hashMap.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
        hashMap.put("CONSTANT_ALPHA", new Integer(32771));
        hashMap.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
        hashMap.put("SRC_ALPHA_SATURATE", new Integer(776));
        return Collections.unmodifiableMap(hashMap);
    }
}

