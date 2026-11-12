/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class agh {
    private final int aJe;
    private final float aJf;
    private final float height;

    public void e(float f2, float f3) {
        GlStateManager.ap(this.aJe);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)f2, (float)f3);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)f2, (float)(f3 + this.height));
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)(f2 + this.aJf), (float)(f3 + this.height));
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex2f((float)(f2 + this.aJf), (float)f3);
        GL11.glEnd();
    }

    @Generated
    public int tM() {
        return this.aJe;
    }

    @Generated
    public float tN() {
        return this.aJf;
    }

    @Generated
    public float getHeight() {
        return this.height;
    }

    @Generated
    public agh(int n2, float f2, float f3) {
        this.aJe = n2;
        this.aJf = f2;
        this.height = f3;
    }
}

