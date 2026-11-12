/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ab;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.scoreboard.g;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.ag;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.o;
import net.minecraft.util.b;
import net.minecraft.util.db;
import net.minecraft.world.w;

public class ak
extends a {
    @Override
    public String RX() {
        return "stats";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.stats.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        ab ab2;
        Object object;
        Object object2;
        ad ad2;
        int n2;
        boolean bl2;
        if (stringArray.length < 1) {
            throw new bo("commands.stats.usage", new Object[0]);
        }
        if (stringArray[0].equals("entity")) {
            bl2 = false;
        } else {
            if (!stringArray[0].equals("block")) {
                throw new bo("commands.stats.usage", new Object[0]);
            }
            bl2 = true;
        }
        if (bl2) {
            if (stringArray.length < 5) {
                throw new bo("commands.stats.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (stringArray.length < 3) {
                throw new bo("commands.stats.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        String string = stringArray[n2++];
        if ("set".equals(string)) {
            if (stringArray.length < n2 + 3) {
                if (n2 == 5) {
                    throw new bo("commands.stats.block.set.usage", new Object[0]);
                }
                throw new bo("commands.stats.entity.set.usage", new Object[0]);
            }
        } else {
            if (!"clear".equals(string)) {
                throw new bo("commands.stats.usage", new Object[0]);
            }
            if (stringArray.length < n2 + 1) {
                if (n2 == 5) {
                    throw new bo("commands.stats.block.clear.usage", new Object[0]);
                }
                throw new bo("commands.stats.entity.clear.usage", new Object[0]);
            }
        }
        if ((ad2 = ad.dS(stringArray[n2++])) == null) {
            throw new n("commands.stats.failed", new Object[0]);
        }
        w w2 = aw2.Se();
        if (bl2) {
            object2 = ak.a(aw2, stringArray, 1, false);
            object = w2.K((b)object2);
            if (object == null) {
                throw new n("commands.stats.noCompatibleBlock", ((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx());
            }
            if (object instanceof o) {
                ab2 = ((o)object).SC();
            } else {
                if (!(object instanceof ag)) {
                    throw new n("commands.stats.noCompatibleBlock", ((db)object2).wt(), ((db)object2).wu(), ((db)object2).wx());
                }
                ab2 = ((ag)object).aqQ();
            }
        } else {
            object2 = ak.b(aw2, stringArray[1]);
            ab2 = ((c)object2).Uu();
        }
        if ("set".equals(string)) {
            object2 = stringArray[n2++];
            object = stringArray[n2];
            if (((String)object2).length() == 0 || ((String)object).length() == 0) {
                throw new n("commands.stats.failed", new Object[0]);
            }
            ab.a(ab2, ad2, (String)object2, (String)object);
            ak.a(aw2, (au)this, "commands.stats.success", ad2.Sn(), object, object2);
        } else if ("clear".equals(string)) {
            ab.a(ab2, ad2, null, null);
            ak.a(aw2, (au)this, "commands.stats.cleared", ad2.Sn());
        }
        if (bl2) {
            object2 = ak.a(aw2, stringArray, 1, false);
            object = w2.K((b)object2);
            ((d)object).Lw();
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? ak.a(stringArray, "entity", "block") : (stringArray.length == 2 && stringArray[0].equals("entity") ? ak.a(stringArray, this.Ss()) : (stringArray.length >= 2 && stringArray.length <= 4 && stringArray[0].equals("block") ? ak.a(stringArray, 1, b2) : (!(stringArray.length == 3 && stringArray[0].equals("entity") || stringArray.length == 5 && stringArray[0].equals("block")) ? (!(stringArray.length == 4 && stringArray[0].equals("entity") || stringArray.length == 6 && stringArray[0].equals("block")) ? (!(stringArray.length == 6 && stringArray[0].equals("entity") || stringArray.length == 8 && stringArray[0].equals("block")) ? null : ak.a(stringArray, this.St())) : ak.a(stringArray, ad.So())) : ak.a(stringArray, "set", "clear"))));
    }

    protected String[] Ss() {
        return MinecraftServer.afs().Sa();
    }

    protected List<String> St() {
        Collection<g> collection = MinecraftServer.afs().ha(0).SD().akA();
        ArrayList arrayList = Lists.newArrayList();
        for (g g2 : collection) {
            if (g2.akp().akh()) continue;
            arrayList.add(g2.getName());
        }
        return arrayList;
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return stringArray.length > 0 && stringArray[0].equals("entity") && n2 == 1;
    }
}

