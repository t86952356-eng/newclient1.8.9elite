/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.antivoid.BlinkMode;
import rise.module.impl.player.antivoid.CollisionMode;
import rise.module.impl.player.antivoid.PacketMode;
import rise.module.impl.player.antivoid.PositionMode;
import rise.module.impl.player.antivoid.VulcanMode;
import rise.module.impl.player.antivoid.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.player.antivoid.name"}, description="module.player.antivoid.description", category=Category.PLAYER)
public class AntiVoid
extends Module {
    private final ModeValue abq = new ModeValue("Mode", this).a(new Mode[]{new PacketMode("Packet", this)}).a(new Mode[]{new PositionMode("Position", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new CollisionMode("Collision", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new BlinkMode("Blink", this)}).co("Packet");
}

