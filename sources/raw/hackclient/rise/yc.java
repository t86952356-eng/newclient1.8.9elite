/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ga;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.render.viewbobbing.name"}, description="module.render.viewbobbing.description", category=gj.RENDER)
public final class yc
extends gi {
    public final akp aqE = new akp("Mode", this).a(new akg[]{new aks("Smooth")}).a(new akg[]{new aks("Meme")}).a(new akg[]{new aks("None")}).co("None");
    @dm
    public final dk<ga> aqF = ga2 -> {
        if (((akg)this.aqE.wD()).getName().equals("Smooth") && (ga2.dL() == 0 || ga2.dL() == 2)) {
            ga2.cF();
        }
    };
    @dm
    public final dk<ei> aqG = ei2 -> {
        yc.aER.aIY.cgs = true;
        switch (((akg)this.aqE.wD()).getName()) {
            case "Meme": {
                yc.aER.bgK.cIc = 0.5f;
                break;
            }
            case "None": {
                yc.aER.bgK.csd = 0.0f;
            }
        }
    };
}

