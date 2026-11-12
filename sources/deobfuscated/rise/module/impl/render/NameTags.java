/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.render;

import hackclient.rise.agf;
import hackclient.rise.fg;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.nametags.ClassicMode;
import rise.module.impl.render.nametags.ModernMode;
import rise.module.impl.render.nametags.VanillaMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.nametags.name"}, description="module.render.nametags.description", category=Category.RENDER)
public final class NameTags
extends Module {
    public final Map<String, Integer> apG = new HashMap<String, Integer>();
    private final ModeValue apH = new ModeValue("Mode", this).a(new Mode[]{new ModernMode("Modern", this)}).a(new Mode[]{new VanillaMode("Vanilla", this)}).a(new Mode[]{new ClassicMode("Classic", this)}).co("Modern");
    private final BooleanValue apI = new BooleanValue("Targets", (Module)this, (Boolean)false);
    public final BooleanValue apJ = new BooleanValue("Player", (Module)this, (Boolean)true, () -> (Boolean)this.apI.wD() == false);
    public final BooleanValue apK = new BooleanValue("Invisibles", (Module)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final BooleanValue apL = new BooleanValue("Animals", (Module)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final BooleanValue apM = new BooleanValue("Mobs", (Module)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final BooleanValue apN = new BooleanValue("Player Teammates", (Module)this, (Boolean)true, () -> (Boolean)this.apI.wD() == false);
    public final Listener<fg> apO = fg2 -> this.apG.clear();

    public float a(String string, agf agf2) {
        String string2 = string + agf2.hashCode();
        if (!this.apG.containsKey(string2)) {
            this.apG.put(string2, agf2.bQ(string));
        }
        return this.apG.get(string2).intValue();
    }

    @Generated
    public Map<String, Integer> mu() {
        return this.apG;
    }
}

