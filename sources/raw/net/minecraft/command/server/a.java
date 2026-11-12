/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.command.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.command.server.b;
import net.minecraft.entity.player.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.f;

public class a
extends net.minecraft.command.a {
    @Override
    public String RX() {
        return "achievement";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.achievement.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new bo("commands.achievement.usage", new Object[0]);
        }
        f f2 = net.minecraft.stats.n.fU(stringArray[1]);
        if (f2 == null && !stringArray[1].equals("*")) {
            throw new n("commands.achievement.unknownAchievement", stringArray[1]);
        }
        e e2 = stringArray.length >= 3 ? a.a(aw2, stringArray[2]) : a.b(aw2);
        boolean bl2 = stringArray[0].equalsIgnoreCase("give");
        boolean bl3 = stringArray[0].equalsIgnoreCase("take");
        if (bl2 || bl3) {
            if (f2 == null) {
                if (bl2) {
                    for (net.minecraft.stats.a a2 : net.minecraft.stats.b.doD) {
                        e2.a(a2);
                    }
                    a.a(aw2, (au)this, "commands.achievement.give.success.all", e2.xU());
                } else if (bl3) {
                    for (net.minecraft.stats.a a3 : Lists.reverse(net.minecraft.stats.b.doD)) {
                        e2.b(a3);
                    }
                    a.a(aw2, (au)this, "commands.achievement.take.success.all", e2.xU());
                }
            } else {
                if (f2 instanceof net.minecraft.stats.a) {
                    net.minecraft.stats.a a4 = (net.minecraft.stats.a)f2;
                    if (bl2) {
                        if (e2.acv().d(a4)) {
                            throw new n("commands.achievement.alreadyHave", e2.xU(), f2.apt());
                        }
                        ArrayList arrayList = Lists.newArrayList();
                        while (a4.dou != null && !e2.acv().d(a4.dou)) {
                            arrayList.add(a4.dou);
                            a4 = a4.dou;
                        }
                        for (net.minecraft.stats.a a5 : Lists.reverse((List)arrayList)) {
                            e2.a(a5);
                        }
                    } else if (bl3) {
                        if (!e2.acv().d(a4)) {
                            throw new n("commands.achievement.dontHave", e2.xU(), f2.apt());
                        }
                        ArrayList arrayList = Lists.newArrayList((Iterator)Iterators.filter(net.minecraft.stats.b.doD.iterator(), (Predicate)new b(this, e2, f2)));
                        ArrayList arrayList2 = Lists.newArrayList((Iterable)arrayList);
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            net.minecraft.stats.a a6;
                            net.minecraft.stats.a a7 = a6 = (net.minecraft.stats.a)iterator.next();
                            boolean bl4 = false;
                            while (a7 != null) {
                                if (a7 == f2) {
                                    bl4 = true;
                                }
                                a7 = a7.dou;
                            }
                            if (bl4) continue;
                            a7 = a6;
                            while (a7 != null) {
                                arrayList2.remove(a6);
                                a7 = a7.dou;
                            }
                        }
                        for (net.minecraft.stats.a a6 : arrayList2) {
                            e2.b(a6);
                        }
                    }
                }
                if (bl2) {
                    e2.a(f2);
                    a.a(aw2, (au)this, "commands.achievement.give.success.one", e2.xU(), f2.apt());
                } else if (bl3) {
                    e2.b(f2);
                    a.a(aw2, (au)this, "commands.achievement.take.success.one", f2.apt(), e2.xU());
                }
            }
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        if (stringArray.length == 1) {
            return a.a(stringArray, "give", "take");
        }
        if (stringArray.length != 2) {
            return stringArray.length == 3 ? a.a(stringArray, MinecraftServer.afs().Sa()) : null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (f f2 : net.minecraft.stats.n.dpC) {
            arrayList.add(f2.dpn);
        }
        return a.a(stringArray, arrayList);
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 2;
    }
}

