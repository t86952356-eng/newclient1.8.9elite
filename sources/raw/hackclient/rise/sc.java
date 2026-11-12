/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.ahx;
import hackclient.rise.aib;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.be;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.player.i;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.other.nuker.name"}, description="module.other.nuker.description", category=gj.PLAYER)
public final class sc
extends gi {
    private final akp Vx = new akp("Mode", this).a(new akg[]{new aks("Nearby")}).a(new akg[]{new aks("Teleport")}).co("Nearby");
    private final akq Vy = new akq("Delay", this, (Number)150, (Number)0, (Number)5000, (Number)50);
    private final akq Vz = new akq("Range", this, (Number)4, (Number)1, (Number)6, (Number)0.5);
    private final aki VA = new aki("Rotations", (gi)this, (Boolean)false);
    private final aki VB = new aki("Scatter", (gi)this, (Boolean)false);
    private final aki VC = new aki("Swing", (gi)this, (Boolean)false);
    private final a VD = new a();
    @dm
    public final dk<ei> VE = ei2 -> {
        if (be.aY()) {
            return;
        }
        double d2 = ((Number)this.Vz.wD()).doubleValue();
        switch (((akg)this.Vx.wD()).getName()) {
            case "Nearby": {
                if (!this.VD.T(((Number)this.Vy.wD()).longValue())) break;
                new Thread(() -> this.b(d2, ei2.getPosX(), ei2.getPosY(), ei2.getPosZ())).start();
                this.VD.aX();
                break;
            }
            case "Teleport": {
                if (!sc.aER.aIY.chu.Re() || !this.VD.T(((Number)this.Vy.wD()).longValue())) break;
                b b2 = sc.aER.bgK.b(999.0, 1.0f).dg();
                if (sc.aER.bgF.L(b2).df() instanceof BlockAir) {
                    return;
                }
                if (sc.aER.bgK.cIt.cJL && !sc.aER.bgK.cIt.cJK) {
                    i i2 = sc.aER.bgK.cIt;
                    i2.cJK = true;
                    ahn.n(new w(i2));
                }
                new Thread(() -> {
                    List<aib> list = ahx.a(new aib(ei2.getPosX(), ei2.getPosY(), ei2.getPosZ()), new aib(b2.wt(), b2.wu(), b2.wx()), false);
                    if (list == null) {
                        return;
                    }
                    for (aib aib2 : list) {
                        ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), false));
                    }
                    this.b(d2, b2.wt(), b2.wu(), b2.wx());
                    Collections.reverse(list);
                    for (aib aib2 : list) {
                        ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), false));
                    }
                }).start();
                this.VD.aX();
            }
        }
    };
    @dm
    public final dk<fh> VF = fh2 -> {
        c c2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof c && !(c2 = (c)aj2).isChat() && c2.DM().arq().equals("You can't build outside the plot!")) {
            fh2.cF();
        }
    };
    @dm
    public final dk<fg> VG = fg2 -> this.toggle();

    private void b(double d2, double d3, double d4, double d5) {
        for (double d6 = -d2; d6 < d2; d6 += 1.0) {
            for (double d7 = d2; d7 > -d2; d7 -= 1.0) {
                for (double d8 = -d2; d8 < d2; d8 += 1.0) {
                    b b2;
                    Block block;
                    if (((Boolean)this.VB.wD()).booleanValue() && (sc.aER.bgK.aRg % 2 == 0 ? d6 : d8) % 2.0 != 0.0 || (block = sc.aER.bgF.L(b2 = new b(d3 + d6, d4 + d7, d5 + d8)).df()) instanceof BlockAir) continue;
                    if (((Boolean)this.VA.wD()).booleanValue()) {
                        akb akb2 = aix.d(new akd(b2.wt(), b2.wu(), b2.wx()));
                        ahn.n(new g(akb2.x, akb2.y, false));
                    }
                    ahn.n(new net.minecraft.network.play.client.i(j.daZ, b2, ao.dwr));
                    if (!((Boolean)this.VC.wD()).booleanValue()) continue;
                    sc.aER.bgK.swingItem();
                }
            }
        }
    }
}

