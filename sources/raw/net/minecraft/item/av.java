/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import java.util.Random;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.g;
import net.minecraft.enchantment.l;
import net.minecraft.init.Items;
import net.minecraft.item.c;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.dg;

public class av
extends d {
    @Override
    public boolean au(co co2) {
        return true;
    }

    @Override
    public boolean aw(co co2) {
        return false;
    }

    @Override
    public c av(co co2) {
        return this.aD(co2).aeS() > 0 ? c.cVc : super.av(co2);
    }

    public v aD(co co2) {
        n n2 = co2.aek();
        return n2 != null && n2.C("StoredEnchantments", 9) ? (v)n2.eB("StoredEnchantments") : new v();
    }

    @Override
    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
        super.a(co2, a2, list, bl2);
        v v2 = this.aD(co2);
        if (v2 != null) {
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                short s2 = v2.gi(i2).eF("id");
                short s3 = v2.gi(i2).eF("lvl");
                if (a.eh(s2) == null) continue;
                list.add(a.eh(s2).ek(s3));
            }
        }
    }

    public void a(co co2, g g2) {
        v v2 = this.aD(co2);
        boolean bl2 = true;
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n2 = v2.gi(i2);
            if (n2.eF("id") != g2.cqE.cqw) continue;
            if (n2.eF("lvl") < g2.cqF) {
                n2.a("lvl", (short)g2.cqF);
            }
            bl2 = false;
            break;
        }
        if (bl2) {
            n n3 = new n();
            n3.a("id", (short)g2.cqE.cqw);
            n3.a("lvl", (short)g2.cqF);
            v2.a(n3);
        }
        if (!co2.aej()) {
            co2.u(new n());
        }
        co2.aek().b("StoredEnchantments", v2);
    }

    public co a(g g2) {
        co co2 = new co(this);
        this.a(co2, g2);
        return co2;
    }

    public void a(a a2, List<co> list) {
        for (int i2 = a2.Td(); i2 <= a2.Te(); ++i2) {
            list.add(this.a(new g(a2, i2)));
        }
    }

    public dg f(Random random) {
        return this.a(random, 1, 1, 1);
    }

    public dg a(Random random, int n2, int n3, int n4) {
        co co2 = new co(Items.cQP, 1, 0);
        l.a(random, co2, 30);
        return new dg(co2, n2, n3, n4);
    }
}

