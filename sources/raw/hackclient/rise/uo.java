/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.bc;
import hackclient.rise.bd;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ez;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.ox;
import hackclient.rise.tb;
import hackclient.rise.tn;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.j;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.s;
import net.minecraft.util.b;

public class uo
extends akg<tb> {
    private akd Ft;
    private akd EC;
    private boolean aiD;
    private boolean aiE;
    private int aiF;
    private boolean bh;
    private final akq aiG = new akq("Distance", this, (Number)3, (Number)0, (Number)10, (Number)0.1);
    @dm(cH=1)
    public final dk<ez> aiH = ez2 -> {
        if (uo.aER.bgK.aRg <= 75) {
            return;
        }
        if (this.e(lw.class).isEnabled()) {
            return;
        }
        boolean bl2 = false;
        this.bh = aii.enoughMovementForSprinting();
        int n2 = 0;
        while ((double)n2 <= ((Number)this.aiG.wD()).doubleValue() * 40.0) {
            j j2 = aik.aER.bgF;
            akd akd2 = aii.a(uo.aER.bgK, new akb(uo.aER.bgK.cuV, uo.aER.bgK.cuW), n2, true);
            b b2 = new b(akd2.x, akd2.y - (double)n2, akd2.z);
            Block block = j2.L(b2).df();
            if (block != Blocks.cLc || uo.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
            ++n2;
        }
        if (bl2) {
            ++this.aiF;
        } else if (uo.aER.bgK.aO) {
            this.aiF = 0;
        }
        if (!(!bl2 || this.Ft == null || this.EC == null || !((double)this.aiF < 30.0 + ((Number)this.aiG.wD()).doubleValue() * 30.0) || this.e(lz.class).isEnabled() && (((akg)a.a.g().c(lz.class).DD.wD()).getName().equals("Watchdog Fire Ball") || ((akg)a.a.g().c(lz.class).DD.wD()).getName().equals("Watchdog Fire Ball 2")) || this.e(lz.class).isEnabled() && ox.Mk || this.e(lw.class).isEnabled() || uo.aER.bgK.cHV.fi(0) != null && uo.aER.bgK.cHV.fi(0).bP() == Items.cQU || this.e(tn.class).isEnabled())) {
            if (!this.aiE) {
                this.aiD = true;
                bm.blink();
                bc.a(s.class, net.minecraft.network.play.client.a.class, net.minecraft.network.play.client.b.class);
                if ((double)bd.cY > ((Number)this.aiG.wD()).doubleValue() || this.aiE) {
                    ahn.n(new f(this.Ft.x, this.Ft.y - -0.09800000190735147, this.Ft.z, false));
                    bc.cQ.clear();
                    bd.cY = 0.0f;
                    this.aiE = true;
                }
            } else {
                bm.dispatch();
            }
        } else {
            this.aiE = false;
            if (this.aiD) {
                bm.dispatch();
                this.aiD = false;
            }
            this.EC = new akd(uo.aER.bgK.ud, uo.aER.bgK.ue, uo.aER.bgK.uf);
            this.Ft = new akd(uo.aER.bgK.gW, uo.aER.bgK.gX, uo.aER.bgK.gY);
        }
    };

    public uo(String string, tb tb2) {
        super(string, tb2);
    }
}

