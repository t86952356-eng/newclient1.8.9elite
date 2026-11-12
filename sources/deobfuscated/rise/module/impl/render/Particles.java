/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import net.minecraft.entity.r;
import net.minecraft.util.as;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.particles.name"}, description="module.render.particles.description", category=Category.RENDER)
public final class Particles
extends Module {
    private final NumberValue apP = new NumberValue("Multiplier", this, (Number)1, (Number)1, (Number)10, (Number)1);
    private final BooleanValue apQ = new BooleanValue("Always Crit", (Module)this, (Boolean)true);
    private final BooleanValue apR = new BooleanValue("Always Sharpness", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<AttackEvent> apS = attackEvent -> {
        r r2 = attackEvent.dc();
        if (Particles.aER.bgK.csf > 0.0f || ((Boolean)this.apQ.wD()).booleanValue() || ((Boolean)this.apR.wD()).booleanValue()) {
            for (int i2 = 0; i2 <= ((Number)this.apP.wD()).intValue(); ++i2) {
                if (((Boolean)this.apQ.wD()).booleanValue()) {
                    Particles.aER.bgK.E(r2);
                }
                if (!((Boolean)this.apR.wD()).booleanValue()) continue;
                Particles.aER.bgN.a(r2, as.dxg);
            }
        }
    };
}

