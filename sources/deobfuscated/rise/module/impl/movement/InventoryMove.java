/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.inventorymove.BufferAbuseMode;
import rise.module.impl.movement.inventorymove.CancelMode;
import rise.module.impl.movement.inventorymove.Grim2Mode;
import rise.module.impl.movement.inventorymove.GrimMode;
import rise.module.impl.movement.inventorymove.NormalMode;
import rise.module.impl.movement.inventorymove.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.movement.inventorymove.name"}, description="module.movement.inventorymove.description", category=Category.MOVEMENT)
public class InventoryMove
extends Module {
    private final GrimMode Dy = new GrimMode("Grim", this);
    private final ModeValue Dz = new ModeValue("Bypass Mode", this).a(new Mode[]{new NormalMode("Normal", this)}).a(new Mode[]{new BufferAbuseMode("Buffer Abuse", this)}).a(new Mode[]{new CancelMode("Cancel", this)}).a(new Mode[]{this.Dy}).a(new Mode[]{new Grim2Mode("Grim 2", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).co("Normal");

    public boolean hj() {
        return this.Dz.wD() != null && ((Mode)this.Dz.wD()).getName().equalsIgnoreCase("Grim");
    }

    public int hk() {
        return this.Dy.hA();
    }
}

