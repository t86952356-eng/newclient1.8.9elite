/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.bg;

public final class ap
extends Enum<ap>
implements Predicate<ao>,
bg {
    public static final /* enum */ ap dwH = new ap("x", ar.dwT);
    public static final /* enum */ ap dwI = new ap("y", ar.dwU);
    public static final /* enum */ ap dwJ = new ap("z", ar.dwT);
    private static final Map<String, ap> dwK;
    private final String name;
    private final ar dwM;
    private static final /* synthetic */ ap[] dwN;

    public static ap[] values() {
        return (ap[])dwN.clone();
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(ap.class, string);
    }

    private ap(String string2, ar ar2) {
        this.name = string2;
        this.dwM = ar2;
    }

    public static ap gh(String string) {
        return string == null ? null : dwK.get(string.toLowerCase());
    }

    public String asK() {
        return this.name;
    }

    public boolean asO() {
        return this.dwM == ar.dwU;
    }

    public boolean asP() {
        return this.dwM == ar.dwT;
    }

    public String toString() {
        return this.name;
    }

    public boolean b(ao ao2) {
        return ao2 != null && ao2.asL() == this;
    }

    public ar asQ() {
        return this.dwM;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.b((ao)object);
    }

    private static /* synthetic */ ap[] asR() {
        return new ap[]{dwH, dwI, dwJ};
    }

    static {
        dwN = ap.asR();
        dwK = Maps.newHashMap();
        for (ap ap2 : ap.values()) {
            dwK.put(ap2.asK().toLowerCase(), ap2);
        }
    }
}

