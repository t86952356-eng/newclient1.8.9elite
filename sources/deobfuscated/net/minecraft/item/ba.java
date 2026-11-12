/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.item;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.item.h;
import net.minecraft.entity.player.a;
import net.minecraft.item.bb;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class ba
extends d {
    @Override
    public boolean a(co co2, a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (!w2.dDw) {
            h h2 = new h(w2, (float)b2.wt() + f2, (float)b2.wu() + f3, (float)b2.wx() + f4, co2);
            w2.G(h2);
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(co co2, a a2, List<String> list, boolean bl2) {
        n n2;
        if (co2.aej() && (n2 = co2.aek().eN("Fireworks")) != null) {
            v v2;
            if (n2.C("Flight", 99)) {
                list.add(cr.gm("item.fireworks.flight") + " " + n2.eE("Flight"));
            }
            if ((v2 = n2.D("Explosions", 10)) != null && v2.aeS() > 0) {
                for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                    n n3 = v2.gi(i2);
                    ArrayList arrayList = Lists.newArrayList();
                    bb.a(n3, arrayList);
                    if (arrayList.size() <= 0) continue;
                    for (int i3 = 1; i3 < arrayList.size(); ++i3) {
                        arrayList.set(i3, "  " + (String)arrayList.get(i3));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }
}

