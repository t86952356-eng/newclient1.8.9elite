/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.c;
import hackclient.rise.l;
import hackclient.rise.m;
import hackclient.rise.n;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.client.d;

public final class b {
    public final Map<UUID, m> M = new ConcurrentHashMap<UUID, m>();
    private final n N = new n();
    private final c O = new c();

    public b() {
        l.U();
    }

    public void F() {
        for (m m2 : this.M.values()) {
            if (d.AZ().bgF.dCY.contains(m2.Y())) {
                m2.F();
                continue;
            }
            this.N.a(m2.Y().Ul());
        }
    }

    @Generated
    public Map<UUID, m> G() {
        return this.M;
    }

    @Generated
    public n H() {
        return this.N;
    }

    @Generated
    public c I() {
        return this.O;
    }
}

