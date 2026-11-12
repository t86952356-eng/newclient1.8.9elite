/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.step.JumpMode;
import rise.module.impl.movement.step.MatrixMode;
import rise.module.impl.movement.step.NCPMode;
import rise.module.impl.movement.step.NCPPacketlessMode;
import rise.module.impl.movement.step.NewNCPMode;
import rise.module.impl.movement.step.VanillaMode;
import rise.module.impl.movement.step.VulcanMode;
import rise.module.impl.movement.step.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.step.name"}, description="module.movement.step.description", category=Category.MOVEMENT)
public class Step
extends Module {
    private final ModeValue Ex = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new NCPMode("NCP", this)}).a(new Mode[]{new NewNCPMode("New NCP", this)}).a(new Mode[]{new NCPPacketlessMode("NCP Packetless", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).a(new Mode[]{new JumpMode("Jump", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).co("Vanilla");
}

