/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.fd;
import hackclient.rise.go;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;

public class pi
extends akg<mc> {
    private int zn;
    @dm
    public final dk<ei> NI = ei2 -> {
        ++this.zn;
        this.hG();
        this.hH();
        this.hI();
    };
    @dm
    public final dk<em> NJ = em2 -> {
        if (a.a.g().c(go.class).jE != null) {
            return;
        }
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };
    @dm
    public final dk<fd> NK = fd2 -> {
        this.zn = 0;
    };

    public pi(String string, mc mc2) {
        super(string, mc2);
    }

    @Override
    public void onEnable() {
    }

    private void hG() {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof bg) {
            this.hK();
        }
    }

    private void hH() {
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof by) {
            this.hK();
        }
    }

    private void hI() {
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pi.aER.bgK.isUsingItem() && pi.aER.bgK.Vk().bP() instanceof cp) {
            this.hK();
        }
    }

    private void hK() {
        if (this.zn > 10 && !bb.a(false, true, true, false, false) && a.a.g().c(go.class).jE == null) {
            ahn.m(new k(new b(-1, -1, -1), 5, null, 0.0f, 0.0f, 0.0f));
        }
    }
}

