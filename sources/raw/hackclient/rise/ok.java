/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.lw;
import hackclient.rise.ly;
import hackclient.rise.lz;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;

public class ok
extends akg<ly> {
    public static int KA = 0;
    private boolean KJ;
    private boolean HJ;
    private int KK;
    private int KL;
    @dm(cH=3)
    public final dk<ei> KM = ei2 -> {
        if (this.e(lz.class).isEnabled() || this.e(lw.class).isEnabled() || KA > 30) {
            return;
        }
        if (ok.aER.bgK.aO) {
            // empty if block
        }
        if (!ok.aER.bgK.csz) {
            ++this.KK;
        } else {
            aii.strafe();
            this.KK = 0;
        }
        if (!ok.aER.bgK.csz && ok.aER.bgK.aO) {
            KA = 31;
        }
        if (ok.aER.bgK.ae == 0 && this.KJ) {
            aii.strafe();
        } else if (ok.aER.bgK.ae == 0) {
            aii.strafe();
        }
        ei2.setSprinting(true);
        if (ok.aER.bgK.csz) {
            KA = 0;
        } else if (ok.aER.bgK.ae > 1 && ++KA < 30) {
            ok.aER.bgK.ue += 0.0281;
        }
        if (ok.aER.bgK.csz) {
            // empty if block
        }
        int n2 = ok.aER.bgK.ae;
        switch (n2) {
            case 1: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
            case 11: {
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
    private final ArrayList<aj<?>> KN = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @dm
    public final dk<eo> KO = eo2 -> {
        double d2 = 0.075;
        if (ok.aER.bgK.csz) {
            ok.aER.bgC.dAp = 0.5f;
            ahn.m(new e(true));
        }
        if (ok.aER.bgK.csz) {
            bm.a(100, true, true, false, false, false);
            eo2.setSpeed(0.2);
        }
        if (aii.speed() < 0.205) {
            // empty if block
        }
    };
    @dm(cH=2)
    public final dk<fh> KP = fh2 -> {
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
                if (!fh2.isCancelled() && t2.getEntityID() == ok.aER.bgK.getEntityId() && (KA < 30 || ok.aER.bgK.csz) && ((double)t2.agO() / 8000.0 > 0.4 || (double)t2.agO() / 8000.0 < 0.1)) {
                    aka aka2 = new aka(ok.aER.bgK.ud, ok.aER.bgK.uf);
                    this.Jk = (double)t2.agP() / 8000.0;
                    this.Jk = (double)t2.agO() / 8000.0;
                    fh2.cF();
                    this.dj = true;
                    this.KN.add(t2);
                    if (this.Jk > 0.2) {
                        ++this.KL;
                    }
                    if (this.KL != 2) break;
                    this.KJ = true;
                    break;
                }
                fh2.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.KN.add(bc2);
                fh2.cF();
                break;
            }
        }
    };
    @dm
    public final dk<dz> KQ = dz2 -> {
        if (ok.aER.bgK.csz) {
            dz2.setJump(true);
        }
    };
    @dm
    public final dk<ed> KR = ed2 -> {};
    @dm
    public final dk<dx> KS = dx2 -> {
        if (dx2.cO() == ((ly)this.wy()).getKey() && !this.HJ) {
            dx2.cF();
            this.HJ = true;
        }
    };
    @dm(cH=4)
    public final dk<ej> KT = ej2 -> {
        if (this.dj && (!ok.aER.bgK.csz || this.KJ) && KA < 30) {
            ok.aER.bgK.ae = 1;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            aka aka2 = new aka(ok.aER.bgK.ud, ok.aER.bgK.uf);
            this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.KJ = false;
            if (ok.aER.bgK.Zz > 20 && this.Jk > 0.4) {
                ok.aER.bgK.ud *= 1.23;
                ok.aER.bgK.uf *= 1.23;
            }
            this.KN.clear();
            if (!this.KJ) {
                // empty if block
            }
            this.tt = false;
        }
    };

    public ok(String string, ly ly2) {
        super(string, ly2);
    }

    @Override
    public void onEnable() {
        this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.KN.clear();
        bd.cY = 0.0f;
    }

    @Override
    public void onDisable() {
        this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.KN.clear();
        this.KJ = false;
        this.KL = 0;
    }
}

