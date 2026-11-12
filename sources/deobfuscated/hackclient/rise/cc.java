/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.cd;
import java.util.Map;
import java.util.function.BiFunction;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.q;
import net.minecraft.network.play.server.u;
import net.minecraft.network.play.server.w;
import net.minecraft.network.play.server.x;
import net.minecraft.network.play.server.y;
import net.minecraft.network.play.server.z;

public final class cc
extends Enum<cc> {
    public static final /* enum */ cc gM = new cc(q.class, (aj2, map) -> {
        q q2 = (q)aj2;
        int n2 = q2.getEntityID();
        double d2 = (double)q2.wt() / 32.0;
        double d3 = (double)q2.wu() / 32.0;
        double d4 = (double)q2.wx() / 32.0;
        float f2 = (float)(q2.agx() * 360) / 256.0f;
        float f3 = (float)(q2.agy() * 360) / 256.0f;
        cd cd2 = new cd(d2, d3, d4, f2, f3);
        map.put(n2, cd2);
        return map;
    });
    public static final /* enum */ cc gN = new cc(z.class, (aj2, map) -> {
        z z2 = (z)aj2;
        int n2 = z2.getEntityId();
        double d2 = (double)z2.wt() / 32.0;
        double d3 = (double)z2.wu() / 32.0;
        double d4 = (double)z2.wx() / 32.0;
        float f2 = (float)(z2.agx() * 360) / 256.0f;
        float f3 = (float)(z2.agy() * 360) / 256.0f;
        cd cd2 = new cd(d2, d3, d4, f2, f3);
        map.put(n2, cd2);
        return map;
    });
    public static final /* enum */ cc gO = new cc(w.class, (aj2, map) -> {
        w w2 = (w)aj2;
        int n2 = w2.entityId;
        cd cd2 = (cd)map.get(n2);
        if (cd2 != null) {
            double d2 = cd2.gW + (double)w2.agR() / 32.0;
            double d3 = cd2.gX + (double)w2.agS() / 32.0;
            double d4 = cd2.gY + (double)w2.agT() / 32.0;
            float f2 = cd2.gZ;
            float f3 = cd2.ha;
            cd cd3 = new cd(d2, d3, d4, f2, f3);
            map.put(n2, cd3);
            return map;
        }
        return null;
    });
    public static final /* enum */ cc gP = new cc(y.class, (aj2, map) -> {
        y y2 = (y)aj2;
        int n2 = y2.getEntityId();
        double d2 = (double)y2.agR() / 32.0;
        double d3 = (double)y2.agS() / 32.0;
        double d4 = (double)y2.agT() / 32.0;
        float f2 = (float)(y2.agx() * 360) / 256.0f;
        float f3 = (float)(y2.agy() * 360) / 256.0f;
        cd cd2 = (cd)map.get(n2);
        if (cd2 != null) {
            double d5 = cd2.gW + d2;
            double d6 = cd2.gX + d3;
            double d7 = cd2.gY + d4;
            cd cd3 = new cd(d5, d6, d7, f2, f3);
            map.put(n2, cd3);
            return map;
        }
        return null;
    });
    public static final /* enum */ cc gQ = new cc(x.class, (aj2, map) -> {
        x x2 = (x)aj2;
        int n2 = x2.getEntityId();
        float f2 = (float)(x2.agx() * 360) / 256.0f;
        float f3 = (float)(x2.agy() * 360) / 256.0f;
        cd cd2 = (cd)map.get(n2);
        if (cd2 != null) {
            cd cd3 = new cd(cd2.gW, cd2.gX, cd2.gY, f2, f3);
            map.put(n2, cd3);
            return map;
        }
        return null;
    });
    public static final /* enum */ cc gR = new cc(u.class, (aj2, map) -> {
        int[] nArray;
        u u2 = (u)aj2;
        for (int n2 : nArray = u2.agQ()) {
            map.remove(n2);
        }
        return map;
    });
    public static final /* enum */ cc gS = new cc(aa.class, (aj2, map) -> {
        aa aa2 = (aa)aj2;
        int n2 = aa2.getEntityId();
        float f2 = (float)(aa2.agx() * 360) / 256.0f;
        cd cd2 = (cd)map.get(n2);
        if (cd2 != null) {
            cd cd3 = new cd(cd2.gW, cd2.gX, cd2.gY, f2, cd2.ha);
            map.put(n2, cd3);
            return map;
        }
        return null;
    });
    private final Class<? extends aj<?>> gT;
    private final BiFunction<aj<?>, Map<Integer, cd>, Map<Integer, cd>> gU;
    private static final /* synthetic */ cc[] gV;

    public static cc[] values() {
        return (cc[])gV.clone();
    }

    public static cc valueOf(String string) {
        return Enum.valueOf(cc.class, string);
    }

    private cc(Class<? extends aj<?>> clazz, BiFunction<aj<?>, Map<Integer, cd>, Map<Integer, cd>> biFunction) {
        this.gT = clazz;
        this.gU = biFunction;
    }

    public Map<Integer, cd> a(aj<?> aj2, Map<Integer, cd> map) {
        return this.gU.apply(aj2, map);
    }

    @Generated
    public Class<? extends aj<?>> ce() {
        return this.gT;
    }

    private static /* synthetic */ cc[] cf() {
        return new cc[]{gM, gN, gO, gP, gQ, gR, gS};
    }

    static {
        gV = cc.cf();
    }
}

