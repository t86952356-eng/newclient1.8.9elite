/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.akj;
import hackclient.rise.fm;
import java.awt.Color;
import net.minecraft.client.Minecraft;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.glint.name"}, description="module.render.glint.description", category=Category.RENDER)
public final class Glint
extends Module {
    private final BooleanValue aop = new BooleanValue("Glint Weapons", (Module)this, (Boolean)true);
    private final akj aoq = new akj("Hue", this, (Number)0, (Number)360, (Number)0, (Number)360, (Number)1);
    private final NumberValue aor = new NumberValue("Layers", this, (Number)4, (Number)1, (Number)8, (Number)1);
    @EventLink
    public final Listener<fm> aos = fm2 -> {
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
    @EventLink
    public final Listener<Render3DEvent> aot = render3DEvent -> {};

    public void b(IBakedModel iBakedModel) {
        if (RendererLivingEntity.bXc) {
            return;
        }
        if (!(a.aoT() && !ae.aAP() || a.aoG() && ah.eye)) {
            GlStateManager.an(false);
            GlStateManager.cJ(514);
            GlStateManager.JA();
            GlStateManager.P(768, 1);
            Glint.aER.BG().bVk.a(RenderItem.bVh);
            if (a.aoG() && !Glint.aER.BG().bVl) {
                aj.aHi();
            }
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(8.0f, 8.0f, 8.0f);
            float f2 = (float)(Minecraft.Bj() % 3000L) / 3000.0f / 8.0f;
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
            Glint.aER.BG().bVk.a(TextureMap.bZE);
            if (a.aoG() && !Glint.aER.BG().bVl) {
                aj.aHj();
            }
        }
    }
}

