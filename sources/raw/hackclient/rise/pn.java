/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ea;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.fi;
import hackclient.rise.go;
import hackclient.rise.mc;
import net.minecraft.init.Blocks;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.l;

public class pn
extends akg<mc> {
    private int tR;
    private boolean dk;
    private boolean vh;
    private aj<?> NW;
    private go NX = null;
    public final aki NY = new aki("Slow down on Slabs", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<ei> NZ = ei2 -> {
        double d2;
        if (aik.p(0.0, pn.aER.bgK.ue, 0.0) != Blocks.cLc && !pn.aER.bgK.isUsingItem() && ((Boolean)this.NY.wD()).booleanValue()) {
            this.vh = false;
        }
        if (Math.abs((d2 = ei2.getPosY()) - (double)Math.round(d2)) > 0.03 && pn.aER.bgK.aO) {
            this.vh = true;
        }
        if (pn.aER.bgK.isUsingItem() && !(pn.aER.bgK.Vk().bP() instanceof cp)) {
            this.tR = pn.aER.bgK.aO ? 0 : ++this.tR;
            if (this.tR >= 2) {
                this.dk = false;
                this.NW = null;
            } else if (pn.aER.bgK.aO && !this.vh) {
                ei2.setPosY(ei2.getPosY() + 0.001);
            }
        }
        if (this.vh && !pn.aER.bgK.aO && pn.aER.bgK.isUsingItem() && !(pn.aER.bgK.Vk().bP() instanceof cp)) {
            pn.aER.bgK.ud *= 0.1;
            pn.aER.bgK.uf *= 0.1;
        }
    };
    @dm
    public final dk<ea> Oa = ea2 -> {
        if (pn.aER.bgK.Vk() == null) {
            return;
        }
        if (pn.aER.bgK.isUsingItem() || pn.aER.bgK.Vk().bP() instanceof by && !by.gb(pn.aER.bgK.Vk().yc()) || pn.aER.bgK.Vk().bP() instanceof bg || pn.aER.bgK.Vk().bP() instanceof ai) {
            if (pn.aER.bgK.tR < 2 && pn.aER.bgK.tR != 0 && !this.vh) {
                afl.b("You must start eating while in the air even with potions", new Object[0]);
                ea2.cF();
            } else if (pn.aER.bgK.aO) {
                pn.aER.bgK.jump();
                ea2.cF();
            }
        }
    };
    @dm
    private final dk<fi> Ob = fi2 -> {
        if (this.NX == null) {
            this.NX = this.e(go.class);
        }
    };
    @dm
    public final dk<em> Oc = em2 -> {
        if (!this.vh || pn.aER.bgK.aO) {
            if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pn.aER.bgK.isUsingItem() && pn.aER.bgK.Vk().bP() instanceof bg) {
                em2.cF();
            }
            if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pn.aER.bgK.isUsingItem() && pn.aER.bgK.Vk().bP() instanceof by && !by.gb(pn.aER.bgK.Vk().yc())) {
                em2.cF();
            }
            if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pn.aER.bgK.isUsingItem() && pn.aER.bgK.Vk().bP() instanceof ai) {
                em2.cF();
            }
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pn.aER.bgK.isUsingItem() && pn.aER.bgK.Vk().bP() instanceof cp) {
            this.d(bu.class);
            ahn.m(new l(bu.bQ() % 7 + (int)(Math.random() * 2.0) + 1));
            this.d(bu.class);
            ahn.m(new l(bu.bQ()));
            em2.cF();
        }
    };

    public pn(String string, mc mc2) {
        super(string, mc2);
    }
}

