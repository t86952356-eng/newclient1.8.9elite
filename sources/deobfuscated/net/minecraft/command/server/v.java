/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.command.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bn;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.b;
import net.minecraft.nbt.g;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.i;
import net.minecraft.scoreboard.m;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.an;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class v
extends a {
    @Override
    public String RX() {
        return "scoreboard";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.scoreboard.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (!this.b(aw2, stringArray)) {
            if (stringArray.length < 1) {
                throw new bo("commands.scoreboard.usage", new Object[0]);
            }
            if (stringArray[0].equalsIgnoreCase("objectives")) {
                if (stringArray.length == 1) {
                    throw new bo("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    this.f(aw2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length < 4) {
                        throw new bo("commands.scoreboard.objectives.add.usage", new Object[0]);
                    }
                    this.b(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length != 3) {
                        throw new bo("commands.scoreboard.objectives.remove.usage", new Object[0]);
                    }
                    this.l(aw2, stringArray[2]);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("setdisplay")) {
                        throw new bo("commands.scoreboard.objectives.usage", new Object[0]);
                    }
                    if (stringArray.length != 3 && stringArray.length != 4) {
                        throw new bo("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                    }
                    this.j(aw2, stringArray, 2);
                }
            } else if (stringArray[0].equalsIgnoreCase("players")) {
                if (stringArray.length == 1) {
                    throw new bo("commands.scoreboard.players.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    if (stringArray.length > 3) {
                        throw new bo("commands.scoreboard.players.list.usage", new Object[0]);
                    }
                    this.k(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length < 5) {
                        throw new bo("commands.scoreboard.players.add.usage", new Object[0]);
                    }
                    this.l(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length < 5) {
                        throw new bo("commands.scoreboard.players.remove.usage", new Object[0]);
                    }
                    this.l(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("set")) {
                    if (stringArray.length < 5) {
                        throw new bo("commands.scoreboard.players.set.usage", new Object[0]);
                    }
                    this.l(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("reset")) {
                    if (stringArray.length != 3 && stringArray.length != 4) {
                        throw new bo("commands.scoreboard.players.reset.usage", new Object[0]);
                    }
                    this.m(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("enable")) {
                    if (stringArray.length != 4) {
                        throw new bo("commands.scoreboard.players.enable.usage", new Object[0]);
                    }
                    this.n(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("test")) {
                    if (stringArray.length != 5 && stringArray.length != 6) {
                        throw new bo("commands.scoreboard.players.test.usage", new Object[0]);
                    }
                    this.o(aw2, stringArray, 2);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("operation")) {
                        throw new bo("commands.scoreboard.players.usage", new Object[0]);
                    }
                    if (stringArray.length != 7) {
                        throw new bo("commands.scoreboard.players.operation.usage", new Object[0]);
                    }
                    this.p(aw2, stringArray, 2);
                }
            } else {
                if (!stringArray[0].equalsIgnoreCase("teams")) {
                    throw new bo("commands.scoreboard.usage", new Object[0]);
                }
                if (stringArray.length == 1) {
                    throw new bo("commands.scoreboard.teams.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    if (stringArray.length > 3) {
                        throw new bo("commands.scoreboard.teams.list.usage", new Object[0]);
                    }
                    this.f(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length < 3) {
                        throw new bo("commands.scoreboard.teams.add.usage", new Object[0]);
                    }
                    this.c(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length != 3) {
                        throw new bo("commands.scoreboard.teams.remove.usage", new Object[0]);
                    }
                    this.e(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("empty")) {
                    if (stringArray.length != 3) {
                        throw new bo("commands.scoreboard.teams.empty.usage", new Object[0]);
                    }
                    this.i(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("join")) {
                    if (!(stringArray.length >= 4 || stringArray.length == 3 && aw2 instanceof net.minecraft.entity.player.a)) {
                        throw new bo("commands.scoreboard.teams.join.usage", new Object[0]);
                    }
                    this.g(aw2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("leave")) {
                    if (stringArray.length < 3 && !(aw2 instanceof net.minecraft.entity.player.a)) {
                        throw new bo("commands.scoreboard.teams.leave.usage", new Object[0]);
                    }
                    this.h(aw2, stringArray, 2);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("option")) {
                        throw new bo("commands.scoreboard.teams.usage", new Object[0]);
                    }
                    if (stringArray.length != 4 && stringArray.length != 5) {
                        throw new bo("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    this.d(aw2, stringArray, 2);
                }
            }
        }
    }

    private boolean b(aw aw2, String[] stringArray) {
        int n2 = -1;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!this.d(stringArray, i2) || !"*".equals(stringArray[i2])) continue;
            if (n2 >= 0) {
                throw new n("commands.scoreboard.noMultiWildcard", new Object[0]);
            }
            n2 = i2;
        }
        if (n2 < 0) {
            return false;
        }
        ArrayList arrayList = Lists.newArrayList(this.SD().akB());
        String string = stringArray[n2];
        ArrayList arrayList2 = Lists.newArrayList();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string2;
            stringArray[n2] = string2 = (String)iterator.next();
            try {
                this.a(aw2, stringArray);
                arrayList2.add(string2);
            }
            catch (n n3) {
                t t2 = new t(n3.getMessage(), n3.Sc());
                t2.arp().b(an.dvX);
                aw2.a(t2);
            }
        }
        stringArray[n2] = string;
        aw2.a(ad.coh, arrayList2.size());
        if (arrayList2.size() == 0) {
            throw new bo("commands.scoreboard.allMatchesFailed", new Object[0]);
        }
        return true;
    }

    protected i SD() {
        return MinecraftServer.afs().ha(0).SD();
    }

    protected net.minecraft.scoreboard.g i(String string, boolean bl2) {
        i i2 = this.SD();
        net.minecraft.scoreboard.g g2 = i2.fo(string);
        if (g2 == null) {
            throw new n("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl2 && g2.akp().akh()) {
            throw new n("commands.scoreboard.objectiveReadOnly", string);
        }
        return g2;
    }

    protected h dX(String string) {
        i i2 = this.SD();
        h h2 = i2.dX(string);
        if (h2 == null) {
            throw new n("commands.scoreboard.teamNotFound", string);
        }
        return h2;
    }

    protected void b(aw aw2, String[] stringArray, int n2) {
        String string = stringArray[n2++];
        String string2 = stringArray[n2++];
        i i2 = this.SD();
        net.minecraft.scoreboard.b b2 = net.minecraft.scoreboard.b.djp.get(string2);
        if (b2 == null) {
            throw new bo("commands.scoreboard.objectives.add.wrongType", string2);
        }
        if (i2.fo(string) != null) {
            throw new n("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new bn("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new bo("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (stringArray.length > n2) {
            String string3 = v.a(aw2, stringArray, n2).arq();
            if (string3.length() > 32) {
                throw new bn("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.length() > 0) {
                i2.a(string, b2).ap(string3);
            } else {
                i2.a(string, b2);
            }
        } else {
            i2.a(string, b2);
        }
        v.a(aw2, (au)this, "commands.scoreboard.objectives.add.success", string);
    }

    protected void c(aw aw2, String[] stringArray, int n2) {
        String string = stringArray[n2++];
        i i2 = this.SD();
        if (i2.dX(string) != null) {
            throw new n("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new bn("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new bo("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (stringArray.length > n2) {
            String string2 = v.a(aw2, stringArray, n2).arq();
            if (string2.length() > 32) {
                throw new bn("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.length() > 0) {
                i2.fq(string).fl(string2);
            } else {
                i2.fq(string);
            }
        } else {
            i2.fq(string);
        }
        v.a(aw2, (au)this, "commands.scoreboard.teams.add.success", string);
    }

    protected void d(aw aw2, String[] stringArray, int n2) {
        h h2;
        if ((h2 = this.dX(stringArray[n2++])) != null) {
            String string;
            if (!((string = stringArray[n2++].toLowerCase()).equalsIgnoreCase("color") || string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles") || string.equalsIgnoreCase("nametagVisibility") || string.equalsIgnoreCase("deathMessageVisibility"))) {
                throw new bo("commands.scoreboard.teams.option.usage", new Object[0]);
            }
            if (stringArray.length == 4) {
                if (string.equalsIgnoreCase("color")) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.c(an.i(true, false)));
                }
                if (!string.equalsIgnoreCase("friendlyfire") && !string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                    if (!string.equalsIgnoreCase("nametagVisibility") && !string.equalsIgnoreCase("deathMessageVisibility")) {
                        throw new bo("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.b(m.akK()));
                }
                throw new bo("commands.scoreboard.teams.option.noValue", string, v.c(Arrays.asList("true", "false")));
            }
            String string2 = stringArray[n2];
            if (string.equalsIgnoreCase("color")) {
                an an2 = an.gf(string2);
                if (an2 == null || an2.asw()) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.c(an.i(true, false)));
                }
                h2.a(an2);
                h2.fm(an2.toString());
                h2.fn(an.dwh.toString());
            } else if (string.equalsIgnoreCase("friendlyfire")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.c(Arrays.asList("true", "false")));
                }
                h2.cb(string2.equalsIgnoreCase("true"));
            } else if (string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.c(Arrays.asList("true", "false")));
                }
                h2.cc(string2.equalsIgnoreCase("true"));
            } else if (string.equalsIgnoreCase("nametagVisibility")) {
                m m2 = m.fv(string2);
                if (m2 == null) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.b(m.akK()));
                }
                h2.a(m2);
            } else if (string.equalsIgnoreCase("deathMessageVisibility")) {
                m m3 = m.fv(string2);
                if (m3 == null) {
                    throw new bo("commands.scoreboard.teams.option.noValue", string, v.b(m.akK()));
                }
                h2.b(m3);
            }
            v.a(aw2, (au)this, "commands.scoreboard.teams.option.success", string, h2.akq(), string2);
        }
    }

    protected void e(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        h h2 = this.dX(stringArray[n2]);
        if (h2 != null) {
            i2.a(h2);
            v.a(aw2, (au)this, "commands.scoreboard.teams.remove.success", h2.akq());
        }
    }

    protected void f(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        if (stringArray.length > n2) {
            h h2 = this.dX(stringArray[n2]);
            if (h2 == null) {
                return;
            }
            Collection<String> collection = h2.akr();
            aw2.a(ad.coj, collection.size());
            if (collection.size() <= 0) {
                throw new n("commands.scoreboard.teams.list.player.empty", h2.akq());
            }
            t t2 = new t("commands.scoreboard.teams.list.player.count", collection.size(), h2.akq());
            t2.arp().b(an.dvN);
            aw2.a(t2);
            aw2.a(new s(v.b(collection.toArray())));
        } else {
            Collection<h> collection = i2.akE();
            aw2.a(ad.coj, collection.size());
            if (collection.size() <= 0) {
                throw new n("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            t t3 = new t("commands.scoreboard.teams.list.count", collection.size());
            t3.arp().b(an.dvN);
            aw2.a(t3);
            for (h h3 : collection) {
                aw2.a(new t("commands.scoreboard.teams.list.entry", h3.akq(), h3.ahW(), h3.akr().size()));
            }
        }
    }

    protected void g(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        String string = stringArray[n2++];
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        if (aw2 instanceof net.minecraft.entity.player.a && n2 == stringArray.length) {
            String string2 = v.b(aw2).xU();
            if (i2.T(string2, string)) {
                hashSet.add(string2);
            } else {
                hashSet2.add(string2);
            }
        } else {
            while (n2 < stringArray.length) {
                String string3;
                if ((string3 = stringArray[n2++]).startsWith("@")) {
                    for (c c2 : v.c(aw2, string3)) {
                        String string4 = v.e(aw2, c2.Ul().toString());
                        if (i2.T(string4, string)) {
                            hashSet.add(string4);
                            continue;
                        }
                        hashSet2.add(string4);
                    }
                    continue;
                }
                String string5 = v.e(aw2, string3);
                if (i2.T(string5, string)) {
                    hashSet.add(string5);
                    continue;
                }
                hashSet2.add(string5);
            }
        }
        if (!hashSet.isEmpty()) {
            aw2.a(ad.coh, hashSet.size());
            v.a(aw2, (au)this, "commands.scoreboard.teams.join.success", hashSet.size(), string, v.b(hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new n("commands.scoreboard.teams.join.failure", hashSet2.size(), string, v.b(hashSet2.toArray(new String[hashSet2.size()])));
        }
    }

    protected void h(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        if (aw2 instanceof net.minecraft.entity.player.a && n2 == stringArray.length) {
            String string = v.b(aw2).xU();
            if (i2.fr(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n2 < stringArray.length) {
                String string;
                if ((string = stringArray[n2++]).startsWith("@")) {
                    for (c c2 : v.c(aw2, string)) {
                        String string2 = v.e(aw2, c2.Ul().toString());
                        if (i2.fr(string2)) {
                            hashSet.add(string2);
                            continue;
                        }
                        hashSet2.add(string2);
                    }
                    continue;
                }
                String string3 = v.e(aw2, string);
                if (i2.fr(string3)) {
                    hashSet.add(string3);
                    continue;
                }
                hashSet2.add(string3);
            }
        }
        if (!hashSet.isEmpty()) {
            aw2.a(ad.coh, hashSet.size());
            v.a(aw2, (au)this, "commands.scoreboard.teams.leave.success", hashSet.size(), v.b(hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new n("commands.scoreboard.teams.leave.failure", hashSet2.size(), v.b(hashSet2.toArray(new String[hashSet2.size()])));
        }
    }

    protected void i(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        h h2 = this.dX(stringArray[n2]);
        if (h2 != null) {
            ArrayList arrayList = Lists.newArrayList(h2.akr());
            aw2.a(ad.coh, arrayList.size());
            if (arrayList.isEmpty()) {
                throw new n("commands.scoreboard.teams.empty.alreadyEmpty", h2.akq());
            }
            for (String string : arrayList) {
                i2.a(string, h2);
            }
            v.a(aw2, (au)this, "commands.scoreboard.teams.empty.success", arrayList.size(), h2.akq());
        }
    }

    protected void l(aw aw2, String string) {
        i i2 = this.SD();
        net.minecraft.scoreboard.g g2 = this.i(string, false);
        i2.c(g2);
        v.a(aw2, (au)this, "commands.scoreboard.objectives.remove.success", string);
    }

    protected void f(aw aw2) {
        i i2 = this.SD();
        Collection<net.minecraft.scoreboard.g> collection = i2.akA();
        if (collection.size() <= 0) {
            throw new n("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        t t2 = new t("commands.scoreboard.objectives.list.count", collection.size());
        t2.arp().b(an.dvN);
        aw2.a(t2);
        for (net.minecraft.scoreboard.g g2 : collection) {
            aw2.a(new t("commands.scoreboard.objectives.list.entry", g2.getName(), g2.getDisplayName(), g2.akp().getName()));
        }
    }

    protected void j(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        String string = stringArray[n2++];
        int n3 = i.fu(string);
        net.minecraft.scoreboard.g g2 = null;
        if (stringArray.length == 4) {
            g2 = this.i(stringArray[n2], false);
        }
        if (n3 < 0) {
            throw new n("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        i2.a(n3, g2);
        if (g2 != null) {
            v.a(aw2, (au)this, "commands.scoreboard.objectives.setdisplay.successSet", i.gZ(n3), g2.getName());
        } else {
            v.a(aw2, (au)this, "commands.scoreboard.objectives.setdisplay.successCleared", i.gZ(n3));
        }
    }

    protected void k(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        if (stringArray.length > n2) {
            String string = v.e(aw2, stringArray[n2]);
            Map<net.minecraft.scoreboard.g, d> map = i2.fp(string);
            aw2.a(ad.coj, map.size());
            if (map.size() <= 0) {
                throw new n("commands.scoreboard.players.list.player.empty", string);
            }
            t t2 = new t("commands.scoreboard.players.list.player.count", map.size(), string);
            t2.arp().b(an.dvN);
            aw2.a(t2);
            for (d d2 : map.values()) {
                aw2.a(new t("commands.scoreboard.players.list.player.entry", d2.akm(), d2.akn().getDisplayName(), d2.akn().getName()));
            }
        } else {
            Collection<String> collection = i2.akB();
            aw2.a(ad.coj, collection.size());
            if (collection.size() <= 0) {
                throw new n("commands.scoreboard.players.list.empty", new Object[0]);
            }
            t t3 = new t("commands.scoreboard.players.list.count", collection.size());
            t3.arp().b(an.dvN);
            aw2.a(t3);
            aw2.a(new s(v.b(collection.toArray())));
        }
    }

    protected void l(aw aw2, String[] stringArray, int n2) {
        Object object;
        Object object2;
        int n3;
        String string;
        String string2 = stringArray[n2 - 1];
        int n4 = n2;
        if ((string = v.e(aw2, stringArray[n2++])).length() > 40) {
            throw new bn("commands.scoreboard.players.name.tooLong", string, 40);
        }
        net.minecraft.scoreboard.g g2 = this.i(stringArray[n2++], true);
        int n5 = n3 = string2.equalsIgnoreCase("set") ? v.dM(stringArray[n2++]) : v.x(stringArray[n2++], 0);
        if (stringArray.length > n2) {
            object2 = v.b(aw2, stringArray[n4]);
            try {
                object = b.ez(v.c(stringArray, n2));
                net.minecraft.nbt.n n6 = new net.minecraft.nbt.n();
                ((c)object2).b(n6);
                if (!aa.a((g)object, n6, true)) {
                    throw new n("commands.scoreboard.players.set.tagMismatch", string);
                }
            }
            catch (net.minecraft.nbt.i i2) {
                throw new n("commands.scoreboard.players.set.tagError", i2.getMessage());
            }
        }
        object2 = this.SD();
        object = ((i)object2).b(string, g2);
        if (string2.equalsIgnoreCase("set")) {
            ((d)object).gW(n3);
        } else if (string2.equalsIgnoreCase("add")) {
            ((d)object).gU(n3);
        } else {
            ((d)object).gV(n3);
        }
        v.a(aw2, (au)this, "commands.scoreboard.players.set.success", g2.getName(), string, ((d)object).akm());
    }

    protected void m(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        String string = v.e(aw2, stringArray[n2++]);
        if (stringArray.length > n2) {
            net.minecraft.scoreboard.g g2 = this.i(stringArray[n2++], false);
            i2.c(string, g2);
            v.a(aw2, (au)this, "commands.scoreboard.players.resetscore.success", g2.getName(), string);
        } else {
            i2.c(string, null);
            v.a(aw2, (au)this, "commands.scoreboard.players.reset.success", string);
        }
    }

    protected void n(aw aw2, String[] stringArray, int n2) {
        String string;
        i i2 = this.SD();
        if ((string = v.d(aw2, stringArray[n2++])).length() > 40) {
            throw new bn("commands.scoreboard.players.name.tooLong", string, 40);
        }
        net.minecraft.scoreboard.g g2 = this.i(stringArray[n2], false);
        if (g2.akp() != net.minecraft.scoreboard.b.djr) {
            throw new n("commands.scoreboard.players.enable.noTrigger", g2.getName());
        }
        d d2 = i2.b(string, g2);
        d2.ca(false);
        v.a(aw2, (au)this, "commands.scoreboard.players.enable.success", g2.getName(), string);
    }

    protected void o(aw aw2, String[] stringArray, int n2) {
        net.minecraft.scoreboard.g g2;
        String string;
        i i2 = this.SD();
        if ((string = v.e(aw2, stringArray[n2++])).length() > 40) {
            throw new bn("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (!i2.a(string, g2 = this.i(stringArray[n2++], false))) {
            throw new n("commands.scoreboard.players.test.notFound", g2.getName(), string);
        }
        int n3 = stringArray[n2].equals("*") ? Integer.MIN_VALUE : v.dM(stringArray[n2]);
        int n4 = ++n2 < stringArray.length && !stringArray[n2].equals("*") ? v.x(stringArray[n2], n3) : Integer.MAX_VALUE;
        d d2 = i2.b(string, g2);
        if (d2.akm() < n3 || d2.akm() > n4) {
            throw new n("commands.scoreboard.players.test.failed", d2.akm(), n3, n4);
        }
        v.a(aw2, (au)this, "commands.scoreboard.players.test.success", d2.akm(), n3, n4);
    }

    protected void p(aw aw2, String[] stringArray, int n2) {
        i i2 = this.SD();
        String string = v.e(aw2, stringArray[n2++]);
        net.minecraft.scoreboard.g g2 = this.i(stringArray[n2++], true);
        String string2 = stringArray[n2++];
        String string3 = v.e(aw2, stringArray[n2++]);
        net.minecraft.scoreboard.g g3 = this.i(stringArray[n2], false);
        if (string.length() > 40) {
            throw new bn("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (string3.length() > 40) {
            throw new bn("commands.scoreboard.players.name.tooLong", string3, 40);
        }
        d d2 = i2.b(string, g2);
        if (!i2.a(string3, g3)) {
            throw new n("commands.scoreboard.players.operation.notFound", g3.getName(), string3);
        }
        d d3 = i2.b(string3, g3);
        if (string2.equals("+=")) {
            d2.gW(d2.akm() + d3.akm());
        } else if (string2.equals("-=")) {
            d2.gW(d2.akm() - d3.akm());
        } else if (string2.equals("*=")) {
            d2.gW(d2.akm() * d3.akm());
        } else if (string2.equals("/=")) {
            if (d3.akm() != 0) {
                d2.gW(d2.akm() / d3.akm());
            }
        } else if (string2.equals("%=")) {
            if (d3.akm() != 0) {
                d2.gW(d2.akm() % d3.akm());
            }
        } else if (string2.equals("=")) {
            d2.gW(d3.akm());
        } else if (string2.equals("<")) {
            d2.gW(Math.min(d2.akm(), d3.akm()));
        } else if (string2.equals(">")) {
            d2.gW(Math.max(d2.akm(), d3.akm()));
        } else {
            if (!string2.equals("><")) {
                throw new n("commands.scoreboard.players.operation.invalidOperation", string2);
            }
            int n3 = d2.akm();
            d2.gW(d3.akm());
            d3.gW(n3);
        }
        v.a(aw2, (au)this, "commands.scoreboard.players.operation.success", new Object[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        if (stringArray.length == 1) {
            return v.a(stringArray, "objectives", "players", "teams");
        }
        if (stringArray[0].equalsIgnoreCase("objectives")) {
            if (stringArray.length == 2) {
                return v.a(stringArray, "list", "add", "remove", "setdisplay");
            }
            if (stringArray[1].equalsIgnoreCase("add")) {
                if (stringArray.length == 4) {
                    Set<String> set = net.minecraft.scoreboard.b.djp.keySet();
                    return v.a(stringArray, set);
                }
            } else if (stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length == 3) {
                    return v.a(stringArray, this.aB(false));
                }
            } else if (stringArray[1].equalsIgnoreCase("setdisplay")) {
                if (stringArray.length == 3) {
                    return v.a(stringArray, i.akF());
                }
                if (stringArray.length == 4) {
                    return v.a(stringArray, this.aB(false));
                }
            }
        } else if (stringArray[0].equalsIgnoreCase("players")) {
            if (stringArray.length == 2) {
                return v.a(stringArray, "set", "add", "remove", "reset", "list", "enable", "test", "operation");
            }
            if (!(stringArray[1].equalsIgnoreCase("set") || stringArray[1].equalsIgnoreCase("add") || stringArray[1].equalsIgnoreCase("remove") || stringArray[1].equalsIgnoreCase("reset"))) {
                if (stringArray[1].equalsIgnoreCase("enable")) {
                    if (stringArray.length == 3) {
                        return v.a(stringArray, MinecraftServer.afs().Sa());
                    }
                    if (stringArray.length == 4) {
                        return v.a(stringArray, this.SE());
                    }
                } else if (!stringArray[1].equalsIgnoreCase("list") && !stringArray[1].equalsIgnoreCase("test")) {
                    if (stringArray[1].equalsIgnoreCase("operation")) {
                        if (stringArray.length == 3) {
                            return v.a(stringArray, this.SD().akB());
                        }
                        if (stringArray.length == 4) {
                            return v.a(stringArray, this.aB(true));
                        }
                        if (stringArray.length == 5) {
                            return v.a(stringArray, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                        }
                        if (stringArray.length == 6) {
                            return v.a(stringArray, MinecraftServer.afs().Sa());
                        }
                        if (stringArray.length == 7) {
                            return v.a(stringArray, this.aB(false));
                        }
                    }
                } else {
                    if (stringArray.length == 3) {
                        return v.a(stringArray, this.SD().akB());
                    }
                    if (stringArray.length == 4 && stringArray[1].equalsIgnoreCase("test")) {
                        return v.a(stringArray, this.aB(false));
                    }
                }
            } else {
                if (stringArray.length == 3) {
                    return v.a(stringArray, MinecraftServer.afs().Sa());
                }
                if (stringArray.length == 4) {
                    return v.a(stringArray, this.aB(true));
                }
            }
        } else if (stringArray[0].equalsIgnoreCase("teams")) {
            if (stringArray.length == 2) {
                return v.a(stringArray, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (stringArray[1].equalsIgnoreCase("join")) {
                if (stringArray.length == 3) {
                    return v.a(stringArray, this.SD().akD());
                }
                if (stringArray.length >= 4) {
                    return v.a(stringArray, MinecraftServer.afs().Sa());
                }
            } else {
                if (stringArray[1].equalsIgnoreCase("leave")) {
                    return v.a(stringArray, MinecraftServer.afs().Sa());
                }
                if (!(stringArray[1].equalsIgnoreCase("empty") || stringArray[1].equalsIgnoreCase("list") || stringArray[1].equalsIgnoreCase("remove"))) {
                    if (stringArray[1].equalsIgnoreCase("option")) {
                        if (stringArray.length == 3) {
                            return v.a(stringArray, this.SD().akD());
                        }
                        if (stringArray.length == 4) {
                            return v.a(stringArray, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility");
                        }
                        if (stringArray.length == 5) {
                            if (stringArray[3].equalsIgnoreCase("color")) {
                                return v.a(stringArray, an.i(true, false));
                            }
                            if (stringArray[3].equalsIgnoreCase("nametagVisibility") || stringArray[3].equalsIgnoreCase("deathMessageVisibility")) {
                                return v.a(stringArray, m.akK());
                            }
                            if (stringArray[3].equalsIgnoreCase("friendlyfire") || stringArray[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                                return v.a(stringArray, "true", "false");
                            }
                        }
                    }
                } else if (stringArray.length == 3) {
                    return v.a(stringArray, this.SD().akD());
                }
            }
        }
        return null;
    }

    protected List<String> aB(boolean bl2) {
        Collection<net.minecraft.scoreboard.g> collection = this.SD().akA();
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.scoreboard.g g2 : collection) {
            if (bl2 && g2.akp().akh()) continue;
            arrayList.add(g2.getName());
        }
        return arrayList;
    }

    protected List<String> SE() {
        Collection<net.minecraft.scoreboard.g> collection = this.SD().akA();
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.scoreboard.g g2 : collection) {
            if (g2.akp() != net.minecraft.scoreboard.b.djr) continue;
            arrayList.add(g2.getName());
        }
        return arrayList;
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return !stringArray[0].equalsIgnoreCase("players") ? stringArray[0].equalsIgnoreCase("teams") && n2 == 2 : (stringArray.length > 1 && stringArray[1].equalsIgnoreCase("operation") ? n2 == 2 || n2 == 5 : n2 == 2);
    }
}

