/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.esp.YpMode;
import rise.module.impl.render.esp.YqMode;
import rise.module.impl.render.esp.YrMode;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.esp.name"}, description="module.render.esp.description", category=Category.RENDER)
public final class ESP
extends Module {
    private final BooleanValue anQ = new BooleanValue("Glow", (Module)this, (Boolean)false, new YqMode("", this));
    private final BooleanValue anR = new BooleanValue("Chams", (Module)this, (Boolean)false, new YpMode("", this));
    public final BooleanValue anS = new BooleanValue("Static Color", (Module)this, (Boolean)false, () -> (Boolean)this.anR.wD() == false);
    private final BooleanValue anT = new BooleanValue("Skeletal", (Module)this, (Boolean)false, new YrMode("", this));
    public final BooleanValue anU = new BooleanValue("White Color", (Module)this, (Boolean)false, () -> (Boolean)this.anT.wD() == false);
    public final NumberValue anV = new NumberValue("Width", this, (Number)0.5, (Number)0.1, (Number)1.5, (Number)0.1);
}

