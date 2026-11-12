/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.terrainspeed;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.cy;
import hackclient.rise.es;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.module.impl.movement.TerrainSpeed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class BloxdMode
extends Mode<TerrainSpeed> {
    private int SS;
    private int ST;
    private final BooleanValue SU = new BooleanValue("Maximise Speed", (Mode<?>)this, (Boolean)true);
    private final NumberValue SV = new NumberValue("Sneak Timer", this, (Number)2.5, (Number)1.6, (Number)10, (Number)0.1);
    private final NumberValue SW = new NumberValue("Longjump Speed", this, (Number)3, (Number)0.1, (Number)3, (Number)0.05);
    private final NumberValue SX = new NumberValue("Height", this, (Number)25, (Number)10, (Number)50, (Number)1);
    private double xv;
    private boolean im;
    private static final double SY = 0.03333333333333333;
    private final rc SZ = new rc();
    private int aR = 0;
    private int Ta = 0;
    private long Tb = 0L;
    @EventLink
    public final Listener<StrafeEvent> Tc = strafeEvent -> {
        double d2;
        c c2 = BloxdMode.aER.bgK;
        if (BloxdMode.aER.bgK.aO && this.e(Flight.class).isEnabled()) {
            BloxdMode.aER.bgK.jump();
        }
        BloxdMode.aER.bgC.dAp = 1.5f;
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
        if (BloxdMode.aER.bgK.a(a.dgw)) {
            d2 = ((Boolean)this.SU.wD()).booleanValue() ? (d2 += 0.105 + (double)BloxdMode.aER.bgK.b(a.dgw).ajf() * 0.04) : (d2 += 0.1 + (double)BloxdMode.aER.bgK.b(a.dgw).ajf() * 0.04);
        }
        if (((Boolean)this.SU.wD()).booleanValue()) {
            d2 += 0.00698;
        }
        strafeEvent.setSpeed(bl2 ? 1.0 : d2);
        if (BloxdMode.aER.bgK.ae == 1) {
            this.xv = ((Number)this.SW.wD()).doubleValue();
        }
        c2.ue = this.SZ.hO().y * 0.03333333333333333;
        if (BloxdMode.aER.bgK.Zz == 1) {
            afl.c(BloxdMode.aER.bgK.ae, new Object[0]);
        }
        if (BloxdMode.aER.bgK.ae < 41 && this.e(LongJump.class).isEnabled()) {
            BloxdMode.aER.bgC.dAp = 1.5f;
            this.xv -= this.xv / 109.0;
            BloxdMode.aER.bgK.ue = 0.0;
            this.SZ.Tk.y = -0.1;
            this.SZ.Ti.y = -0.1;
            this.SZ.Tj.y = -0.1;
            if ((!aii.isMoving() || BloxdMode.aER.bgK.crR) && this.e(LongJump.class).isEnabled()) {
                strafeEvent.setSpeed(0.3);
                if (!BloxdMode.aER.bgK.crR) {
                    // empty if block
                }
            } else if (this.e(LongJump.class).isEnabled()) {
                strafeEvent.setSpeed(this.xv);
            }
        }
        if (BloxdMode.aER.bgK.crR && this.e(Flight.class).isEnabled()) {
            this.SZ.Tk.y = ((Number)this.SX.wD()).intValue();
            this.SZ.Ti.y = ((Number)this.SX.wD()).intValue();
            this.SZ.Tj.y = ((Number)this.SX.wD()).intValue();
        }
        if (this.e(Flight.class).isEnabled() && BloxdMode.aER.bgK.tR < 12 && this.Ta < 3 || this.e(Flight.class).isEnabled() && BloxdMode.aER.aIY.chr.Re()) {
            this.SZ.Tj.y = -10.0;
            this.SZ.Ti.y = -0.01;
            BloxdMode.aER.bgC.dAp = 1.6f;
        }
        if (this.e(Flight.class).isEnabled() && !BloxdMode.aER.aIY.chr.Re() && BloxdMode.aER.bgK.ue < 0.0 && BloxdMode.aER.bgK.tR > 30) {
            this.SZ.Tk.y += 0.06;
        }
        if (this.Ta < 3 && this.e(Speed.class).isEnabled() && BloxdMode.aER.bgK.tR < 12) {
            this.SZ.Tj.y = -10.0;
            this.SZ.Ti.y = -0.01;
        }
        if (BloxdMode.aER.bgK.ae != 13 || this.e(LongJump.class).isEnabled()) {
            // empty if block
        }
        if (BloxdMode.aER.aIY.chr.Re() && cy.il > -390.0 && (!this.e(Flight.class).isEnabled() || BloxdMode.aER.bgK.tR <= 30)) {
            BloxdMode.aER.bgC.dAp = ((Number)this.SV.wD()).floatValue();
        } else if (BloxdMode.aER.aIY.chr.Re() && BloxdMode.aER.bgK.aRg % 5 == 0 && (!this.e(Flight.class).isEnabled() || BloxdMode.aER.bgK.tR <= 30)) {
            afl.b("Your Balance has ran out", new Object[0]);
        }
        if (BloxdMode.aER.bgK.ae < 10) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Td = moveInputEvent -> {
        if (BloxdMode.aER.bgK.ae >= 41 || !aii.isMoving()) {
            // empty if block
        }
        moveInputEvent.setSneak(false);
    };
    @EventLink
    public final Listener<PacketReceiveEvent> Te = packetReceiveEvent -> {
        bs bs2;
        if (packetReceiveEvent.dq() instanceof t) {
            t t2 = (t)packetReceiveEvent.dq();
            if (BloxdMode.aER.bgK != null && t2.getEntityID() == BloxdMode.aER.bgK.getEntityId()) {
                this.Tb = System.currentTimeMillis() + 1300L;
            }
        } else if (packetReceiveEvent.dq() instanceof bs && "bloxd:resyncphysics".equals((bs2 = (bs)packetReceiveEvent.dq()).getChannelName())) {
            ak ak2 = bs2.agj();
            this.Ta = 0;
            this.SZ.Tj.d(0.0, 0.0, 0.0);
            this.SZ.Ti.d(0.0, 0.0, 0.0);
            this.SZ.Tk.d(ak2.readFloat(), ak2.readFloat(), ak2.readFloat());
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Tf = packetSendEvent -> {
        e e2 = packetSendEvent.dq();
        if (e2 instanceof e) {
            e e3 = e2;
            e2 = (e)packetSendEvent.dq();
            if (!(e2 instanceof h || !e3.isMoving() && BloxdMode.aER.bgK.aO)) {
                packetSendEvent.setCancelled(true);
                double d2 = BloxdMode.aER.bgK.gW;
                double d3 = BloxdMode.aER.bgK.gX;
                double d4 = BloxdMode.aER.bgK.gY;
                float f2 = BloxdMode.aER.bgK.pl;
                float f3 = BloxdMode.aER.bgK.pm;
                boolean bl2 = BloxdMode.aER.bgK.aO;
                h h2 = new h(d2, d3, d4, f2, f3, bl2);
                this.im = e3.onGround;
                aER.AU().u(h2);
            }
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Tg = preMotionEvent -> {
        if (BloxdMode.aER.bgK.aRg < 2) {
            aER.AU().u(new b("/servername Rise"));
        }
        if (BloxdMode.aER.bgK.aO) {
            // empty if block
        }
        if (BloxdMode.aER.bgK.ae >= 41 || this.e(LongJump.class).isEnabled()) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<es> Th = es2 -> {
        if (es2.df() instanceof BlockChest) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            es2.a(net.minecraft.util.a.h(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).ae(d2, d3, d4));
        }
        net.minecraft.util.a a2 = es2.dh();
    };

    public BloxdMode(String string, TerrainSpeed terrainSpeed) {
        super(string, terrainSpeed);
    }

    @Override
    public void onEnable() {
        aER.AU().u(new b("/servername Rise"));
    }
}

