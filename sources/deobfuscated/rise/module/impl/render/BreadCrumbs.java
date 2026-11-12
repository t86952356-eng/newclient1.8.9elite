/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.render;

import hackclient.rise.wv;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.breadcrumbs.name"}, description="module.render.breadcrumbs.description", category=Category.RENDER)
public class BreadCrumbs
extends Module {
    private final List<wv> anx = new ArrayList<wv>();
    private final NumberValue any = new NumberValue("Time", this, (Number)15, (Number)1, (Number)150, (Number)0.1);
    @EventLink
    public final Listener<PreMotionEvent> anz = preMotionEvent -> {
        if (BreadCrumbs.aER.bgK.csh != BreadCrumbs.aER.bgK.gW || BreadCrumbs.aER.bgK.csi != BreadCrumbs.aER.bgK.gX || BreadCrumbs.aER.bgK.csj != BreadCrumbs.aER.bgK.gY) {
            this.anx.add(new wv(new da(BreadCrumbs.aER.bgK.gW, BreadCrumbs.aER.bgK.gX, BreadCrumbs.aER.bgK.gY), System.currentTimeMillis()));
        }
        long l2 = System.currentTimeMillis();
        this.anx.removeIf(wv2 -> l2 - wv2.sk > (long)((Number)this.any.wD()).intValue() * 100L);
    };
    @EventLink
    public final Listener<Render3DEvent> anA = render3DEvent -> this.m(this.anx);

    @Override
    public void onEnable() {
        this.anx.clear();
    }

    public void m(List<wv> list) {
        GlStateManager.JV();
        GlStateManager.JD();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.P(770, 771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        long l2 = System.currentTimeMillis();
        GL11.glBegin((int)3);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            wv wv2 = list.get(i2);
            da da2 = wv2.anB;
            double d2 = da2.dAG - RenderManager.bVA;
            double d3 = da2.dAH - RenderManager.bVB;
            double d4 = da2.dAI - RenderManager.bVC;
            float f2 = 1.0f - (float)(l2 - wv2.sk) / (float)(((Number)this.any.wD()).intValue() * 100);
            f2 = Math.max(0.0f, Math.min(1.0f, f2));
            Color color = this.rP().rT();
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)f2);
            GL11.glVertex3d((double)d2, (double)d3, (double)d4);
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GlStateManager.JN();
        GlStateManager.tR();
        GlStateManager.JE();
        GlStateManager.JW();
    }
}

