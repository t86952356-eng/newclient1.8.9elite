/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.jg;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.client.s;
import rip.vantage.commons.util.time.a;

public class ko
extends akg<jg> {
    private final aki yY = new aki("Movement", (akg<?>)this, (Boolean)false);
    private final aki yZ = new aki("Sprint", (akg<?>)this, (Boolean)false);
    private final aki za = new aki("Damage", (akg<?>)this, (Boolean)false);
    private final ConcurrentLinkedQueue<aj<?>> zb = new ConcurrentLinkedQueue();
    private final ConcurrentLinkedQueue<aj<?>> zc = new ConcurrentLinkedQueue();
    private boolean zd;
    private final a ze = new a();
    private int zf = 0;
    @dm
    public final dk<ei> zg = ei2 -> {
        if (((Boolean)this.yY.wD()).booleanValue()) {
            ++this.zf;
            if (ko.aER.bgK.aRg % 100 == 0) {
                ahn.n(new f(ko.aER.bgK.gW, ko.aER.bgK.gX, ko.aER.bgK.gY, ko.aER.bgK.aO));
                ahn.n(new f(ko.aER.bgK.gW, -0.015625, ko.aER.bgK.gY, false));
                ahn.n(new f(ko.aER.bgK.gW, ko.aER.bgK.gX, ko.aER.bgK.gY, ko.aER.bgK.aO));
                this.zd = true;
            }
            if (this.ze.T(500L) && !this.zb.isEmpty()) {
                ahn.n(this.zb.poll());
                this.ze.aX();
            }
            if (((Boolean)this.za.wD()).booleanValue()) {
                if (ko.aER.bgK.aRg % 200 == 0 && this.zf >= 100) {
                    aic.a(aid.aOJ, 3.42f, 1, false, false);
                }
                if (this.zf > 101) {
                    cg.a("Verus Movement Disabler", "you must get damaged now", 3000);
                }
            }
        }
        if (ko.aER.bgK.cus > 0) {
            this.zf = 0;
        }
        if (this.ze.T(400L) && !this.zc.isEmpty()) {
            ahn.n(this.zc.poll());
            this.ze.aX();
        }
        if (((Boolean)this.yZ.wD()).booleanValue() && aii.isMoving()) {
            ahn.n(new n(ko.aER.bgK, ko.aER.bgK.aRg % 2 == 0 ? o.dbt : o.dbs));
        }
    };
    @dm
    public final dk<fi> zh = fi2 -> {
        aj<b> aj2;
        aj<?> aj3 = fi2.dq();
        if (((Boolean)this.yZ.wD()).booleanValue() && aj3 instanceof n && ((aj2 = (n)aj3).agb() == o.dbs || aj2.agb() == o.dbt)) {
            fi2.cF();
        }
        if (((Boolean)this.yY.wD()).booleanValue()) {
            if (aj3 instanceof s) {
                this.zb.add(aj3);
                fi2.cF();
                if (this.zb.size() > 300) {
                    ahn.n(this.zb.poll());
                }
            }
            if (aj3 instanceof net.minecraft.network.play.client.a) {
                aj2 = (net.minecraft.network.play.client.a)aj3;
                ((net.minecraft.network.play.client.a)aj2).key -= 30;
                this.zc.add(aj2);
                fi2.cF();
            }
        }
    };
    @dm
    public final dk<fd> zi = fd2 -> {
        if (((Boolean)this.yY.wD()).booleanValue()) {
            if (this.zd) {
                fd2.cF();
            }
            this.zd = false;
        }
    };
    @dm
    public final dk<fg> zj = fg2 -> {
        cg.a("Verus Movement Disabler", "wait for damage from disabler or otherwise", 3000);
        this.zb.clear();
        this.zc.clear();
        this.zd = false;
    };

    public ko(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onEnable() {
        cg.a("Verus Movement Disabler", "wait for damage from disabler or otherwise", 3000);
    }
}

