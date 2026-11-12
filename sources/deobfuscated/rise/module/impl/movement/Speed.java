/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.movement;

import hackclient.rise.aii;
import hackclient.rise.fd;
import lombok.Generated;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.speed.BlocksMCMode;
import rise.module.impl.movement.speed.Grim2Mode;
import rise.module.impl.movement.speed.GrimMode;
import rise.module.impl.movement.speed.KoksCraftMode;
import rise.module.impl.movement.speed.LegitMode;
import rise.module.impl.movement.speed.MatrixMode;
import rise.module.impl.movement.speed.MineMenClubMode;
import rise.module.impl.movement.speed.MiniBloxMode;
import rise.module.impl.movement.speed.NCPMode;
import rise.module.impl.movement.speed.OldNCPYPortMode;
import rise.module.impl.movement.speed.PolarMode;
import rise.module.impl.movement.speed.StrafeMode;
import rise.module.impl.movement.speed.TatakoMode;
import rise.module.impl.movement.speed.VanillaMode;
import rise.module.impl.movement.speed.VerusMode;
import rise.module.impl.movement.speed.VulcanMode;
import rise.module.impl.movement.speed.Watchdog6TickMode;
import rise.module.impl.movement.speed.WatchdogMode;
import rise.module.impl.movement.speed.WatchdogPredictionMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.speed.name"}, description="module.movement.speed.description", category=Category.MOVEMENT)
public class Speed
extends Module {
    public final ModeValue Eg = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new StrafeMode("Strafe", this)}).a(new Mode[]{new WatchdogPredictionMode("Watchdog Prediction", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new NCPMode("NCP", this)}).a(new Mode[]{new MiniBloxMode("MiniBlox", this)}).a(new Mode[]{new VerusMode("Verus", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).a(new Mode[]{new BlocksMCMode("BlocksMC", this)}).a(new Mode[]{new MineMenClubMode("MineMenClub", this)}).a(new Mode[]{new Watchdog6TickMode("Watchdog 6 Tick", this)}).a(new Mode[]{new KoksCraftMode("KoksCraft", this)}).a(new Mode[]{new LegitMode("Legit", this)}).a(new Mode[]{new PolarMode("Polar", this)}).a(new Mode[]{new TatakoMode("Tatako", this)}).a(new Mode[]{new GrimMode("Grim", this)}).a(new Mode[]{new Grim2Mode("Grim 2", this)}).a(new Mode[]{new OldNCPYPortMode("Old NCP Y-port", this)}).co("Vanilla");
    private final BooleanValue Eh = new BooleanValue("Disable on Teleport", (Module)this, (Boolean)false);
    private final BooleanValue Ei = new BooleanValue("Stop on Disable", (Module)this, (Boolean)false);
    @EventLink
    public final Listener<fd> Ej = fd2 -> {
        if (((Boolean)this.Eh.wD()).booleanValue()) {
            this.toggle();
        }
    };

    @Override
    public void onDisable() {
        Speed.aER.bgC.dAp = 1.0f;
        if (((Boolean)this.Ei.wD()).booleanValue()) {
            aii.stop();
        }
    }

    @Generated
    public ModeValue hl() {
        return this.Eg;
    }
}

