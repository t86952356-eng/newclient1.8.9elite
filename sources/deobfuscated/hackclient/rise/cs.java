/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahi;
import hackclient.rise.ais;
import hackclient.rise.bv;
import hackclient.rise.cm;
import hackclient.rise.cn;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.src.a;
import org.lwjgl.opengl.GL11;
import rise.Client;
import rise.module.impl.render.ESP;
import rise.util.InstanceAccess;

public class cs
extends cm
implements InstanceAccess {
    private final Map<net.minecraft.entity.player.a, float[][]> hW = new HashMap<net.minecraft.entity.player.a, float[][]>();
    private static final float hX = 57.295776f;

    public cs(cn cn2) {
        super(cn2);
    }

    @Override
    public void cp() {
        GL11.glPushMatrix();
        this.cv();
        for (c c2 : bv.bR()) {
            if (!(c2 instanceof net.minecraft.entity.player.a)) continue;
            this.a((net.minecraft.entity.player.a)c2, a.bWY);
        }
        this.cw();
        GL11.glPopMatrix();
    }

    private void cv() {
        GL11.glLineWidth((float)((Number)Client.a.g().c(ESP.class).anV.wD()).floatValue());
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        ais.d((Boolean)Client.a.g().c(ESP.class).anU.wD() != false ? Color.WHITE : this.hP.cr());
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glDepthMask((boolean)false);
    }

    private void cw() {
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)2929);
    }

    @Override
    public void a(net.minecraft.entity.player.a a2, f f2) {
        this.hW.put(a2, new float[][]{{f2.byA.bBF, f2.byA.bBG, f2.byA.bBH}, {f2.byD.bBF, f2.byD.bBG, f2.byD.bBH}, {f2.byE.bBF, f2.byE.bBG, f2.byE.bBH}, {f2.byF.bBF, f2.byF.bBG, f2.byF.bBH}, {f2.byG.bBF, f2.byG.bBG, f2.byG.bBH}});
    }

    private void a(net.minecraft.entity.player.a a2, float f2) {
        float[][] fArray = this.hW.get(a2);
        if (fArray != null) {
            GL11.glPushMatrix();
            float f3 = (float)(ahi.l(a2.gW, a2.crF, f2) - RenderManager.bVA);
            float f4 = (float)(ahi.l(a2.gX, a2.crG, f2) - RenderManager.bVB);
            float f5 = (float)(ahi.l(a2.gY, a2.crH, f2) - RenderManager.bVC);
            GL11.glTranslated((double)f3, (double)f4, (double)f5);
            boolean bl2 = a2.isSneaking();
            float f6 = a2.pn;
            float f7 = a2.cuF;
            float f8 = a2.cuG;
            float f9 = ahi.d(f7, f8, f2);
            float f10 = bl2 ? 0.6f : 0.75f;
            GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(bl2 ? -0.235f : 0.0f));
            this.a(fArray, f10, bl2, f9, f6);
            GL11.glPopMatrix();
        }
    }

    private void a(float[][] fArray, float f2, boolean bl2, float f3, float f4) {
        int n2;
        for (n2 = 1; n2 <= 2; ++n2) {
            this.a(fArray[n2 + 2], n2 == 1 ? -0.125f : 0.125f, f2);
        }
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(bl2 ? 0.25f : 0.0f));
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(bl2 ? -0.05f : 0.0f), (float)(bl2 ? -0.01725f : 0.0f));
        for (n2 = 1; n2 <= 2; ++n2) {
            this.b(fArray[n2], n2 == 1 ? -0.375f : 0.375f, f2 + 0.55f);
        }
        GL11.glRotatef((float)(f3 - f4), (float)0.0f, (float)1.0f, (float)0.0f);
        this.a(fArray[0], f2);
        GL11.glPopMatrix();
        this.b(f2);
    }

    private void a(float[] fArray, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)f2, (float)f3, (float)0.0f);
        this.a(fArray);
        GL11.glBegin((int)3);
        GL11.glVertex3i((int)0, (int)0, (int)0);
        GL11.glVertex3f((float)0.0f, (float)(-f3), (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void b(float[] fArray, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)f2, (float)f3, (float)0.0f);
        this.a(fArray);
        GL11.glBegin((int)3);
        GL11.glVertex3i((int)0, (int)0, (int)0);
        GL11.glVertex3f((float)0.0f, (float)-0.5f, (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void a(float[] fArray, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(f2 + 0.55f), (float)0.0f);
        this.a(fArray);
        GL11.glBegin((int)3);
        GL11.glVertex3i((int)0, (int)0, (int)0);
        GL11.glVertex3f((float)0.0f, (float)0.3f, (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void a(float[] fArray) {
        if (fArray[0] != 0.0f) {
            GL11.glRotatef((float)(fArray[0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        if (fArray[1] != 0.0f) {
            GL11.glRotatef((float)(fArray[1] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (fArray[2] != 0.0f) {
            GL11.glRotatef((float)(fArray[2] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
        }
    }

    private void b(float f2) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)0.0, (double)f2, (double)0.0);
        GL11.glBegin((int)3);
        GL11.glVertex3f((float)-0.125f, (float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)0.125f, (float)0.0f, (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)f2, (float)0.0f);
        GL11.glBegin((int)3);
        GL11.glVertex3i((int)0, (int)0, (int)0);
        GL11.glVertex3f((float)0.0f, (float)0.55f, (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(f2 + 0.55f), (float)0.0f);
        GL11.glBegin((int)3);
        GL11.glVertex3f((float)-0.375f, (float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)0.375f, (float)0.0f, (float)0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
}

