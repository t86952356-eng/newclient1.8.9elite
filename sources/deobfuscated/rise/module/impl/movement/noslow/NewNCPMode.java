/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.ahn;
import hackclient.rise.bb;
import hackclient.rise.fd;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.NoSlow;

public class NewNCPMode
extends Mode<NoSlow> {
    private int zn;
    @EventLink
    public final Listener<PreMotionEvent> NI = preMotionEvent -> {
        ++this.zn;
        this.hG();
        this.hH();
        this.hI();
    };
    @EventLink
    public final Listener<SlowDownEvent> NJ = slowDownEvent -> {
        if (Client.a.g().c(KillAura.class).jE != null) {
            return;
        }
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };
    @EventLink
    public final Listener<fd> NK = fd2 -> {
        this.zn = 0;
    };

    public NewNCPMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }

    @Override
    public void onEnable() {
    }

    private void hG() {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof bg) {
            this.hK();
        }
    }

    private void hH() {
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof by) {
            this.hK();
        }
    }

    private void hI() {
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && NewNCPMode.aER.bgK.isUsingItem() && NewNCPMode.aER.bgK.Vk().bP() instanceof cp) {
            this.hK();
        }
    }

    private void hK() {
        if (this.zn > 10 && !bb.a(false, true, true, false, false) && Client.a.g().c(KillAura.class).jE == null) {
            ahn.m(new k(new b(-1, -1, -1), 5, null, 0.0f, 0.0f, 0.0f));
        }
    }
}

