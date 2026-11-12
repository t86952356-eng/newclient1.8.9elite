/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.renderer.entity.layers;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.d;
import net.minecraft.client.model.ag;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.aj;
import net.minecraft.util.ao;
import net.minecraft.util.ct;

public class LayerCustomHead
implements LayerRenderer<r> {
    private final ag bXz;

    public LayerCustomHead(ag ag2) {
        this.bXz = ag2;
    }

    @Override
    public void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        co co2 = r2.eH(3);
        if (co2 != null && co2.bP() != null) {
            float f9;
            boolean bl2;
            net.minecraft.item.d d2 = co2.bP();
            d d3 = d.AZ();
            GlStateManager.JV();
            if (r2.isSneaking()) {
                GlStateManager.j(0.0f, 0.2f, 0.0f);
            }
            boolean bl3 = bl2 = r2 instanceof z || r2 instanceof au && ((au)r2).ZO();
            if (!bl2 && r2.Uz()) {
                f9 = 2.0f;
                float f10 = 1.4f;
                GlStateManager.i(0.7f, 0.7f, 0.7f);
                GlStateManager.j(0.0f, 16.0f * f8, 0.0f);
            }
            this.bXz.ac(0.0625f);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            if (d2 instanceof af) {
                f9 = 0.625f;
                GlStateManager.j(0.0f, -0.25f, 0.0f);
                GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.i(0.625f, -0.625f, -0.625f);
                if (bl2) {
                    GlStateManager.j(0.0f, 0.1875f, 0.0f);
                }
                d3.BH().a(r2, co2, ItemCameraTransforms$TransformType.bRo);
            } else if (d2 == Items.cSb) {
                f9 = 1.1875f;
                GlStateManager.i(1.1875f, -1.1875f, -1.1875f);
                if (bl2) {
                    GlStateManager.j(0.0f, 0.0625f, 0.0f);
                }
                GameProfile gameProfile = null;
                if (co2.aej()) {
                    String string;
                    n n2 = co2.aek();
                    if (n2.C("SkullOwner", 10)) {
                        gameProfile = aa.x(n2.eN("SkullOwner"));
                    } else if (n2.C("SkullOwner", 8) && !ct.cU(string = n2.eK("SkullOwner"))) {
                        gameProfile = aj.t(new GameProfile(null, string));
                        n2.b("SkullOwner", aa.a(new n(), gameProfile));
                    }
                }
                TileEntitySkullRenderer.cbo.a(-0.5f, 0.0f, -0.5f, ao.dwr, 180.0f, co2.yc(), gameProfile, -1);
            }
            GlStateManager.JW();
        }
    }

    @Override
    public boolean NH() {
        return true;
    }
}

