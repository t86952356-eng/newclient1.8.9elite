/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.lw;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;

public class nk
extends akg<lw> {
    private final akq HH = new akq("Speed", this, (Number)1, (Number)1, (Number)10, (Number)0.1);
    private akd HI;
    private boolean HJ;
    private int HK;
    @dm
    public final dk<eo> HL = eo2 -> {
        if (this.HK > 0 && !this.HJ) {
            --this.HK;
            nk.aER.bgC.dAp = ((Number)this.HH.wD()).floatValue();
        }
    };
    @dm
    public final dk<es> HM = es2 -> {
        if (es2.df() instanceof BlockAir && !nk.aER.bgK.isSneaking()) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < nk.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @dm
    public final dk<fd> HN = fd2 -> {
        akd akd2 = new akd(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        if (this.HI == null) {
            this.HI = akd2;
            fd2.cF();
            this.HK += 2;
        } else if (!this.HI.equals(akd2)) {
            ((lw)this.wy()).toggle();
        } else {
            fd2.cF();
            this.HK += 2;
        }
    };
    @dm
    public final dk<dx> HO = dx2 -> {
        if (dx2.cO() == ((lw)this.wy()).getKey() && !this.HJ) {
            dx2.cF();
            nk.aER.bgK.jump();
            this.HJ = true;
        }
    };

    public nk(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.HI = null;
        this.HJ = false;
        this.HK = 0;
    }
}

