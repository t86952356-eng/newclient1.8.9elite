/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

public class ng
extends akg<lw> {
    private final akq Hl = new akq("Duration", this, (Number)3000.0, (Number)1000.0, (Number)10000.0, (Number)100.0);
    private final akq Hm = new akq("Timer", this, (Number)1.0, (Number)0.1, (Number)2.0, (Number)0.1);
    private long Hn;
    private boolean dj;
    private int Ho;
    @dm
    public final dk<fh> Hp = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == ng.aER.bgK.getEntityId()) {
            this.Hn = System.currentTimeMillis();
            this.dj = true;
        }
    };
    @dm
    public final dk<ej> Hq = ej2 -> {
        if (!this.dj) {
            return;
        }
        long l2 = System.currentTimeMillis() - this.Hn;
        if (l2 >= ((Number)this.Hl.wD()).longValue()) {
            if (this.Ho == 1) {
                ((lw)this.wy()).toggle();
            }
            return;
        }
        ng.aER.bgC.dAp = ((Number)this.Hm.wD()).floatValue();
        this.Ho = 1;
        if (ng.aER.bgK.aO && ng.aER.bgK.crW) {
            ng.aER.bgK.ue = 0.42;
        } else {
            aii.strafe(0.002);
            ng.aER.bgC.dAp = 4.0f;
            ng.aER.bgK.ue = Math.max(-1.0E-8, ng.aER.bgK.ue);
        }
        if (ng.aER.bgK.crR) {
            ng.aER.bgC.dAp = 1.0f;
            ((lw)this.wy()).toggle();
        }
    };
    @dm
    public final dk<ei> Hr = ei2 -> {
        if (!this.dj) {
            return;
        }
        long l2 = System.currentTimeMillis() - this.Hn;
        if (l2 < ((Number)this.Hl.wD()).longValue()) {
            ei2.setOnGround(false);
        }
    };

    public ng(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.Hn = 0L;
        this.dj = false;
        this.Ho = 0;
    }

    @Override
    public void onDisable() {
        ng.aER.bgC.dAp = 1.0f;
        aii.stop();
        this.dj = false;
        this.Ho = 0;
    }
}

