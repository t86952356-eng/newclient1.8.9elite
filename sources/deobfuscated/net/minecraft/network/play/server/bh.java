/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.network.play.server;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.stats.f;
import net.minecraft.stats.n;

public class bh
implements aj<a> {
    private Map<f, Integer> dev;

    public bh() {
    }

    public bh(Map<f, Integer> map) {
        this.dev = map;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        int n2 = ak2.afw();
        this.dev = Maps.newHashMap();
        for (int i2 = 0; i2 < n2; ++i2) {
            f f2 = n.fU(ak2.gs(Short.MAX_VALUE));
            int n3 = ak2.afw();
            if (f2 == null) continue;
            this.dev.put(f2, n3);
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dev.size());
        for (Map.Entry<f, Integer> entry : this.dev.entrySet()) {
            ak2.eS(entry.getKey().dpn);
            ak2.gr(entry.getValue());
        }
    }

    public Map<f, Integer> ahM() {
        return this.dev;
    }
}

