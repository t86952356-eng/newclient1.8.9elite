/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.ua;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.a;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;

public class sa
extends akg<ua> {
    private boolean ajn;
    public static boolean dj = false;
    public static boolean tt;
    private int tR;
    private final ArrayList<aj<?>> ajo = new ArrayList();
    private float ub;
    private double vB;
    private double vC;
    private final aki ajp = new aki("Newest Grim, may flag the anticheat", (akg<?>)this, (Boolean)false);
    private boolean gD;
    @dm(cH=2)
    public final dk<fh> ajq = fh2 -> {
        if (tt || sa.aER.bgK.aRg < 10 || sa.aER.bgK.crR) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, a.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (t2.getEntityID() != sa.aER.bgK.getEntityId() || fh2.isCancelled()) break;
                if (t2.getEntityID() == sa.aER.bgK.getEntityId() && t2.dcS > 0 || sa.aER.bgK.ae <= 14 || sa.aER.bgK.crx <= 1) {
                    this.gD = true;
                }
                if (sa.aER.bgK.aO || !this.ajn) break;
                dj = true;
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!dj) break;
                break;
            }
            case 2: {
                a a2 = (a)aj3;
                if (!dj) break;
                break;
            }
        }
    };
    @dm
    public final dk<ei> ajr = ei2 -> {
        if (sa.aER.bgK.crR) {
            return;
        }
        float f2 = bd.cY;
        if (sa.aER.bgK.ue > 0.1) {
            this.ajn = false;
        }
        if (f2 > 3.0f) {
            this.ajn = true;
        }
        if (this.ajn && sa.aER.bgK.aO) {
            if (!((Boolean)this.ajp.wD()).booleanValue()) {
                ei2.setCancelled(true);
            } else {
                ahn.m(new f(sa.aER.bgK.gW, sa.aER.bgK.gX + 0.01, sa.aER.bgK.gY, true));
            }
            ei2.setCancelled(true);
            ahn.m(new e(true));
            sa.aER.aIY.chq.ay(false);
            f2 = 0.0f;
        }
        if (this.ajn) {
            sa.aER.aIY.chq.ay(false);
        }
        if (aik.vx() > 5.0 && sa.aER.bgK.tR == 9 && sa.aER.bgK.Zz > 200 && ((Boolean)this.ajp.wD()).booleanValue()) {
            sa.aER.bgK.ue = aii.predictedMotion(sa.aER.bgK.ue, 10);
        }
        bd.cY = f2;
    };
    @dm(cH=2)
    public final dk<ej> ajs = ej2 -> {
        if (dj && sa.aER.bgK.aO) {
            tt = true;
            dj = false;
            this.ajo.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.ajo.clear();
            tt = false;
        }
    };
    @dm
    public final dk<dz> ajt = dz2 -> {
        if (sa.aER.bgK.crR) {
            return;
        }
        if (this.gD && this.ajn) {
            dz2.setJump(true);
            this.gD = false;
        } else if (this.ajn) {
            // empty if block
        }
    };

    public sa(String string, ua ua2) {
        super(string, ua2);
    }

    @Override
    public void onEnable() {
        this.ajn = false;
    }
}

