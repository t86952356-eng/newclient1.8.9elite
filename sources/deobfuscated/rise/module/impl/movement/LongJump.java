/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.aik;
import hackclient.rise.bk;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.longjump.BloxdMode;
import rise.module.impl.movement.longjump.FireBallMode;
import rise.module.impl.movement.longjump.GrimMode;
import rise.module.impl.movement.longjump.Matrix2Mode;
import rise.module.impl.movement.longjump.NCPMode;
import rise.module.impl.movement.longjump.VanillaMode;
import rise.module.impl.movement.longjump.Vulcan2Mode;
import rise.module.impl.movement.longjump.VulcanMode;
import rise.module.impl.movement.longjump.Watchdog2Mode;
import rise.module.impl.movement.longjump.WatchdogFireBall2Mode;
import rise.module.impl.movement.longjump.WatchdogFireBallMode;
import rise.module.impl.movement.longjump.WatchdogGlideMode;
import rise.module.impl.movement.longjump.WatchdogMode;
import rise.module.impl.movement.longjump.WatchdogWater118Mode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.longjump.name"}, description="module.movement.longjump.description", category=Category.MOVEMENT)
public class LongJump
extends Module {
    public final ModeValue DD = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new Matrix2Mode("Matrix 2", this)}).a(new Mode[]{new NCPMode("NCP", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new WatchdogWater118Mode("Watchdog Water 1.18+", this)}).a(new Mode[]{new Watchdog2Mode("Watchdog 2", this)}).a(new Mode[]{new FireBallMode("Fire Ball", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new WatchdogGlideMode("Watchdog Glide", this)}).a(new Mode[]{new WatchdogFireBallMode("Watchdog Fire Ball", this)}).a(new Mode[]{new WatchdogFireBall2Mode("Watchdog Fire Ball 2", this)}).a(new Mode[]{new GrimMode("Grim", this)}).a(new Mode[]{new BloxdMode("Bloxd", this)}).a(new Mode[]{new Vulcan2Mode("Vulcan 2", this)}).co("Vanilla");
    public final BooleanValue DE = new BooleanValue("Auto Disable", (Module)this, (Boolean)true);
    private final BooleanValue DF = new BooleanValue("Fake Damage", (Module)this, (Boolean)false);
    private boolean DG;
    @EventLink
    public final Listener<PreMotionEvent> DH = preMotionEvent -> {
        if (((Boolean)this.DE.wD()).booleanValue() && this.DG && LongJump.aER.bgK.aO && !((Mode)this.DD.wD()).getName().equals("Watchdog") && !((Mode)this.DD.wD()).getName().equals("Watchdog 2")) {
            this.toggle();
        }
        this.DG = !LongJump.aER.bgK.aO && !bk.bd();
    };

    @Override
    public void onEnable() {
        if (((Boolean)this.DF.wD()).booleanValue() && LongJump.aER.bgK.aRg > 1) {
            aik.fakeDamage();
        }
    }

    @Override
    public void onDisable() {
        LongJump.aER.bgC.dAp = 1.0f;
        this.DG = false;
    }
}

