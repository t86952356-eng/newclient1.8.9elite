/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.inventorymove;

import hackclient.rise.aii;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.en;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.InventoryMove;
import rise.module.impl.movement.Speed;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class WatchdogMode
extends Mode<InventoryMove> {
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
    public final BooleanValue Kh;
    public final NumberValue Ki;
    public final BooleanValue Kj;
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
    @EventLink
    private final Listener<PreMotionEvent> Ku;
    @EventLink
    private final Listener<PacketSendEvent> Kv;
    @EventLink
    public final Listener<PreMotionEvent> Kw;
    @EventLink(cH=3)
    Listener<MoveInputEvent> yv;
    @EventLink(cH=1)
    Listener<en> pb;
    @EventLink(cH=1)
    Listener<PreUpdateEvent> dq;
    @EventLink
    public final Listener<MoveInputEvent> Kx;
    @EventLink
    public final Listener<MoveEvent> Ky;

    public WatchdogMode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.Kg = new d[]{WatchdogMode.aER.aIY.chm, WatchdogMode.aER.aIY.cho, WatchdogMode.aER.aIY.chp, WatchdogMode.aER.aIY.chn, WatchdogMode.aER.aIY.chq};
        this.Kh = new BooleanValue("Prediction Mode", (Mode<?>)this, (Boolean)false);
        this.Ki = new NumberValue("Ticks", this, (Number)1, (Number)1, (Number)20, (Number)1);
        this.Kj = new BooleanValue("Measure Chest Open", (Mode<?>)this, (Boolean)true);
        this.Kl = -1;
        this.Km = -1;
        this.Kn = -1;
        this.Kq = "unknown";
        this.Kr = "unknown";
        this.Ku = preMotionEvent -> {
            if (WatchdogMode.aER.bgR == null || WatchdogMode.aER.bgR instanceof f || WatchdogMode.aER.bgR == this.v()) {
                return;
            }
            if (WatchdogMode.aER.bgR instanceof h) {
                // empty if block
            }
            for (d d2 : this.Kg) {
                d2.ay(a.a(d2));
            }
            if (!Ke || WatchdogMode.aER.bgK.aRg % 2 == 0) {
                // empty if block
            }
        };
        this.Kv = packetSendEvent -> {
            aj<b> aj2;
            aj<?> aj3 = packetSendEvent.dq();
            if (!packetSendEvent.isCancelled() && WatchdogMode.aER.bgK != null && WatchdogMode.aER.bgF != null && ((Boolean)this.Kj.wD()).booleanValue() && aj3 instanceof k) {
                aj2 = (k)aj3;
                net.minecraft.util.b b2 = ((k)aj2).yl();
                if (!(WatchdogMode.aER.bgR instanceof h) && this.h(b2)) {
                    this.Kp = b2;
                    this.Kr = "C08 at " + String.valueOf(b2);
                    this.Ks = true;
                }
            } else if (!packetSendEvent.isCancelled() && WatchdogMode.aER.bgK != null && WatchdogMode.aER.bgF != null && ((Boolean)this.Kj.wD()).booleanValue() && aj3 instanceof net.minecraft.network.play.client.c) {
                aj2 = (net.minecraft.network.play.client.c)aj3;
                c c2 = ((net.minecraft.network.play.client.c)aj2).j(WatchdogMode.aER.bgF);
                if (!(WatchdogMode.aER.bgR instanceof h) && ((net.minecraft.network.play.client.c)aj2).afQ() != net.minecraft.network.play.client.d.daU && this.o(c2)) {
                    this.Kp = null;
                    this.Kr = "C02 at " + c2.xU() + " (" + c2.getEntityId() + ")";
                    this.Ks = true;
                }
            }
            if (aj3 instanceof r) {
                aj2 = (r)aj3;
                if (WatchdogMode.aER.bgR instanceof q && ((r)aj2).getMode() < 1 && ((r)aj2).agd() != null) {
                    Kd = true;
                }
            }
        };
        this.Kw = preMotionEvent -> {
            d[] dArray;
            d[] dArray2;
            if (!(WatchdogMode.aER.bgR instanceof q)) {
                Kd = false;
            }
            if ((dArray2 = WatchdogMode.aER.bgR) instanceof q) {
                dArray = dArray2;
                if (!Kd && !bb.a(false, false, false, false, true)) {
                    WatchdogMode.aER.bgK.bkd.v(new net.minecraft.network.play.client.q(dArray.bwi.cSL));
                }
            }
            if ((WatchdogMode.aER.bgR instanceof h || Kd) && !((Boolean)this.Kh.wD()).booleanValue()) {
                if (this.e(Speed.class).isEnabled() && !this.Ka) {
                    WatchdogMode.aER.bgK.uf *= -0.1;
                    WatchdogMode.aER.bgK.ud *= -0.1;
                    this.Ka = true;
                }
                if (WatchdogMode.aER.bgK.crx < 10 && !(Math.abs(WatchdogMode.aER.bgK.gX - (double)Math.round(WatchdogMode.aER.bgK.gX)) > 0.03) && !(WatchdogMode.aER.bgR instanceof h)) {
                    aii.strafe(0.0365);
                } else if (!WatchdogMode.aER.bgK.aO) {
                    aii.stop();
                } else if (WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw) && 1 + WatchdogMode.aER.bgK.b(net.minecraft.potion.a.dgw).ajf() > 1) {
                    aii.strafe(0.0185 * (double)(1 + WatchdogMode.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()));
                } else if (WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw) && 1 + WatchdogMode.aER.bgK.b(net.minecraft.potion.a.dgw).ajf() == 1) {
                    aii.strafe(0.0635 * (double)(1 + WatchdogMode.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()));
                } else {
                    aii.strafe(0.09);
                }
                if (WatchdogMode.aER.bgK.cuU && WatchdogMode.aER.bgK.aO) {
                    aii.stop();
                } else if (WatchdogMode.aER.bgK.cuU) {
                    aii.stop();
                }
                aii.preventDiagonalSpeed();
            } else if (this.Ka) {
                this.e(Speed.class).setEnabled(true);
                this.Ka = false;
            }
            if ((WatchdogMode.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue() && !WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                preMotionEvent.setSprinting(false);
                WatchdogMode.aER.aIY.chs.ay(false);
                WatchdogMode.aER.aIY.chq.ay(false);
                for (d d2 : dArray = new d[]{WatchdogMode.aER.aIY.chm, WatchdogMode.aER.aIY.chp, WatchdogMode.aER.aIY.cho, WatchdogMode.aER.aIY.chn}) {
                    if (!d2.Re()) continue;
                    ++this.Kf;
                }
            } else if ((WatchdogMode.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue()) {
                preMotionEvent.setSprinting(false);
            }
        };
        this.yv = moveInputEvent -> {
            this.jp = moveInputEvent.getForward();
            this.jq = moveInputEvent.getStrafe();
        };
        this.pb = en2 -> {
            if (WatchdogMode.aER.bgR instanceof h || Kd) {
                WatchdogMode.aER.bgK.setSprinting(false);
            }
        };
        this.dq = preUpdateEvent -> {
            if (WatchdogMode.aER.bgK == null || WatchdogMode.aER.bgF == null || WatchdogMode.aER.bgK.aRg < 50) {
                return;
            }
            this.hC();
            this.hB();
            this.hD();
            d[] dArray = new d[]{WatchdogMode.aER.aIY.chm, WatchdogMode.aER.aIY.chp, WatchdogMode.aER.aIY.cho, WatchdogMode.aER.aIY.chn};
            int n2 = 0;
            for (d d2 : dArray) {
                if (!d2.Re()) continue;
                ++n2;
            }
            if ((WatchdogMode.aER.bgR instanceof h || Kd) && n2 > 1) {
                bs.a(new Vector2f((float)Math.toDegrees(aii.g(this.jp, this.jq)), WatchdogMode.aER.bgK.pm), 10.0, cb.gH);
            }
        };
        this.Kx = moveInputEvent -> {
            d[] dArray = new d[]{WatchdogMode.aER.aIY.chm, WatchdogMode.aER.aIY.chp, WatchdogMode.aER.aIY.cho, WatchdogMode.aER.aIY.chn};
            int n2 = 0;
            for (d d2 : dArray) {
                if (!d2.Re()) continue;
                ++n2;
            }
            if (Ke && WatchdogMode.aER.bgK.aRg % 5 != 0 && WatchdogMode.aER.bgR instanceof h) {
                moveInputEvent.setStrafe(0.0f);
                moveInputEvent.setForward(0.0f);
            }
            if (!(WatchdogMode.aER.bgR instanceof h)) {
                Ke = false;
            }
            if (n2 == 2) {
                // empty if block
            }
            if ((WatchdogMode.aER.bgR instanceof h || Kd) && ((Boolean)this.Kh.wD()).booleanValue() && (WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw) || !WatchdogMode.aER.bgK.aO)) {
                moveInputEvent.setStrafe(0.0f);
                moveInputEvent.setForward(0.0f);
            } else if (Kd && !this.Kb) {
                moveInputEvent.setStrafe(0.0f);
                moveInputEvent.setForward(0.0f);
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
            if (!(WatchdogMode.aER.bgR instanceof h) && !Kd) {
                this.Kb = false;
            }
        };
        this.Ky = moveEvent -> {
            if ((WatchdogMode.aER.bgR instanceof h || Kd) && !((Boolean)this.Kh.wD()).booleanValue() && !WatchdogMode.aER.bgK.aO) {
                moveEvent.setPosZ(0.0);
                moveEvent.setPosX(0.0);
            }
        };
    }

    private void hB() {
        if (!this.Kt) {
            return;
        }
        if (WatchdogMode.aER.bgR instanceof h) {
            int n2;
            this.Km = n2 = WatchdogMode.aER.bgK.aRg - this.Kl;
            if (this.Kn == -1) {
                this.Kn = WatchdogMode.aER.bgK.aRg;
            }
            this.Kt = false;
            return;
        }
        if (WatchdogMode.aER.bgK.aRg - this.Kl > 40) {
            this.Kt = false;
        }
    }

    private void hC() {
        if (!this.Ks) {
            return;
        }
        this.Kl = WatchdogMode.aER.bgK.aRg;
        this.Ko = this.Kp;
        this.Kq = this.Kr;
        this.Ks = false;
        this.Kt = true;
    }

    private void hD() {
        if (!(WatchdogMode.aER.bgR instanceof h)) {
            this.Kn = -1;
            Ke = false;
            return;
        }
        if (this.Kn == -1) {
            this.Kn = WatchdogMode.aER.bgK.aRg;
        }
        if (!Ke && this.Km >= 0 && WatchdogMode.aER.bgK.aRg - this.Kn >= this.Km - ((Number)this.Ki.wD()).intValue()) {
            Ke = true;
        }
    }

    private boolean h(net.minecraft.util.b b2) {
        if (b2 == null || WatchdogMode.aER.bgF == null || b2.equals(new net.minecraft.util.b(-1, -1, -1))) {
            return false;
        }
        Block block = WatchdogMode.aER.bgF.L(b2).df();
        return block == Blocks.cMg || block == Blocks.cOi || block == Blocks.cNS;
    }

    private boolean o(c c2) {
        if (c2 == null || c2 == WatchdogMode.aER.bgK) {
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

