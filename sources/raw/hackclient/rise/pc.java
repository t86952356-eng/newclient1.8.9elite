/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.l;

public class pc
extends akg<mc> {
    @dm
    public final dk<ei> Nl = ei2 -> {
        this.hG();
        this.hH();
        this.hI();
        this.hJ();
    };
    @dm
    public final dk<em> Nm = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };

    public pc(String string, mc mc2) {
        super(string, mc2);
    }

    private void hG() {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof bg) {
            this.hK();
        }
    }

    private void hH() {
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof by) {
            this.hK();
        }
    }

    private void hI() {
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof cp) {
            this.hK();
        }
    }

    private void hJ() {
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pc.aER.bgK.isUsingItem() && pc.aER.bgK.Vk().bP() instanceof ai) {
            this.hK();
        }
    }

    private void hK() {
        this.d(bu.class);
        ahn.m(new l(bu.bQ() % 8 + 1));
        this.d(bu.class);
        ahn.m(new l(bu.bQ()));
    }
}

