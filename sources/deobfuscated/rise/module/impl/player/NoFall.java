/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.nofall.ChunkLoadMode;
import rise.module.impl.player.nofall.ClutchMode;
import rise.module.impl.player.nofall.FlagMode;
import rise.module.impl.player.nofall.GrimServer19Mode;
import rise.module.impl.player.nofall.HeypixelMode;
import rise.module.impl.player.nofall.MatrixMode;
import rise.module.impl.player.nofall.NoGroundMode;
import rise.module.impl.player.nofall.PacketMode;
import rise.module.impl.player.nofall.RoundMode;
import rise.module.impl.player.nofall.SpoofMode;
import rise.module.impl.player.nofall.VulcanMode;
import rise.module.impl.player.nofall.WatchdogBlinkMode;
import rise.module.impl.player.nofall.WatchdogPacketMode;
import rise.module.impl.player.nofall.WatchdogPredictionMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.player.nofall.name"}, description="module.player.nofall.description", category=Category.PLAYER)
public class NoFall
extends Module {
    private final ModeValue afH = new ModeValue("Mode", this).a(new Mode[]{new SpoofMode("Spoof", this)}).a(new Mode[]{new FlagMode("Flag", this)}).a(new Mode[]{new NoGroundMode("No Ground", this)}).a(new Mode[]{new RoundMode("Round", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new PacketMode("Packet", this)}).a(new Mode[]{new GrimServer19Mode("Grim Server 1.9+", this)}).a(new Mode[]{new ChunkLoadMode("Chunk Load", this)}).a(new Mode[]{new HeypixelMode("Heypixel", this)}).a(new Mode[]{new ClutchMode("Clutch", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).a(new Mode[]{new WatchdogPredictionMode("Watchdog Prediction", this)}).a(new Mode[]{new WatchdogBlinkMode("Watchdog Blink", this)}).a(new Mode[]{new WatchdogPacketMode("Watchdog Packet", this)}).co("Spoof");
}

