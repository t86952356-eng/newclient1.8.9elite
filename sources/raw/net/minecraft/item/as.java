/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.e;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.item.cr;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.nbt.z;
import net.minecraft.network.play.server.az;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.ct;
import net.minecraft.util.m;
import net.minecraft.util.s;
import net.minecraft.world.w;

public class as
extends d {
    public as() {
        this.fU(1);
    }

    public static boolean r(n n2) {
        if (!cr.v(n2)) {
            return false;
        }
        if (!n2.C("title", 8)) {
            return false;
        }
        String string = n2.eK("title");
        return string != null && string.length() <= 32 && n2.C("author", 8);
    }

    public static int aC(co co2) {
        return co2.aek().eG("generation");
    }

    @Override
    public String at(co co2) {
        n n2;
        String string;
        if (co2.aej() && !ct.cU(string = (n2 = co2.aek()).eK("title"))) {
            return string;
        }
        return super.at(co2);
    }

    @Override
    public void a(co co2, a a2, List<String> list, boolean bl2) {
        if (co2.aej()) {
            n n2 = co2.aek();
            String string = n2.eK("author");
            if (!ct.cU(string)) {
                list.add(String.valueOf((Object)an.dvS) + net.minecraft.util.cr.c("book.byAuthor", string));
            }
            list.add(String.valueOf((Object)an.dvS) + net.minecraft.util.cr.gm("book.generation." + n2.eG("generation")));
        }
    }

    @Override
    public co a(co co2, w w2, a a2) {
        if (!w2.dDw) {
            this.a(co2, a2);
        }
        a2.G(co2);
        a2.a(net.minecraft.stats.n.dqE[d.p(this)]);
        return co2;
    }

    private void a(co co2, a a2) {
        n n2;
        if (co2 != null && co2.aek() != null && !(n2 = co2.aek()).eO("resolved")) {
            n2.o("resolved", true);
            if (as.r(n2)) {
                v v2 = n2.D("pages", 8);
                for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                    ba ba2;
                    String string = v2.gm(i2);
                    try {
                        ba2 = bb.gi(string);
                        ba2 = m.a(a2, ba2, a2);
                    }
                    catch (Exception exception) {
                        ba2 = new s(string);
                    }
                    v2.a(i2, new z(bb.q(ba2)));
                }
                n2.b("pages", v2);
                if (a2 instanceof e && a2.abO() == co2) {
                    ak ak2 = a2.cHY.b(a2.cHV, a2.cHV.cJE);
                    ((e)a2).cIX.B(new az(0, ak2.cUk, co2));
                }
            }
        }
    }

    @Override
    public boolean au(co co2) {
        return true;
    }
}

