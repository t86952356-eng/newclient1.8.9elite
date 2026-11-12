/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.noslow.Grim19Mode;
import rise.module.impl.movement.noslow.Grim30Mode;
import rise.module.impl.movement.noslow.GrimMode;
import rise.module.impl.movement.noslow.IntaveMode;
import rise.module.impl.movement.noslow.LegitMode;
import rise.module.impl.movement.noslow.MatrixMode;
import rise.module.impl.movement.noslow.NCPMode;
import rise.module.impl.movement.noslow.NewNCPMode;
import rise.module.impl.movement.noslow.PredictionMode;
import rise.module.impl.movement.noslow.VanillaMode;
import rise.module.impl.movement.noslow.VariableMode;
import rise.module.impl.movement.noslow.WatchdogMode;
import rise.module.impl.movement.noslow.WatchdogPredictionMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.noslow.name"}, description="module.movement.noslow.description", category=Category.MOVEMENT)
public class NoSlow
extends Module {
    private final ModeValue DN = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new NCPMode("NCP", this)}).a(new Mode[]{new NewNCPMode("New NCP", this)}).a(new Mode[]{new IntaveMode("Intave", this)}).a(new Mode[]{new LegitMode("Legit", this)}).a(new Mode[]{new WatchdogPredictionMode("Watchdog Prediction", this)}).a(new Mode[]{new VariableMode("Variable", this)}).a(new Mode[]{new PredictionMode("Prediction", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new Grim19Mode("Grim 1.9", this)}).a(new Mode[]{new GrimMode("Grim", this)}).a(new Mode[]{new Grim30Mode("Grim 3.0", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).co("Vanilla");
    public final BooleanValue DO = new BooleanValue("Food", (Module)this, (Boolean)false);
    public final BooleanValue DP = new BooleanValue("Potion", (Module)this, (Boolean)false);
    public final BooleanValue DQ = new BooleanValue("Sword", (Module)this, (Boolean)false);
    public final BooleanValue DR = new BooleanValue("Bow", (Module)this, (Boolean)false);
}

