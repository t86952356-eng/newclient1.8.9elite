/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.criticals.EditMode;
import rise.module.impl.combat.criticals.NoGroundMode;
import rise.module.impl.combat.criticals.PacketMode;
import rise.module.impl.combat.criticals.VerusMode;
import rise.module.impl.combat.criticals.VulcanMode;
import rise.module.impl.combat.criticals.WatchdogMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.combat.criticals.name"}, description="module.combat.criticals.description", category=Category.COMBAT)
public final class Criticals
extends Module {
    private final ModeValue lI = new ModeValue("Mode", this).a(new Mode[]{new PacketMode("Packet", this)}).a(new Mode[]{new EditMode("Edit", this)}).a(new Mode[]{new NoGroundMode("No Ground", this)}).a(new Mode[]{new VulcanMode("Vulcan", this)}).a(new Mode[]{new WatchdogMode("Watchdog", this)}).a(new Mode[]{new VerusMode("Verus", this)}).co("Packet");
}

