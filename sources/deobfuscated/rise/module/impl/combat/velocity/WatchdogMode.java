/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.eh;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.w;
import net.minecraft.network.play.server.x;
import net.minecraft.network.play.server.y;
import net.minecraft.network.play.server.z;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.Jesus;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.module.impl.movement.jesus.WatchdogDolphin118Mode;
import rise.module.impl.player.Breaker;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class WatchdogMode
extends Mode<Velocity> {
    private long vc = -1L;
    boolean vd = false;
    boolean vf = false;
    public final BooleanValue vQ = new BooleanValue("Stack", (Mode<?>)this, (Boolean)true);
    boolean vh;
    public final BooleanValue vR = new BooleanValue("Ping Spoof", (Mode<?>)this, (Boolean)true);
    public final BooleanValue vS = new BooleanValue("Always Cancel Vertical", (Mode<?>)this, (Boolean)false);
    public final BooleanValue vT = new BooleanValue("Watchdog Backtrack", (Mode<?>)this, (Boolean)false);
    public final BooleanValue vU = new BooleanValue("Damage Boost (not for hypixel)", (Mode<?>)this, (Boolean)false);
    private final NumberValue vV = new NumberValue("Damage Boost Speed", this, (Number)1, (Number)1, (Number)10, (Number)0.01);
    public static boolean dj;
    public static boolean tt;
    public static boolean vq;
    private da pU = new da(0.0, 0.0, 0.0);
    public c pY;
    private int sG;
    private final ArrayList<aj<?>> vW = new ArrayList();
    @EventLink
    public final Listener<PacketReceiveEvent> vX = packetReceiveEvent -> {
        aj<a> aj2;
        aj<a> aj3;
        Object object;
        Object object2;
        if (tt || this.e(LongJump.class).isEnabled() || this.e(Flight.class).isEnabled() || this.e(Jesus.class).isEnabled() && ((Mode)this.e(Jesus.class).DA.wD()).getName().equals("Watchdog Dolphin 1.18+") && WatchdogDolphin118Mode.KA < 30) {
            return;
        }
        aj<?> aj4 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj4);
        Object object3 = aj4;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, net.minecraft.network.play.server.a.class, x.class, w.class, y.class, aa.class}, object3, n2)) {
            case 0: {
                object2 = (t)object3;
                if (((t)object2).getEntityID() == WatchdogMode.aER.bgK.getEntityId() && !aik.vz() && (WatchdogMode.aER.bgK.crx <= 0 || !((Boolean)this.vS.wD()).booleanValue() || this.e(Speed.class).isEnabled() || WatchdogMode.aER.bgK.cuU || WatchdogMode.aER.aIY.chq.Re() || this.vh || !((double)((t)object2).agO() / 8000.0 > 0.08) || WatchdogMode.aER.bgK.Zz <= 11)) {
                    if ((Boolean)this.vQ.wD() != false && this.sG < 1 && !WatchdogMode.aER.bgK.aO && Math.random() < 0.73 && WatchdogMode.aER.bgK.tR <= 13 || WatchdogMode.aER.bgK.csz || this.e(Scaffold.class).isEnabled() && (WatchdogMode.aER.bgK.tR <= 3 || !aii.isMoving() || !this.e(Speed.class).isEnabled() || !rise.module.impl.movement.speed.WatchdogMode.RK || !(Math.hypot(aii.predictedMotion((double)((t)object2).agN() / 8000.0, 1), aii.predictedMotion((double)((t)object2).agP() / 8000.0, 1)) > aii.speed()))) {
                        ++this.sG;
                        vq = true;
                        packetReceiveEvent.cF();
                        vq = false;
                    }
                    if (!(packetReceiveEvent.isCancelled() || this.e(Scaffold.class).isEnabled() || WatchdogMode.aER.bgK.tR > 11 || WatchdogMode.aER.bgK.aO && (!WatchdogMode.aER.bgK.aO || aii.isMoving()) || (double)((t)object2).agO() / 8000.0 < 0.08 && !this.e(Speed.class).isEnabled() && !this.e(LongJump.class).isEnabled() || !this.e(Scaffold.class).isEnabled() && WatchdogMode.aER.bgK.tR > 3 && aii.isMoving() && this.e(Speed.class).isEnabled() && rise.module.impl.movement.speed.WatchdogMode.RK && Math.hypot((double)((t)object2).agN() / 8000.0, (double)((t)object2).agP() / 8000.0) > aii.speed())) {
                        this.sG = 0;
                        dj = true;
                        this.vW.add((aj<?>)object2);
                        packetReceiveEvent.cF();
                        break;
                    }
                    if (packetReceiveEvent.isCancelled()) break;
                    if (rise.module.impl.movement.speed.WatchdogMode.RK) {
                        // empty if block
                    }
                    if (!this.e(Scaffold.class).isEnabled()) {
                        WatchdogMode.aER.bgK.ue = (double)((t)object2).agO() / 8000.0;
                    }
                    if (this.e(Speed.class).isEnabled()) break;
                    packetReceiveEvent.cF();
                    break;
                }
                if (!packetReceiveEvent.isCancelled() && aik.vz()) {
                    packetReceiveEvent.cF();
                    break;
                }
                if (packetReceiveEvent.isCancelled() || ((t)object2).getEntityID() != WatchdogMode.aER.bgK.getEntityId() || this.e(LongJump.class).isEnabled()) break;
                ((t)object2).dcS *= 0;
                WatchdogMode.aER.bgK.ud *= 0.9;
                WatchdogMode.aER.bgK.uf *= 0.9;
                packetReceiveEvent.e((aj<?>)object2);
                break;
            }
            case 1: {
                object = (bc)object3;
                if (!dj || !((Boolean)this.vR.wD()).booleanValue()) break;
                this.vW.add((aj<?>)object);
                packetReceiveEvent.cF();
                break;
            }
            case 2: {
                net.minecraft.network.play.server.a a2 = (net.minecraft.network.play.server.a)object3;
                if (!dj || !((Boolean)this.vR.wD()).booleanValue()) break;
                packetReceiveEvent.cF();
                break;
            }
            case 3: {
                x x2 = (x)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(x2);
                packetReceiveEvent.cF();
                break;
            }
            case 4: {
                aj3 = (w)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aj3);
                packetReceiveEvent.cF();
                break;
            }
            case 5: {
                aj2 = (y)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aj2);
                packetReceiveEvent.cF();
                break;
            }
            case 6: {
                aa aa2 = (aa)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aa2);
                packetReceiveEvent.cF();
                break;
            }
        }
        object3 = bv.f(12.0);
        object3.sort(Comparator.comparingDouble(r2 -> r2.cus));
        if (object3.isEmpty()) {
            this.pY = null;
            if (((Boolean)this.vT.wD()).booleanValue()) {
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
                this.vd = false;
                this.vf = false;
            }
            return;
        }
        c c2 = (c)object3.get(0);
        if (((Boolean)this.vT.wD()).booleanValue()) {
            double d2;
            if (c2 != this.pY) {
                this.pY = c2;
                this.pU.dAG = c2.gW;
                this.pU.dAH = c2.gX;
                this.pU.dAI = c2.gY;
            }
            if ((d2 = ((da)(object2 = WatchdogMode.aER.bgK.aQ(1.0f))).x((da)(object = new da(this.pU.dAG, this.pU.dAH, this.pU.dAI)))) > 4.5 && dj || WatchdogMode.aER.bgK.tR > 9 && dj) {
                this.vf = true;
            } else if (dj) {
                this.vf = false;
            }
            boolean bl2 = this.vd = d2 < 4.5;
            if (!WatchdogMode.aER.bgK.cup || !(d2 > 3.1) || !(d2 < 4.5) || this.e(KillAura.class).isEnabled()) {
                // empty if block
            }
            if (this.vd) {
                if (this.vc == -1L) {
                    this.vc = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.vc >= Math.round(Math.random() * 150.0) + 100L) {
                    tt = true;
                    this.vW.stream().filter(this::f).forEach(ahn::q);
                    this.vW.clear();
                    tt = false;
                    this.vd = false;
                    this.vc = -1L;
                }
            } else {
                this.vc = -1L;
            }
            if (this.vf && dj) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (WatchdogMode.aER.bgK.aRg < 100) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (WatchdogMode.aER.bgK.cus == 9) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (d2 < 2.5) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (d2 > 4.5) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if ((aj3 = packetReceiveEvent.dq()) instanceof v) {
                aj2 = aj3;
                if (((v)aj2).entityId == this.pY.getEntityId()) {
                    this.pU.dAG += (double)((v)aj2).agR() / 32.0;
                    this.pU.dAH += (double)((v)aj2).agS() / 32.0;
                    this.pU.dAI += (double)((v)aj2).agT() / 32.0;
                }
            } else if (aj3 instanceof z && ((z)(aj2 = (z)aj3)).getEntityId() == this.pY.getEntityId()) {
                this.pU = new da((double)((z)aj2).wt() / 32.0, (double)((z)aj2).wu() / 32.0, (double)((z)aj2).wx() / 32.0);
            }
        }
    };
    @EventLink(cH=4)
    public final Listener<JumpEvent> vY = jumpEvent -> {};
    @EventLink(cH=4)
    public final Listener<PreMotionEvent> vZ = preMotionEvent -> {
        this.vh = Math.abs(WatchdogMode.aER.bgK.gX - (double)Math.round(WatchdogMode.aER.bgK.gX)) > 0.01 && WatchdogMode.aER.bgK.aO;
        if (WatchdogMode.aER.bgK.ae == 1 && aii.isMoving() && (Math.abs(WatchdogMode.aER.bgK.gX - Math.floor(WatchdogMode.aER.bgK.gX)) < 0.03 || WatchdogMode.aER.bgK.ue < 0.0) && ((Boolean)this.vS.wD()).booleanValue()) {
            aii.strafe();
        } else if (WatchdogMode.aER.bgK.ae == 1 && (Math.abs(WatchdogMode.aER.bgK.gX - Math.floor(WatchdogMode.aER.bgK.gX)) < 0.03 || WatchdogMode.aER.bgK.ue < 0.0) && ((Boolean)this.vS.wD()).booleanValue()) {
            WatchdogMode.aER.bgK.ud *= -1.0;
            WatchdogMode.aER.bgK.uf *= -1.0;
        }
        if (((Boolean)this.vS.wD()).booleanValue() && WatchdogMode.aER.bgK.ae < 5 && WatchdogMode.aER.bgK.aO) {
            WatchdogMode.aER.bgK.crP = true;
        }
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> wa = preUpdateEvent -> {
        double d2;
        Vector2d vector2d;
        if (this.vd && !dj && ((Boolean)this.vT.wD()).booleanValue()) {
            bm.a(50, true, false, false, false, false, false);
        }
        if (Breaker.ir && dj) {
            dj = false;
            tt = true;
            vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            d2 = WatchdogMode.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            WatchdogMode.aER.bgK.ue = d2;
            WatchdogMode.aER.bgK.ud = vector2d.getX();
            WatchdogMode.aER.bgK.uf = vector2d.getY();
            tt = false;
        }
        if (WatchdogMode.aER.bgK.aO && dj && !this.e(Speed.class).isEnabled()) {
            dj = false;
            tt = true;
            this.vf = false;
            bm.dispatch();
            vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            d2 = WatchdogMode.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            WatchdogMode.aER.bgK.jump();
            WatchdogMode.aER.bgK.ud = vector2d.getX();
            WatchdogMode.aER.bgK.uf = vector2d.getY();
            if (WatchdogMode.aER.bgK.cuU) {
                float f2 = WatchdogMode.aER.bgK.pp * ((float)Math.PI / 180);
                Minecraft minecraft = Minecraft.getMinecraft();
                if (minecraft.bgK.bkD) {
                    f2 = (float)(aii.direction() * 57.29577951308232);
                    f2 *= (float)Math.PI / 180;
                }
                minecraft.bgK.ud -= (double)(bt.bx(f2) * 0.2f);
                minecraft.bgK.uf += (double)(bt.bB(f2) * 0.2f);
            }
            tt = false;
        }
    };
    @EventLink(cH=2)
    public final Listener<JumpEvent> wb = jumpEvent -> {
        if (WatchdogMode.aER.bgK.aO && dj && this.e(Speed.class).isEnabled()) {
            dj = false;
            tt = true;
            this.vf = false;
            bm.dispatch();
            Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            double d2 = WatchdogMode.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            WatchdogMode.aER.bgK.ud = vector2d.getX();
            WatchdogMode.aER.bgK.uf = vector2d.getY();
            tt = false;
        }
    };
    @EventLink(cH=2)
    public final Listener<eh> wc = eh2 -> {
        if (WatchdogMode.aER.bgK.tR > 12 && dj) {
            dj = false;
            tt = true;
            Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            double d2 = WatchdogMode.aER.bgK.ue;
            bm.dispatch();
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            if (!this.e(Speed.class).isEnabled()) {
                WatchdogMode.aER.bgK.ud = vector2d.getX();
                WatchdogMode.aER.bgK.uf = vector2d.getY();
            }
            tt = false;
        }
    };
    @EventLink
    public final Listener<Render3DEvent> wd = render3DEvent -> {
        if (this.pY == null || !((Boolean)this.vT.wD()).booleanValue() || !this.vd && !dj) {
            return;
        }
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d2 = -0.14;
        ait.e(ais.d(this.rP().rR(), 100));
        ait.g(WatchdogMode.aER.bgK.Us().ae(-WatchdogMode.aER.bgK.gW, -WatchdogMode.aER.bgK.gX, -WatchdogMode.aER.bgK.gY).ae(this.pU.dAG, this.pU.dAH, this.pU.dAI).ad(d2, -0.3, d2));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };

    public WatchdogMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    private boolean f(aj<?> aj2) {
        return aj2 instanceof x || aj2 instanceof w || aj2 instanceof y || aj2 instanceof aa || aj2 instanceof z;
    }
}

