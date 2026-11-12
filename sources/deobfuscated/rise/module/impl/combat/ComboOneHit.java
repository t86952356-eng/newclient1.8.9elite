/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.combat.comboonehit.name", "Insta Kill", "Instant Kill"}, description="module.combat.comboonehit.description", category=Category.COMBAT)
public final class ComboOneHit
extends Module {
    public final NumberValue lG = new NumberValue("Attack Packets", this, (Number)50, (Number)1, (Number)1000, (Number)1);
    @EventLink
    public final Listener<AttackEvent> lH = attackEvent -> {
        for (int i2 = 0; i2 < ((Number)this.lG.wD()).intValue(); ++i2) {
            ahn.m(new c((net.minecraft.entity.c)attackEvent.dc(), d.daU));
        }
    };
}

