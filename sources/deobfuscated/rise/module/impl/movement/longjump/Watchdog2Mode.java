/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ait;
import hackclient.rise.bm;
import hackclient.rise.cg;
import hackclient.rise.ci;
import hackclient.rise.cl;
import hackclient.rise.gg;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.t;
import net.minecraft.util.a;
import net.minecraft.util.b;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render3DEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class Watchdog2Mode
extends Mode<LongJump> {
    public final BooleanValue Mg = new BooleanValue("Timer", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Mh = new BooleanValue("Fly Mode", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Mi = new BooleanValue("Allow Damage Move", (Mode<?>)this, (Boolean)false);
    private final NumberValue Mj = new NumberValue("Delay Boost (go further with less height)", this, (Number)2, (Number)0, (Number)8, (Number)1);
    public static boolean Mk;
    public static boolean Ml;
    public static int hQ;
    double jy;
    boolean Mm;
    public static int Mn;
    public static int Mo;
    private final List<b> Mp = new ArrayList<b>();
    private boolean Mq = false;
    private double Mr;
    private double Ms;
    private double Mt;
    private double Mu;
    private double Mv;
    public static double Mw;
    @EventLink
    public final Listener<PacketReceiveEvent> Mx = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (packetReceiveEvent.isCancelled() || t2.getEntityID() != Watchdog2Mode.aER.bgK.getEntityId()) break;
                double d2 = (double)t2.agN() / 8000.0;
                double d3 = (double)t2.agP() / 8000.0;
                Mw = Math.hypot(d2, d3);
                if (hQ > Mn && Mw > 0.0 && (double)t2.agO() / 8000.0 > 0.4) {
                    afl.c(aii.speed(), new Object[0]);
                    aii.strafe(0.459999);
                    Watchdog2Mode.aER.bgK.ue = (double)t2.agO() / 8000.0;
                    Watchdog2Mode.aER.bgK.ae = 0;
                    Ml = false;
                    Mk = true;
                    afl.c(aii.speed(), new Object[0]);
                } else {
                    Mk = false;
                    cg.a("Watchdog Longjump", "Bad knockback detected from the server... Cancelling and trying to save you from the void", 5000);
                }
                packetReceiveEvent.cF();
                break;
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> My = moveInputEvent -> {
        if (hQ < Mo && hQ > 7) {
            moveInputEvent.setForward(100.0f);
            moveInputEvent.setJump(false);
        }
    };
    @EventLink
    public final Listener<MoveEvent> Mz = moveEvent -> {
        if (!(hQ >= Mo || hQ <= 7 && ((Boolean)this.Mi.wD()).booleanValue())) {
            moveEvent.setPosZ(0.0);
            moveEvent.setPosX(0.0);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> MA = strafeEvent -> {
        if ((Watchdog2Mode.aER.bgK.gX > this.jy || Watchdog2Mode.aER.bgK.tR < 14) && ((Boolean)this.Mh.wD()).booleanValue()) {
            cl.cn();
        }
        if (Watchdog2Mode.aER.bgK.tR == 1) {
            // empty if block
        }
        aii.useDiagonalSpeed();
        if (hQ < 8) {
            if (Watchdog2Mode.aER.bgK.aO) {
                aii.strafe();
            }
            if (Watchdog2Mode.aER.bgK.tR == 1) {
                aii.strafe();
                Watchdog2Mode.aER.bgK.ue += (double)0.057f;
            }
            if (Watchdog2Mode.aER.bgK.tR == 3) {
                Watchdog2Mode.aER.bgK.ue -= (double)0.1309f;
            }
            if (Watchdog2Mode.aER.bgK.tR == 4) {
                Watchdog2Mode.aER.bgK.ue -= 0.2;
            }
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> MB = preUpdateEvent -> {
        if (hQ <= 44 || hQ < 47) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> MD = preMotionEvent -> {
        int n2;
        double d2;
        boolean bl2 = false;
        a a2 = Watchdog2Mode.aER.bgK.Us();
        j j2 = Watchdog2Mode.aER.bgF;
        for (d2 = a2.dtH; d2 < a2.dtK; d2 += 0.3) {
            for (double d3 = a2.dtJ; d3 < a2.dtM; d3 += 0.3) {
                b b2 = new b(d2, a2.dtI - 0.05, d3);
                Block block = j2.L(b2).df();
                if (!(block instanceof BlockStairs) && !(block instanceof BlockSnow) && (!(block instanceof BlockSlab) || Math.abs(Watchdog2Mode.aER.bgK.gX - (double)Math.round(Watchdog2Mode.aER.bgK.gX)) > 0.03)) continue;
                bl2 = true;
                break;
            }
            if (bl2) break;
        }
        if (bl2) {
            this.Mm = true;
            Mn = 35;
            Mo = 34;
        } else if (Watchdog2Mode.aER.bgK.aO) {
            Mn = 67;
            Mo = 66;
        }
        if (Watchdog2Mode.aER.bgK.tR > 10 && !aii.isMoving()) {
            aii.stop();
        }
        if (hQ < 7) {
            this.Mu = Watchdog2Mode.aER.bgK.pl;
            this.Mv = Watchdog2Mode.aER.bgK.pm;
        } else if (hQ > 8 && hQ <= Mn + ((Number)this.Mj.wD()).intValue()) {
            Watchdog2Mode.aER.bgK.pl = (float)this.Mu;
        }
        preMotionEvent.setPitch((float)this.Mv);
        preMotionEvent.setYaw((float)this.Mu);
        if (hQ == 0) {
            // empty if block
        }
        if (Watchdog2Mode.aER.bgK.aO && (hQ > 67 && !this.Mm || hQ > 40 && this.Mm) || Watchdog2Mode.aER.bgK.Zz == 1) {
            aii.stop();
            ((LongJump)this.wy()).setEnabled(false);
        }
        if (((Boolean)this.Mh.wD()).booleanValue()) {
            Watchdog2Mode.aER.bgK.cIc = 0.1f;
        }
        if (++hQ < Mn + ((Number)this.Mj.wD()).intValue()) {
            bm.a(500, true, true, true, true);
        }
        if (hQ < Mn) {
            if (Watchdog2Mode.aER.bgK.aO) {
                d2 = this.Mm ? 34.0 : 66.0;
                ci.a((float)((double)hQ / d2));
            }
            if (Watchdog2Mode.aER.bgK.aO && hQ > 3) {
                if (!this.Mm) {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + (hQ % 2 != 0 ? 0.0625 : Math.random() / 5000.0));
                } else {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + (hQ % 2 != 0 ? (double)0.145f : Math.random() / 5000.0));
                }
                preMotionEvent.setOnGround(false);
            }
            if (hQ == Mo) {
                if (!Watchdog2Mode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                } else if (Watchdog2Mode.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2) {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
                } else {
                    aii.strafe(aii.getAllowedHorizontalDistance() - 0.045);
                }
                Watchdog2Mode.aER.bgK.jump();
            }
        } else if (hQ == Mn) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            if (((Boolean)this.Mg.wD()).booleanValue()) {
                Watchdog2Mode.aER.bgC.dAp = 0.5f;
            }
            Mk = true;
        }
        if (((n2 = Watchdog2Mode.aER.bgK.ae) > 3 && n2 < 38 || n2 > 37 && Watchdog2Mode.aER.bgK.ue <= 0.0) && hQ > 40) {
            Watchdog2Mode.aER.bgK.ue += 0.0283;
        }
        switch (n2) {
            case 1: {
                Watchdog2Mode.aER.bgK.ud *= 2.1;
                Watchdog2Mode.aER.bgK.uf *= 2.1;
                break;
            }
            case 2: {
                break;
            }
            case 6: {
                Watchdog2Mode.aER.bgK.ue = 0.031;
                break;
            }
            case 7: {
                Watchdog2Mode.aER.bgK.ud *= 1.02;
                Watchdog2Mode.aER.bgK.uf *= 1.02;
                Watchdog2Mode.aER.bgK.ue = 0.01;
                break;
            }
            case 8: {
                Watchdog2Mode.aER.bgK.ud *= 1.01;
                Watchdog2Mode.aER.bgK.uf *= 1.01;
                Watchdog2Mode.aER.bgK.ue = 0.0;
                break;
            }
            case 9: {
                Watchdog2Mode.aER.bgK.ue += 0.015;
                break;
            }
            case 10: {
                Watchdog2Mode.aER.bgK.ud *= 1.12;
                Watchdog2Mode.aER.bgK.uf *= 1.12;
                Watchdog2Mode.aER.bgK.ue += 0.015;
                break;
            }
            case 11: {
                Watchdog2Mode.aER.bgK.ue = 0.0;
                Watchdog2Mode.aER.bgK.ud *= 1.04;
                Watchdog2Mode.aER.bgK.uf *= 1.04;
                break;
            }
            case 12: {
                Watchdog2Mode.aER.bgK.ue = 0.0;
                Watchdog2Mode.aER.bgK.ud *= 1.04;
                Watchdog2Mode.aER.bgK.uf *= 1.04;
                break;
            }
            case 13: {
                Watchdog2Mode.aER.bgK.ue += 0.01;
                break;
            }
            case 14: {
                Watchdog2Mode.aER.bgK.ue += 0.015;
                break;
            }
            case 15: {
                Watchdog2Mode.aER.bgK.ue += 0.01;
                break;
            }
            case 18: {
                Watchdog2Mode.aER.bgK.ue += 0.032;
            }
        }
    };
    @EventLink
    public final Listener<JumpEvent> ME = jumpEvent -> {
        if (hQ > 45) {
            jumpEvent.setJumpMotion(0.42f);
        }
    };
    @EventLink
    public final Listener<Render3DEvent> MF = render3DEvent -> {
        if (!this.Mq) {
            this.hE();
        }
        Runnable runnable = () -> {
            for (b b2 : this.Mp) {
                a a2 = new a(b2, b2.C(1, 1, 1));
                if (!ait.f(a2)) continue;
                GlStateManager.JV();
                GlStateManager.Jw();
                GlStateManager.tQ();
                GlStateManager.JO();
                GlStateManager.JA();
                GL11.glDepthMask((boolean)false);
                ait.e(this.rP().rQ());
                ait.g(a2);
                GlStateManager.JN();
                GlStateManager.Jz();
                GlStateManager.tR();
                GL11.glDepthMask((boolean)true);
                GlStateManager.Jx();
                GlStateManager.JW();
                GlStateManager.JX();
            }
        };
        this.b(gg.kT).c(runnable);
    };

    public Watchdog2Mode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.Mu = Watchdog2Mode.aER.bgK.pl;
        this.Mv = Watchdog2Mode.aER.bgK.pm;
        Watchdog2Mode.aER.bgK.pl = (float)this.Mu;
        if (Watchdog2Mode.aER.bgK.aO) {
            Watchdog2Mode.aER.bgK.jump();
        } else {
            afl.b("start on the ground", new Object[0]);
            ((LongJump)this.wy()).setEnabled(false);
        }
        this.Mr = Watchdog2Mode.aER.bgK.gW;
        this.Ms = Watchdog2Mode.aER.bgK.gX;
        this.Mt = Watchdog2Mode.aER.bgK.gY;
        this.jy = Watchdog2Mode.aER.bgK.gX;
        Ml = true;
        Mk = false;
        hQ = 0;
    }

    @Override
    public void onDisable() {
        double d2 = Watchdog2Mode.aER.bgK.gW - this.Mr;
        double d3 = Watchdog2Mode.aER.bgK.gX - this.Ms;
        double d4 = Watchdog2Mode.aER.bgK.gY - this.Mt;
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        Mk = false;
        this.Mm = false;
        afl.b(Watchdog2Mode.aER.bgK.ae, new Object[0]);
        afl.c("Distance traveled: " + d5, new Object[0]);
        if (Watchdog2Mode.aER.bgK.aO) {
            aii.stop();
        }
        this.Mp.clear();
        this.Mq = false;
    }

    private void hE() {
        this.Mp.clear();
        int n2 = 30;
        for (int i2 = -n2; i2 < n2; ++i2) {
            for (int i3 = -n2; i3 < n2; ++i3) {
                for (int i4 = -n2; i4 < n2; ++i4) {
                    b b2 = new b(Watchdog2Mode.aER.bgK.gW + (double)i2, Watchdog2Mode.aER.bgK.gX + (double)i3, Watchdog2Mode.aER.bgK.gY + (double)i4);
                    IBlockState iBlockState = Watchdog2Mode.aER.bgF.L(b2);
                    Block block = iBlockState.df();
                    if (block == Blocks.cLc) continue;
                    boolean bl2 = false;
                    if (block instanceof BlockSlab) {
                        boolean bl3 = bl2 = !iBlockState.zV().containsKey(BlockSlab.baO);
                    }
                    if (!(block instanceof BlockStairs) && !(block instanceof BlockSnow) && !bl2) continue;
                    this.Mp.add(b2);
                }
            }
        }
        this.Mq = true;
    }
}

