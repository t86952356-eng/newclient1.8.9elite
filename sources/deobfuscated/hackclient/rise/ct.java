/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ait;
import hackclient.rise.cm;
import hackclient.rise.cn;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import org.lwjgl.opengl.GL11;

public class ct
extends cm {
    public ct(cn cn2) {
        super(cn2);
    }

    public ct(c c2, cn cn2) {
        super(cn2);
        this.by = c2;
    }

    @Override
    public void cp() {
        int n2;
        int n3;
        int n4;
        float f2;
        double d2;
        double d3;
        int n5;
        float f3 = ct.aER.bgC.bWY;
        r r2 = (r)this.by;
        if (aER.BF() == null || r2 == null) {
            return;
        }
        double d4 = r2.crF + (r2.gW - r2.crF) * (double)f3;
        aER.BF();
        double d5 = d4 - RenderManager.bVA;
        double d6 = r2.crH + (r2.gY - r2.crH) * (double)f3;
        aER.BF();
        double d7 = d6 - RenderManager.bVC;
        float f4 = r2.width;
        float f5 = r2.height;
        double d8 = (double)f4 * 1.1;
        double d9 = (double)f5 * 0.5445 + Math.sin((double)System.currentTimeMillis() / 200.0);
        double d10 = Math.cos((double)System.currentTimeMillis() / 200.0) * 0.5;
        double d11 = r2.crG + (r2.gX - r2.crG) * (double)f3 + d9;
        aER.BF();
        double d12 = d11 - RenderManager.bVB;
        double d13 = d12 - d10;
        Color color = this.hP.cr();
        Color color2 = this.hP.cs();
        long l2 = System.currentTimeMillis();
        double d14 = 0.002;
        int n6 = 64;
        String string = GL11.glGetString((int)7936);
        boolean bl2 = string != null && string.toLowerCase().contains("nvidia");
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        if (!bl2) {
            GL11.glEnable((int)2881);
        }
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GlStateManager.JI();
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)5);
        for (n5 = 0; n5 <= n6; ++n5) {
            d3 = (double)n5 * (Math.PI * 2 / (double)n6);
            d2 = (double)n5 / (double)n6 * Math.PI * 2.0;
            f2 = (float)((Math.sin((double)l2 * d14 + d2) + 1.0) * 0.5);
            n4 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f2);
            n3 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f2);
            n2 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f2);
            int n7 = 63;
            int n8 = 0;
            ait.e(new Color(n4, n3, n2, n7));
            GL11.glVertex3d((double)(d5 + d8 * Math.cos(d3)), (double)d12, (double)(d7 + d8 * Math.sin(d3)));
            ait.e(new Color(n4, n3, n2, n8));
            GL11.glVertex3d((double)(d5 + d8 * Math.cos(d3)), (double)d13, (double)(d7 + d8 * Math.sin(d3)));
        }
        GL11.glEnd();
        GL11.glLineWidth((float)0.5f);
        GL11.glBegin((int)2);
        for (n5 = 0; n5 < n6; ++n5) {
            d3 = (double)n5 * (Math.PI * 2 / (double)n6);
            d2 = (double)n5 / (double)n6 * Math.PI * 2.0;
            f2 = (float)((Math.sin((double)l2 * d14 + d2) + 1.0) * 0.5);
            n4 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f2);
            n3 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f2);
            n2 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f2);
            ait.e(new Color(n4, n3, n2, 255));
            GL11.glVertex3d((double)(d5 + d8 * Math.cos(d3)), (double)d12, (double)(d7 + d8 * Math.sin(d3)));
        }
        GL11.glEnd();
        GL11.glLineWidth((float)1.0f);
        GL11.glShadeModel((int)7424);
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GlStateManager.JH();
        GL11.glDisable((int)2848);
        if (!bl2) {
            GL11.glDisable((int)2881);
        }
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
    }
}

