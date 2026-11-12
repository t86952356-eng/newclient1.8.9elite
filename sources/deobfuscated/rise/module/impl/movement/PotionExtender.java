/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import java.util.HashMap;
import net.minecraft.potion.d;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.potionextender.name"}, description="module.movement.potionextender.description", category=Category.MOVEMENT)
public class PotionExtender
extends Module {
    private final NumberValue DT = new NumberValue("Extend Duration", this, (Number)10, (Number)1, (Number)60, (Number)1);
    public final HashMap<d, a> DU = new HashMap();
    @EventLink
    public final Listener<PreMotionEvent> DV = preMotionEvent -> {
        for (d d2 : PotionExtender.aER.bgK.VL()) {
            a a2;
            if (this.DU.containsKey(d2)) {
                a2 = this.DU.get(d2);
                if (!a2.T(((Number)this.DT.wD()).longValue() * 1000L)) continue;
                PotionExtender.aER.bgK.eL(d2.aje());
                this.DU.remove(d2);
                continue;
            }
            if (d2.duration != 1) continue;
            a2 = new a();
            a2.aX();
            this.DU.put(d2, a2);
        }
    };
}

