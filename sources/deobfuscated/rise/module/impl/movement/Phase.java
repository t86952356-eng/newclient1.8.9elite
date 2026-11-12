/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.phase.BlocksMCMode;
import rise.module.impl.movement.phase.GrimMode;
import rise.module.impl.movement.phase.NormalMode;
import rise.module.impl.movement.phase.VulcanMode;
import rise.module.impl.movement.phase.Watchdog1171FullBlockMode;
import rise.module.impl.movement.phase.WatchdogBlinkMode;
import rise.module.impl.movement.phase.WatchdogPredictionFullBlockMode;
import rise.module.impl.movement.phase.WatchdogSemiBlockMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.phase.name"}, description="module.movement.phase.description", category=Category.MOVEMENT)
public class Phase
extends Module {
    private final ModeValue DS = new ModeValue("Mode", this).a(new Mode[]{new NormalMode("Normal", this)}).a(new Mode[]{new WatchdogSemiBlockMode("Watchdog Semi Block", this)}).a(new Mode[]{new WatchdogPredictionFullBlockMode("Watchdog Prediction Full Block", this)}).a(new Mode[]{new Watchdog1171FullBlockMode("Watchdog 1.17.1 Full Block", this)}).a(new Mode[]{new WatchdogBlinkMode("Watchdog Blink", this)}).a(new Mode[]{new BlocksMCMode("BlocksMC", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new GrimMode("Grim", this)}).co("Normal");
}

