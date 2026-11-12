/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.tileentity;

import hackclient.rise.agg;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.d;
import net.minecraft.client.gui.cr;
import net.minecraft.client.model.aj;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.src.a;
import net.minecraft.tileentity.ag;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.optifine.s;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public class TileEntitySignRenderer
extends TileEntitySpecialRenderer<ag> {
    private static final cm cbh = new cm("textures/entity/sign.png");
    private final aj cbi = new aj();
    private static double cbj = 4096.0;

    @Override
    public void a(ag ag2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        Block block = ag2.ahl();
        GlStateManager.JV();
        float f4 = 0.6666667f;
        if (block == Blocks.cMp) {
            GlStateManager.j((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            float f5 = (float)(ag2.zg() * 360) / 16.0f;
            GlStateManager.d(-f5, 0.0f, 1.0f, 0.0f);
            this.cbi.bCf.bBL = true;
        } else {
            int n3 = ag2.zg();
            f3 = 0.0f;
            if (n3 == 2) {
                f3 = 180.0f;
            }
            if (n3 == 4) {
                f3 = 90.0f;
            }
            if (n3 == 5) {
                f3 = -90.0f;
            }
            GlStateManager.j((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            GlStateManager.d(-f3, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.0f, -0.3125f, -0.4375f);
            this.cbi.bCf.bBL = false;
        }
        if (n2 >= 0) {
            this.a(cbs[n2]);
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(4.0f, 2.0f, 1.0f);
            GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.cR(5888);
        } else {
            this.a(cbh);
        }
        GlStateManager.JS();
        GlStateManager.JV();
        GlStateManager.i(0.6666667f, -0.6666667f, -0.6666667f);
        this.cbi.Hh();
        GlStateManager.JW();
        if (TileEntitySignRenderer.b(ag2)) {
            agg agg2 = this.EA();
            f3 = 0.010416667f;
            GlStateManager.j(0.0f, 0.33333334f, 0.046666667f);
            GlStateManager.i(0.010416667f, -0.010416667f, 0.010416667f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-0.010416667f);
            GlStateManager.an(false);
            int n4 = 0;
            if (a.aow()) {
                n4 = s.jd(n4);
            }
            if (n2 < 0) {
                for (int i2 = 0; i2 < ag2.dtx.length; ++i2) {
                    Object object;
                    if (ag2.dtx[i2] == null) continue;
                    ba ba2 = ag2.dtx[i2];
                    List<ba> list = cr.a(ba2, 90, agg2, false, true);
                    Object object2 = object = list != null && list.size() > 0 ? list.get(0).getFormattedText() : "";
                    if (i2 == ag2.dty) {
                        object = "> " + (String)object + " <";
                        agg2.a((String)object, (double)(-agg2.bQ((String)object) / 2), (double)(i2 * 10 - ag2.dtx.length * 5), n4);
                        continue;
                    }
                    agg2.a((String)object, (double)(-agg2.bQ((String)object) / 2), (double)(i2 * 10 - ag2.dtx.length * 5), n4);
                }
            }
        }
        GlStateManager.an(true);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JW();
        if (n2 >= 0) {
            GlStateManager.cR(5890);
            GlStateManager.JW();
            GlStateManager.cR(5888);
        }
    }

    @Override
    public void b(ag ag2, double d2, double d3, double d4, float f2, int n2) {
    }

    private static boolean b(ag ag2) {
        if (ah.eye) {
            return false;
        }
        if (!a.doh && ag2.dty < 0) {
            c c2 = a.AZ().BC();
            double d2 = ag2.M(c2.gW, c2.gX, c2.gY);
            return !(d2 > cbj);
        }
        return true;
    }

    public static void OG() {
        d d2 = a.AZ();
        double d3 = a.F(d2.aIY.chV, 1.0f, 120.0f);
        double d4 = Math.max(1.5 * (double)d2.bgA / d3, 16.0);
        cbj = d4 * d4;
    }

    @Override
    public /* synthetic */ void a(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((ag)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((ag)d2, d3, d4, d5, f2, n2);
    }
}

