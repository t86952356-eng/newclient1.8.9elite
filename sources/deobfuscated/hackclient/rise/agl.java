/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 */
package hackclient.rise;

import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public final class agl {
    public static void tQ() {
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
    }

    public static void tR() {
        GlStateManager.tR();
    }

    public static void ap(int n2) {
        GL11.glBindTexture((int)3553, (int)n2);
    }

    public static void m(int n2, int n3) {
        GL13.glActiveTexture((int)n3);
        GL11.glBindTexture((int)3553, (int)n2);
    }
}

