/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.velocity.AACMode;
import rise.module.impl.combat.velocity.BounceMode;
import rise.module.impl.combat.velocity.BufferAbuseMode;
import rise.module.impl.combat.velocity.DelayMode;
import rise.module.impl.combat.velocity.Grim2Mode;
import rise.module.impl.combat.velocity.GrimMode;
import rise.module.impl.combat.velocity.GrimReduceMode;
import rise.module.impl.combat.velocity.GrimTestMode;
import rise.module.impl.combat.velocity.GroundMode;
import rise.module.impl.combat.velocity.IntaveMode;
import rise.module.impl.combat.velocity.KarhuMode;
import rise.module.impl.combat.velocity.LegitJumpResetMode;
import rise.module.impl.combat.velocity.MMCMode;
import rise.module.impl.combat.velocity.MatrixMode;
import rise.module.impl.combat.velocity.StandardMode;
import rise.module.impl.combat.velocity.TickMode;
import rise.module.impl.combat.velocity.UniversocraftMode;
import rise.module.impl.combat.velocity.VulcanMode;
import rise.module.impl.combat.velocity.WatchdogDamageBoostFlyDisablerMode;
import rise.module.impl.combat.velocity.WatchdogMode;
import rise.module.impl.combat.velocity.WatchdogPredictionMode;
import rise.module.impl.combat.velocity.WatchdogReduceMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.combat.velocity.name"}, description="module.combat.velocity.description", category=Category.COMBAT)
public final class Velocity
extends Module {
    public final ModeValue qP = new ModeValue("Mode", this).a(new Mode[]{new StandardMode("Standard", this)}).a(new Mode[]{new BufferAbuseMode("Buffer Abuse", this)}).a(new Mode[]{new DelayMode("Delay", this)}).a(new Mode[]{new LegitJumpResetMode("Legit/Jump Reset", this)}).a(new Mode[]{new LegitJumpResetMode("Polar", this)}).a(new Mode[]{new GroundMode("Ground", this)}).a(new Mode[]{new IntaveMode("Intave", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).a(new Mode[]{new AACMode("AAC", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new WatchdogDamageBoostFlyDisablerMode("Watchdog Damage Boost Fly Disabler", this)}).a(new Mode[]{new TickMode("Tick", this)}).a(new Mode[]{new BounceMode("Bounce", this)}).a(new Mode[]{new KarhuMode("Karhu", this)}).a(new Mode[]{new MMCMode("MMC", this)}).a(new Mode[]{new UniversocraftMode("Universocraft", this)}).a(new Mode[]{new GrimReduceMode("Grim Reduce", this)}).a(new Mode[]{new GrimMode("Grim", this)}).a(new Mode[]{new Grim2Mode("Grim 2", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new WatchdogPredictionMode("Watchdog Prediction", this)}).a(new Mode[]{new WatchdogReduceMode("Watchdog Reduce", this)}).a(new Mode[]{new GrimTestMode("Grim Test", this)}).co("Standard");
    public final BooleanValue qQ = new BooleanValue("On Swing", (Module)this, (Boolean)false);
}

