/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lw;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import net.minecraft.client.settings.d;
import net.minecraft.entity.c;
import net.minecraft.entity.item.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.server.bc;
import org.lwjgl.input.Keyboard;

public final class nu
extends akg<lw> {
    private static final long IN = 1000L;
    private static final double IO = 0.42;
    private final akq IP = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private final Deque<aj<?>> IQ = new ConcurrentLinkedDeque();
    private double IR;
    private b IS;
    private boolean IT;
    private boolean IU;
    private long IV;
    @dm
    public final dk<fg> IW = fg2 -> {
        if (((lw)this.wy()).isEnabled()) {
            ((lw)this.wy()).toggle();
        }
    };
    @dm
    public final dk<fi> IX = fi2 -> {
        if (this.j(fi2.dq())) {
            fi2.cF();
        }
    };
    @dm
    public final dk<fh> IY = fh2 -> {
        if (this.IT && fh2.dq() instanceof bc) {
            this.IQ.offer(fh2.dq());
            fh2.cF();
        }
    };
    @dm
    public final dk<ej> IZ = ej2 -> {
        this.hq();
        if (this.hs()) {
            this.IR = 0.0;
            this.ht();
            return;
        }
        if (!this.IU) {
            return;
        }
        this.IR = 0.0;
        if (nu.aER.bgR != null) {
            return;
        }
        if (Keyboard.isKeyDown((int)nu.aER.aIY.chq.cO())) {
            this.IR = 0.42;
        } else if (Keyboard.isKeyDown((int)nu.aER.aIY.chr.cO())) {
            this.IR = -0.42;
        }
        nu.aER.aIY.chr.ay(false);
    };
    @dm
    public final dk<eo> Ja = eo2 -> {
        if (this.hs()) {
            this.ht();
            eo2.setStrafe(0.0f);
            eo2.setForward(0.0f);
            eo2.setFriction(0.0f);
            return;
        }
        if (!this.IU) {
            return;
        }
        if (nu.aER.bgK.gX % 1.0 != 0.0) {
            nu.aER.bgK.ue = this.IR;
        }
        nu.aER.bgK.ud = 0.0;
        nu.aER.bgK.uf = 0.0;
        eo2.setFriction(((Number)this.IP.wD()).floatValue());
    };

    public nu(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.gS();
    }

    @Override
    public void onDisable() {
        this.hu();
    }

    private void hq() {
        if (this.hs()) {
            this.ht();
        }
        if (!this.IT && nu.aER.bgK.crC instanceof b) {
            this.IS = (b)nu.aER.bgK.crC;
            nu.aER.bgK.swingItem();
            ahn.m(new net.minecraft.network.play.client.c((c)this.IS, net.minecraft.network.play.client.d.daU));
            this.IT = true;
            this.IV = System.currentTimeMillis() + 1000L;
            this.ht();
        }
        if (this.IT && !this.IU && this.hr()) {
            this.IU = true;
            this.IV = System.currentTimeMillis() + 1000L;
            this.ht();
        }
    }

    private boolean hr() {
        return this.IS == null || this.IS.csb || nu.aER.bgF == null || nu.aER.bgF.cn(this.IS.getEntityId()) != this.IS;
    }

    private boolean j(aj<?> aj2) {
        if (!(aj2 instanceof n)) {
            return false;
        }
        n n2 = (n)aj2;
        return n2.agb() == o.dbp && (nu.aER.bgK.crC instanceof b || this.IS != null);
    }

    private boolean hs() {
        return this.IV > System.currentTimeMillis();
    }

    private void ht() {
        if (nu.aER.bgK == null) {
            return;
        }
        nu.aER.bgK.ud = 0.0;
        nu.aER.bgK.ue = 0.0;
        nu.aER.bgK.uf = 0.0;
    }

    private void hu() {
        this.hv();
        this.gS();
        this.ht();
        if (nu.aER.aIY != null) {
            int n2 = nu.aER.aIY.chr.cO();
            d.k(n2, Keyboard.isKeyDown((int)n2));
        }
    }

    private void hv() {
        aj<?> aj2;
        while ((aj2 = this.IQ.poll()) != null) {
            if (aER.AU() == null) continue;
            try {
                aj2.a(aER.AU());
            }
            catch (Exception exception) {}
        }
    }

    private void gS() {
        this.IS = null;
        this.IT = false;
        this.IU = false;
        this.IV = 0L;
        this.IR = 0.0;
        this.IQ.clear();
    }
}

