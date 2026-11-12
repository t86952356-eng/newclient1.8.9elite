/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.fg;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.Stuck;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.autostuck.name"}, description="module.movement.autostuck.description", category=Category.MOVEMENT)
public final class AutoStuck
extends Module {
    private final NumberValue CO = new NumberValue("Pulse Ticks", this, (Number)1.0, (Number)1.0, (Number)10.0, (Number)1.0);
    private final BooleanValue CP = new BooleanValue("Use Pearl", (Module)this, (Boolean)true);
    private final BooleanValue CQ = new BooleanValue("Require Void", (Module)this, (Boolean)true);
    private final BooleanValue CR = new BooleanValue("Lock Movement", (Module)this, (Boolean)true);
    private final NumberValue CS = new NumberValue("Min Fall Distance", this, (Number)5.0, (Number)0.0, (Number)50.0, (Number)0.5);
    private final NumberValue CT = new NumberValue("Min Void Depth", this, (Number)5.0, (Number)1.0, (Number)200.0, (Number)1.0);
    private final NumberValue CU = new NumberValue("Search Radius", this, (Number)10.0, (Number)2.0, (Number)40.0, (Number)1.0);
    private ExecutorService k;
    private Future<?> CV;
    private boolean CW;
    private boolean CX;
    private boolean CY;
    private int CZ;
    private static final int Da = 3;
    private Vector2f fm;
    private int Db;
    private int Dc = -1;
    private int Dd = 0;
    @EventLink
    public final Listener<fg> De = fg2 -> {
        this.ha();
        this.hc();
        this.CW = false;
        this.CY = false;
        this.CX = false;
        this.CZ = 0;
        this.Db = 0;
        this.fm = null;
        this.Dc = -1;
        this.Dd = 0;
    };
    @EventLink
    public final Listener<PreUpdateEvent> Df = preUpdateEvent -> {
        boolean bl2;
        if (AutoStuck.aER.bgK == null || AutoStuck.aER.bgF == null) {
            return;
        }
        boolean bl3 = this.hf() != -1;
        boolean bl4 = bl2 = (Boolean)this.CQ.wD() != false ? this.he() : this.hd();
        if (bl2) {
            if (!this.CW) {
                this.CW = true;
                this.CZ = 0;
            }
            if (AutoStuck.aER.bgK.aRg % ((Number)this.CO.wD()).intValue() != 0) {
                this.hb();
            } else {
                this.hc();
            }
            if (((Boolean)this.CP.wD()).booleanValue() && bl3) {
                this.hg();
            }
        } else if (this.CW) {
            this.CW = false;
            this.CY = false;
            this.Db = 0;
            this.ha();
            this.hc();
            this.Dc = -1;
            this.Dd = 0;
        }
        if (((Boolean)this.CP.wD()).booleanValue() && !bl3) {
            this.CY = false;
            this.Db = 0;
            this.Dc = -1;
            this.Dd = 0;
        }
        if (this.CW && this.CY && this.fm != null) {
            bs.a(this.fm, 10.0, cb.gG);
            if (this.Db++ >= 1) {
                this.Db = 0;
                this.CY = false;
                this.hh();
            }
        }
        if (this.Dc != -1) {
            if (this.Dd > 0) {
                --this.Dd;
            } else {
                this.t(this.Dc);
                this.Dc = -1;
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Dg = moveInputEvent -> {
        if (((Boolean)this.CR.wD()).booleanValue() && this.CW) {
            moveInputEvent.setForward(0.0f);
            moveInputEvent.setStrafe(0.0f);
            moveInputEvent.setJump(false);
            moveInputEvent.setSneak(false);
        }
    };

    @Override
    public void onEnable() {
        this.CW = false;
        this.CX = false;
        this.CY = false;
        this.CZ = 0;
        this.Db = 0;
        this.fm = null;
        this.Dc = -1;
        this.Dd = 0;
        if (this.k == null || this.k.isShutdown()) {
            this.k = Executors.newSingleThreadExecutor();
        }
    }

    @Override
    public void onDisable() {
        this.ha();
        this.hc();
        this.CW = false;
        this.CY = false;
        this.CX = false;
        this.CZ = 0;
        this.Db = 0;
        this.fm = null;
        this.Dc = -1;
        this.Dd = 0;
        if (this.k != null) {
            this.k.shutdownNow();
        }
    }

    private void ha() {
        if (this.CV != null && !this.CV.isDone()) {
            this.CV.cancel(true);
        }
        this.CV = null;
    }

    private void hb() {
        Stuck stuck = this.e(Stuck.class);
        if (stuck != null && !stuck.isEnabled()) {
            stuck.setEnabled(true);
        }
    }

    private void hc() {
        Stuck stuck = this.e(Stuck.class);
        if (stuck != null && stuck.isEnabled()) {
            stuck.setEnabled(false);
        }
    }

    private boolean hd() {
        return AutoStuck.aER.bgK != null && !AutoStuck.aER.bgK.aO && AutoStuck.aER.bgK.csf >= ((Number)this.CS.wD()).floatValue();
    }

    private boolean he() {
        b b2;
        if (!this.hd()) {
            return false;
        }
        b b3 = new b(AutoStuck.aER.bgK.gW, AutoStuck.aER.bgK.gX, AutoStuck.aER.bgK.gY);
        b b4 = b3.aqY();
        if (!AutoStuck.aER.bgF.aG(b4)) {
            return false;
        }
        int n2 = 0;
        int n3 = ((Number)this.CT.wD()).intValue();
        for (int i2 = b4.wu(); i2 > 0 && n2 < n3 + 256 && AutoStuck.aER.bgF.aG(b2 = new b(b3.wt(), i2, b3.wx())); --i2) {
            if (++n2 < n3) continue;
            return true;
        }
        return n2 >= n3;
    }

    private int hf() {
        if (AutoStuck.aER.bgK == null) {
            return -1;
        }
        for (int i2 = 0; i2 < AutoStuck.aER.bgK.cHV.cJC.length; ++i2) {
            co co2 = AutoStuck.aER.bgK.cHV.cJC[i2];
            if (co2 == null || co2.bP() != Items.cRy) continue;
            return i2;
        }
        return -1;
    }

    private void hg() {
        if (this.CX || this.CZ >= 3) {
            return;
        }
        this.CX = true;
        ++this.CZ;
        da da2 = AutoStuck.aER.bgK.Sd();
        this.CV = this.k.submit(() -> {
            try {
                Optional<da> optional = this.a(da2, (int)((Number)this.CU.wD()).doubleValue());
                if (optional.isPresent()) {
                    this.fm = this.c(optional.get());
                    this.CY = this.fm != null;
                }
            }
            catch (Throwable throwable) {
            }
            finally {
                this.CX = false;
            }
        });
    }

    private Optional<da> a(da da2, int n2) {
        if (AutoStuck.aER.bgF == null) {
            return Optional.empty();
        }
        int n3 = (int)Math.floor(da2.dAG);
        int n4 = (int)Math.floor(da2.dAH);
        int n5 = (int)Math.floor(da2.dAI);
        da da3 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    da da4;
                    double d3;
                    b b2 = new b(n3 + i2, n4 + i4, n5 + i3);
                    if (AutoStuck.aER.bgF.aG(b2) || !AutoStuck.aER.bgF.aG(b2.aqX()) || !AutoStuck.aER.bgF.aG(b2.hq(2)) || !((d3 = (da4 = new da((double)b2.wt() + 0.5, (double)b2.wu() + 1.0, (double)b2.wx() + 0.5)).y(da2)) < d2)) continue;
                    d2 = d3;
                    da3 = da4;
                }
            }
        }
        return da3 == null ? Optional.empty() : Optional.of(da3);
    }

    private void hh() {
        if (AutoStuck.aER.bgK == null || AutoStuck.aER.bgF == null) {
            return;
        }
        if (!((Boolean)this.CP.wD()).booleanValue()) {
            return;
        }
        int n2 = this.hf();
        if (n2 == -1) {
            return;
        }
        if (n2 <= 8) {
            int n3;
            this.Dc = n3 = n2;
            this.Dd = 0;
        } else {
            int n4 = this.hi();
            if (n4 == -1) {
                n4 = 0;
            }
            int n5 = AutoStuck.aER.bgK.cHX.cSL;
            int n6 = n2;
            AutoStuck.aER.bgu.a(n5, n6, n4, 2, AutoStuck.aER.bgK);
            this.Dc = n4;
            this.Dd = 1;
        }
    }

    private int hi() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (AutoStuck.aER.bgK.cHV.cJC[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    private void t(int n2) {
        if (AutoStuck.aER.bgK == null || AutoStuck.aER.bgF == null) {
            return;
        }
        int n3 = AutoStuck.aER.bgK.cHV.cJE;
        AutoStuck.aER.bgK.cHV.cJE = n2;
        AutoStuck.aER.bgu.Ht();
        co co2 = AutoStuck.aER.bgK.Vk();
        if (co2 != null && co2.bP() == Items.cRy) {
            AutoStuck.aER.bgu.a((a)AutoStuck.aER.bgK, AutoStuck.aER.bgF, co2);
        }
        AutoStuck.aER.bgK.cHV.cJE = n3;
        AutoStuck.aER.bgu.Ht();
    }

    private Vector2f c(da da2) {
        double d2;
        if (AutoStuck.aER.bgK == null) {
            return null;
        }
        da da3 = new da(AutoStuck.aER.bgK.gW, AutoStuck.aER.bgK.gX + (double)AutoStuck.aER.bgK.getEyeHeight(), AutoStuck.aER.bgK.gY);
        double d3 = da2.dAG - da3.dAG;
        double d4 = da2.dAI - da3.dAI;
        double d5 = da2.dAH - da3.dAH;
        double d6 = Math.sqrt(d3 * d3 + d4 * d4);
        if (d6 < 0.001) {
            return null;
        }
        float f2 = (float)(Math.toDegrees(Math.atan2(d4, d3)) - 90.0);
        double d7 = 1.5;
        double d8 = 0.03;
        double d9 = 2.25;
        double d10 = 5.0625 - 0.03 * (0.03 * d6 * d6 + 2.0 * d5 * 2.25);
        if (d10 > 0.0) {
            double d11 = Math.sqrt(d10);
            double d12 = (2.25 - d11) / (0.03 * d6);
            double d13 = Math.atan(d12);
            d2 = -Math.toDegrees(d13);
        } else {
            d2 = -45.0;
        }
        d2 -= 4.0;
        d2 = Math.max(-89.0, Math.min(-1.0, d2));
        return new Vector2f(f2, (float)d2);
    }
}

