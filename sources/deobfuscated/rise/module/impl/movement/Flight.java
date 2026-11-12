/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 */
package rise.module.impl.movement;

import hackclient.rise.aik;
import hackclient.rise.cl;
import hackclient.rise.fd;
import javax.vecmath.Vector3d;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.flight.AirJumpMode;
import rise.module.impl.movement.flight.AirWalkMode;
import rise.module.impl.movement.flight.BlockMode;
import rise.module.impl.movement.flight.BloxdMode;
import rise.module.impl.movement.flight.BufferAbuseMode;
import rise.module.impl.movement.flight.CubeCraftMode;
import rise.module.impl.movement.flight.DamageDeprecatedMode;
import rise.module.impl.movement.flight.FuncraftMode;
import rise.module.impl.movement.flight.Grim191181Mode;
import rise.module.impl.movement.flight.Grim2Mode;
import rise.module.impl.movement.flight.Grim3Mode;
import rise.module.impl.movement.flight.LatestNCPMode;
import rise.module.impl.movement.flight.MMCFireballMode;
import rise.module.impl.movement.flight.MMCMode;
import rise.module.impl.movement.flight.MatrixDamageMode;
import rise.module.impl.movement.flight.MatrixHighJumpMode;
import rise.module.impl.movement.flight.MatrixMode;
import rise.module.impl.movement.flight.MineLandMode;
import rise.module.impl.movement.flight.MiniBloxMode;
import rise.module.impl.movement.flight.OldNCPMode;
import rise.module.impl.movement.flight.SkyCaveMode;
import rise.module.impl.movement.flight.VanillaMode;
import rise.module.impl.movement.flight.VerusDamageNewMode;
import rise.module.impl.movement.flight.VerusMode;
import rise.module.impl.movement.flight.Vulcan2Mode;
import rise.module.impl.movement.flight.VulcanDamageMode;
import rise.module.impl.movement.flight.VulcanDeprecatedMode;
import rise.module.impl.movement.flight.Watchdog2Mode;
import rise.module.impl.movement.flight.WatchdogBoatMode;
import rise.module.impl.movement.flight.WatchdogMode;
import rise.module.impl.movement.flight.WatchdogPrediction2Mode;
import rise.module.impl.movement.flight.WatchdogPredictionMode;
import rise.module.impl.movement.flight.ZoneCraftMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.flight.name", "Fly"}, description="module.movement.flight.description", category=Category.MOVEMENT)
public class Flight
extends Module {
    private final ModeValue Dn = new ModeValue("Mode", this).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new MatrixMode("Matrix", this)}).a(new Mode[]{new MatrixHighJumpMode("Matrix High Jump", this)}).a(new Mode[]{new MatrixDamageMode("Matrix Damage", this)}).a(new Mode[]{new Grim191181Mode("Grim 1.9-1.18.1", this)}).a(new Mode[]{new Grim2Mode("Grim 2", this)}).a(new Mode[]{new Grim3Mode("Grim 3", this)}).a(new Mode[]{new WatchdogPredictionMode("Watchdog Prediction", this)}).a(new Mode[]{new WatchdogPrediction2Mode("Watchdog Prediction 2", this)}).a(new Mode[]{new Watchdog2Mode("Watchdog 2", this)}).a(new Mode[]{new MiniBloxMode("MiniBlox", this)}).a(new Mode[]{new Vulcan2Mode("Vulcan 2", this)}).a(new Mode[]{new AirWalkMode("Air Walk", this)}).a(new Mode[]{new OldNCPMode("Old NCP", this)}).a(new Mode[]{new FuncraftMode("Funcraft", this)}).a(new Mode[]{new SkyCaveMode("SkyCave", this)}).a(new Mode[]{new LatestNCPMode("Latest NCP", this)}).a(new Mode[]{new VerusMode("Verus", this)}).a(new Mode[]{new BlockMode("Block", this)}).a(new Mode[]{new MMCMode("MMC", this)}).a(new Mode[]{new BufferAbuseMode("Buffer Abuse", this)}).a(new Mode[]{new ZoneCraftMode("Zone Craft", this)}).a(new Mode[]{new WatchdogPrediction2Mode("Slime NCP", this)}).a(new Mode[]{new AirJumpMode("Air Jump", this)}).a(new Mode[]{new CubeCraftMode("CubeCraft", this)}).a(new Mode[]{new MineLandMode("MineLand", this)}).a(new Mode[]{new VulcanDeprecatedMode("Vulcan (Deprecated)", this)}).a(new Mode[]{new BloxdMode("Bloxd", this)}).a(new Mode[]{new VerusDamageNewMode("Verus Damage New", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new WatchdogBoatMode("Watchdog Boat", this)}).a(new Mode[]{new DamageDeprecatedMode("Damage (Deprecated)", this)}).a(new Mode[]{new MMCFireballMode("MMC Fireball", this)}).a(new Mode[]{new VulcanDamageMode("Vulcan Damage", this)}).a(new Mode[]{new AirJumpMode("Spartan (Deprecated)", this)}).a(new Mode[]{new BufferAbuseMode("Vicnix (Deprecated)", this)}).co("Vanilla");
    private final BooleanValue Do = new BooleanValue("Disable on Teleport", (Module)this, (Boolean)false);
    private final BooleanValue Dp = new BooleanValue("View Bobbing", (Module)this, (Boolean)false);
    private final BooleanValue Dq = new BooleanValue("Fake Damage", (Module)this, (Boolean)false);
    private final BooleanValue Dr = new BooleanValue("Smooth Camera", (Module)this, (Boolean)false);
    private final BooleanValue Ds = new BooleanValue("Visual Dragon", (Module)this, (Boolean)false);
    private b Dt;
    private boolean zd;
    @EventLink
    public final Listener<PreMotionEvent> Du = preMotionEvent -> {
        if (((Boolean)this.Dp.wD()).booleanValue()) {
            Flight.aER.bgK.cIc = 0.1f;
        }
        if (((Boolean)this.Dr.wD()).booleanValue()) {
            cl.cn();
        }
    };
    @EventLink
    public final Listener<Render3DEvent> Dv = render3DEvent -> {
        if (((Boolean)this.Ds.wD()).booleanValue()) {
            if (this.Dt == null) {
                this.Dt = new b(Flight.aER.bgF);
                Flight.aER.bgF.a(-1, (c)this.Dt);
                Client.a.x().b(this, this.Dt);
            }
            Vector3d vector3d = new Vector3d(Flight.aER.bgK.csh + (Flight.aER.bgK.gW - Flight.aER.bgK.csh) * (double)Flight.aER.bgC.bWY, Flight.aER.bgK.csi + (Flight.aER.bgK.gX - Flight.aER.bgK.csi) * (double)Flight.aER.bgC.bWY, Flight.aER.bgK.csj + (Flight.aER.bgK.gY - Flight.aER.bgK.csj) * (double)Flight.aER.bgC.bWY);
            this.Dt.a(vector3d.x, vector3d.y - 3.0, vector3d.z, Flight.aER.bgK.pl - 180.0f, Flight.aER.bgK.pm);
        }
    };
    @EventLink
    public final Listener<AttackEvent> Dw = attackEvent -> {
        if (attackEvent.dc() == this.Dt) {
            attackEvent.cF();
        }
    };
    @EventLink
    public final Listener<fd> Dx = fd2 -> {
        if (((Boolean)this.Do.wD()).booleanValue()) {
            this.toggle();
        }
    };

    @Override
    public void onEnable() {
        if (((Boolean)this.Dq.wD()).booleanValue() && Flight.aER.bgK.aRg > 1) {
            aik.fakeDamage();
        }
        this.zd = false;
    }

    @Override
    public void onDisable() {
        if (this.Dt != null) {
            Flight.aER.bgF.H(this.Dt);
            this.Dt = null;
        }
        Flight.aER.bgC.dAp = 1.0f;
    }
}

