/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bc;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class pd
extends akg<mc> {
    boolean bi;
    @dm
    public final dk<ei> Nn = ei2 -> {
        if (pd.aER.bgK.abO() == null) {
            return;
        }
        d d2 = pd.aER.bgK.abO().bP();
        if (pd.aER.bgK.isUsingItem()) {
            if (d2 instanceof cp && ((Boolean)((mc)this.wy()).DQ.wD()).booleanValue()) {
                bc.cR = true;
                if (pd.aER.bgK.aRg % 5 == 0) {
                    ahn.m(new i(j.dbe, b.dtN, ao.dwq));
                    bc.dispatch();
                    aER.AU().u(new k(pd.aER.bgK.abO()));
                }
            } else if (d2 instanceof bg && ((Boolean)((mc)this.wy()).DO.wD()).booleanValue() || d2 instanceof ai && ((Boolean)((mc)this.wy()).DR.wD()).booleanValue()) {
                bc.cR = true;
            }
            this.bi = true;
        } else if (this.bi) {
            this.bi = false;
            bc.cR = false;
        }
    };
    @dm
    public final dk<em> No = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pd.aER.bgK.isUsingItem() && pd.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pd.aER.bgK.isUsingItem() && pd.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pd.aER.bgK.isUsingItem() && pd.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pd.aER.bgK.isUsingItem() && pd.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };

    public pd(String string, mc mc2) {
        super(string, mc2);
    }
}

