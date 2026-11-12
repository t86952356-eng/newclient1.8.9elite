/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.Collection;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.ai.attributes.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aj {
    private static final Logger cwl = LogManager.getLogger();
    public static final d cwm = new g(null, "generic.maxHealth", 20.0, 0.0, 1024.0).eg("Max Health").aN(true);
    public static final d cwn = new g(null, "generic.followRange", 32.0, 0.0, 2048.0).eg("Follow Range");
    public static final d cwo = new g(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).eg("Knockback Resistance");
    public static final d cwp = new g(null, "generic.movementSpeed", 0.7f, 0.0, 1024.0).eg("Movement Speed").aN(true);
    public static final d cwq = new g(null, "generic.attackDamage", 2.0, 0.0, 2048.0);

    public static v a(c c2) {
        v v2 = new v();
        for (e e2 : c2.Xw()) {
            v2.a(aj.a(e2));
        }
        return v2;
    }

    private static n a(e e2) {
        n n2 = new n();
        d d2 = e2.Xx();
        n2.R("Name", d2.Xs());
        n2.b("Base", e2.Xy());
        Collection<a> collection = e2.Xz();
        if (collection != null && !collection.isEmpty()) {
            v v2 = new v();
            for (a a2 : collection) {
                if (!a2.Xr()) continue;
                v2.a(aj.a(a2));
            }
            n2.b("Modifiers", v2);
        }
        return n2;
    }

    private static n a(a a2) {
        n n2 = new n();
        n2.R("Name", a2.getName());
        n2.b("Amount", a2.Xq());
        n2.B("Operation", a2.Xp());
        n2.d("UUIDMost", a2.Xo().getMostSignificantBits());
        n2.d("UUIDLeast", a2.Xo().getLeastSignificantBits());
        return n2;
    }

    public static void a(c c2, v v2) {
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n2 = v2.gi(i2);
            e e2 = c2.ef(n2.eK("Name"));
            if (e2 != null) {
                aj.a(e2, n2);
                continue;
            }
            cwl.warn("Ignoring unknown attribute '" + n2.eK("Name") + "'");
        }
    }

    private static void a(e e2, n n2) {
        e2.ap(n2.eJ("Base"));
        if (n2.C("Modifiers", 9)) {
            v v2 = n2.D("Modifiers", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                a a2 = aj.m(v2.gi(i2));
                if (a2 == null) continue;
                a a3 = e2.h(a2.Xo());
                if (a3 != null) {
                    e2.d(a3);
                }
                e2.c(a2);
            }
        }
    }

    public static a m(n n2) {
        UUID uUID = new UUID(n2.eH("UUIDMost"), n2.eH("UUIDLeast"));
        try {
            return new a(uUID, n2.eK("Name"), n2.eJ("Amount"), n2.eG("Operation"));
        }
        catch (Exception exception) {
            cwl.warn("Unable to create attribute: " + exception.getMessage());
            return null;
        }
    }
}

