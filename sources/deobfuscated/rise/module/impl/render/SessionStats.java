/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.akn;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.sessionstats.ModernMode;
import rise.module.impl.render.sessionstats.RueMode;
import rise.util.math.Vector2d;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.sessionstats.name"}, description="module.render.sessionstats.description", category=Category.RENDER)
public final class SessionStats
extends Module {
    private final akn aqp = new akn("", (Module)this, new Vector2d(100.0, 200.0), true);
    private final ModeValue aqq = new ModeValue("Mode", this).a(new Mode[]{new RueMode("Rue", this)}).a(new Mode[]{new ModernMode("Modern", this)}).co("Modern");

    public akn mx() {
        return this.aqp;
    }
}

