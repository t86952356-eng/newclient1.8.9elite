/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.es;
import hackclient.rise.ez;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public class ns
extends akg<lw> {
    private final akp IE = new akp("Sub-Mode", this).a(new akg[]{new aks("Fast")}).co("Fast");
    private int hV = 0;
    @dm
    public final dk<ei> IF = ei2 -> {
        if (((akg)this.IE.wD()).getName().equals("Fast") && ns.aER.aIY.chq.Re() && ns.aER.bgK.aRg % 2 == 0) {
            ns.aER.bgK.ue = 0.42f;
        }
        ++this.hV;
    };
    @dm
    public final dk<ez> IG = ez2 -> {
        if (((akg)this.IE.wD()).getName().equals("Fast")) {
            if (ns.aER.bgK.aO && this.hV % 14 == 0) {
                ez2.setPosY(0.42f);
                aii.strafe(0.69);
                ns.aER.bgK.ue = -(ns.aER.bgK.gX - Math.floor(ns.aER.bgK.gX));
            } else if (ns.aER.bgK.aO) {
                aii.strafe(1.01 + aii.speedPotionAmp(0.15));
            } else {
                aii.strafe(0.41 + aii.speedPotionAmp(0.05));
            }
            ns.aER.bgK.setSprinting(true);
            ns.aER.bgK.bkD = true;
        }
        ++this.hV;
    };
    @dm
    public final dk<es> IH = es2 -> {
        if (((akg)this.IE.wD()).getName().equals("Fast") && (es2.df() instanceof BlockAir && !ns.aER.aIY.chr.Re() || ns.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < ns.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @dm
    public final dk<dz> II = dz2 -> dz2.setSneak(false);

    public ns(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

