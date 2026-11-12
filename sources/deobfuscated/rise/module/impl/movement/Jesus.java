/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.aik;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.jesus.KarhuMode;
import rise.module.impl.movement.jesus.NCPMode;
import rise.module.impl.movement.jesus.VanillaMode;
import rise.module.impl.movement.jesus.VulcanDolphinMode;
import rise.module.impl.movement.jesus.VulcanGravityMode;
import rise.module.impl.movement.jesus.WatchdogDolphin118Mode;
import rise.module.impl.movement.jesus.WatchdogMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.jesus.name"}, description="module.movement.jesus.description", category=Category.MOVEMENT)
public class Jesus
extends Module {
    public final ModeValue DA = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new VulcanGravityMode("Vulcan Gravity", this)}).a(new Mode[]{new KarhuMode("Karhu", this)}).a(new Mode[]{new NCPMode("NCP", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new VulcanDolphinMode("Vulcan Dolphin", this)}).a(new Mode[]{new WatchdogDolphin118Mode("Watchdog Dolphin 1.18+", this)}).co("Vanilla");
    private final BooleanValue DB = new BooleanValue("Allow Jump", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<JumpEvent> DC = jumpEvent -> {
        if (!((Boolean)this.DB.wD()).booleanValue() && aik.vA()) {
            jumpEvent.cF();
        }
    };
}

