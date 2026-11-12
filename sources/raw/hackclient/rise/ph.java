/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class ph
extends akg<mc> {
    @dm
    public final dk<ei> NF = ei2 -> {
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && ph.aER.bgK.abK()) {
            ahn.m(new i(j.dbe, b.dtN, ao.dwq));
        }
    };
    @dm
    public final dk<eg> NG = eg2 -> {
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && ph.aER.bgK.abK()) {
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
        }
    };
    @dm
    public final dk<em> NH = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && ph.aER.bgK.isUsingItem() && ph.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && ph.aER.bgK.isUsingItem() && ph.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && ph.aER.bgK.isUsingItem() && ph.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && ph.aER.bgK.isUsingItem() && ph.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };

    public ph(String string, mc mc2) {
        super(string, mc2);
    }
}

