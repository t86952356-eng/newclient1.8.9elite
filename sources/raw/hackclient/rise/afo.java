/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.aka;
import net.minecraft.client.gui.cz;
import org.lwjgl.input.Mouse;

public class afo
implements aea {
    public static aka tl() {
        cz cz2 = afo.aER.jY;
        int n2 = Mouse.getX() * cz2.getScaledWidth() / afo.aER.bgz;
        int n3 = cz2.getScaledHeight() - Mouse.getY() * cz2.getScaledHeight() / afo.aER.bgA - 1;
        return new aka(n2, n3);
    }
}

