/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.hf;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.z;

public class jb
extends akg<hf> {
    private final aki vI = new aki("Cancel On Ground", (akg<?>)this, (Boolean)true);
    private final aki vJ = new aki("Cancel On Attack", (akg<?>)this, (Boolean)true);
    private final aki vK = new aki("Cancel Explosions", (akg<?>)this, (Boolean)true);
    private final List<aj<?>> vL = new ArrayList();
    private boolean vM = false;
    @dm
    public final dk<fh> vN = fh2 -> {
        if (this.vM || jb.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() != jb.aER.bgK.getEntityId()) {
                return;
            }
            fh2.cF();
            List<aj<?>> list = this.vL;
            synchronized (list) {
                this.vL.add(aj2);
            }
            return;
        }
        if (aj2 instanceof bc) {
            List<aj<?>> list = this.vL;
            synchronized (list) {
                if (!this.vL.isEmpty()) {
                    fh2.cF();
                    this.vL.add(aj2);
                }
            }
            return;
        }
        if (aj2 instanceof z) {
            List<aj<?>> list = this.vL;
            synchronized (list) {
                if (!this.vL.isEmpty()) {
                    fh2.cF();
                    this.vL.add(aj2);
                }
            }
            return;
        }
    };
    @dm
    public final dk<fi> vO = fi2 -> {
        c c2;
        if (!((Boolean)this.vJ.wD()).booleanValue()) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof c && (c2 = (c)aj2).afQ() == d.daU) {
            this.v("attack");
        }
    };
    @dm
    public final dk<ei> vP = ei2 -> {
        if (!((Boolean)this.vI.wD()).booleanValue()) {
            return;
        }
        if (jb.aER.bgK.aO && !this.vL.isEmpty()) {
            this.v("ground");
        }
    };

    public jb(String string, hf hf2) {
        super(string, hf2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void v(String string) {
        ArrayList arrayList;
        List<aj<?>> list = this.vL;
        synchronized (list) {
            if (this.vL.isEmpty()) {
                return;
            }
            arrayList = new ArrayList(this.vL);
            this.vL.clear();
        }
        this.vM = true;
        try {
            for (aj aj2 : arrayList) {
                ahn.q(aj2);
            }
        }
        finally {
            this.vM = false;
        }
    }

    @Override
    public void onDisable() {
        this.v("disable");
    }
}

