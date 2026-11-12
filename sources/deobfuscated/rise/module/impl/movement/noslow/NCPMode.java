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
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class NCPMode
extends Mode<NoSlow> {
    @EventLink
    public final Listener<PreMotionEvent> NF = preMotionEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && NCPMode.aER.bgK.abK()) {
            ahn.m(new i(j.dbe, b.dtN, ao.dwq));
        }
    };
    @EventLink
    public final Listener<PostMotionEvent> NG = postMotionEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && NCPMode.aER.bgK.abK()) {
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> NH = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && NCPMode.aER.bgK.isUsingItem() && NCPMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && NCPMode.aER.bgK.isUsingItem() && NCPMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && NCPMode.aER.bgK.isUsingItem() && NCPMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && NCPMode.aER.bgK.isUsingItem() && NCPMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };

    public NCPMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

