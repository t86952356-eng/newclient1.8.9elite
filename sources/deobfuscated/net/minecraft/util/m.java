/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.List;
import net.minecraft.command.as;
import net.minecraft.command.aw;
import net.minecraft.command.az;
import net.minecraft.entity.c;
import net.minecraft.util.ba;
import net.minecraft.util.n;
import net.minecraft.util.o;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.util.v;

public class m {
    public static ba a(aw aw2, ba ba2, c c2) {
        Object object;
        ba ba3 = null;
        if (ba2 instanceof n) {
            object = (n)ba2;
            String string = ((n)object).getName();
            if (az.dU(string)) {
                List<c> object2 = az.c(aw2, string, c.class);
                if (object2.size() != 1) {
                    throw new as();
                }
                string = object2.get(0).xU();
            }
            ba3 = c2 != null && string.equals("*") ? new n(c2.xU(), ((n)object).ari()) : new n(string, ((n)object).ari());
            ((n)ba3).cp(((n)object).arj());
        } else if (ba2 instanceof o) {
            object = ((o)ba2).arm();
            ba3 = az.k(aw2, (String)object);
            if (ba3 == null) {
                ba3 = new s("");
            }
        } else if (ba2 instanceof s) {
            ba3 = new s(((s)ba2).arr());
        } else {
            if (!(ba2 instanceof t)) {
                return ba2;
            }
            object = ((t)ba2).aru();
            for (int i2 = 0; i2 < ((Object[])object).length; ++i2) {
                Object object2 = object[i2];
                if (!(object2 instanceof ba)) continue;
                object[i2] = m.a(aw2, (ba)object2, c2);
            }
            ba3 = new t(((t)ba2).SM(), (Object[])object);
        }
        object = ba2.arp();
        if (object != null) {
            ba3.a(((v)object).arG());
        }
        for (ba ba4 : ba2.aro()) {
            ba3.n(m.a(aw2, ba4, c2));
        }
        return ba3;
    }
}

