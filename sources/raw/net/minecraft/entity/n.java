/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.entity.ai.bi;
import net.minecraft.entity.item.b;
import net.minecraft.entity.item.f;
import net.minecraft.entity.item.g;
import net.minecraft.entity.item.h;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.m;
import net.minecraft.entity.item.p;
import net.minecraft.entity.item.q;
import net.minecraft.entity.item.r;
import net.minecraft.entity.item.s;
import net.minecraft.entity.item.t;
import net.minecraft.entity.item.v;
import net.minecraft.entity.item.w;
import net.minecraft.entity.monster.a;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.ae;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.ao;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.monster.c;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.e;
import net.minecraft.entity.monster.j;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.monster.z;
import net.minecraft.entity.o;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.passive.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n {
    private static final Logger ctz = LogManager.getLogger();
    private static final Map<String, Class<? extends net.minecraft.entity.c>> ctA = Maps.newHashMap();
    private static final Map<Class<? extends net.minecraft.entity.c>, String> ctB = Maps.newHashMap();
    private static final Map<Integer, Class<? extends net.minecraft.entity.c>> ctC = Maps.newHashMap();
    private static final Map<Class<? extends net.minecraft.entity.c>, Integer> ctD = Maps.newHashMap();
    private static final Map<String, Integer> ctE = Maps.newHashMap();
    public static final Map<Integer, o> ctF = Maps.newLinkedHashMap();

    private static void a(Class<? extends net.minecraft.entity.c> clazz, String string, int n2) {
        if (ctA.containsKey(string)) {
            throw new IllegalArgumentException("ID is already registered: " + string);
        }
        if (ctC.containsKey(n2)) {
            throw new IllegalArgumentException("ID is already registered: " + n2);
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot register to reserved id: " + n2);
        }
        if (clazz == null) {
            throw new IllegalArgumentException("Cannot register null clazz for id: " + n2);
        }
        ctA.put(string, clazz);
        ctB.put(clazz, string);
        ctC.put(n2, clazz);
        ctD.put(clazz, n2);
        ctE.put(string, n2);
    }

    private static void a(Class<? extends net.minecraft.entity.c> clazz, String string, int n2, int n3, int n4) {
        n.a(clazz, string, n2);
        ctF.put(n2, new o(n2, n3, n4));
    }

    public static net.minecraft.entity.c a(String string, net.minecraft.world.w w2) {
        net.minecraft.entity.c c2 = null;
        try {
            Class<? extends net.minecraft.entity.c> clazz = ctA.get(string);
            if (clazz != null) {
                c2 = clazz.getConstructor(net.minecraft.world.w.class).newInstance(w2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return c2;
    }

    public static net.minecraft.entity.c a(net.minecraft.nbt.n n2, net.minecraft.world.w w2) {
        net.minecraft.entity.c c2 = null;
        if ("Minecart".equals(n2.eK("id"))) {
            n2.R("id", m.fh(n2.eG("Type")).getName());
            n2.eP("Type");
        }
        try {
            Class<? extends net.minecraft.entity.c> clazz = ctA.get(n2.eK("id"));
            if (clazz != null) {
                c2 = clazz.getConstructor(net.minecraft.world.w.class).newInstance(w2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (c2 != null) {
            c2.a(n2);
        } else {
            ctz.warn("Skipping Entity with id " + n2.eK("id"));
        }
        return c2;
    }

    public static net.minecraft.entity.c a(int n2, net.minecraft.world.w w2) {
        net.minecraft.entity.c c2 = null;
        try {
            Class<? extends net.minecraft.entity.c> clazz = n.eE(n2);
            if (clazz != null) {
                c2 = clazz.getConstructor(net.minecraft.world.w.class).newInstance(w2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (c2 == null) {
            ctz.warn("Skipping Entity with id " + n2);
        }
        return c2;
    }

    public static int ac(net.minecraft.entity.c c2) {
        Integer n2 = ctD.get(c2.getClass());
        return n2 == null ? 0 : n2;
    }

    public static Class<? extends net.minecraft.entity.c> eE(int n2) {
        return ctC.get(n2);
    }

    public static String ad(net.minecraft.entity.c c2) {
        return ctB.get(c2.getClass());
    }

    public static int ed(String string) {
        Integer n2 = ctE.get(string);
        return n2 == null ? 90 : n2;
    }

    public static String eF(int n2) {
        return ctB.get(n.eE(n2));
    }

    public static void UO() {
    }

    public static List<String> UP() {
        Set<String> set = ctA.keySet();
        ArrayList arrayList = Lists.newArrayList();
        for (String string : set) {
            Class<? extends net.minecraft.entity.c> clazz = ctA.get(string);
            if ((clazz.getModifiers() & 0x400) == 1024) continue;
            arrayList.add(string);
        }
        arrayList.add("LightningBolt");
        return arrayList;
    }

    public static boolean a(net.minecraft.entity.c c2, String string) {
        String string2 = n.ad(c2);
        if (string2 == null && c2 instanceof net.minecraft.entity.player.a) {
            string2 = "Player";
        } else if (string2 == null && c2 instanceof net.minecraft.entity.effect.a) {
            string2 = "LightningBolt";
        }
        return string.equals(string2);
    }

    public static boolean ee(String string) {
        return "Player".equals(string) || n.UP().contains(string);
    }

    static {
        n.a(i.class, "Item", 1);
        n.a(w.class, "XPOrb", 2);
        n.a(net.minecraft.entity.projectile.b.class, "ThrownEgg", 7);
        n.a(net.minecraft.entity.m.class, "LeashKnot", 8);
        n.a(t.class, "Painting", 9);
        n.a(net.minecraft.entity.projectile.a.class, "Arrow", 10);
        n.a(net.minecraft.entity.projectile.h.class, "Snowball", 11);
        n.a(net.minecraft.entity.projectile.e.class, "Fireball", 12);
        n.a(net.minecraft.entity.projectile.g.class, "SmallFireball", 13);
        n.a(net.minecraft.entity.item.e.class, "ThrownEnderpearl", 14);
        n.a(net.minecraft.entity.item.d.class, "EyeOfEnderSignal", 15);
        n.a(net.minecraft.entity.projectile.f.class, "ThrownPotion", 16);
        n.a(f.class, "ThrownExpBottle", 17);
        n.a(net.minecraft.entity.item.j.class, "ItemFrame", 18);
        n.a(net.minecraft.entity.projectile.j.class, "WitherSkull", 19);
        n.a(v.class, "PrimedTnt", 20);
        n.a(g.class, "FallingSand", 21);
        n.a(h.class, "FireworksRocketEntity", 22);
        n.a(net.minecraft.entity.item.a.class, "ArmorStand", 30);
        n.a(b.class, "Boat", 41);
        n.a(p.class, m.cCG.getName(), 42);
        n.a(net.minecraft.entity.item.n.class, m.cCH.getName(), 43);
        n.a(q.class, m.cCI.getName(), 44);
        n.a(s.class, m.cCJ.getName(), 45);
        n.a(r.class, m.cCL.getName(), 46);
        n.a(bi.class, m.cCK.getName(), 47);
        n.a(net.minecraft.entity.t.class, m.cCM.getName(), 40);
        n.a(net.minecraft.entity.p.class, "Mob", 48);
        n.a(aa.class, "Monster", 49);
        n.a(d.class, "Creeper", 50, 894731, 0);
        n.a(ah.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        n.a(ap.class, "Spider", 52, 3419431, 11013646);
        n.a(net.minecraft.entity.monster.p.class, "Giant", 53);
        n.a(au.class, "Zombie", 54, 44975, 7969893);
        n.a(net.minecraft.entity.monster.ai.class, "Slime", 55, 5349438, 8306542);
        n.a(k.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        n.a(ab.class, "PigZombie", 57, 15373203, 5009705);
        n.a(e.class, "Enderman", 58, 0x161616, 0);
        n.a(c.class, "CaveSpider", 59, 803406, 11013646);
        n.a(ae.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        n.a(a.class, "Blaze", 61, 16167425, 16775294);
        n.a(z.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        n.a(net.minecraft.entity.boss.b.class, "EnderDragon", 63);
        n.a(net.minecraft.entity.boss.d.class, "WitherBoss", 64);
        n.a(net.minecraft.entity.passive.c.class, "Bat", 65, 4996656, 986895);
        n.a(at.class, "Witch", 66, 0x340000, 5349438);
        n.a(j.class, "Endermite", 67, 0x161616, 0x6E6E6E);
        n.a(net.minecraft.entity.monster.r.class, "Guardian", 68, 5931634, 15826224);
        n.a(net.minecraft.entity.passive.k.class, "Pig", 90, 15771042, 14377823);
        n.a(u.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        n.a(net.minecraft.entity.passive.e.class, "Cow", 92, 4470310, 0xA1A1A1);
        n.a(net.minecraft.entity.passive.d.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        n.a(net.minecraft.entity.passive.w.class, "Squid", 94, 2243405, 7375001);
        n.a(ai.class, "Wolf", 95, 0xD7D3D3, 13545366);
        n.a(net.minecraft.entity.passive.i.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        n.a(ao.class, "SnowMan", 97);
        n.a(net.minecraft.entity.passive.j.class, "Ozelot", 98, 15720061, 5653556);
        n.a(net.minecraft.entity.monster.w.class, "VillagerGolem", 99);
        n.a(net.minecraft.entity.passive.f.class, "EntityHorse", 100, 12623485, 0xEEE500);
        n.a(l.class, "Rabbit", 101, 10051392, 7555121);
        n.a(net.minecraft.entity.passive.z.class, "Villager", 120, 5651507, 12422002);
        n.a(net.minecraft.entity.item.c.class, "EnderCrystal", 200);
    }
}

