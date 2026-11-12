/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.en;
import hackclient.rise.ez;
import hackclient.rise.fi;
import hackclient.rise.lx;
import hackclient.rise.mh;
import net.minecraft.block.Block;
import net.minecraft.client.gui.f;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.r;

public class oe
extends akg<lx> {
    private boolean Ka = false;
    private boolean Kb = false;
    private long Kc = 0L;
    private float jp;
    private float jq;
    public static boolean Kd;
    public static boolean Ke;
    int dm;
    int Kf;
    private final d[] Kg;
    public final aki Kh;
    public final akq Ki;
    public final aki Kj;
    private int Kk;
    private int Kl;
    private int Km;
    private int Kn;
    private net.minecraft.util.b Ko;
    private net.minecraft.util.b Kp;
    private String Kq;
    private String Kr;
    private boolean Ks;
    private boolean Kt;
    @dm
    private final dk<ei> Ku;
    @dm
    private final dk<fi> Kv;
    @dm
    public final dk<ei> Kw;
    @dm(cH=3)
    dk<dz> yv;
    @dm(cH=1)
    dk<en> pb;
    @dm(cH=1)
    dk<ej> dq;
    @dm
    public final dk<dz> Kx;
    @dm
    public final dk<ez> Ky;

    public oe(String string, lx lx2) {
        super(string, lx2);
        this.Kg = new d[]{oe.aER.aIY.chm, oe.aER.aIY.cho, oe.aER.aIY.chp, oe.aER.aIY.chn, oe.aER.aIY.chq};
        this.Kh = new aki("Prediction Mode", (akg<?>)this, (Boolean)false);
        this.Ki = new akq("Ticks", this, (Number)1, (Number)1, (Number)20, (Number)1);
        this.Kj = new aki("Measure Chest Open", (akg<?>)this, (Boolean)true);
        this.Kl = -1;
        this.Km = -1;
        this.Kn = -1;
        this.Kq = "unknown";
        this.Kr = "unknown";
        this.Ku = ei2 -> {
            if (oe.aER.bgR == null || oe.aER.bgR instanceof f || oe.aER.bgR == this.v()) {
                return;
            }
            if (oe.aER.bgR instanceof h) {
                // empty if block
            }
            for (d d2 : this.Kg) {
                d2.ay(a.a(d2));
            }
            if (!Ke || oe.aER.bgK.aRg % 2 == 0) {
                // empty if block
            }
        };
        this.Kv = fi2 -> {
            aj<b> aj2;
            aj<?> aj3 = fi2.dq();
            if (!fi2.isCancelled() && oe.aER.bgK != null && oe.aER.bgF != null && ((Boolean)this.Kj.wD()).booleanValue() && aj3 instanceof k) {
                aj2 = (k)aj3;
                net.minecraft.util.b b2 = ((k)aj2).yl();
                if (!(oe.aER.bgR instanceof h) && this.h(b2)) {
                    this.Kp = b2;
                    this.Kr = "C08 at " + String.valueOf(b2);
                    this.Ks = true;
                }
            } else if (!fi2.isCancelled() && oe.aER.bgK != null && oe.aER.bgF != null && ((Boolean)this.Kj.wD()).booleanValue() && aj3 instanceof net.minecraft.network.play.client.c) {
                aj2 = (net.minecraft.network.play.client.c)aj3;
                c c2 = ((net.minecraft.network.play.client.c)aj2).j(oe.aER.bgF);
                if (!(oe.aER.bgR instanceof h) && ((net.minecraft.network.play.client.c)aj2).afQ() != net.minecraft.network.play.client.d.daU && this.o(c2)) {
                    this.Kp = null;
                    this.Kr = "C02 at " + c2.xU() + " (" + c2.getEntityId() + ")";
                    this.Ks = true;
                }
            }
            if (aj3 instanceof r) {
                aj2 = (r)aj3;
                if (oe.aER.bgR instanceof q && ((r)aj2).getMode() < 1 && ((r)aj2).agd() != null) {
                    Kd = true;
                }
            }
        };
        this.Kw = ei2 -> {
            d[] dArray;
            d[] dArray2;
            if (!(oe.aER.bgR instanceof q)) {
                Kd = false;
            }
            if ((dArray2 = oe.aER.bgR) instanceof q) {
                dArray = dArray2;
                if (!Kd && !bb.a(false, false, false, false, true)) {
                    oe.aER.bgK.bkd.v(new net.minecraft.network.play.client.q(dArray.bwi.cSL));
                }
            }
            if ((oe.aER.bgR instanceof h || Kd) && !((Boolean)this.Kh.wD()).booleanValue()) {
                if (this.e(mh.class).isEnabled() && !this.Ka) {
                    oe.aER.bgK.uf *= -0.1;
                    oe.aER.bgK.ud *= -0.1;
                    this.Ka = true;
                }
                if (oe.aER.bgK.crx < 10 && !(Math.abs(oe.aER.bgK.gX - (double)Math.round(oe.aER.bgK.gX)) > 0.03) && !(oe.aER.bgR instanceof h)) {
                    aii.strafe(0.0365);
                } else if (!oe.aER.bgK.aO) {
                    aii.stop();
                } else if (oe.aER.bgK.a(net.minecraft.potion.a.dgw) && 1 + oe.aER.bgK.b(net.minecraft.potion.a.dgw).ajf() > 1) {
                    aii.strafe(0.0185 * (double)(1 + oe.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()));
                } else if (oe.aER.bgK.a(net.minecraft.potion.a.dgw) && 1 + oe.aER.bgK.b(net.minecraft.potion.a.dgw).ajf() == 1) {
                    aii.strafe(0.0635 * (double)(1 + oe.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()));
                } else {
                    aii.strafe(0.09);
                }
                if (oe.aER.bgK.cuU && oe.aER.bgK.aO) {
                    aii.stop();
                } else if (oe.aER.bgK.cuU) {
                    aii.stop();
                }
                aii.preventDiagonalSpeed();
            } else if (this.Ka) {
                this.e(mh.class).setEnabled(true);
                this.Ka = false;
            }
            if ((oe.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue() && !oe.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                ei2.setSprinting(false);
                oe.aER.aIY.chs.ay(false);
                oe.aER.aIY.chq.ay(false);
                for (d d2 : dArray = new d[]{oe.aER.aIY.chm, oe.aER.aIY.chp, oe.aER.aIY.cho, oe.aER.aIY.chn}) {
                    if (!d2.Re()) continue;
                    ++this.Kf;
                }
            } else if ((oe.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue()) {
                ei2.setSprinting(false);
            }
        };
        this.yv = dz2 -> {
            this.jp = dz2.getForward();
            this.jq = dz2.getStrafe();
        };
        this.pb = en2 -> {
            if (oe.aER.bgR instanceof h || Kd) {
                oe.aER.bgK.setSprinting(false);
            }
        };
        this.dq = ej2 -> {
            if (oe.aER.bgK == null || oe.aER.bgF == null || oe.aER.bgK.aRg < 50) {
                return;
            }
            this.hC();
            this.hB();
            this.hD();
            d[] dArray = new d[]{oe.aER.aIY.chm, oe.aER.aIY.chp, oe.aER.aIY.cho, oe.aER.aIY.chn};
            int n2 = 0;
            for (d d2 : dArray) {
                if (!d2.Re()) continue;
                ++n2;
            }
            if ((oe.aER.bgR instanceof h || Kd) && n2 > 1) {
                bs.a(new akb((float)Math.toDegrees(aii.g(this.jp, this.jq)), oe.aER.bgK.pm), 10.0, cb.gH);
            }
        };
        this.Kx = dz2 -> {
            d[] dArray = new d[]{oe.aER.aIY.chm, oe.aER.aIY.chp, oe.aER.aIY.cho, oe.aER.aIY.chn};
            int n2 = 0;
            for (d d2 : dArray) {
                if (!d2.Re()) continue;
                ++n2;
            }
            if (Ke && oe.aER.bgK.aRg % 5 != 0 && oe.aER.bgR instanceof h) {
                dz2.setStrafe(0.0f);
                dz2.setForward(0.0f);
            }
            if (!(oe.aER.bgR instanceof h)) {
                Ke = false;
            }
            if (n2 == 2) {
                // empty if block
            }
            if ((oe.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue() && (oe.aER.bgK.a(net.minecraft.potion.a.dgw) || !oe.aER.bgK.aO)) {
                dz2.setStrafe(0.0f);
                dz2.setForward(0.0f);
            } else if (Kd && !this.Kb) {
                dz2.setStrafe(0.0f);
                dz2.setForward(0.0f);
                if (this.Kc == 0L) {
                    this.Kc = System.currentTimeMillis();
                }
            } else {
                this.Kc = 0L;
            }
            if (this.Kc != 0L && System.currentTimeMillis() - this.Kc >= 60L) {
                this.Kb = true;
                this.Kc = 0L;
            }
            if (!(oe.aER.bgR instanceof h) && !Kd) {
                this.Kb = false;
            }
        };
        this.Ky = ez2 -> {
            if ((oe.aER.bgR instanceof h || Kd) && !((Boolean)this.Kh.wD()).booleanValue() && !oe.aER.bgK.aO) {
                ez2.setPosZ(0.0);
                ez2.setPosX(0.0);
            }
        };
    }

    private void hB() {
        if (!this.Kt) {
            return;
        }
        if (oe.aER.bgR instanceof h) {
            int n2;
            this.Km = n2 = oe.aER.bgK.aRg - this.Kl;
            if (this.Kn == -1) {
                this.Kn = oe.aER.bgK.aRg;
            }
            this.Kt = false;
            return;
        }
        if (oe.aER.bgK.aRg - this.Kl > 40) {
            this.Kt = false;
        }
    }

    private void hC() {
        if (!this.Ks) {
            return;
        }
        this.Kl = oe.aER.bgK.aRg;
        this.Ko = this.Kp;
        this.Kq = this.Kr;
        this.Ks = false;
        this.Kt = true;
    }

    private void hD() {
        if (!(oe.aER.bgR instanceof h)) {
            this.Kn = -1;
            Ke = false;
            return;
        }
        if (this.Kn == -1) {
            this.Kn = oe.aER.bgK.aRg;
        }
        if (!Ke && this.Km >= 0 && oe.aER.bgK.aRg - this.Kn >= this.Km - ((Number)this.Ki.wD()).intValue()) {
            Ke = true;
        }
    }

    private boolean h(net.minecraft.util.b b2) {
        if (b2 == null || oe.aER.bgF == null || b2.equals(new net.minecraft.util.b(-1, -1, -1))) {
            return false;
        }
        Block block = oe.aER.bgF.L(b2).df();
        return block == Blocks.cMg || block == Blocks.cOi || block == Blocks.cNS;
    }

    private boolean o(c c2) {
        if (c2 == null || c2 == oe.aER.bgK) {
            return false;
        }
        if (c2 instanceof net.minecraft.entity.player.a) {
            return aER.AU().d(((net.minecraft.entity.player.a)c2).Ul()) == null;
        }
        return !c2.aec && this.p(c2);
    }

    private boolean p(c c2) {
        return Math.abs(c2.gW - c2.csh) < 0.03 && Math.abs(c2.gX - c2.csi) < 0.03 && Math.abs(c2.gY - c2.csj) < 0.03 && Math.abs(c2.ud) < 0.03 && Math.abs(c2.ue) < 0.03 && Math.abs(c2.uf) < 0.03;
    }
}

