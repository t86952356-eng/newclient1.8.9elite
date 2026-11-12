/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aho;
import hackclient.rise.aii;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.fe;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;

@gl(aliases={"module.other.timer.name"}, description="module.other.timer.description", category=gj.MOVEMENT)
public final class sq
extends gi {
    private boolean HJ;
    public static ConcurrentLinkedQueue<aho> Zy = new ConcurrentLinkedQueue();
    private int Zz;
    private long SG;
    private final akj ZA = new akj("Timer", this, (Number)1, (Number)2, (Number)0.1, (Number)20, (Number)0.05);
    public final aki ZB = new aki("Watchdog", (gi)this, (Boolean)false);
    public final aki ZC = new aki("Compensate Low Timer", (gi)this, (Boolean)false);
    public final akq ZD = new akq("Compensate Speed", this, (Number)1.5, (Number)1.0, (Number)5.0, (Number)0.05, () -> (Boolean)this.ZC.wD() == false);
    public final akq ZE = new akq("Balance Multiplier", this, (Number)1, (Number)0.1, (Number)10.0, (Number)0.05, () -> (Boolean)this.ZC.wD() == false);
    private double yC = 0.0;
    private boolean ZF;
    @dm(cH=2)
    public final dk<ei> ZG = ei2 -> {
        if (!((Boolean)this.ZB.wD()).booleanValue()) {
            if (!this.ZF) {
                sq.aER.bgC.dAp = (float)ahj.l(((Number)this.ZA.wD()).floatValue(), this.ZA.wP().floatValue());
            }
            if (((Boolean)this.ZC.wD()).booleanValue() && this.ZF) {
                sq.aER.bgC.dAp = ((Number)this.ZD.wD()).floatValue();
            }
        } else if (((Boolean)this.ZB.wD()).booleanValue()) {
            ei2.setOnGround(true);
            if (this.HJ && System.currentTimeMillis() > this.SG) {
                sq.aER.bgK.ud *= 0.0;
                sq.aER.bgK.uf *= 0.0;
                this.SG = 0L;
                this.e(sq.class).toggle();
            }
        }
    };
    @dm(cH=3)
    public final dk<ej> ZH = ej2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            bm.a(9999999, false, false, false, false, true);
            sq.aER.bgK.crP = true;
        }
    };
    @dm
    public final dk<fe> ZI = fe2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && !this.HJ) {
            if (sq.aER.bgK.aO) {
                ++this.Zz;
                double d2 = sq.aER.bgK.gW;
                double d3 = sq.aER.bgK.gX;
                double d4 = sq.aER.bgK.gY;
                ahn.m(new f(d2, d3, d4, true));
                ahn.m(new f(d2, d3 - 1.0E-16, d4, true));
                ahn.m(new f(d2, d3 + 0.07, d4, true));
                ahn.m(new f(d2, d3, d4, true));
                sq.aER.bgC.dAp = ((Number)this.ZA.wD()).floatValue();
            } else if (((Boolean)this.ZB.wD()).booleanValue()) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<dz> ZJ = dz2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && sq.aER.bgK.aO && this.Zz == 0) {
            aii.stop();
        }
    };
    @dm
    public final dk<eo> ZK = eo2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && this.HJ) {
            aii.stop();
            sq.aER.bgC.dAp = 1.0f;
            if (sq.aER.bgK.aO) {
                Zy.forEach(aho2 -> ahn.o(aho2.dq()));
                Zy.clear();
                bm.dispatch();
            }
        }
    };
    @dm(cH=0)
    public final dk<fi> ZL = fi2 -> {
        aj<?> aj2;
        if (sq.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (((Boolean)this.ZC.wD()).booleanValue() && (aj2 = fi2.dq()) instanceof e && (!fi2.isCancelled() || bc.cR)) {
            if (this.ZF) {
                if (this.yC > 0.0) {
                    this.yC -= 1.0;
                    if (this.yC <= 0.0) {
                        this.ZF = false;
                        sq.aER.bgC.dAp = 1.0f;
                        this.toggle();
                    }
                }
            } else if (this.im()) {
                this.yC += ((Number)this.ZE.wD()).doubleValue();
            }
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && sq.aER.bgK.aO && (aj2 = fi2.dq()) instanceof net.minecraft.network.play.server.bc) {
            Zy.add(new aho(aj2));
            fi2.cF();
        }
    };
    @dm
    public final dk<fh> ZM = fh2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            aj<?> aj2 = fh2.dq();
            if (aj2 instanceof t) {
                fh2.cF();
            }
            if (aj2 instanceof i) {
                fh2.cF();
            }
        }
    };
    @dm(cH=4)
    public final dk<fd> ZN = fd2 -> {};
    @dm
    public final dk<ed> ZO = ed2 -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            ed2.cF();
        }
    };
    @dm
    public final dk<dx> ZP = dx2 -> {
        if (((Boolean)this.ZC.wD()).booleanValue() && dx2.cO() == this.e(sq.class).getKey() && this.isEnabled()) {
            if (!this.ZF && this.yC > 0.0) {
                this.ZF = true;
                sq.aER.bgC.dAp = ((Number)this.ZD.wD()).floatValue();
                dx2.cF();
                return;
            }
            if (this.ZF) {
                dx2.cF();
                return;
            }
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && dx2.cO() == this.e(sq.class).getKey() && !this.HJ) {
            this.SG = System.currentTimeMillis() + 200L;
            this.HJ = true;
            afl.b("sent", new Object[0]);
            dx2.cF();
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && this.HJ) {
            dx2.cF();
        }
    };

    @Override
    public void onEnable() {
        this.yC = 0.0;
        this.ZF = false;
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            sq.aER.bgK.cso = 0.0f;
            this.HJ = false;
            this.Zz = 0;
            this.SG = 0L;
        }
    }

    @Override
    public void onDisable() {
        if (sq.aER.bgC.dAp != 1.0f) {
            sq.aER.bgC.dAp = 1.0f;
        }
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            sq.aER.bgK.cso = 0.6f;
            sq.aER.bgK.ud *= 0.0;
            sq.aER.bgK.uf *= 0.0;
        }
    }

    private boolean im() {
        return ((Number)this.ZA.wD()).floatValue() < 1.0f || sq.aER.bgC.dAp < 1.0f;
    }
}

