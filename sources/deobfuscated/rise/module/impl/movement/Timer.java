/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aho;
import hackclient.rise.aii;
import hackclient.rise.akj;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.fd;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.timer.name"}, description="module.other.timer.description", category=Category.MOVEMENT)
public final class Timer
extends Module {
    private boolean HJ;
    public static ConcurrentLinkedQueue<aho> Zy = new ConcurrentLinkedQueue();
    private int Zz;
    private long SG;
    private final akj ZA = new akj("Timer", this, (Number)1, (Number)2, (Number)0.1, (Number)20, (Number)0.05);
    public final BooleanValue ZB = new BooleanValue("Watchdog", (Module)this, (Boolean)false);
    public final BooleanValue ZC = new BooleanValue("Compensate Low Timer", (Module)this, (Boolean)false);
    public final NumberValue ZD = new NumberValue("Compensate Speed", this, (Number)1.5, (Number)1.0, (Number)5.0, (Number)0.05, () -> (Boolean)this.ZC.wD() == false);
    public final NumberValue ZE = new NumberValue("Balance Multiplier", this, (Number)1, (Number)0.1, (Number)10.0, (Number)0.05, () -> (Boolean)this.ZC.wD() == false);
    private double yC = 0.0;
    private boolean ZF;
    @EventLink(cH=2)
    public final Listener<PreMotionEvent> ZG = preMotionEvent -> {
        if (!((Boolean)this.ZB.wD()).booleanValue()) {
            if (!this.ZF) {
                Timer.aER.bgC.dAp = (float)ahj.l(((Number)this.ZA.wD()).floatValue(), this.ZA.wP().floatValue());
            }
            if (((Boolean)this.ZC.wD()).booleanValue() && this.ZF) {
                Timer.aER.bgC.dAp = ((Number)this.ZD.wD()).floatValue();
            }
        } else if (((Boolean)this.ZB.wD()).booleanValue()) {
            preMotionEvent.setOnGround(true);
            if (this.HJ && System.currentTimeMillis() > this.SG) {
                Timer.aER.bgK.ud *= 0.0;
                Timer.aER.bgK.uf *= 0.0;
                this.SG = 0L;
                this.e(Timer.class).toggle();
            }
        }
    };
    @EventLink(cH=3)
    public final Listener<PreUpdateEvent> ZH = preUpdateEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            bm.a(9999999, false, false, false, false, true);
            Timer.aER.bgK.crP = true;
        }
    };
    @EventLink
    public final Listener<TickEvent> ZI = tickEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && !this.HJ) {
            if (Timer.aER.bgK.aO) {
                ++this.Zz;
                double d2 = Timer.aER.bgK.gW;
                double d3 = Timer.aER.bgK.gX;
                double d4 = Timer.aER.bgK.gY;
                ahn.m(new f(d2, d3, d4, true));
                ahn.m(new f(d2, d3 - 1.0E-16, d4, true));
                ahn.m(new f(d2, d3 + 0.07, d4, true));
                ahn.m(new f(d2, d3, d4, true));
                Timer.aER.bgC.dAp = ((Number)this.ZA.wD()).floatValue();
            } else if (((Boolean)this.ZB.wD()).booleanValue()) {
                // empty if block
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> ZJ = moveInputEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && Timer.aER.bgK.aO && this.Zz == 0) {
            aii.stop();
        }
    };
    @EventLink
    public final Listener<StrafeEvent> ZK = strafeEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue() && this.HJ) {
            aii.stop();
            Timer.aER.bgC.dAp = 1.0f;
            if (Timer.aER.bgK.aO) {
                Zy.forEach(aho2 -> ahn.o(aho2.dq()));
                Zy.clear();
                bm.dispatch();
            }
        }
    };
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> ZL = packetSendEvent -> {
        aj<?> aj2;
        if (Timer.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (((Boolean)this.ZC.wD()).booleanValue() && (aj2 = packetSendEvent.dq()) instanceof e && (!packetSendEvent.isCancelled() || bc.cR)) {
            if (this.ZF) {
                if (this.yC > 0.0) {
                    this.yC -= 1.0;
                    if (this.yC <= 0.0) {
                        this.ZF = false;
                        Timer.aER.bgC.dAp = 1.0f;
                        this.toggle();
                    }
                }
            } else if (this.im()) {
                this.yC += ((Number)this.ZE.wD()).doubleValue();
            }
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && Timer.aER.bgK.aO && (aj2 = packetSendEvent.dq()) instanceof net.minecraft.network.play.server.bc) {
            Zy.add(new aho(aj2));
            packetSendEvent.cF();
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> ZM = packetReceiveEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            aj<?> aj2 = packetReceiveEvent.dq();
            if (aj2 instanceof t) {
                packetReceiveEvent.cF();
            }
            if (aj2 instanceof i) {
                packetReceiveEvent.cF();
            }
        }
    };
    @EventLink(cH=4)
    public final Listener<fd> ZN = fd2 -> {};
    @EventLink
    public final Listener<JumpEvent> ZO = jumpEvent -> {
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            jumpEvent.cF();
        }
    };
    @EventLink
    public final Listener<KeyboardInputEvent> ZP = keyboardInputEvent -> {
        if (((Boolean)this.ZC.wD()).booleanValue() && keyboardInputEvent.cO() == this.e(Timer.class).getKey() && this.isEnabled()) {
            if (!this.ZF && this.yC > 0.0) {
                this.ZF = true;
                Timer.aER.bgC.dAp = ((Number)this.ZD.wD()).floatValue();
                keyboardInputEvent.cF();
                return;
            }
            if (this.ZF) {
                keyboardInputEvent.cF();
                return;
            }
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && keyboardInputEvent.cO() == this.e(Timer.class).getKey() && !this.HJ) {
            this.SG = System.currentTimeMillis() + 200L;
            this.HJ = true;
            afl.b("sent", new Object[0]);
            keyboardInputEvent.cF();
        }
        if (((Boolean)this.ZB.wD()).booleanValue() && this.HJ) {
            keyboardInputEvent.cF();
        }
    };

    @Override
    public void onEnable() {
        this.yC = 0.0;
        this.ZF = false;
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            Timer.aER.bgK.cso = 0.0f;
            this.HJ = false;
            this.Zz = 0;
            this.SG = 0L;
        }
    }

    @Override
    public void onDisable() {
        if (Timer.aER.bgC.dAp != 1.0f) {
            Timer.aER.bgC.dAp = 1.0f;
        }
        if (((Boolean)this.ZB.wD()).booleanValue()) {
            Timer.aER.bgK.cso = 0.6f;
            Timer.aER.bgK.ud *= 0.0;
            Timer.aER.bgK.uf *= 0.0;
        }
    }

    private boolean im() {
        return ((Number)this.ZA.wD()).floatValue() < 1.0f || Timer.aER.bgC.dAp < 1.0f;
    }
}

