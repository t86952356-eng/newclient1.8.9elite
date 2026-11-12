/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.mimic.ClickerMode;
import rise.module.impl.combat.mimic.RotationsMode;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"Mimic"}, description="", category=Category.COMBAT)
public final class Mimic
extends Module {
    private BooleanValue qe = new BooleanValue("Rotations", (Module)this, (Boolean)true, new RotationsMode("Rotations", this));
    private BooleanValue qf = new BooleanValue("Clicker", (Module)this, (Boolean)true, new ClickerMode("Clicker", this));
}

