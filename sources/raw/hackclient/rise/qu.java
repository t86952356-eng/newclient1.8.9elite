/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fc;
import hackclient.rise.mj;
import net.minecraft.block.BlockAir;
import net.minecraft.network.play.client.f;

public class qu
extends akg<mj> {
    private final akq Sm = new akq("Height", this, (Number)1, (Number)1, (Number)2.5, (Number)0.1);
    private final akq Sn = new akq("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    private final aki So = new aki("Reverse", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<ei> Sp = ei2 -> {
        qu.aER.bgK.cso = qu.aER.bgK.aO && !aik.vy() ? ((Number)this.Sm.wD()).floatValue() : 0.6f;
        if (!((Boolean)this.So.wD()).booleanValue() || aik.p(0.0, -(((Number)this.Sm.wD()).intValue() + 1), 0.0) instanceof BlockAir || aik.vy()) {
            return;
        }
        for (int i2 = 1; i2 < ((Number)this.Sm.wD()).intValue() + 1; ++i2) {
            qu.aER.bgK.ue -= (double)i2;
        }
    };
    @dm
    public final dk<fc> Sq = fc2 -> {
        if (!qu.aER.bgK.aO || aik.vy()) {
            return;
        }
        double d2 = fc2.da();
        if (d2 <= 0.6) {
            return;
        }
        double[] dArray = d2 > 2.019 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.919} : (d2 > 1.869 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869} : (d2 > 1.5 ? new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652} : (d2 > 1.015 ? new double[]{0.42, 0.7532, 1.01, 1.093, 1.015} : (d2 > 0.875 ? new double[]{0.42, 0.7532} : new double[]{0.39, 0.6938}))));
        qu.aER.bgC.dAp = ((Number)this.Sn.wD()).floatValue();
        for (double d3 : dArray) {
            ahn.m(new f(qu.aER.bgK.gW, qu.aER.bgK.gX + (d3 + Math.random() / 2000.0), qu.aER.bgK.gY, false));
        }
    };

    public qu(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qu.aER.bgK.cso = 0.6f;
    }
}

