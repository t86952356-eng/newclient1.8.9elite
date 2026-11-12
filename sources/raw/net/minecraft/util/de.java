/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Collection;
import java.util.Random;
import net.minecraft.util.df;

public class de {
    public static int f(Collection<? extends df> collection) {
        int n2 = 0;
        for (df df2 : collection) {
            n2 += df2.dAR;
        }
        return n2;
    }

    public static <T extends df> T a(Random random, Collection<T> collection, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        int n3 = random.nextInt(n2);
        return de.a(collection, n3);
    }

    public static <T extends df> T a(Collection<T> collection, int n2) {
        for (df df2 : collection) {
            if ((n2 -= df2.dAR) >= 0) continue;
            return (T)df2;
        }
        return null;
    }

    public static <T extends df> T a(Random random, Collection<T> collection) {
        return de.a(random, collection, de.f(collection));
    }
}

