/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

import net.minecraft.network.aj;
import net.minecraft.network.am;
import net.minecraft.network.au;
import net.minecraft.network.g;
import net.minecraft.network.play.server.b;
import net.minecraft.network.play.server.h;
import net.minecraft.network.play.server.i;
import net.minecraft.src.a;
import net.minecraft.util.bh;

public class al {
    public static int dat = Integer.MIN_VALUE;

    public static <T extends g> void a(aj<T> aj2, T t2, bh bh2) {
        if (!bh2.BD()) {
            bh2.f(new am(aj2, t2));
            throw au.daH;
        }
        al.F(aj2);
    }

    protected static void F(aj aj2) {
        if (aj2 instanceof i) {
            a.anR().Lc();
        }
        if (aj2 instanceof h) {
            h h2 = (h)aj2;
            dat = h2.agq();
        } else if (aj2 instanceof b) {
            b b2 = (b)aj2;
            dat = b2.getDimension();
        } else {
            dat = Integer.MIN_VALUE;
        }
    }
}

