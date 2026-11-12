/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import net.minecraft.client.gui.cz;
import org.lwjgl.opengl.GL11;

public class aiu {
    public static void hQ() {
        GL11.glEnable((int)3089);
    }

    public static void disable() {
        GL11.glDisable((int)3089);
    }

    public static void a(cz cz2, double d2, double d3, double d4, double d5) {
        if (d2 + d4 == d2 || d3 + d5 == d3 || d2 < 0.0 || d3 + d5 < 0.0) {
            return;
        }
        int n2 = cz2.getScaleFactor();
        GL11.glScissor((int)((int)Math.round(d2 * (double)n2)), (int)((int)Math.round(((double)cz2.getScaledHeight() - (d3 + d5)) * (double)n2)), (int)((int)Math.round(d4 * (double)n2)), (int)((int)Math.round(d5 * (double)n2)));
    }
}

