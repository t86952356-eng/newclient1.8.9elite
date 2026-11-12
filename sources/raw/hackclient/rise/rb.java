/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.cy;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.mh;
import hackclient.rise.mo;
import hackclient.rise.rc;
import hackclient.rise.rd;
import net.minecraft.block.BlockChest;
import net.minecraft.client.entity.c;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.b;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.bs;
import net.minecraft.network.play.server.t;
import net.minecraft.potion.a;

public final class rb
extends akg<mo> {
    private int SS;
    private int ST;
    private final aki SU = new aki("Maximise Speed", (akg<?>)this, (Boolean)true);
    private final akq SV = new akq("Sneak Timer", this, (Number)2.5, (Number)1.6, (Number)10, (Number)0.1);
    private final akq SW = new akq("Longjump Speed", this, (Number)3, (Number)0.1, (Number)3, (Number)0.05);
    private final akq SX = new akq("Height", this, (Number)25, (Number)10, (Number)50, (Number)1);
    private double xv;
    private boolean im;
    private static final double SY = 0.03333333333333333;
    private final rc SZ = new rc();
    private int aR = 0;
    private int Ta = 0;
    private long Tb = 0L;
    @dm
    public final dk<eo> Tc = eo2 -> {
        double d2;
        c c2 = rb.aER.bgK;
        if (rb.aER.bgK.aO && this.e(lw.class).isEnabled()) {
            rb.aER.bgK.jump();
        }
        rb.aER.bgC.dAp = 1.5f;
        if (c2.aO && this.SZ.Tk.y < 0.0) {
            this.SZ.Tk.d(0.0, 0.0, 0.0);
        }
        if (c2.aO && c2.ue == aii.jumpMotion()) {
            this.Ta = Math.min(this.Ta + 1, 3);
            this.SZ.Ti.a(new rd(0.0, 8.0, 0.0));
        }
        int n2 = this.aR = c2.aO ? this.aR + 1 : 0;
        if (this.aR > 5) {
            this.Ta = 0;
        }
        if (c2.crR) {
            this.SZ.Tk.d(0.0, 8.6, 0.0);
        }
        c2.uf = 0.0;
        c2.ud = 0.0;
        c2.gX = 0.0;
        boolean bl2 = System.currentTimeMillis() < this.Tb;
        double d3 = d2 = c2.isUsingItem() ? 0.06 : 0.26 + 0.025 * (double)this.Ta;
        if (rb.aER.bgK.a(a.dgw)) {
            d2 = ((Boolean)this.SU.wD()).booleanValue() ? (d2 += 0.105 + (double)rb.aER.bgK.b(a.dgw).ajf() * 0.04) : (d2 += 0.1 + (double)rb.aER.bgK.b(a.dgw).ajf() * 0.04);
        }
        if (((Boolean)this.SU.wD()).booleanValue()) {
            d2 += 0.00698;
        }
        eo2.setSpeed(bl2 ? 1.0 : d2);
        if (rb.aER.bgK.ae == 1) {
            this.xv = ((Number)this.SW.wD()).doubleValue();
        }
        c2.ue = this.SZ.hO().y * 0.03333333333333333;
        if (rb.aER.bgK.Zz == 1) {
            afl.c(rb.aER.bgK.ae, new Object[0]);
        }
        if (rb.aER.bgK.ae < 41 && this.e(lz.class).isEnabled()) {
            rb.aER.bgC.dAp = 1.5f;
            this.xv -= this.xv / 109.0;
            rb.aER.bgK.ue = 0.0;
            this.SZ.Tk.y = -0.1;
            this.SZ.Ti.y = -0.1;
            this.SZ.Tj.y = -0.1;
            if ((!aii.isMoving() || rb.aER.bgK.crR) && this.e(lz.class).isEnabled()) {
                eo2.setSpeed(0.3);
                if (!rb.aER.bgK.crR) {
                    // empty if block
                }
            } else if (this.e(lz.class).isEnabled()) {
                eo2.setSpeed(this.xv);
            }
        }
        if (rb.aER.bgK.crR && this.e(lw.class).isEnabled()) {
            this.SZ.Tk.y = ((Number)this.SX.wD()).intValue();
            this.SZ.Ti.y = ((Number)this.SX.wD()).intValue();
            this.SZ.Tj.y = ((Number)this.SX.wD()).intValue();
        }
        if (this.e(lw.class).isEnabled() && rb.aER.bgK.tR < 12 && this.Ta < 3 || this.e(lw.class).isEnabled() && rb.aER.aIY.chr.Re()) {
            this.SZ.Tj.y = -10.0;
            this.SZ.Ti.y = -0.01;
            rb.aER.bgC.dAp = 1.6f;
        }
        if (this.e(lw.class).isEnabled() && !rb.aER.aIY.chr.Re() && rb.aER.bgK.ue < 0.0 && rb.aER.bgK.tR > 30) {
            this.SZ.Tk.y += 0.06;
        }
        if (this.Ta < 3 && this.e(mh.class).isEnabled() && rb.aER.bgK.tR < 12) {
            this.SZ.Tj.y = -10.0;
            this.SZ.Ti.y = -0.01;
        }
        if (rb.aER.bgK.ae != 13 || this.e(lz.class).isEnabled()) {
            // empty if block
        }
        if (rb.aER.aIY.chr.Re() && cy.il > -390.0 && (!this.e(lw.class).isEnabled() || rb.aER.bgK.tR <= 30)) {
            rb.aER.bgC.dAp = ((Number)this.SV.wD()).floatValue();
        } else if (rb.aER.aIY.chr.Re() && rb.aER.bgK.aRg % 5 == 0 && (!this.e(lw.class).isEnabled() || rb.aER.bgK.tR <= 30)) {
            afl.b("Your Balance has ran out", new Object[0]);
        }
        if (rb.aER.bgK.ae < 10) {
            // empty if block
        }
    };
    @dm
    public final dk<dz> Td = dz2 -> {
        if (rb.aER.bgK.ae >= 41 || !aii.isMoving()) {
            // empty if block
        }
        dz2.setSneak(false);
    };
    @dm
    public final dk<fh> Te = fh2 -> {
        bs bs2;
        if (fh2.dq() instanceof t) {
            t t2 = (t)fh2.dq();
            if (rb.aER.bgK != null && t2.getEntityID() == rb.aER.bgK.getEntityId()) {
                this.Tb = System.currentTimeMillis() + 1300L;
            }
        } else if (fh2.dq() instanceof bs && "bloxd:resyncphysics".equals((bs2 = (bs)fh2.dq()).getChannelName())) {
            ak ak2 = bs2.agj();
            this.Ta = 0;
            this.SZ.Tj.d(0.0, 0.0, 0.0);
            this.SZ.Ti.d(0.0, 0.0, 0.0);
            this.SZ.Tk.d(ak2.readFloat(), ak2.readFloat(), ak2.readFloat());
        }
    };
    @dm
    public final dk<fi> Tf = fi2 -> {
        e e2 = fi2.dq();
        if (e2 instanceof e) {
            e e3 = e2;
            e2 = (e)fi2.dq();
            if (!(e2 instanceof h || !e3.isMoving() && rb.aER.bgK.aO)) {
                fi2.setCancelled(true);
                double d2 = rb.aER.bgK.gW;
                double d3 = rb.aER.bgK.gX;
                double d4 = rb.aER.bgK.gY;
                float f2 = rb.aER.bgK.pl;
                float f3 = rb.aER.bgK.pm;
                boolean bl2 = rb.aER.bgK.aO;
                h h2 = new h(d2, d3, d4, f2, f3, bl2);
                this.im = e3.aO;
                aER.AU().u(h2);
            }
        }
    };
    @dm
    public final dk<ei> Tg = ei2 -> {
        if (rb.aER.bgK.aRg < 2) {
            aER.AU().u(new b("/servername Rise"));
        }
        if (rb.aER.bgK.aO) {
            // empty if block
        }
        if (rb.aER.bgK.ae >= 41 || this.e(lz.class).isEnabled()) {
            // empty if block
        }
    };
    @dm
    public final dk<es> Th = es2 -> {
        if (es2.df() instanceof BlockChest) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            es2.a(net.minecraft.util.a.h(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).ae(d2, d3, d4));
        }
        net.minecraft.util.a a2 = es2.dh();
    };

    public rb(String string, mo mo2) {
        super(string, mo2);
    }

    @Override
    public void onEnable() {
        aER.AU().u(new b("/servername Rise"));
    }
}

