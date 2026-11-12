/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.enchantment;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import hackclient.rise.aea;
import hackclient.rise.bu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.g;
import net.minecraft.enchantment.m;
import net.minecraft.enchantment.n;
import net.minecraft.enchantment.o;
import net.minecraft.enchantment.p;
import net.minecraft.enchantment.q;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.v;
import net.minecraft.util.ad;
import net.minecraft.util.de;

public class l
implements aea {
    private static final Random cqG = new Random();
    private static final p cqH = new p();
    private static final q cqI = new q();
    private static final n cqJ = new n();
    private static final m cqK = new m();

    public static int d(int n2, co co2) {
        if (co2 == null) {
            return 0;
        }
        v v2 = co2.ael();
        if (v2 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            short s2 = v2.gi(i2).eF("id");
            short s3 = v2.gi(i2).eF("lvl");
            if (s2 != n2) continue;
            return s3;
        }
        return 0;
    }

    public static float a(co co2, z z2) {
        l.cqI.cqP = 0.0f;
        l.cqI.cqQ = z2;
        l.a((o)cqI, co2);
        return l.cqI.cqP;
    }

    public static Map<Integer, Integer> U(co co2) {
        v v2;
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        v v3 = v2 = co2.bP() == Items.cSh ? Items.cSh.aD(co2) : co2.ael();
        if (v2 != null) {
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                short s2 = v2.gi(i2).eF("id");
                short s3 = v2.gi(i2).eF("lvl");
                linkedHashMap.put(Integer.valueOf(s2), Integer.valueOf(s3));
            }
        }
        return linkedHashMap;
    }

    public static void a(Map<Integer, Integer> map, co co2) {
        v v2 = new v();
        for (int n2 : map.keySet()) {
            a a2 = a.eh(n2);
            if (a2 == null) continue;
            net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
            n3.a("id", (short)n2);
            n3.a("lvl", (short)map.get(n2).intValue());
            v2.a(n3);
            if (co2.bP() != Items.cSh) continue;
            Items.cSh.a(co2, new g(a2, map.get(n2)));
        }
        if (v2.aeS() > 0) {
            if (co2.bP() != Items.cSh) {
                co2.a("ench", v2);
            }
        } else if (co2.aej()) {
            co2.aek().eP("ench");
        }
    }

    public static int a(int n2, co[] coArray) {
        if (coArray == null) {
            return 0;
        }
        int n3 = 0;
        for (co co2 : coArray) {
            int n4 = l.d(n2, co2);
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    private static void a(o o2, co co2) {
        v v2;
        if (co2 != null && (v2 = co2.ael()) != null) {
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                short s2 = v2.gi(i2).eF("id");
                short s3 = v2.gi(i2).eF("lvl");
                if (a.eh(s2) == null) continue;
                o2.a(a.eh(s2), s3);
            }
        }
    }

    private static void a(o o2, co[] coArray) {
        for (co co2 : coArray) {
            l.a(o2, co2);
        }
    }

    public static int a(co[] coArray, ad ad2) {
        l.cqH.cqN = 0;
        l.cqH.cqO = ad2;
        l.a((o)cqH, coArray);
        if (l.cqH.cqN > 25) {
            l.cqH.cqN = 25;
        } else if (l.cqH.cqN < 0) {
            l.cqH.cqN = 0;
        }
        return (l.cqH.cqN + 1 >> 1) + cqG.nextInt((l.cqH.cqN >> 1) + 1);
    }

    public static float b(co co2, z z2) {
        l.cqI.cqP = 0.0f;
        l.cqI.cqQ = z2;
        l.a((o)cqI, co2);
        return l.cqI.cqP;
    }

    public static void a(r r2, c c2) {
        l.cqJ.cqM = c2;
        l.cqJ.cqL = r2;
        if (r2 != null) {
            l.a((o)cqJ, r2.Ub());
        }
        if (c2 instanceof net.minecraft.entity.player.a) {
            l.a((o)cqJ, r2.Vk());
        }
    }

    public static void b(r r2, c c2) {
        l.cqK.cqL = r2;
        l.cqK.by = c2;
        if (r2 != null) {
            l.a((o)cqK, r2.Ub());
        }
        if (r2 instanceof net.minecraft.entity.player.a) {
            l.a((o)cqK, r2.Vk());
        }
    }

    public static int I(r r2) {
        return l.d(a.cqj.cqw, r2.Vk());
    }

    public static int J(r r2) {
        return l.d(a.cqk.cqw, r2.Vk());
    }

    public static int Q(c c2) {
        return l.a(a.cqc.cqw, c2.Ub());
    }

    public static int R(c c2) {
        return l.a(a.cqf.cqw, c2.Ub());
    }

    public static int K(r r2) {
        int n2 = a.cqm.cqw;
        hackclient.rise.a.a.h().b(bu.class);
        return l.d(n2, bu.bO());
    }

    public static boolean L(r r2) {
        return l.d(a.cqn.cqw, r2.Vk()) > 0;
    }

    public static int M(r r2) {
        return l.d(a.cqp.cqw, r2.Vk());
    }

    public static int N(r r2) {
        return l.d(a.cqu.cqw, r2.Vk());
    }

    public static int O(r r2) {
        return l.d(a.cqv.cqw, r2.Vk());
    }

    public static int P(r r2) {
        return l.d(a.cql.cqw, r2.Vk());
    }

    public static boolean Q(r r2) {
        return l.a(a.cqd.cqw, r2.Ub()) > 0;
    }

    public static co a(a a2, r r2) {
        for (co co2 : r2.Ub()) {
            if (co2 == null || l.d(a2.cqw, co2) <= 0) continue;
            return co2;
        }
        return null;
    }

    public static int a(Random random, int n2, int n3, co co2) {
        d d2 = co2.bP();
        int n4 = d2.adC();
        if (n4 <= 0) {
            return 0;
        }
        if (n3 > 15) {
            n3 = 15;
        }
        int n5 = random.nextInt(8) + 1 + (n3 >> 1) + random.nextInt(n3 + 1);
        return n2 == 0 ? Math.max(n5 / 3, 1) : (n2 == 1 ? n5 * 2 / 3 + 1 : Math.max(n5, n3 * 2));
    }

    public static co a(Random random, co co2, int n2) {
        boolean bl2;
        List<g> list = l.b(random, co2, n2);
        boolean bl3 = bl2 = co2.bP() == Items.cQP;
        if (bl2) {
            co2.r(Items.cSh);
        }
        if (list != null) {
            for (g g2 : list) {
                if (bl2) {
                    Items.cSh.a(co2, g2);
                    continue;
                }
                co2.b(g2.cqE, g2.cqF);
            }
        }
        return co2;
    }

    public static List<g> b(Random random, co co2, int n2) {
        g g2;
        float f2;
        d d2 = co2.bP();
        int n3 = d2.adC();
        if (n3 <= 0) {
            return null;
        }
        n3 /= 2;
        int n4 = (n3 = 1 + random.nextInt((n3 >> 1) + 1) + random.nextInt((n3 >> 1) + 1)) + n2;
        int n5 = (int)((float)n4 * (1.0f + (f2 = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f)) + 0.5f);
        if (n5 < 1) {
            n5 = 1;
        }
        ArrayList arrayList = null;
        Map<Integer, g> map = l.e(n5, co2);
        if (map != null && !map.isEmpty() && (g2 = de.a(random, map.values())) != null) {
            arrayList = Lists.newArrayList();
            arrayList.add(g2);
            for (int i2 = n5; random.nextInt(50) <= i2; i2 >>= 1) {
                Object object;
                Iterator<Integer> iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    boolean bl2 = true;
                    for (g g3 : arrayList) {
                        if (g3.cqE.a(a.eh((Integer)object))) continue;
                        bl2 = false;
                        break;
                    }
                    if (bl2) continue;
                    iterator.remove();
                }
                if (map.isEmpty()) continue;
                object = de.a(random, map.values());
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    public static Map<Integer, g> e(int n2, co co2) {
        d d2 = co2.bP();
        HashMap hashMap = null;
        boolean bl2 = co2.bP() == Items.cQP;
        for (a a2 : a.cpV) {
            if (a2 == null || !a2.cqy.i(d2) && !bl2) continue;
            for (int i2 = a2.Td(); i2 <= a2.Te(); ++i2) {
                if (n2 < a2.ei(i2) || n2 > a2.ej(i2)) continue;
                if (hashMap == null) {
                    hashMap = Maps.newHashMap();
                }
                hashMap.put(a2.cqw, new g(a2, i2));
            }
        }
        return hashMap;
    }
}

