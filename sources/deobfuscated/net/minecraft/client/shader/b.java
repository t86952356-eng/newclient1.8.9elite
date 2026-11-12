/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.shader;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.a;
import net.minecraft.client.shader.h;
import org.lwjgl.util.vector.Matrix4f;

public class b {
    private final h cmk;
    public final a cml;
    public final a cmm;
    private final List<Object> cmn = Lists.newArrayList();
    private final List<String> cmo = Lists.newArrayList();
    private final List<Integer> cmp = Lists.newArrayList();
    private final List<Integer> cmq = Lists.newArrayList();
    private Matrix4f cmr;
    private final Tessellator cms = Tessellator.Li();
    private final WorldRenderer cmt = this.cms.Lj();

    public b(IResourceManager iResourceManager, String string, a a2, a a3) {
        this.cmk = new h(iResourceManager, string);
        this.cml = a2;
        this.cmm = a3;
    }

    public void Rq() {
        this.cmk.Rq();
    }

    public void a(String string, Object object, int n2, int n3) {
        this.cmo.add(this.cmo.size(), string);
        this.cmn.add(this.cmn.size(), object);
        this.cmp.add(this.cmp.size(), n2);
        this.cmq.add(this.cmq.size(), n3);
    }

    private void Rr() {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.tR();
        GlStateManager.JD();
        GlStateManager.Jy();
        GlStateManager.JG();
        GlStateManager.JA();
        GlStateManager.JC();
        GlStateManager.JN();
        GlStateManager.ap(0);
    }

    public void a(Matrix4f matrix4f) {
        this.cmr = matrix4f;
    }

    public void aM(float f2) {
        this.Rr();
        this.cml.Ro();
        float f3 = this.cmm.cma;
        float f4 = this.cmm.cmb;
        GlStateManager.i(0, 0, (int)f3, (int)f4);
        this.cmk.a("DiffuseSampler", this.cml);
        for (int i2 = 0; i2 < this.cmn.size(); ++i2) {
            this.cmk.a(this.cmo.get(i2), this.cmn.get(i2));
            this.cmk.dF("AuxSize" + i2).n(this.cmp.get(i2).intValue(), this.cmq.get(i2).intValue());
        }
        this.cmk.dF("ProjMat").b(this.cmr);
        this.cmk.dF("InSize").n(this.cml.cma, this.cml.cmb);
        this.cmk.dF("OutSize").n(f3, f4);
        this.cmk.dF("Time").aN(f2);
        Minecraft minecraft = Minecraft.getMinecraft();
        this.cmk.dF("ScreenSize").n(minecraft.bgz, minecraft.bgA);
        this.cmk.RG();
        this.cmm.Rp();
        this.cmm.az(false);
        GlStateManager.an(false);
        GlStateManager.a(true, true, true, true);
        this.cmt.a(7, DefaultVertexFormats.cbF);
        this.cmt.F(0.0, f4, 500.0).s(255, 255, 255, 255).Lx();
        this.cmt.F(f3, f4, 500.0).s(255, 255, 255, 255).Lx();
        this.cmt.F(f3, 0.0, 500.0).s(255, 255, 255, 255).Lx();
        this.cmt.F(0.0, 0.0, 500.0).s(255, 255, 255, 255).Lx();
        this.cms.pZ();
        GlStateManager.an(true);
        GlStateManager.a(true, true, true, true);
        this.cmk.RF();
        this.cmm.Ro();
        this.cml.Rn();
        for (Object object : this.cmn) {
            if (!(object instanceof a)) continue;
            ((a)object).Rn();
        }
    }

    public h Rs() {
        return this.cmk;
    }
}

