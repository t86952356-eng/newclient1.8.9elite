/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.ghost.wtap.LegitMode;
import rise.module.impl.ghost.wtap.SilentMode;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.wtap.name", "Extra Knock Back", "Super Knock Back", "Knock Back", "Sprint Reset"}, description="module.ghost.wtap.description", category=Category.GHOST)
public class WTap_lk
extends Module {
    private final ModeValue Cd = new ModeValue("Mode", this).a(new Mode[]{new LegitMode("Legit", this)}).a(new Mode[]{new SilentMode("Silent", this)}).co("Legit");
    public final NumberValue Ce = new NumberValue("WTap Chance", this, (Number)100, (Number)0, (Number)100, (Number)1);
}

