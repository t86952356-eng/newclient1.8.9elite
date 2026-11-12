/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.player.healthbypass.name"}, description="module.player.healthbypass.description", category=Category.PLAYER)
public final class HealthBypass
extends Module {
    @EventLink
    public final Listener<TickEvent> adp = tickEvent -> {
        if (HealthBypass.aER.bgK == null || HealthBypass.aER.bgF == null) {
            return;
        }
        for (c c2 : HealthBypass.aER.bgF.dCS) {
            float f2;
            a a2;
            if (!(c2 instanceof a) || (a2 = (a)c2) == HealthBypass.aER.bgK || (f2 = HealthBypass.B(a2)) <= 0.0f && !a2.csb || Float.isNaN(f2) || Float.isInfinite(f2)) continue;
            float f3 = a2.getMaxHealth();
            if (f3 > 0.0f) {
                f2 = Math.min(f2, f3);
            }
            a2.aY(f2);
        }
    };

    public static float B(r r2) {
        if (!(r2 instanceof a)) {
            return r2.getHealth();
        }
        a a2 = (a)r2;
        i i2 = a2.acc();
        if (i2 == null) {
            return r2.getHealth();
        }
        g g2 = i2.gY(2);
        if (g2 == null) {
            return r2.getHealth();
        }
        d d2 = i2.b(a2.xU(), g2);
        return d2.akm();
    }
}

