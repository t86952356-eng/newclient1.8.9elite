/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import net.minecraft.client.settings.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.other.antiafk.name"}, description="module.other.antiafk.description", category=Category.MOVEMENT)
public final class AntiAFK
extends Module {
    private int TB;
    @EventLink
    public final Listener<PreMotionEvent> TC = preMotionEvent -> {
        a a2 = AntiAFK.aER.aIY;
        if (a2.chq.Rg() || a2.chp.Rg() || a2.chm.Rg() || a2.chn.Rg() || a2.cho.Rg()) {
            this.TB = 0;
        }
        ++this.TB;
        if (this.TB < 200) {
            return;
        }
        if (AntiAFK.aER.bgK.aRg % 5 == 0) {
            AntiAFK.aER.aIY.chp.ay(false);
            AntiAFK.aER.aIY.chn.ay(false);
            AntiAFK.aER.aIY.chq.ay(false);
        }
        if (AntiAFK.aER.bgK.aRg % 20 == 0) {
            if (AntiAFK.aER.bgK.aRg % 40 == 0) {
                AntiAFK.aER.aIY.chp.ay(true);
            } else {
                AntiAFK.aER.aIY.chn.ay(true);
            }
        }
        if (AntiAFK.aER.bgK.aRg % 100 == 0) {
            AntiAFK.aER.aIY.chq.ay(true);
        }
    };
}

