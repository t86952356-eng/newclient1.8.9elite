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
import hackclient.rise.ait;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.eh;
import java.awt.Color;
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
import rise.module.impl.movement.speed.WatchdogMode;
import rise.module.impl.player.Breaker;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class VulcanMode
extends Mode<Velocity> {
    private long vc = -1L;
    boolean vd = false;
    boolean ve;
    boolean vf = false;
    public final BooleanValue vg = new BooleanValue("Stack", (Mode<?>)this, (Boolean)true);
    boolean vh;
    public final BooleanValue vi = new BooleanValue("Ping Spoof", (Mode<?>)this, (Boolean)true);
    private double vj;
    private double vk;
    private double vl;
    public final BooleanValue vm = new BooleanValue("Always Cancel Vertical", (Mode<?>)this, (Boolean)true);
    public final BooleanValue vn = new BooleanValue("Backtrack", (Mode<?>)this, (Boolean)false);
    public final BooleanValue vo = new BooleanValue("Damage Boost", (Mode<?>)this, (Boolean)false);
    private final NumberValue vp = new NumberValue("Damage Boost Speed", this, (Number)1, (Number)1, (Number)10, (Number)0.01);
    private boolean dj;
    private boolean tt;
    private boolean vq;
    private da pU = new da(0.0, 0.0, 0.0);
    public c pY;
    private int sG;
    private final ArrayList<aj<?>> vr = new ArrayList();
    @EventLink
    public final Listener<PacketReceiveEvent> vs = packetReceiveEvent -> {
        aj<a> aj2;
        aj<a> aj3;
        Object object;
        Object object2;
        if (this.tt || this.e(LongJump.class).isEnabled() || this.e(Flight.class).isEnabled() || this.e(Jesus.class).isEnabled() && ((Mode)this.e(Jesus.class).DA.wD()).getName().equals("Watchdog Dolphin 1.18+") && WatchdogDolphin118Mode.KA < 30 || this.e(Speed.class).isEnabled()) {
            return;
        }
        aj<?> aj4 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj4);
        Object object3 = aj4;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, net.minecraft.network.play.server.a.class, x.class, w.class, y.class, aa.class}, object3, n2)) {
            case 0: {
                object2 = (t)object3;
                if (((t)object2).getEntityID() == VulcanMode.aER.bgK.getEntityId() && !aik.vz() && (VulcanMode.aER.bgK.crx <= 0 || !((Boolean)this.vm.wD()).booleanValue() || this.e(Speed.class).isEnabled() || VulcanMode.aER.bgK.cuU || VulcanMode.aER.aIY.chq.Re() || this.vh || !((double)((t)object2).agO() / 8000.0 > 0.08) || VulcanMode.aER.bgK.Zz <= 11)) {
                    if ((Boolean)this.vg.wD() != false && this.sG < 1 && !VulcanMode.aER.bgK.aO && Math.random() < 0.73 && VulcanMode.aER.bgK.tR <= 13 || VulcanMode.aER.bgK.csz || this.e(Scaffold.class).isEnabled() && (VulcanMode.aER.bgK.tR <= 3 || !aii.isMoving() || !this.e(Speed.class).isEnabled() || !WatchdogMode.RK || !(Math.hypot(aii.predictedMotion((double)((t)object2).agN() / 8000.0, 1), aii.predictedMotion((double)((t)object2).agP() / 8000.0, 1)) > aii.speed()))) {
                        ++this.sG;
                        this.vq = true;
                        packetReceiveEvent.cF();
                        this.vq = false;
                    }
                    if (!(packetReceiveEvent.isCancelled() || this.e(Scaffold.class).isEnabled() || VulcanMode.aER.bgK.tR > 11 || VulcanMode.aER.bgK.aO && (!VulcanMode.aER.bgK.aO || aii.isMoving()) || (double)((t)object2).agO() / 8000.0 < 0.08 && !this.e(Speed.class).isEnabled() && !this.e(LongJump.class).isEnabled() || !this.e(Scaffold.class).isEnabled() && VulcanMode.aER.bgK.tR > 3 && aii.isMoving() && this.e(Speed.class).isEnabled() && WatchdogMode.RK && Math.hypot((double)((t)object2).agN() / 8000.0, (double)((t)object2).agP() / 8000.0) > aii.speed())) {
                        this.sG = 0;
                        this.dj = true;
                        this.vr.add((aj<?>)object2);
                        packetReceiveEvent.cF();
                        break;
                    }
                    if (packetReceiveEvent.isCancelled()) break;
                    if (WatchdogMode.RK) {
                        // empty if block
                    }
                    if (!this.e(Scaffold.class).isEnabled()) {
                        VulcanMode.aER.bgK.ue = (double)((t)object2).agO() / 8000.0;
                    }
                    if (this.e(Speed.class).isEnabled()) break;
                    packetReceiveEvent.cF();
                    break;
                }
                if (!packetReceiveEvent.isCancelled() && aik.vz()) {
                    packetReceiveEvent.cF();
                    break;
                }
                if (packetReceiveEvent.isCancelled() || ((t)object2).getEntityID() != VulcanMode.aER.bgK.getEntityId() || this.e(LongJump.class).isEnabled()) break;
                this.ve = true;
                this.vr.add((aj<?>)object2);
                this.vj = (double)((t)object2).agN() / 8000.0;
                this.vk = (double)((t)object2).agP() / 8000.0;
                this.vl = (double)((t)object2).agO() / 8000.0;
                packetReceiveEvent.cF();
                break;
            }
            case 1: {
                object = (bc)object3;
                if (!this.dj || !((Boolean)this.vi.wD()).booleanValue()) break;
                this.vr.add((aj<?>)object);
                packetReceiveEvent.cF();
                break;
            }
            case 2: {
                net.minecraft.network.play.server.a a2 = (net.minecraft.network.play.server.a)object3;
                if (!this.dj || !((Boolean)this.vi.wD()).booleanValue()) break;
                packetReceiveEvent.cF();
                break;
            }
            case 3: {
                x x2 = (x)object3;
                if (!this.vd && !this.dj || !((Boolean)this.vn.wD()).booleanValue() || this.vf) break;
                this.vr.add(x2);
                packetReceiveEvent.cF();
                break;
            }
            case 4: {
                aj3 = (w)object3;
                if (!this.vd && !this.dj || !((Boolean)this.vn.wD()).booleanValue() || this.vf) break;
                this.vr.add(aj3);
                packetReceiveEvent.cF();
                break;
            }
            case 5: {
                aj2 = (y)object3;
                if (!this.vd && !this.dj || !((Boolean)this.vn.wD()).booleanValue() || this.vf) break;
                this.vr.add(aj2);
                packetReceiveEvent.cF();
                break;
            }
            case 6: {
                aa aa2 = (aa)object3;
                if (!this.vd && !this.dj || !((Boolean)this.vn.wD()).booleanValue() || this.vf) break;
                this.vr.add(aa2);
                packetReceiveEvent.cF();
                break;
            }
        }
        object3 = bv.f(12.0);
        object3.sort(Comparator.comparingDouble(r2 -> r2.cus));
        if (object3.isEmpty()) {
            this.pY = null;
            if (((Boolean)this.vn.wD()).booleanValue()) {
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
                this.vd = false;
                this.vf = false;
            }
            return;
        }
        c c2 = (c)object3.get(0);
        if (((Boolean)this.vn.wD()).booleanValue()) {
            double d2;
            if (c2 != this.pY) {
                this.pY = c2;
                this.pU.dAG = c2.gW;
                this.pU.dAH = c2.gX;
                this.pU.dAI = c2.gY;
            }
            if ((d2 = ((da)(object2 = VulcanMode.aER.bgK.aQ(1.0f))).x((da)(object = new da(this.pU.dAG, this.pU.dAH, this.pU.dAI)))) > 4.5 && this.dj || VulcanMode.aER.bgK.tR > 9 && this.dj) {
                this.vf = true;
            } else if (this.dj) {
                this.vf = false;
            }
            boolean bl2 = this.vd = d2 < 4.5;
            if (!VulcanMode.aER.bgK.cup || !(d2 > 3.1) || !(d2 < 4.5) || this.e(KillAura.class).isEnabled()) {
                // empty if block
            }
            if (this.vd) {
                if (this.vc == -1L) {
                    this.vc = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.vc >= Math.round(Math.random() * 150.0) + 100L) {
                    this.tt = true;
                    this.vr.stream().filter(this::f).forEach(ahn::q);
                    this.vr.clear();
                    this.tt = false;
                    this.vd = false;
                    this.vc = -1L;
                }
            } else {
                this.vc = -1L;
            }
            if (this.vf && this.dj) {
                this.vd = false;
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
            }
            if (VulcanMode.aER.bgK.aRg < 100) {
                this.vd = false;
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
            }
            if (VulcanMode.aER.bgK.cus == 9) {
                this.vd = false;
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
            }
            if (d2 < 2.5) {
                this.vd = false;
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
            }
            if (d2 > 4.5) {
                this.vd = false;
                this.tt = true;
                this.vr.stream().filter(this::f).forEach(ahn::q);
                this.vr.clear();
                this.tt = false;
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
    public final Listener<JumpEvent> vt = jumpEvent -> {};
    @EventLink(cH=4)
    public final Listener<PreMotionEvent> vu = preMotionEvent -> {
        if (!(VulcanMode.aER.bgK.ae == 1 && aii.isMoving() || VulcanMode.aER.bgK.ae != 1)) {
            VulcanMode.aER.bgK.ud *= -1.0;
            VulcanMode.aER.bgK.uf *= -1.0;
        }
        if (this.ve && VulcanMode.aER.bgK.aO) {
            this.ve = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(VulcanMode.aER.bgK.ud, VulcanMode.aER.bgK.uf);
            double d2 = VulcanMode.aER.bgK.ue;
            this.vr.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vr.clear();
            VulcanMode.aER.bgK.ue = d2;
            VulcanMode.aER.bgK.ud = vector2d.getX();
            VulcanMode.aER.bgK.uf = vector2d.getY();
            preMotionEvent.setPosY(preMotionEvent.getPosY() + this.vl);
            this.tt = false;
        }
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> vv = preUpdateEvent -> {
        double d2;
        Vector2d vector2d;
        if (Breaker.ir && this.dj) {
            this.dj = false;
            this.tt = true;
            vector2d = new Vector2d(VulcanMode.aER.bgK.ud, VulcanMode.aER.bgK.uf);
            d2 = VulcanMode.aER.bgK.ue;
            this.vr.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vr.clear();
            VulcanMode.aER.bgK.ue = d2;
            VulcanMode.aER.bgK.ud = vector2d.getX();
            VulcanMode.aER.bgK.uf = vector2d.getY();
            this.tt = false;
        }
        if (VulcanMode.aER.bgK.aO && this.dj && !this.ve && !this.e(Speed.class).isEnabled()) {
            this.dj = false;
            this.tt = true;
            this.vf = false;
            bm.dispatch();
            vector2d = new Vector2d(VulcanMode.aER.bgK.ud, VulcanMode.aER.bgK.uf);
            d2 = VulcanMode.aER.bgK.ue;
            this.vr.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vr.clear();
            VulcanMode.aER.bgK.jump();
            VulcanMode.aER.bgK.ud = vector2d.getX();
            VulcanMode.aER.bgK.uf = vector2d.getY();
            if (VulcanMode.aER.bgK.cuU) {
                float f2 = VulcanMode.aER.bgK.pp * ((float)Math.PI / 180);
                Minecraft minecraft = Minecraft.getMinecraft();
                if (minecraft.bgK.bkD) {
                    f2 = (float)(aii.direction() * 57.29577951308232);
                    f2 *= (float)Math.PI / 180;
                }
                minecraft.bgK.ud -= (double)(bt.bx(f2) * 0.2f);
                minecraft.bgK.uf += (double)(bt.bB(f2) * 0.2f);
            }
            this.tt = false;
        }
        if (this.vd && !this.dj && ((Boolean)this.vn.wD()).booleanValue()) {
            bm.a(50, true, false, false, false, true, false);
        }
    };
    @EventLink(cH=2)
    public final Listener<eh> vw = eh2 -> {
        if (VulcanMode.aER.bgK.tR > 12 && this.dj) {
            this.dj = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(VulcanMode.aER.bgK.ud, VulcanMode.aER.bgK.uf);
            double d2 = VulcanMode.aER.bgK.ue;
            bm.dispatch();
            this.vr.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vr.clear();
            if (!this.e(Speed.class).isEnabled()) {
                VulcanMode.aER.bgK.ud = vector2d.getX();
                VulcanMode.aER.bgK.uf = vector2d.getY();
            }
            this.tt = false;
        }
    };
    @EventLink
    public final Listener<Render3DEvent> vx = render3DEvent -> {
        if (this.pY == null || !((Boolean)this.vn.wD()).booleanValue() || !this.vd && !this.dj) {
            return;
        }
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d2 = -0.14;
        ait.e(Color.red, 45);
        ait.g(VulcanMode.aER.bgK.Us().ae(-VulcanMode.aER.bgK.gW, -VulcanMode.aER.bgK.gX, -VulcanMode.aER.bgK.gY).ae(this.pU.dAG, this.pU.dAH, this.pU.dAI).ad(d2, -0.3, d2));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };

    public VulcanMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    private boolean f(aj<?> aj2) {
        return aj2 instanceof x || aj2 instanceof w || aj2 instanceof y || aj2 instanceof aa || aj2 instanceof z;
    }
}

