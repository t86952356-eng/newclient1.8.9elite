/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.sneak.HoldMode;
import rise.module.impl.movement.sneak.NCPMode;
import rise.module.impl.movement.sneak.StandardMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.sneak.name"}, description="module.movement.sneak.description", category=Category.MOVEMENT)
public class Sneak
extends Module {
    private final ModeValue Ef = new ModeValue("Mode", this).a(new Mode[]{new StandardMode("Standard", this)}).a(new Mode[]{new HoldMode("Hold", this)}).a(new Mode[]{new NCPMode("NCP", this)}).co("Standard");
}

