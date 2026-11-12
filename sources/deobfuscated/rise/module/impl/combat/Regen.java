/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.regen.VanillaMode;
import rise.module.impl.combat.regen.VerusRegenMode;
import rise.module.impl.combat.regen.WorldGuardMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.combat.regen.name"}, description="module.combat.regen.description", category=Category.COMBAT)
public final class Regen
extends Module {
    private final ModeValue qh = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new VerusRegenMode("Verus Regen", this)}).a(new Mode[]{new WorldGuardMode("World Guard", this)}).co("Vanilla");
}

