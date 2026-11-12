/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.j;
import net.minecraft.tileentity.l;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.s;
import net.minecraft.tileentity.u;
import net.minecraft.tileentity.y;
import net.minecraft.tileentity.z;
import net.minecraft.util.b;
import net.minecraft.world.p;
import net.optifine.reflect.g;
import net.optifine.util.n;

public class an {
    public static String D(net.minecraft.world.l l2, b b2) {
        d d2 = l2.K(b2);
        return an.l(d2);
    }

    public static String l(d d2) {
        if (!(d2 instanceof p)) {
            return null;
        }
        p p2 = (p)((Object)d2);
        an.m(d2);
        return !p2.xV() ? null : p2.xU();
    }

    public static void m(d d2) {
        b b2 = d2.Ab();
        String string = an.n(d2);
        if (string == null) {
            String string2 = an.bA(b2);
            string2 = a.fS(string2);
            an.a(d2, string2);
        }
    }

    public static String bA(b b2) {
        d d2 = n.K(b2);
        return d2 == null ? null : an.n(d2);
    }

    public static String n(d d2) {
        p p2;
        if (d2 instanceof j) {
            return (String)g.a(d2, g.esD);
        }
        if (d2 instanceof l) {
            return (String)g.a(d2, g.esF);
        }
        if (d2 instanceof u) {
            return (String)g.a(d2, g.esK);
        }
        if (d2 instanceof y) {
            return (String)g.a(d2, g.esQ);
        }
        if (d2 instanceof p && (p2 = (p)((Object)d2)).xV()) {
            return p2.xU();
        }
        return null;
    }

    public static boolean a(d d2, String string) {
        if (d2 instanceof j) {
            return g.a((Object)d2, g.esD, (Object)string);
        }
        if (d2 instanceof l) {
            return g.a((Object)d2, g.esF, (Object)string);
        }
        if (d2 instanceof u) {
            return g.a((Object)d2, g.esK, (Object)string);
        }
        if (d2 instanceof y) {
            return g.a((Object)d2, g.esQ, (Object)string);
        }
        if (d2 instanceof m) {
            ((m)d2).es(string);
            return true;
        }
        if (d2 instanceof s) {
            ((s)d2).es(string);
            return true;
        }
        if (d2 instanceof z) {
            ((z)d2).es(string);
            return true;
        }
        return false;
    }
}

