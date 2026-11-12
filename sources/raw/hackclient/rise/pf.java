/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.em;
import hackclient.rise.eo;
import hackclient.rise.mc;
import hackclient.rise.mh;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;

public class pf
extends akg<mc> {
    @dm
    public final dk<em> Ns = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };
    @dm
    public final dk<eo> Nt = eo2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof bg) {
            if (pf.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(mh.class).isEnabled()) {
                pf.aER.bgK.ud *= 0.992;
                pf.aER.bgK.uf *= 0.992;
            } else {
                pf.aER.bgK.ud *= 0.99;
                pf.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof by) {
            if (pf.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(mh.class).isEnabled()) {
                pf.aER.bgK.ud *= 0.992;
                pf.aER.bgK.uf *= 0.992;
            } else {
                pf.aER.bgK.ud *= 0.99;
                pf.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof cp) {
            if (pf.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(mh.class).isEnabled()) {
                pf.aER.bgK.ud *= 0.992;
                pf.aER.bgK.uf *= 0.992;
            } else {
                pf.aER.bgK.ud *= 0.99;
                pf.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pf.aER.bgK.isUsingItem() && pf.aER.bgK.Vk().bP() instanceof ai) {
            if (pf.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(mh.class).isEnabled()) {
                pf.aER.bgK.ud *= 0.992;
                pf.aER.bgK.uf *= 0.992;
            } else {
                pf.aER.bgK.ud *= 0.99;
                pf.aER.bgK.uf *= 0.99;
            }
        }
    };

    public pf(String string, mc mc2) {
        super(string, mc2);
    }
}

