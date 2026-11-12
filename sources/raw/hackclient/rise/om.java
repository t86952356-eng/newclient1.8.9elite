/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.lz;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;

public class om
extends akg<lz> {
    private boolean KJ;
    private boolean HJ;
    private int KK;
    private int KL;
    @dm(cH=3)
    public final dk<ei> KZ = ei2 -> {
        if (!om.aER.bgK.csz) {
            ++this.KK;
        } else {
            aii.strafe();
            this.KK = 0;
        }
        if (om.aER.bgK.ae == 0 && this.KJ) {
            om.aER.bgK.ud *= 4.1;
            om.aER.bgK.uf *= 4.1;
            aii.strafe();
        } else if (om.aER.bgK.ae == 0) {
            aii.strafe();
        }
        ei2.setSprinting(true);
        if (!om.aER.bgK.csz) {
            om.aER.bgK.ue += 0.0281;
        }
        if (om.aER.bgK.csz) {
            // empty if block
        }
        int n2 = om.aER.bgK.ae;
        switch (n2) {
            case 1: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                om.aER.bgK.ue = 0.03;
                break;
            }
            case 8: {
                om.aER.bgK.ue = 0.03;
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                om.aER.bgK.ue += 0.01;
                break;
            }
            case 15: {
                break;
            }
            case 19: {
                break;
            }
        }
    };
    private final ArrayList<aj<?>> La = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @dm
    public final dk<eo> Lb = eo2 -> {
        double d2 = 0.075;
        if (om.aER.bgK.csz) {
            aii.stop();
            om.aER.bgC.dAp = 0.33f;
            ahn.m(new e(true));
            ahn.m(new f(om.aER.bgK.gW, om.aER.bgK.gX + 0.068, om.aER.bgK.gY, true));
        }
        if (aii.speed() < 0.205) {
            // empty if block
        }
    };
    @dm(cH=2)
    public final dk<fh> Lc = fh2 -> {
        if (this.tt) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (fh2.isCancelled() || t2.getEntityID() != om.aER.bgK.getEntityId()) break;
                aka aka2 = new aka(om.aER.bgK.ud, om.aER.bgK.uf);
                this.Jk = (double)t2.agP() / 8000.0;
                this.Jk = (double)t2.agO() / 8000.0;
                fh2.cF();
                this.dj = true;
                this.La.add(t2);
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.La.add(bc2);
                fh2.cF();
                break;
            }
        }
    };
    @dm
    public final dk<dz> Ld = dz2 -> {
        if (om.aER.bgK.csz) {
            dz2.setJump(true);
        }
    };
    @dm
    public final dk<ed> Le = ed2 -> {};
    @dm
    public final dk<dx> Lf = dx2 -> {
        if (dx2.cO() == ((lz)this.wy()).getKey() && !this.HJ) {
            dx2.cF();
            this.HJ = true;
        }
    };
    @dm(cH=4)
    public final dk<ej> Lg = ej2 -> {
        if (this.dj && !om.aER.bgK.csz) {
            om.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            aka aka2 = new aka(om.aER.bgK.ud, om.aER.bgK.uf);
            this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            if (this.Jk > 0.41) {
                ++this.KL;
            }
            if (this.KL == 2) {
                this.KJ = true;
            }
            this.La.clear();
            if (!this.KJ) {
                om.aER.bgK.ud *= 1.3;
                om.aER.bgK.uf *= 1.3;
            } else {
                om.aER.bgK.ud *= 1.1;
                om.aER.bgK.uf *= 1.1;
            }
            this.tt = false;
        }
    };

    public om(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.La.clear();
        if (om.aER.bgK.aO) {
            aii.stop();
        }
        bd.cY = 0.0f;
    }

    @Override
    public void onDisable() {
        this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.La.clear();
        this.KJ = false;
        this.KL = 0;
        aii.stop();
    }
}

