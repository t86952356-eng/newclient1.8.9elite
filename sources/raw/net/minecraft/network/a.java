/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Maps
 *  lombok.Generated
 */
package net.minecraft.network;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import hackclient.rise.ahp;
import java.util.Map;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.b;
import net.minecraft.network.c;
import net.minecraft.network.d;
import net.minecraft.network.e;
import net.minecraft.network.f;
import org.apache.logging.log4j.LogManager;

public sealed class a
extends Enum<a>
permits b, c, d, e {
    public static final /* enum */ a cYF = new b(-1);
    public static final /* enum */ a cYG = new c(0);
    public static final /* enum */ a cYH = new d(1);
    public static final /* enum */ a cYI = new e(2);
    private static final int cYJ = -1;
    private static final int cYK = 2;
    private static final a[] cYL;
    private static final Map<Class<? extends aj>, a> cYM;
    private final int cYN;
    private final Map<f, BiMap<Integer, Class<? extends aj>>> cYO = Maps.newEnumMap(f.class);
    private static final /* synthetic */ a[] cYP;

    public static a[] values() {
        return (a[])cYP.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(int n3) {
        this.cYN = n3;
    }

    protected a a(f f2, Class<? extends aj> clazz) {
        HashBiMap hashBiMap = this.cYO.get((Object)f2);
        if (hashBiMap == null) {
            hashBiMap = HashBiMap.create();
            this.cYO.put(f2, (BiMap<Integer, Class<? extends aj>>)hashBiMap);
        }
        if (hashBiMap.containsValue(clazz)) {
            String string = String.valueOf((Object)f2) + " packet " + String.valueOf(clazz) + " is already known to ID " + String.valueOf(hashBiMap.inverse().get(clazz));
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        hashBiMap.put((Object)hashBiMap.size(), clazz);
        return this;
    }

    public Integer a(f f2, aj aj2) {
        return (Integer)this.cYO.get((Object)f2).inverse().get(aj2.getClass());
    }

    public aj a(f f2, int n2) {
        Class clazz = (Class)this.cYO.get((Object)f2).get((Object)n2);
        return clazz == null ? null : (aj)clazz.newInstance();
    }

    public int getId() {
        return this.cYN;
    }

    public static a go(int n2) {
        return n2 >= -1 && n2 <= 2 ? cYL[n2 - -1] : null;
    }

    public static a A(aj aj2) {
        if (aj2 instanceof ahp) {
            return ((ahp)aj2).vb();
        }
        return cYM.get(aj2.getClass());
    }

    @Generated
    public Map<f, BiMap<Integer, Class<? extends aj>>> aeV() {
        return this.cYO;
    }

    private static /* synthetic */ a[] aeW() {
        return new a[]{cYF, cYG, cYH, cYI};
    }

    static {
        cYP = a.aeW();
        cYL = new a[4];
        cYM = Maps.newHashMap();
        for (a a2 : a.values()) {
            int n2 = a2.getId();
            if (n2 < -1 || n2 > 2) {
                throw new Error("Invalid protocol ID " + n2);
            }
            a.cYL[n2 - -1] = a2;
            for (f f2 : a2.cYO.keySet()) {
                for (Class clazz : a2.cYO.get((Object)f2).values()) {
                    if (cYM.containsKey(clazz) && cYM.get(clazz) != a2) {
                        throw new Error("Packet " + String.valueOf(clazz) + " is already assigned to protocol " + String.valueOf((Object)cYM.get(clazz)) + " - can't reassign to " + String.valueOf((Object)a2));
                    }
                    try {
                        clazz.newInstance();
                    }
                    catch (Throwable throwable) {
                        throw new Error("Packet " + String.valueOf(clazz) + " fails instantiation checks! " + String.valueOf(clazz));
                    }
                    cYM.put(clazz, a2);
                }
            }
        }
    }
}

