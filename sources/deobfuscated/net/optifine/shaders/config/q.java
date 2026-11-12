/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.HashMap;
import java.util.Map;
import net.optifine.expr.l;
import net.optifine.shaders.config.b;
import net.optifine.shaders.config.o;
import net.optifine.shaders.config.t;

public class q
implements net.optifine.expr.q {
    private final Map<String, b> eHF = new HashMap<String, b>();

    public q(o[] oArray) {
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            o o2 = oArray[i2];
            if (!(o2 instanceof t)) continue;
            t t2 = (t)o2;
            b b2 = new b(t2);
            this.eHF.put(o2.getName(), b2);
        }
    }

    @Override
    public l ib(String string) {
        b b2 = this.eHF.get(string);
        return b2;
    }
}

