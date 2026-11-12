/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.akn;
import hackclient.rise.gg;
import hackclient.rise.xq;
import hackclient.rise.zr;
import java.util.ArrayList;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.keystrokes.name"}, description="module.render.keystrokes.description", category=Category.RENDER)
public final class KeyStrokes
extends Module {
    private final akn apu = new akn("Position", (Module)this, new Vector2d(100.0, 100.0), false);
    private final BooleanValue apv = new BooleanValue("Space", (Module)this, (Boolean)true);
    private boolean apw;
    private final int apx = 3;
    private ArrayList<zr> apy = new ArrayList();
    @EventLink
    public final Listener<Render2DEvent> apz = render2DEvent -> {
        if (KeyStrokes.aER.bgR != null) {
            if (this.apw != (Boolean)this.apv.wD()) {
                this.apy = new xq(this);
            }
            this.apw = (Boolean)this.apv.wD();
        }
        this.apu.n(new Vector2d(72.0, 72.0));
        this.b(gg.kV).c(() -> this.apy.forEach(zr2 -> zr2.c(this.apu.aqy)));
        this.b(gg.kU).c(() -> this.apy.forEach(zr2 -> zr2.d(this.apu.aqy)));
        this.b(gg.kT).c(() -> this.apy.forEach(zr2 -> zr2.e(this.apu.aqy)));
    };
}

