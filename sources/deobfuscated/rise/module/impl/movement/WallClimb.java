/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.wallclimb.GrimMode;
import rise.module.impl.movement.wallclimb.MineMenClubMode;
import rise.module.impl.movement.wallclimb.VerusMode;
import rise.module.impl.movement.wallclimb.VulcanMode;
import rise.module.impl.movement.wallclimb.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.wallclimb.name", "Spider"}, description="module.movement.wallclimb.description", category=Category.MOVEMENT)
public class WallClimb
extends Module {
    private final ModeValue Ff = new ModeValue("Mode", this).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new VerusMode("Verus", this)}).a(new Mode[]{new GrimMode("Grim", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new MineMenClubMode("MineMenClub", this)}).co("Vulcan");
}

