/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.fullbright.EffectMode;
import rise.module.impl.render.fullbright.GammaMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.fullbright.name"}, description="module.render.fullbright.description", category=Category.RENDER)
public final class FullBright
extends Module {
    private final ModeValue aoo = new ModeValue("Mode", this).a(new Mode[]{new GammaMode("Gamma", this)}).a(new Mode[]{new EffectMode("Effect", this)}).co("Gamma");
}

