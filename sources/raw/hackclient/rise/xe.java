/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fm;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.item.ac;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.src.a;
import net.optifine.ae;
import net.optifine.shaders.ah;
import net.optifine.shaders.aj;

@gl(aliases={"module.render.glint.name"}, description="module.render.glint.description", category=gj.RENDER)
public final class xe
extends gi {
    private final aki aop = new aki("Glint Weapons", (gi)this, (Boolean)true);
    private final akj aoq = new akj("Hue", this, (Number)0, (Number)360, (Number)0, (Number)360, (Number)1);
    private final akq aor = new akq("Layers", this, (Number)4, (Number)1, (Number)8, (Number)1);
    @dm
    public final dk<fm> aos = fm2 -> {
        co co2 = fm2.bO();
        d d2 = co2.bP();
        if (((Boolean)this.aop.wD()).booleanValue() && (d2 instanceof cp || d2 instanceof ac)) {
            fm2.l(true);
        }
        fm2.cF();
        if (fm2.dt() && fm2.du()) {
            this.b(fm2.dv());
        }
    };
    @dm
    public final dk<ft> aot = ft2 -> {};

    public void b(IBakedModel iBakedModel) {
        if (RendererLivingEntity.bXc) {
            return;
        }
        if (!(a.aoT() && !ae.aAP() || a.aoG() && ah.eye)) {
            GlStateManager.an(false);
            GlStateManager.cJ(514);
            GlStateManager.JA();
            GlStateManager.P(768, 1);
            xe.aER.BG().bVk.a(RenderItem.bVh);
            if (a.aoG() && !xe.aER.BG().bVl) {
                aj.aHi();
            }
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(8.0f, 8.0f, 8.0f);
            float f2 = (float)(net.minecraft.client.d.Bj() % 3000L) / 3000.0f / 8.0f;
            GlStateManager.j(f2, 0.0f, 0.0f);
            for (int i2 = 1; i2 <= ((Number)this.aor.wD()).intValue(); ++i2) {
                GlStateManager.d(-50.0f, 0.0f, 0.0f, 1.0f);
                aER.BG().a(iBakedModel, new Color(Color.HSBtoRGB(((float)((Number)this.aoq.wD()).intValue() + (float)Math.abs(this.aoq.wP().intValue() - ((Number)this.aoq.wD()).intValue()) * ((float)i2 / ((Number)this.aor.wD()).floatValue())) / 255.0f, 1.0f, 1.0f)).hashCode());
            }
            GlStateManager.JW();
            GlStateManager.cR(5888);
            GlStateManager.P(770, 771);
            GlStateManager.Jz();
            GlStateManager.cJ(515);
            GlStateManager.an(true);
            xe.aER.BG().bVk.a(TextureMap.bZE);
            if (a.aoG() && !xe.aER.BG().bVl) {
                aj.aHj();
            }
        }
    }
}

