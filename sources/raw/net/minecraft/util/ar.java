/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.util.ao;

public final class ar
extends Enum<ar>
implements Predicate<ao>,
Iterable<ao> {
    public static final /* enum */ ar dwT = new ar();
    public static final /* enum */ ar dwU = new ar();
    private static final /* synthetic */ ar[] dwV;

    public static ar[] values() {
        return (ar[])dwV.clone();
    }

    public static ar valueOf(String string) {
        return Enum.valueOf(ar.class, string);
    }

    public ao[] asU() {
        switch (this.ordinal()) {
            case 0: {
                return new ao[]{ao.dws, ao.dwv, ao.dwt, ao.dwu};
            }
            case 1: {
                return new ao[]{ao.dwr, ao.dwq};
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public ao g(Random random) {
        ao[] aoArray = this.asU();
        return aoArray[random.nextInt(aoArray.length)];
    }

    public boolean b(ao ao2) {
        return ao2 != null && ao2.asL().asQ() == this;
    }

    @Override
    public Iterator<ao> iterator() {
        return Iterators.forArray((Object[])this.asU());
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.b((ao)object);
    }

    private static /* synthetic */ ar[] asV() {
        return new ar[]{dwT, dwU};
    }

    static {
        dwV = ar.asV();
    }
}

