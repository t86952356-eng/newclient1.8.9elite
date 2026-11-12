/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.aks;
import hackclient.rise.ga;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.viewbobbing.name"}, description="module.render.viewbobbing.description", category=Category.RENDER)
public final class ViewBobbing
extends Module {
    public final ModeValue aqE = new ModeValue("Mode", this).a(new Mode[]{new aks("Smooth")}).a(new Mode[]{new aks("Meme")}).a(new Mode[]{new aks("None")}).co("None");
    @EventLink
    public final Listener<ga> aqF = ga2 -> {
        if (((Mode)this.aqE.wD()).getName().equals("Smooth") && (ga2.dL() == 0 || ga2.dL() == 2)) {
            ga2.cF();
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> aqG = preMotionEvent -> {
        ViewBobbing.aER.aIY.cgs = true;
        switch (((Mode)this.aqE.wD()).getName()) {
            case "Meme": {
                ViewBobbing.aER.bgK.cIc = 0.5f;
                break;
            }
            case "None": {
                ViewBobbing.aER.bgK.csd = 0.0f;
            }
        }
    };
}

