/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.world.gen.structure.a;
import net.minecraft.world.gen.structure.ab;
import net.minecraft.world.gen.structure.ah;
import net.minecraft.world.gen.structure.ai;
import net.minecraft.world.gen.structure.bc;
import net.minecraft.world.gen.structure.bd;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cx;
import net.minecraft.world.gen.structure.j;
import net.minecraft.world.gen.structure.l;
import net.minecraft.world.gen.structure.n;
import net.minecraft.world.gen.structure.v;
import net.minecraft.world.gen.structure.y;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t {
    private static final Logger dQr = LogManager.getLogger();
    private static final Map<String, Class<? extends cb>> dQs = Maps.newHashMap();
    private static final Map<Class<? extends cb>, String> dQt = Maps.newHashMap();
    private static final Map<String, Class<? extends y>> dQu = Maps.newHashMap();
    private static final Map<Class<? extends y>, String> dQv = Maps.newHashMap();

    private static void c(Class<? extends cb> clazz, String string) {
        dQs.put(string, clazz);
        dQt.put(clazz, string);
    }

    static void d(Class<? extends y> clazz, String string) {
        dQu.put(string, clazz);
        dQv.put(clazz, string);
    }

    public static String a(cb cb2) {
        return dQt.get(cb2.getClass());
    }

    public static String a(y y2) {
        return dQv.get(y2.getClass());
    }

    public static cb b(net.minecraft.nbt.n n2, w w2) {
        cb cb2 = null;
        try {
            Class<? extends cb> clazz = dQs.get(n2.eK("id"));
            if (clazz != null) {
                cb2 = clazz.newInstance();
            }
        }
        catch (Exception exception) {
            dQr.warn("Failed Start with id " + n2.eK("id"));
            exception.printStackTrace();
        }
        if (cb2 != null) {
            cb2.c(w2, n2);
        } else {
            dQr.warn("Skipping Structure with id " + n2.eK("id"));
        }
        return cb2;
    }

    public static y c(net.minecraft.nbt.n n2, w w2) {
        y y2 = null;
        try {
            Class<? extends y> clazz = dQu.get(n2.eK("id"));
            if (clazz != null) {
                y2 = clazz.newInstance();
            }
        }
        catch (Exception exception) {
            dQr.warn("Failed Piece with id " + n2.eK("id"));
            exception.printStackTrace();
        }
        if (y2 != null) {
            y2.b(w2, n2);
        } else {
            dQr.warn("Skipping Piece with id " + n2.eK("id"));
        }
        return y2;
    }

    static {
        t.c(ah.class, "Mineshaft");
        t.c(v.class, "Village");
        t.c(j.class, "Fortress");
        t.c(n.class, "Stronghold");
        t.c(l.class, "Temple");
        t.c(bc.class, "Monument");
        ab.ayU();
        cx.azk();
        ai.ayV();
        cc.azf();
        a.ayD();
        bd.ayY();
    }
}

