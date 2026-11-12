/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fc;
import hackclient.rise.fi;
import hackclient.rise.mj;
import net.minecraft.network.play.client.f;

public class qv
extends akg<mj> {
    private final akq Sr = new akq("Height", this, (Number)1, (Number)1, (Number)1.5, (Number)0.1);
    private final akq Ss = new akq("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    private double St;
    @dm
    public final dk<ei> Su = ei2 -> {
        qv.aER.bgK.cso = qv.aER.bgK.aO && !aik.vy() ? ((Number)this.Sr.wD()).floatValue() : 0.6f;
    };
    @dm
    public final dk<fc> Sv = fc2 -> {
        double d2;
        if (!qv.aER.bgK.aO || aik.vy()) {
            return;
        }
        this.St = d2 = fc2.da();
        if (d2 <= (double)0.6f) {
            return;
        }
        double[] dArray = d2 > 1.015 ? new double[]{0.42f, 0.7532f, 1.0, 0.98f} : (d2 > 0.875 ? new double[]{0.42f, 0.7532f, 1.0} : new double[]{0.39f, 0.6938f});
        qv.aER.bgC.dAp = ((Number)this.Ss.wD()).floatValue();
        for (double d3 : dArray) {
            ahn.n(new f(qv.aER.bgK.gW, qv.aER.bgK.gX + d3, qv.aER.bgK.gY, false));
        }
    };
    @dm
    private final dk<fi> Sw = fi2 -> {
        double[] dArray = this.St > 1.015 ? new double[]{0.42f, 0.7532f, 1.0, 0.98f} : (this.St > 0.875 ? new double[]{0.42f, 0.7532f, 1.0} : new double[]{0.39f, 0.6938f});
        if (fi2.dq() instanceof f && aik.vv()) {
            for (double d2 : dArray) {
            }
        }
    };

    public qv(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qv.aER.bgK.cso = 0.6f;
    }
}

