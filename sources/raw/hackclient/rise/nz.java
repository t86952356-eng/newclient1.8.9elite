/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.lx;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.r;

public class nz
extends akg<lx> {
    private final akq JB = new akq("Clicks", this, (Number)3, (Number)2, (Number)10, (Number)1);
    private final akq JC = new akq("Amount", this, (Number)5, (Number)1, (Number)10, (Number)1);
    private final ConcurrentLinkedQueue<aj<?>> JD = new ConcurrentLinkedQueue();
    private boolean JE;
    private boolean GU;
    private int JF;
    @dm
    public final dk<ei> JG = ei2 -> {
        if (this.hz()) {
            if (!this.GU) {
                if (!this.JE) {
                    this.JE = true;
                } else {
                    for (int i2 = 0; i2 < ((Number)this.JC.wD()).intValue(); ++i2) {
                        ahn.n(new r());
                    }
                    this.JD.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
                    this.JD.clear();
                    this.GU = true;
                }
            }
        } else {
            this.JE = false;
            this.GU = false;
        }
    };
    @dm
    public final dk<eo> JH = eo2 -> {
        if (this.hz() && !this.GU) {
            eo2.cF();
        }
    };
    @dm
    public final dk<ed> JI = ed2 -> {
        if (this.hz() && !this.GU) {
            ed2.cF();
        }
    };
    @dm
    public final dk<fi> JJ = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof r) {
            if (this.hz() && !this.GU) {
                fi2.cF();
                this.JD.add(aj2);
                return;
            }
            ++this.JF;
        }
    };
    @dm
    public final dk<fg> JK = fg2 -> this.JD.clear();
    private final d[] JL;
    @dm
    public final dk<ej> JM;

    public nz(String string, lx lx2) {
        super(string, lx2);
        this.JL = new d[]{nz.aER.aIY.chm, nz.aER.aIY.cho, nz.aER.aIY.chp, nz.aER.aIY.chn, nz.aER.aIY.chq};
        this.JM = ej2 -> {
            if (nz.aER.bgR instanceof f || nz.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JL) {
                d2.ay(a.a(d2));
            }
        };
    }

    private boolean hz() {
        return this.JF > 0 && this.JF % ((Number)this.JB.wD()).intValue() == 0;
    }
}

