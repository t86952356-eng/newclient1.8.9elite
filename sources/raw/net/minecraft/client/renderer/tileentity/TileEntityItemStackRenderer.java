/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.renderer.tileentity;

import com.mojang.authlib.GameProfile;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.aj;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.w;
import net.minecraft.util.ao;

public class TileEntityItemStackRenderer {
    public static TileEntityItemStackRenderer caN = new TileEntityItemStackRenderer();
    private final m caO = new m(0);
    private final m caP = new m(1);
    private final w caQ = new w();
    private final h caR = new h();
    private final aj caS = new aj();

    public void S(co co2) {
        if (co2.bP() == Items.cSI) {
            this.caR.aQ(co2);
            TileEntityRendererDispatcher.caV.a(this.caR, 0.0, 0.0, 0.0, 0.0f);
        } else if (co2.bP() == Items.cSb) {
            GameProfile gameProfile = null;
            if (co2.aej()) {
                n n2 = co2.aek();
                if (n2.C("SkullOwner", 10)) {
                    gameProfile = aa.x(n2.eN("SkullOwner"));
                } else if (n2.C("SkullOwner", 8) && n2.eK("SkullOwner").length() > 0) {
                    gameProfile = new GameProfile(null, n2.eK("SkullOwner"));
                    gameProfile = aj.t(gameProfile);
                    n2.eP("SkullOwner");
                    n2.b("SkullOwner", aa.a(new n(), gameProfile));
                }
            }
            if (TileEntitySkullRenderer.cbo != null) {
                GlStateManager.JV();
                GlStateManager.j(-0.5f, 0.0f, -0.5f);
                GlStateManager.i(2.0f, 2.0f, 2.0f);
                GlStateManager.JI();
                TileEntitySkullRenderer.cbo.a(0.0f, 0.0f, 0.0f, ao.dwr, 0.0f, co2.yc(), gameProfile, -1);
                GlStateManager.JH();
                GlStateManager.JW();
            }
        } else {
            Block block = Block.f(co2.bP());
            if (block == Blocks.cNS) {
                TileEntityRendererDispatcher.caV.a(this.caQ, 0.0, 0.0, 0.0, 0.0f);
            } else if (block == Blocks.cOi) {
                TileEntityRendererDispatcher.caV.a(this.caP, 0.0, 0.0, 0.0, 0.0f);
            } else {
                TileEntityRendererDispatcher.caV.a(this.caO, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
}

