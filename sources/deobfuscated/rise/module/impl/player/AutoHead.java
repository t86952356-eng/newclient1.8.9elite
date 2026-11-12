/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.akj;
import hackclient.rise.bb;
import hackclient.rise.bu;
import net.minecraft.item.ci;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.network.play.client.k;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.Scaffold;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.player.autohead.name"}, description="module.player.autohead.description", category=Category.PLAYER)
public class AutoHead
extends Module {
    private final NumberValue abr = new NumberValue("Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private final akj abs = new akj("Delay", this, (Number)500, (Number)1000, (Number)50, (Number)5000, (Number)50);
    private final a abt = new a();
    private long abu;
    @EventLink
    public final Listener<PreMotionEvent> abv = preMotionEvent -> {
        if (!this.abt.T(this.abu) || AutoHead.aER.bgK.Wi() > 0.0f || this.e(Scaffold.class).isEnabled()) {
            return;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            d d2;
            co co2 = AutoHead.aER.bgK.cHV.fi(i2);
            if (co2 == null || !((d2 = co2.bP()) instanceof ci) || AutoHead.aER.bgK.getHealth() > ((Number)this.abr.wD()).floatValue()) continue;
            this.d(bu.class);
            bu.setSlot(i2);
            if (bb.aW()) continue;
            AutoHead.aER.bgu.Ht();
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
            this.abu = Math.round(ahj.l(((Number)this.abs.wD()).longValue(), this.abs.wP().longValue()));
            this.abt.aX();
        }
    };
}

