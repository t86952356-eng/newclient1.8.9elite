/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ClickEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.ghost.autoclicker.DragClickSimulationsMode;
import rise.module.impl.ghost.autoclicker.NormalMode;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.ghost.autoclicker.name"}, description="module.ghost.autoclicker.description", category=Category.GHOST)
public class AutoClicker
extends Module {
    private final ModeValue AG = new ModeValue("Mode", this).a(new Mode[]{new NormalMode("Normal", this)}).a(new Mode[]{new DragClickSimulationsMode("Drag Click Simulations", this)}).co("Normal");
    private final BooleanValue AH = new BooleanValue("Jitter", (Module)this, (Boolean)false);
    private final a AI = new a();
    private double AJ;
    private double AK;
    @EventLink
    public final Listener<ClickEvent> AL = clickEvent -> {
        this.AI.aX();
        this.AJ = (Math.random() - 0.5) * 4.0;
        this.AK = (Math.random() - 0.5) * 4.0;
    };
    @EventLink
    public final Listener<Render3DEvent> AM = render3DEvent -> {
        AutoClicker.aER.bgV = -1;
        if (!this.AI.T(100L) && ((Boolean)this.AH.wD()).booleanValue() && AutoClicker.aER.aIY.chw.Re()) {
            EntityRenderer.bJc = (float)((Math.random() - 0.5) * 400.0 / (double)Minecraft.BI() * this.AJ);
            EntityRenderer.bJd = (float)((Math.random() - 0.5) * 400.0 / (double)Minecraft.BI() * this.AK);
        }
    };
}

