/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.es;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public class mr
extends akg<lw> {
    private double y;
    @dm
    public final dk<ei> Fm = ei2 -> {
        if (mr.aER.aIY.chq.Re() || mr.aER.aIY.chr.Re()) {
            this.y = mr.aER.bgK.gX;
        }
        if (mr.aER.bgK.aO) {
            mr.aER.bgK.jump();
        }
    };
    @dm
    public final dk<es> Fn = es2 -> {
        if (es2.df() instanceof BlockAir && !mr.aER.aIY.chr.Re() && (mr.aER.bgK.gX < this.y + 1.0 || mr.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < mr.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @dm
    public final dk<dz> Fo = dz2 -> dz2.setSneak(false);

    public mr(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.y = Math.floor(mr.aER.bgK.gX);
    }
}

