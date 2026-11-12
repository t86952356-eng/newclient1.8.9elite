/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.agf;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.dk;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.zs;
import hackclient.rise.zt;
import hackclient.rise.zu;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;

@gl(aliases={"module.render.nametags.name"}, description="module.render.nametags.description", category=gj.RENDER)
public final class xs
extends gi {
    public final Map<String, Integer> apG = new HashMap<String, Integer>();
    private final akp apH = new akp("Mode", this).a(new akg[]{new zt("Modern", this)}).a(new akg[]{new zu("Vanilla", this)}).a(new akg[]{new zs("Classic", this)}).co("Modern");
    private final aki apI = new aki("Targets", (gi)this, (Boolean)false);
    public final aki apJ = new aki("Player", (gi)this, (Boolean)true, () -> (Boolean)this.apI.wD() == false);
    public final aki apK = new aki("Invisibles", (gi)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final aki apL = new aki("Animals", (gi)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final aki apM = new aki("Mobs", (gi)this, (Boolean)false, () -> (Boolean)this.apI.wD() == false);
    public final aki apN = new aki("Player Teammates", (gi)this, (Boolean)true, () -> (Boolean)this.apI.wD() == false);
    public final dk<fg> apO = fg2 -> this.apG.clear();

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

