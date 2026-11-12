/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.aiz;
import net.minecraft.client.gui.cz;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class ajb
implements aea {
    private final int aQD;

    public ajb(String string, String string2) {
        this.aQD = aiz.H(string, string2);
    }

    public static void h(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glEnd();
    }

    public static void wc() {
        cz cz2 = ajb.aER.jY;
        ajb.h(0.0, 0.0, cz2.Gq(), cz2.Gr());
    }

    public void rJ() {
        GL20.glUseProgram((int)this.aQD);
    }

    public static void stop() {
        GL20.glUseProgram((int)0);
    }

    public int wd() {
        return this.aQD;
    }
}

