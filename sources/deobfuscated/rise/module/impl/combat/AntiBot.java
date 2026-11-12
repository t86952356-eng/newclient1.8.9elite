/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import rise.Client;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.antibot.HiMode;
import rise.module.impl.combat.antibot.HjMode;
import rise.module.impl.combat.antibot.HlMode;
import rise.module.impl.combat.antibot.HmMode;
import rise.module.impl.combat.antibot.HnMode;
import rise.module.impl.combat.antibot.HoMode;
import rise.module.impl.combat.antibot.HpMode;
import rise.module.impl.combat.antibot.HrMode;
import rise.module.impl.combat.antibot.HsMode;
import rise.module.impl.combat.antibot.HtMode;
import rise.module.impl.combat.antibot.HuMode;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.combat.antibot.name"}, description="module.combat.antibot.description", category=Category.COMBAT)
public final class AntiBot
extends Module {
    private final BooleanValue lu = new BooleanValue("Funcraft Check", (Module)this, (Boolean)false, new HnMode("", this));
    private final BooleanValue lv = new BooleanValue("Tab Check", (Module)this, (Boolean)false, new HoMode("", this));
    private final BooleanValue lw = new BooleanValue("NPC Detection Check", (Module)this, (Boolean)false, new HrMode("", this));
    private final BooleanValue lx = new BooleanValue("Duplicate Name Check", (Module)this, (Boolean)false, new HmMode("", this));
    private final BooleanValue ly = new BooleanValue("No Ping Check", (Module)this, (Boolean)false, new HtMode("", this));
    private final BooleanValue lz = new BooleanValue("Cubecraft Bedrock Check", (Module)this, (Boolean)false, new HsMode("", this));
    private final BooleanValue lA = new BooleanValue("Duplicate Unique ID Check", (Module)this, (Boolean)false, new HlMode("", this));
    private final BooleanValue lB = new BooleanValue("Colour Check", (Module)this, (Boolean)false, new HlMode("", this));
    private final BooleanValue lC = new BooleanValue("Time Visible Check", (Module)this, (Boolean)false, new HuMode("", this));
    private final BooleanValue lD = new BooleanValue("Middle Click Bot", (Module)this, (Boolean)false, new HpMode("", this));
    private final BooleanValue lE = new BooleanValue("Advanced", (Module)this, (Boolean)false, new HjMode("", this));
    private final BooleanValue lF = new BooleanValue("Advanced 2", (Module)this, (Boolean)false, new HiMode("", this));

    @Override
    public void onDisable() {
        Client.a.x().clear();
    }
}

