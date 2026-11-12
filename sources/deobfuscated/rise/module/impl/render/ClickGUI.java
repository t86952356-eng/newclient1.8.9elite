/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.render;

import hackclient.rise.aks;
import hackclient.rise.dt;
import hackclient.rise.gg;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.clickgui.name"}, description="module.render.clickgui.description", category=Category.RENDER, keyBind=54)
public final class ClickGUI
extends Module {
    private final a anM = new a();
    public final ModeValue anN = new ModeValue("Mode", this).a(new Mode[]{new aks("Modern")}).a(new Mode[]{new aks("Dropdown")}).co("Modern");
    @EventLink(cH=3)
    public final Listener<Render2DEvent> anO = render2DEvent -> {
        if (((Mode)this.anN.wD()).getName().equals("Modern")) {
            this.b(gg.kV, 2).c(() -> Client.a.v().cj());
            this.b(gg.kT, 3).c(() -> Client.a.v().ci());
        } else {
            this.b(gg.kV, 2).c(() -> Client.a.z().cj());
            this.b(gg.kT, 3).c(() -> Client.a.z().ci());
        }
    };
    @EventLink
    public final Listener<dt> anP = dt2 -> {
        if (!this.anM.T(50L)) {
            return;
        }
        if (dt2.cO() == this.getKey()) {
            aER.a((GuiScreen)null);
            if (ClickGUI.aER.bgR == null) {
                aER.AK();
            }
        }
    };

    @Override
    public void onEnable() {
        if (((Mode)this.anN.wD()).getName().equals("Modern")) {
            aER.a(Client.a.v());
        } else {
            aER.a(Client.a.z());
        }
        this.anM.aX();
    }

    @Override
    public void onDisable() {
        aER.AK();
        Keyboard.enableRepeatEvents((boolean)false);
        Client.a.e().c(Client.a.v());
        Client.a.e().c(Client.a.z());
        aNC.execute(() -> Client.a.p().tD().tu());
    }
}

