/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.h;
import net.minecraft.util.an;

public class i {
    private final Map<String, g> dka = Maps.newHashMap();
    private final Map<b, List<g>> dkb = Maps.newHashMap();
    private final Map<String, Map<g, d>> dkc = Maps.newHashMap();
    private final g[] dkd = new g[19];
    private final Map<String, h> dke = Maps.newHashMap();
    private final Map<String, h> dkf = Maps.newHashMap();
    private static String[] dkg = null;

    public g fo(String string) {
        return this.dka.get(string);
    }

    public g a(String string, b b2) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        g g2 = this.fo(string);
        if (g2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        g2 = new g(this, string, b2);
        ArrayList arrayList = this.dkb.get(b2);
        if (arrayList == null) {
            arrayList = Lists.newArrayList();
            this.dkb.put(b2, arrayList);
        }
        arrayList.add(g2);
        this.dka.put(string, g2);
        this.d(g2);
        return g2;
    }

    public Collection<g> a(b b2) {
        Collection collection = this.dkb.get(b2);
        return collection == null ? Lists.newArrayList() : Lists.newArrayList((Iterable)collection);
    }

    public boolean a(String string, g g2) {
        Map<g, d> map = this.dkc.get(string);
        if (map == null) {
            return false;
        }
        d d2 = map.get(g2);
        return d2 != null;
    }

    public d b(String string, g g2) {
        d d2;
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        HashMap hashMap = this.dkc.get(string);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
            this.dkc.put(string, hashMap);
        }
        if ((d2 = (d)hashMap.get(g2)) == null) {
            d2 = new d(this, g2, string);
            hashMap.put(g2, d2);
        }
        return d2;
    }

    public Collection<d> b(g g2) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map<g, d> map : this.dkc.values()) {
            d d2 = map.get(g2);
            if (d2 == null) continue;
            arrayList.add(d2);
        }
        arrayList.sort(d.djD);
        return arrayList;
    }

    public Collection<g> akA() {
        return this.dka.values();
    }

    public Collection<String> akB() {
        return this.dkc.keySet();
    }

    public void c(String string, g g2) {
        if (g2 == null) {
            Map<g, d> map = this.dkc.remove(string);
            if (map != null) {
                this.ft(string);
            }
        } else {
            Map<g, d> map = this.dkc.get(string);
            if (map != null) {
                d d2 = map.remove(g2);
                if (map.size() < 1) {
                    Map<g, d> map2 = this.dkc.remove(string);
                    if (map2 != null) {
                        this.ft(string);
                    }
                } else if (d2 != null) {
                    this.d(string, g2);
                }
            }
        }
    }

    public Collection<d> akC() {
        Collection<Map<g, d>> collection = this.dkc.values();
        ArrayList arrayList = Lists.newArrayList();
        for (Map<g, d> map : collection) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public Map<g, d> fp(String string) {
        HashMap hashMap = this.dkc.get(string);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
        }
        return hashMap;
    }

    public void c(g g2) {
        if (g2 == null || this.dka == null) {
            return;
        }
        this.dka.remove(g2.getName());
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.gY(i2) != g2) continue;
            this.a(i2, null);
        }
        List<g> list = this.dkb.get(g2.akp());
        if (list != null) {
            list.remove(g2);
        }
        for (Map<g, d> map : this.dkc.values()) {
            map.remove(g2);
        }
        this.f(g2);
    }

    public void a(int n2, g g2) {
        this.dkd[n2] = g2;
    }

    public g gY(int n2) {
        return this.dkd[n2];
    }

    public h dX(String string) {
        return this.dke.get(string);
    }

    public h fq(String string) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        h h2 = this.dX(string);
        if (h2 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        h2 = new h(this, string);
        this.dke.put(string, h2);
        this.b(h2);
        return h2;
    }

    public void a(h h2) {
        if (h2 == null) {
            return;
        }
        this.dke.remove(h2.akq());
        for (String string : h2.akr()) {
            this.dkf.remove(string);
        }
        this.d(h2);
    }

    public boolean T(String string, String string2) {
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (!this.dke.containsKey(string2)) {
            return false;
        }
        h h2 = this.dX(string2);
        if (this.fs(string) != null) {
            this.fr(string);
        }
        this.dkf.put(string, h2);
        h2.akr().add(string);
        return true;
    }

    public boolean fr(String string) {
        h h2 = this.fs(string);
        if (h2 != null) {
            this.a(string, h2);
            return true;
        }
        return false;
    }

    public void a(String string, h h2) {
        if (this.fs(string) != h2) {
            Minecraft.getMinecraft().f(() -> {
                try {
                    this.dkf.remove(string);
                    h2.akr().remove(string);
                }
                catch (Exception exception) {
                    System.out.println("Scoreboard Failed to remove player, loc: Scoreboard.java func: removePlayerFromTeam line: 307 (\"Player is either on another team or not on any team. Cannot remove from team '\" + p_96512_2_.getRegisteredName() + \"'.\")");
                }
            });
        } else {
            this.dkf.remove(string);
            h2.akr().remove(string);
        }
    }

    public Collection<String> akD() {
        return this.dke.keySet();
    }

    public Collection<h> akE() {
        return this.dke.values();
    }

    public h fs(String string) {
        return this.dkf.get(string);
    }

    public void d(g g2) {
    }

    public void e(g g2) {
    }

    public void f(g g2) {
    }

    public void e(d d2) {
    }

    public void ft(String string) {
    }

    public void d(String string, g g2) {
    }

    public void b(h h2) {
    }

    public void c(h h2) {
    }

    public void d(h h2) {
    }

    public static String gZ(int n2) {
        an an2;
        switch (n2) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if (n2 >= 3 && n2 <= 18 && (an2 = an.hx(n2 - 3)) != null && an2 != an.dwh) {
            return "sidebar.team." + an2.asy();
        }
        return null;
    }

    public static int fu(String string) {
        String string2;
        an an2;
        if (string.equalsIgnoreCase("list")) {
            return 0;
        }
        if (string.equalsIgnoreCase("sidebar")) {
            return 1;
        }
        if (string.equalsIgnoreCase("belowName")) {
            return 2;
        }
        if (string.startsWith("sidebar.team.") && (an2 = an.gf(string2 = string.substring("sidebar.team.".length()))) != null && an2.asv() >= 0) {
            return an2.asv() + 3;
        }
        return -1;
    }

    public static String[] akF() {
        if (dkg == null) {
            dkg = new String[19];
            for (int i2 = 0; i2 < 19; ++i2) {
                i.dkg[i2] = i.gZ(i2);
            }
        }
        return dkg;
    }

    public void av(c c2) {
        if (c2 != null && !(c2 instanceof a) && !c2.TS()) {
            String string = c2.Ul().toString();
            this.c(string, null);
            this.fr(string);
        }
    }
}

