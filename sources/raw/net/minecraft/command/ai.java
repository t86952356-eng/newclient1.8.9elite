/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.aj;
import net.minecraft.command.as;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ay;
import net.minecraft.command.az;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.scoreboard.l;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.t;
import net.minecraft.world.w;

public class ai
extends a {
    @Override
    public String RX() {
        return "spreadplayers";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 6) {
            throw new bo("commands.spreadplayers.usage", new Object[0]);
        }
        int n2 = 0;
        b b2 = aw2.yl();
        double d2 = ai.b(b2.wt(), stringArray[n2++], true);
        double d3 = ai.b(b2.wx(), stringArray[n2++], true);
        double d4 = ai.a(stringArray[n2++], 0.0);
        double d5 = ai.a(stringArray[n2++], d4 + 1.0);
        boolean bl2 = ai.dP(stringArray[n2++]);
        ArrayList arrayList = Lists.newArrayList();
        while (n2 < stringArray.length) {
            Object object;
            String string;
            if (az.dU(string = stringArray[n2++])) {
                object = az.c(aw2, string, c.class);
                if (object.size() == 0) {
                    throw new as();
                }
                arrayList.addAll(object);
                continue;
            }
            object = MinecraftServer.afs().alE().fG(string);
            if (object == null) {
                throw new ay();
            }
            arrayList.add(object);
        }
        aw2.a(ad.coh, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new as();
        }
        aw2.a(new t("commands.spreadplayers.spreading." + (bl2 ? "teams" : "players"), arrayList.size(), d5, d2, d3, d4));
        this.a(aw2, arrayList, new aj(d2, d3), d4, d5, ((c)arrayList.get((int)0)).baU, bl2);
    }

    private void a(aw aw2, List<c> list, aj aj2, double d2, double d3, w w2, boolean bl2) {
        Random random = new Random();
        double d4 = aj2.conn - d3;
        double d5 = aj2.coo - d3;
        double d6 = aj2.conn + d3;
        double d7 = aj2.coo + d3;
        aj[] ajArray = this.a(random, bl2 ? this.A(list) : list.size(), d4, d5, d6, d7);
        int n2 = this.a(aj2, d2, w2, random, d4, d5, d6, d7, ajArray, bl2);
        double d8 = this.a(list, w2, ajArray, bl2);
        ai.a(aw2, (au)this, "commands.spreadplayers.success." + (bl2 ? "teams" : "players"), ajArray.length, aj2.conn, aj2.coo);
        if (ajArray.length > 1) {
            aw2.a(new t("commands.spreadplayers.info." + (bl2 ? "teams" : "players"), String.format("%.2f", d8), n2));
        }
    }

    private int A(List<c> list) {
        HashSet hashSet = Sets.newHashSet();
        for (c c2 : list) {
            if (c2 instanceof net.minecraft.entity.player.a) {
                hashSet.add(((net.minecraft.entity.player.a)c2).Vw());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int a(aj aj2, double d2, w w2, Random random, double d3, double d4, double d5, double d6, aj[] ajArray, boolean bl2) {
        int n2;
        boolean bl3 = true;
        double d7 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl3; ++n2) {
            bl3 = false;
            d7 = 3.4028234663852886E38;
            for (int i2 = 0; i2 < ajArray.length; ++i2) {
                aj aj3 = ajArray[i2];
                int n3 = 0;
                aj aj4 = new aj();
                for (int i3 = 0; i3 < ajArray.length; ++i3) {
                    if (i2 == i3) continue;
                    aj aj5 = ajArray[i3];
                    double d8 = aj3.a(aj5);
                    d7 = Math.min(d8, d7);
                    if (!(d8 < d2)) continue;
                    ++n3;
                    aj4.conn += aj5.conn - aj3.conn;
                    aj4.coo += aj5.coo - aj3.coo;
                }
                if (n3 > 0) {
                    aj4.conn /= (double)n3;
                    aj4.coo /= (double)n3;
                    double d9 = aj4.Sr();
                    if (d9 > 0.0) {
                        aj4.Sq();
                        aj3.b(aj4);
                    } else {
                        aj3.a(random, d3, d4, d5, d6);
                    }
                    bl3 = true;
                }
                if (!aj3.j(d3, d4, d5, d6)) continue;
                bl3 = true;
            }
            if (bl3) continue;
            for (aj aj4 : ajArray) {
                if (aj4.g(w2)) continue;
                aj4.a(random, d3, d4, d5, d6);
                bl3 = true;
            }
        }
        if (n2 >= 10000) {
            throw new n("commands.spreadplayers.failure." + (bl2 ? "teams" : "players"), ajArray.length, aj2.conn, aj2.coo, String.format("%.2f", d7));
        }
        return n2;
    }

    private double a(List<c> list, w w2, aj[] ajArray, boolean bl2) {
        double d2 = 0.0;
        int n2 = 0;
        HashMap hashMap = Maps.newHashMap();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            aj aj2;
            c c2 = list.get(i2);
            if (bl2) {
                l l2;
                l l3 = l2 = c2 instanceof net.minecraft.entity.player.a ? ((net.minecraft.entity.player.a)c2).Vw() : null;
                if (!hashMap.containsKey(l2)) {
                    hashMap.put(l2, ajArray[n2++]);
                }
                aj2 = (aj)hashMap.get(l2);
            } else {
                aj2 = ajArray[n2++];
            }
            c2.Q((float)bt.aF(aj2.conn) + 0.5f, aj2.f(w2), (double)bt.aF(aj2.coo) + 0.5);
            double d3 = Double.MAX_VALUE;
            for (int i3 = 0; i3 < ajArray.length; ++i3) {
                if (aj2 == ajArray[i3]) continue;
                double d4 = aj2.a(ajArray[i3]);
                d3 = Math.min(d4, d3);
            }
            d2 += d3;
        }
        return d2 /= (double)list.size();
    }

    private aj[] a(Random random, int n2, double d2, double d3, double d4, double d5) {
        aj[] ajArray = new aj[n2];
        for (int i2 = 0; i2 < ajArray.length; ++i2) {
            aj aj2 = new aj();
            aj2.a(random, d2, d3, d4, d5);
            ajArray[i2] = aj2;
        }
        return ajArray;
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length >= 1 && stringArray.length <= 2 ? ai.b(stringArray, 0, b2) : null;
    }
}

