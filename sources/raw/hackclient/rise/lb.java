/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.gui.inventory.i;
import org.lwjgl.input.Mouse;

@gl(aliases={"module.ghost.guiclicker.name"}, description="module.ghost.guiclicker.description", category=gj.GHOST)
public class lb
extends gi {
    public int Bh;
    @dm
    public final dk<ei> Bi = ei2 -> {
        if (lb.aER.bgR instanceof i) {
            i i2 = (i)lb.aER.bgR;
            int n2 = Mouse.getEventX() * i2.width / lb.aER.bgz;
            int n3 = i2.height - Mouse.getEventY() * i2.height / lb.aER.bgA - 1;
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

