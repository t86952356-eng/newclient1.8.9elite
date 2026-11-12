/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.terrainspeed.BloxdMode;
import rise.module.impl.movement.terrainspeed.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.terrainspeed.name"}, description="module.movement.terrainspeed.description", category=Category.MOVEMENT)
public class TerrainSpeed
extends Module {
    public final ModeValue Fe = new ModeValue("Mode", this).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new BloxdMode("Bloxd", this)}).co("Watchdog");
}

