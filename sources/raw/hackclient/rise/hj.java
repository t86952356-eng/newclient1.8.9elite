/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.gn;
import hackclient.rise.go;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.network.o;
import net.minecraft.entity.r;

public final class hj
extends akg<gn> {
    private boolean ro;
    private final Set<UUID> rp = new HashSet<UUID>();
    @dm
    public final dk<ei> rq = ei2 -> {
        if (hj.aER.bgF == null || hj.aER.bgK == null) {
            return;
        }
        go go2 = this.e(go.class);
        r r2 = go2.jE;
        if (!this.ro && hj.aER.bgK.aRg >= 150 && this.e(go.class).isEnabled() && r2 != null && !r2.csb) {
            this.rp.clear();
            for (o object : aER.AU().Id()) {
                if (object == null || object.Ie() == null) continue;
                this.rp.add(object.Ie().getId());
            }
            this.ro = true;
        }
        for (net.minecraft.entity.player.a a2 : hj.aER.bgF.dCY) {
            if (a2 == hj.aER.bgK) continue;
            if (!this.ro) {
                a.a.x().c(this, a2);
                continue;
            }
            UUID uUID = a2.Ul();
            if (this.rp.contains(uUID)) {
                a.a.x().c(this, a2);
                continue;
            }
            a.a.x().b(this, a2);
        }
    };
    @dm
    public final dk<fg> rr = fg2 -> {
        this.ro = false;
        this.rp.clear();
        a.a.x().a(this);
    };

    public hj(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        this.ro = false;
        this.rp.clear();
        a.a.x().a(this);
    }
}

