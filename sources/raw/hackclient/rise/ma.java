/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.es;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.block.BlockAir;
import net.minecraft.client.entity.c;
import net.minecraft.client.multiplayer.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.util.a;
import net.minecraft.util.cf;

@gl(aliases={"module.movement.noclip.name"}, description="module.movement.noclip.description", category=gj.MOVEMENT)
public class ma
extends gi {
    private final aki DI = new aki("Block", (gi)this, (Boolean)false);
    @dm
    public final dk<es> DJ = es2 -> {
        if (aik.vz()) {
            es2.a(null);
            if (!(es2.df() instanceof BlockAir) && !ma.aER.aIY.chr.Re()) {
                double d2 = es2.dg().wt();
                double d3 = es2.dg().wu();
                double d4 = es2.dg().wx();
                if (d3 < ma.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
                }
            }
        }
    };
    @dm
    public final dk<ek> DK = dh::cF;
    @dm
    public final dk<ej> DL = ej2 -> {
        ma.aER.bgK.csp = true;
        if (((Boolean)this.DI.wD()).booleanValue()) {
            int n2 = ain.vM();
            if (n2 == -1 || aik.vz()) {
                return;
            }
            this.d(bu.class);
            bu.setSlot(n2);
            bs.a(new akb(ma.aER.bgK.pl, 90.0f), 2.0 + Math.random(), cb.gH);
            if (bs.fk.y >= 89.0f && ma.aER.bhc.dzu == cf.dzy && ma.aER.bgK.gX == (double)ma.aER.bhc.dg().aqX().wu()) {
                d d2 = ma.aER.bgu;
                c c2 = ma.aER.bgK;
                j j2 = ma.aER.bgF;
                this.d(bu.class);
                d2.a(c2, j2, bu.bO(), ma.aER.bhc.dg(), ma.aER.bhc.dzv, ma.aER.bhc.daS);
                ma.aER.bgK.swingItem();
            }
        }
    };

    @Override
    public void onDisable() {
        ma.aER.bgK.csp = false;
    }
}

