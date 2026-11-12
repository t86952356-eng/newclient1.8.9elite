/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.es;
import hackclient.rise.fg;
import net.minecraft.block.BlockAir;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.AntiVoid;
import rise.value.NumberValue;

public class VulcanMode
extends Mode<AntiVoid> {
    private final NumberValue ait = new NumberValue("Distance", this, (Number)2.6, (Number)0, (Number)10, (Number)0.1);
    private boolean zd;
    private boolean aiu;
    private Flight zm = null;
    private Speed uS = null;
    private LongJump aiv = null;
    private boolean aiw = false;
    private int zn;
    @EventLink
    public final Listener<PreMotionEvent> aix = preMotionEvent -> {
        if (this.zm == null) {
            this.zm = this.e(Flight.class);
        }
        if (this.uS == null) {
            this.uS = this.e(Speed.class);
        }
        if (this.aiv == null) {
            this.aiv = this.e(LongJump.class);
        }
        if (VulcanMode.aER.bgK.csf > ((Number)this.ait.wD()).floatValue() && !aik.vw()) {
            this.aiu = true;
        }
        if (this.zm.isEnabled() || this.aiv.isEnabled()) {
            this.aiu = false;
        }
        if (this.uS.isEnabled() && this.aiu) {
            this.aiw = true;
            this.uS.toggle();
        }
        if (!this.aiu && !this.uS.isEnabled() && this.aiw) {
            this.uS.toggle();
            this.aiw = false;
        }
    };
    @EventLink
    public final Listener<es> aiy = es2 -> {
        if (es2.df() instanceof BlockAir && !VulcanMode.aER.bgK.isSneaking() && this.aiu) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < VulcanMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
        if ((!(es2.df() instanceof BlockAir) || VulcanMode.aER.bgK.isSneaking()) && this.aiu && !VulcanMode.aER.bgK.crR) {
            this.aiu = false;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> aiz = strafeEvent -> {
        if (this.aiu) {
            aii.strafe(0.1);
            if (VulcanMode.aER.bgK.aRg % 2 == 1 || VulcanMode.aER.bgK.cuW != 0.0f) {
                strafeEvent.setForward(1.0f);
            } else {
                aii.strafe(0.0);
                strafeEvent.setForward(-1.0f);
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> aiA = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            this.aiu = false;
        }
    };
    @EventLink
    public final Listener<fg> aiB = fg2 -> {
        this.aiu = false;
    };
    @EventLink
    public final Listener<JumpEvent> aiC = jumpEvent -> {
        if (this.aiu) {
            jumpEvent.setJumpMotion(0.0f);
        }
    };

    public VulcanMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

