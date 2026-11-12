/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.command.a;
import net.minecraft.command.aw;
import net.minecraft.command.ba;
import net.minecraft.command.bb;
import net.minecraft.command.bc;
import net.minecraft.command.bd;
import net.minecraft.command.be;
import net.minecraft.command.bf;
import net.minecraft.command.bg;
import net.minecraft.command.bh;
import net.minecraft.command.bi;
import net.minecraft.command.bj;
import net.minecraft.command.bk;
import net.minecraft.command.bl;
import net.minecraft.entity.c;
import net.minecraft.entity.n;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ah;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.t;
import net.minecraft.world.ao;
import net.minecraft.world.w;

public class az {
    private static final Pattern coq = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
    private static final Pattern cor = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
    private static final Pattern cos = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
    private static final Set<String> cot = Sets.newHashSet((Object[])new String[]{"x", "y", "z", "dx", "dy", "dz", "rm", "r"});

    public static e j(aw aw2, String string) {
        return az.b(aw2, string, e.class);
    }

    public static <T extends c> T b(aw aw2, String string, Class<? extends T> clazz) {
        List<T> list = az.c(aw2, string, clazz);
        return (T)(list.size() == 1 ? (c)list.get(0) : null);
    }

    public static net.minecraft.util.ba k(aw aw2, String string) {
        List<c> list = az.c(aw2, string, c.class);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (c c2 : list) {
            arrayList.add(c2.xW());
        }
        return a.z(arrayList);
    }

    public static <T extends c> List<T> c(aw aw2, String string, Class<? extends T> clazz) {
        Matcher matcher = coq.matcher(string);
        if (matcher.matches() && aw2.c(1, "@")) {
            Map<String, String> map = az.dV(matcher.group(2));
            if (!az.b(aw2, map)) {
                return Collections.emptyList();
            }
            String string2 = matcher.group(1);
            b b2 = az.b(map, aw2.yl());
            List<w> list = az.a(aw2, map);
            ArrayList arrayList = Lists.newArrayList();
            for (w w2 : list) {
                if (w2 == null) continue;
                ArrayList arrayList2 = Lists.newArrayList();
                arrayList2.addAll(az.a(map, string2));
                arrayList2.addAll(az.i(map));
                arrayList2.addAll(az.j(map));
                arrayList2.addAll(az.k(map));
                arrayList2.addAll(az.l(map));
                arrayList2.addAll(az.m(map));
                arrayList2.addAll(az.a(map, b2));
                arrayList2.addAll(az.n(map));
                arrayList.addAll(az.a(map, clazz, arrayList2, string2, w2, b2));
            }
            return az.a(arrayList, map, aw2, clazz, string2, b2);
        }
        return Collections.emptyList();
    }

    private static List<w> a(aw aw2, Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        if (az.o(map)) {
            arrayList.add(aw2.Se());
        } else {
            Collections.addAll(arrayList, MinecraftServer.afs().dkG);
        }
        return arrayList;
    }

    private static <T extends c> boolean b(aw aw2, Map<String, String> map) {
        String string = az.b(map, "type");
        String string2 = string = string != null && string.startsWith("!") ? string.substring(1) : string;
        if (string != null && !n.ee(string)) {
            t t2 = new t("commands.generic.entity.invalidType", string);
            t2.arp().b(an.dvX);
            aw2.a(t2);
            return false;
        }
        return true;
    }

    private static List<Predicate<c>> a(Map<String, String> map, String string) {
        boolean bl2;
        boolean bl3;
        ArrayList arrayList = Lists.newArrayList();
        String string2 = az.b(map, "type");
        boolean bl4 = bl3 = string2 != null && string2.startsWith("!");
        if (bl3) {
            string2 = string2.substring(1);
        }
        boolean bl5 = !string.equals("e");
        boolean bl6 = bl2 = string.equals("r") && string2 != null;
        if (!(string2 != null && string.equals("e") || bl2)) {
            if (bl5) {
                arrayList.add(new ba());
            }
        } else {
            String string3 = string2;
            arrayList.add(new be(string3, bl3));
        }
        return arrayList;
    }

    private static List<Predicate<c>> i(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = az.a(map, "lm", -1);
        int n3 = az.a(map, "l", -1);
        if (n2 > -1 || n3 > -1) {
            arrayList.add(new bf(n2, n3));
        }
        return arrayList;
    }

    private static List<Predicate<c>> j(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = az.a(map, "m", ao.dEw.awE());
        if (n2 != ao.dEw.awE()) {
            arrayList.add(new bg(n2));
        }
        return arrayList;
    }

    private static List<Predicate<c>> k(Map<String, String> map) {
        boolean bl2;
        ArrayList arrayList = Lists.newArrayList();
        String string = az.b(map, "team");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new bh(string2, bl2));
        }
        return arrayList;
    }

    private static List<Predicate<c>> l(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        Map<String, Integer> map2 = az.p(map);
        if (map2 != null && map2.size() > 0) {
            arrayList.add(new bi(map2));
        }
        return arrayList;
    }

    private static List<Predicate<c>> m(Map<String, String> map) {
        boolean bl2;
        ArrayList arrayList = Lists.newArrayList();
        String string = az.b(map, "name");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new bj(string2, bl2));
        }
        return arrayList;
    }

    private static List<Predicate<c>> a(Map<String, String> map, b b2) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = az.a(map, "rm", -1);
        int n3 = az.a(map, "r", -1);
        if (b2 != null && (n2 >= 0 || n3 >= 0)) {
            int n4 = n2 * n2;
            int n5 = n3 * n3;
            arrayList.add(new bk(b2, n2, n4, n3, n5));
        }
        return arrayList;
    }

    private static List<Predicate<c>> n(Map<String, String> map) {
        int n2;
        int n3;
        ArrayList arrayList = Lists.newArrayList();
        if (map.containsKey("rym") || map.containsKey("ry")) {
            n3 = az.ee(az.a(map, "rym", 0));
            n2 = az.ee(az.a(map, "ry", 359));
            arrayList.add(new bl(n3, n2));
        }
        if (map.containsKey("rxm") || map.containsKey("rx")) {
            n3 = az.ee(az.a(map, "rxm", 0));
            n2 = az.ee(az.a(map, "rx", 359));
            arrayList.add(new bb(n3, n2));
        }
        return arrayList;
    }

    private static <T extends c> List<T> a(Map<String, String> map, Class<? extends T> clazz, List<Predicate<c>> list, String string, w w2, b b2) {
        ArrayList arrayList = Lists.newArrayList();
        String string2 = az.b(map, "type");
        string2 = string2 != null && string2.startsWith("!") ? string2.substring(1) : string2;
        boolean bl2 = !string.equals("e");
        boolean bl3 = string.equals("r") && string2 != null;
        int n2 = az.a(map, "dx", 0);
        int n3 = az.a(map, "dy", 0);
        int n4 = az.a(map, "dz", 0);
        int n5 = az.a(map, "r", -1);
        Predicate predicate = Predicates.and(list);
        Predicate predicate2 = Predicates.and(ah.dvG, (Predicate)predicate);
        if (b2 != null) {
            int n6;
            boolean bl4;
            int n7 = w2.dCY.size();
            boolean bl5 = bl4 = n7 < (n6 = w2.dCS.size()) / 16;
            if (!(map.containsKey("dx") || map.containsKey("dy") || map.containsKey("dz"))) {
                if (n5 >= 0) {
                    net.minecraft.util.a a2 = new net.minecraft.util.a(b2.wt() - n5, b2.wu() - n5, b2.wx() - n5, b2.wt() + n5 + 1, b2.wu() + n5 + 1, b2.wx() + n5 + 1);
                    if (bl2 && bl4 && !bl3) {
                        arrayList.addAll(w2.b(clazz, predicate2));
                    } else {
                        arrayList.addAll(w2.a(clazz, a2, predicate2));
                    }
                } else if (string.equals("a")) {
                    arrayList.addAll(w2.b(clazz, predicate));
                } else if (!(string.equals("p") || string.equals("r") && !bl3)) {
                    arrayList.addAll(w2.a(clazz, predicate2));
                } else {
                    arrayList.addAll(w2.b(clazz, predicate2));
                }
            } else {
                net.minecraft.util.a a3 = az.b(b2, n2, n3, n4);
                if (bl2 && bl4 && !bl3) {
                    bc bc2 = new bc(a3);
                    arrayList.addAll(w2.b(clazz, Predicates.and((Predicate)predicate2, (Predicate)bc2)));
                } else {
                    arrayList.addAll(w2.a(clazz, a3, predicate2));
                }
            }
        } else if (string.equals("a")) {
            arrayList.addAll(w2.b(clazz, predicate));
        } else if (!(string.equals("p") || string.equals("r") && !bl3)) {
            arrayList.addAll(w2.a(clazz, predicate2));
        } else {
            arrayList.addAll(w2.b(clazz, predicate2));
        }
        return arrayList;
    }

    private static <T extends c> List<T> a(List<T> arrayList, Map<String, String> map, aw aw2, Class<? extends T> clazz, String string, b b2) {
        c c2;
        int n2 = az.a(map, "c", !string.equals("a") && !string.equals("e") ? 1 : 0);
        if (!(string.equals("p") || string.equals("a") || string.equals("e"))) {
            if (string.equals("r")) {
                Collections.shuffle(arrayList);
            }
        } else if (b2 != null) {
            Collections.sort(arrayList, new bd(b2));
        }
        if ((c2 = aw2.Sf()) != null && clazz.isAssignableFrom(c2.getClass()) && n2 == 1 && arrayList.contains(c2) && !"r".equals(string)) {
            arrayList = Lists.newArrayList((Object[])new c[]{c2});
        }
        if (n2 != 0) {
            if (n2 < 0) {
                Collections.reverse(arrayList);
            }
            arrayList = arrayList.subList(0, Math.min(Math.abs(n2), arrayList.size()));
        }
        return arrayList;
    }

    private static net.minecraft.util.a b(b b2, int n2, int n3, int n4) {
        boolean bl2 = n2 < 0;
        boolean bl3 = n3 < 0;
        boolean bl4 = n4 < 0;
        int n5 = b2.wt() + (bl2 ? n2 : 0);
        int n6 = b2.wu() + (bl3 ? n3 : 0);
        int n7 = b2.wx() + (bl4 ? n4 : 0);
        int n8 = b2.wt() + (bl2 ? 0 : n2) + 1;
        int n9 = b2.wu() + (bl3 ? 0 : n3) + 1;
        int n10 = b2.wx() + (bl4 ? 0 : n4) + 1;
        return new net.minecraft.util.a(n5, n6, n7, n8, n9, n10);
    }

    public static int ee(int n2) {
        if ((n2 %= 360) >= 160) {
            n2 -= 360;
        }
        if (n2 < 0) {
            n2 += 360;
        }
        return n2;
    }

    private static b b(Map<String, String> map, b b2) {
        return new b(az.a(map, "x", b2.wt()), az.a(map, "y", b2.wu()), az.a(map, "z", b2.wx()));
    }

    private static boolean o(Map<String, String> map) {
        for (String string : cot) {
            if (!map.containsKey(string)) continue;
            return true;
        }
        return false;
    }

    private static int a(Map<String, String> map, String string, int n2) {
        return map.containsKey(string) ? bt.w(map.get(string), n2) : n2;
    }

    private static String b(Map<String, String> map, String string) {
        return map.get(string);
    }

    public static Map<String, Integer> p(Map<String, String> map) {
        HashMap hashMap = Maps.newHashMap();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            hashMap.put(string.substring("score_".length()), bt.w(map.get(string), 1));
        }
        return hashMap;
    }

    public static boolean dT(String string) {
        Matcher matcher = coq.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        Map<String, String> map = az.dV(matcher.group(2));
        String string2 = matcher.group(1);
        int n2 = !"a".equals(string2) && !"e".equals(string2) ? 1 : 0;
        return az.a(map, "c", n2) != 1;
    }

    public static boolean dU(String string) {
        return coq.matcher(string).matches();
    }

    private static Map<String, String> dV(String string) {
        HashMap hashMap = Maps.newHashMap();
        if (string == null) {
            return hashMap;
        }
        int n2 = 0;
        int n3 = -1;
        Matcher matcher = cor.matcher(string);
        while (matcher.find()) {
            String string2 = null;
            switch (n2++) {
                case 0: {
                    string2 = "x";
                    break;
                }
                case 1: {
                    string2 = "y";
                    break;
                }
                case 2: {
                    string2 = "z";
                    break;
                }
                case 3: {
                    string2 = "r";
                }
            }
            if (string2 != null && matcher.group(1).length() > 0) {
                hashMap.put(string2, matcher.group(1));
            }
            n3 = matcher.end();
        }
        if (n3 < string.length()) {
            matcher = cos.matcher(n3 == -1 ? string : string.substring(n3));
            while (matcher.find()) {
                hashMap.put(matcher.group(1), matcher.group(2));
            }
        }
        return hashMap;
    }
}

