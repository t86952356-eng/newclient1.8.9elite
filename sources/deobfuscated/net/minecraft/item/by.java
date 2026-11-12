/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.f;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.potion.g;
import net.minecraft.util.an;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class by
extends d {
    private final Map<Integer, List<net.minecraft.potion.d>> cWL = Maps.newHashMap();
    private static final Map<List<net.minecraft.potion.d>, Integer> cWM = Maps.newLinkedHashMap();

    public by() {
        this.fU(1);
        this.bM(true);
        this.fW(0);
        this.d(net.minecraft.creativetab.a.cpG);
    }

    public List<net.minecraft.potion.d> aH(co co2) {
        if (co2.aej() && co2.aek().C("CustomPotionEffects", 9)) {
            ArrayList arrayList = Lists.newArrayList();
            v v2 = co2.aek().D("CustomPotionEffects", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                n n2 = v2.gi(i2);
                net.minecraft.potion.d d2 = net.minecraft.potion.d.A(n2);
                if (d2 == null) continue;
                arrayList.add(d2);
            }
            return arrayList;
        }
        List<net.minecraft.potion.d> list = this.cWL.get(co2.yc());
        if (list == null) {
            list = g.r(co2.yc(), false);
            this.cWL.put(co2.yc(), list);
        }
        return list;
    }

    public List<net.minecraft.potion.d> ga(int n2) {
        List<net.minecraft.potion.d> list = this.cWL.get(n2);
        if (list == null) {
            list = g.r(n2, false);
            this.cWL.put(n2, list);
        }
        return list;
    }

    @Override
    public co b(co co2, w w2, net.minecraft.entity.player.a a2) {
        List<net.minecraft.potion.d> list;
        if (!a2.cIt.cJM) {
            --co2.cWZ;
        }
        if (!w2.dDw && (list = this.aH(co2)) != null) {
            for (net.minecraft.potion.d d2 : list) {
                a2.b(new net.minecraft.potion.d(d2));
            }
        }
        a2.a(net.minecraft.stats.n.dqE[d.p(this)]);
        if (!a2.cIt.cJM) {
            if (co2.cWZ <= 0) {
                return new co(Items.cRE);
            }
            a2.cHV.ah(new co(Items.cRE));
        }
        return co2;
    }

    @Override
    public int aq(co co2) {
        return 32;
    }

    @Override
    public a ap(co co2) {
        return a.cUy;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (by.gb(co2.yc())) {
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            w2.a((c)a2, "random.bow", 0.5f, 0.4f / (cVm.nextFloat() * 0.4f + 0.8f));
            if (!w2.dDw) {
                w2.G(new f(w2, (r)a2, co2));
            }
            a2.a(net.minecraft.stats.n.dqE[d.p(this)]);
            return co2;
        }
        a2.c(co2, this.aq(co2));
        return co2;
    }

    public static boolean gb(int n2) {
        return (n2 & 0x4000) != 0;
    }

    public int gc(int n2) {
        return g.q(n2, false);
    }

    @Override
    public int e(co co2, int n2) {
        return n2 > 0 ? 0xFFFFFF : this.gc(co2.yc());
    }

    public boolean gd(int n2) {
        List<net.minecraft.potion.d> list = this.ga(n2);
        if (list != null && !list.isEmpty()) {
            for (net.minecraft.potion.d d2 : list) {
                if (!net.minecraft.potion.a.dgt[d2.aje()].aiW()) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String at(co co2) {
        List<net.minecraft.potion.d> list;
        if (co2.yc() == 0) {
            return cr.gm("item.emptyPotion.name").trim();
        }
        Object object = "";
        if (by.gb(co2.yc())) {
            object = cr.gm("potion.prefix.grenade").trim() + " ";
        }
        if ((list = Items.cRD.aH(co2)) != null && !list.isEmpty()) {
            Object object2 = list.get(0).ajj();
            object2 = (String)object2 + ".postfix";
            return (String)object + cr.gm((String)object2).trim();
        }
        String string = g.gK(co2.yc());
        return cr.gm(string).trim() + " " + super.at(co2);
    }

    @Override
    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
        if (co2.yc() != 0) {
            Object object;
            List<net.minecraft.potion.d> list2 = Items.cRD.aH(co2);
            HashMultimap hashMultimap = HashMultimap.create();
            if (list2 != null && !list2.isEmpty()) {
                for (net.minecraft.potion.d object2 : list2) {
                    object = cr.gm(object2.ajj()).trim();
                    net.minecraft.potion.a a3 = net.minecraft.potion.a.dgt[object2.aje()];
                    Map<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> map = a3.ajd();
                    if (map != null && map.size() > 0) {
                        for (Map.Entry<net.minecraft.entity.ai.attributes.d, net.minecraft.entity.ai.attributes.a> entry : map.entrySet()) {
                            net.minecraft.entity.ai.attributes.a a4 = entry.getValue();
                            net.minecraft.entity.ai.attributes.a a5 = new net.minecraft.entity.ai.attributes.a(a4.getName(), a3.a(object2.ajf(), a4), a4.Xp());
                            hashMultimap.put((Object)entry.getKey().Xs(), (Object)a5);
                        }
                    }
                    if (object2.ajf() > 0) {
                        object = (String)object + " " + cr.gm("potion.potency." + object2.ajf()).trim();
                    }
                    if (object2.getDuration() > 20) {
                        object = (String)object + " (" + net.minecraft.potion.a.f(object2) + ")";
                    }
                    if (a3.aiZ()) {
                        list.add(String.valueOf((Object)an.dvX) + (String)object);
                        continue;
                    }
                    list.add(String.valueOf((Object)an.dvS) + (String)object);
                }
            } else {
                Iterator iterator = cr.gm("potion.empty").trim();
                list.add(String.valueOf((Object)an.dvS) + (String)((Object)iterator));
            }
            if (!hashMultimap.isEmpty()) {
                list.add("");
                list.add(String.valueOf((Object)an.dvQ) + cr.gm("potion.effects.whenDrank"));
                for (Map.Entry entry : hashMultimap.entries()) {
                    object = (net.minecraft.entity.ai.attributes.a)entry.getValue();
                    double d2 = ((net.minecraft.entity.ai.attributes.a)object).Xq();
                    double d3 = ((net.minecraft.entity.ai.attributes.a)object).Xp() != 1 && ((net.minecraft.entity.ai.attributes.a)object).Xp() != 2 ? ((net.minecraft.entity.ai.attributes.a)object).Xq() : ((net.minecraft.entity.ai.attributes.a)object).Xq() * 100.0;
                    if (d2 > 0.0) {
                        list.add(String.valueOf((Object)an.dvU) + cr.c("attribute.modifier.plus." + ((net.minecraft.entity.ai.attributes.a)object).Xp(), co.cWY.format(d3), cr.gm("attribute.name." + (String)entry.getKey())));
                        continue;
                    }
                    if (!(d2 < 0.0)) continue;
                    list.add(String.valueOf((Object)an.dvX) + cr.c("attribute.modifier.take." + ((net.minecraft.entity.ai.attributes.a)object).Xp(), co.cWY.format(d3 *= -1.0), cr.gm("attribute.name." + (String)entry.getKey())));
                }
            }
        }
    }

    @Override
    public boolean au(co co2) {
        List<net.minecraft.potion.d> list = this.aH(co2);
        return list != null && !list.isEmpty();
    }

    @Override
    public void b(d d2, net.minecraft.creativetab.a a2, List<co> list) {
        super.b(d2, a2, list);
        if (cWM.isEmpty()) {
            for (int i2 = 0; i2 <= 15; ++i2) {
                for (int i3 = 0; i3 <= 1; ++i3) {
                    int n2 = i3 == 0 ? i2 | 0x2000 : i2 | 0x4000;
                    for (int i4 = 0; i4 <= 2; ++i4) {
                        List<net.minecraft.potion.d> list2;
                        int n3 = n2;
                        if (i4 != 0) {
                            if (i4 == 1) {
                                n3 = n2 | 0x20;
                            } else if (i4 == 2) {
                                n3 = n2 | 0x40;
                            }
                        }
                        if ((list2 = g.r(n3, false)) == null || list2.isEmpty()) continue;
                        cWM.put(list2, n3);
                    }
                }
            }
        }
        for (int i3 : cWM.values()) {
            list.add(new co(d2, 1, i3));
        }
    }
}

