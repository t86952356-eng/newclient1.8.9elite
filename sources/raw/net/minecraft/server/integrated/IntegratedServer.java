/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.Futures
 */
package net.minecraft.server.integrated;

import com.google.common.util.concurrent.Futures;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.FutureTask;
import net.minecraft.client.multiplayer.i;
import net.minecraft.command.bm;
import net.minecraft.nbt.n;
import net.minecraft.network.al;
import net.minecraft.network.play.server.av;
import net.minecraft.profiler.b;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.integrated.IntegratedPlayerList;
import net.minecraft.server.integrated.IntegratedServer$1;
import net.minecraft.server.integrated.IntegratedServer$2;
import net.minecraft.server.integrated.IntegratedServer$3;
import net.minecraft.server.integrated.IntegratedServerCommandManager;
import net.minecraft.src.a;
import net.minecraft.util.ac;
import net.minecraft.util.ay;
import net.minecraft.util.cy;
import net.minecraft.world.ab;
import net.minecraft.world.ai;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.e;
import net.minecraft.world.f;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.o;
import net.minecraft.world.w;
import net.optifine.h;
import net.optifine.reflect.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegratedServer
extends MinecraftServer {
    private static final Logger dlu = LogManager.getLogger();
    private final net.minecraft.client.d dlv;
    private final an dlw;
    private boolean bgP;
    private boolean dlx;
    private i dly;
    private long dlz = 0L;
    public w dlA = null;
    public net.minecraft.util.b dlB = null;
    public e dlC = null;

    public IntegratedServer(net.minecraft.client.d d2) {
        super(d2.Bp(), new File(d2.bhf, dkv.getName()));
        this.dlv = d2;
        this.dlw = null;
    }

    public IntegratedServer(net.minecraft.client.d d2, String string, String string2, an an2) {
        super(new File(d2.bhf, "saves"), d2.Bp(), new File(d2.bhf, dkv.getName()));
        n n2;
        this.fA(d2.Bl().bX());
        this.fB(string);
        this.fC(string2);
        this.ce(d2.AT());
        this.cf(an2.awz());
        this.hb(256);
        this.a(new IntegratedPlayerList(this));
        this.dlv = d2;
        this.dlw = this.AT() ? net.minecraft.world.demo.b.dKe : an2;
        d d3 = this.alp().q(string, false);
        o o2 = d3.azx();
        if (o2 != null && (n2 = o2.azr()) != null && n2.eD("Dimension")) {
            int n3;
            al.dat = n3 = n2.eG("Dimension");
            this.dlv.bgS.bv(-1);
        }
    }

    @Override
    protected bm akM() {
        return new IntegratedServerCommandManager();
    }

    @Override
    protected void a(String string, String string2, long l2, ap ap2, String string3) {
        this.fw(string);
        boolean bl2 = g.enp.aDA();
        if (!bl2) {
            this.dkG = new ai[3];
            this.dkV = new long[this.dkG.length][100];
        }
        d d2 = this.alp().q(string, true);
        this.a(this.alm(), d2);
        o o2 = d2.azx();
        if (o2 == null) {
            o2 = new o(this.dlw, string2);
        } else {
            o2.fC(string2);
        }
        if (bl2) {
            Integer[] integerArray;
            ai ai2 = this.AT() ? (ai)new net.minecraft.world.demo.b(this, d2, o2, 0, this.dkB).avo() : (ai)new ai(this, d2, o2, 0, this.dkB).avo();
            ai2.a(this.dlw);
            Integer[] integerArray2 = integerArray = (Integer[])g.g(g.enr, new Object[0]);
            int n2 = integerArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = integerArray2[i2];
                ai ai3 = n3 == 0 ? ai2 : (ai)new net.minecraft.world.al((MinecraftServer)this, d2, n3, ai2, this.dkB).avo();
                ai3.a(new ab(this, ai3));
                if (!this.all()) {
                    ai3.avH().a(this.If());
                }
                if (!g.enI.aDA()) continue;
                g.a(g.eqS, ai3);
            }
            this.alE().a(new ai[]{ai2});
            if (ai2.avH().agm() == null) {
                this.b(this.dlv.aIY.chN);
            }
        } else {
            for (int i3 = 0; i3 < this.dkG.length; ++i3) {
                int n4 = 0;
                if (i3 == 1) {
                    n4 = -1;
                }
                if (i3 == 2) {
                    n4 = 1;
                }
                if (i3 == 0) {
                    this.dkG[i3] = this.AT() ? (ai)new net.minecraft.world.demo.b(this, d2, o2, n4, this.dkB).avo() : (ai)new ai(this, d2, o2, n4, this.dkB).avo();
                    this.dkG[i3].a(this.dlw);
                } else {
                    this.dkG[i3] = (ai)new net.minecraft.world.al((MinecraftServer)this, d2, n4, this.dkG[0], this.dkB).avo();
                }
                this.dkG[i3].a(new ab(this, this.dkG[i3]));
            }
            this.alE().a(this.dkG);
            if (this.dkG[0].avH().agm() == null) {
                this.b(this.dlv.aIY.chN);
            }
        }
        this.akP();
    }

    @Override
    protected boolean akN() {
        Object object;
        dlu.info("Starting integrated minecraft server version 1.9");
        this.cg(true);
        this.ch(true);
        this.ci(true);
        this.cj(true);
        this.ck(true);
        dlu.info("Generating keypair");
        this.a(ac.arW());
        if (g.eoa.aDA()) {
            object = g.g(g.eoc, new Object[0]);
            if (!g.b(object, g.eoa, this)) {
                return false;
            }
        }
        this.a(this.alm(), this.aln(), this.dlw.avD(), this.dlw.awC(), this.dlw.aln());
        this.fD(this.alk() + " - " + this.dkG[0].avH().aln());
        if (g.eob.aDA()) {
            object = g.g(g.eoc, new Object[0]);
            if (g.eob.aDJ() == Boolean.TYPE) {
                return g.b(object, g.eob, this);
            }
            g.a(object, g.eob, this);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void tick() {
        this.amc();
        boolean bl2 = this.bgP;
        boolean bl3 = this.bgP = net.minecraft.client.d.AZ().AU() != null && net.minecraft.client.d.AZ().Bw();
        if (!bl2 && this.bgP) {
            dlu.info("Saving and pausing game...");
            this.alE().ams();
            this.cd(false);
        }
        if (this.bgP) {
            Queue queue = this.dlo;
            synchronized (queue) {
                while (!this.dlo.isEmpty()) {
                    cy.a((FutureTask)this.dlo.poll(), dlu);
                }
            }
        } else {
            super.tick();
            if (this.dlv.aIY.bOt != this.alE().amz()) {
                dlu.info("Changing view distance to {}, from {}", new Object[]{this.dlv.aIY.bOt, this.alE().amz()});
                this.alE().hg(this.dlv.aIY.bOt);
            }
            if (this.dlv.bgF != null) {
                o o2 = this.dkG[0].avH();
                o o3 = this.dlv.bgF.avH();
                if (!o2.isDifficultyLocked() && o3.agm() != o2.agm()) {
                    dlu.info("Changing difficulty to {}, from {}", new Object[]{o3.agm(), o2.agm()});
                    this.b(o3.agm());
                } else if (o3.isDifficultyLocked() && !o2.isDifficultyLocked()) {
                    dlu.info("Locking difficulty to {}", new Object[]{o3.agm()});
                    for (ai ai2 : this.dkG) {
                        if (ai2 == null) continue;
                        ai2.avH().cJ(true);
                    }
                }
            }
        }
    }

    @Override
    public boolean akQ() {
        return false;
    }

    @Override
    public ao If() {
        return this.dlw.If();
    }

    @Override
    public f agm() {
        return this.dlv.bgF == null ? this.dlv.aIY.chN : this.dlv.bgF.avH().agm();
    }

    @Override
    public boolean ajU() {
        return this.dlw.awA();
    }

    @Override
    public boolean akS() {
        return true;
    }

    @Override
    public boolean akT() {
        return true;
    }

    @Override
    public void cd(boolean bl2) {
        if (bl2) {
            int n2;
            int n3 = this.alI();
            if ((long)n3 < this.dlz + (long)(n2 = this.dlv.aIY.ciu)) {
                return;
            }
            this.dlz = n3;
        }
        super.cd(bl2);
    }

    @Override
    public File akY() {
        return this.dlv.bhf;
    }

    @Override
    public boolean alt() {
        return false;
    }

    @Override
    public boolean alx() {
        return false;
    }

    @Override
    protected void e(net.minecraft.crash.a a2) {
        this.dlv.a(a2);
    }

    @Override
    public net.minecraft.crash.a f(net.minecraft.crash.a a2) {
        a2 = super.f(a2);
        a2.SJ().a("Type", new IntegratedServer$1(this));
        a2.SJ().a("Is Modded", new IntegratedServer$2(this));
        return a2;
    }

    @Override
    public void b(f f2) {
        super.b(f2);
        if (this.dlv.bgF != null) {
            this.dlv.bgF.avH().c(f2);
        }
    }

    @Override
    public void a(b b2) {
        super.a(b2);
        b2.c("snooper_partner", this.dlv.Bi().ajs());
    }

    @Override
    public boolean Bd() {
        return net.minecraft.client.d.AZ().Bd();
    }

    @Override
    public String a(ao ao2, boolean bl2) {
        try {
            int n2 = -1;
            try {
                n2 = ay.atj();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n2 <= 0) {
                n2 = 25564;
            }
            this.alF().a(null, n2);
            dlu.info("Started on " + n2);
            this.dlx = true;
            this.dly = new i(this.alB(), "" + n2);
            this.dly.start();
            this.alE().a(ao2);
            this.alE().cn(bl2);
            return "" + n2;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void stopServer() {
        super.stopServer();
        if (this.dly != null) {
            this.dly.interrupt();
            this.dly = null;
        }
    }

    @Override
    public void akW() {
        if (!g.eqn.aDA() || this.akV()) {
            Futures.getUnchecked(this.f(new IntegratedServer$3(this)));
        }
        super.akW();
        if (this.dly != null) {
            this.dly.interrupt();
            this.dly = null;
        }
    }

    public void ama() {
        this.akX();
    }

    public boolean amb() {
        return this.dlx;
    }

    @Override
    public void a(ao ao2) {
        this.alE().a(ao2);
    }

    @Override
    public boolean alA() {
        return true;
    }

    @Override
    public int akR() {
        return 4;
    }

    private void amc() {
        for (ai ai2 : this.dkG) {
            this.b(ai2);
        }
    }

    public e ad(w w2, net.minecraft.util.b b2) {
        this.dlA = w2;
        this.dlB = b2;
        return this.dlC;
    }

    private void b(ai ai2) {
        if (!a.aoc()) {
            this.d(ai2);
        }
        if (!a.anU()) {
            this.c(ai2);
        }
        if (a.doj) {
            a.doj = false;
            h.a(a.aoH(), ai2);
        }
        if (this.dlA == ai2 && this.dlB != null) {
            this.dlC = ai2.bg(this.dlB);
            this.dlA = null;
            this.dlB = null;
        }
    }

    private void c(ai ai2) {
        o o2 = ai2.avH();
        if (o2.avK() || o2.avJ()) {
            o2.iR(0);
            o2.cG(false);
            ai2.cb(0.0f);
            o2.iQ(0);
            o2.cF(false);
            ai2.bZ(0.0f);
            this.alE().H(new av(2, 0.0f));
            this.alE().H(new av(7, 0.0f));
            this.alE().H(new av(8, 0.0f));
        }
    }

    private void d(ai ai2) {
        o o2 = ai2.avH();
        if (o2.If().awE() == 1) {
            long l2 = ai2.getWorldTime();
            long l3 = l2 % 24000L;
            if (a.aob()) {
                if (l3 <= 1000L) {
                    ai2.o(l2 - l3 + 1001L);
                }
                if (l3 >= 11000L) {
                    ai2.o(l2 - l3 + 24001L);
                }
            }
            if (a.aod()) {
                if (l3 <= 14000L) {
                    ai2.o(l2 - l3 + 14001L);
                }
                if (l3 >= 22000L) {
                    ai2.o(l2 - l3 + 24000L + 14001L);
                }
            }
        }
    }
}

