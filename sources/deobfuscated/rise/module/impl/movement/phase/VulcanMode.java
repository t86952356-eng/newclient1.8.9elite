/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.cl;
import hackclient.rise.ek;
import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;

public class VulcanMode
extends Mode<Phase> {
    private boolean ys = false;
    private boolean Ka = false;
    private boolean El = true;
    private int Ou = 0;
    private int Ov = 0;
    private int qH = 0;
    private boolean Ow = false;
    private boolean JE = true;
    private boolean GQ = true;
    @EventLink
    public final Listener<PreMotionEvent> Ox = preMotionEvent -> {
        VulcanMode.aER.bgK.cIc = 0.1f;
        if (this.Ov > 25 && aik.vz()) {
            if (VulcanMode.aER.bgK.ue > 0.0) {
                // empty if block
            }
            VulcanMode.aER.bgK.aO = false;
        }
        if (aik.vz()) {
            ++this.Ov;
        }
        if (this.JE && this.Ov < 25) {
            cl.cn();
        } else if (this.GQ) {
            // empty if block
        }
        if (aik.vz() && !this.El && this.GQ) {
            this.GQ = false;
            afl.b("Phased", new Object[0]);
        }
        if (!aik.vz() || !this.El) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<es> Oy = es2 -> {
        if (aik.vz()) {
            es2.a(null);
            if (!(es2.df() instanceof BlockAir) && !VulcanMode.aER.aIY.chr.Re()) {
                double d2 = es2.dg().wt();
                double d3 = es2.dg().wu();
                double d4 = es2.dg().wx();
                if (d3 < VulcanMode.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
                }
            }
        } else if (!this.ys) {
            if (es2.df() instanceof BlockAir && !VulcanMode.aER.bgK.isSneaking()) {
                double d5 = es2.dg().wt();
                double d6 = es2.dg().wu();
                double d7 = es2.dg().wx();
                if (d6 < VulcanMode.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d5, d6, d7));
                }
            }
        } else if (this.ys && !aik.vz()) {
            afl.b("Disabled due to not being in a block", new Object[0]);
            this.e(Phase.class).toggle();
        }
    };
    @EventLink
    public final Listener<TickEvent> Oz = tickEvent -> {};
    @EventLink
    public final Listener<StrafeEvent> OA = strafeEvent -> {
        int n2 = ain.vM();
        if (VulcanMode.aER.aIY.chq.Re() && VulcanMode.aER.bgK.cus > 0 || VulcanMode.aER.aIY.chr.Re() || VulcanMode.aER.aIY.chq.Re() || !aik.vz() || this.Ov > 25) {
            // empty if block
        }
        if (aik.vz()) {
            if (VulcanMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                strafeEvent.setSpeed(0.0605 * (double)(1 + VulcanMode.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()) + 0.306);
            } else {
                strafeEvent.setSpeed(0.306);
            }
        }
        if (VulcanMode.aER.bgK.aO && this.El && this.ys) {
            VulcanMode.aER.bgK.jump();
            this.ys = false;
            this.El = false;
        }
        if (VulcanMode.aER.bgK.aO && !this.ys && !this.El) {
            if (VulcanMode.aER.bgK.aRg % 2 == 1 || VulcanMode.aER.bgK.cuW != 0.0f) {
                strafeEvent.setForward(1.0f);
            } else {
                aii.strafe(0.0);
                strafeEvent.setForward(-1.0f);
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> OB = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i) {
            this.ys = true;
            ++this.Ou;
        }
        this.JE = this.Ou <= 4;
    };
    @EventLink
    public final Listener<ek> OC = ek2 -> ek2.cF();

    public VulcanMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        this.Ka = false;
        this.JE = true;
        this.GQ = true;
        this.Ov = 0;
        this.Ou = 0;
        this.ys = false;
        this.El = true;
        if (VulcanMode.aER.bgK.aO) {
            VulcanMode.aER.bgK.setPosition(VulcanMode.aER.bgK.gW, VulcanMode.aER.bgK.gX - 1.0, VulcanMode.aER.bgK.gY);
            aii.stop();
        } else {
            afl.b("You must me on the ground to do this", new Object[0]);
            this.e(Phase.class).toggle();
        }
    }

    @Override
    public void onDisable() {
        this.Ka = false;
    }
}

