/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.ahn;
import hackclient.rise.bu;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.l;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class GrimMode
extends Mode<NoSlow> {
    @EventLink
    public final Listener<PreMotionEvent> Nl = preMotionEvent -> {
        this.hG();
        this.hH();
        this.hI();
        this.hJ();
    };
    @EventLink
    public final Listener<SlowDownEvent> Nm = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };

    public GrimMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }

    private void hG() {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof bg) {
            this.hK();
        }
    }

    private void hH() {
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof by) {
            this.hK();
        }
    }

    private void hI() {
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof cp) {
            this.hK();
        }
    }

    private void hJ() {
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && GrimMode.aER.bgK.isUsingItem() && GrimMode.aER.bgK.Vk().bP() instanceof ai) {
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

