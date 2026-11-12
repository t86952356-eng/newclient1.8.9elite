/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.teleport.MiniBloxMode;
import rise.module.impl.movement.teleport.WatchdogBedWarsMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.teleport.name"}, description="module.movement.teleport.description", category=Category.MOVEMENT)
public class Teleport
extends Module {
    private final ModeValue Fd = new ModeValue("Mode", this).a(new Mode[]{new MiniBloxMode("MiniBlox", this)}).a(new Mode[]{new WatchdogBedWarsMode("Watchdog BedWars", this)}).co("Vanilla");
}

