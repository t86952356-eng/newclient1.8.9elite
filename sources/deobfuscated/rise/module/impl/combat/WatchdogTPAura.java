/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aix;
import hackclient.rise.bv;
import hackclient.rise.fg;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.gui.cz;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.server.i;
import net.minecraft.util.bt;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"Watchdog TP Aura", "WatchdogTPAura"}, description="Teleport-based aura for Hypixel Watchdog", category=Category.COMBAT)
public final class WatchdogTPAura
extends Module {
    private final NumberValue qR = new NumberValue("Range", this, (Number)20, (Number)6, (Number)20, (Number)1);
    private final BooleanValue qS = new BooleanValue("Players", (Module)this, (Boolean)true);
    private final BooleanValue qT = new BooleanValue("Hostile", (Module)this, (Boolean)false);
    private final BooleanValue qU = new BooleanValue("Teammates", (Module)this, (Boolean)false);
    private final BooleanValue qV = new BooleanValue("Invisibles", (Module)this, (Boolean)true);
    private boolean qW = true;
    private boolean cR = false;
    private r jE;
    private r qX;
    private int qY;
    private final a qZ = new a();
    private final ConcurrentLinkedQueue<aj<?>> ra = new ConcurrentLinkedQueue();
    @EventLink
    public final Listener<PreMotionEvent> rb = preMotionEvent -> {
        if (this.qW) {
            this.qW = false;
            return;
        }
        this.gv();
        if (this.jE == null) {
            return;
        }
        if (this.cR) {
            preMotionEvent.setPosX(this.jE.gW);
            preMotionEvent.setPosY(this.jE.gX);
            preMotionEvent.setPosZ(this.jE.gY);
            this.qX = this.jE;
            Vector2f vector2f = aix.y(this.jE);
            preMotionEvent.setYaw(vector2f.x);
            preMotionEvent.setPitch(vector2f.y);
        } else {
            preMotionEvent.setPosX(0.0);
            preMotionEvent.setPosY(0.0);
            preMotionEvent.setPosZ(0.0);
        }
        WatchdogTPAura.aER.bgK.bko = 20;
    };
    @EventLink
    public final Listener<PacketReceiveEvent> rc = packetReceiveEvent -> {
        if (packetReceiveEvent.dq() instanceof i && !this.cR) {
            this.gw();
        }
    };
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> rd = packetSendEvent -> {
        if (this.cR && !packetSendEvent.isCancelled()) {
            aj<?> aj2 = packetSendEvent.dq();
            this.ra.add(aj2);
            packetSendEvent.cF();
        }
    };
    @EventLink
    public final Listener<fg> re = fg2 -> {
        if (this.cR) {
            this.gx();
        }
        this.ra.clear();
    };
    @EventLink
    public final Listener<PreUpdateEvent> rf = preUpdateEvent -> {
        if (this.qX != null && this.cR) {
            WatchdogTPAura.aER.bgu.Ht();
            AttackEvent attackEvent = new AttackEvent(this.qX);
            Client.a.e().d(attackEvent);
            if (!attackEvent.isCancelled()) {
                ahn.m(new m());
                afl.c("attacked", new Object[0]);
                ahn.m(new net.minecraft.network.play.client.c((c)this.qX, d.daU));
            }
            this.qX = null;
        }
        if (this.cR && ++this.qY > 1) {
            this.gx();
        }
    };
    @EventLink
    public final Listener<Render2DEvent> rg = render2DEvent -> {
        if (this.jE != null && this.cR) {
            cz cz2 = new cz(aER);
            String string = this.jE.xU();
            float f2 = this.jE.getHealth();
            float f3 = this.jE.getMaxHealth();
            int n2 = (int)(f2 / f3 * 100.0f);
            String string2 = String.format("Target: %s [%d%%]", string, n2);
            int n3 = WatchdogTPAura.aER.fontRendererObj.bQ(string2);
            WatchdogTPAura.aER.fontRendererObj.b(string2, (float)cz2.getScaledWidth() / 2.0f - (float)n3 / 2.0f, (float)cz2.getScaledHeight() / 2.0f + 20.0f, -1);
        }
    };

    private void gv() {
        List<r> list = bv.a(((Number)this.qR.wD()).doubleValue(), (boolean)((Boolean)this.qS.wD()), (boolean)((Boolean)this.qV.wD()), false, (boolean)((Boolean)this.qT.wD()), (Boolean)this.qU.wD());
        if (list.isEmpty()) {
            this.jE = null;
            return;
        }
        list.sort(Comparator.comparingDouble(r2 -> {
            Vector2f vector2f = aix.y(r2);
            float f2 = Math.abs(bt.bN(vector2f.x - WatchdogTPAura.aER.bgK.pl));
            float f3 = Math.abs(bt.bN(vector2f.y - WatchdogTPAura.aER.bgK.pm));
            return Math.sqrt(f2 * f2 + f3 * f3);
        }));
        this.jE = list.get(0);
    }

    private void gw() {
        if (!this.cR) {
            this.cR = true;
            this.qY = 0;
            this.ra.clear();
            this.qZ.aX();
            afl.c("Started blinking", new Object[0]);
        }
    }

    private void gx() {
        if (this.cR) {
            this.cR = false;
            afl.c("Dispatching " + this.ra.size() + " packets", new Object[0]);
            while (!this.ra.isEmpty()) {
                ahn.n(this.ra.poll());
            }
            this.qW = false;
            afl.c("Stopped blinking", new Object[0]);
        }
    }

    @Override
    public void onEnable() {
        afl.b("CREDIT TO https://youtube.com/@authh FOR THIS GOD BYPASS", new Object[0]);
        this.qW = true;
        this.cR = false;
        this.jE = null;
        this.qX = null;
        this.qY = 0;
        this.ra.clear();
    }

    @Override
    public void onDisable() {
        if (this.cR) {
            this.gx();
        }
        this.ra.clear();
        this.jE = null;
        this.qX = null;
        this.qY = 0;
        this.qW = true;
    }
}

