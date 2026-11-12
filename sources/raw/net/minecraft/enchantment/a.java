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
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import net.minecraft.enchantment.b;
import net.minecraft.enchantment.c;
import net.minecraft.enchantment.d;
import net.minecraft.enchantment.e;
import net.minecraft.enchantment.f;
import net.minecraft.enchantment.h;
import net.minecraft.enchantment.i;
import net.minecraft.enchantment.j;
import net.minecraft.enchantment.k;
import net.minecraft.enchantment.r;
import net.minecraft.enchantment.s;
import net.minecraft.enchantment.t;
import net.minecraft.enchantment.u;
import net.minecraft.enchantment.v;
import net.minecraft.enchantment.w;
import net.minecraft.enchantment.x;
import net.minecraft.enchantment.y;
import net.minecraft.enchantment.z;
import net.minecraft.item.co;
import net.minecraft.util.ad;
import net.minecraft.util.cm;
import net.minecraft.util.cr;

public abstract class a {
    private static final a[] cpU = new a[256];
    public static final a[] cpV;
    private static final Map<cm, a> cpW;
    public static final a cpX;
    public static final a cpY;
    public static final a cpZ;
    public static final a cqa;
    public static final a cqb;
    public static final a cqc;
    public static final a cqd;
    public static final a cqe;
    public static final a cqf;
    public static final a cqg;
    public static final a cqh;
    public static final a cqi;
    public static final a cqj;
    public static final a cqk;
    public static final a cql;
    public static final a cqm;
    public static final a cqn;
    public static final a cqo;
    public static final a cqp;
    public static final a cqq;
    public static final a cqr;
    public static final a cqs;
    public static final a cqt;
    public static final a cqu;
    public static final a cqv;
    public final int cqw;
    private final int cqx;
    public z cqy;
    protected String gK;

    public static a eh(int n2) {
        return n2 >= 0 && n2 < cpU.length ? cpU[n2] : null;
    }

    protected a(int n2, cm cm2, int n3, z z2) {
        this.cqw = n2;
        this.cqx = n3;
        this.cqy = z2;
        if (cpU[n2] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        a.cpU[n2] = this;
        cpW.put(cm2, this);
    }

    public static a ea(String string) {
        return cpW.get(new cm(string));
    }

    public static Set<cm> Tc() {
        return cpW.keySet();
    }

    public int Cl() {
        return this.cqx;
    }

    public int Td() {
        return 1;
    }

    public int Te() {
        return 1;
    }

    public int ei(int n2) {
        return 1 + n2 * 10;
    }

    public int ej(int n2) {
        return this.ei(n2) + 5;
    }

    public int a(int n2, ad ad2) {
        return 0;
    }

    public float a(int n2, net.minecraft.entity.z z2) {
        return 0.0f;
    }

    public boolean a(a a2) {
        return this != a2;
    }

    public a eb(String string) {
        this.gK = string;
        return this;
    }

    public String getName() {
        return "enchantment." + this.gK;
    }

    public String ek(int n2) {
        String string = cr.gm(this.getName());
        return string + " " + cr.gm("enchantment.level." + n2);
    }

    public boolean T(co co2) {
        return this.cqy.i(co2.bP());
    }

    public void a(net.minecraft.entity.r r2, net.minecraft.entity.c c2, int n2) {
    }

    public void b(net.minecraft.entity.r r2, net.minecraft.entity.c c2, int n2) {
    }

    static {
        cpW = Maps.newHashMap();
        cpX = new u(0, new cm("protection"), 10, 0);
        cpY = new u(1, new cm("fire_protection"), 5, 1);
        cpZ = new u(2, new cm("feather_falling"), 5, 2);
        cqa = new u(3, new cm("blast_protection"), 2, 3);
        cqb = new u(4, new cm("projectile_protection"), 5, 4);
        cqc = new t(5, new cm("respiration"), 2);
        cqd = new y(6, new cm("aqua_affinity"), 2);
        cqe = new v(7, new cm("thorns"), 1);
        cqf = new x(8, new cm("depth_strider"), 2);
        cqg = new f(16, new cm("sharpness"), 10, 0);
        cqh = new f(17, new cm("smite"), 5, 1);
        cqi = new f(18, new cm("bane_of_arthropods"), 5, 2);
        cqj = new r(19, new cm("knockback"), 5);
        cqk = new j(20, new cm("fire_aspect"), 2);
        cql = new s(21, new cm("looting"), 2, z.crc);
        cqm = new h(32, new cm("efficiency"), 10);
        cqn = new w(33, new cm("silk_touch"), 1);
        cqo = new i(34, new cm("unbreaking"), 5);
        cqp = new s(35, new cm("fortune"), 2, z.crd);
        cqq = new b(48, new cm("power"), 10);
        cqr = new e(49, new cm("punch"), 2);
        cqs = new c(50, new cm("flame"), 2);
        cqt = new d(51, new cm("infinity"), 1);
        cqu = new s(61, new cm("luck_of_the_sea"), 2, z.cre);
        cqv = new k(62, new cm("lure"), 2, z.cre);
        ArrayList arrayList = Lists.newArrayList();
        for (a a2 : cpU) {
            if (a2 == null) continue;
            arrayList.add(a2);
        }
        cpV = arrayList.toArray(new a[arrayList.size()]);
    }
}

