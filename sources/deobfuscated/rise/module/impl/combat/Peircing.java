/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import hackclient.rise.aei;
import hackclient.rise.bs;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ClickEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.ghost.Hitbox;
import rise.module.impl.ghost.Reach;

@ModuleInfo(aliases={"Peircing", "Piercing"}, description="Allows attacks to raycast through blocks", category=Category.COMBAT)
public final class Peircing
extends Module {
    @EventLink
    public final Listener<ClickEvent> qg = clickEvent -> {
        if (Peircing.aER.bgK == null || Peircing.aER.bgF == null) {
            return;
        }
        if (Peircing.aER.bhc != null && Peircing.aER.bhc.dzu == cf.dzz) {
            return;
        }
        ce ce2 = aei.a(bs.bH(), this.gq(), this.gr(), Peircing.aER.bgK, true);
        if (ce2 != null && ce2.dzu == cf.dzz) {
            Peircing.aER.bhc = ce2;
            Peircing.aER.bgM = ce2.dzw;
        }
    };

    public double gq() {
        Reach reach = this.e(Reach.class);
        if (reach == null || !reach.isEnabled()) {
            return 3.0;
        }
        return Math.max(((Number)reach.BQ.wD()).doubleValue(), reach.BQ.wP().doubleValue());
    }

    public float gr() {
        Hitbox hitbox = this.e(Hitbox.class);
        if (hitbox == null || !hitbox.isEnabled()) {
            return 0.0f;
        }
        return ((Number)hitbox.Bj.wD()).floatValue();
    }
}

