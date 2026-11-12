/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.render;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ahj;
import hackclient.rise.xo;
import java.awt.Color;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;

@ModuleInfo(aliases={"Jump Circles"}, description="Draws circles around the player when they jump", category=Category.RENDER)
public final class JumpCircles
extends Module {
    private final Queue<xo> aph = new ConcurrentLinkedQueue<xo>();
    private final afj apj = new afj(afk.aHc, 300L);
    private boolean apk = false;
    private static final float apl = 0.004f;
    private static final int apm = 2;
    private static final float apn = 2.0f;
    private static final float apo = 4.0f;
    @EventLink
    private final Listener<PostMotionEvent> app = postMotionEvent -> {
        if (JumpCircles.aER.bgK.aO && this.apk) {
            double d2 = ahj.m(JumpCircles.aER.bgK.crF, JumpCircles.aER.bgK.gW, JumpCircles.aER.bgC.bWY);
            double d3 = ahj.m(JumpCircles.aER.bgK.crG, JumpCircles.aER.bgK.gX, JumpCircles.aER.bgC.bWY);
            double d4 = ahj.m(JumpCircles.aER.bgK.crH, JumpCircles.aER.bgK.gY, JumpCircles.aER.bgC.bWY);
            this.aph.add(new xo(new da(d2, d3, d4), 0.0, 255.0f));
            this.apk = false;
        } else if (!JumpCircles.aER.bgK.aO) {
            this.apk = true;
        }
        for (xo xo2 : this.aph) {
            if (xo2.apt > 0.0f) {
                return;
            }
            this.aph.clear();
        }
    };
    @EventLink
    private final Listener<Render3DEvent> apq = this::i;

    @Override
    public void onDisable() {
        if (this.aph.isEmpty()) {
            return;
        }
        this.aph.clear();
    }

    private void i(Render3DEvent render3DEvent) {
        for (xo xo2 : this.aph) {
            da da2 = xo2.mr();
            double d2 = da2.dAH;
            aER.BF();
            double d3 = d2 - RenderManager.bVB;
            xo2.y(0.004f);
            if (xo2.ms() <= 2.0) {
                this.mp();
                this.apj.Q(xo2.apt -= (float)(xo2.ms() / 4.0));
                if (xo2.mt() > 0.0f) {
                    xo2.p(xo2.apt -= (float)(xo2.ms() / 4.0));
                }
                this.a(xo2, da2, d3);
                this.mq();
                continue;
            }
            this.aph.remove();
        }
    }

    private void mp() {
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)3008);
        GL11.glEnable((int)2848);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
    }

    private void a(xo xo2, da da2, double d2) {
        GL11.glLineWidth((float)2.0f);
        GL11.glBegin((int)2);
        for (int i2 = 0; i2 <= 360; ++i2) {
            Color color = this.e(Interface.class).rP().j(new Vector2d(i2, i2));
            double[] dArray = this.c(da2.dAG, da2.dAI, i2, xo2.aps);
            double d3 = dArray[0];
            aER.BF();
            double d4 = d3 - RenderManager.bVA;
            double d5 = dArray[1];
            aER.BF();
            double d6 = d5 - RenderManager.bVC;
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)(xo2.mt() / 255.0f));
            GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        }
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void mq() {
        GlStateManager.tR();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
    }

    public double[] c(double d2, double d3, double d4, double d5) {
        d4 = bt.aJ(d4);
        double d6 = d4 * Math.PI / 180.0;
        double d7 = d2 - Math.sin(d6) * d5;
        double d8 = d3 + Math.cos(d6) * d5;
        return new double[]{d7, d8};
    }
}

