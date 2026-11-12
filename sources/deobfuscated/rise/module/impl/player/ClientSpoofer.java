/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.clientspoofer.LabyModMode;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.other.clientspoofer.name"}, description="module.other.clientspoofer.description", category=Category.PLAYER)
public final class ClientSpoofer
extends Module {
    private final ModeValue Us = new ModeValue("Mode", this).a(new Mode[]{new LabyModMode("LabyMod", this)}).co("LabyMod");
}

