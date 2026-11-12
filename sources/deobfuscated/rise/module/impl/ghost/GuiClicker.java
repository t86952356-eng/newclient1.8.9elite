/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package rise.module.impl.ghost;

import net.minecraft.client.gui.inventory.i;
import org.lwjgl.input.Mouse;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.ghost.guiclicker.name"}, description="module.ghost.guiclicker.description", category=Category.GHOST)
public class GuiClicker
extends Module {
    public int Bh;
    @EventLink
    public final Listener<PreMotionEvent> Bi = preMotionEvent -> {
        if (GuiClicker.aER.bgR instanceof i) {
            i i2 = (i)GuiClicker.aER.bgR;
            int n2 = Mouse.getEventX() * i2.width / GuiClicker.aER.bgz;
            int n3 = i2.height - Mouse.getEventY() * i2.height / GuiClicker.aER.bgA - 1;
            try {
                if (Mouse.isButtonDown((int)0)) {
                    ++this.Bh;
                    if (this.Bh > 2 && Math.random() > 0.1) {
                        i2.mouseClicked(n2, n3, 0);
                    }
                } else if (Mouse.isButtonDown((int)1)) {
                    ++this.Bh;
                    if (this.Bh > 2 && Math.random() > 0.1) {
                        i2.mouseClicked(n2, n3, 1);
                    }
                } else {
                    this.Bh = 0;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    };
}

