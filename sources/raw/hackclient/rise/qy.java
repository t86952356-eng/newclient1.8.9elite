/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fc;
import hackclient.rise.fe;
import hackclient.rise.mh;
import hackclient.rise.mj;
import hackclient.rise.tn;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.network.play.client.f;

public class qy
extends akg<mj> {
    private boolean Sk;
    @dm
    public final dk<ej> SE = ej2 -> {};
    @dm
    public final dk<ei> SF = ei2 -> {
        if (qy.aER.bgK.aO) {
            // empty if block
        }
    };
    private double St;
    private int hV;
    private long SG;
    private boolean Ka = false;
    @dm
    public final dk<ei> SH = ei2 -> {
        if (this.e(tn.class).isEnabled()) {
            return;
        }
        qy.aER.bgK.cso = qy.aER.bgK.aO && !aik.vy() && !qy.aER.aIY.chq.Re() ? 1.0f : 0.6f;
    };
    @dm
    public final dk<fc> SI = fc2 -> {
        double d2;
        aii.strafe(aii.vs());
        this.St = d2 = fc2.da();
        if (this.e(mh.class).isEnabled() && d2 > (double)0.6f) {
            this.e(mh.class).setEnabled(false);
            this.Ka = true;
        }
        if (this.e(tn.class).isEnabled()) {
            return;
        }
        qy.aER.bgK.cso = 1.0f;
        if (!qy.aER.bgK.aO || aik.vy() || aik.o(qy.aER.bgK.gW, qy.aER.bgK.gX, qy.aER.bgK.gY) instanceof BlockSlab || aik.o(qy.aER.bgK.gW, qy.aER.bgK.gX, qy.aER.bgK.gY) instanceof BlockStairs) {
            return;
        }
        if (d2 <= (double)0.6f) {
            return;
        }
        double[] dArray = new double[]{};
        if (d2 == 1.0) {
            dArray = new double[]{0.42f, 0.75, 1.0};
        }
        this.SG = System.currentTimeMillis() + 300L;
        for (double d3 : dArray) {
            qy.aER.bgC.dAp = 0.25f;
            ahn.m(new f(qy.aER.bgK.gW, qy.aER.bgK.gX + d3, qy.aER.bgK.gY, false));
            this.hV = 0;
        }
    };
    @dm
    public final dk<fe> SJ = fe2 -> {
        ++this.hV;
        if (this.hV == 1) {
            qy.aER.bgC.dAp = 1.0f;
        }
        if (this.Ka && System.currentTimeMillis() > this.SG) {
            this.e(mh.class).setEnabled(true);
            this.Ka = false;
            this.SG = 0L;
        }
    };

    public qy(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qy.aER.bgK.cso = 0.6f;
        this.Ka = false;
        this.SG = 0L;
    }
}

