/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.ahn;
import hackclient.rise.bc;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class IntaveMode
extends Mode<NoSlow> {
    boolean bi;
    @EventLink
    public final Listener<PreMotionEvent> Nn = preMotionEvent -> {
        if (IntaveMode.aER.bgK.abO() == null) {
            return;
        }
        d d2 = IntaveMode.aER.bgK.abO().bP();
        if (IntaveMode.aER.bgK.isUsingItem()) {
            if (d2 instanceof cp && ((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue()) {
                bc.cR = true;
                if (IntaveMode.aER.bgK.aRg % 5 == 0) {
                    ahn.m(new i(j.dbe, b.dtN, ao.dwq));
                    bc.dispatch();
                    aER.AU().u(new k(IntaveMode.aER.bgK.abO()));
                }
            } else if (d2 instanceof bg && ((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() || d2 instanceof ai && ((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue()) {
                bc.cR = true;
            }
            this.bi = true;
        } else if (this.bi) {
            this.bi = false;
            bc.cR = false;
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> No = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && IntaveMode.aER.bgK.isUsingItem() && IntaveMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && IntaveMode.aER.bgK.isUsingItem() && IntaveMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && IntaveMode.aER.bgK.isUsingItem() && IntaveMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && IntaveMode.aER.bgK.isUsingItem() && IntaveMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };

    public IntaveMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

