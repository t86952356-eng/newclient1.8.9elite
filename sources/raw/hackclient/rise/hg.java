/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eq;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.fs;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
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

@gl(aliases={"Watchdog TP Aura", "WatchdogTPAura"}, description="Teleport-based aura for Hypixel Watchdog", category=gj.COMBAT)
public final class hg
extends gi {
    private final akq qR = new akq("Range", this, (Number)20, (Number)6, (Number)20, (Number)1);
    private final aki qS = new aki("Players", (gi)this, (Boolean)true);
    private final aki qT = new aki("Hostile", (gi)this, (Boolean)false);
    private final aki qU = new aki("Teammates", (gi)this, (Boolean)false);
    private final aki qV = new aki("Invisibles", (gi)this, (Boolean)true);
    private boolean qW = true;
    private boolean cR = false;
    private r jE;
    private r qX;
    private int qY;
    private final rip.vantage.commons.util.time.a qZ = new rip.vantage.commons.util.time.a();
    private final ConcurrentLinkedQueue<aj<?>> ra = new ConcurrentLinkedQueue();
    @dm
    public final dk<ei> rb = ei2 -> {
        if (this.qW) {
            this.qW = false;
            return;
        }
        this.gv();
        if (this.jE == null) {
            return;
        }
        if (this.cR) {
            ei2.setPosX(this.jE.gW);
            ei2.setPosY(this.jE.gX);
            ei2.setPosZ(this.jE.gY);
            this.qX = this.jE;
            akb akb2 = aix.y(this.jE);
            ei2.setYaw(akb2.x);
            ei2.setPitch(akb2.y);
        } else {
            ei2.setPosX(0.0);
            ei2.setPosY(0.0);
            ei2.setPosZ(0.0);
        }
        hg.aER.bgK.bko = 20;
    };
    @dm
    public final dk<fh> rc = fh2 -> {
        if (fh2.dq() instanceof i && !this.cR) {
            this.gw();
        }
    };
    @dm(cH=0)
    public final dk<fi> rd = fi2 -> {
        if (this.cR && !fi2.isCancelled()) {
            aj<?> aj2 = fi2.dq();
            this.ra.add(aj2);
            fi2.cF();
        }
    };
    @dm
    public final dk<fg> re = fg2 -> {
        if (this.cR) {
            this.gx();
        }
        this.ra.clear();
    };
    @dm
    public final dk<ej> rf = ej2 -> {
        if (this.qX != null && this.cR) {
            hg.aER.bgu.Ht();
            eq eq2 = new eq(this.qX);
            a.a.e().d(eq2);
            if (!eq2.isCancelled()) {
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
    @dm
    public final dk<fs> rg = fs2 -> {
        if (this.jE != null && this.cR) {
            cz cz2 = new cz(aER);
            String string = this.jE.xU();
            float f2 = this.jE.getHealth();
            float f3 = this.jE.getMaxHealth();
            int n2 = (int)(f2 / f3 * 100.0f);
            String string2 = String.format("Target: %s [%d%%]", string, n2);
            int n3 = hg.aER.fontRendererObj.bQ(string2);
            hg.aER.fontRendererObj.b(string2, (float)cz2.getScaledWidth() / 2.0f - (float)n3 / 2.0f, (float)cz2.getScaledHeight() / 2.0f + 20.0f, -1);
        }
    };

    private void gv() {
        List<r> list = bv.a(((Number)this.qR.wD()).doubleValue(), (boolean)((Boolean)this.qS.wD()), (boolean)((Boolean)this.qV.wD()), false, (boolean)((Boolean)this.qT.wD()), (Boolean)this.qU.wD());
        if (list.isEmpty()) {
            this.jE = null;
            return;
        }
        list.sort(Comparator.comparingDouble(r2 -> {
            akb akb2 = aix.y(r2);
            float f2 = Math.abs(bt.bN(akb2.x - hg.aER.bgK.pl));
            float f3 = Math.abs(bt.bN(akb2.y - hg.aER.bgK.pm));
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

